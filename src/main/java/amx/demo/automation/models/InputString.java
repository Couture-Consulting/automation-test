package amx.demo.automation.models;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class InputString {
	
	public InputString() {}

	public void enterString(String value) {
		$("#gLFyf gsfi").append(value).pressEnter();
		
	}
}
