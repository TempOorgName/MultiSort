import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner key = new Scanner(System.in);

        int firstAns;
        int secondAns;
        boolean validInput = false;

        System.out.println("== Welcome to MultiSort ==");

        while(!validInput)
        {
            System.out.println("1. Sort numbers");
            System.out.println("2. Sort words");
            System.out.println("3. Sort sentence length");

            try
            {
               firstAns = key.nextInt();
               if(firstAns>0 && firstAns<4)
                   validInput = true;
               else
                   System.out.println("Enter 1, 2, or 3");
            }
            catch(Exception e)
            {
                System.out.println("Invalid input detected enter a number.");
                key.next();
            }
        }



    }
}