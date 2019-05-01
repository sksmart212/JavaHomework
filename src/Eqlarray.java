import java.util.Arrays;

public class Eqlarray {
    public static void main (String[] args){
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {1,2,3,4,5};
        /*check arrays are equal by arrays.equal */

        if (Arrays.equals(arr1, arr2)) System.out.println("Same");
        else System.out.println("Not same");
    }
}



