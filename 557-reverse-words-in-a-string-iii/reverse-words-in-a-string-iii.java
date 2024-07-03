class Solution {
    public String reverseWords(String s) {
       String arr[] = s.split(" ");
       
       for( int i = 0; i< arr.length; i++){
        arr[i] = reverseWord(arr[i]);
       }

        

       return String.join(" ",arr );    
    }

    String reverseWord(String str){
        String nstr = "";

        for(int i = str.length()-1; i>=0 ; i--){
            nstr+=str.charAt(i);
        }
        return nstr;
    }
}