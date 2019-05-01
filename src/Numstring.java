import java.util.Arrays;

public class Numstring {
    public static void main(String[]args){

                int[] my_array1 = {
                        2,3,6,1,4};

                String[] my_array2 = {
                        "Priya",

                        "Riya",
                        "Neha",
                        "Sonia",
                        "Sapna"

                };
             Arrays.sort(my_array1);
                System.out.println("Sorted numeric array " + Arrays.toString(my_array1 )) ;

                Arrays.sort(my_array2);
                System.out.println("Sorted string array" + Arrays.toString(my_array2));
            }

    }

