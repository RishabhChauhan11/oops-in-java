//types of constructor
public class a6 {
   public static void main(String[] args) {
       Student s1=new Student();
       Student s2=new Student("shradha");
       Student s3=new Student(123);
       System.out.println(s2.name);
       System.out.println(s3.roll);
   } 
}
class Student{
    String name;
    int roll;
    
    Student(){ ///non parametrize
      this.name=name;
    }
    Student(String name){ //parametrize
        this.name=name;

    }
    Student(int roll){
        this.roll=roll;

    }
}
