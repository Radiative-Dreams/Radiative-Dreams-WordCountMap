
import java.util.HashMap;
import java.util.Map;
public class WordCountMap {
    /**
     * Receive a string of multiple words.
     * Return a Map object where the key is a word and the value is the count of occurrences of the word.
     *
     * You will need to instantiate a map, use the split(" ") on words, and iterate through the resulting array.
     * Inside of the resulting for loop, you should insert a new key to the map every time you encounter a word that
     * is not already a key in the map, and add to the word's count value every time you encounter a word that already
     * exists in the map.
     *
     * @param words A string of Words separated by spaces.
     * @return a Map (key/value pairs) of all the words mapped to their number of occurrences.
     */
    public Map<String, Integer> returnWordMap(String words){
        String[] wordArr = words.split(" ");
        HashMap<String, Integer> wordMap = new HashMap<>();
        for(int i = 0; i< wordArr.length; i++)
        {
            if(wordMap.containsKey(wordArr[i]))
            {
                // we want to increment the key
                wordMap.put( wordArr[i], wordMap.get(wordArr[i]) + 1 );
            }
            else
            {
                wordMap.put( wordArr[i], 1);
            }
        }
        return wordMap;
    }
}
