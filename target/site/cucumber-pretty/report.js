$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("./src/test/resources/Features/home.feature");
formatter.feature({
  "line": 1,
  "name": "Test Login functionality",
  "description": "",
  "id": "test-login-functionality",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Login and purchase",
  "description": "",
  "id": "test-login-functionality;login-and-purchase",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@Order"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "Launch \"\u003curl\u003e\"",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "Enter credentials and click login",
  "keyword": "Then "
});
formatter.step({
  "line": 6,
  "name": "Click on Fleece Jacket",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "Add Items to the Cart",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Click on cart",
  "keyword": "Then "
});
formatter.step({
  "line": 9,
  "name": "Click on CheckoutButton",
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "Plugin cutomer data and click continue",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "Click on finish order",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "Verify order was placed",
  "keyword": "Then "
});
formatter.match({
  "arguments": [
    {
      "val": "\u003curl\u003e",
      "offset": 8
    }
  ],
  "location": "HomePageStepDefinition.launch(String)"
});
formatter.result({
  "duration": 1273678400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.enter_credentials_and_click_login()"
});
formatter.result({
  "duration": 6135321900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.click_on_Fleece_Jacket()"
});
formatter.result({
  "duration": 2392789900,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.add_Items_to_the_Cart()"
});
formatter.result({
  "duration": 2119147500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.click_on_cart()"
});
formatter.result({
  "duration": 1309661500,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.click_on_CheckoutButton()"
});
formatter.result({
  "duration": 224431600,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.plugin_cutomer_data_and_click_continue()"
});
formatter.result({
  "duration": 4785357800,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.click_on_finish_order()"
});
formatter.result({
  "duration": 4339168400,
  "status": "passed"
});
formatter.match({
  "location": "HomePageStepDefinition.verify_order_was_placed()"
});
formatter.result({
  "duration": 3479849900,
  "status": "passed"
});
});