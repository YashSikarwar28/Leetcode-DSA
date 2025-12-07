//Sieve of Eratosthenes

import java.util.Arrays;

class Solution {
    public int largestPrime(int n) {
        boolean[] prime=new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0]=false;
        prime[1]=false;
        for(int i=2;i*i<=n;i++){
            if(prime[i]){
                for(int j=i*i;j<=n;j+=i){
                    prime[j]=false;
                }
            }
        }
        int sum=0;
        int ans=0;
        for(int i=2;i<=n;i++){
            if(prime[i]){
                sum+=i;
                if(sum>n) break;
                if(prime[sum]) ans=sum;
            }
        }
        return ans;
    }
}


// code is correct but gives TLE error
// import java.util.ArrayList;

// class Solution {
//     public int largestPrime(int n) {
//         ArrayList<Integer> a=new ArrayList<>();
//         if(n==2 || n==3) return 2;
//         for(int i=2;i<=n;i++){
//             boolean isPrime=true;
//             for(int j=2;j*j<=i;j++){
//                 if(i%j==0){
//                     isPrime=false;
//                     break;
//                 }
//             }
//             if(isPrime){
//             a.add(i);
//             }
//         }
//         int ans=0;
//         int sum=0;
//         for(int i:a){
//             sum+=i;
//             if(sum>n) break;
//             boolean isPrime=true;
//             for(int j=2;j*j<=sum;j++){
//                 if(sum%j==0){
//                     isPrime=false;
//                     break;
//                 }
//             }
//             if(isPrime){
//                 ans=Math.max(ans,sum);
//             }
//         }
//         return ans;
//     }
// }