package track6Recursion.pack3Anagram;

public class Anagram {

    private static int counter;

    public String doAnagram(int size, StringBuilder word) {
//        String partOfWord = word.substring(word.length() - size);
//
//        do {
//            if (size > 2) {
//                doAnagram(size - 1, word);
//            }
//
//            if((!partOfWord.equals(word.substring(word.length() - size)))) {
//                counter++;
//                System.out.println(counter + " " + word);
//            }
//
//            turnLeft(word, size);
//
//        } while ((!partOfWord.equals(word.substring(word.length() - size))));

        for (int i = 1; i < size + 1; i++) {
            String answer = doAnagram(size - 1, word);

            if (i != 1)
                System.out.println(answer);

            turnLeft(word, size);
        }

        return word.toString();
    }

    private void turnLeft(StringBuilder builder, int size) {
        builder.append(builder.charAt(builder.length() - size));
        builder.deleteCharAt(builder.length() - 1 - size);
    }
}
