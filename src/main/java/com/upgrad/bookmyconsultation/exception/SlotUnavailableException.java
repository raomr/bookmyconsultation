package com.upgrad.bookmyconsultation.exception;

public class SlotUnavailableException extends RuntimeException {

    private String message = "Slots unavailable for this date and time!!! Please choose another timeslot!";


    @Override
    public String getMessage() {
        return message;
    }


    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SlotUnavailableException {\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
