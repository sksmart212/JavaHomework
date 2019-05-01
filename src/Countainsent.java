public class Countainsent
{
    public static void main(String[] args) {
        String s = "Kavita";
        int count = 0;

        //Counts  character  a
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)== 'a') {
                count++;

            }

        }
        System.out.println(count);
    }
    }

