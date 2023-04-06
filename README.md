# Hackerrank_DiagonalDifference

Given a square matrix, calculate the absolute difference between the sums of its diagonals.

For example, the square matrix  is shown below:

1 2 3<br>
4 5 6<br>
9 8 9<br>
The left-to-right diagonal : 1 + 5 + 9 = 15. The right to left diagonal : 3 + 5 + 9 = 17 . Their absolute difference is |15 - 17| = 2.

Input Format<br>
The first line contains a single integer,n , the number of rows and columns in the square matrix arr.<br>
Each of the next n lines describes a row,arr[i] , and consists of n space-separated integers arr[i][j].<br>

Constraints<br>
-100 <= arr[i][j] <= 100<br>
Output Format<br>

Return the absolute difference between the sums of the matrix's two diagonals as a single integer.

Sample Input<br>
3<br>
11 2 4<br>
4 5 6<br>
10 8 -12<br>

Sample Output<br>
15<br>
