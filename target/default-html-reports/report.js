$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/News.feature");
formatter.feature({
  "name": "Latest News",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@wip"
    }
  ]
});
formatter.scenario({
  "name": "Each news has an author and image",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@wip"
    },
    {
      "name": "@first"
    }
  ]
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "Navigate to homepage",
  "keyword": "Given "
});
formatter.match({
  "location": "com.TechCrunch.stepDefs.NewsDefs.navigate_to_homepage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that each news has an image",
  "keyword": "Then "
});
formatter.match({
  "location": "com.TechCrunch.stepDefs.NewsDefs.verifyThatEachNewsHasAnImage()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verify that each news has an author",
  "keyword": "Then "
});
formatter.match({
  "location": "com.TechCrunch.stepDefs.NewsDefs.verifyThatEachNewsHasAnAuthor()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});