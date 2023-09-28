package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.WebConstants;
import org.testng.Assert;


import java.util.Random;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class RegisterUsersService extends ActionManager {

    public static void EnterEmail(String Email){
        ActionManager.waitClickable(WebConstants.EMAIL_INPUT_MY_ACCOUNT).sendKeys(Email);
    }
    public static void EnterPassword(String Password){
        ActionManager.waitClickable(WebConstants.PASSWORD_INPUT_MY_ACCOUNT).sendKeys(Password);
    }

    public static void ClickOnRegister(){
        ActionManager.waitClickable(WebConstants.REGISTER_BTN).click();
    }

    public static void EnterUsername(String UserName){
        ActionManager.waitClickable(WebConstants.USERNAME_INPUT).sendKeys(UserName);
    }
    public static void RegisteredSuccefull(){
        Assert.assertTrue(ActionManager.waitPresence(WebConstants.SIGN_OUT_BTN).isDisplayed());
        String OriginalMessaage =ActionManager.getText("xpath://*[@id='page-36']/div/div[1]/div/p[1]/text()[1]");
        String ExpectedMessage ="Hello ";
        Assert.assertEquals(OriginalMessaage,ExpectedMessage);
        ActionManager.waitClickable(WebConstants.SIGN_OUT_BTN).click();


    }

    public static String getSaltString() {
        String SALTCHARS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        StringBuilder salt = new StringBuilder();
        Random rnd = new Random();
        while (salt.length() < 10) { // length of the random string.
            int index = (int) (rnd.nextFloat() * SALTCHARS.length());
            salt.append(SALTCHARS.charAt(index));
        }
        String saltStr = salt.toString();
        return saltStr;

    }

}

