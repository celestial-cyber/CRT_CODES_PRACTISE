import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        String name = sc.nextLine();
        int marks = sc.nextInt();

        // Create Student object
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setMarks(marks);

        // Print output
        System.out.println(s.getId() + " " + s.getName() + " " + s.getMarks() + " " + s.getResult());
    }
}

class Student {
    // Private data members
    private int id;
    private String name;
    private int marks;

    // Setter methods
    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    // Getter methods
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    // Method to determine result
    public String getResult() {
        if (marks >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}
