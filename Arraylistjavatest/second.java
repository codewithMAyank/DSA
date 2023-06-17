import java.util.ArrayList;
import java.util.*;
public class second {
    public static void main(String[] args) {
        //java collection framework
        //string wala
        ArrayList<String> list = new ArrayList<String>();
        list.add("Ravi");
        list.add("Vijay");
        list.add("Ajay");
        list.add("Anuj");
        list.add("Gaurav");
        list.add("Harsh");
        list.add("Virat");
        list.add("Gaurav");
        list.add("Harsh");
        list.add("Amit");
        System.out.println("Traversing list through List Iterator:");
        //Here, element iterates in reverse order
        ListIterator<String> list1=list.listIterator(list.size());
        while(list1.hasPrevious())
        {
            String str=list1.previous();
            System.out.println(str);
        }
    }
}
