Feature: Login Access

  Scenario: User log in with valid data
    Given  the user is on the login page
    When the user enter valid data
    Then the user should see the dashboard

    Scenario: User log in with invalid data
      Given the user is on the login page
      When the user enter invalid data
      Then the user should see an error message
