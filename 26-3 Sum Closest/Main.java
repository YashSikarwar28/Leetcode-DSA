import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a={-1,2,1,-4};
        Arrays.sort(a);
        int closeSum=a[0]+a[1]+a[2];
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
        
            int l=i+1;
            int r=a.length-1;
            while (l<r) {
                int sum=a[l]+a[r]+a[i];
                int tar=1;
                if (Math.abs(tar-sum)<Math.abs(tar-closeSum)) {
                    closeSum=sum;
                }
                else if(sum<tar){
                    l++;
                }
                else if(sum>tar){
                    r--;
                }
                else{
                    System.out.println(sum);
                }
            }
        }
        System.out.println(closeSum);
    }
}
