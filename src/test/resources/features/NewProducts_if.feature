Feature: Verifying new products

  Scenario: New Products Verification

    Given User is on landing page

    @images
    Then Verifies that "Embroidered Apron" is displayed
    Then Verifies that "Unisex Sponge Fleece Drop Shoulder Sweatshirt  |  3945 Bella Canvas" is displayed
    Then Verifies that "Baby Jersey Short Sleeve One Piece |  100B Bella Canvas" is displayed
    Then Verifies that "Unisex V-Neck Tee | Bella + Canvas 3005" is displayed

    @itemNames
    Then Verifies that "Embroidered Apron" item name is present
    Then Verifies that "Unisex Sponge Fleece Drop Shoulder Sweatshirt | 3945 Bella Canvas" item name is present
    Then Verifies that "Baby Jersey Short Sleeve One Piece | 100B Bella Canvas" item name is present
    Then Verifies that "Unisex V-Neck Tee | Bella + Canvas 3005" item name is present

    @prices
    Then Verifies that "$16.50" is present
    Then Verifies that "$18.73" is present
    Then Verifies that "$9.95" is present
    Then Verifies that "$14.99" is present

    @brandNames
    Then Verifies that "Context" brand name is present
    Then Verifies that "Bella canvas" brand name is present
    Then Verifies that "Bella canvas" brand name is present
    Then Verifies that "Bella canvas" brand name is present


    #Then Moves to "Embroidered Apron"
    #And  Verifies that "Design & Buy" button is present
    #Then Moves to "Unisex Sponge Fleece Drop Shoulder Sweatshirt | 3945 Bella Canvas"
    #And  Verifies that "Design & Buy" button is present
    #Then Moves to "Baby Jersey Short Sleeve One Piece | 100B Bella Canvas"
    #And  Verifies that "Design & Buy" button is present
    #Then Moves to "Unisex V-Neck Tee | Bella + Canvas 3005"
    #And  Verifies that "Design & Buy" button is present


    And Clicks on More Products button






