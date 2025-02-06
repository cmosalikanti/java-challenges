package org.example;

import java.util.Arrays;
import java.util.List;

/** Given a list of integers, find the index of the smallest array element (the pivot), for which the sums of all
 *  elements to the left and to the right are equal. The array may not be reordered.
 */
public class FindPivot {
    public static void main(String[] args) {
        System.out.println(findPivot(Arrays.asList(200,100,2,400,2,702)));
    }

    private static int findPivot(List<Integer> arr) {
        int pivotIndex = -1;

        for (int index = 0; index < arr.size(); index++) {
            int leftSum = 0;
            int rightSum = 0;

            for (int x = index - 1; x >= 0; x--) {
                leftSum = leftSum + arr.get(x);
            }

            System.out.println("left sum:" + leftSum);

            for (int y = index + 1; y < arr.size(); y++) {
                rightSum = rightSum + arr.get(y);
            }

            System.out.println("right sum:" + rightSum);

            if (leftSum == rightSum) {
                pivotIndex = index;
                break;
            }
        }

        return pivotIndex;
    }
}
