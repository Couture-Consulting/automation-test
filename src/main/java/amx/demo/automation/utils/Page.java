package amx.demo.automation.utils;

import java.time.Duration;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

public class Page {
	
	private Page() {}
	
	public static void waitForVisibility(SelenideElement element) {
		element.shouldBe(Condition.visible, Duration.ofSeconds(30));
	}
}
