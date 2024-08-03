public class SelectionSort {

    public  static void printarr(int[]arr){
        for (int j :arr) {
            System.out.println(j);

        }
    }
    public static void main(String[] args) {
        int [] arr = {23,345423,12243,55,34232,3535};
        for (int i = 0; i < arr.length-1; i++) {
            int min = i;
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[j]<arr[min]){
                    min = j;

                }

            }
            int temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
        }
        printarr(arr);

    }

}
