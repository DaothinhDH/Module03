package BAITAP.baitap3;

public class User {
    private String id;
    private String username;
    private String password;


    public User(){
    }

    public User(String id, String username, String password) {
        this.id = id;
        this.username = username;
        this.password = password;
    }

    public boolean login(String username, String password){
        if(this.username.equals(username) && this.password.equals(password)){
            System.out.println("Dang nhap thanh cong");
            return true;
        }else {
            System.out.println("Dang nhap that bai");
            return false;
        }
    }
    public void displayData(){
        System.out.println("User{" +
                "id=" + id +
                ", name='" + username + '\'' +
                ", password='" + password + '\'' +
                '}');
    }

}
