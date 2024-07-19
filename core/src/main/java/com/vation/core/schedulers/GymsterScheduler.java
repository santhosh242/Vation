package com.vation.core.schedulers;

import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.*;
import org.osgi.service.metatype.annotations.Designate;
import com.vation.core.config.SchedulerConfig;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(service = Runnable.class, immediate = true)
@Designate(ocd = SchedulerConfig.class)
public class GymsterScheduler implements Runnable {

    private static final Logger LOG = LoggerFactory.getLogger(GymsterScheduler.class);

    @Reference
    private Scheduler scheduler;

    private String schedulerExpression;

    @Activate
    @Modified
    protected void activate(final SchedulerConfig config) {
        schedulerExpression = config.scheduler_expression();
        LOG.info("Gymster Scheduler started with expression: {}", config.scheduler_expression());
    }



    @Override
    public void run() {
        try {
            LOG.info("Scheduler should print on page...");


        } catch (Exception e) {
            LOG.error("Error in  Scheduler: {}", e.getMessage(), e);
        }
    }
}
