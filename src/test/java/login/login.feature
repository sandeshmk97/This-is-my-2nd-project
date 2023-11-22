Feature: Register Functionality
Scenario: I want to test the Register functionality using valid credentials
Given open the browser
Given navigate to "https://mbasic.facebook.com"website
When click on create New Account
When enter valid First Name
When enter valid Sur Name
When Enter valid Email Address
When click on valid gender
When Enter valid date of Birth
When Enter valid password
When Click on sign up
When Enter Confirmation code
When Click On confirm
When enter a  valid email id
And Close the Browser


Feature: Login and Logout Functionality
Scenario: I want to test the Login functionality and logout using valid credentials
Given open the browser
Given navigate to "https://mbasic.facebook.com"website
When enter a valid email
When enter a valid password
When click on Log in button
When click on ok 
When click on logout
And Close the Browser


Feature: Login invalid credential Functionality
Scenario: I want to test the Login functionality and logout using Invalid credentials
Given open the browser
Given navigate to "https://mbasic.facebook.com"website
When enter a invalid email
When enter a invalid password
When click on Log in button
And Close the Browser

Feature: Sending friend request
Scenario: I want to test the send friend request using valid credentials
When click on find friends
When click on search for friends
When Enter valid friend name
When Click on search
When Enter valid friend name1
When Click on search1
When Click on Add friend
Then verify home page
And Close the Browser
When click on name
When click on edit profile
When click on friends 
When click on delete
When click on profile
And Close the Browser


Feature: accepting friend request
Scenario: I want to accept friend request using valid credentials
Given open the browser
Given navigate to "https://mbasic.facebook.com"website
When enter a valid email
When enter a valid password
When click on Log in button
When click on ok
When Click on Find Friends
When click on confirm
And Close the Browser

Feature: viewing my own and other profiles functionality
Scenario: I want to view my own and other profiles using valid credentials
Given open the browser
Given navigate to "https://mbasic.facebook.com" website
When enter a valid email
When enter a valid password
When click on Log in button
When click on ok 
When click on Edit profile
When click on find friends
When enter valid name
When Click on search
When click on name




