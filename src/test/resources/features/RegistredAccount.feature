Feature: Register Account



@RegisterAccount
Scenario: Register to Retail Website
		Given I am on Test Envirement Home Page
    When I click My Account Button
    And user click on Register option
    And user fill the register form with below information
      | firstName | lastName | email                   | telephone  | password        | passwordConfirm | subscribe |
      | Yehor     | Zykov    | 3Yehor_Zykov@tekschool.us | 2021010007 | 0972121839Boom! | 0972121839Boom! | yes       |
    And user accept privacyPolicy
    And user click on Continue Button
    Then user should see a successfull message "Your Account Has Been Created!"