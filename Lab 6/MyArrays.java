public class MyArrays {
    public static int insert(int [] values, int currentSize, int pos, int newElement){
        /*
        IF currentSize < values.length
          FOR i from currentSize-1 downto pos
              move values[i] down one slot
          ENDFOR
          values[pos] = newElement
          INCREMENT currentSize
        ENDIF
        return currentSize

         */
        if(currentSize < values.length){
            for(int i = currentSize-1; i   <  pos; i++){
                values[i] = values[i]-1;
            }
            values[pos] = newElement;
            currentSize++;
        }
        return currentSize;
    }//end of insert()

    public static void insertionSort(int[] a){

        /*
        FOR index from 1 to a.length-1
            val = a[index]
            SET j to index-1
            WHILE j >= 0  AND a[j] > val
                   move a[j] right one position
                   DECREMENT j
            SET a[j+1] to val

         */
        for(int i=1; i < a.length-1; i++){
            int val = a[i];
            int j = i-1;
            while(j >= 0 && a[j] > val){
                a[j]=a[j+1];
                j--;
            }
            a[j+1] = val;
        }//end of for
    }//end of insertionSort()

    public static void binarySearch(int[] a){
        /*
       SET l = 0
       SET r = a.length-1
       SET found = false
       WHILE  !found AND l <= r
        SET m to be about midway between l and r.
        IF key equals a[m]
            SET found to true
        ELSE IF key is less than a[m]
            SET r = m–1
        ELSE
            SET l = m+1
        ENDWHILE

        IF found
             return m
        ELSE
             return -1
        ENDIF
        */
        int[] key = a;
        int l = 0;
        int r = a.length-1;
        boolean found = false;
        while(!found && l<=r){
            int m = (1+r)/2;
            if(key == a[m]){
                int r = m-1;
            }//end of if
            else{
                int l = m+1;
            }//end of else
        }//end of while
    }//end of binarySearch()
}
