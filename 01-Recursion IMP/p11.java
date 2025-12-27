//LC 1239 Maximum Length of a Concatenated String with Unique Characters

class Solution {
    static int ans;

    public int maxLength(List<String> str) {
        ans = 0;
        HashSet<Character> h = new HashSet<>();
        concat(h, str, 0, 0);
        return ans;
    }

    static void concat(HashSet<Character> h, List<String> str, int ind, int len) {

        ans = Math.max(ans, len);

        if (ind == str.size()) {
            return;
        }

        String a = str.get(ind); 
        boolean add = true;
        HashSet<Character> c = new HashSet<>();

        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (c.contains(ch) || h.contains(ch)) {
                add = false;
                break;
            }
            c.add(ch);
        }

        if (add) {
            h.addAll(c);
            concat(h, str, ind + 1, len + c.size());
            h.removeAll(c); // BACKTRACK
        }

        // skip current string
        concat(h, str, ind + 1, len);
    }
}