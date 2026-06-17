public class RemoveElement {
    public static void main(String[] args) {

        int[] arr = {1, 4, 6, 7, 6, 2};
        int val = 6;

        int count = 0;

        for (int num : arr) {
            if (num != val) {
                arr[count++] = num;
            }
        }

        System.out.println("New Length = " + count);
    }
}