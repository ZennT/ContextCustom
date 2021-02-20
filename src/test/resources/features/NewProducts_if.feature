Feature: Verifying new products

  Scenario: New Products Verification

    Given User is on landing page

    Then Verifies that "Embroidered Apron" is displayed
    Then Verifies that "Unisex Sponge Fleece Drop Shoulder Sweatshirt  |  3945 Bella Canvas" is displayed
    Then Verifies that "Baby Jersey Short Sleeve One Piece |  100B Bella Canvas" is displayed
    Then Verifies that "Unisex V-Neck Tee | Bella + Canvas 3005" is displayed

    Then Verifies that "Embroidered Apron" item name is present
    Then Verifies that "Unisex Sponge Fleece Drop Shoulder Sweatshirt | 3945 Bella Canvas" item name is present
    Then Verifies that "Baby Jersey Short Sleeve One Piece | 100B Bella Canvas" item name is present
    Then Verifies that "Unisex V-Neck Tee | Bella + Canvas 3005" item name is present

    Then Verifies that "$16.50" is present
    Then Verifies that "$18.73" is present
    Then Verifies that "$9.95" is present
    Then Verifies that "$14.99" is present

    And Clicks on More Products button


    #Then Moves on "Embroidered Apron"
    #And  Verifies and clicks on Design and Buy button
    #Then Moves on "Unisex Sponge Fleece Drop Shoulder Sweatshirt | 3945 Bella Canvas"
    #And  Clicks on Design and Buy
    #Then Moves on "Baby Jersey Short Sleeve One Piece | 100B Bella Canvas"
    #And  Clicks on Design and Buy
    #Then Moves on "Unisex V-Neck Tee | Bella + Canvas 3005"
    #And  Clicks on Design and Buy




