Feature: Home page
  As user I want to go to careers page

  Scenario: User should navigate to contact us successfully
    Given I am on homepage
    When I click on accept cookies
    And I click on contact us link
    Then I verify text om contact us page


