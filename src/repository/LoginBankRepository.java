
package repository;

import dataAccess.LoginDAO;
import java.util.Locale;


public class LoginBankRepository implements ILoginBankRepository{

    @Override
     public void login(Locale language) {
        LoginDAO.Instance().login(language);
    }
}