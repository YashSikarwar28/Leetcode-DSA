class Solution {
    public double myPow(double x, int n) {
        if(n>0){
            return pos(x,n);
        }
        if(n<0){
            return 1/negative(x,-n);
        }
        return 1;
    }
    static double pos(double x,int n){
        if(n==0){
            return 1;
        }
        double half=pos(x,n/2);
        double ans=half*half;
        if(n%2!=0){
            ans=x*ans;
        }
        return ans;
    }
    static double negative(double x,int n){
        if(n==0){
            return 1;
        }
        double half=negative(x,n/2);
        double ans=half*half;
        if(n%2!=0){
            ans=ans*x;
        }
        return ans;
    }
}




// public class prac {
//     public static void main(String[] args) {
//         double x=2.1;
//         int n=3;
//         System.out.println(pos(x,n));        
//     }
//     static double pos(double x,int n){
//         if (n==0) {
//             return 1;
//         }
//         double half=pos(x,n/2);
//         double ans=half*half;
//         if (n%2!=0) {
//             ans*=x;
//         }
//         return ans;
//     }
// }