
import java.util.*;
class Employee{
    String employeeId;
    String name;
    String department;
    double salary;
    Employee(){
        employeeId="EMP000";
        name=" ";
        department=" ";
        salary=0.0;
    }
    Employee(String e,String n,String d,double s){
        employeeId=e;
        name=n;
        department=d;
        salary=s;
    }
    Employee(String n,String d){
        employeeId=Company.generateEmployeeId();
        name=n;
        department=d;
    }
    void setEmployeeId(String e){
        employeeId=e;
    }
    void setName(String n){
        name=n;;
    }
    void setDepartment(String d){
        department=d;
    }
    void setSalary(double s){
        if(s<=0.0){
            System.out.println("Salary can't be negative");
        return;
        }
        salary=s;
    }

    String getEmployeeId(){
        return employeeId;
    }
    String getName(){
        return name;
    }
    String getDepartment(){
        return department;
    }
    double getSalary(){
        return salary;
    }

    void display(){
        System.out.println(employeeId+" "+name+" "+department+" "+salary);
    }
}

class Company{
    static int nextEmployeeId=1;
    Employee[]ob;
    int count=0;
    static double totalExpense;

    public Company(int size){
        ob=new Employee[size];
    }
    static String generateEmployeeId(){
        String newId=String.format("EMP%03d",nextEmployeeId);
        nextEmployeeId++;
        return newId;
    }
    public void addEmployee(Employee emp){
            if(count<ob.length){
                ob[count]=emp;
                totalExpense+=emp.getSalary();
                count++;
            }else{
                System.out.println("Employee salary is full");
            }
    }

    public  Employee findEmployeeById(String id){
        for(int i=0;i<ob.length;i++){
            if(ob[i].getEmployeeId().equals(id)){
                    return ob[i];
            }
        }
        return null;
    }

    public void updateSalary(String id,double newSalary){
        if(findEmployeeById(id)!=null){
            findEmployeeById(id).setSalary(newSalary);
        }else{
            System.out.println("Employee not found");
        }
    }

    public void listAllEmployees(){
        for(int i=0;i<ob.length;i++){
            System.out.println(ob[i].getEmployeeId());
        }
    }

    public static double getTotalExpense(){
        return totalExpense;
    }

}

public class Q8 {
    public static void main(String[] args) {
        Employee ob1 = new Employee("EMP001","Simik","CSE",10000);
        Employee ob2 = new Employee("EMP002","Himik","CSE",10000);
        Employee ob3 = new Employee("EMP003","Ashish","CSE",10000);
        // ob.display();
        Company obb=new Company(3);
        obb.addEmployee(ob1);
        obb.addEmployee(ob2);
        obb.addEmployee(ob3);
        Employee found=obb.findEmployeeById("EMP003");
        if(found!=null){
        found.display();
        }
        obb.listAllEmployees();

    }
}
