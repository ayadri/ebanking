package org.sid.ebankingbackend.exceptions;

public class BalanceNoSufficientException extends Exception {
    public BalanceNoSufficientException(String message) {
        super(message);
    }
}
