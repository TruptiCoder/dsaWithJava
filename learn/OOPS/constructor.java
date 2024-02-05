public class constructor{
    public static void main(String args[]){
        // Student s1 = new Student();
        // Student s2 = new Student("Trupti");
        // Student s3 = new Student(01);

        Student s4 = new Student();
        s4.name = "Trupti";
        s4.roll = 342;
        s4.password = "abcd";
        s4.marks[0] = 80;
        s4.marks[1] = 90;
        s4.marks[2] = 100;

        Student s5 = new Student(s4);
        s5.password = "xyz";
    }
}

class Student{
    String name;
    int roll;
    String password;
    int marks[];

    Student(String name){
        marks = new int[3];
        this.name = name;
    }

    Student(){
        marks = new int[3];
        System.out.println("Constructor is called...");
    }

    Student(int roll){
        marks = new int[3];
        this.roll = roll;
    }

    //copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        //deep copy
        for(int i = 0; i < marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }
}