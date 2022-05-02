Feature: Login Scenario Outline: Login in Form Authentication using provided credentials

  Scenario Outline: Login in Form Authentication using provided credentials

Given I open the Form Authentication  on the Internet website
When I enter the valid <username> and <password>
Then I should see the validation message on the Secure Area page


Examples:
| username      |  password             |
|tomsmith    | SuperSecretPassword!|

  Scenario Outline: Login in Form Authentication using provided credentials

    Given I open the Form Authentication  on the Internet website
    When I enter the valid <username> and <password>
    Then I should see the validation error message for unsuccessful login


    Examples:
      | username   | password |
      | randomuser | 12345    |

