import java.util.*;
public class copy_constructor {
   static class student{
        String name;
         int roll_no;
         int password;
         //this array is pass to every constructor
          int marks[];

         student(){//constructor
             marks=new int[3];
             this.name=name;



         }
         //copy constructor
         student(student s1){//here we are copying data of s1 in s2
             marks=new int [3];
             this.name=s1.name;
             this.roll_no=s1.roll_no;
             this.password=s1.password;
             this.marks=s1.marks;

         }




    }
    public static void main(String[] args){
       student s1=new student();
       s1.name="manshika";
       s1.roll_no=23;
       s1.password=123;
       s1.marks[0]=5;
       s1.marks[1]=10;
       s1.marks[2]=15;

       student s2=new student(s1);//as we are creating new constructor , we are coping the data of s1 to s2
       s2.password=34;
       s1.marks[2]=3;//as we already copied the data still marks get affect because in array only reference is change while copying
       for(int i=0;i<3;i++){
           System.out.println(s2.marks[i]);
       }
       System.out.println(s2.password);


    }


}
