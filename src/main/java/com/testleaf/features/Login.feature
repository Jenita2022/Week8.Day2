Feature: Test the login functionality for leaftaps application

@regression
Scenario Outline: Login with positive credendials
Given Enter the username <username>
And Enter the password <pwd>
When Click the Login button
Then Home page should be displayed
Examples:
|username|pwd|
|'DemoSalesManager'|'crmsfa'|
|'DemoCSR'|'crmsfa'|

#@smoke
#Scenario: Login with negative credendials
#Given Enter the url 'http://leaftaps.com/opentaps'
#And Enter the username 'Demo'
#And Enter the password 'crmsfa'
#When Click Login button
#But Home page should not be displayed


