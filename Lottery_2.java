import java.util.Random;
import java.util.Scanner;

public class Lottery_2
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
            int max = 21;
            int min = 10;
            int reversed = 0;
            // your input number 
            System.out.print("Input your 1st number (10-99): ");
            first_n = sc.nextInt();
            second_n = first_n;
            System.out.println("Your input number is: " + first_n);
            
            
            // create instance of Random class
            int ran_1 = ran.nextInt(max);
            System.out.println("The winning number is: " + ran_1);
            
            // checking whether you win or not 
            if (ran_1 == first_n){
                System.out.println("Congratuation you win 10.000$");
            }
            
            while(second_n != 0) {
                int digit = second_n % 10;
                reversed = reversed * 10 + digit;
                second_n /= 10;
                
                if (reversed == ran_1){
                System.out.println("Congratuation you win 5.000$");
                }
            }
            
            
            int hc_num, hc_ran, hdv_num, hdv_ran = 0;
            hc_num = (first_n % 100) / 10;
            hc_ran = (ran_1 % 100) / 10;
            hdv_num = (first_n % 100) % 10;
            hdv_ran = (ran_1 % 100) % 10;
            
            if (hc_num == hc_ran || hc_num == hdv_ran || hdv_num == hc_ran || hdv_num == hdv_ran){
                System.out.println("Congratuation you win 2.000$");
                }
            else{
                System.out.println("Better luck next-times !! ");
            }
        }
    }
}