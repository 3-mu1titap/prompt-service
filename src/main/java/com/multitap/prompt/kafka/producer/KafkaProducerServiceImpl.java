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
            // 피드백쿼리에서 마지막값, 첫번째 값과 프롬프트를 합쳐서 ai 피드백으로 topic 전달
            kafkaTemplate.send("create-category-prompt-topic", feedbackScoreCategoryResponseDto);
        } catch (Exception e) {
            log.info("create category prompt event send 실패 : " + e);
            throw new RuntimeException(e);
        }
    }
}
