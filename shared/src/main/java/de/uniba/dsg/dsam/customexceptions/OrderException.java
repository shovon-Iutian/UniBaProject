package de.uniba.dsg.dsam.customexceptions;


public class OrderException  extends Exception  {

    /**
     * Constructs a new exception with {@code null} as its detail message.
     * The cause is not initialized, and may subsequently be initialized by a
     * call to {@link #initCause}.
     */
    public OrderException() {
    }


    public OrderException(String message) {
        super(message);
    }

    public OrderException(Throwable cause) {
        super(cause);
    }

    public OrderException(String message, Throwable cause) {
        super(message, cause);
    }
}
