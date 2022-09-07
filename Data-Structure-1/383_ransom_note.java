class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        char ransom[]=ransomNote.toCharArray();
        char mag[]=magazine.toCharArray();
        List<Character>  m = new ArrayList<>();
        for(char a : mag){
            m.add(a);
        }
        
        //Checking
        for(int i=0;i<ransom.length;i++){
            if(m.contains(ransom[i])){
                int index=m.indexOf(ransom[i]);
                m.remove(index);
            }else{
                return false;
            }
        }
        
        return true;
    }
}