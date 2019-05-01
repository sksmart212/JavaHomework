import java.util.ArrayList;

public class Comparearraylist {
    public static void main(String[] args) {
       ArrayList<String>  my_arraylist = new ArrayList<String>();
       my_arraylist.add("abc");
        my_arraylist.add("def");
        my_arraylist.add("ghi");
        my_arraylist.add("jkl");
        my_arraylist.add("mno");
        ArrayList<String> my_arraylist1 =  new ArrayList<String>();
        my_arraylist1.add("abc");
        my_arraylist1.add("def");
        my_arraylist1.add("ghi");
        my_arraylist1.add("jkl");
        my_arraylist1.add("mno");

       System.out.println( my_arraylist.equals(my_arraylist1));



    }
}
