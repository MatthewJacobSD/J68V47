import java.util.*;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class SDLesson12 {
    //L12E1
    public int id = 0;
    public String firstName = "";
    public String surname = "";
    public static boolean present = true;

    /*public static void main(String[] args) {
        SDLesson12 student1 = new SDLesson12();
        student1.id = 30163628;
        student1.firstName = "MatthewJacob";
        student1.surname = "Sarkodie Darkwah";
        System.out.format("(%d) %s %s %n", student1.id, student1.firstName, student1.surname);
    }*/

    /*//L12E2
    public static ArrayList<SDLesson12> loadFile(String filename){
        List<String> studentDetails;
        ArrayList<SDLesson12> thisClass = new ArrayList<>();
        try {
            BufferedReader in = new BufferedReader(new FileReader(filename));
            String line = in.readLine();
            while (line != null) {
                studentDetails = Arrays.asList(line.split(","));
                SDLesson12 newStudent = new SDLesson12();
                newStudent.id = Integer.parseInt(studentDetails.get(0));
                newStudent.firstName = studentDetails.get(1);
                newStudent.surname = studentDetails.get(2);
                present = Boolean.parseBoolean(studentDetails.get(3));
                thisClass.add(newStudent);
                line = in.readLine();
            }
        } catch (IOException e) {
            System.out.println("Error occurred reading file: " + e);
        }
        return thisClass;
    }
    public static String attendance(boolean studentIsHere) {
        if (studentIsHere) {
            return "X";
        } else {
            return "O";
        }
    }

    public static void displayStudent(SDLesson12 thisStudent){
        System.out.format("%s (%d) %s %s %n",attendance(present), thisStudent.id, thisStudent.firstName, thisStudent.surname);
    }
    public static void main(String[] args) {
        // load file contents into an array of student objects
        ArrayList<SDLesson12> thisClass = loadFile("src/students.txt");
        // loop for all objects and show details
        for (SDLesson12 thisStudent : thisClass) {
            displayStudent(thisStudent);  // show details for this student
        }
    }*/

    //L12E3

}





