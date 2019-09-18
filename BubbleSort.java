public class BubbleSort implements SortingAlgorithm {
    //Runtime = O(n^2) because of the reads and writes
    //can create a boolean to check if anything has been swapped via while(swapped)
    //Best Case: O(n) if array is sorted

    void swap(int[] a, int i, int j){
        int temp = a[i];
        a[i]=a[j];
        a[j] = temp;
    }


    public void sort(int[] a) {
        int n = a.length;
        boolean swapped = true;
        while (swapped) {
            swapped = false;
        for (int i = 0; i < n - 1; i++) {
            //for (int j = 1; j < (n - i); j++) {
                if (a[i] > a[i+1]) {
                    swap(a,i,i+1);
                    swapped = true;

                }
            }

        }
    }
}
