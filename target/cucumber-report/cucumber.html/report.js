$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("careers.feature");
formatter.feature({
  "line": 1,
  "name": "Home page",
  "description": "As user I want to go to careers page",
  "id": "home-page",
  "keyword": "Feature"
});
formatter.before({
  "duration": 5247079600,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "User should navigate to contact us successfully",
  "description": "",
  "id": "home-page;user-should-navigate-to-contact-us-successfully",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "I am on homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "I click on accept cookies",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "I click on contact us link",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I verify text om contact us page",
  "keyword": "Then "
});
formatter.match({
  "location": "CareersSteps.iAmOnHomepage()"
});
formatter.result({
  "duration": 124516000,
  "status": "passed"
});
formatter.match({
  "location": "CareersSteps.iClickOnAcceptCookies()"
});
formatter.result({
  "duration": 180149300,
  "status": "passed"
});
formatter.match({
  "location": "CareersSteps.iClickOnContactUsLink()"
});
formatter.result({
  "duration": 5510254400,
  "status": "passed"
});
formatter.match({
  "location": "CareersSteps.iVerifyTextOmContactUsPage()"
});
formatter.result({
  "duration": 2065529900,
  "status": "passed"
});
formatter.after({
  "duration": 175500,
  "status": "passed"
});
});