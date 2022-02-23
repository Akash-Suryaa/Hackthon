@Gmail
Feature: Login Gmail


Scenario: Login Gmail with valid credentials

Given Open the browser and add Url
And user enters email and password
Then verify Page title
When user clicks on compose button
And enters text in subject
And enters text in body
And user select email as social
And user clicks on apply button
And user send the email to the same account