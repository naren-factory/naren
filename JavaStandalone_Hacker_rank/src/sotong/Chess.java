package sotong;

import java.util.Scanner;

/**
 * 
There is a mobile piece and a stationary piece on the N×M chessboard.
The available moves of the mobile piece are the same as set out in the image below.
<<Refer to chess.png file in this directory>>
You need to capture the stationary piece by moving the mobile piece with the minimum amount of moves.

Write a program to find out the minimum number moves to catch a piece. 

Time limit:1 second (java: 2 seconds)

[Input]
Several test cases can be included in the inputs. T, the number of cases is given in the first row of the inputs.
After that, the test cases as many as T (T = 20) are given in a row. 
N, the numbers of the rows and M, the number of columns of the chessboard are given in the first row of each test case. 
R & C is the location information of the attacking piece and S & K is the location of the defending pieces and are
given in the row at the second line.
However, the location of the uppermost end of the left end is (1, 1)

[Output]
Output the minimum number of movements to catch a defending piece at the first line of each test case. If not moveable, output equals -1. 

[I/O Example]

Input 
2
9 9
3 5 2 8
20 20
2 3 7 9

Output
2

5

Sample input
5
10 10
1 1 10 10
20 20
2 3 7 9
30 30
2 15 29 29
40 40
2 3 1 40
45 45
40 10 27 40

 * @author nsbisht
 *
 */
public class Chess {

