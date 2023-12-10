
public class UserSetterdanGetter {
    public static void main(String[] args) {

// membuat objek dari class SetterGetter
SetterGetter Donny = new SetterGetter();

// menggunakan method setter
Donny.setUsername("Donny");
Donny.setPassword("Kopi Kulo");

// menggunakan method getter
System.out.println("Username: " + Donny.getUsername());
System.out.println("Password: " + Donny.getPassword());  
    }
}
