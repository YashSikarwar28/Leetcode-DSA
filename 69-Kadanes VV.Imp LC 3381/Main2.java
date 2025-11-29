import java.util.Arrays;

public class Main2 {
    public static void main(String[] args) {
        long[] a={-5,1,2,-3,4};
        int k=2;
        long[] b=new long[a.length];
        b[0]=a[0];
        for(int i=1;i<a.length;i++){
            b[i]=b[i-1]+a[i];   
        }
        System.out.println(Arrays.toString(b));
        long result=Long.MIN_VALUE; 
        for(int i=0;i<k;i++){
            long sum=0;
            int j=i;
            while (j<a.length && j+k-1<a.length) {
                int l=j+k-1;
                long subsum=b[l] - ((j>0) ? b[j-1]:0);
                sum=Math.max(subsum, subsum+sum);

                result=Math.max(result,sum);

                j+=k;
            }
        }
        System.out.println(result);
    }
}

