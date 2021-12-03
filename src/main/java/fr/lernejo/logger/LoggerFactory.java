package fr.lernejo.logger;

import java.util.function.Predicate;

public class LoggerFactory {
    public static Logger getLogger(String name) {
        Predicate<String> fileLoggerFilter = msg -> msg.contains("simulation");
        return new CompositeLogger(new ContextualLogger(name, new FilteredLogger(new FileLogger("logs.txt"), fileLoggerFilter)), new ContextualLogger(name, new ConsoleLogger()));    }
}

