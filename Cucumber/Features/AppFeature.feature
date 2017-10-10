Feature: Test Login Scenario

  Scenario Outline: Enter valid credentials
    Given Open Firefox browser and start the application
    When Enter the valid "<username>" and "<password>"
    Then user should be able to login
    Then close the browser

 Examples: 
      | username      | password |
      | test1@xyz.com | test12   |
      | test3@xyz.com | test13   |
      | test4@xyz.com | test14   |
   