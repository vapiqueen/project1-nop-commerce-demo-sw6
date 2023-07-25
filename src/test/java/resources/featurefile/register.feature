@regression
Feature: Register Test

  @smoke, @regression
  Scenario: Verify User should Navigate to Register page successfully
    Given I am on homepage
    When I click on register link
    Then I should see the Registration link

  @  @sanity, @regression
  Scenario: Verify that FirstName,LastName,Email,Password and Confirm password field are Mandatory
    Given  I am on homepage
    When I click on register link
    And I click on "REGISTER" button
    And I should see the error message "First name is required"
    And I should see the error message "Last name is required"
    And I should see the error message "Email address is required"
    And I should see the error message "Password is required"
    And I should see the error message "Confirm password required"

  @regression
  Scenario: Verify That User Should Create Account Successfully
    Given I am on homepage
    When I click on register link
    And I select gender "Female"
    And I enter firstname "Aarti"
    And I enter lastname "Doshi"
    And I select date of birth day "12"
    And I select date of birth month "January"
    And I select date of birth year "1980"
    And I enter the email address "ada123@gmail.com"
    And I enter the password "Helloworld"
    And I enter the confirm password "Helloworld"
    And I click on register button
    Then I should see the message "Your registration completed"


