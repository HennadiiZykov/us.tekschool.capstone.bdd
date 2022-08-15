@CompleteTest
Feature: Desktop Tap

  Background: 
    Given I am on Test Envirement Home Page
    When User click on Desktops tab
    And User click on Show all desktops

  @SmokeTest1
  Scenario: User verify all items are present in Desktops tab
    Then User should see all items are present in Desktop page

  @SmokeTest2
  Scenario: User add HP LP 3065  from Desktops tab to the cart
    And User click  ADD TO CART option on HP LP3065item
    And User select quantity '1'
    And User click add to Cart button
    Then User should see a message'Success: You have added HP LP3065 to your shopping cart!'

  @SmokeTest3
  Scenario: User add Canon EOS 5D from Desktops tab to the cart
    And User click  ADD TO CART option on Canon EOS 5Ditem
    And User select color from dropdown Red
    And User select quantity '1'
    And User click add to Cart button
    Then User should see a message1'Success: You have added Canon EOS 5D Camera to your shopping cart!'

  @SmokeTest4
  Scenario: User add a review to Canon EOS 5D item inDesktops tab
    And User click on Canon EOS 5D item
    And User click on write a review link
    And user fill the review information with below information
      | yourname       | yourReview                                       | Rating |
      | Hennadii Zykov | Good price and good qualety for avery one and me |      3 |
    And User click on Continue Button
    Then User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval.'
