import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if(ch >= 'A' && ch <= 'Z'){
            ch = (char) (ch+32);
        }
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        char ch = ' ';
		String str1 = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
				ch = (char) (str.charAt(i)+32);
				str1 = str1 + ch;
			}else {
				str1 = str1 + str.charAt(i);
			}
			
		}
        return str1;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if(ch >= 'a' && ch <= 'z'){
            ch = (char) (ch-32);
        }
        return ch;
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        char ch = ' ';
		String str1 = "";
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
				ch = (char) (str.charAt(i)-32);
				str1 = str1 + ch;
			}else {
				str1 = str1 + str.charAt(i);
			}
			
		}
        return str1;
    }       

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a String");
        String str = scan.nextLine();
        System.out.println("What would you like to make your string lowercase or uppercase?");
        String ul = scan.nextLine();
        if(ul.equals("lowercase")){
            System.out.println("Here is your string in lowercase " + myToLowerCase(str));
        }else if(ul.equals("uppercase")){
            System.out.println("Here is your string in uppercase " + myToUpperCase(str));
        }
    }
}
