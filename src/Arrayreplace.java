import java.util.ArrayList;
import java.util.List;

public class Arrayreplace {
    public static void main(String[] args) {
        // let's create a list
        List<String> Books = new ArrayList<String>();
        Books.add("Book1");
        Books.add("Book2");
        Books.add("Book3");
        Books.add("Book4");
        Books.add("Book5");
        int indexval = Books.indexOf("Book3");
        Books.set(indexval, "Book10");/*to replace existing value into replace value*/
        System.out.println(Books);
    }
}

