package javaprogramming;

public class Employee {

    String name;
    int id;
    double salary;
    String address;
    int age ;

    Employee(String name , int id , double salary , String address , int age ){
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.address = address;
        this.age = age;
    }

    public void displayInfo(){
        System.out.println("Employee ID :" +id);
        System.out.println("Employee Name :" +name);
        System.out.println("Salary :" +salary);
        System.out.println("Address :"+address);
        System.out.println("Age :"+age);
    }

    public static void main(String[] args) {
        Employee e1 = new Employee("Komal",101 , 53000.00 , "Hubli" , 23);

        e1.displayInfo();
    }
}
