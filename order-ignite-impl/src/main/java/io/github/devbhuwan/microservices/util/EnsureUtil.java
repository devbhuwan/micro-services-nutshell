package io.github.devbhuwan.microservices.util;

import io.github.devbhuwan.microservices.logger.EnsureUtilLogger;
import io.github.devbhuwan.microservices.nutshell.order.ignite.UtilsLogger;

public class EnsureUtil {

    private static final EnsureUtilLogger LOG = UtilsLogger.ENSURE_UTIL_LOGGER;

    public static void ensureNotNull(String parameterName, Object value) {
        if(value == null)
            LOG.parameterIsNullException(parameterName);
    }

}
