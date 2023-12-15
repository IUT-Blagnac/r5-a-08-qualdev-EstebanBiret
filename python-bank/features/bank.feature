Feature: Bank Account
  Scenario Outline: Create an account and perform transactions
    Given a new user
    When the user creates an account with a balance of <initial_balance>
    And the user deposits <deposit_amount> into the account
    Then the user should have a balance of <expected_balance>

    Examples:
      | initial_balance | deposit_amount | expected_balance |
      | 0               | 50             | 50               |
      | 100             | 25             | 125              |
      | 200             | 100            | 300              |

  Scenario Outline: Withdraw from the account
    Given a user with a balance of <initial_balance>
    When the user withdraws <withdraw_amount> from the account
    Then the user should have a balance after withdrawal of <expected_balance_after_withdrawal>

    Examples:
      | initial_balance | withdraw_amount | expected_balance_after_withdrawal |
      | 150             | 50              | 100                               |
      | 300             | 100             | 200                               |
      | 500             | 200             | 300                               |