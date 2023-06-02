class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result= new ArrayList<>();
        if(strs==null||strs.length==0){
            return result;
        }
        if (strs.length == 1) {
            result.add(Arrays.asList(strs));
            return result;
        }
        HashMap<String,List<String>> group= new HashMap<>();
        for(String str:strs){
            char[] chr= str.toCharArray();
            Arrays.sort(chr);
            String Sortedstring= new String(chr);
            if(group.containsKey(Sortedstring)){
                group.get(Sortedstring).add(str);
            }else{
                 List<String> newList= new ArrayList<>();
                newList.add(str);
                group.put(Sortedstring,newList);

            }
               
            

        }
        result.addAll(group.values());
        return result;
    }
   
}