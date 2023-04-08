public class Anagrams {
    public static void main(String[] args) {

    }
    static boolean isAnagram(String a, String b) {
        char[] A = a.toUpperCase().toCharArray();
        char[] B = b.toUpperCase().toCharArray();

        java.util.Arrays.sort(A);
        java.util.Arrays.sort(B);
        return new String(A).equals(new String(B)) ? true : false;
    }
}