package lab11;

import lab11.BO.LoginBO;
import org.testng.annotations.Test;

public class InstagramAuthTest {
//Pass: Aqatest123
//login: aqatest45
    @Test
    void authTest(){
        LoginBO loginBo = new LoginBO();

        loginBo.openLoginPage()
                .login("aqatest45","Aqatest123")
                .verifyLogin();
    }
}
