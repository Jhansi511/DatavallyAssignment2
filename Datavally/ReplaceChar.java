import java.util.Scanner;

public class ReplaceChar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Input index
        System.out.print("Enter the index to replace: ");
        int index = scanner.nextInt();
        
        // Input character to replace
        System.out.print("Enter the character to replace with: ");
        char replacementChar = scanner.next().charAt(0);
        
        // Perform replacement
        String resultString = replaceCharacterAtIndex(inputString, index, replacementChar);
        
        // Output result
        System.out.println("Resulting string after replacement: " + resultString);
        
        scanner.close();
    }
    
    public static String replaceCharacterAtIndex(String input, int index, char replacement) {
        if (index < 0 || index >= input.length()) {
            // Index out of bounds
            System.out.println("Index out of bounds!");
            return input;
        }
        
        // Construct new string with replaced character
        char[] chars = input.toCharArray();
        chars[index] = replacement;
        return new String(chars);
    }
}