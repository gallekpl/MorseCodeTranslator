import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text;


            while(true) {
                System.out.println("Press 1 for Morse to text. \nPress 2 for text to morse.");
                String input = scanner.nextLine();
                if (input.equals("1")) {
                    System.out.println("Write your morse message.");
                    text = scanner.nextLine();
                    System.out.println(MorseCode.translateToLetters(text));
                } else if (input.equals("2")) {
                    System.out.println("Write your text.");
                    text = scanner.nextLine();
                    System.out.println(MorseCode.translateToMorse(text));
                } else {
                    System.out.println("Wrong input");
                }
            }

    }
}
