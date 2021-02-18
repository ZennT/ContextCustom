Feature: Verifying new products
  Scenario: New Products Verification
    Given User is on landing page
    Then Verifies that "Embroidered Apron image" is present
    Then Verifies that "UnisexSpongeFleece image" is present
    Then Verifies that Embroidered Apron image is present
    Then Verifies that UnisexSpongeFleece image is present
    Then Verifies that Baby Jersey image is present
    Then Verifies that Unisex V-Neck Tee image is present
    Then Moves to apron part
    And Clicks on Design and Buy
    #Then Clicks on More Products button

