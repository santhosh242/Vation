package com.vation.core.schedulers;

import org.apache.sling.commons.scheduler.ScheduleOptions;
import org.apache.sling.commons.scheduler.Scheduler;
import org.osgi.service.component.annotations.*;
import org.osgi.service.metatype.annotations.Designate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.vation.core.config.SchedulerConfiguration;

@Component(immediate = true, service = Runnable.class)
@Designate(ocd = SchedulerConfiguration.class)
public class GeeksScheduler implements Runnable {
    private static final Logger LOG = LoggerFactory.getLogger(GeeksScheduler.class);

    private String schedulerId;

    @Reference
    private Scheduler scheduler;

    @Activate
    @Modified
    protected void activate(SchedulerConfiguration config) {
        schedulerId = config.cronExpression();
    }

    @Deactivate
    protected void deactivate(SchedulerConfiguration config) {
        removeScheduler();
    }

    protected void removeScheduler() {
        scheduler.unschedule(String.valueOf(schedulerId));
    }

    protected void addScheduler(SchedulerConfiguration config) {
        ScheduleOptions scheduleOptions = scheduler.EXPR(config.cronExpression());
        scheduleOptions.name(String.valueOf(schedulerId));
        //scheduleOptions.canRunConcurrently(true);
        scheduler.schedule(this, scheduleOptions);
    }

    @Override
    public void run() {
        LOG.info("\n ====> RUN METHOD");
    }
}