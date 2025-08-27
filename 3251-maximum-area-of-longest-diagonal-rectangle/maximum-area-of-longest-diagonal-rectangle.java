class Solution {
    public int areaOfMaxDiagonal(int[][] dimensions) {
        double sum=0;
        int area=0;
        for(int i=0;i<dimensions.length;i++){
            int first=dimensions[i][0];
            int second=dimensions[i][1];
            double su=Math.sqrt(Math.pow(first,2)+Math.pow(second,2));
            if(su>sum){
                sum=su;
                area=first*second;
            }else if(su==sum){
                area=Math.max(area,first*second);
            }
        }
        return area;
    }
}