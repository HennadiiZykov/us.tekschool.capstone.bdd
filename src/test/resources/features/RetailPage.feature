@CompleteTestRetaile
Feature: Login on Website



  Background: Login on Website
    Given I am on Test Envirement Home Page
    When I click My Account Button
    And I click Drop Down Menu Login Button
    And I Enter username '3Yehor_Zykov@tekschool.us' and password '0972121839Boom!'
    And I click on Login button
    Then I am logged entro my test Enviroment account

   

  @EditAffiliateInformation
  Scenario: Edit your affiliate information from Cheque payment method to Bank Transfer
    When User click on ‘Edit your affiliate information link
    And user click on Bank Transfer radio button
    And User fill Bank information with below information
      | bankName | abaNumber | swiftCode | accountName | accountNumber |
      | Chase    |  12312321 |     11222 | Yehor       |     558866887 |
    And User click on Continue button
    Then User should see a success message

  @EditAccountInformation
  Scenario: Edit your account Information
    When User click on ‘Edit your account information’ link
    And User modify below information
      | firstname | lastName | email         | telephone  |
      | Hennadii  | Zykov    | pro4@gmail.com | 3334445511 |
    And User click on Continue button
    Then User should see a message ‘Success: Your account has been successfully updated.’
