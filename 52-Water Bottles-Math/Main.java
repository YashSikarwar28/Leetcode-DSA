class Solution {
    public int numWaterBottles(int b, int e) {
        int drink = b;
        int bottle = b;

        while (bottle >= e) {
            int d = bottle / e;      // How many new full bottles
            drink += d;              // Drink those bottles
            int remain = bottle % e; // Leftover empty bottles
            bottle = d + remain;     // New total empty bottles
        }

        return drink;
    }
}


// public class Main {
//     public static void main(String[] args) {
//         int b=25;
//         int e=4;
//         int d=b/e;
//         int bottle=0;
//         int remaning=b%e;
//         System.out.println(d);
//         int drink=0;
//         drink+=b+d;
//         bottle+=d+remaning;
//         if (bottle/e>0) {
//             int a=bottle/e;
//             bottle-=bottle%e;
//             drink+=a;
//         }
//         System.out.println(drink);
//         System.out.println(bottle);
//     }
// }
