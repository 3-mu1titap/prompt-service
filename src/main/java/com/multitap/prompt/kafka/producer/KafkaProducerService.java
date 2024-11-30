package com.multitap.prompt.kafka.producer;

import com.multitap.prompt.dto.out.FeedbackScoreCategoryResponseDto;


public interface KafkaProducerService {
    void sendCreateCategoryPrompt(FeedbackScoreCategoryResponseDto feedbackScoreCategoryResponseDto);
}
