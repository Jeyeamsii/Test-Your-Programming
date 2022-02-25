package TestYourJavaProgramming;

public class FindingTheFirstNonrepeatedCharacter {

    public static void main(String args[]) {
     
        String inputStr ="Jeanahmae";
        
       //Converts the given string into character array 

        for(char i :inputStr.toCharArray()){
        if ( inputStr.indexOf(i) == inputStr.lastIndexOf(i)) {
            System.out.println("First non-repeating character is: "+i);
            break;
        }
        }
    }
}
