//static keyword
public class a20 {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.schooName="JVM";


        Student s2 =new Student();
        System.out.println(s2.schooName);

        Student s3=new Student();
        s3.schooName="ABC";
        

    }
}
class Student{
    String name;
    int roll;
    static String schooName; 
    void setName(String name){
        this.name=name;
    }
    String getName(){
        return this.name;
    }
}


