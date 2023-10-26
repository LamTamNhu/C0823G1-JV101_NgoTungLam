package ss15.prac;

public class IllegalTriangleException extends Exception {
    private String userMessage;

    public IllegalTriangleException() {
    }

    public IllegalTriangleException(String userMessage) {
        super(userMessage);
        this.userMessage = userMessage;
    }

    @Override
    public String toString() {
        return userMessage;
    }
}
