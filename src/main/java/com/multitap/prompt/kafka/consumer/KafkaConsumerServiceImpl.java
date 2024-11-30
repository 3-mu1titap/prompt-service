package com.multitap.prompt.kafka.consumer;

import com.multitap.prompt.dto.in.FeedbackScoreCategoryRequestDto;
import com.multitap.prompt.dto.out.FeedbackScoreCategoryResponseDto;
import com.multitap.prompt.infrastructure.PromptRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class KafkaConsumerServiceImpl implements KafkaConsumerService {

    private final PromptRepository promptRepository;

    @Override
    public FeedbackScoreCategoryResponseDto getCategoryPrompt(FeedbackScoreCategoryRequestDto feedbackScoreCategoryRequestDto) {
        return FeedbackScoreCategoryResponseDto.from(promptRepository.findByCategory(feedbackScoreCategoryRequestDto.getCategoryCode()),feedbackScoreCategoryRequestDto);
    }
    
    //todo : 테스트 한 결과 topic 이 프롬프트까지 잘 넘어온 거 확인 했고 이제 ai 피드백으로 카테고리 프롬프트내용이랑 점수값 ai 피드백으로 보내는 작업 해야함

}
