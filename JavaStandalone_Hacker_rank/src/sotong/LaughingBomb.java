package sotong;

import java.util.Scanner;

/**
 * 
You are busy to promote a newly released film in a movie theater. The title is Biochemical Laughing Bomb which is about terror.
Guerrillas drop a biochemical laughing bomb in the middle of a city. Once exposed, you have to laugh all your life. The bomb will contaminate four people around it during 1 second, and another four around each of them during another one second. However, you wont be contaminated if you are not in the adjacent four directions.  as the below shows the location of the bomb and affected people, and  shows contamination process in seconds and you can figure out that the whole city is contaminated in 8 seconds.
In order to protect the city from the epidemic, create a program that figures out when the city will be contaminated by the bomb for the last.

<<Refer to laughingBomb_1.png and laughingBomb_2.png>>



Time limit: 1 second (java: 2 seconds)

[Input]
Several test cases can be included in the inputs. T, the number of cases is given in the first row of the inputs. After that, the test cases as many as T (T = 30) are given in a row.
The row and column of the city, N and M are given by being separated with a blank on the first row of each test case. (1 = N, M = 100)
The status within city is given by being separated with a blank from the second row to N number rows. 1 means people exist and 0 means people do not exist. 
The coordinate of the row and column on which the bomb fall is given by being separated with a blank on the last row. 

[Output]
Output how long does it take to contaminate al people on the first row of each test case. 

[I/O Example] 

Input 
2
7 8
0 0 1 1 0 0 0
1 1 1 1 0 1 0
0 0 1 1 1 1 1
0 1 1 1 1 1 1
0 1 0 0 1 1 0
0 1 1 1 1 0 0
0 0 1 0 1 1 1
0 0 0 0 1 0 0
2 5
10 10
1 1 1 1 0 1 1 0 0 0
0 1 1 1 1 1 0 1 1 0
0 0 1 1 0 1 0 1 1 1
0 1 1 1 1 1 0 0 1 1
0 1 0 1 0 1 1 1 1 0
0 0 0 0 0 1 1 0 0 0
1 0 1 0 1 0 1 1 0 0
0 0 1 1 1 1 1 1 1 1
1 0 1 0 0 1 0 1 1 0
1 1 1 0 0 0 0 1 1 1
2 2

Output
8
21


===== Sample Input=====
5
10 10
1 1 1 1 0 1 1 0 0 0
0 1 1 1 1 1 0 1 1 0
0 0 1 1 0 1 0 1 1 1
0 1 1 1 1 1 0 0 1 1
0 1 0 1 0 1 1 1 1 0
0 0 0 0 0 1 1 0 0 0
1 0 1 0 1 0 1 1 0 0
0 0 1 1 1 1 1 1 1 1
1 0 1 0 0 1 0 1 1 0
1 1 1 0 0 0 0 1 1 1
2 2
15 10
0 0 0 0 0 1 0 0 1 1 0 1 0 1 0
1 0 1 0 0 1 1 0 0 1 0 1 0 1 0
1 1 1 1 1 0 1 1 0 1 0 1 0 1 1
0 0 1 0 1 1 1 1 1 1 0 1 0 0 1
0 1 1 1 1 0 0 0 1 1 1 1 0 1 1
0 1 0 0 1 1 1 1 1 1 0 1 1 1 1
0 1 0 1 1 1 0 1 0 0 0 0 0 0 1
1 1 0 1 1 1 1 1 1 1 0 1 1 1 1
0 1 0 1 0 1 0 0 0 1 1 1 0 0 1
0 0 0 1 0 1 1 0 1 1 0 0 0 0 0
2 3
30 40
1 1 1 1 0 1 1 1 0 1 0 0 0 1 0 1 1 1 0 0 0 1 1 1 1 0 1 0 1 0
0 0 1 0 0 0 1 0 1 1 0 1 0 1 1 0 1 1 0 1 0 0 0 1 0 0 1 1 1 1
1 0 1 1 1 1 1 1 0 1 1 1 0 0 1 0 1 1 0 1 0 0 1 1 1 0 1 1 1 1
0 0 1 1 1 0 1 0 0 0 1 1 1 1 1 1 1 1 1 1 0 1 1 1 1 1 1 0 0 0
0 0 1 1 1 0 1 0 0 1 1 0 0 1 1 0 0 1 0 1 1 1 0 1 0 1 1 0 0 0
0 1 0 1 1 1 1 1 1 1 0 0 1 0 1 1 1 1 0 1 1 0 0 1 0 0 1 0 0 1
1 1 1 1 1 1 0 0 0 0 1 0 0 1 1 0 1 0 0 0 1 1 0 1 1 1 1 1 1 1
0 0 1 0 1 0 0 0 1 0 0 0 0 0 0 0 0 0 0 1 1 0 0 1 0 0 0 0 1 1
1 1 1 1 1 1 0 0 0 0 0 0 1 0 1 0 1 1 0 1 0 1 1 0 1 0 1 0 1 1
0 1 1 0 0 1 1 1 0 0 1 0 1 1 1 0 0 0 1 0 0 1 0 0 1 1 0 0 0 1
1 1 0 1 1 1 0 1 0 0 1 0 1 1 0 1 1 1 1 0 1 1 1 0 1 0 0 0 0 1
1 1 1 1 1 0 0 1 1 1 1 1 1 0 1 0 1 0 1 0 0 0 1 1 1 1 0 0 1 1
0 1 0 0 0 1 1 1 0 0 0 0 1 1 1 1 1 0 0 1 0 1 1 0 0 1 1 0 0 1
0 1 1 0 0 1 1 1 0 1 0 0 1 1 0 0 1 1 0 1 1 1 0 1 1 0 1 1 1 1
1 1 0 1 0 0 1 0 1 0 1 1 0 0 0 1 0 1 1 1 0 1 0 1 0 0 0 0 1 1
1 1 0 1 1 1 0 1 0 0 0 1 1 1 1 1 1 0 0 0 0 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 0 0 0 1 1 1 1 0 0 1 1 1 0 1 1 0 1 1 0 0 1 0 0 1
0 0 0 1 1 1 0 1 1 0 0 1 1 1 0 0 0 1 0 0 1 0 1 0 0 0 0 0 0 1
0 0 0 1 0 1 1 1 0 1 1 0 1 0 0 1 0 1 0 0 1 1 1 1 1 0 1 1 1 1
0 0 1 1 1 0 0 0 0 1 0 1 0 0 0 0 0 1 1 0 0 1 1 1 0 0 0 1 0 0
1 1 1 0 0 1 0 0 0 0 0 1 0 0 1 0 0 1 1 1 1 1 1 0 0 1 1 1 1 0
0 0 1 1 1 0 1 0 1 1 0 1 0 0 0 1 0 1 0 1 1 1 0 0 0 1 0 0 1 1
1 1 1 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0 1 1 1 1 1 1 1 1 1 0
0 1 1 1 0 1 0 0 0 0 0 1 0 1 0 0 1 0 1 0 1 1 0 1 1 1 0 1 1 0
0 0 0 0 0 0 1 1 1 0 0 1 1 0 1 1 0 1 0 1 1 0 0 0 1 1 0 0 1 1
0 0 1 1 1 0 1 1 1 0 1 0 0 0 1 1 0 1 0 0 1 1 0 1 1 0 1 0 0 1
1 1 0 1 0 1 1 0 1 1 0 0 1 0 0 1 1 0 1 0 0 0 1 0 1 1 0 1 1 1
0 0 0 1 1 0 0 1 1 1 0 0 0 0 1 1 0 1 0 0 0 0 1 1 0 0 1 0 1 1
0 0 0 0 1 0 1 0 0 0 0 0 1 1 1 1 0 0 0 0 0 0 1 0 0 0 1 0 1 0
0 1 1 0 0 0 1 1 0 1 1 0 0 1 1 1 1 1 0 1 0 0 0 0 0 0 0 1 0 0
0 1 0 1 1 0 1 0 1 1 0 1 0 1 0 0 1 0 0 0 0 1 0 0 1 0 1 0 0 1
1 0 0 1 0 1 1 0 1 0 0 0 0 0 1 0 0 0 0 0 1 1 0 0 1 0 0 1 1 1
1 1 0 1 0 1 0 0 0 0 1 0 0 0 0 1 1 0 0 1 1 1 0 0 1 1 1 1 0 1
0 1 0 1 1 0 0 0 1 0 1 0 1 1 0 1 0 1 1 0 0 1 1 1 1 1 0 1 1 1
0 0 0 0 0 0 0 1 0 1 1 0 0 0 0 1 1 1 0 1 0 1 0 1 1 0 0 1 0 1
0 0 1 0 1 1 0 0 1 0 1 0 0 0 0 0 0 0 0 0 0 0 1 1 1 1 0 0 1 0
0 1 0 1 0 0 1 1 0 0 0 1 0 1 0 0 0 0 1 1 1 0 0 1 1 0 1 0 0 1
0 0 0 1 1 0 0 0 0 1 1 1 0 0 1 1 1 1 1 0 1 1 0 1 0 1 1 1 1 0
0 1 1 0 1 1 1 0 1 1 0 1 0 0 1 0 0 1 0 1 0 0 0 0 1 1 0 1 0 1
0 1 1 0 1 1 0 1 0 1 0 0 0 1 0 1 0 0 0 0 1 0 1 0 1 0 0 1 0 0
5 5
50 50
0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 0 0
0 1 1 0 1 0 1 0 0 0 1 1 1 1 1 0 0 1 0 0 1 1 1 0 1 0 1 0 1 1 1 1 0 1 0 0 0 1 1 1 1 0 1 1 0 1 0 1 1 1
0 1 0 0 1 1 1 0 0 0 1 0 0 0 1 1 1 1 1 0 1 1 0 0 1 0 1 1 0 1 1 1 0 1 1 0 1 0 1 1 1 0 0 1 0 1 1 1 1 1
0 0 0 0 1 1 0 1 1 0 1 0 0 0 0 0 0 0 1 0 1 1 0 1 1 1 0 0 1 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 1 0 0 0 1
1 0 1 0 1 1 1 0 0 0 1 0 1 1 1 0 0 1 1 0 0 0 0 1 0 0 1 1 0 1 1 0 1 0 0 1 1 0 0 0 1 0 1 1 1 1 0 0 1 0
1 0 1 1 1 0 1 0 0 1 1 0 1 0 1 1 0 0 0 0 1 1 1 0 1 0 0 0 0 1 1 1 1 1 0 1 1 1 0 0 1 1 0 1 1 1 0 1 1 0
0 1 1 0 1 1 1 0 1 1 1 1 1 0 0 0 1 1 1 1 1 0 0 0 1 0 1 0 1 1 1 0 1 0 0 1 0 1 0 0 1 0 1 0 1 1 0 1 0 0
0 1 1 0 1 1 0 1 0 0 1 0 1 1 0 0 0 0 0 0 1 1 0 1 1 0 0 0 1 1 0 0 0 0 1 0 1 1 0 0 0 0 1 1 0 0 1 1 0 1
0 0 1 1 1 0 0 1 1 1 1 0 0 0 1 1 1 0 0 1 1 1 1 1 1 1 0 0 1 1 0 1 0 1 0 0 0 1 1 0 0 0 1 1 1 0 0 1 0 0
1 0 1 0 1 0 1 0 1 0 1 1 0 0 1 0 0 0 1 0 0 0 0 0 1 0 1 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 0 1 1 1 1 0 0 1 1 0 1 0 1 0 0 0 0 1 0 1 1 0 1 1 1 0 1 0 1 1 1 0 1 0 0 1 0 1 0 1 1 1 1 1 1 0 0
0 1 0 1 1 0 1 0 0 0 1 1 0 0 0 0 0 0 0 1 1 0 1 0 1 1 1 0 0 1 0 1 0 1 0 0 1 0 0 1 1 1 1 1 1 0 1 0 0 0
1 1 0 1 1 0 1 0 1 0 1 0 1 1 0 1 0 1 1 0 1 0 0 1 0 1 1 1 0 1 0 0 0 0 1 0 0 0 1 1 0 1 0 1 1 0 0 0 0 0
1 1 0 0 1 0 0 1 0 1 1 1 0 1 0 1 1 0 0 1 0 1 0 1 0 1 1 0 0 1 1 1 0 0 0 1 1 1 1 1 1 1 0 0 0 1 1 0 0 1
1 1 0 1 1 0 1 1 0 1 0 1 0 1 1 1 1 0 1 1 1 0 0 1 1 0 1 1 1 1 0 1 0 0 1 0 1 1 1 0 0 1 1 1 1 1 1 1 1 0
1 1 0 0 1 0 0 0 0 0 0 1 0 1 0 0 0 0 1 0 1 1 0 1 0 0 1 1 0 1 1 1 1 0 0 1 1 1 0 1 1 1 1 0 0 0 1 1 0 0
1 0 0 0 1 1 1 0 1 0 0 1 0 1 1 1 0 0 1 1 0 1 0 1 0 1 0 0 0 1 1 1 1 0 1 0 1 1 0 0 1 0 1 0 0 1 0 1 1 1
1 1 1 1 1 1 1 0 1 1 0 0 1 0 0 0 1 0 0 1 1 1 1 1 0 0 1 0 0 1 1 1 1 1 1 1 0 0 1 1 1 0 1 1 0 0 1 0 1 1
1 1 1 0 1 1 0 0 0 0 1 1 1 1 0 0 0 1 0 0 1 0 1 1 1 0 0 0 0 1 0 0 1 1 1 0 1 0 1 0 1 0 0 1 0 1 0 0 1 1
0 0 1 0 1 1 1 1 0 1 0 0 1 0 1 1 1 0 1 1 1 1 0 0 0 1 0 0 1 0 1 0 0 0 1 0 1 1 0 1 1 1 0 1 1 0 0 1 1 1
0 0 0 1 1 0 1 0 0 0 1 0 1 0 0 1 0 0 0 0 1 0 1 1 0 1 0 1 0 1 1 1 0 0 1 1 1 0 1 1 0 0 1 1 1 0 1 1 0 1
0 1 1 0 1 0 0 0 0 0 1 0 0 1 1 0 1 1 1 0 0 1 1 0 0 0 1 1 1 1 1 1 1 0 0 1 1 1 1 0 1 1 0 0 0 1 1 0 0 0
1 0 0 0 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 0 1 1 1 1 1 0 0 0 0 1 1 1 1 1 0 1 0 1 0 1 0 0 0 1 1 1 1 1 0 1 0 0 0 0 0 0 0 0 0 1 0 1 1 0 1 0 0
1 0 1 1 1 1 0 1 0 1 1 1 1 0 0 1 0 0 0 1 0 0 1 1 1 1 1 1 0 1 0 1 1 0 1 0 1 1 1 0 1 1 0 1 1 1 0 1 0 1
0 1 1 1 1 1 1 0 0 0 1 0 1 0 0 1 1 0 1 0 1 1 1 1 0 1 0 1 0 1 1 0 0 1 1 0 1 1 0 1 0 1 0 1 0 0 1 1 0 1
1 1 1 0 1 0 0 1 0 0 1 1 0 1 0 1 1 1 1 1 1 1 1 1 0 1 0 1 0 1 1 1 1 0 1 0 0 1 1 0 0 0 1 1 1 0 1 0 1 1
1 0 0 0 1 1 1 0 1 0 1 0 0 0 1 1 1 0 1 0 1 0 1 0 0 1 1 1 1 1 1 0 1 0 0 0 1 0 1 1 1 1 1 1 1 0 0 0 0 0
1 1 0 0 1 1 0 0 1 0 0 1 1 1 0 0 1 1 0 1 1 1 1 1 1 1 0 0 1 1 0 0 0 0 0 0 1 1 1 1 1 1 1 1 0 1 0 1 1 1
0 1 1 0 1 0 0 0 1 0 0 0 1 1 0 1 0 1 0 1 0 1 0 0 0 0 0 0 1 1 0 1 1 1 1 1 1 1 0 0 0 1 1 1 0 1 1 1 1 0
0 1 0 0 1 0 1 1 0 1 1 0 1 1 1 1 1 0 0 1 1 0 1 0 0 0 1 1 1 1 1 0 1 1 1 1 0 1 1 1 1 0 0 1 0 0 1 0 0 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 1 1 1 1 1 1 1 1 0 0 1 0 1 0 0 1 0 0 1 1 0 0 1 1 0 0 1 0 1 1 0 1 1 0 0 0 0 1 0 1 1 1 0 1 1 1 0 1 1
1 0 1 0 1 0 0 0 0 1 0 0 1 1 0 1 1 1 1 0 1 0 1 0 1 0 0 0 1 1 1 0 0 0 0 1 0 1 1 0 0 1 0 0 0 1 1 1 1 1
0 0 1 0 1 1 1 1 0 1 0 0 0 0 0 1 0 1 1 0 1 1 1 1 0 1 0 1 0 1 0 1 1 1 0 1 1 1 1 1 1 1 0 0 0 0 0 0 0 1
1 0 1 1 1 0 1 1 1 0 1 0 0 1 0 1 0 0 0 1 1 1 1 0 0 0 1 0 1 1 0 1 0 1 0 0 1 1 1 1 0 0 1 0 0 0 1 1 1 1
1 1 0 1 1 0 0 1 1 1 1 0 1 0 1 0 0 1 0 0 0 0 0 0 1 0 0 0 0 1 0 0 1 0 0 0 1 1 0 0 1 1 0 0 0 0 0 0 1 0
1 0 0 1 1 1 1 1 0 0 0 0 1 1 1 0 0 1 0 1 1 0 0 0 1 0 1 0 1 1 1 1 0 1 0 1 1 0 0 0 1 0 0 0 1 1 0 1 0 1
1 1 1 1 1 0 0 0 1 0 1 0 0 0 1 0 0 0 0 0 1 1 0 1 1 0 0 0 1 1 0 1 0 1 0 0 0 1 1 1 1 0 1 1 0 1 0 1 0 1
0 0 0 0 1 0 1 0 0 0 0 0 1 0 0 0 1 0 1 1 1 1 0 0 0 1 0 1 1 1 0 0 0 1 0 0 0 0 0 1 0 1 1 1 1 1 0 0 1 0
1 1 1 1 0 0 0 0 1 1 0 1 1 1 1 1 0 1 1 0 1 1 0 0 1 0 1 0 1 1 0 1 1 1 1 1 1 1 1 1 0 1 1 0 0 0 1 1 0 0
0 0 1 1 1 1 1 0 1 0 1 0 0 0 1 0 1 0 0 1 1 1 1 0 1 1 0 1 0 1 0 1 1 1 0 1 1 1 1 0 1 0 0 0 1 0 0 1 1 1
0 1 0 1 1 0 1 1 1 0 1 1 1 1 0 1 1 0 0 0 0 0 0 1 1 1 1 1 1 0 1 0 1 0 1 0 0 1 1 1 1 1 0 0 0 0 0 1 1 0
1 1 1 0 0 0 1 1 0 0 0 1 0 0 0 0 0 1 1 1 1 1 1 0 1 1 0 0 0 1 0 1 0 1 0 0 1 0 1 1 0 1 0 0 1 1 0 1 1 1
1 0 0 0 0 0 1 0 0 0 1 0 1 1 1 1 0 0 0 0 1 1 1 1 0 1 0 0 1 0 0 0 0 0 0 1 0 1 0 1 0 0 1 1 1 0 1 0 0 1
1 0 1 0 1 0 0 1 1 1 0 0 0 1 1 0 1 1 0 1 0 1 0 1 1 0 0 1 0 1 0 0 0 1 1 0 0 1 1 0 1 1 0 1 1 1 0 0 0 1
1 0 0 0 1 1 1 0 1 0 0 1 1 1 0 1 1 1 1 1 0 1 0 1 1 0 1 1 0 1 1 0 1 0 1 1 0 1 1 1 1 0 0 0 0 1 1 1 1 0
1 0 1 0 0 0 1 1 1 0 0 0 0 1 1 1 1 1 1 1 0 0 0 1 0 1 1 0 0 1 1 0 0 1 0 0 0 1 1 0 0 1 0 1 0 0 0 1 0 1
1 1 0 1 0 0 1 0 0 0 1 1 1 1 0 0 0 1 0 1 0 1 0 1 1 0 1 0 0 1 0 0 1 1 1 1 0 1 1 1 0 1 0 1 1 0 0 0 0 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
40 47
60 80
0 1 1 0 0 1 0 0 0 1 1 1 1 0 0 1 1 1 0 1 1 0 1 0 1 0 0 1 0 0 0 1 0 1 0 1 0 0 1 0 1 0 1 0 1 0 1 0 1 0 1 0 0 0 0 0 0 1 0 1
1 1 0 1 0 1 0 0 1 1 0 1 0 0 1 1 0 1 1 0 1 0 0 0 1 1 0 1 0 1 0 0 1 1 1 1 0 1 0 1 0 1 1 1 1 0 0 1 0 0 1 0 0 1 1 0 0 0 0 0
1 1 0 0 1 0 1 1 0 0 0 0 0 1 0 1 1 0 1 0 1 0 1 1 0 1 1 0 0 0 0 0 1 0 1 0 0 1 1 1 1 1 1 1 1 1 1 0 0 1 0 0 0 0 0 1 0 0 1 0
1 0 0 0 1 0 0 0 1 1 1 0 0 1 1 0 1 0 0 1 1 0 0 1 1 0 0 0 0 0 1 1 1 1 1 0 1 1 1 0 1 1 0 1 0 1 0 0 1 0 1 0 1 1 1 0 1 0 0 1
1 1 1 1 1 1 1 0 0 1 0 0 1 1 0 0 0 1 0 0 1 0 1 1 1 0 1 1 1 0 1 0 1 1 1 0 0 0 1 0 0 0 1 0 1 1 1 1 0 1 1 1 0 1 0 1 0 0 1 0
0 0 0 1 1 0 1 1 0 1 0 1 0 0 0 1 0 0 0 0 1 0 1 1 0 0 1 1 0 0 1 0 1 0 0 1 0 0 0 1 1 1 0 1 1 1 0 0 0 1 0 0 0 1 1 0 1 1 1 0
0 1 0 0 1 0 1 0 0 0 1 1 0 0 0 0 0 1 1 0 0 1 1 0 1 1 1 1 1 0 0 0 0 1 0 0 1 0 0 0 0 1 0 1 1 1 1 0 0 0 0 1 0 0 0 1 0 0 0 0
0 1 0 1 0 0 0 0 1 0 0 0 0 0 0 1 1 1 0 1 0 1 1 1 0 1 1 0 0 0 1 1 1 0 1 1 1 0 0 1 0 1 1 0 1 1 1 1 1 0 0 0 1 1 1 1 0 1 0 0
0 1 0 1 1 1 1 0 0 1 0 1 0 0 0 1 1 1 1 1 0 1 1 0 1 0 0 0 1 0 1 0 0 1 1 0 0 1 1 0 0 1 0 0 1 0 1 1 1 0 0 1 1 1 0 0 1 1 1 1
1 0 0 1 0 0 1 1 1 1 1 1 0 0 0 0 0 1 0 0 0 0 0 1 1 0 1 0 0 1 0 0 0 0 1 0 1 0 1 0 0 0 1 1 0 0 1 0 0 1 0 1 1 1 0 1 1 0 0 0
1 0 0 1 0 1 0 1 1 1 1 1 1 0 1 0 0 1 0 1 1 1 1 0 1 0 0 1 1 0 1 1 1 1 1 0 0 0 1 0 1 1 0 1 0 0 1 1 1 0 1 1 1 0 0 0 0 1 1 0
0 1 0 1 1 0 0 1 1 1 1 0 0 1 0 0 1 0 1 1 1 0 1 0 1 0 1 1 1 0 0 1 1 0 1 0 0 0 1 0 0 0 0 1 1 0 1 0 1 0 1 1 1 0 0 0 1 0 1 1
0 0 1 1 1 1 0 1 0 0 1 1 0 1 1 1 1 1 1 0 0 0 1 1 0 0 0 0 0 1 0 1 1 0 0 0 1 1 1 0 0 0 1 1 1 0 1 1 0 0 0 1 0 1 1 1 1 0 1 1
1 1 0 1 1 0 1 0 0 1 0 0 0 1 0 1 1 1 0 1 1 1 0 1 1 1 0 0 1 1 1 1 1 1 1 1 1 1 0 0 1 1 0 1 1 0 1 1 1 0 0 1 0 1 1 0 0 0 0 1
0 0 1 0 1 0 1 1 1 0 0 1 0 0 1 1 1 1 0 1 1 1 0 0 0 1 1 0 0 1 0 1 1 0 1 0 0 0 1 0 1 1 1 0 0 0 1 1 1 1 0 0 0 0 1 1 1 1 1 1
0 1 1 0 0 1 0 0 1 0 1 1 0 0 0 0 1 0 0 1 0 1 1 0 1 0 1 0 0 0 1 0 1 0 1 0 1 1 1 0 0 1 0 0 1 0 1 0 0 1 0 1 0 1 1 1 1 0 1 1
0 1 0 0 1 1 0 1 1 0 0 0 0 1 0 1 0 0 1 1 1 1 1 0 0 1 0 0 1 1 1 0 1 1 1 1 0 1 1 1 1 0 1 1 0 0 0 1 0 1 0 0 1 1 1 1 0 0 0 1
0 1 1 0 0 0 0 1 1 0 0 0 0 1 0 1 1 1 0 0 1 0 0 0 1 1 1 1 1 1 1 0 1 0 1 1 1 0 1 0 0 0 0 0 1 1 1 1 0 1 0 0 1 1 0 1 1 0 1 0
1 1 1 0 0 1 1 1 1 0 1 1 0 0 1 1 0 0 0 1 0 1 1 0 0 0 0 1 0 1 1 0 1 0 0 1 0 1 1 1 0 1 0 1 0 1 0 1 1 0 1 1 0 0 1 0 1 0 1 0
0 0 1 1 0 0 1 0 0 1 0 1 1 0 1 0 1 0 1 1 1 0 1 0 1 0 1 0 0 0 1 1 0 0 1 1 0 1 0 1 1 0 0 0 1 1 0 0 0 0 0 0 0 1 0 0 0 1 1 1
0 0 1 0 0 0 1 1 0 0 0 0 0 0 0 0 1 1 0 1 1 1 1 1 1 0 0 0 1 0 0 0 1 1 1 1 1 0 1 1 0 1 0 0 0 1 1 1 0 0 1 0 1 1 1 0 1 1 1 0
1 0 0 0 0 0 1 1 0 1 1 1 1 0 0 1 0 0 1 0 1 1 1 1 0 1 0 1 1 0 1 0 1 1 1 1 0 1 1 1 0 0 0 1 1 1 0 0 0 0 0 1 1 1 0 0 1 0 1 1
0 0 0 1 0 0 1 1 0 1 1 1 0 1 0 0 1 1 1 1 1 1 0 1 0 0 1 0 0 0 1 1 0 0 0 1 1 0 0 0 1 1 0 1 0 1 0 0 0 0 0 0 1 1 1 0 1 1 0 0
0 0 0 0 0 1 0 0 1 1 1 0 0 1 0 0 1 0 1 1 1 0 1 0 0 1 0 0 1 0 0 0 0 1 0 0 0 1 0 1 1 0 1 0 0 0 0 0 0 1 1 1 1 1 1 1 1 1 1 0
1 0 1 0 0 1 1 1 1 0 1 1 1 1 0 0 1 0 0 1 0 1 0 0 1 0 0 1 1 1 0 0 0 0 0 0 1 1 1 1 1 0 0 1 0 1 1 0 0 0 1 1 1 0 1 1 0 0 0 1
0 1 0 0 1 0 1 0 1 0 0 0 1 1 1 0 1 1 0 0 1 1 1 1 1 1 1 1 0 0 1 1 0 0 1 1 1 1 0 0 1 0 0 0 0 1 0 1 1 1 1 1 0 1 0 0 0 0 0 1
0 0 1 1 0 1 0 1 0 0 0 0 1 0 0 1 0 0 0 1 1 0 0 0 0 1 1 0 0 0 1 1 1 0 0 0 0 0 0 0 1 1 0 0 0 1 0 1 0 0 0 1 0 1 1 1 0 1 0 1
0 0 0 1 0 1 1 0 1 0 1 1 0 1 0 0 1 1 0 0 0 1 0 0 1 0 1 0 0 0 0 1 0 0 1 0 0 0 0 0 1 0 0 1 1 1 1 0 1 0 0 1 1 0 1 0 1 1 0 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
1 0 1 0 1 0 1 1 0 1 0 0 1 1 0 1 1 1 0 1 1 0 0 1 0 1 0 1 0 0 0 1 0 1 0 0 1 0 0 0 1 0 1 1 1 1 0 1 0 1 0 1 1 1 1 0 0 0 1 1
1 0 1 1 1 1 0 0 0 1 1 1 1 1 1 1 1 0 0 1 0 0 1 0 0 1 1 0 0 0 1 0 1 1 1 1 1 0 1 1 1 1 0 0 0 1 0 0 0 1 0 1 0 0 1 0 0 1 0 1
0 1 1 1 0 0 0 1 1 1 1 1 1 0 0 1 0 0 1 0 0 0 1 1 0 0 0 1 0 1 0 1 1 1 0 1 1 0 0 1 1 0 1 0 1 1 1 1 0 0 1 0 0 0 0 0 1 1 0 1
1 1 0 1 0 0 0 0 0 1 0 0 1 1 0 0 0 1 0 0 0 0 0 0 1 0 1 0 0 1 0 0 0 1 0 1 1 1 1 0 0 1 0 1 0 0 0 1 0 1 1 0 1 1 0 0 1 0 1 1
0 0 0 1 0 1 1 1 1 0 1 1 1 0 0 1 0 0 0 1 0 1 1 1 0 1 0 1 1 0 0 1 0 1 0 1 0 0 0 0 0 1 0 1 0 1 0 0 0 0 0 0 1 1 0 0 0 0 1 0
1 1 0 1 0 1 0 0 1 0 0 0 1 1 1 0 0 1 0 0 1 1 0 0 0 0 0 0 0 1 1 0 0 1 1 0 1 1 0 0 0 0 0 0 0 1 0 0 1 1 0 0 0 1 0 1 0 1 0 1
1 0 1 1 0 0 0 0 1 0 0 0 1 0 0 0 0 1 1 1 0 0 0 0 0 0 0 1 0 1 0 1 0 1 1 1 0 0 1 1 1 0 0 0 1 1 1 0 0 0 0 1 1 0 1 0 0 1 1 1
1 1 1 0 1 0 1 0 1 0 1 0 1 1 0 0 0 0 0 1 1 1 1 1 1 0 1 1 0 1 1 0 0 1 1 1 1 0 1 0 1 0 0 1 0 0 1 0 0 1 1 1 0 1 0 0 0 1 0 1
1 1 1 0 1 1 1 1 1 0 1 0 0 1 1 0 1 0 1 1 0 0 1 0 0 0 1 1 1 0 1 1 1 1 0 1 1 0 1 1 0 0 1 0 1 0 0 0 0 1 0 0 1 0 0 1 0 0 0 0
1 1 1 1 1 1 0 0 0 1 1 0 1 0 0 0 0 1 1 1 1 0 0 1 1 0 0 1 0 0 1 1 1 1 1 1 1 1 1 1 0 0 1 1 1 0 0 0 0 1 1 1 1 0 1 0 1 1 1 1
1 1 1 1 0 0 0 0 0 1 1 0 0 0 1 1 1 1 0 1 0 1 1 1 0 1 1 1 1 1 0 1 0 1 0 1 0 0 0 0 1 1 0 0 1 1 0 1 1 1 1 1 1 1 1 0 1 0 0 1
1 1 1 1 0 1 1 0 0 1 1 1 0 0 1 1 1 0 0 0 0 0 1 0 0 1 0 0 1 0 1 0 0 1 1 1 0 0 1 0 0 0 0 0 0 1 1 1 1 0 0 0 0 1 0 0 0 0 0 1
1 1 1 0 1 0 1 1 1 0 0 1 1 1 1 1 1 1 0 1 1 1 0 1 0 1 0 1 0 1 1 1 0 1 0 1 1 0 1 0 0 0 0 1 1 0 1 0 0 0 1 1 0 0 1 0 0 0 1 0
1 1 1 0 1 1 1 1 1 0 0 0 1 1 0 0 1 0 1 0 1 1 0 0 0 0 1 1 1 0 0 0 1 1 0 1 1 1 0 1 1 1 1 1 1 1 0 0 0 0 1 0 1 0 1 0 0 0 0 0
0 0 0 0 1 1 0 1 1 1 1 0 1 0 1 1 1 1 1 1 0 0 1 0 1 0 0 1 1 0 1 0 1 1 1 0 0 1 1 0 1 1 0 1 0 1 1 1 0 0 1 1 0 0 0 0 0 0 1 0
0 0 0 1 1 0 0 0 1 0 1 0 0 0 0 0 0 0 1 0 1 0 1 0 0 1 0 0 1 0 0 1 0 1 0 1 0 0 1 1 1 1 0 1 1 0 1 1 0 0 0 0 1 1 1 1 1 1 0 0
0 1 0 1 1 0 1 1 1 1 0 1 1 1 1 0 1 0 0 1 1 1 0 1 1 0 1 1 1 0 0 0 0 1 1 0 0 1 0 0 0 1 1 0 0 0 0 0 1 1 0 0 0 1 1 1 0 0 1 1
1 0 1 0 1 1 0 0 1 1 1 0 0 1 0 1 1 0 1 1 0 1 1 0 0 0 1 0 1 0 0 1 0 1 1 1 0 0 0 0 0 1 0 1 0 0 0 0 0 1 0 1 1 1 0 0 1 1 0 1
0 0 0 1 1 1 0 0 1 0 1 0 0 1 1 1 0 1 1 0 0 1 1 0 0 0 0 0 0 1 0 1 0 1 0 0 1 1 1 0 1 0 1 0 0 0 0 0 0 0 0 1 1 0 0 1 0 0 0 0
1 0 1 0 0 0 1 1 0 0 0 1 1 1 1 0 1 1 0 1 1 0 0 1 1 1 1 1 1 0 1 1 1 1 1 0 1 1 1 1 1 0 0 0 1 1 0 1 0 0 1 1 1 0 1 1 1 1 1 1
0 1 1 0 0 1 1 0 0 1 0 0 0 0 1 1 0 1 0 0 1 0 1 0 1 0 1 1 0 1 0 1 1 1 1 1 1 1 1 0 0 0 0 0 0 0 0 0 0 0 0 1 0 1 1 0 0 0 0 1
0 1 0 1 0 1 1 0 1 0 1 0 0 0 1 1 1 0 1 0 0 0 0 0 0 0 1 0 1 1 0 0 0 0 1 1 1 0 1 1 1 0 1 1 0 0 1 1 0 1 0 1 0 1 0 0 1 0 0 0
1 0 0 1 0 0 1 1 1 0 1 1 0 1 1 1 1 0 0 0 0 0 1 1 1 0 0 1 0 1 1 0 1 1 0 1 1 1 0 0 0 1 1 0 0 1 1 1 1 0 1 0 1 1 0 0 0 0 0 1
0 0 0 1 0 1 1 0 1 1 0 0 0 0 1 0 0 0 1 1 0 0 0 1 0 1 0 1 0 0 0 1 1 1 0 1 1 1 1 0 1 1 1 1 1 0 1 0 1 0 0 1 1 1 1 1 1 0 0 1
0 0 0 1 1 1 1 1 0 0 1 1 0 1 0 1 0 0 1 0 0 1 1 0 1 0 0 1 1 1 0 0 0 1 1 1 1 1 0 1 0 0 1 1 0 1 1 1 0 0 0 1 0 0 0 0 0 0 1 0
0 1 1 0 1 0 1 0 1 0 1 1 1 1 1 1 1 0 1 0 0 0 0 1 0 0 0 0 0 1 0 1 1 0 1 1 1 1 1 0 0 0 1 0 1 0 0 1 0 1 1 0 1 0 0 0 1 0 1 0
0 1 1 0 1 1 0 0 0 1 0 1 1 1 1 0 0 0 0 1 1 0 1 1 1 0 1 1 0 0 1 0 0 1 1 1 1 1 0 0 1 0 0 0 0 1 0 1 0 0 0 1 1 0 1 1 0 0 1 0
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
0 0 1 1 0 0 0 0 0 0 1 0 0 1 1 0 0 0 0 1 1 0 0 0 0 0 1 1 1 1 0 1 0 0 1 1 0 0 0 0 0 1 0 0 0 0 1 0 0 0 1 1 1 1 1 0 1 0 0 1
1 1 0 0 0 1 0 1 0 1 0 0 1 1 0 1 1 1 1 0 1 0 0 1 0 0 0 1 1 0 1 0 1 1 1 1 1 0 1 1 1 1 0 1 0 1 1 1 1 0 1 1 0 1 1 1 1 1 1 0
1 0 1 1 0 0 1 0 0 0 0 1 0 0 0 1 1 0 1 0 1 0 0 1 1 0 0 1 0 0 1 1 0 0 0 1 0 0 0 1 0 1 1 0 0 0 0 0 1 0 1 0 0 0 1 0 1 0 1 0
1 0 1 0 1 0 1 1 0 0 0 1 1 1 0 0 1 1 0 0 0 0 1 1 0 0 1 1 1 1 0 1 1 0 1 0 1 1 0 1 1 0 1 0 0 1 1 1 0 1 0 0 0 1 1 1 0 1 1 0
0 1 1 0 1 1 0 1 1 0 1 1 0 1 0 0 1 0 0 0 1 0 0 1 0 1 0 0 0 1 1 1 1 1 0 1 1 0 0 0 1 0 1 0 0 0 1 1 0 1 0 0 0 0 1 1 1 0 1 1
1 1 0 1 0 0 0 0 1 1 0 1 0 1 1 0 0 0 1 0 0 0 1 1 0 0 1 0 1 1 1 1 1 0 0 0 0 1 1 0 0 0 0 0 1 1 0 1 1 1 1 0 0 0 0 1 0 1 0 0
0 1 1 1 1 0 1 1 1 0 0 1 0 0 1 0 1 1 1 0 0 1 1 1 1 0 0 0 0 0 0 0 1 1 1 1 0 0 1 0 1 1 0 1 0 0 0 1 1 0 0 1 0 0 1 1 0 0 1 0
0 1 1 0 0 1 1 1 1 1 0 1 1 0 1 1 1 0 0 1 0 1 1 1 1 0 1 0 1 1 1 1 1 0 1 0 0 1 1 0 1 0 0 1 0 1 1 1 0 1 0 1 1 0 1 0 0 1 1 1
1 1 0 1 1 0 0 1 1 1 0 1 0 1 1 0 1 0 1 0 0 1 0 1 0 1 0 0 0 1 0 0 1 0 0 1 1 0 0 0 1 1 0 1 1 0 0 0 1 0 0 1 0 1 1 1 0 0 0 0
0 0 0 1 0 1 0 0 1 0 0 1 0 1 1 0 0 0 1 0 0 0 0 1 1 0 1 0 1 1 1 0 1 0 0 1 0 0 0 1 1 1 0 0 0 1 1 0 0 0 1 0 0 1 0 0 1 0 1 0
0 0 1 0 1 0 0 0 1 1 0 0 1 0 0 0 0 1 0 1 1 0 1 0 1 1 0 0 1 0 1 0 1 1 0 1 1 1 1 1 1 0 0 0 1 1 0 1 1 1 1 1 0 1 1 1 0 1 0 1
0 1 1 0 0 0 0 0 1 1 1 1 0 0 1 1 0 1 0 1 1 1 0 0 0 0 1 0 1 1 0 1 1 0 1 0 1 1 0 0 0 1 1 1 1 0 0 1 1 1 0 0 1 1 0 0 1 1 1 1
0 0 0 0 1 1 0 1 1 1 0 1 0 0 1 1 0 0 0 1 1 1 0 1 1 1 1 1 0 1 1 0 1 1 0 0 1 0 0 1 0 1 0 1 0 0 0 1 0 1 0 1 0 0 1 0 1 0 0 1
1 1 0 1 0 0 0 0 0 0 1 1 0 0 0 0 1 0 0 1 0 0 0 1 1 1 1 1 0 1 1 1 1 1 0 0 0 0 0 1 1 0 0 1 0 0 0 0 0 0 0 1 1 1 0 1 1 0 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
0 1 0 1 0 0 1 0 1 1 0 1 0 0 0 1 1 0 1 0 0 0 0 0 0 1 0 1 0 1 0 0 0 0 0 1 1 0 0 1 1 1 0 0 1 1 0 0 1 1 0 1 1 0 0 0 0 1 0 1
1 1 0 1 0 0 0 0 1 1 1 1 0 1 1 1 1 0 1 1 1 1 1 0 1 0 1 1 0 1 0 0 0 0 1 0 0 1 0 0 1 1 1 1 0 1 1 1 0 0 1 1 0 1 0 1 0 0 1 1
1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1 1
0 0 0 1 0 1 1 0 1 0 1 1 1 1 1 1 1 0 1 1 1 1 0 1 0 0 0 0 0 0 1 0 0 0 1 1 0 0 0 0 0 0 0 1 0 1 1 0 0 0 1 1 1 0 1 0 1 1 1 0
1 0 0 0 0 0 0 0 1 1 0 0 1 0 1 0 0 1 1 0 0 1 0 0 1 0 0 0 1 1 0 1 1 1 0 0 1 0 0 0 1 1 1 0 0 1 0 0 0 0 1 1 0 1 0 0 0 0 1 1
0 1 1 1 1 1 1 0 0 0 1 0 1 1 1 0 0 0 1 1 0 1 1 0 0 1 0 1 0 0 0 1 1 0 0 0 0 1 1 0 0 1 0 0 0 0 0 1 1 0 0 0 1 0 0 1 1 1 0 1
0 1 1 1 1 1 1 1 1 1 0 0 0 0 1 0 1 0 0 0 0 1 1 1 1 0 1 0 0 0 0 0 0 0 1 0 0 1 0 0 1 0 0 0 0 0 0 1 1 1 0 1 1 1 1 0 1 0 0 0
0 1 0 1 1 1 0 0 0 0 1 0 0 1 0 1 1 1 1 1 1 1 0 0 1 1 0 1 0 0 0 1 0 0 0 1 1 0 1 1 0 0 1 1 1 1 0 0 0 1 0 0 0 1 1 1 1 0 1 1
36 19

o/p for sample input  is:

21

23

56

51

20
 * 
 * @author nsbisht
 *
 */
