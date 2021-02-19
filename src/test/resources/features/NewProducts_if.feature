Feature: Verifying new products
  Scenario: New Products Verification
    Given User is on landing page

    Then Verifies that "Embroidered Apron" is displayed
    Then Verifies that "Unisex Sponge Fleece Drop Shoulder Sweatshirt  |  3945 Bella Canvas" is displayed
    Then Verifies that "Baby Jersey Short Sleeve One Piece |  100B Bella Canvas" is displayed
    Then Verifies that "Unisex V-Neck Tee | Bella + Canvas 3005" is displayed

    Then Verifies that "Embroidered Apron" item name is present
    Then Verifies that "Unisex V-Neck Tee" item name is present
    Then Verifies that "Baby Jersey Short Sleeve" item name is present
    Then Verifies that "Unisex V-Neck Tee Bella|Canvas" item name is present

    Then Verifies that "Embroidered Apron Price" is present
    Then Verifies that "Unisex Sponge Fleece Drop Shoulder Sweatshirt Price" is present
    Then Verifies that "Baby Jersey Short Sleeve One Piece Price" is present
    Then Verifies that "Unisex V-Neck Tee Price" is present

    Then Verifies that "Embroidered Apron Review Stars" is present
    Then Verifies that "Unisex Sponge Fleece Drop Shoulder Sweatshirt Review Stars" is present
    Then Verifies that "Baby Jersey Short Sleeve Review Stars" is present
    Then Verifies that "Unisex V-Neck Tee Review Stars" is present

    #Then Moves on "Embroidered Apron"
    And  Verifies and clicks on Design and Buy button
    Then Moves on "Unisex Sponge Fleece Drop Shoulder Sweatshirt | 3945 Bella Canvas"
    And  Clicks on Design and Buy
    Then Moves on "Baby Jersey Short Sleeve One Piece | 100B Bella Canvas"
    And  Clicks on Design and Buy
    Then Moves on "Unisex V-Neck Tee | Bella + Canvas 3005"
    And  Clicks on Design and Buy




