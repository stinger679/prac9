package student_task;


import java.io.IOException;

public class EmptyStringException extends IOException {

    public EmptyStringException(String message) {
        super(message);
    }
}