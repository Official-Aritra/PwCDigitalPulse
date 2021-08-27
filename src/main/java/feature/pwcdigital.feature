Feature: PwC Digital pulse website

Scenario: PwC Digital pulse Search Validation Test Scenario
Given I navigate to the PwC Digital Pulse website
When I click on the Magnifying glass icon to perform a search
And I enter the text 'Single page application'
And I submit the search
Then I am taken to the search results page
And I am presented with atleast 1 search result