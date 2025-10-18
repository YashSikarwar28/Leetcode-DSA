class Solution {
    public boolean increasingTriplet(int[] a) {
        int b=Integer.MAX_VALUE;
        int c=Integer.MAX_VALUE;
        for(int i=0;i<a.length;i++){
        int d=a[i];
            if(d<=b){
                b=d;
            }
            else if(d<=c){
                c=d;
            }
            else{
                return true;
            }
        }
        return false;
    }
}

// class Solution {
//     public boolean increasingTriplet(int[] a) {
//         for(int i=0;i<a.length;i++){
//             int j=i+1;
//             int k=j+1;
//             while(j<a.length && k<a.length){
//                 if(a[i]<a[j] && a[j]<a[k]){
//                     return true;
//                 }
//                 else if(a[i]>a[j]){
//                     j++;
//                 }
//                 else{
//                     k++;
//                 }
//             }
//         }
//         return false;
//     }
// }