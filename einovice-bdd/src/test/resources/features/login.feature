Feature: EINOVICE Login

  Scenario: Successful login
    Given the user is on the login page
    When the user enters valid username and password
    Then the user is taken to the dashboard
