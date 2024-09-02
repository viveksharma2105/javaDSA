package Generic;
import java.lang.*;
public class MainArryIterator {
    public static void main(String[] args) {
        Object ArryIterator;
        Object String;
        var list = new ArryIterator<String>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("d");
        for (var arr: list)
            System.out.println(arr);
    }
}
