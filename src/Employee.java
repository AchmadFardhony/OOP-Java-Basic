public class Employee extends Person {
    
    public void showInfo(){
        //super di gunakan untuk mengambil data dari clas yang lain
        System.out.println("Name: " + super.name);
        System.out.println("Age: " + super.age);
        System.out.println("Salary: $" + salary);
    }
}
