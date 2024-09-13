import java.util.Scanner;

public class Siakad10 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;
        String NIM;
        char kelas;
        byte attendanceNumber;
        double quizScore;
        double assignmentScore; 
        double examScore;
        double finalScore;


        System.out.print("Enter name: ");
        name = sc.nextLine();
        System.out.print("Enter NIM: ");
        NIM = sc.nextLine();
        System.out.print("Enter class: ");
        kelas = sc.nextLine().charAt(0);
        System.out.print("Enter attendance number: ");
        attendanceNumber = sc.nextByte();
        System.out.print("Enter quiz score: ");
        quizScore = sc.nextDouble();
        System.out.print("Enter assignment score: ");
        assignmentScore = sc.nextDouble();
        System.out.print("Enter exam score: ");
        examScore = sc.nextDouble();
        
        finalScore = (quizScore + assignmentScore + examScore)/3;

        System.out.println("Name: " + name + "NIM: " + NIM);
        System.out.println("Class: " + kelas + " Attendance number: " + attendanceNumber);
        System.out.println("Final score: " + finalScore);
    }
}