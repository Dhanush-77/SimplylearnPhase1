package assignment;

public class Student {
	//class level variables
    int id;
    String name;
    String department;
        double salary ;
    
    //default constructor
    public Student()
    {
        id=23;
        name="Sonam";
        department="trainer";
        salary=20000;
    }
    public Student(int id,String name,String department,double salary)
    {
        this.id=id;
        this.name=name;
        this.department=department;
        this.salary=salary;
    }
    
    public static void main(String[] args) {
        
        //when you create object automatically it calls default constructor
        //if no default constructor then compiler will create that
        Student obj=new Student();
        System.out.println("User 1");
        System.out.println("Id: "+obj.id);
        System.out.println("Name: "+obj.name);
        System.out.println("Name: "+obj.department);
        System.out.println("salary :"+obj.salary);
        
        Student obj2= new Student(45,"Vineet","testing",27000);
        System.out.println("User 2");
        System.out.println("Id: "+obj2.id);
        System.out.println("Name: "+obj2.name);
        System.out.println("Name: "+obj2.department);
        System.out.println("salary :"+obj2.salary);
        
        Student obj3= new Student(25,"Vinay","developing",23000);
        System.out.println("User 3");
        System.out.println("Id: "+obj3.id);
        System.out.println("Name: "+obj3.name);
        System.out.println("Name: "+obj3.department);
        System.out.println("salary :"+obj3.salary);
        
        
        
    }
}

