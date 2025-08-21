Feature: Dashboard Navigation

  Scenario: Navigate to Invoices page
    Given the user is logged in and on the dashboard
    When the user clicks on the Invoices link
    Then the user should be on the Invoices page

  Scenario: Navigate to Profile page
    Given the user is logged in and on the dashboard
    When the user clicks on the Profile link
    Then the user should be on the Profile page

  Scenario: Navigate to Reports page
    Given the user is logged in and on the dashboard
    When the user clicks on the Reports link
    Then the user should be on the Reports page
