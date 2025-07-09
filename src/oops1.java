public class oops1 {
    public static void main(String[] args) {
        Student pranesh = new Student();
        pranesh.rno = 12;
        System.out.println(pranesh.rno);
        pranesh.greeting();

        Student one = new Student();

        one.name = "pranesh";
        System.out.println(one.name);
    }
}

class Student {
    int rno;
    String name;
    float marks;

    void greeting() {
        System.out.println("Hello! " + this.name);
    }

    void changeName(String name) {
        this.name = name;
    }

    Student() {
        this.rno = 13;
        this.name = "Pranesh Nikhar";
        this.marks = 99.5f;
    }

    Student(int roll, String name, float marks) {
        this.rno = roll;
        this.name = name;
        this.marks = marks;
    }
}
