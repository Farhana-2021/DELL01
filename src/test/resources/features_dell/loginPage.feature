Feature: Login Page

@TestCase01
Scenario: Verify user can login

Given Open Application "<URL>"
Then Click on Sign In button
Then Click on Sign In link
Then Enter username and password and click
Then Verify user can login