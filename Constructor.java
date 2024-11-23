public class Constructor {
    public static void main(String[] args){
        Student s=new Student("Manshika");
        System.out.println(s.name);
    }



}
class Student{
    String name;
    int roll_no;
    //here student is a constructor
    //Student(){
    //    System.out.println("constructor is called");
   // }
    Student(String name){
        this.name=name;
    }

}
