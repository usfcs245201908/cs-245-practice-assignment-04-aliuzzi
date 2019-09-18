public class SelectionSort implements SortingAlgorithm{
    //for each pos from 0.. a - length-1
    //swap a[pos] with a[min]
    //Runtime = O(n^2) because it is nested for loops
    public void swap( int[]a, int i, int j){
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;

    }

    public int findMin(int []a, int start){   //todo understand this better run through compiler
        int min = start; //set equal to start and enventually change it and return min
        for( int i=start + 1; i< a.length; i++){
            if (a[i]< a[min]){
                min = i;
            }
        }return min;
    }

    public void sort (int[]a){
        for (int i=0; i< a.length; i++){
            swap(a,i,findMin(a,i));
        }
    }
}
