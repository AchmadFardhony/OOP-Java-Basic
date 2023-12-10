public class SetterGetter {

    private String username;
    private String password;

    // kalo dia method make nya setUsername dan this
    // nama method tidak boleh sama
    // nama method bisa sama asalkan paramter di bedakan
    // this hanya bisa di gunakan untuk mengambil data yang ada di dalam class
    public void setUsername(String username){
        this.username = username; 
    }
    
    public void setPassword(String password){
        this.password = password;
    }

    // kalo dia function make nya setUsername dan return this
    // nama function tidak boleh sama
    // nama function bisa sama asalkan paramter di bedakan 
    // this hanya bisa di gunakan untuk mengambil data yang ada di dalam class
    public String getUsername(){
        return this.username;
    }

    public String getPassword(){
        return this.password;
    }
    
}
