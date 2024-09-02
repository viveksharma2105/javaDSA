package GenericArrylist;

import java.util.ArrayList;

public class GenericArrayList<T> {
    private ArrayList<T> items = new ArrayList<>();
    private int count;

    public void add(T item) {
        items.add(item);
        count++;
    }
    public T get(int indx){
      return   items.get(indx);
    }
    public int size(){
        return count;
    }
}


/*
// Example with String
        GenericArrayList<String> stringList = new GenericArrayList<>();
        stringList.add("Hello");
        stringList.add("World");

        System.out.println("String List:");
        for (int i = 0; i < stringList.size(); i++) {
            System.out.println(stringList.get(i));
 */
