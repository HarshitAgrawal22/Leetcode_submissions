
class Solution {
    public int firstUniqChar(String s) {
       
      return  firstUniqueChar(s);
    }

    public int firstUniqueChar(String s){

        int[] charCount = new int[26];

        for(int i =0; i< s.length(); i++){
            char c = s.charAt(i);

            charCount[ c - 'a']++;

        }

        for(int i = 0; i< s.length(); i++){

            if(charCount[s.charAt(i) - 'a' ]==1){
                return i;
            }
        }
        return -1;
    } 
}