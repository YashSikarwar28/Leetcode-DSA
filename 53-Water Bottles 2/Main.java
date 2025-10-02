class Solution {
    public int maxBottlesDrunk(int bottles, int exchange) {
        int c=0;
        int diff=bottles;
        while(diff>=exchange){
            diff-=exchange;
            c++;
            exchange++;
            diff+=1;
        }
        return bottles+c;
    }
}



// public class Main {
//     public static void main(String[] args) {
//         int bottles=13;
//         int exchange=6;
//         int c=0;
//         int diff=bottles-exchange;
//         while (bottles>exchange && diff>-1) {
//          if (diff<exchange) {
//             diff+=c;
//             diff-=exchange;
//             exchange++;
//             c++;
//          }
//          else{
//             diff-=exchange;
//             exchange++;
//             c++;
//          }
         
//         }
//         System.out.println(c+bottles);
//     }
// }
