import java.util.*;

public class program1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        int id = sc.nextInt();
        sc.nextLine(); // consume newline
        String name = sc.nextLine();
        int marks = sc.nextInt();

     
        Student s = new Student();
        s.setId(id);
        s.setName(name);
        s.setMarks(marks);

        System.out.println(s.getId() + " " + s.getName() + " " + s.getMarks() + " " + s.getResult());
    }
}

class Student {
   
    private int id;
    private String name;
    private int marks;


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


    public String getResult() {
        if (marks >= 40) {
            return "PASS";
        } else {
            return "FAIL";
        }
    }
}
