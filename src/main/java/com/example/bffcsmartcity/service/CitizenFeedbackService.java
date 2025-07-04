package com.example.bffcsmartcity.service;

import com.example.bffcsmartcity.client.SmartCityDemoClient;
import com.example.bffcsmartcity.dto.CitizenFeedBackDto;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Service;

@Service


public class CitizenFeedbackService {

    private final SmartCityDemoClient smartCityDemoClient;

    public CitizenFeedbackService(SmartCityDemoClient smartCityDemoClient) {
        this.smartCityDemoClient = smartCityDemoClient;
    }

    public CitizenFeedBackDto submitFeedback(CitizenFeedBackDto dto) {
        return smartCityDemoClient.createFeedback(dto);
    }
}
