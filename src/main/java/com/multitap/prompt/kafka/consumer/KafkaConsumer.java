package com.multitap.prompt.kafka.consumer;


import com.multitap.prompt.dto.in.FeedbackScoreCategoryRequestDto;
import com.multitap.prompt.kafka.consumer.messagein.FeedbackScoreDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@RequiredArgsConstructor
@Slf4j
@Component
public class KafkaConsumer {

    private final KafkaConsumerService kafkaConsumerService;

    @KafkaListener(topics = "create-ai-feedback-score-topic", groupId = "feedback-consumer-group", containerFactory = "feedbackScoreDtoListener")
    public void processFeedbackScore(FeedbackScoreDto feedbackScoreDto) {
        log.info("Received feedbackScoreDto :{}", feedbackScoreDto.getCategoryCode());
        kafkaConsumerService.getCategoryPrompt(FeedbackScoreCategoryRequestDto.from(feedbackScoreDto));
    }

}
