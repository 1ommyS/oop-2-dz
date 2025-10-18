package school;

public class Mark {
    private String subject;
    private int value;

    public Mark(int value, String subject) {
        this.value = value;
        this.subject = subject;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String toString() {
        return String.format(
                "предмет - %s; оценка - %d", subject, value);
    }
}