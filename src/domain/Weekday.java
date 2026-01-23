package domain;

public enum Weekday {
    MONDAY('M'),
    TUESDAY('T'),
    WEDNESDAY('W'),
    THURSDAY('R'),
    FRIDAY('F'),
    SATURDAY('S'),
    SUNDAY('U');

    private final char code;

    Weekday(char code) {
        this.code = code;
    }

    public char getCode() {
        return this.code;
    }

    public static Weekday fromCode(char code) {
        for (Weekday day : values()) {
            if (day.code == code) {
                return day;
            }
        }
        throw new IllegalArgumentException("Invalid weekday code: " + code);
    }
}
