
public class Reversearray {
    public static void main(String[] args) {
        int counter, i=0, j=0, temp;
        int[] numbers = {1, 2, 3, 4, 5, 6};

        j=i-1;
        i=0;
        while(i<j)
        {
            temp = numbers[i];
            numbers[i] = numbers[j];
            numbers[j] = temp;
            i++;
            j--;

        }
        for(i=0; i<numbers.length; i++)
        {
            System.out.print(numbers[i]);
        }

    }
}

