package com.solvd.exceptions;

public class MedicineOutOfStockException extends RuntimeException{
    public MedicineOutOfStockException() {
    }

    public MedicineOutOfStockException(String message) {
        super(message);
    }

    public MedicineOutOfStockException(String message, Throwable cause) {
        super(message, cause);
    }
}
