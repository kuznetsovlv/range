package com.github.kuznetsov.range;

/**
 *
 * @author leonid
 */
public class OutOfRangeException extends Exception{
    private final Range range;
    private final int value;

    public OutOfRangeException(Range range, int value, String message) {
        super(message);
        this.range = range;
        this.value = value;
    }

    public OutOfRangeException(Range range, int value) {
        this(range, value, "The value "+ Integer.toString(value)
                + " is out of range [" + range.first() + ", " + range.last() + "]");
    }
    
    public Range getRange() {
        return range;
    }
    
    public int getValue() {
        return value;
    }
}
