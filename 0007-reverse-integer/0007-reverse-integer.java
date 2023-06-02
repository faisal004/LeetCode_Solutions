class Solution {
    public int reverse(int x) {
int finalNum=0;
        while(x!=0){
            int lastdigit=x%10;
            x=x/10;
             if (finalNum > Integer.MAX_VALUE/10 || finalNum < Integer.MIN_VALUE/10) return 0;
             finalNum=finalNum*10+lastdigit;
             
             
        }
        
        return  finalNum;
        
    }
}