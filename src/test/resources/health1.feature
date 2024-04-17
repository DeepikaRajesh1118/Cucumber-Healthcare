Feature: Click the Page
Background:
Given open the Browser and maximize the window

@Test1
Scenario: Home page click and Lanunch
  When User navigate to the Given URl
  And User click the Spline & Pain logo
  Then Should open the new Webpage With Details
@Test2
Scenario: User should see all menu items
  When User looks at the menu bar
  And User navigate the menus
  Then User should see click all menus
@Test3 
Scenario: User Should Navigate the Spine and pain logo
  When User click the spine and pain logo
  And User enter the zip code
  And User should click the search and go
  Then User should navigate to new page
     
@Test4
Scenario Outline: Location Search
  When The user navigate the Find Location
  And The user enters "<Zip code>" and "<State>" and "<Location>"
  Then The user should be see the location details displayed 

  Examples:
    | Zip code  | State | Location   |
    | 20105     |  VA   |  Aldie     |
    | 20695     |  MD   |White Plains|
    | invalid   | invalid| invalid   |
