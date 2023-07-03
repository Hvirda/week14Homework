Feature:login feature
  As a User want to check login functionality
  @smoke
  Scenario:User should login successfully with valid credentials
    Given User is on homepage
    When I enter username "Admin"
    And I enter password "admin123"
    And I click on login button
    Then I should login successfully and see "Dashboard"