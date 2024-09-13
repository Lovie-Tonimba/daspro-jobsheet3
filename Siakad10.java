import java.util.Scanner;
public class Siakad10 {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String NIM;
        String kelas;
        byte attendanceNumber;
        double quizScore;
        double assignmentScore; 
        double utsScore;
        double uasScore;
        double finalScore;

        System.out.print("Enter name                : ");
        name = sc.nextLine();
        System.out.print("Enter NIM                 : ");
        NIM = sc.nextLine();
        System.out.print("Enter class               : ");
        kelas = sc.nextLine();
        System.out.print("Enter attendance number   : ");
        attendanceNumber = sc.nextByte();
        System.out.print("Enter quiz score          : ");
        quizScore = sc.nextDouble();
        System.out.print("Enter assignment score    : ");
        assignmentScore = sc.nextDouble();
        System.out.print("Enter uts score           : ");
        utsScore = sc.nextDouble();
        System.out.print("Enter uas score           : ");
        uasScore = sc.nextDouble();
        
        finalScore = ((quizScore * 0.20) + (assignmentScore * 0.15) + (utsScore * 0.30) + (uasScore * 0.35));
  
        System.out.println("Name: " + name + "NIM: " + NIM);
        System.out.println("Class: " + kelas + " Attendance number: " + attendanceNumber);
        System.out.println("Final score: " + finalScore);
    }
}