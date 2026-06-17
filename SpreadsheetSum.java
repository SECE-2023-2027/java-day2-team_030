import java.util.Scanner;

public class SpreadsheetSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[][] arr = new int[n][n];
        int[] colSum = new int[n];

        int grandTotal = 0;

        for (int i = 0; i < n; i++) {

            int rowSum = 0;

            for (int j = 0; j < n; j++) {

                arr[i][j] = sc.nextInt();

                rowSum += arr[i][j];
                colSum[j] += arr[i][j];
                grandTotal += arr[i][j];
            }

            for (int j = 0; j < n; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println(rowSum);
        }

        for (int x : colSum) {
            System.out.print(x + " ");
        }

        System.out.println(grandTotal);

        sc.close();
    }
}