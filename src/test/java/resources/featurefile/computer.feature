@regression
Feature: Computer Test

  @smoke, @regression
  Scenario: Verify User should Navigate to Computer Page Successfully
    Given I am on homepage
    When I click on computer tab "Computers"
    Then I should be able to Verify  text

  @sanity, @regression

  Scenario: Verify User should Navigate to Desktops page Successfully
    Given I am on homepage
    When I click on computer tab "Computers"
    And I click on Desktop link "Desktops"
    Then I should be able to verify Desktop text

  @regression
  Scenario Outline: Verify that User Should Build Your Own Computer and Add Them to cart Successfully
    Given I am on homepage
    When I click on computer tab "Computers"
    And I click on Desktop link "Desktops"
    And I click on product name build your own computer
    And I select processor "<processor>"
    And I select RAM "<ram>"
    And I select HDD "<hdd>"
    And I select OS "<os>"
    And I select Software "<software>"
    And I click on  Button
    Then I verify  the message
    Examples:
      | processor                                       | ram           | hdd               | os                     | software                   |
      | 2.2 GHz Intel Pentium Dual-Core E2200           | 2GB           | 320GB             | Vista Home[+$50.00]    | Microsoft Office [+$50.00] |
      | 2.5 GHz Intel Pentium Dual -Core E2200[+$15.00] | 4GB [+$20.00] | 400 GB [+$100.00] | Vista Premium[+$60.00] | Acrobat Reader[+$10.00]    |
      | 2.5 GHz Intel Pentium Dual -Core E2200[+$15.00] | 8GB [+60.00]  | 320 GB            | Vista Home [+$50.00]   | Total Commander [+$5.00]   |