import java.util.Arrays;

public class LeftRotateArray {
    public static void main(String[] args) {

        int[] arr = {20, 30, 40};

        int first = arr[0];

        arr[0] = arr[1];
        arr[1] = arr[2];
        arr[2] = first;

        System.out.println(Arrays.toString(arr));
    }
}