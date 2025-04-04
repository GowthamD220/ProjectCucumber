@Checkout
Feature:Checkout functionality
Scenario:Checkout the product we added in the cart

Given User should navigate to Shopping cart page
When User should click the terms of service
And User should click the checkout button
When user should enter the below details for checkout
|company|cognizent|
|city|chennai|
|address1|balaji nagar puzhuthivakkam|
|address2|chinnamal nagar puzhuthivakkam|
|zipCode|600091|
|phonenumber|1234567890|
|faxnumber|0987654321|
When User select county "India" from dropdown
And User should click the continue button
When User should click in-store pick up checkbox
And user should click continue button
When User should select cash on delivery option
And click continue button
And check for you will pay by COD and then click continue button
And User should click the confirm button
Then User should verify order has been successfullly processed