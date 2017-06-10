package io.github.devbhuwan.microservices.nutshell.order.service;

import com.sun.jersey.api.core.PackagesResourceConfig;
import com.sun.jersey.api.json.JSONConfiguration;

import javax.ws.rs.ApplicationPath;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/06/10
 */
@ApplicationPath("/")
public class ResourceConfiguration extends PackagesResourceConfig {

    public ResourceConfiguration() {
        super(properties());
    }

    private static Map<String, Object> properties() {
        Map<String, Object> result = new HashMap<>();
        result.put(PackagesResourceConfig.PROPERTY_PACKAGES, "com.sun.jersey;io.github.devbhuwan.microservices.nutshell.order.service.rest");
        result.put("com.sun.jersey.config.feature.FilterForwardOn404", "true");
        result.put(JSONConfiguration.FEATURE_POJO_MAPPING, "true");
        return result;
    }
}