public class LaughingBomb {

	static class Cell {
		int level = -1;
		int x;
		int y;

		public Cell(int l, int r, int c) {
			level = l;
			x = r;
			y = c;
		}
	}

	static Cell[] arr;
	static int[][] cityArr;
	static int N;
	static int M;
	static int[] xMoves = new int[]{0, 0, -1, 1};
	static int[] yMoves = new int[]{-1, 1, 0, 0};
	static int readIndex = 0;
	static int insertIndex = 0;
	static boolean[][] visited;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T > 0) {
			N = sc.nextInt();
			M = sc.nextInt();
			cityArr = new int[M + 1][N + 1];
			arr = new Cell[(M + 1) * (N + 1)];
			visited = new boolean[M + 1][N + 1];
			for(int i = 1; i <= M; i++) {
				for(int j = 1; j <= N; j++) {
					cityArr[i][j] = sc.nextInt();
				}
			}
			int bombY = sc.nextInt();
			int bombX = sc.nextInt();
			System.out.println(process(bombX, bombY));
			readIndex = 0;
			insertIndex = 0;
			T--;
		}
	}

	static int process(int startX, int startY) {
		int level = 1;
		arr[insertIndex++] = new Cell(1, startX, startY);
		visited[startX][startY] = true;
		while(arr[readIndex] != null) {
			Cell cell = arr[readIndex++];
			Cell[] neighbors = findNeighbors(cell);
			for(int i = 0; i < 4; i++) {
				if(neighbors[i] == null) {
					break;
				}
				arr[insertIndex++] = neighbors[i];
				level = Math.max(level, neighbors[i].level);
			}
		}
		return level;
	}

	static Cell[] findNeighbors(Cell cell) {
		Cell[] neighbors = new Cell[4];
		int index = 0;
		for(int i = 0; i < 4; i++) {
			int x = cell.x + xMoves[i];
			int y = cell.y + yMoves[i];
			if(x > 0 && y > 0 && x <= M && y <= N
					&& cityArr[x][y] != 0) {
				if(!visited[x][y]) {
					neighbors[index++] = new Cell(cell.level + 1, x, y);
					visited[x][y] = true;
				}
			}
		}
		return neighbors;
	}
}
