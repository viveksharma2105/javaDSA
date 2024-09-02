package GenericArrylist;

public class main {
    public static void main(String[] args) {
        GenericArrayList<Integer> intlist = new GenericArrayList<>();
        intlist.add(23);
        intlist.add(21);
        for (int i = 0; i < intlist.size(); i++) {
            System.out.println(intlist.get(i));

        }
    }
}
