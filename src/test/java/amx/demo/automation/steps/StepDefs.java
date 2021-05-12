package amx.demo.automation.steps;

import static com.codeborne.selenide.Selenide.*;

import java.time.Duration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static amx.demo.automation.utils.Page.waitForVisibility;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class StepDefs {
	
	@Given("the page {string} is opened")
	public void openThePage(String url) throws InterruptedException {
		open(url);
		$("div.popup_window").shouldBe(Condition.visible, Duration.ofSeconds(30));
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
		waitForVisibility($("table.linkContainer"));
	}
	
	@And("I choose the {string} application")
	public void chooseApplication(String appName) {
		$("img.closeButton").click();
		$("table.linkContainer tbody tr:nth-child(4) span.titleIcon").click();
		waitForVisibility($("div#dijit__TreeNode_4"));
	}
	
	@And("I start {string} client side human service")
	public void openHumanService(String serviceName) throws InterruptedException {
		$("div#dijit__TreeNode_4 div").click();
		waitForVisibility($("div[aria-label='Client-Side Human Service']"));
		ElementsCollection elements = $$("div.sectionItem.dojoDndItem.itemDeselected");
		for (SelenideElement element : elements) {
			if (element.$("div.itemLabel").getText().equals(serviceName)) {
				element.click();
				break;
			}
		}
		waitForVisibility($("span#runButton"));
		$("span#runButton").click();
		Thread.sleep(5000);
		switchTo().window(1);
	}
}
