//important question need revision

class Solution {
    public String lexSmallest(String s) {
        String smallest=s;
        for(int i=1;i<=s.length();i++){
            String prefix=new StringBuilder(s.substring(0,i)).reverse().toString()+s.substring(i);
            if(prefix.compareTo(smallest)<0){
                smallest=prefix;
            }
            String suffix=s.substring(0,s.length()-i)+new StringBuilder(s.substring(s.length()-i)).reverse().toString();
            if(suffix.compareTo(smallest)<0){
                smallest=suffix;
            }
        }
        return smallest;
    }
}



// import java.util.ArrayList;

// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         String s="zxy";
//         //String a=s;
//         char[] a=s.toCharArray();
//         int[] b=new int[s.length()];
//         StringBuilder c=new StringBuilder();
//         for(int i=0;i<s.length();i++){
//             b[i]=s.charAt(i)-'a';
//         }
//        // System.out.println(Arrays.toString(b));
//        int max=Arrays.stream(b).max().getAsInt();
//        for(int i=0;i<b.length;i++){
//            b[i]=max-b[i];
//         } 
//         int max2=Arrays.stream(b).max().getAsInt();
//         int min=Arrays.stream(b).min().getAsInt();
//         System.out.println(min);
//         System.out.println(max2);
//         for(int i=0;i<b.length;i++){
//             if(b[i]==max2){
//                 a[min]=s.charAt(max2);
//             }
//             else if(b[i]==min){
//                 a[max2]=s.charAt(min);
//             }
//         }
//         System.out.println(a);

    

//        // System.out.println(Arrays.toString(b));
//     }
// }