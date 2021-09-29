@regression @wip
Feature: Latest News

  Scenario: Each news has an author and image
    Given Navigate to homepage
    Then Verify that each news has an image
    Then Verify that each news has an author

  Scenario: Each news' content verify followings
    Given Navigate to homepage
    When Click any news from The Latest News
    Then The browser title is the same with the news title
    Then The links within the news content