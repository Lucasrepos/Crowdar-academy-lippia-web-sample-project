@Smoke
Feature: As a potencial client I want a sing in funcionality

@QA-01
  Scenario: Registration Sign in
    Given The user is in automation practice web
    When The user go to My Account
    When The user enter new email
    When The user enter password
    When The user click on Register Button
    Then The user will be registered successfully and redirect to homepage
  @QA-02
  Scenario: Registration Sign in - Empity Password
    Given The user is in automation practice web
    When The user go to My Account
    When The user enter new email
    When The user enter Empity Password
  @QA-03
  Scenario: Registration Sign in - Invalid Email
    Given The user is in automation practice web
    When The user go to My Account
    When The user enter invalid Email
    When The user enter password

