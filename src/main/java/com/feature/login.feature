Feature: test login page

Scenario: successful login test

Given user should be open the link
When user should be entered u-name and password
And user should click on login button
Then user should be on home page

Scenario: Search the product
Given user should be open the link     
Then user should enter the product in searchbox
