public class Main {
    public static void main(String[] args) {
        int[] a = { 2,1};
        int s = 0;
        int e = a.length - 1;
        while (s < e) {
            int m = s + (e - s) / 2;
            if (m>0 && m<a.length) {
                
                if (a[m] > a[m - 1] && a[m] > a[m + 1]) {
                    System.out.println(m);
                    break;
                } else if (a[m] < a[m + 1]) {
                    s = m + 1;
                } else {
                    e = m;
                }
                break;
            }
            else if(m==0){
                if (a[m]>a[m+1]) {
                    System.out.println(a[m]);
                }
                else{
                    System.out.println(a[m+1]);
                }
                break;
            }
        }
    }
}
