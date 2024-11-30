package com.multitap.prompt.kafka.producer;

import com.multitap.prompt.dto.out.FeedbackScoreCategoryResponseDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaProducerServiceImpl implements KafkaProducerService {

    private final KafkaTemplate<String, Object> kafkaTemplate;

    @Override
    public void sendCreateCategoryPrompt(FeedbackScoreCategoryResponseDto feedbackScoreCategoryResponseDto) {

        try {
            kafkaTemplate.send("create-category-prompt-topic", feedbackScoreCategoryResponseDto);
        } catch (Exception e) {
            log.info("create category prompt event send 실패 : " + e);
            throw new RuntimeException(e);
        }
    }
}
