@regression
Feature: Login Test
  As user I want to login into nop commerce website

  @smoke
  Scenario:User should navigate to login page successfully
    Given I am on homepage
    When I click on login link
    Then I should be able to verify that "Welcome, Please Sign In!" message is displayed

    @sanity
    Scenario:Verify the Error Message has displayed  with Invalid credentials
      Given I am on homepage
      When I click on login link
      And I enter email "avanti@gmail.com"
      And I enter password "world123"
      And I click on login button
      Then I should see the error message

  @regression
  Scenario:User should login successfully with valid credentials
    Given I am on homepage
    When I click on login link
    And I enter email "ada12@gmail.com"
    And I enter password "Helloworld"
    And I click on login button
    Then I should logout link displayed

    @regression
    Scenario:Verify That User Should Logout Successfully
      Given I am on homepage
      When I click on login link
      And I enter email "ada12@gmail.com"
      And I enter password "Helloworld"
      And I click on login button
      Then I should see login link displayed




