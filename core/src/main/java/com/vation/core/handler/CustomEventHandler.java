package com.vation.core.handler;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.event.Event;
import org.osgi.service.event.EventConstants;
import org.osgi.service.event.EventHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component(
        service = EventHandler.class,
        property = {
                EventConstants.EVENT_TOPIC + "=com/day/cq/replication/ReplicationAction/TYPE_ACTIVATE",
                EventConstants.EVENT_TOPIC + "=org/apache/sling/api/resource/Resource/ADDED"
        }
)
public class CustomEventHandler implements EventHandler {

    private static final Logger log = LoggerFactory.getLogger(CustomEventHandler.class);

    @Override
    public void handleEvent(Event event) {
        // Log the received event topic
        String topic = event.getTopic();
        log.info("Received event: {}", topic);

        // Handle page publication events
        if ("com/day/cq/replication/ReplicationAction/TYPE_ACTIVATE".equals(topic)) {
            String path = (String) event.getProperty("path");
            if (path != null) {
                log.info("Page published at path: {}", path);
            } else {
                log.warn("No path information available for published page event.");
            }
        }

        // Handle page creation events
        if ("org/apache/sling/api/resource/Resource/ADDED".equals(topic)) {
            String path = (String) event.getProperty("path");
            if (path != null && path.startsWith("/content/vation/us/en")) {
                log.info("Page created at path: {}", path);
            } else {
                log.debug("Page created at path: {} (outside of specified path)", path);
            }
        }
    }
}