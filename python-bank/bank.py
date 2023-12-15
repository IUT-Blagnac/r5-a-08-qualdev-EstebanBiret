class BankAccount:
    def __init__(self):
        self.balance = 0

    def create_account(self, initial_balance):
        self.balance = initial_balance

    def deposit(self, amount):
        self.balance += amount

    def withdraw(self, amount):
        self.balance -= amount