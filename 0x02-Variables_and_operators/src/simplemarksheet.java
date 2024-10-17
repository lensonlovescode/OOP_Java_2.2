import java.util.Scanner;

public class simplemarksheet
{
    public static void  main(String [] args)
    {
        Scanner scanner_obj = new Scanner(System.in);
        String line = "-".repeat(145);
        int i;
        i = 0;
        String Full_string_1 = "";
        String Full_string_2 = "";

        while (i < 2)
        {
            System.out.println("Enter Your Name:");
            String Name = scanner_obj.nextLine();
            System.out.println("Enter Your REG NO:");
            String REG = scanner_obj.nextLine();
            System.out.println("Enter Score for CCS2211 :");
            Integer CCS2211 = scanner_obj.nextInt();
            System.out.println("Enter Score for CCS2212 :");
            Integer CCS2212 = scanner_obj.nextInt();
            scanner_obj.nextLine(); // Consume leftover newline

            Integer Total = CCS2212 + CCS2211;
            Float Average = (float) (Total / 2.0);
            String Stat_us;
            char Grade;

            if (Average >= 70.0)
            {
                Stat_us = "Passed";
                Grade = 'A';
            }
            else
            {
                Stat_us = "Failed";
                Grade = 'F';
            }
            if (i == 0)
            {
                Full_string_1 = String.format("%-20s%-24s%-20d%-16d%-20d%-20.1f%-20s%-20c", REG, Name, CCS2211, CCS2212, Total, Average, Stat_us, Grade);
            }
            else if (i == 1)
            {
                Full_string_2 = String.format("%-20s%-24s%-20d%-16d%-20d%-20.1f%-20s%-20c", REG, Name, CCS2211, CCS2212, Total, Average, Stat_us, Grade);
            }
            i += 1;
        }
        System.out.println("\nStudent Score Sheet");
        System.out.println(line);
        System.out.println("Reg No. \t\t\tFull Name\t\t\tCCS 2211\t\t\tCCS 2212\t\t\tTOTALS  \t\t\tAVERAGE \t\t\tSTATUS  \t\t\tGRADE");
        System.out.println(line);
        System.out.println(Full_string_1);
        System.out.println(Full_string_2);
    }
}
