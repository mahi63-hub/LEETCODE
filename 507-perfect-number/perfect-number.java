class Solution {
    public boolean checkPerfectNumber(int num) {
        if(num==1){
            return false;
        }
        int sum=1;
        Set<Integer> set=new HashSet<>();
        for(int i=2;i<=(num/2);i++){
            if(num%i==0){
                if(!set.contains(i)){
                    sum+=i;
                    set.add(i);
                }
                if(!set.contains(num/i)){
                    sum+=num/i;
                    set.add(num/i);
                }
            }
        }
        return num==sum;
    }
}