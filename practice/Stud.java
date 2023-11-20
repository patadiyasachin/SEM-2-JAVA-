import java.util.Scanner;

public class Stud{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        student s1=new student();
        student s2=new student(s1);

    }
}

class student{
    String name;
    long enr;
    String gender;
    int marks;
    static int count=0;

    student(){
        name="sachin";
        enr=23232;
        gender="male";
        marks=100;
    }

    student(student s){
        System.out.println(name);
        System.out.println(enr);
        System.out.println(gender);
        System.out.println(marks);
    }
}