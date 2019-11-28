package com.dutytrail.backend.duty.app.controller;

import com.dutytrail.backend.duty.domain.service.DutyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DutyController {

    private final Logger log = LoggerFactory.getLogger(DutyController.class);

    @Autowired
    private DutyService dutyService;

    @RequestMapping(value = "/ping", method = RequestMethod.GET)
    public String ping() {
        log.info("\t *** /ping endpoint called");

        return this.dutyService.getPing();
    }
}
