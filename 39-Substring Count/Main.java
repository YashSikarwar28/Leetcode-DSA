public class Main {

    public static void main(String[] args) {
        String str="ababc";
        String wrd="ab";
        System.out.println(str.substring(0,str.length()));
        int maxC=0;
        int wrdlen=wrd.length();
        int strlen=str.length();
        
        for (int i = 0; i <= strlen-wrdlen; i++) {
            int start=i;
            int c=0;
            while (start+wrdlen<=strlen && str.substring(start,start+wrdlen).equals(wrd)) {
                c++;
                start+=wrdlen;  
            }
            maxC=Math.max(maxC, c);
        }
        System.out.println(maxC);
    }
}