package io.github.devbhuwan.microservices.logger;

import org.slf4j.helpers.MessageFormatter;

public class EnsureUtilLogger extends BaseLogger {

    public void parameterIsNullException(String parameterName) {
        throw new IllegalArgumentException(exceptionMessage("001", "Parameter '{}' is null", parameterName));
    }

    private String exceptionMessage(String id, String message, String parameterName) {
        return MessageFormatter.arrayFormat(id + " " + message, new String[]{parameterName}).getMessage();
    }

}
