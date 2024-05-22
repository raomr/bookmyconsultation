package com.upgrad.bookmyconsultation.exception;

public class SlotUnavailableException extends RuntimeException {
    private String errorCode;
    private String description;

    public SlotUnavailableException(){
        this.errorCode = "SLT-400";
        this.description = "Slots Unavaliable";
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getDescription() {
        return description;
    }
}
