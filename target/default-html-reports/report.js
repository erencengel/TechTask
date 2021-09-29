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
formatter.scenario({
  "name": "Each news\u0027 content verify followings",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@regression"
    },
    {
      "name": "@wip"
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
  "name": "Click any news from The Latest News",
  "keyword": "When "
});
formatter.match({
  "location": "com.TechCrunch.stepDefs.AnyNewsPageDefs.click_any_news_from_The_Latest_News()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The browser title is the same with the news title",
  "keyword": "Then "
});
formatter.match({
  "location": "com.TechCrunch.stepDefs.AnyNewsPageDefs.the_browser_title_is_the_same_with_the_news_title()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The links within the news content",
  "keyword": "Then "
});
formatter.match({
  "location": "com.TechCrunch.stepDefs.AnyNewsPageDefs.theLinksWithinTheNewsContent()"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});