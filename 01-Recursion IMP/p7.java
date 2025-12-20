//Permutation - String
import java.util.ArrayList;

public class p7 {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println(permu("", s));
    }

    static ArrayList<String> permu(String a,String b){
        if (b.isEmpty()) {
            ArrayList<String> ans=new ArrayList<>(); 
            ans.add(a);
            return ans;
        }
        char ch=b.charAt(0);
        ArrayList<String> main=new ArrayList<>();
        for(int i=0;i<=a.length();i++){
            String f=a.substring(0, i);
            String l=a.substring(i,a.length());
            main.addAll(permu(f+ch+l, b.substring(1)));
        }
        return main;
    }
}


