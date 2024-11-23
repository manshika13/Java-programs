
import java.util.*;
public class constructor1{
    static class student{
        String name;
        student(String name){//this is a constructor it is call by java
            // if we have to pass arguments then we to declare it and define it
        this.name=name;

        }

    }
    public static void main(String[] args){
        student s1=new student("sharda");//student() is a constructor which create itself in class
        System.out.println(s1.name);
    }

}
