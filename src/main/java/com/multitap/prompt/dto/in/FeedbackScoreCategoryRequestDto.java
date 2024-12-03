package com.multitap.prompt.dto.in;

import com.multitap.prompt.kafka.consumer.messagein.FeedbackScoreDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedbackScoreCategoryRequestDto {

    private FeedbackScoreDto feedbackScore;
    private String categoryCode;

    @Builder
    public FeedbackScoreCategoryRequestDto(FeedbackScoreDto feedbackScoreDto, String categoryCode) {
        this.feedbackScore = feedbackScoreDto;
        this.categoryCode = categoryCode;
    }

    public static FeedbackScoreCategoryRequestDto from(FeedbackScoreDto feedbackScoreDto) {
        return FeedbackScoreCategoryRequestDto.builder()
                .feedbackScoreDto(feedbackScoreDto)
                .categoryCode(feedbackScoreDto.getCategoryCode())
                .build();
    }
}
