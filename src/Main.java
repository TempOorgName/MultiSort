import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in); //SCANNER IS KEY

        int firstAns; //WHAT TO SORT

        boolean validInput = false; //WONT BREAK UNTIL USER PICKS OPTION

        System.out.println("== Welcome to MultiSort ==");
        System.out.println("Enter an option below");

        while(!validInput)
        {
            System.out.println("");
            System.out.println("1. Sort numbers"); //ASKS FOR DECIMAL(DOUBLE) OR WHOLE NUMBER(INT)
            System.out.println("2. Sort words"); //SORTS WORDS BY FIRST LETTER
            System.out.println("3. Sort sentence length"); //SORTS SENTENCES USING CHARACTERS
            System.out.println(""); //SPACE SO WONT BE CLUTTERED

            try //Won't crash when user puts anything other than the options
            {
               firstAns = key.nextInt();
               System.out.println(""); //SPACE SO WONT BE CLUTTERED

               if(firstAns>0 && firstAns<4)
                   validInput = true;
               else
                   System.out.println("Enter 1, 2, or 3");
            }
            catch(Exception e)
            {
                System.out.println(""); //SPACE SO WONT BE CLUTTERED
                System.out.println("Invalid input detected enter a number.");
                key.next();
            }
        }



    }
}