package gr.aueb.cf.ch18.bank_mysql.bankapp.core.exceptions;

public class AccountAlreadyExistsException extends Exception {

    public AccountAlreadyExistsException(String message) {
        super(message);
    }
}