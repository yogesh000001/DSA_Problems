package DSA_Problems.String;

import java.util.HashMap;
import java.util.Map;

public class sortingTheSentence {
    public String sortSentence(String s) {
        Map<Integer,String> iwp = new HashMap<>();
        for(String word:s.split(" ")){
            int lastIndex = word.length()-1;
            int index = word.charAt(lastIndex) - '0';
            String actualWord = word.substring(0,lastIndex);
            iwp.put(index,actualWord);
        }
        StringBuilder str = new StringBuilder();
        for(Map.Entry<Integer,String> indexWord : iwp.entrySet()){
            str.append(indexWord.getValue());
            str.append(" ");
        }
        return str.toString().trim();
    }    
    public static void main(String[] args) {
        
    }
}
