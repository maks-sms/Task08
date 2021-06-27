import java.util.Arrays;

public class Exercise {

    public static void main(String[] args) {

        int[] array = new int[] {579, 72, 37, 8, 9};
        printArr(array);

    }

    static void printArr(int[] arr){
        if(arr.length > 0){
            System.out.println(arr[0]);
            printArr(Arrays.copyOfRange(arr, 1, arr.length));

        }
    }
}
