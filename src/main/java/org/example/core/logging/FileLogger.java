package org.example.core.logging;

public class FileLogger implements Logger{
    @Override
    public void log(String data) {
        System.out.println("file logging "+data);
    }
}
