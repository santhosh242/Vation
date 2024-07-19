package com.vation.core.config;

import org.osgi.service.metatype.annotations.AttributeDefinition;
import org.osgi.service.metatype.annotations.ObjectClassDefinition;

@ObjectClassDefinition(name = "Gymster Scheduler")
public @interface SchedulerConfig {

    @AttributeDefinition(name = "Scheduler expression")
    String scheduler_expression() default "*/30 * * * * ?";
}