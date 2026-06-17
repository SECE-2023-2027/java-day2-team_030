import java.util.Scanner;

public class HighLowStudent {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String highName = "";
        String highId = "";

        String lowName = "";
        String lowId = "";

        int highest = -1;
        int lowest = 101;

        for (int i = 0; i < n; i++) {

            String name = sc.next();
            String id = sc.next();
            int score = sc.nextInt();

            if (score > highest) {
                highest = score;
                highName = name;
                highId = id;
            }

            if (score < lowest) {
                lowest = score;
                lowName = name;
                lowId = id;
            }
        }

        System.out.println(highName + " " + highId);
        System.out.println(lowName + " " + lowId);

        sc.close();
    }
}