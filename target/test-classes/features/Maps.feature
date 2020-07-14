Feature: New Deals using creation feature

Scenario: Creating new Deal Scenario
Given When user is on Free CRM login page
When user enters userid and password
 | userid | password |
 | rssprakash99@gmail.com | Puja29.01 |
 Then user clicks on login button
 Then user navigated to home page
 Then user clicks on deals button and clicks New button
 Then user entered into new deal page
 Then user gives deal details
  | title | probability | amount |
  | test deal1 | 90 | 1000 |
  | test deal2 | 100 | 1100 |
  | test deal3 | 110 | 1200 |
 Then close the browser
 