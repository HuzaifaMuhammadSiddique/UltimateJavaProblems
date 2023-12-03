import java.util.Scanner;

public class CharFrequencyInString {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = input.nextLine();
        
        char[] allChars = new char[26];
        int[] charCount = new int[26];
        int startLetter = 'a';
        
        // fills allChars with chars from 'a' to 'z'
        for(int i = 0; i < allChars.length; i++){
            allChars[i] = (char) (i + startLetter);
        }
        
        for(int charNumber = 0; charNumber < allChars.length; charNumber++){
            char currentLetter = allChars[charNumber];
            for(int n=0;n<str.length();n++){
                if(str.charAt(n) == currentLetter){
                    charCount[charNumber]++;
                }
            }
        }
        
        for(int j=0;j<allChars.length;j++){
            System.out.println(allChars[j] + " : " + charCount[j]);
        }
        
        
    }
    
}
