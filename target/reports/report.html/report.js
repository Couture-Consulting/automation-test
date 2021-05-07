$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/InitialFeature.feature");
formatter.feature({
  "name": "Initial feature includes testing steps",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Open the browser",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "the page \u0027https://192.168.0.123:9443/ProcessCenter/\u0027 is opened",
  "keyword": "Given "
});
formatter.match({
  "location": "amx.demo.automation.steps.StepDefs.openThePage(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I give username \u0027pnguyen\u0027 and password \u0027duyphuoc23122012\u0027",
  "keyword": "And "
});
formatter.match({
  "location": "amx.demo.automation.steps.StepDefs.searchOnGooglePage(java.lang.String,java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "amx.demo.automation.steps.StepDefs.closeThePage()"
});
formatter.result({
  "status": "passed"
});
});