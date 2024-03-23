Feature:  Login to Leaftab Application

Scenario: Login with valid credentials 
#Given Launch the browser and Load the leaftap URL 
When Enter the UserName as 'DemoSalesManager'
And Enter the password as 'crmsfa'
And Click on the Login Button
Then Home Page should be displayed

