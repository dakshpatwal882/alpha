import java.util.Arrays;

class anagrams{
    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        char[] scharArray = s.toCharArray();
        char[] tcharArray = t.toCharArray();

        Arrays.sort(scharArray);
        Arrays.sort(tcharArray);

        return Arrays.equals(scharArray, tcharArray);
    }
     public static void main(String[] args) {
    String s = "rat";
    String t = "tar";
    System.out.println(isAnagram( s, t)); 
}
}