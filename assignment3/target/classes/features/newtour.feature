#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template
@register
Feature: Title of your feature
  I want to register to newtour

  @register
  Scenario Outline: I want to register to newtour
    Given I open <Browser>
    And I navigate to url
    And I click on register_xpath
    And In firstname_xpath I enter <first_name>
    And In lastname_xpath I enter <last_name>
    And In phone_xpath I enter <phone>
    And In email_xpath I enter <email>
    And In address_xpath I enter <address>
    And In city_xpath I enter <city>
    And In state_xpath I enter <state>
    And In postal_xpath I enter <postal_code>
    And In country_xpath I select
      | India |
    And In username_xpath I enter <username>
    And In password_xpath I enter <password>
    And In confirmpassword_xpath I enter <confirm_password>
    And I click on submit_xpath

    Examples: 
      | Browser | first_name | last_name | phone      | email            | address     | city       | state     | postal_code | username | password | confirm_password |
      | Mozilla | first1     | last1     | 8793497934 | test1@gmail.com  | 1st street  | Bangalore  | Karnataka |       45356 | user1    | pass1    | pass1            |
      | Mozilla | first2     | last2     | 7877878342 | test2@gmail.com  | 2nd street  | Tumkur     | Karnataka |       34355 | user2    | pass2    | pass2            |
      | Mozilla | first3     | last3     | 3432423343 | test3@gmail.com  | 3rd street  | Bagalkot   | Karnataka |       45345 | user3    | pass3    | pass3            |
      | Mozilla | first4     | last4     | 1234354677 | test4@gmail.com  | 4th street  | Udupi      | Karnataka |       34534 | user4    | pass4    | pass4            |
      | Mozilla | first5     | last5     | 5645645645 | test5@gmail.com  | 5th street  | Mysore     | Karnataka |       55777 | user5    | pass5    | pass5            |
      | Mozilla | first6     | last6     | 4463363634 | test6@gmail.com  | 6th street  | Mandya     | Karnataka |       86544 | user6    | pass6    | pass6            |
      | Mozilla | first7     | last7     | 6565656456 | test7@gmail.com  | 7th street  | Kolar      | Karnataka |       64545 | user7    | pass7    | pass7            |
      | Mozilla | first8     | last8     | 8542357777 | test8@gmail.com  | 8th street  | Hassan     | Karnataka |       56457 | user8    | pass8    | pass8            |
      | Mozilla | first9     | last9     | 7987777344 | test9@gmail.com  | 9th street  | Gulbarga   | Karnataka |       98354 | user9    | pass9    | pass9            |
      | Mozilla | first10    | last10    | 9997766223 | test10@gmail.com | 10th street | Davanagere | Karnataka |       33536 | user10   | pass10   | pass10           |
