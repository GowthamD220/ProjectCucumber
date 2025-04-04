@Register
Feature:Register Functionality
Scenario:Register Account by entering details in Mandatory field

Given user should navigate to Registration page
When User should enter Personal details in the Mandatory field
When User should select the gender 
|firstName|Gowtham|
|lastName|S|
|email|gowthamd220@gmail.com|
|password|Kavitha@123|
|confirmPassword|Kavitha@123|
And User sould click Register button
Then User should verify Account is registered
