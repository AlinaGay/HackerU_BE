package lesson_2.homework_4;

public class AnalyzeString {
    public static String repeatingSymbols(StringBuilder inputString, int quantity) {
        String substring;
        inputString.reverse();

        for (int i = 0; i < inputString.length() - 1; i++) {
            substring = String.valueOf(inputString.charAt(i));

            for (int j = 1; j < quantity; j++) {
                if (inputString.charAt(i) == inputString.charAt(j + i)) {
                    substring += String.valueOf(inputString.charAt(i));
                } else {
                    break;
                }
            }

            if (substring.length() == quantity) {
                return substring;
            }

        }
        return null;
    }

    public static void main(String[] args) {
        System.out.println(repeatingSymbols(new StringBuilder("fhvksjfdjjjjj"),4));
    }
}
