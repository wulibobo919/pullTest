package main;

/**
 * @Author linbo
 * @Description:
 */
public class FindMedianSortedArrays {

    public static void main(String[] args) {

    }

    public static int findMedianSortedArrays(int[] a, int[] b) {
        int length = a.length + b.length;
        int result;
        int mid = length / 2;
        int i = 0, j = 0;
        while (i < a.length && j < b.length) {
            if (a[i] > b[j]) {
                j++;
            } else {
                i++;
            }
            if (i+j==mid){

            }
        }

        return 0;

    }
}
