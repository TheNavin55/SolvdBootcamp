import java.util.*;
import java.lang.String;

class Insertion {
    public static void main(String[] args){
        int []arr = {5, 3, 8, 9, 7, 2, 14, 17, 4};

        System.out.println("Unordered array: "+ Arrays.toString(arr));
            
        for (int i = 1; i < arr.length; i++){
            int actual = arr[i];

            int j = i - 1;
            while(j >= 0 && arr[j] > actual){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
        }
        System.out.println("Ordered array lower to higher: " + Arrays.toString(arr));

        higherToLower();
        aToZ();
        zToA();
    }

    public static void higherToLower(){
        int []arr = {5, 3, 8, 9, 7, 2, 14, 17, 4};

        System.out.println("Unordered array: "+ Arrays.toString(arr));
            
        for (int i = 1; i < arr.length; i++){
            int actual = arr[i];

            int j = i - 1;
            while(j >= 0 && arr[j] < actual){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = actual;
        }
        System.out.println("Ordered array higher to lower: " + Arrays.toString(arr));
        
    }

    public static void aToZ(){
        String[] arrToSort = {"z", "s", "g", "a", "n"};

        Arrays.sort(arrToSort, String.CASE_INSENSITIVE_ORDER);

        System.out.println("Ordered array A to Z: " + Arrays.toString(arrToSort));
        
    }

    public static void zToA(){
        String[] arrToSort = {"a", "d", "x", "b", "z"};

        Arrays.sort(arrToSort, Collections.reverseOrder());

        System.out.println("Ordered array Z to A: " + Arrays.toString(arrToSort));
        
    }

}