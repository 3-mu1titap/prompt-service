package com.multitap.prompt.dto.out;

import com.multitap.prompt.domain.Prompt;
import com.multitap.prompt.domain.PromptDetails;
import com.multitap.prompt.dto.in.FeedbackScoreCategoryRequestDto;
import com.multitap.prompt.kafka.consumer.messagein.FeedbackScoreDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedbackScoreCategoryResponseDto {

    private FeedbackScoreDto feedbackScoreDto;
    private PromptDetails promptDetails;

    @Builder
    public FeedbackScoreCategoryResponseDto(FeedbackScoreDto feedbackScoreDto, PromptDetails promptDetails) {
        this.feedbackScoreDto = feedbackScoreDto;
        this.promptDetails = promptDetails;

    }

    public static FeedbackScoreCategoryResponseDto from (Prompt prompt, FeedbackScoreCategoryRequestDto feedbackScoreCategoryRequestDto) {
        return FeedbackScoreCategoryResponseDto.builder()
                .feedbackScoreDto(feedbackScoreCategoryRequestDto.getFeedbackScore())
                .promptDetails(prompt.getPromptDetails())
                .build();
    }
}
