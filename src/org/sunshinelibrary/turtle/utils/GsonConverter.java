package org.sunshinelibrary.turtle.utils;

import com.google.gson.Gson;
import com.squareup.tape.FileObjectQueue;

import java.io.*;

/**
 * User: fxp
 * Date: 10/16/13
 * Time: 12:03 PM
 */
public class GsonConverter<T> implements FileObjectQueue.Converter<T> {
    private final Gson gson;
    private final Class<T> type;

    public GsonConverter(Gson gson, Class<T> type) {
        this.gson = gson;
        this.type = type;
    }

    @Override
    public T from(byte[] bytes) {
        Reader reader = new InputStreamReader(new ByteArrayInputStream(bytes));
        return gson.fromJson(reader, type);
    }

    @Override
    public void toStream(T object, OutputStream bytes) throws IOException {
        Writer writer = new OutputStreamWriter(bytes);
        gson.toJson(object, writer);
        writer.flush();
        writer.close();
    }
}