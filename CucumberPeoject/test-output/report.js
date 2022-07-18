$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:Features/Login.feature");
formatter.feature({
  "name": "Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Sucessfull Login with Valid Credentials",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
  "name": "User Launch Chrome browser",
  "keyword": "Given "
});
formatter.match({
  "location": "Steps.user_Launch_Chrome_browser()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User opens URL \"https://accounts.google.com/signin/v2/identifier?flowName\u003dGlifWebSignIn\u0026flowEntry\u003dServiceLogin\"",
  "keyword": "When "
});
formatter.match({
  "location": "Steps.user_opens_URL(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Email as \"someonessomethingkp@gmail.com\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Email_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Next",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Next1()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enters Password as \"KpVpKMp@22\"",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.user_enters_Password_as(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Click on Next2",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.click_on_Next2()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The Home Button should be avaliable",
  "keyword": "Then "
});
formatter.match({
  "location": "Steps.checking_for_btn()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "close the browser",
  "keyword": "And "
});
formatter.match({
  "location": "Steps.close_the_browser()"
});
formatter.result({
  "status": "passed"
});
});