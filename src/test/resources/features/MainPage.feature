Feature: Verifying the Main Page

  Scenario: Homepage verification
    Given User is in landing page
    Then Verify that Context Custom logo is present
    Then Verify that "Categories" is present
    Then Verify that "Log in" is present
    And Verify that "Sign up" is present
    And
    And Verify that "How It Works?" is present
    And Verify that "Free Mockups" is present
    And Verify that "My Account" is present
    And Verify that "My Cart" is present
    Then Verify that Gildan and Bella+CANVAS logo is present