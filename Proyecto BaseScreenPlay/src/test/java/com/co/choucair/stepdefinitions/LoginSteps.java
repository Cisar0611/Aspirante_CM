package com.co.choucair.stepdefinitions;

import com.co.choucair.tasks.LoginTask;
import com.co.choucair.tasks.ValidateErrorMessageTask;
import com.co.choucair.ui.LoginPage;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.serenitybdd.screenplay.questions.WebDriverQuestion;
import net.serenitybdd.screenplay.actions.Open;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.hamcrest.Matchers.equalTo;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LoginSteps {
       private final Actor user = OnStage.theActorCalled("User");

        @Given("the user is on the login page")
        public void theUserIsOnTheLoginPage() {
                user.wasAbleTo(Open.url("https://opensource-demo.orangehrmlive.com/"));
        }

        @When("the user enter valid data")
        public void theUserEnterValidData() {
                user.attemptsTo(LoginTask.withData("Admin", "admin123"));
        }

        @When("the user enter invalid data")
        public void theUserEnterInvalidData() {
                user.attemptsTo(LoginTask.withData("Admins", "admin1234"));
        }

        @Then("the user should see the dashboard")
        public void theUserShouldSeeTheDashboard() {
                user.should(seeThat("Page title", WebDriverQuestion.about(),equalTo("Dashboard")));
        }

        @Then("the user should see an error message")
        public void theUserShouldSeeAnErrorMessage() {
                user.should(seeThat(ValidateErrorMessageTask.displayed(), (Question<Boolean>) equalTo("Invalid data")));
        }
}