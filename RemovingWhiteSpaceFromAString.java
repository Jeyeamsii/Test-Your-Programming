package TestYourJavaProgramming;

public class RemovingWhiteSpaceFromAString {

public static void main(String[] args) {  
        String str = "Jeanahmae   Gacias   Carezo";  

        String noSpaceStr = str.replaceAll("\\s", ""); // using built in method  
        System.out.println(noSpaceStr);  

}}