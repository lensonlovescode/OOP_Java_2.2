import java.util.Scanner;

public class Marksheet
{
    public static void main(String[] args)
    {
        Scanner scanner_object = new Scanner(System.in);

        System.out.println("Enter Your Name:\n");
        String StudentName = scanner_object.nextLine();
        System.out.println("Enter Your Registration number:\n");
        String Reg_no = scanner_object.nextLine();
        System.out.println("Enter Your Semester-:\n");
        float Semester = scanner_object.nextFloat();

        System.out.println("Enter Marks for Database-:\n");
        float Database_marks = scanner_object.nextInt();
        System.out.println("Enter Marks for System-:\n");
        float System_marks= scanner_object.nextInt();
        System.out.println("Enter Marks for Algorithm-:\n");
        float Algorith_marks = scanner_object.nextInt();
        System.out.println("Enter Marks for Statistics-:\n");
        float Statistics_marks = scanner_object.nextInt();

        float Total = System_marks + Database_marks + Algorith_marks + Statistics_marks;
        float Average = Total / 4;
        Character Grade = 'A';

        if (Average >= 70)
        {
            Grade = 'A';
        } else if (Average <= 60 && Average < 70)
        {
            Grade = 'B';
        } else if (Average >= 50 && Average < 60)
        {
            Grade = 'C';
        } else if (Average >= 40 && Average < 50)
        {
            Grade = 'D';
        } else if ( Average < 40 )
        {
            Grade = 'F';
        }


        System.out.println("\t\t\t\t\t\tDepartment of Computer Science");
        System.out.println("\t\t\t\t\t\t\tEnd Semester Results");
        String line = "-".repeat(89);
        System.out.println(line);
        System.out.println("|Name:-\t\t" + StudentName + "\t\t|Roll_no:-\t\t" + Reg_no + "\t|Semester:-\t\t" + Semester);
        System.out.println(line);
        System.out.println("|Unit Code:-\t\t\t\t\t|Unit Name:-\t\t\t\t\t\t|Score");
        System.out.println(line);
        System.out.println("|CCS2101  \t\t\t\t\t\t|Database  \t\t\t\t\t\t\t|" + Database_marks);
        System.out.println("|CCS2102  \t\t\t\t\t\t|Systems  \t\t\t\t\t\t\t|" + System_marks);
        System.out.println("|CCS2103  \t\t\t\t\t\t|Algorithm  \t\t\t\t\t\t|" + Algorith_marks);
        System.out.println("|CCS2104  \t\t\t\t\t\t|Statistics \t\t\t\t\t\t|" + Statistics_marks);
        System.out.println(line);
        System.out.println("|Total  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|" + Total);
        System.out.println(line);
        System.out.println("|Average \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|" + System_marks);
        System.out.println(line);
        System.out.println("|Grade  \t\t\t\t\t\t\t\t\t\t\t\t\t\t\t|" + Grade);
        System.out.println(line);
        System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t  Recommendation\t|");
        System.out.println(line);
        System.out.println("Grading Criteria\t\t\t\tOverall Grade(A-D)\t\t  \t\t\t Recommend Pass");


        System.out.println("70-100\t\tA");
        System.out.println("60-69\t\tB");
        System.out.println("50-59\t\tC");
        System.out.println("40-49\t\tD");
        System.out.println("Below 40\tF");
        System.out.println(line);
        scanner_object.close();
    }
}