import java.util.Scanner;

public class AssignmentNo1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int elecUsage;
        int elecTariff = 1500;
        int totalElecBill;
       
        System.out.println("How much the electricity usage? ");
        elecUsage = sc.nextInt();
        totalElecBill = elecUsage * elecTariff;
        System.out.println("How much the TOTAL elec bill? " + totalElecBill);
        boolean checkOnElecUsage = elecUsage > 500;

        System.out.print("Is there a usage of electricity that exceeds 500 kWh? " + checkOnElecUsage );
        
    }
}
