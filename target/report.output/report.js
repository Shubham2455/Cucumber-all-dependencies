$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/java/com/feature/login.feature");
formatter.feature({
  "line": 1,
  "name": "test login page",
  "description": "",
  "id": "test-login-page",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "successful login test",
  "description": "",
  "id": "test-login-page;successful-login-test",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "user should be open the link",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "user should be entered u-name and password",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "user should click on login button",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "user should be on home page",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_should_be_open_the_link()"
});
formatter.result({
  "duration": 11987132400,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_should_be_entered_u_name_and_password()"
});
formatter.result({
  "duration": 5429990599,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_should_click_on_login_button()"
});
formatter.result({
  "duration": 228014200,
  "status": "passed"
});
formatter.match({
  "location": "stepDefination.user_should_be_on_home_page()"
});
formatter.result({
  "duration": 9401133401,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "Search the product",
  "description": "",
  "id": "test-login-page;search-the-product",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 12,
  "name": "user should enter the product in searchbox",
  "keyword": "Then "
});
formatter.match({
  "location": "stepDefination.user_should_enter_the_product_in_searchbox()"
});
formatter.result({
  "duration": 1095800,
  "error_message": "java.lang.NullPointerException\r\n\tat com.stepDefination.stepDefination.user_should_enter_the_product_in_searchbox(stepDefination.java:60)\r\n\tat ✽.Then user should enter the product in searchbox(src/main/java/com/feature/login.feature:12)\r\n",
  "status": "failed"
});
});