public class MyArrays {
    public static int sum(int [] values){
        if(values.length < 0){
            return 1;
        }

        else{
            int finalSum = sum(values[values.length-1]) + values[values.length-2];
            return finalSum;
        }
    }
}
