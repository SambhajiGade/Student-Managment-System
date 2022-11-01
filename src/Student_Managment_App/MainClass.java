package Student_Managment_App;

import com.student.manage.Student_Operations;
import com.student.manage.student;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 boolean b = true;
        while (b){
            System.out.println();
            System.out.println("Press 1 to add new student");
            System.out.println("Press 2 to delete the student");
            System.out.println("Press 3 to update student info");
            System.out.println("Press 4 to show all student info");
            System.out.println("Press 5 to exit");

            int a = Integer.parseInt(br.readLine());

            switch (a){
                case 1 :
                    // Add

//                    System.out.print("Enter Student id : ");
//                    int id = Integer.parseInt(br.readLine());

                    System.out.print("Enter Student name : ");
                    String name = br.readLine();

                    System.out.print("Enter Student phone no : ");
                    String ph = br.readLine();

                    System.out.print("Enter Student city : ");
                    String city = br.readLine();

                    student sam = new student(name,ph,city);

                  //  System.out.println(sam);

                    boolean d = Student_Operations.InsertStudent(sam);

                    if(d){
                        System.out.println("Insertion successfully....");
                    }
                    else{
                        System.out.println("Something went wrong...");
                    }

                    break;

                case 2 :
                    // Delete

                    System.out.print("Enter id of student to delete : ");
                    int s = Integer.parseInt(br.readLine());

                    boolean j = Student_Operations.DeleteStudent(s);
                    if (j) {
                        System.out.println("The student is deleted...");
                    }
                    else{
                        System.out.println("Something went wrong...");
                    }

                    break;

                case 3 :
                    // Update

                    break;

                case 4 :
                    // show

                    Student_Operations.ShowAll();

                   break;

                case 5 :
                    // exit
                   b = false;
                   break;

                default:
                System.out.println("Plz enter correct one");
                    break;
            }

        }
        System.out.println("Thank you");


    }
}
