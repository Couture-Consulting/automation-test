package amx.demo.automation.steps;

import static com.codeborne.selenide.Selenide.*;


import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class StepDefs {
	
	@Given("the page {string} is opened")
	public void openThePage(String url) throws InterruptedException {
		open(url);
		Thread.sleep(3000);
	}
	
	@And("I close the browser")
	public void closeThePage() {
		closeWindow();
	}
	
	@And("I give username {string} and password {string}")
	public void searchOnGooglePage(String username, String password) throws InterruptedException {
		$("#username").append(username);
		$("input[type=password]").append(password);
		$("input[type=submit]").click();
		Thread.sleep(3000);
	}
}
