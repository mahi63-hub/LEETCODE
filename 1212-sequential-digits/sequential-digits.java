class Solution {
    public List<Integer> sequentialDigits(int low, int high) {
        List<Integer> ls= new ArrayList<>();
        for(int i=1;i<10;i++){
            int num=0;
            num+=i;
            for(int j=i+1;j<10;j++){
                num=num*10+j;
                if(num>=low && num<=high){
                    ls.add(num);
                }
            }
        }
        Collections.sort(ls);
        return ls;
    }
}