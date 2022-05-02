Feature: Login

  Scenario Outline: Login in Form Authentication using correct credentials

    Given I open the Form Authentication  on the Internet website
    When I enter the valid <username> and <password>
    Then I should see the validation message on the Secure Area page


    Examples:
      | username | password             |
      | tomsmith | SuperSecretPassword! |

  Scenario Outline: Login in Form Authentication using wrong credentials

    Given I open the Form Authentication  on the Internet website
    When I enter the valid <username> and <password>
    Then I should see the error message for unsuccessful login


    Examples:
      | username   | password |
      | randomuser | 12345    |

