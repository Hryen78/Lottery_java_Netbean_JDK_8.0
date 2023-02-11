import java.util.Random;
import java.util.Scanner;
public class Lottery
{
    public static void main(String[] args) {
        Random ran = new Random();
        Scanner sc = new Scanner(System.in);
        int option, first_n, second_n;
        System.out.println("Welcome to the lottery!!!");
        
        while(true){
            System.out.println("Do you want to play: 1-Yes  2-No");
            option = sc.nextInt();
            if (option ==  2){
                break;
            }
            // range 
            int max = 9;
            int min = 1;
            
            // your input number 
            System.out.println("Input your 1st number (1-9): ");
            first_n = sc.nextInt();
            System.out.println("Input your 2nd number (1-9): ");
            second_n = sc.nextInt();
            System.out.println("Your input number is: " + first_n + second_n);
            // create instance of Random class
            int ran_1 = min + ran.nextInt(max);
            int ran_2 = min + ran.nextInt(max);
            System.out.println("The winning number is: ");
            System.out.println(ran_1);
            System.out.println(ran_2);
            
            // checking whether you win or not 
            if (ran_1 == first_n && ran_2 == second_n){
                System.out.println("Congratuation you win 10.000$");
            }
            else if (ran_1 == second_n && ran_2 == first_n){
                System.out.println("Congratuation you win 5.000$");
            }
            else if (ran_1 == first_n || ran_2 == second_n){
                System.out.println("Congratuation you win 2.000$");
            }
            else{
                System.out.println("Better luck next-times !! ");
            }
        }
    }
}