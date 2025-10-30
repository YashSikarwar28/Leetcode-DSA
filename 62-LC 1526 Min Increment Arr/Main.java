import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a={3,1,5,4,2};
        int[] b=new int[a.length];
        int k=0;
        while (!Arrays.equals(a,b)) {
            for (int i = 0; i < a.length; i++) {
                if (b[i]<a[i]) {
                    b[i]+=1;
                }
            }
            k++;
        }
        System.out.println(k);
    }
}



// import java.util.Arrays;

// public class Main {
//     public static void main(String[] args) {
//         int[] a={1,2,3,2,1};
//         int[] b=new int[a.length];
//         int ans=0;
//         int k=0;
//         for(int i=0;i<a.length;i++){
//             if(a[i]!=b[i]){
//                 k=increase(a, b, k);
//             }
//         }
//         System.out.println(Arrays.toString(b));
//         System.out.println(k);
//     }
//     static int increase(int[] a,int[] b,int k){
//         for (int i = 0; i < a.length; i++) {
//             b[i]=a[i]+1;
//             if (i==a.length-1) {
//                 k++;
//             }
//         }
//         return k;
//     }
// }



// public class Main {
//     public static void main(String[] args) {
//         int[] a={3,1,1,2};
//         int[] b=new int[a.length];
//         int k=0;
//         for(int i=0;i<b.length;i++){
//             if (a[i]==b[i]) {
//                 continue;
//             }
//             for(int j=0;j<b.length;j++){
//                 if (a[j]!=b[j]) {
//                     b[j]+=1;
//                 }
//             }
//             k++;
//         }
//         System.out.println(k);
//     }
// }