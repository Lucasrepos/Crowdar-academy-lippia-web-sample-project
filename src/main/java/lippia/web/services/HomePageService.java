package lippia.web.services;

import com.crowdar.core.PropertyManager;
import com.crowdar.core.actions.ActionManager;
import lippia.web.constants.WebConstants;

import static com.crowdar.core.actions.WebActionManager.navigateTo;

public class HomePageService extends ActionManager {

    public static void navegarWeb(){
        navigateTo(PropertyManager.getProperty("web.base.url"));

    }
    public static void GoToMyAccount(){
        ActionManager.waitClickable(WebConstants.MY_ACCOUNT_BTN).click();
    }



}

