public class UserConstructor {
    public String username;
    public String password;
    
    public UserConstructor(String username, String password){
        this.username = username;
        this.password = password;
    }
       
}

class DemoConstructor{
    public static void main(String[] args) {
        UserConstructor petani = new UserConstructor("petanikode", "kopi");
        System.out.println("Username: " + petani.username);
        System.out.println("Password: " + petani.password);
    }
}

//Constructor adalah method khusus yang akan dieksekusi pada saat pembuatan objek (instance).
//Biasanya method ini digunakan untuk inisialisasi atau mempersiapkan data untuk objek.

