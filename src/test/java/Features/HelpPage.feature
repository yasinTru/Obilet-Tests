@HelpPage
  Feature: Help Page Tests
    Scenario: User Goes to Help Page
      Given User on Home Page
      When  User clicks Help Page button
      Then  User should see Help Page opens

      Scenario Outline:User Search Otobüs in Searchbox
        Given User on Home Page
        When  User clicks Help Page button
        Then  User should see Help Page opens
        When  User types "<otobus>" to searchbox and press enter
        Then  Clicks  2th result in the list
        Then  User should see same searched text title
        Then  User should see results details page

        Examples:
        |otobus|
        |otobüs|
