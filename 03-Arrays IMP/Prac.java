class Solution {
    public int minimumPairRemoval(int[] a) {
        int count=0;
        List<Integer> b=new ArrayList<>();
        for(int i:a){
            b.add(i);
        }
        while(!check(b)){
            int max=Integer.MAX_VALUE;
            int ind=0;
            for(int i=1;i<b.size();i++){
                int sum=b.get(i-1)+b.get(i);
                if(sum<max){
                    max=sum;
                    ind=i;
                }
            }
            b.remove(ind);
            b.set(ind-1,max);
            count++;
        }
        return count;
    }
    public static boolean check(List<Integer> b){
        for(int i=1;i<b.size();i++){
            if(b.get(i)<b.get(i-1)){
                return false;
            }
        }
        return true;
    }
}


// int max=Integer.MAX_VALUE;
// int maxI=Integer.MAX_VALUE;
// int maxj=Integer.MAX_VALUE;
// while (j<a.length) {
//     int sum=a[i]+a[j];
//     if(sum<max || (i<maxI && j<maxj)){
//         max=sum;
//         maxI=i;
//         maxj=j;
//     }
//     i++;
//     j++;
    
// }
//     System.out.println(b);
// System.out.println(max);
// System.out.println(maxI);
// System.out.println(maxj);