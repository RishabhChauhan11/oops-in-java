//copy constructor
public class a7 {
    public static void main(String[] args) {
       Student s1=new Student();
       s1.name="shradha";
       s1.roll=432; 
    //    s1.password="abcd";
    //    s1.marks[0]=100;
    //    s1.marks[1]=90;
    //    s1.marks[2]=80;

       Student s2=new Student(s1);
       s2.password="xyz";
       System.out.println(s2.name);
       System.out.println(s2.roll);
       System.out.println(s2.password);
       
       
    //    for (int i = 0; i < 3; i++) {
    //        System.out.println(s2.marks[i]);
    //    }
       
    }
    
}
    class Student{
    String name;
    int roll;
    String password;
    // int marks[];
    //copy constructor
    Student(Student s1) {
        // marks=new int[3];
       this.name=s1.name;
       this.roll=s1.roll;
    //    this.marks=s1.marks;
       
    }
    
    Student(){
    System.out.println("constructor is called");
    }
    Student(String name){
    this.name=name;
    }
    Student(int roll){
    this.roll=roll;
    }
}

