package com.travel;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class TravelStartInit {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    @PostConstruct
    public void init() {
        try {

        } catch (Exception ex) {
        logger.error(ex.toString(), ex);
        }
    }
}
