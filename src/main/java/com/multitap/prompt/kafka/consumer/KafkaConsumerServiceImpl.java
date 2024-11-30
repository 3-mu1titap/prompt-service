package com.multitap.prompt.kafka.consumer;

import com.multitap.prompt.dto.in.FeedbackScoreCategoryRequestDto;
import com.multitap.prompt.dto.out.FeedbackScoreCategoryResponseDto;
import com.multitap.prompt.infrastructure.PromptRepository;
import com.multitap.prompt.kafka.producer.KafkaProducerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    private final PromptRepository promptRepository;
    private final KafkaProducerService kafkaProducerService;

    @Override
    public void getCategoryPrompt(FeedbackScoreCategoryRequestDto feedbackScoreCategoryRequestDto) {
        FeedbackScoreCategoryResponseDto feedbackScoreCategoryResponseDto =  FeedbackScoreCategoryResponseDto.from(promptRepository.findByCategory(feedbackScoreCategoryRequestDto.getCategoryCode()),feedbackScoreCategoryRequestDto);
        log.info("prompt : {}", feedbackScoreCategoryResponseDto.getRequest());
        kafkaProducerService.sendCreateCategoryPrompt(feedbackScoreCategoryResponseDto);
    }
}
