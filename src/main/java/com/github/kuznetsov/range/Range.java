package com.github.kuznetsov.range;

import java.util.Iterator;

/**
 *
 * @author leonid
 */
public class Range implements Iterable<Integer>{
    
    private final int from;
    private final int to;

    public Range(int from, int to) {
        this.from = from;
        this.to = to;
    }
    
    public int first() {
        return from;
    }
    
    public int last() {
        return to;
    }
    
    public int size() {
        return isCorrectRange() ? 0 : from - to + 1;
    }
    
    public boolean isCorrectRange() {
        return from <= to;
    }
    
    public boolean inRange(int index) {
        return index >= from && index <= to;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            
            private Integer current;
            
            @Override
            public boolean hasNext() {
                return current == null || current < to;
            }

            @Override
            public Integer next() {
                if (hasNext()) {
                    return current = current == null ? from : current + 1;
                }
                return null;
            }
        };
    }
}
