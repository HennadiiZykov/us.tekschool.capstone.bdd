@CompleteTestHome
Feature: Home Page

@TestCurrency
Scenario: User verify currency values change
Given I am on Test Envirement Home Page
When User click on Currency 
And User Chose Euro from dropdown 
Then currency value should change to Euro

@TestMessageShopingCart
Scenario: User empty Shopping cart message displays 
Given User is on Retail websiteWhen User click on shopping cart 
Then “Your shopping cart is empty!” message should display