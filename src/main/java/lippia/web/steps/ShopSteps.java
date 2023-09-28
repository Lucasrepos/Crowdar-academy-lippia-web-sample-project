package lippia.web.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.core.actions.WebActionManager;
import io.cucumber.java.en.*;
import lippia.web.services.ShopService;
import lippia.web.services.SuperiorBarNavigationBarService;
import org.testng.Assert;

public class ShopSteps extends PageSteps {

    @Given("The client is in google page")
    public void home() {
        SuperiorBarNavigationBarService.navegarWeb();
    }

    @When( "The client tap on Shop menu" )
    public void theClientTapOnShop() {
        SuperiorBarNavigationBarService.tapMenu();
    }
    @When("The client can see only three Arrivals Only")
    public void ThreeArrivalsOnly(){
        WebActionManager.waitClickable("xpath:/html/body/div[1]/div[2]/div/div/nav/a").click();
        String OnlyThreeOriginal= String.valueOf(WebActionManager.getElements("xpath:/html/body/div[1]/div[2]/div/div/div/div/div/div[2]/div/div/div/div/div[2]/div").size());
        String OnlyThreeExpected="3";
        Assert.assertEquals(OnlyThreeOriginal,OnlyThreeExpected,"No hay 3 elementos");
    }
    @Then( "The client see Filter By Price" )
    public void theClientSee(  ) {
        ShopService.verifyPage();
    }
}

