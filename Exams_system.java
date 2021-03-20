import java.util.Scanner;

public class Exams_system {
    public static void main(String[] args) {
        // Declaring constant variables
        final float A_category = 5.0F;
        final float B_category = 4.0F;
        final float C_category = 3.0F;
        final float D_category = 2.0F;
        final float F_category = 1.0F;

    
        // Global variables to hold user student personal information
        String student_name = "";
        String id_no = "";
        String department = "";
        String level = "";
        String semester = "";


        // Defining variables for module
        byte number_of_modules = 0;
        float module_grade_point = 0.0F;
        float total_module_grade_points = 0.0F;
        int module_credit_hours = 0;
        int total_module_credit_hours = 0;

        // Grade_point category
        char grade_point_category = '-';

        // Defining a variable to hold the cumulative grade point for each student
        float cumulative_grade_point = 0.0F;

         
        // Instantiating new scanner object
        Scanner user_input = new Scanner(System.in);

        // Defining a variable that either end or continue the loop
        String end_or_continue_loop = "";
        
        // Program Heading
        System.out.println("\t\t\t\t\t\t EXAMS GRADING SYSTEM");

        // Defining a while Loop - To loop through the number of times the user to run the program
        while(true) {
            // Student Details Heading
            System.out.println("STUDENT PERSONAL DETAILS");

            // Declaring variables and setting them to their respective user_input value
            System.out.print("Enter student name: ");
            student_name = user_input.nextLine();

            System.out.print("Enter student ID number: ");
            id_no = user_input.nextLine();

            System.out.print("Enter student gender: ");
            String gender = user_input.nextLine();

            System.out.print("Enter student faculty: ");
            String faculty = user_input.nextLine();

            System.out.print("Enter student department: ");
            department = user_input.nextLine();

            System.out.print("Enter student program: ");
            String program = user_input.nextLine();

            System.out.print("Enter student level(Year): ");
            level = user_input.nextLine();

            System.out.print("Enter student semester: ");
            semester = user_input.nextLine();
            

            // Modules Heading
            System.out.println("\nSTUDENT MODULES, GRADE_POINTS AND THEIR CREDIT_HOURS");

            // Defining a variable to hold the number of modules the user will input
            System.out.print("Enter number of modules: ");
            number_of_modules = user_input.nextByte();

            
            //Iteration through the number_of_modules input value
            for(int iteration_count = 0; iteration_count < number_of_modules; iteration_count++) {
                user_input.nextLine();
                // Defining a variables to the user_input for the module_name, the module_grade && the module_credit_hours
                System.out.print("Enter student module_name: ");
                String module_name = user_input.nextLine();

                System.out.print("Enter student module_grade: ");
                int module_grade = user_input.nextByte();
                
                System.out.print("Enter module_credit_hours: ");
                module_credit_hours = user_input.nextInt();

                // Give space
                System.out.println();

                // Setting conditions - depending on the grade assign the most appropriate category
                if(module_grade >= 75)
                    module_grade_point = A_category;
                else if(module_grade >= 60)
                    module_grade_point = B_category;
                else if(module_grade >= 50)
                    module_grade_point = C_category;
                else if(module_grade >= 40)
                    module_grade_point = D_category;
                else
                    module_grade_point = F_category;

                // Adding each module_grade_point to the total_module_grade_point variable
                total_module_grade_points += module_grade_point;

                // Adding each module_credit_hours to the total_module_credit_hours
                total_module_credit_hours += module_credit_hours;

                // Calculating the cumulative_grade_point
                cumulative_grade_point = (total_module_grade_points * module_credit_hours) / total_module_credit_hours;

                
            }

            // Setting conditions to output the cumulative_grade_point ot its corresponding grade_point_category
            if(cumulative_grade_point == 5.0)
                grade_point_category = 'A';
            else if(cumulative_grade_point >= 4.0)
                grade_point_category = 'B';
            else if(cumulative_grade_point >= 3.0)
                grade_point_category = 'C';
            else if(cumulative_grade_point >= 2.0)
                grade_point_category = 'D';
            else if(cumulative_grade_point >= 1.0)
                grade_point_category = 'F';
            else 
                System.out.println("Out of range...");
            
            
            // Display final result for student
            System.out.println();
            System.out.println("\t\t\t\t" + "Transcipt Owner: " + student_name);
            System.out.println("\t\t\t\t-----------------------------------------");
            System.out.println("Year: " + level + " |" + " Semester: " + semester);
            System.out.println("-------------------------------------------------------------------------------------------------------------");

            System.out.println("Student_name:\t" + student_name + "\t\tSemester:\t" + semester 
            + "\n" + "ID_no:\t\t" + id_no + "\t\t\t\tFaculty:\t" + faculty +
            "\n" + "Gender:\t\t" + gender + "\t\t\t\tDepartment:\t" + department
            + "\n" + "Level(Year):\t" + level + "\t\t\t\tProgram:\t" + program);

            System.out.println("-------------------------------------------------------------------------------------------------------------");
            System.out.println("Cumulative_grade_point:\t" + cumulative_grade_point + "\n"+ "Category: " + grade_point_category);
            System.out.println("-------------------------------------------------------------------------------------------------------------");

            System.out.println("\t\t\t\tType your choosen option");
            System.out.println("1. To continue the program: Type 'continue' \n" + "2. To end the program: Type 'quit'" );

            System.out.print("\nType(continue/quit): ");
            end_or_continue_loop = user_input.next();

            if(end_or_continue_loop.equals("continue")) {
                user_input.nextLine();
                System.out.println("---------------------------------------------------------------------------------------------");
                continue;
            } 
            else if(end_or_continue_loop.equals("quit")) {
                System.out.println("\nDone - Program Terminated!!!\n");
                break;
            }
            else {
                System.out.println("Sorry your choice is invalid, so try again");
                // System.out.print("\nType(continue/quit): ");
                // end_or_continue_loop = user_input.next();
            } 
            

        }

        user_input.close();
    }
}
