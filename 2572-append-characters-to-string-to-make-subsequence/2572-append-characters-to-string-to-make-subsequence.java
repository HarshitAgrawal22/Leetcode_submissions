class Solution {
    public int appendCharacters(String s, String t) {
        int length= t.length();
        int pos = 0;
        for(int i=0;i<s.length();i++){
            if(pos>=t.length()){
                return t.length()-pos;
            }
            if(s.charAt(i)==t.charAt(pos)){
                pos++;
            }
        }
        return length-pos;
    }
}