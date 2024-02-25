import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {

        String s1 = "A Gentle man";
        String s2 = "Elegant Man";
        s1 = s1.replace(" ", "").toLowerCase();
        s2 = s2.replace(" ", "").toLowerCase();
        char[] c1 = s1.toCharArray();
        char[] c2 = s2.toCharArray();
        Arrays.sort(c1);
        Arrays.sort(c2);    //sort method of java.util.Arrays class
        if (Arrays.equals(c1, c2)) {
            System.out.println("It is anagram");
        } else {
            System.out.println("It is not anagram");
        }
    }
}
