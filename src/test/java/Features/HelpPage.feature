@HelpPage
  Feature: Help Page Tests
    Scenario: User Goes to Help Page
      Given User on Home Page
      When  User clicks Help Page button
      Then  User should see Help Page opens
