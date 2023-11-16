package OOprograming;
//get help
public class constructr {
    public static void main(String args[]){
        Student s1 = new Student("aditya");
        System.out.println(s1.name);
    }
    
}
class Student{
    String name;
    int roll;

    Student(String name){
        this.name = name;
    }
}
