
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test {


    @org.junit.jupiter.api.Test
    @DisplayName("Testing MorseCode.findLetter().")
    public void testFindLetter() {
    assertEquals(MorseCode.findLetter("...."), "H");
    assertEquals(MorseCode.findLetter("...-..."), "Ś");
    assertEquals(MorseCode.findLetter("..."), "S");
    assertEquals(MorseCode.findLetter("---"), "O");
}

    @org.junit.jupiter.api.Test
    @DisplayName("Testing MorseCode.findMorseLetter().")
    public void testFindMorseLetter() {
        assertEquals(MorseCode.findMorseLetter("H"), "....");
        assertEquals(MorseCode.findMorseLetter("Ś"), "...-...");
        assertEquals(MorseCode.findMorseLetter("S"), "...");
        assertEquals(MorseCode.findMorseLetter("O"), "---");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing MorseCode.translateToMorse().")
    public void testTranslateToMorse() {
        assertEquals(MorseCode.translateToMorse("i dont like bananas"), "..   -.. --- -. -   .-.. .. -.- .   -... .- -. .- -. .- ...");
        assertEquals(MorseCode.translateToMorse("good morning"), "--. --- --- -..   -- --- .-. -. .. -. --.");
        assertEquals(MorseCode.translateToMorse("+-/?!@();:'\".,"), ".-.-. -....- -..-. ..--.. -.-.-- .--.-. -.--. -.--.- -.-.-. ---... .----. .-..-. .-.-.- --..--");
    }

    @org.junit.jupiter.api.Test
    @DisplayName("Testing MorseCode.translateToLetters().")
    public void testTranslateToLetters() {
        assertEquals(MorseCode.translateToLetters( "..   -.. --- -. -   .-.. .. -.- .   -... .- -. .- -. .- ..."), "i dont like bananas".toUpperCase());
        assertEquals(MorseCode.translateToLetters("--. --- --- -..   -- --- .-. -. .. -. --."), "good morning".toUpperCase());
    }
}
