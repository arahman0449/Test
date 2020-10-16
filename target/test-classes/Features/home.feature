Feature: Test Login functionality
@Order
Scenario: Login and purchase 
Given Launch "<url>"
Then Enter credentials and click login
Then Click on Fleece Jacket
Then Add Items to the Cart
Then Click on cart 
Then Click on CheckoutButton 
Then Plugin cutomer data and click continue
Then Click on finish order
Then Verify order was placed

@Login
Scenario: Verify Login
Given Launch "<url>"
Then Enter credentials and click login
Then Click on Sauce Labs Backpack 
Then Verify Backpack product info

