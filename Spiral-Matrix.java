class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int left = 0,right = cols-1,top = 0,bottom = rows-1;
        List<Integer> ans = new ArrayList<Integer>();
 
       while(left <= right && top <= bottom){
     
            for(int i=left;i<=right;i++){
                ans.add(matrix[top][i]);
            }
            top++;

            for(int i=top;i<=bottom;i++){
                ans.add(matrix[i][right]);
            }
            right--;

  
            if(top<=bottom){
                for(int i=right;i>=left;i--){
                    ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
      
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