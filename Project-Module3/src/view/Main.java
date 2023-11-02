package view;

import ra.config.Config;
import ra.model.Users;

public class Main {
    public static void main(String[] args) {
        Users userLogin = new Config<Users>().readFile(Config.URL_USER_LOGIN);
        if (userLogin != null) {
            new Home().checkRolelogin(userLogin);
        }else {
            new Home().menuHome();
        }
        new Home().menuHome();
    }
}