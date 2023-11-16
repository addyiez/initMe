package OOPs;
 public class ClassNobject{
    public static void main(String args[]){
        Pen p1 = new Pen(); // created a pen object called p1
        p1.setColor("Blue");
        System.out.println(p1.color);
        p1.setTip(5);
        System.out.println(p1.tip);
        p1.color = "yellow";
        System.out.println(p1.color);

        //student class
        student s1 = new student();
        s1.calcpercentage(33, 45,90);
    }

 }

 class Pen{
    String color;
    int tip;
     
    void setColor(String newColor){
        color = newColor;
    }

    void setTip(int newTip){
        tip = newTip;
    }
 }

 class student{
     String name;
     int age;
     float percentage;

     void calcpercentage(int phy, int chem, int math){
        percentage = (phy + chem + math) / 3;
        System.out.println(percentage);
     }
 }