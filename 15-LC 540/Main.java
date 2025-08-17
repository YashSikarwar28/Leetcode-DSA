public class Main {
    public static void main(String[] args) {
        int[] a = {1,1,2,3,3,4,4,8,8};
        int s = 0;
        int e = a.length-1;
        while (s<e) {
            int m = s+(e-s)/2;
            if (m%2!=0) {
                m--;
            }
            if (a[m]==a[m+1]) {
                e=m+2;
            }
            else{
                s=m;
            }
        }
        System.out.println(a[s]);
    }
}
