class Solution {
    public boolean isPalindrome(String s) {
       if(s.isEmpty()){
           return true;
       }
       int start=0;
       int last=s.length()-1;
       while(start<=last){
           char currFir=s.charAt(start);
           char currlast=s.charAt(last);
           if(!Character.isLetterOrDigit(currFir)){
               start++;
           }else if(!Character.isLetterOrDigit(currlast)){
               last--;
           }
           else{
               if(Character.toLowerCase(currFir)!=Character.toLowerCase(currlast)){
                   return false;
               }
               start++;
               last--;
           }
       }
        
       
        
        return true; 
    }
}
