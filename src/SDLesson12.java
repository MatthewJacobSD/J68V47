import java.util.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
public class SDLesson12 {
    //L12E1
    /*static class Student {
        public Integer id = 0;
        public String firstName = "";
        public String surname = "";

    }

    public static void main(String[] args) {
        System.out.format("(%d) %s %s %n", Student.id, Student.firstName, Student.surname);
    }

    public static void main(String[] args) {

        // create student object and display
        Student student1 = new Student();
        displayStudent(student1);
        // update values of student object and display
        */

    //L12E2
    static class Student {
        public Integer id = 0;
        public String firstName = "";
        public String surname = "";
        public Boolean present;

        public static ArrayList<Student> loadFile(String filename) {
            List<String> studentDetails;
            ArrayList<Student> thisClass = new ArrayList<>();
            try {
                BufferedReader in = new BufferedReader(new FileReader(filename));
                String line = in.readLine();
                while (line != null) {
                    studentDetails = Arrays.asList(line.split(","));
                    Student newStudent = new Student();
                    newStudent.id = Integer.parseInt(studentDetails.get(0));
                    newStudent.firstName = studentDetails.get(1);
                    newStudent.surname = studentDetails.get(2);
                    newStudent.present = Boolean.parseBoolean(studentDetails.get(3));
                    thisClass.add(newStudent);
                    line = in.readLine();
                }
            } catch (IOException e) {
                System.out.println("Error occurred reading file: " + e);
            }
            return thisClass;
        }

        public static String attendance(boolean studentIsHere) {
            // return X if student is present, O if student is not present
            // ...
            return null;
        }

        public static void displayStudent(Student thisStudent) {
            // note the slight change to this procedure
            System.out.format("%s (%d) %s %s %n", attendance(thisStudent.present), thisStudent.id, thisStudent.firstName, thisStudent.surname);
        }

        public static void main(String[] args) {
            // load file contents into an array of student objects
            ArrayList<Student> thisClass = loadFile("students.txt");
            // loop for all objects and show details
            for (Student ignored : thisClass) {
                // show details for this student
                // ...
                return;
            }
        }
    }
}

    //L12E3
    //(create file)

    //L12E4
    //(creat file)