public class MyArrays {
    public static int insert(int[] values, int currentSize, int newElement, int pos) {
        if (currentSize < values.length) {
            for (int i = currentSize - 1; i >= pos; i--) {
                values[i + 1] = values[i];
            }
            values[pos] = newElement;
            currentSize++;
        }
        return currentSize;
    }

    public static int linearSearch(int[] a, int searchKey) {
        for (int i = 0; i < a.length; i++) {
            if (searchKey == a[i]) {
                return i;
            }
        }
        return -1;
    }

    // Binary search
    public static int binarySearch( int array[], int key )
    {
        int low = 0;                  // low subscript
        int high = array.length - 1;  // high subscript
        int middle;                   // middle subscript

        while ( low <= high ) {
            middle = ( low + high ) / 2;

            if ( key == array[ middle ] )  // match
                return middle;
            else if ( key < array[ middle ] )
                high = middle - 1;  // search low end of array
            else
                low = middle + 1;   // search high end of array
        }
        return -1;   // searchKey not found
    }

    public static void selectionSort(int[] a) {
        //sorting in ascending order
        for (int i = 0; i <= a.length - 2; i++) {
            //find index such that a[index] is the smallest of a[i]...[a.length-1]
            int index = i;
            int smallest = a[i];

            for (int j = i + 1; j <= a.length - 1; j++) {
                if (a[j] < smallest) {
                    smallest = a[j];
                    index = j;
                }
            }
            //if index != i, swap a[index] and a[i].
            if (index != i) {
                int temp = a[i];
                a[i] = a[index];
                a[index] = temp;

            }
        }
    }

    /*
    FOR index from 1 to a.length-1
            val = a[index]
            SET j to index-1
            WHILE j >= 0  AND a[j] > val
                   move a[j] right one position
                   DECREMENT j
            SET a[j+1] to val
     */

    public static void insertionSort(int[] a){
        for(int i = 0; i <= a.length-1; i++){
            int val = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > val){
                a[j] = a[j+1];
                j--;
                a[j+1] = val;
            }//end of while
        }//end of for
    }//end of insertionSort

    public static void mergeSort(int[] a)
    {
        if (a.length <= 1) { return; }
        int[] first = new int[a.length / 2];
        int[] second = new int[a.length - first.length];
        // Copy the first half of a into first, the second half into second
        for (int i = 0; i < first.length; i++)
        {
            first[i] = a[i];
        }
        for (int i = 0; i < second.length; i++)
        {
            second[i] = a[first.length + i];
        }

        mergeSort(first);
        mergeSort(second);
        merge(first, second, a);
    }//end of mergeSort

    //Lab 7 Q1
    public static void merge(int []first, int []second, int [] a){
        /*
        SET iFirst = 0, SET iSecond = 0, and SET j = 0
             WHILE  iFirst < first.length and iSecond < second.length
            IF first[iFirst] < second[iSecond]
                a[j] = first[iFirst]
                                   increment iFirst
            ELSE
                 a[j] = second[iSecond]
                                    increment iSecond
                    increment j
        ENDWHILE

        WHILE iFirst < first.length
                 a[j] = first[iFirst]
                 increment iFirst and j
         WHILE iSecond  < second.length
                 a[j] = second[iSecond]
                 increment iSecond and j

         */
        int iFirst = 0, iSecond = 0, j = 0;
        while(iFirst < first.length && iSecond < second.length){
            if(first[iFirst] < second[iSecond]){
                a[j] = first[iFirst];
                iFirst++;
            }//end of if

            else{
                a[j] = second[iSecond];
                iSecond++;
            }//end of else
            j++;
        }//end of while
    }//end of merge

}//end of class
