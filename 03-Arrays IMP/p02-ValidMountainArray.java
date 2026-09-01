//Keep 2 boolean variable as false for increasing and decreasing part if the array increase make it true and if it decrease make it true the decreasing one. In the end check both are true.
class Solution {
    public boolean validMountainArray(int[] a) {
        if (a.length < 3) return false;

        int i = 0;
        int j = 1;
        boolean decreased = false;
        boolean increased = false;

        while (j < a.length) {
          boolean decrease = false;
          //increasing part
            if (a[i] < a[j]) {
                i++;
                j++;
                increased=true;
                continue;
            }
            if (a[i] == a[j]) {
                return false;
            }
            if (a[j] < a[i]) {
                decrease = true;
                decreased = true;

                while (decrease && j < a.length) {
                    if (a[j] >= a[i]) {
                        return false;
                    }
                    i++;
                    j++;
                }
            }
        }

        return decreased && increased && j == a.length;
    }
}

//This is my approach was able to pass 90% of test case the mistake which i did was that I was only checking the decreasing part whether it exists or not but i should also check the increasing part as well.
 if(a.length<3) return false;
        int i=0;
        int j=1;
        while(j<a.length){
            boolean decrease=false;
            if(a[i]<a[j]){
                i++;
                j++;
                continue;
            }
            if(a[i]==a[j]) return false;
            if(a[j]<a[i]){
                decrease=true;
                while(decrease && j<a.length){
                    if(a[j]>=a[i]) return false;
                    j++;
                    i++;
                }
            }
        }
        return true;
    }
}
