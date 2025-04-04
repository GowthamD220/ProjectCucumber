@Login
Feature:Login Funcionality
Scenario:Login with valid Credentials

Given user should navigate to login page
When User should enter valid "gowthamd220@gmail.com" email into email field
When User should enter valid "Kavitha@123" password into password field 
And User should click login button
Then User should verify successfully logged in
