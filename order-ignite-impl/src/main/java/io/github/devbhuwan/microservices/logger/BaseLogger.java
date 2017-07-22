package io.github.devbhuwan.microservices.logger;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public abstract class BaseLogger {

    protected Logger delegateLogger;
    protected String projectCode;
    protected String componentId;

    public static <T extends BaseLogger> T createLogger(Class<T> loggerClass, String projectCode, String name, String componentId) {
        try {
            T logger = loggerClass.newInstance();
            logger.projectCode = projectCode;
            logger.componentId = componentId;
            logger.delegateLogger = LoggerFactory.getLogger(name);
            return logger;
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException("Unable to instantiate logger '" + loggerClass.getName() + "'", e);
        }
    }

}
