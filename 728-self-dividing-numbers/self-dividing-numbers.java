class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        ArrayList<Integer> list=new ArrayList<>();

        for(int i=left;i<=right;i++){
            if(SelfDividingNumber(i)){
                list.add(i);
            }
        }
        return list;
    }

    public boolean SelfDividingNumber(int num){
        int org=num;
        while(num>0){
            int rem=num%10;
            if(rem==0 || org%rem!=0){
                return false;
            }
            num=num/10;
        }
        return true;
    }
}