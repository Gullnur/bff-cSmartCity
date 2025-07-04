package com.example.bffcsmartcity.controller;

import com.example.bffcsmartcity.dto.CitizenFeedBackDto;
import com.example.bffcsmartcity.service.CitizenFeedbackService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bff/feedback")
public class CitizenFeedbackController {

    private final CitizenFeedbackService feedbackService;

    public CitizenFeedbackController(CitizenFeedbackService feedbackService) {
        this.feedbackService = feedbackService;
    }

    @PostMapping("/create")
    public ResponseEntity<CitizenFeedBackDto> createFeedback(@RequestBody CitizenFeedBackDto dto) {
        CitizenFeedBackDto created = feedbackService.submitFeedback(dto);
        return ResponseEntity.ok(created);
    }
}
