package com.aptner.point.designpatternexample.example2;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

public class LowerFilterStream extends FilterInputStream {

    protected LowerFilterStream(InputStream in) {
        super(in);
    }

    public int read() throws IOException {
        int c = in.read();
        return (c == -1 ? c : Character.toLowerCase((char) c));
    }

    @Override
    public int read(byte[] b, int off, int len) throws IOException {
        int result = in.read(b, off, len);
        for (int i = off; i < off + len; i++) {
            b[i] = (byte) Character.toLowerCase((char) b[i]);
        }
        return result;
    }
}
