class ExceptionClass(Exception):
        pass

class BankAccount:
        def __init__(self, balance=0):
        if balance < 0:
        raise BankException("Cannot open an account with a negative balance.")
        self.balance = balance

        def deposit(self, amount):
        if amount < 0:
        raise BankException("Cannot deposit a negative amount.")
        self.balance += amount
        print(f"Deposited ${amount}. New balance: ${self.balance}")

        def withdraw(self, amount):
        if amount < 0:
        raise BankException("Cannot withdraw a negative amount.")
        if amount > self.balance:
        raise BankException("Withdrawal amount exceeds the available balance.")
        self.balance -= amount
        print(f"Withdrew ${amount}. New balance: ${self.balance}")

        # Example usage
        try:
        # Creating a bank account with an initial balance
        account = BankAccount(1000)

        # Depositing and withdrawing with valid amounts
        account.deposit(500)
        account.withdraw(200)

        # Trying to deposit a negative amount (raising an exception)
        account.deposit(-100)

        # Trying to withdraw more than the available balance (raising an exception)
        account.withdraw(1500)

        except BankException as e:
        print(f"Bank Exception: {e}")
