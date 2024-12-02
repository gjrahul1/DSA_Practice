class LexSort
{
    //Function to return the lexicographically sorted power-set of the string.
    static ArrayList<String> powerSet(String s)
    {
        ArrayList<String> result = new ArrayList<>();
        generateSubSets(0,s,new StringBuilder(),result);
        Collections.sort(result);
        return result;
    }
    
    private static void generateSubSets(int index,String s, StringBuilder current,ArrayList<String> result) {
        if(index == s.length()) {
            result.add(current.toString());
            return;
        }
        
        //Include current Character
        current.append(s.charAt(index));
        generateSubSets(index+1,s,current,result);
        
        //Exculde the current character
        current.deleteCharAt(current.length()-1);
        generateSubSets(index+1,s,current,result);
    }
}
