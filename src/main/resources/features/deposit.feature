Feature: deposit
    As a customer
    I want to deposit from my account using ATM

Background:
    Given a customer with id 4 and pin 444 with balance 400 exists
    And I login to ATM with id 4 and pin 444

Scenario: Deposit amount 200
    When I deposit 200 from ATM
    Then my account balance is 600
