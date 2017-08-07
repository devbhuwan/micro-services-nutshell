package io.github.devbhuwan.microservices.autoconfigure;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Inherited
@Import(EnableBpmDiscoveryClientImportSelector.class)
public @interface EnableBpmDiscoveryClient {

}
