package jline;

import jline.Logger.Level;
import jline.internal.Log;

public interface Logger {
    public static enum Level
    {
        TRACE,
        DEBUG,
        INFO,
        WARN,
        ERROR
    }

    void log( Logger.Level level , Object... message );
}