import java.util.Scanner;

public class PastDay {
    public static void main(String[] args) {
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter today's day number (0-6 where 0=Sunday): ");
        int today = scanner.nextInt();
        
        System.out.print("Enter number of days before today: ");
        int daysBefore = scanner.nextInt();
        
        // Handle negative modulo for past days
        int pastDay = (today - daysBefore % 7 + 7) % 7;
        
        System.out.println("Today is: " + days[today]);
        System.out.println(daysBefore + " days ago, it was: " + days[pastDay]);
        
        scanner.close();
    }
}