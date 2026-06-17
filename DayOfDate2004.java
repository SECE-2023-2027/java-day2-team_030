import java.util.Scanner;

public class DayOfDate2004 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int month = sc.nextInt();
        int day = sc.nextInt();

        String[] week = {
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday",
                "Monday",
                "Tuesday",
                "Wednesday"
        };

        int[] days = {
                31, 29, 31, 30, 31, 30,
                31, 31, 30, 31, 30, 31
        };

        int total = day - 1;

        for (int i = 0; i < month - 1; i++) {
            total += days[i];
        }

        System.out.println(week[total % 7]);

        sc.close();
    }
}