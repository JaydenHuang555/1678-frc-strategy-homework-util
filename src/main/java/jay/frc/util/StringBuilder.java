package jay.frc.util;

public class StringBuilder {

    private char buffer[];
    private int off = 0;

    public StringBuilder() {
        buffer = new char[1 << 4];
    }

    public void append(final char c) {
        buffer[off++] = c;
        if(off == buffer.length) {
            char next[] = new char[off * 2];
            for(int i = 0; i < buffer.length; i++) next[i] = buffer[i];
            buffer = next;
        }
    }

    public void append(final Object o) {
        for(int i = 0; i < o.toString().length(); i++)
            append(o.toString().charAt(i));
    }

    @Override
    public String toString() {
        char sending[] = new char[off];
        for(int i = 0; i < off; i++) sending[i] = buffer[i];
        return new String(sending);
    }
}
