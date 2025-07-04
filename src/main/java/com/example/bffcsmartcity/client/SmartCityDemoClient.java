package com.example.bffcsmartcity.client;


import com.example.bffcsmartcity.dto.CitizenFeedBackDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "smartcity-demo", url = "http://localhost:8081")
public interface SmartCityDemoClient {

    @PostMapping("/api/create")
    CitizenFeedBackDto createFeedback(@RequestBody CitizenFeedBackDto feedbackDto);
}
