package com.ms.dsa.tcs;

/*A parking lot in a mall has R x C number of parking spaces.
Each parking space will either be empty (0) or full (1).

The status (0/1) of a parking space is represented as the element of the
matrix.
The task is to find the index of the row (R) in the parking lot that has the
maximum number of parking spaces full (1).

Note:

. R x C = Size of the matrix

. Elements of the matrix M should be only 0 or 1
Input:
3 -> Value of R (row)
3 -> Value of C (column)
0 1 0
1 1 0
1 1 1

Output: 3
 */
public class Question1 {

  public static void main(String[] args) {
    int[][] parking = { { 0, 1, 0 }, { 1, 1, 0 }, { 1, 1, 1 } };
    System.out.println(findRowOfMaxSpace(parking));
  }

  public static int findRowOfMaxSpace(int[][] parking) {
    int count = 0;
    int maxCount = 0;
    int row = 0;

    for (int i = 0; i < parking.length; i++) {

      for (int j = 0; j < parking[i].length; j++) {
        if (parking[i][j] == 1) {
          count++;
        }

      }
      if (count > maxCount) {
        maxCount = count;
        row = i + 1;
      }

    }

    return row;

  }
}
