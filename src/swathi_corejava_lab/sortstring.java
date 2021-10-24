package swathi_corejava_lab;

import java.util.Arrays;
import java.util.Scanner;
public class sortstring {
	
	    public static void main(String[] args) {
	        
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.println("Enter a string : ");
	        String userInput = scanner.nextLine();

	        
	        char[] CharArray = userInput.toCharArray();


	        
	        for (int i = 0; i < CharArray.length; i++) {
	        System.out.println("-");
	       
	        	int CharArraylength;
				for (int j = i + 1; j < CharArray.length; j++) {
	                if (Character.toLowerCase(CharArray[j]) < Character.toLowerCase(CharArray[i])) {
	                    swapChars(i, j, CharArray);
	                }
	            }
	        }

	        
	        System.out.println("Sorted string " + String.valueOf(CharArray));
	    }

	    
	    private static void swapChars(int i, int j, char[] CharArray) {
	        char temp = CharArray[i];
	        CharArray[i] = CharArray[j];
	        CharArray[j] = temp;
	    }
	


  
}

