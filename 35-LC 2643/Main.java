class Solution {
    public int[] rowAndMaximumOnes(int[][] a) {
        int maxOne=0;
        int index=0;
        for(int i=0;i<a.length;i++){
            int c=0;
            for(int j=0;j<a[i].length;j++){
                if(a[i][j]==1){
                    c++;
                }
                if(c>maxOne){
                    maxOne=c;
                    index=i;
                }
            }
        }
        return new int[]{index,maxOne};
    }
}