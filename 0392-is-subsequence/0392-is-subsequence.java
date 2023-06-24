class Solution {
    public boolean isSubsequence(String s, String t) {
        int a=0;
        int b=0;

        for(int i=0;i<t.length();i++){
            if(a<s.length()){
                  if(s.charAt(a)==t.charAt(b)){
                a++;
                b++;
            }
            else{
                b++;
            }

            }
          

        }
        if(a==s.length()){
            return true;
        }
        return false;
        
    }
}