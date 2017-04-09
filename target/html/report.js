$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("DashboardFeatures.feature");
formatter.feature({
  "line": 1,
  "name": "Dashboard Functionality",
  "description": "",
  "id": "dashboard-functionality",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 3,
  "name": "To test the Dashboard Functionality",
  "description": "",
  "id": "dashboard-functionality;to-test-the-dashboard-functionality",
  "type": "scenario_outline",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "You are on Dashboard page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "You are on Menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Check Menu and Login options with \"\u003cuserName\u003e\" and \"\u003cpassword\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "line": 7,
  "name": "",
  "description": "",
  "id": "dashboard-functionality;to-test-the-dashboard-functionality;",
  "rows": [
    {
      "cells": [
        "userName",
        "password"
      ],
      "line": 8,
      "id": "dashboard-functionality;to-test-the-dashboard-functionality;;1"
    },
    {
      "cells": [
        "ashu271989@gmail.com",
        "24374767"
      ],
      "line": 9,
      "id": "dashboard-functionality;to-test-the-dashboard-functionality;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.scenario({
  "line": 9,
  "name": "To test the Dashboard Functionality",
  "description": "",
  "id": "dashboard-functionality;to-test-the-dashboard-functionality;;2",
  "type": "scenario",
  "keyword": "Scenario Outline"
});
formatter.step({
  "line": 4,
  "name": "You are on Dashboard page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "You are on Menu",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "Check Menu and Login options with \"ashu271989@gmail.com\" and \"24374767\"",
  "matchedColumns": [
    0,
    1
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "DashboardPageStepDefinition.you_are_on_Dashboard_page()"
});
formatter.result({
  "duration": 40142135736,
  "status": "passed"
});
formatter.match({
  "location": "DashboardPageStepDefinition.you_are_on_menu()"
});
formatter.result({
  "duration": 9953998740,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "ashu271989@gmail.com",
      "offset": 35
    },
    {
      "val": "24374767",
      "offset": 62
    }
  ],
  "location": "DashboardPageStepDefinition.check_menu_and_login(String,String)"
});
formatter.result({
  "duration": 35195177019,
  "status": "passed"
});
formatter.uri("MensPageFeatures.feature");
formatter.feature({
  "line": 1,
  "name": "Men\u0027s Page Feature",
  "description": "",
  "id": "men\u0027s-page-feature",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "To test Mens page functionality",
  "description": "",
  "id": "men\u0027s-page-feature;to-test-mens-page-functionality",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "You are on Mens page",
  "keyword": "Given "
});
formatter.match({
  "location": "MensPageStepDefinition.you_are_on_mens_page()"
});
formatter.result({
  "duration": 76226,
  "status": "passed"
});
});