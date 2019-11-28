package com.dutytrail.backend.duty.domain.service;

import org.springframework.stereotype.Component;

@Component
public class DutyService {

    public String getPing() {
        return "Duty says ping";
    }
}
