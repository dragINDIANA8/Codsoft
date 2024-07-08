import java.util.Scanner;
public class Task_02_StudentGradeCalculator {
    public static void main(String[] args) {

        System.out.println("*** STUDENT GRADE CALCULATOR MADE BY SHUBHRANSHU SHEKHAR DAS ***");
        System.out.println("*** ENTER YOUR MARKS OUT OF 100 AND IT WILL SHOW YOU YOUR RESULT ***");

        /* First of all we will take marks of all the subjects as an input
        * and then according to that basis we will generate our total marks,
        * average percentage and corresponding grade to students */

        Scanner sc = new Scanner(System.in);
        System.out.print("\nenter marks of subject 1 (out of 100): ");
        int a = sc.nextInt();
        System.out.print("enter marks of subject 2 (out of 100): ");
        int b = sc.nextInt();
        System.out.print("enter marks of subject 3 (out of 100): ");
        int c = sc.nextInt();
        System.out.print("\nTotal marks obtained: ");
        int total_marks = a + b + c; //Add marks of all the subject ot get total marks
        System.out.println(total_marks);
        System.out.print("Average percentage: ");
        float avg = (float) total_marks / 3; //Dividing total marks by no of subjects to get its average
        System.out.printf("%.2f", avg );
        System.out.println("\t%");

        /* Now using conditional statement to get corresponding grade according
        * to the average percentage obtained by the students */
        if (avg >= 80) {
            System.out.println("Grade: A (Excellent)");
        } else if (avg >= 60) {
            System.out.println("Grade: B (Good Job)");
        } else if (avg >= 40) {
            System.out.println("Grade: C (Just Pass)");
        } else {
            System.out.println("Grade: F (Failed)");
        }
        System.out.println("\n*** HOPE YOU ARE HAPPY WITH YOUR RESULT, IF NOT THEN WORK HARD FOR NEXT TIME ***");
    }
}
