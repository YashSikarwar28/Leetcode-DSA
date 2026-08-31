//Take 4 pointers on 4 points of matrix left, right, top and bottom, shrink accordingly and put the value in list.
class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> ans=new ArrayList<>();
        int left=0;
        int right=matrix[0].length-1;
        int top=0;
        int bottom=matrix.length-1;
        while(left<=right && top<=bottom){
            //left to right - traversing top layer
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;
            //top to bottom - traversing right layer
            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;
            //right to left - traversing bottom layer
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            //bottom to top - traversing left layer
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
                left++;
            }
        }
        return ans;
    }
}
