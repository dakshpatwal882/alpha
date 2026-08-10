public class lexogrpahic {
    public static void main(String[] args) {
        String frite[] = { "apple", "banana", "mangow" };
        String largest = frite[0];
        for (int i = 1; i < frite.length; i++) {
            if (largest.compareToIgnoreCase(frite[i]) < 0) {
                largest = frite[i];
            }
        }
        System.out.println(largest);
    }
}