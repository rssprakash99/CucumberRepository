$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/java/features/TaggedHooks.feature");
formatter.feature({
  "line": 1,
  "name": "Demo Tagged Hooks feature",
  "description": "",
  "id": "demo-tagged-hooks-feature",
  "keyword": "Feature"
});
formatter.before({
  "duration": 761100,
  "status": "passed"
});
formatter.before({
  "duration": 367900,
  "status": "passed"
});
formatter.before({
  "duration": 160300,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "This is first Step",
  "description": "",
  "id": "demo-tagged-hooks-feature;this-is-first-step",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 2,
      "name": "@First"
    }
  ]
});
formatter.step({
  "line": 4,
  "name": "This is first test",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "This is second test",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "This is third test",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_first_test()"
});
formatter.result({
  "duration": 162325300,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_second_test()"
});
formatter.result({
  "duration": 330600,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_third_test()"
});
formatter.result({
  "duration": 80700,
  "status": "passed"
});
formatter.after({
  "duration": 64500,
  "status": "passed"
});
formatter.after({
  "duration": 70900,
  "status": "passed"
});
formatter.before({
  "duration": 165900,
  "status": "passed"
});
formatter.before({
  "duration": 379300,
  "status": "passed"
});
formatter.before({
  "duration": 223200,
  "status": "passed"
});
formatter.scenario({
  "line": 8,
  "name": "This is second Step",
  "description": "",
  "id": "demo-tagged-hooks-feature;this-is-second-step",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 7,
      "name": "@Second"
    }
  ]
});
formatter.step({
  "line": 9,
  "name": "This is frist test",
  "keyword": "Given "
});
formatter.step({
  "line": 10,
  "name": "This is second test",
  "keyword": "When "
});
formatter.step({
  "line": 11,
  "name": "This is third test",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_frist_test()"
});
formatter.result({
  "duration": 76600,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_second_test()"
});
formatter.result({
  "duration": 192700,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_third_test()"
});
formatter.result({
  "duration": 111100,
  "status": "passed"
});
formatter.after({
  "duration": 225700,
  "status": "passed"
});
formatter.after({
  "duration": 54300,
  "status": "passed"
});
formatter.before({
  "duration": 87900,
  "status": "passed"
});
formatter.before({
  "duration": 440700,
  "status": "passed"
});
formatter.before({
  "duration": 147600,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "This is third step",
  "description": "",
  "id": "demo-tagged-hooks-feature;this-is-third-step",
  "type": "scenario",
  "keyword": "Scenario",
  "tags": [
    {
      "line": 12,
      "name": "@Third"
    }
  ]
});
formatter.step({
  "line": 14,
  "name": "This is first step",
  "keyword": "Given "
});
formatter.step({
  "line": 15,
  "name": "This is second test",
  "keyword": "When "
});
formatter.step({
  "line": 16,
  "name": "This is third test",
  "keyword": "Then "
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_first_step()"
});
formatter.result({
  "duration": 74900,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_second_test()"
});
formatter.result({
  "duration": 196900,
  "status": "passed"
});
formatter.match({
  "location": "TaggedHooksStepDefination.this_is_third_test()"
});
formatter.result({
  "duration": 179000,
  "status": "passed"
});
formatter.after({
  "duration": 602900,
  "status": "passed"
});
formatter.after({
  "duration": 143800,
  "status": "passed"
});
});