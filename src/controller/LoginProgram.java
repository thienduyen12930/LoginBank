
package controller;

import repository.LoginBankRepository;
import view.Menu;
import java.util.Locale;


public class LoginProgram extends Menu<String>{
    static String[] mc = {"Vietnamese", "English", "Exit"};
    LoginBankRepository program;
    Locale vietnamese = new Locale("vi");
    Locale english = Locale.ENGLISH;
    public LoginProgram() {
        super("\nLogin Program", mc);
        program = new LoginBankRepository();
    }

    @Override
    public void execute(int n) {
        switch (n) {
            case 1:
                program.login(vietnamese);
                break;
            case 2:
                program.login(english);
                break;
            case 3:
                System.exit(0);
        }
    }
    
}