@FunctionalTest
Feature: Free CRM Application testing feature
@SmokeTest
Scenario: Login with correct username and correct password
Given This is a valid login test
@SmokeTest
Scenario: Login with incorrect username and correct password 
Given This is an invalid login test
@RegressionTest @SmokeTest
Scenario: Create a contact
Given This is a contact test case
@RegressionTest @SmokeTest
Scenario: Create a Deal,Task,case,email
Given This is a deal test case
@RegressionTest @End2End
Scenario: Create a Task page
Given This is a task test
@SmokeTest
Scenario: Create a Case block
Given This is a Case test
@SmokeTest @End2End
Scenario: Create an Email page,calls,documents campaingns
Given This is an Email test
@RegressionTest
Scenario: Create an Calls block
Given This is call history test case
@End2End
Scenario: Create Documents folder
Given This is a documents test case
@End2End
Scenario: Create campaingns block
Given This is a campaigns test case


