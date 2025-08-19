class Solution {
    public int addDigits(int num) {
        if(num<10){
            return num;
        }
        
        int res=su(num);
        while(res>=10){
            num=res;
            res=su(num);
        }
        return res;
    }

    public int su(int num){
        int su=0;
        while(num>0){
            su+=num%10;
            num=num/10;
        }
        return su;
    }
}