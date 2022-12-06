package com.Syntax.Test;

import com.Syntax.pages.LoginPageWithPageFactory;
import com.Syntax.utils.CommonMethods;
import org.apache.commons.logging.Log;

public class LoginPageTestWithPageFactory {
    public static void main(String[] args) {

        CommonMethods.openWithSpecificUrl("http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login");
                LoginPageWithPageFactory login =new LoginPageWithPageFactory();
        login.usernamefield.sendKeys("Admin");
        login.passwordfield.sendKeys("Hum@nhrm123");
        login.loginbtn.click();
    }}