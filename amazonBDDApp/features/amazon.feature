Feature: Add Items to cart in Amazon

Scenario: User adds Items to the cart Proceed to checkout
Given User access the amazon page in chrome
When User chooses produts
And User Proceeds to checkOut
And User Enters his credentials
Then User should Proceed to ShipmentPage


