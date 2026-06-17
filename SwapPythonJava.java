import java.util.Scanner;

public class SwapPythonJava {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();

        str = str.replace("python", "#");
        str = str.replace("java", "python");
        str = str.replace("#", "java");

        System.out.println(str);

        sc.close();
    }
}