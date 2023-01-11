package org.resume;


public class SortArray {
    protected void merge(int[] array, int left, int pivot, int right) {

        int n1 = pivot - left;
        int n2 = right - pivot;

        int[] first = new int[n1];
        int[] second = new int[n2];

        System.arraycopy(array, left, first, 0, n1);
        System.arraycopy(array, pivot, second, 0, n2);

        int newL, newR, newP;
        newL = 0;
        newR = 0;
        newP = left;

        while (newL < n1 && newR < n2) {
            if (first[newL] <= second[newR]) {
                array[newP] = first[newL];
                newL++;
            } else {
                array[newP] = second[newR];
                newR++;
            }
            newP++;
        }

        while (newL < n1) {
            array[newP] = first[newL];
            newL++;
            newP++;
        }

        while (newR < n2) {
            array[newP] = second[newR];
            newR++;
            newP++;
        }
    }

    public int[] sort(int[] array, int left, int right) {
        if (left < right) {

            int mid = (left + right) / 2;

            sort(array, left, mid);
            sort(array, mid + 1, right);

            merge(array, left, mid, right);
        }
        return array;
    }
}