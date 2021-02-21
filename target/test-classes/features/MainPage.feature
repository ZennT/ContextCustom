Feature: Verifying the Main Page

  Scenario: Homepage verification
    Given User is in landing page
    Then Verify that Context Custom logo is present
    Then Verify that "How It Works?" is present
    Then Verify that "Free Mockups" is present
    Then Verify that "Buy Designs" is present
    Then Verify that Search icon is present
    And Verify that "My Account" is present
    And Verify that "My Cart" is present
