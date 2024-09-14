import java.util.Scanner;

public class AssignmentNo2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter the hours worked: ");
        int hoursWorked = sc.nextInt();
        System.out.println("Enter the hours wage: ");
        double hoursWage = sc.nextDouble();

        double basicSalary = hoursWage * hoursWorked;
        double bonus = 0.1 * basicSalary;
        double totalSalary = basicSalary + bonus;
        double tax = 0.05 * totalSalary;
        double finalSalary = totalSalary - tax;

        System.out.println("Final salary: " + finalSalary);

    }
}
