Feature: Functioality to test the edit lead.

@regression @functional @sanity @smoke
Scenario: Edit the Company Name of the existing lead
#Given Open the browser
#And Enter the URL
Given Enter the username 'DemoSalesManager'
And Enter the password 'crmsfa'

When Click the Login button
Then Home page should be displayed
When Click the CRMSFA link
Then 'My Home' page should be displayed
When Click the 'Leads' link
Then 'Leads' page should be displayed
When Click the 'Find Leads' link
Then Find Leads page should be displayed
When Findby the First name 'JJ'
And Click the Find Leads button
When Click the first resultant First Name
Then The 'View Lead' page should be displayed
When Click the 'Edit' link
Then The 'Edit Lead' page should be displayed
And Clear the Company Name
When Enter the new Company name 'KGFCo'
And Click the Update button
Then The 'View Lead' page should be displayed
And Verify the Company Name and ID
