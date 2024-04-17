$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/health1.feature");
formatter.feature({
  "name": "Click the Page",
  "description": "",
  "keyword": "Feature"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "open the Browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.open_the_Browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Home page click and Lanunch",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test1"
    }
  ]
});
formatter.step({
  "name": "User navigate to the Given URl",
  "keyword": "When "
});
formatter.match({
  "location": "StepDefinitionClass.user_navigate_to_the_Given_URl()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User click the Spline \u0026 Pain logo",
  "keyword": "And "
});
formatter.match({
  "location": "StepDefinitionClass.user_click_the_Spline_Pain_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Should open the new Webpage With Details",
  "keyword": "Then "
});
formatter.match({
  "location": "StepDefinitionClass.should_open_the_new_Webpage_With_Details()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "open the Browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.open_the_Browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User should see all menu items",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test2"
    }
  ]
});
formatter.step({
  "name": "User looks at the menu bar",
  "keyword": "When "
});
formatter.match({
  "location": "StepMenuFunctionality.user_looks_at_the_menu_bar()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User navigate the menus",
  "keyword": "And "
});
formatter.match({
  "location": "StepMenuFunctionality.user_navigate_the_menus()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should see click all menus",
  "keyword": "Then "
});
formatter.match({
  "location": "StepMenuFunctionality.user_should_see_click_all_menus()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "open the Browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.open_the_Browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "User Should Navigate the Spine and pain logo",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Test3"
    }
  ]
});
formatter.step({
  "name": "User click the spine and pain logo",
  "keyword": "When "
});
formatter.match({
  "location": "StepActionsFunctionality.user_click_the_spine_and_pain_logo()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User enter the zip code",
  "keyword": "And "
});
formatter.match({
  "location": "StepActionsFunctionality.user_enter_the_zip_code()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should click the search and go",
  "keyword": "And "
});
formatter.match({
  "location": "StepActionsFunctionality.user_should_click_the_search_and_go()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "User should navigate to new page",
  "keyword": "Then "
});
formatter.match({
  "location": "StepActionsFunctionality.user_should_navigate_to_new_page()"
});
formatter.result({
  "status": "passed"
});
formatter.scenarioOutline({
  "name": "Location Search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test4"
    }
  ]
});
formatter.step({
  "name": "The user navigate the Find Location",
  "keyword": "When "
});
formatter.step({
  "name": "The user enters \"\u003cZip code\u003e\" and \"\u003cState\u003e\" and \"\u003cLocation\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "The user should be see the location details displayed",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "Zip code",
        "State",
        "Location"
      ]
    },
    {
      "cells": [
        "20105",
        "VA",
        "Aldie"
      ]
    },
    {
      "cells": [
        "20695",
        "MD",
        "White Plains"
      ]
    },
    {
      "cells": [
        "invalid",
        "invalid",
        "invalid"
      ]
    }
  ]
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "open the Browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.open_the_Browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Location Search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test4"
    }
  ]
});
formatter.step({
  "name": "The user navigate the Find Location",
  "keyword": "When "
});
formatter.match({
  "location": "StepScenarioOutline.the_user_navigate_the_Find_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \"20105\" and \"VA\" and \"Aldie\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepScenarioOutline.the_user_enters_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be see the location details displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepScenarioOutline.the_user_should_be_see_the_location_details_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "open the Browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.open_the_Browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Location Search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test4"
    }
  ]
});
formatter.step({
  "name": "The user navigate the Find Location",
  "keyword": "When "
});
formatter.match({
  "location": "StepScenarioOutline.the_user_navigate_the_Find_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \"20695\" and \"MD\" and \"White Plains\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepScenarioOutline.the_user_enters_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be see the location details displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepScenarioOutline.the_user_should_be_see_the_location_details_displayed()"
});
formatter.result({
  "status": "passed"
});
formatter.background({
  "name": "",
  "description": "",
  "keyword": "Background"
});
formatter.step({
  "name": "open the Browser and maximize the window",
  "keyword": "Given "
});
formatter.match({
  "location": "StepDefinitionClass.open_the_Browser_and_maximize_the_window()"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Location Search",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test4"
    }
  ]
});
formatter.step({
  "name": "The user navigate the Find Location",
  "keyword": "When "
});
formatter.match({
  "location": "StepScenarioOutline.the_user_navigate_the_Find_Location()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user enters \"invalid\" and \"invalid\" and \"invalid\"",
  "keyword": "And "
});
formatter.match({
  "location": "StepScenarioOutline.the_user_enters_and_and(String,String,String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The user should be see the location details displayed",
  "keyword": "Then "
});
formatter.match({
  "location": "StepScenarioOutline.the_user_should_be_see_the_location_details_displayed()"
});
formatter.result({
  "status": "passed"
});
});