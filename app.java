import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    
    public Student(String name, int age) {
        ;
        this.name = name;
        this.age = age;
    }
    
    public void display() {
        System.out.println("id: "+ id + ", Name: " + name + ", Age: " + age);
    }

    public String tocsv() {
        // This method can be used to convert the student details to CSV format
        return id + "," + name + "," + age;
    }
}




public class app {

    public static void writeCSV(String filename, ArrayList<Student> students) throws IOException {
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

        // Write header
        writer.write("id,name,age\n");
        int idCounter = 1;
        for (Student s : students) {
            s.id = idCounter++; // Assigning ID based on the order in the list
            writer.write(s.tocsv() + "\n");
        }

        writer.close();
        System.out.println("✅ File updated successfully.");
    }


    public static void main(String[] args) throws IOException {
        ArrayList<Student> students = new ArrayList<>();
        BufferedReader br = new BufferedReader(new FileReader("student_details.csv"));
        String line;

        // Skip header
        br.readLine();

        while ((line = br.readLine()) != null) {
            String[] parts = line.trim().split(",");
            int id = Integer.parseInt(parts[0]);
            String name = parts[1];
            int age = Integer.parseInt(parts[2]);
            Student student = new Student(name, age);
            student.id = id; // Assigning the ID from the CSV
            students.add(student);
        }

        br.close();



        System.out.println("Welcome to the Student Management System");
        System.out.println("Please choose an option:");
        System.out.println("1. Create a new student");
        System.out.println("2. Display students information");
        System.out.println("3. Remove a student");
        System.out.println("4. Search for a student");
        System.out.println("5. Exit");

        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();

        switch(choice) {
            case 1:
                
                System.out.print("Enter student name: ");
                String name = scanner.next();
                System.out.print("Enter student age: ");
                int age = scanner.nextInt();
                Student student = new Student(name, age);
                student.id = students.size() + 1; // Simple ID assignment based on current size
                students.add(student);
                writeCSV("student_details.csv", students);
        
                System.out.println("Student created successfully.");
                break;




            case 2:
                // Assuming we have a student object to display
                System.out.println("Displaying all students:");
                if (students.isEmpty()) {
                    System.out.println("No students found.");
                }
                for (Student studentObj : students) {
                    studentObj.display();
                }
                break;





            case 3:
                // Logic to remove a student would go here
                System.out.print("Enter student ID to remove: ");
    int removeId = scanner.nextInt();
    
    boolean removed = students.removeIf(studentobj -> studentobj.id == removeId);
    
    if (removed) {
        writeCSV("student_details.csv", students);
        System.out.println("Student removed successfully.");
    } else {
        System.out.println("Student with ID " + removeId + " not found.");
    }

    break;





            case 4:
                System.out.print("Enter student ID to search: ");
                int searchId = scanner.nextInt();
                for (Student studentObj : students) {
                    if (studentObj.id == searchId) {
                        System.out.println("Student found:");
                        studentObj.display();
                        break;
                    }
                }
                break;



            case 5:
                System.out.println("Exiting the system. Goodbye!"); 
                break;




            default:
                System.out.println("Invalid choice. Please try again.");
                break;

        }

        scanner.close();



    }
}
