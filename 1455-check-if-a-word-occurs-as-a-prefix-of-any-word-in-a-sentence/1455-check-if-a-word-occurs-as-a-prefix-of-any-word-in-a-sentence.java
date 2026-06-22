class Solution {
    public int isPrefixOfWord(String sentence, String searchWord) {
     String[] cleanWords = sentence.split("[,.!\\s]+");
     for(int i = 0;i<cleanWords.length;i++){
        if(cleanWords[i].startsWith(searchWord)){
            return i+1;
        }
     }   
     return -1;
    }
}