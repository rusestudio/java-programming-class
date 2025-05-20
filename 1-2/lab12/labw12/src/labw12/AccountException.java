
package labw12;

public class AccountException extends Exception {
    public AccountException(String message) {
        super(message);
    }
}

class DuplicateAccountException extends AccountException {
    public DuplicateAccountException(String message) {
        super(message);
    }
}

class AccountNotFoundException extends AccountException {
    public AccountNotFoundException(String message) {
        super(message);
    }
}

class AuthenticationFailedException extends AccountException {
    public AuthenticationFailedException(String message) {
        super(message);
    }
}

class AmountException extends Exception {
    public AmountException(String message) {
        super(message);
    }
}

class InvalidAmountException extends AmountException {
    public InvalidAmountException(String message) {
        super(message);
    }
}

class InsufficientBalanceException extends AmountException {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}