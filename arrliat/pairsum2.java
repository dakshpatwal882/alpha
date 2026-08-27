import java.util.ArrayList;

public class pairsum2 {

    // 2 pointer approach for sorted rotated array
    public static boolean pairSum2(ArrayList<Integer> list, int target) {

        int n = list.size();
        int bp = -1; // breaking point

        // Find breaking point
        for (int i = 0; i < n - 1; i++) {
            if (list.get(i) > list.get(i + 1)) {
                bp = i;
                break;
            }
        }

        // If array is not rotated
        if (bp == -1) {
            bp = n - 1;
        }

        int lp = (bp + 1) % n; // smallest element
        int rp = bp;            // largest element

        while (lp != rp) {

            int sum = list.get(lp) + list.get(rp);

            // Case 1: target found
            if (sum == target) {
                return true;
            }

            // Case 2: sum is greater than target
            if (sum > target) {
                rp = (n + rp - 1) % n;
            }

            // Case 3: sum is smaller than target
            else {
                lp = (lp + 1) % n;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(8);
        list.add(6);
        list.add(2);
        list.add(5);
        list.add(4);
        list.add(8);
        list.add(3);
        list.add(7);

        int target = 11;

        System.out.println(pairSum2(list, target));
    }
}