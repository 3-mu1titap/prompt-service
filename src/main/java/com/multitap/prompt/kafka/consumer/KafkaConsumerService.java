package com.multitap.prompt.kafka.consumer;


import com.multitap.prompt.dto.in.FeedbackScoreCategoryRequestDto;

public interface KafkaConsumerService {
    void getCategoryPrompt(FeedbackScoreCategoryRequestDto feedbackScoreCategoryRequestDto);
}
