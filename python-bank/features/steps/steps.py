from behave import *
from bank import BankAccount

# Given
@given(u'a new user')
def step_given_new_user(context):
    context.user_account = BankAccount()

@given(u'a user with a balance of {initial_balance}')
def step_given_user_with_balance(context, initial_balance):
    context.user_account = BankAccount()
    context.user_account.create_account(int(initial_balance))

# When
@when(u'the user creates an account with a balance of {initial_balance}')
def step_when_create_account(context, initial_balance):
    context.user_account.create_account(int(initial_balance))

@when(u'the user deposits {deposit_amount} into the account')
def step_when_deposit(context, deposit_amount):
    context.user_account.deposit(int(deposit_amount))

@when(u'the user withdraws {withdraw_amount} from the account')
def step_when_withdraw(context, withdraw_amount):
    context.user_account.withdraw(int(withdraw_amount))

# Then
@then(u'the user should have a balance of {expected_balance}')
def step_then_check_balance(context, expected_balance):
    assert context.user_account.balance == int(expected_balance), f"Expected {expected_balance}, but got {context.user_account.balance}"

@then(u'the user should have a balance after withdrawal of {expected_balance_after_withdrawal}')
def step_then_check_balance_after_withdrawal(context, expected_balance_after_withdrawal):
    assert context.user_account.balance == int(expected_balance_after_withdrawal), f"Expected {expected_balance_after_withdrawal}, but got {context.user_account.balance}"