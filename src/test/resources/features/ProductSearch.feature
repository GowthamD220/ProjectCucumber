@ProductSearch
Feature:Search Functionality
Scenario:Search product and add it to the cart

Given User should enter the product name "Build your own cheap computer" into search field
And User should click the search button
Then User shouldd verify that he found the relevent product
And User should click the product 
And User should click the add to cart button
Then User should verify product is added to the cart
