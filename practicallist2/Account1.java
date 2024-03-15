class Account1:
    def __init__(self, depositor_name, account_number, account_type, balance):
        self.depositor_name = depositor_name
        self.account_number = account_number
        self.account_type = account_type
        self.balance = balance

    def display_account_details(self):
        print("Depositor Name:", self.depositor_name)
        print("Account Number:", self.account_number)
        print("Account Type:", self.account_type)
        print("Balance:", self.balance)

if __name__ == "__main__":
    # Creating an account object with initial values
    account1 = Account("pink", "123456789", "Savings", 1000.00)
    account1.display_account_details()
