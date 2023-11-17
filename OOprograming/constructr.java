package OOprograming;
//get help
public class constructr {
    public static void main(String args[]){
        Student s1 = new Student("aditya");
        System.out.println(s1.name);
        s1.roll = 456;

        s1.marks[0] =100;
        s1.marks[1] =90;
        s1.marks[2] =80;

        Student s2 = new Student(s1);  //copy
        s2.password = "xyz";
        s1.marks[2] = 100; //changed property

        for(int i=0; i<3; i++){
            System.out.println(s2.marks);
        }
    }
    
}
class Student{
    String name;
    int roll;
    String password;
    int marks[];

    //shallow copy constructor
    // Student(Student s1){
    //     marks =new int[3];
    //     this.name = s1.name;
    //     this.roll = s1.roll;
    //     this.marks = s1.marks; 

    // }

    //deep copy constructor
    Student(Student s1){
        marks =new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i=0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
    }

    Student(String name){ //parameterized constructor
        marks =new int[3];
        this.name = name;
    }
    Student(int roll){
        marks =new int[3];
        this.roll = roll;
    }
}
/*
 * 
    public static void main(String args[]){
        Student s1 = new Student();
        //System.out.println(s1.name);
    }
    
}
class Student{
    String name;
    int roll;

    Student(){ //non-parameterized constructor
        marks =new int[3];
        System.out.println("constructor is called....");
    }
}
 */
