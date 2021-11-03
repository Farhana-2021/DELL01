Feature: Home Page

@TestCase01
Scenario: Verify search result display

Given Open Application "<URL>"
Then Enter XPS in Search Field
Then Click on SearchLink
Then Verify search result display