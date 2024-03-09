import java.util.Random;
import java.util.*;

public class NumberGame {

    public static void main(String[] args){

        Random randomNum=new Random();
        Scanner scan=new Scanner(System.in);

        System.out.println("Start generating a number between 1 and 100\n ");
        int number1=randomNum.nextInt(100);

        int number2;

        System.out.println("The generated number is: "+number1);
        System.out.println("You only have 3 attempts to guess the correct number.\n ");

        int nbofattempts=0;
        int score=0;
        int i=3;

            do {

                System.out.println("Enter your guess number: ");
                number2 = scan.nextInt();

                if (number2 == number1) {
                    System.out.println("Your guess is correct.\nYou won.\n ");
                    score += 10;
                    break;
                }

                else if (number2 > number1) {

                    if(i>1)
                    System.out.println("Your guess is too high.\nTry again.\n");
                    nbofattempts++;
                    i--;

                    if(i==0) {
                        System.out.println("You Lost.\n");
                        System.out.println("Better luck next time.\n");
                        break;
                    }
                    if(i!=1&&i!=0)
                        System.out.println("You still have "+ i + " attempts\n");

                    if(i==1)
                    System.out.println("This is your last attempt");

                }

                else if (number2 < number1) {
                    if(i>1)
                        System.out.println("Your guess is too low.\nTry again.\n");
                    nbofattempts++;
                    i--;

                    if(i==0) {
                        System.out.println("You Lost.\n");
                        System.out.println("Better luck next time.\n");
                        break;
                    }
                    if(i!=1&&i!=0)
                        System.out.println("You still have "+ i + " attempts\n");

                    if(i==1)
                        System.out.println("This is your last attempt");
                }
            } while ( nbofattempts < 3);

            String ans;

            System.out.println("Your current score is: "+score);
            System.out.println("Do you want to play again?\n Enter Y/N\n");

            scan.nextLine();

            ans=scan.nextLine();

            if(Objects.equals(ans, "Y") || Objects.equals(ans, "y"))
            {
                System.out.println("Let's begin round 2.\nSame rules as before.");

                number1=randomNum.nextInt(100);
                System.out.println("The generated number is: "+number1);

                do {

                    System.out.println("Enter your guess number: ");
                    number2 = scan.nextInt();

                    if (number2 == number1) {
                        System.out.println("Your guess is correct.\nYou won.\n ");
                        score += 10;
                        break;
                    }

                    else if (number2 > number1) {

                        if(i>1)
                            System.out.println("Your guess is too high.\nTry again.\n");
                        nbofattempts++;
                        i--;

                        if(i==0) {
                            System.out.println("You Lost.\n");
                            System.out.println("Better luck next time.\n");
                            break;
                        }
                        if(i!=1&&i!=0)
                            System.out.println("You still have "+ i + " attempts\n");

                        if(i==1)
                            System.out.println("This is your last attempt");

                    }

                    else if (number2 < number1) {
                        if(i>1)
                            System.out.println("Your guess is too low.\nTry again.\n");
                        nbofattempts++;
                        i--;

                        if(i==0) {
                            System.out.println("You Lost.\n");
                            System.out.println("Better luck next time.\n");
                            break;
                        }
                        if(i!=1&&i!=0)
                            System.out.println("You still have "+ i + " attempts\n");

                        if(i==1)
                            System.out.println("This is your last attempt");
                    }
                } while ( nbofattempts < 3);

            }
            else if(Objects.equals(ans, "N") || Objects.equals(ans, "n"))
                System.out.println("Thanks for playing.\n");
            System.out.println("You final score is: "+score);
    }
}
