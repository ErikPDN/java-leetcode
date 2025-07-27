import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class WordCount {
    public static void main(String[] args) {
        System.out.println(countValidWords("Hey! Nice To Meet You"));
    }

    public static int countValidWords(String s) {
        boolean isAlpha, atLeastOneVowel, atLeastOneConsonant;
        int countValidWords = 0;
        String[] words = s.split(" ");
        System.out.println(words);
        for (String word : words) {
            if (word.length() < 3) continue;

            isAlpha = isAlphanumeric(word);
            atLeastOneConsonant = hasAtLeastOneConsonant(word);
            atLeastOneVowel = hasAtLeastOneVowel(word);
            
            if (isAlpha && atLeastOneConsonant && atLeastOneVowel) {
                countValidWords++;
            }
        }
        
        return countValidWords;
    }
    
    private static boolean isAlphanumeric(String word) {
       for (int i = 0; i < word.length(); i++) {
            if (!Character.isLetter(word.charAt(i)) && !Character.isDigit(word.charAt(i))) {
                return false;
            }
       }
       
       return true;
    }
    
    private static boolean hasAtLeastOneVowel(String word) {
        Set<Character> vowels = new HashSet<>();
        vowels.add('a');
        vowels.add('e');
        vowels.add('i');
        vowels.add('o');
        vowels.add('u');
        
        for (int i = 0; i < word.length(); i++) {
            if (vowels.contains(word.charAt(i))) {
                return true;
            }
       }
       
       return false;
    }
    
    private static boolean hasAtLeastOneConsonant(String word) {
        Set<Character> consonants = new HashSet<>(Arrays.asList('b', 'c', 'd', 'f', 'g', 'h', 'j', 'k',
        'l', 'm', 'n', 'p', 'q', 'r', 's', 't', 'v', 'w', 'x', 'y', 'z'));
        
        for (int i = 0; i < word.length(); i++) {
            if (consonants.contains(word.charAt(i))) {
                return true;
            }
       }
       
       return false;
        
    }
}
