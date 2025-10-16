package dz;

public class Mark {
    private final int value;
    private final String subjectName;

    public Mark(int value, String subjectName) {
        if (value < 2 || value > 5) throw new IllegalArgumentException("че-то ты зажрался дружочек");
        this.value = value;
        this.subjectName = subjectName;
    }

    public int getValue() {
        return value;
    }

    public String getSubjectName() {
        return subjectName;
    }
}
