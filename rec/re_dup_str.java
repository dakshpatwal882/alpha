public class re_dup_str {
    public static void removeDuplicates(String str, int idx, StringBuilder ans, boolean[] map) {
        if (idx == str.length()) {
            System.out.println(ans);
            return;
        }

        char curr = str.charAt(idx);

        if (map[curr - 'a']) {
            removeDuplicates(str, idx + 1, ans, map);
        } else {
            map[curr - 'a'] = true;
            ans.append(curr);
            removeDuplicates(str, idx + 1, ans, map);
        }
    }

    public static void main(String[] args) {
        String str = "dddaaaakkkssshhhh";
        removeDuplicates(str, 0, new StringBuilder(), new boolean[26]);
    }
}

