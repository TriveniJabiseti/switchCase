package monthdays;
import java.util.Scanner;

public class MonthDays {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the month number (1-12): ");
        int month=sc.nextInt();
        int days;
        
        switch(month)
                {
                    case 1: case 3: case 5: case 7:  case 8: case 10: case 12:
                    days=31;
                    System.out.println("Number of days in month " + month + " is " + days);
                    break;
                    case 4: case 6: case 9: case 11:
                    days=30;
                    System.out.println("Number of days in month " + month + " is " + days);
                    break;
                    case 2:
                    days=28;
                    System.out.println("Number of days in month " + month + " is " + days);
                    break;
                    default: System.out.println("Invalid month number: ");
                    break;
                
                }
                
        
    }
    
}
