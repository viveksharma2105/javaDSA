//LinkList
import java.util.*;

public class LinkLst {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();

        //add in first
        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("This");
        System.out.println(list);

        //add in last
        list.addLast("list");
        System.out.println(list);

        //print size of list
        System.out.println("Size of list : " + list.size());


        //print all the elements in the list
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");

        }


        //search
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == "a"){
                System.out.println( "The element is exist in the list");
            }

        }
/*
        //Remove first
        list.removeFirst();
        System.out.println(list);


        //Remove last
        list.removeLast();
        System.out.println(list);


*/
        // Remove value by index
        list.remove(3);
        System.out.println(list);

    }
}
