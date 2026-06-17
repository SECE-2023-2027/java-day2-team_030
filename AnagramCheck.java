import java.util.Arrays;

public class AnagramCheck {
    public static void main(String[] args) {

        String s1 = "wxyz";
        String s2 = "zyxw";

        char[] a = s1.toCharArray();
        char[] b = s2.toCharArray();

        Arrays.sort(a);
        Arrays.sort(b);

        System.out.println(Arrays.equals(a, b));
    }
}