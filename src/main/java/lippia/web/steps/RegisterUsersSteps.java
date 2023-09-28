package lippia.web.steps;

import com.crowdar.core.PageSteps;
import io.cucumber.java.en.*;
import lippia.web.services.HomePageService;
import lippia.web.services.RegisterUsersService;

public class RegisterUsersSteps extends PageSteps {

    @Given("The user is in automation practice web")
    public void home() {
        HomePageService.navegarWeb();
    }
    @When("The user go to My Account")
    public void goToMyAcoount(){
        HomePageService.GoToMyAccount();
    }

    @When("The user click on Register Button")
    public void RegisterNewUser(){
        RegisterUsersService.ClickOnRegister();
    }
    @When("The user enter new email")
    public void EnterEmail(){
        String RandomEmail =RegisterUsersService.getSaltString()+"@mail.com";
        RegisterUsersService.EnterEmail(RandomEmail);
    }
    @When("The user enter password")
        public void EnterPassword(){
        RegisterUsersService.EnterPassword("ABCabvc12#3");
    }

    @When("The user enter invalid Email")
        public void EnterInvalidEmail(){
        RegisterUsersService.EnterEmail("NotEmail.com")
        ;
    }

    @When("The user enter Invalid Password")
    public void EnterInvalidPassword(){
        RegisterUsersService.EnterPassword("");
    }
    @When("The user enter Empity Password")
    public void EnterEmpityPassword(){
        RegisterUsersService.EnterPassword("");
    }

    @Then("The user will be registered successfully and redirect to homepage")
    public void RegisteredSuccessfull(){
        RegisterUsersService.RegisteredSuccefull();
    }


}
