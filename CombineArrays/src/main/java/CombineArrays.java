import java.util.ArrayList;

public class CombineArrays {
    /**
     * Combine two arrays into a single array and return it.
     *
     * @param arr1 an array of ints.
     * @param arr2 an array of ints.
     * @return an array containing the contents of arr1 followed by the contents of arr2.
     */
    public int[] combine(int[] arr1, int[] arr2){
        ArrayList<Integer> x = new ArrayList<Integer>(); 

        for(int i = 0; i < arr1.length; i ++ ){
            x.add(arr1[i]);
            }
        
        for(int e = 0; e < arr2.length; e++){
           x.add(arr2[e]); 

        }
        int[] arr = new int[x.size()];
        for(int i = 0; i < arr.length; i ++) {
            arr[i] = x.get(i);
        }

        return arr;
    }
}