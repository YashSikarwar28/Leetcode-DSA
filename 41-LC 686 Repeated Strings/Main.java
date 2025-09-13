class Solution {
    public int repeatedStringMatch(String a, String b) {
        StringBuilder c = new StringBuilder();
        int count = 0;

        // Keep appending 'a' until the length of c is >= length of b
        while (c.length() < b.length()) {
            c.append(a);
            count++;
        }

        // First check
        if (c.toString().contains(b)) {
            return count;
        }

        // One extra append to catch overlap cases
        c.append(a);
        count++;

        if (c.toString().contains(b)) {
            return count;
        }

        // If still not found
        return -1;
    }
}



// public class Main {

//     public static void main(String[] args) {
//         String a = "abcd";
//         String b = "cdabcdab";
//         String d="";
//         d=a;
//         StringBuilder c = new StringBuilder();
//         int repeat = 1;
//         int n = 0;
//         if (a.length() < b.length()) {
//             int diff = b.length() - a.length();
//             n += Math.ceil((double) diff / a.length());
//             for (int i = 0; i <= n; i++) {
//                 c.append(a);
//             }
//             repeat++;
//         }
//         //c.append(a);
//         a=c.toString();
//        // System.out.println(a);
//         int Alength = a.length();
//         int Blength = b.length();
//         for (int i = 0; i < b.length(); i++) {
//             int start = i;
//             if (i + Blength <= Alength && a.substring(start, start + Blength).equals(b)) {
//                 System.out.println("True");
//                 System.out.println(repeat);
//             } else {
//                 c.append(d);
//                 a = c.toString();
//                 //System.out.println(a);
//                 Alength=a.length();
//                 repeat++;
//             }
//         }
//         System.out.println(Alength);
//     }
// }