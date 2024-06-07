class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        String words[] = sentence.split(" ");
        Set<String> s= new HashSet<>(dictionary);
        StringBuilder res= new StringBuilder();
        for (int i =0; i< words.length;i++){
            int j=0;

            while(j<=  words[i].length()){

                String curr= words[i].substring(0,j++);
                if(s.contains(curr)){
                    res.append(curr).append(" ");
                    break;
                }
                if(j==(words[i].length() +1)){
                    res.append(words[i]).append(" ");
                }
            }
        }
        res.deleteCharAt(res.length() - 1); 
        return res.toString();
    }
}