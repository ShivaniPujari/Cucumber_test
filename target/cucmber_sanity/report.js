$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/java/Features/Tagging.feature");
formatter.feature({
  "name": "Application Login",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Home page Registertation",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Sanity"
    }
  ]
});
formatter.step({
  "name": "User is at landing page",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinations.stepDeination.User_is_at_landing_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User submit following details",
  "rows": [
    {},
    {},
    {}
  ],
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinations.stepDeination.user_submit_following_details(io.cucumber.datatable.DataTable)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Home page is displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinations.stepDeination.Home_page_is_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Cards are displayed",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinations.stepDeination.Cards_are_displayed()"
});
formatter.result({
  "status": "passed"
});
});