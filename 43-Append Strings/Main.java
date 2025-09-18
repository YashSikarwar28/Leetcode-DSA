public class Main {
    public static void main(String[] args) {
        String a="abcd";
        String b="pq";
        int n=Math.min(a.length(), b.length());
        StringBuilder s=new StringBuilder();
        int i=a.length();
        int j=b.length();
        for (int j2 = 0; j2 < n; j2++) {
            s=s.append(a.charAt(j2));
            s=s.append(b.charAt(j2));
        }
        if (i>j) {
            s.append(a.substring(n));
        }
        else if(j>i){
            s.append(b.substring(n));
        }
        System.out.println(s);
    }  
}




// class Solution {
//     public String mergeAlternately(String a, String b) {
//         int n=Math.min(a.length(),b.length());
//         StringBuilder s=new StringBuilder();
//         for(int i=0;i<n;i++){
//             s.append(a.charAt(i));
//             s.append(b.charAt(i));
//         }
//         if(a.length()>b.length()){
//             s.append(a.substring(n));
//         }
//         else if(b.length()>a.length()){
//             s.append(b.substring(n));
//         }
//         return s;
//     }
// }