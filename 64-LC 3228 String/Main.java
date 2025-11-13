public class Main {
    public static void main(String[] args) {
        String s="00111";
        int ans=0;
        int one=0;
        int i=1;
        if(s.charAt(0)=='1') one++;
        while (i<s.length()) {
            if (s.charAt(i)=='1') {
                one++;
            }
            if (s.charAt(i)=='0' && s.charAt(i-1)=='1') {
                ans+=one;
            }
            i++;
        }
        System.out.println(ans);
    }
}
