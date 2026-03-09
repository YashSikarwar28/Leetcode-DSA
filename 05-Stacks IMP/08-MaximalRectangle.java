public class MaximalRectangle {
    public static void main(String[] args) {
        char[][] ch={
            {'1','0','1','0','0'},
            {'1','0','1','1','1'},
            {'1','1','1','1','1'},
            {'1','0','0','1','0'}
        };
        int max=0;
        int m=ch.length;
        int n=ch[0].length;
        int[][] pre=new int[m][n];
        for(int j=0;j<n;j++){
            int sum=0;
            for(int i=0;i<m;i++){
                int a=ch[i][j]-'0';
                sum+=a;
                if (a==0) {
                    sum=0;
                }
                pre[i][j]=sum;
            }
        }
        for(int i=0;i<pre.length;i++){
            max=Math.max(max,pre[i]);
        }

    }
}
