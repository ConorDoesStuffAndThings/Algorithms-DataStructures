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

}
