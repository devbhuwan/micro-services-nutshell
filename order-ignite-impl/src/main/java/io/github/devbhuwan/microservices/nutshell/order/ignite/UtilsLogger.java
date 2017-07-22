package io.github.devbhuwan.microservices.nutshell.order.ignite;

import io.github.devbhuwan.microservices.logger.BaseLogger;
import io.github.devbhuwan.microservices.logger.EnsureUtilLogger;

public class UtilsLogger {

    private static final String PROJECT_CODE = "UTILS";
    public static final EnsureUtilLogger ENSURE_UTIL_LOGGER = BaseLogger.createLogger(EnsureUtilLogger.class, PROJECT_CODE, "", "02");

}