	static int startR;
	static int startC;
	static int endR;
	static int endC;
	static int N;
	static int M;
	static boolean started;
	static boolean[][] visited;
	static int[] xVal = new int[]{-2, -1, 1, 2, 2, 1, -1, -2};
	static int[] yVal = new int[]{1, 2, 2, 1, -1, -2, -2, -1};
	static Cell[] queue;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int testCase = 1;
		while(testCase <= T) {
			N = sc.nextInt();
			M = sc.nextInt();
			int[][] arr = new int[N + 1][M + 1];
			visited = new boolean[N + 1][M + 1];
			startR = sc.nextInt();
			startC = sc.nextInt();
			endR = sc.nextInt();
			endC = sc.nextInt();
			int res = minimumSteps(startR, startC, 0, false);
			started = false;
			if(res == Integer.MAX_VALUE) {
				res = -1;
			}
			System.out.println(res);
			testCase++;
		}
	}

	static int minimumSteps(int curR, int curC, int steps, boolean isGoingFar) {
		//System.out.println(curR + " " + curC);
		if(curR < 1 || curC < 1 || curR > N || curC > M) {
			return Integer.MAX_VALUE;
		}
		if(visited[curR][curC]) {
			return Integer.MAX_VALUE;
		}
		if(started) {
			if(curR == startR && curC == startC) {
				return Integer.MAX_VALUE;
			}
		}
		started = true;

		if(curR == endR && curC == endC) {
			return steps;
		}
		visited[curR][curC] = true;
		if(Math.abs(curR - endR) > 2 || Math.abs(curC - endC) > 2 && !isGoingFar) {
			if(isGoingFar) {
				if(Math.abs(curC - endC) > 1) {
					return Integer.MAX_VALUE;	
				}

			}
			// Do in a certain direction
			if(curR == endR && curC < endC) {
				// Go right
				int a = minimumSteps(curR - 1 , curC + 2, steps + 1, isGoingFar);
				int b = minimumSteps(curR + 1 , curC + 2, steps + 1, isGoingFar);
				int c = minimumSteps(curR + 2 , curC + 1, steps + 1, isGoingFar);
				int d = minimumSteps(curR - 2 , curC + 1, steps + 1, isGoingFar);

				int e = Math.min(a, b);
				int f = Math.min(c, d);
				return Math.min(e, f);

			} else if(curR > endR && curC < endC) {
				// Go right top
				int a = minimumSteps(curR - 2 , curC + 1, steps + 1, isGoingFar);
				int b = minimumSteps(curR - 1 , curC + 2, steps + 1, isGoingFar);
				return Math.min(a, b);
			} else if(curR < endR && curC < endC) {
				// Go right down
				int a = minimumSteps(curR + 1 , curC + 2, steps + 1, isGoingFar);
				int b = minimumSteps(curR + 2 , curC + 1, steps + 1, isGoingFar);
				return Math.min(a, b);
			} else if(curC == endC && curR > endR) {
				// Go right and left up
				int a = minimumSteps(curR - 1 , curC + 2, steps + 1, isGoingFar);
				int b = minimumSteps(curR - 2 , curC + 1, steps + 1, isGoingFar);
				int c = minimumSteps(curR - 2 , curC - 1, steps + 1, isGoingFar);
				int d = minimumSteps(curR - 1 , curC - 2, steps + 1, isGoingFar);
				int e = Math.min(a, b);
				int f = Math.min(c, d);
				return Math.min(e, f);
			} else if(curC > endC && curR > endR) {
				// Go left up
				int a = minimumSteps(curR - 2 , curC - 1, steps + 1, isGoingFar);
				int b = minimumSteps(curR - 1 , curC - 2, steps + 1, isGoingFar);
				return Math.min(a, b);
			} else if(curR == endR && curC > endC) {
				// Go left
				int a = minimumSteps(curR - 2 , curC - 1, steps + 1, isGoingFar);
				int b = minimumSteps(curR - 1 , curC - 2, steps + 1, isGoingFar);
				int c = minimumSteps(curR + 1 , curC - 2, steps + 1, isGoingFar);
				int d = minimumSteps(curR + 2 , curC - 1, steps + 1, isGoingFar);
				int e = Math.min(a, b);
				int f = Math.min(c, d);
				return Math.min(e, f);
			} else if(curR < endR && curC > endC) {
				// Go left down
				int a = minimumSteps(curR + 1 , curC - 2, steps + 1, isGoingFar);
				int b = minimumSteps(curR + 2 , curC - 1, steps + 1, isGoingFar);
				return Math.min(a, b);
			} else if(curC == endC && curR < endR) {
				// Go down
				int a = minimumSteps(curR + 1 , curC - 2, steps + 1, isGoingFar);
				int b = minimumSteps(curR + 2 , curC - 1, steps + 1, isGoingFar);
				int c = minimumSteps(curR + 1 , curC + 2, steps + 1, isGoingFar);
				int d = minimumSteps(curR + 2 , curC + 1, steps + 1, isGoingFar);
				int e = Math.min(a, b);
				int f = Math.min(c, d);
				return Math.min(e, f);
			}

		} else if((Math.abs(curR - endR) <= 1 || Math.abs(curC - endC) <= 1)) {
			// Right
			if(startR == endR && startC + 1 == endC) {
				if(startR - 2 > 1 && startC + 3 <= M) {
					return 3;
				}
				if(startR + 2 <= N && startC + 3 <= M) {
					return 3;
				}
				return -1;
			}

			// Right upper
			if(startR - 1 == endR && startC + 1 == endC) {
				if(startR - 2 > 0 && startC - 1 > 0) {
					return 2;
				}
				if(startR + 1 <= N && startC + 2 <= M) {
					return 2;
				}
				return -1;
			}

			// Right down
			if(startR + 1 == endR && startC + 1 == endC) {
				if(startR + 2 <= N && startC - 1 > 0) {
					return 2;
				}
				if(startR - 1 > 0 && startC + 2 <= M) {
					return 2;
				}
				return -1;
			}

			// Down
			if(startR + 1 == endR && startC == endC) {
				if(startR + 3 <= N && startC + 2 <= M) {
					return 3;
				}
				if(startR + 3 <= N && startC - 2 > 0) {
					return 3;
				}
				return -1;
			}

			//UP
			if(startR - 1 == endR && endC == startC) {
				if(startR - 3 > 0 && startC + 2 <= M) {
					return 3;
				}
				if(startR - 3 > 0 && startC - 2 > 0) {
					return 3;
				}
				return -1;
			}

			// Left up
			if(startR - 1 == endR && startC - 1 == endC) {
				if(startR + 1 <= N && startC - 2 > 0) {
					return 2;
				}
				if(startR - 2 > 0 && startC + 1 <= M) {
					return 2;
				}
				return -1;
			}

			//Left Down
			if(startR + 1 == endR && startC - 1 == endC) {
				if(startR + 1 <= N && startC + 1 <= M) {
					return 2;
				}
				if(startR - 1 > 0 && startC - 2 > 0) {
					return 2;
				}
				return -1;
			}

			// Left
			if(startR == endR && startC - 1 == endC) {
				if(startR - 2 > 0 && startC - 3 > 0) {
					return 3;
				}
				if(startR + 2 <= N && startC - 3 > 0) {
					return 3;
				}
				return -1;
			}

		} else {
			int a = minimumSteps(curR - 1 , curC + 2, steps + 1, true);
			int b = minimumSteps(curR + 1 , curC + 2, steps + 1, true);
			int c = minimumSteps(curR + 2 , curC + 1, steps + 1, true);
			int d = minimumSteps(curR - 2 , curC + 1, steps + 1, true);

			int e = minimumSteps(curR - 2 , curC - 1, steps + 1, true);
			int f = minimumSteps(curR - 1 , curC - 2, steps + 1, true);
			int g = minimumSteps(curR + 1 , curC - 2, steps + 1, true);
			int h = minimumSteps(curR + 2 , curC - 1, steps + 1, true);

			int i = Math.min(a, b);
			int j = Math.min(c, d);
			int k = Math.min(e, f);
			int l = Math.min(g, h);
			int m = Math.min(i, j);
			int n = Math.min(k, l);
			return Math.min(m, n);
		}
		return Integer.MAX_VALUE;
	}

	/*static boolean bfsChess(int curX, int curY, int steps) {
		if(curX == endR && curY == endC) {
			return true;
		}
		for(int i = 0; i < 8; i++) {
			int nextX = curX + xVal[i];
			int nextY = curY + yVal[i];
		}
	}*/

	static class Cell {
		int xVal;
		int yVal;
		public Cell(int x, int y) {
			xVal = x;
			yVal = y;
		}
	}
	static class Queue {
		private static int head = 0;
		private static int tail = 0;

		public static boolean isEmpty() {
			return head == 0 && tail == 0;
		}
		public static void push(Cell cell) {
			if(isEmpty()) {
				tail++;
			}
			head++;
			queue[head] = cell;
		}
		public static Cell pop() {
			Cell cell = null;
			if(!isEmpty()) {
				cell = queue[tail];
				if(tail == head) {
					tail = 0;
					head = 0;
				} else {
					tail++;					
				}
			}
			return cell;
		}
		public static Cell peek() {
			return queue[tail];
		}
	} 
}