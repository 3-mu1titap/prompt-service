package com.multitap.prompt.kafka.consumer;


import com.multitap.prompt.dto.in.FeedbackScoreCategoryRequestDto;
import com.multitap.prompt.dto.out.FeedbackScoreCategoryResponseDto;

public interface KafkaConsumerService {
    FeedbackScoreCategoryResponseDto getCategoryPrompt(FeedbackScoreCategoryRequestDto feedbackScoreCategoryRequestDto);
}
