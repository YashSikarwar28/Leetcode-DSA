class Solution {
    List<String> ans=new ArrayList<>();
    public List<String> generateParenthesis(int n) {
        int open=0;
        int close=0;
        gg(n,"",open,close);
        return ans;
    }
    private void gg(int n,String s,int open,int close){
        if(s.length()==2*n){
            ans.add(s);
            return;
        }
        if(open<n){
            gg(n,s+"(",open+1,close);
        }
        if(close<open){
            gg(n,s+")",open,close+1);
        }
    }
}




//works but not a good approach

// class Solution {
//     List<String> ans;
//     public List<String> generateParenthesis(int n) {
//         ans=new ArrayList<>();
//         check(n,"");
//         return ans;
//     }
//     private void check(int n,String s){
//         if(s.length()==2*n){
//             if(cc(s)){
//                 ans.add(s);
//             }
//             return;
//         }
//         check(n,s+"(");
//         check(n,s+")");
//     }
//     private boolean cc(String s){
//         int count=0;
//         for(char ch:s.toCharArray()){
//             if(ch=='('){
//                 count++;
//             }
//             else{
//                 count--;
//             }
//             if(count<0) return false;
//         }
//         return count==0;
//     }
// }