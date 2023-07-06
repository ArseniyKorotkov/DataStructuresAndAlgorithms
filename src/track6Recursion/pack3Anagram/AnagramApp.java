package track6Recursion.pack3Anagram;

public class AnagramApp {

    public static void main(String[] args) {
        Anagram anagram = new Anagram();
        StringBuilder word = new StringBuilder("abc");
//        anagram.doAnagram(word.length(), word);
        System.out.println(anagram.doAnagram(word.length(), word));
    }
}
