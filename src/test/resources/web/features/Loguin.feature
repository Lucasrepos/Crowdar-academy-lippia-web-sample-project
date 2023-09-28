Feature: As a potencial client I want a sing in funcionality


  @Smoke
  Scenario: Registration Sign in
    Given The user is in automation practice web
    When The user go to My Account
    When The user enter username & password and click on loguin button
    Then The user will be registered successfully and redirect to homepage

  @Smoke
  Scenario: Registration Sign in - Empity Password
    Given The user is in automation practice web
    When The user go to My Account
    When The user enter new email, Empity password and click on Register
    Then The user will be registered successfully and redirect to homepage

  @Smoke
  Scenario: Registration Sign in - Invalid Email
    Given The user is in automation practice web
    When The user go to My Account
    When The user enter invalid Emaail, password and click on Register
    Then The user will be registered successfully and redirect to homepage

