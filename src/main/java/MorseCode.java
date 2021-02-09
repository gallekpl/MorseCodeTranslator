import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public final class MorseCode {
    private static final String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---",
            "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...",
            "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".-.-", "-.-..",
            "..-..", ".-..-", "--.--", "---.", "...-...", "--..-.", "--..-"};
    private static final String[] letters = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L",
                                       "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z",
                                       "Ą", "Ć", "Ę", "Ł", "Ń", "Ó", "Ś", "Ż", "Ź"};
    private static final List<String> morseList = Arrays.asList(morse.clone());
    private static final List<String> lettersList = Arrays.asList(letters.clone());


    private static String findMorseLetter(String letter) {
        String morseLetter;
        if (!lettersList.contains(letter.toUpperCase())) {
            morseLetter = " ";
        } else morseLetter = morseList.get(lettersList.indexOf(letter.toUpperCase()));
        return morseLetter;
    }

    private static String findLetter(String morseLetter) {
        String letter;
        if (!morseList.contains(morseLetter)) {
            letter = "";
        } else letter = lettersList.get(morseList.indexOf(morseLetter));
        return letter;
    }

    public static String translateToMorse(String text) {
        text = text.strip();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        String ch;
        while (i < text.toCharArray().length){
            ch = Character.toString(text.charAt(i));
            sb.append(findMorseLetter(ch)).append(" ");
            i++;
        }
        return sb.toString();
    }

    public static String translateToLetters(String morse) {
        morse = morse.strip();
        StringBuilder sb = new StringBuilder();
        String[] words = morse.split(" {3}"); //Text split into words
        String[][] arrayOfLetterArrays = new String[words.length][];

        for (int j = 0; j < words.length; j++) { //Words split into letters
            arrayOfLetterArrays[j] = words[j].split(" ");
            for (int i = 0; i < arrayOfLetterArrays[j].length; i++) {
                sb.append(findLetter(arrayOfLetterArrays[j][i]));
            }
            if (j!=words.length-1) sb.append(" ");
        }
        return sb.toString();
    }

}
