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
    public class LinearSearch {
        boolean found = false;
        int index = 0;
        /*
         SET found to false​
         SET index to 0​
         WHILE !found AND index < a.length​
         IF a[index] equals key​
         SET found to true​
         ELSE ​
         INCREMENT index​
         ENDIF​
         ENDWHILE continued…
         IF found​
          return index​
                 ELSE​
          return -1​
         ENDIF */
        public boolean find(int num, int[] a){
            while(found == false && index < a.length){
                if(a[index] == num){found = true;
                    return found;}
                else{found = false;}
                index++;
            }return found;}
    }


}
