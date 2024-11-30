package com.multitap.prompt.dto.out;

import com.multitap.prompt.domain.Prompt;
import com.multitap.prompt.dto.in.FeedbackScoreCategoryRequestDto;
import com.multitap.prompt.kafka.consumer.messagein.FeedbackScoreDto;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedbackScoreCategoryResponseDto {

    private FeedbackScoreDto feedbackScoreDto;
    private String replyFormat;
    private String request;

    @Builder
    public FeedbackScoreCategoryResponseDto(FeedbackScoreDto feedbackScoreDto, String replyFormat, String request) {
        this.feedbackScoreDto = feedbackScoreDto;
        this.replyFormat = replyFormat;
        this.request = request;
    }

    public static FeedbackScoreCategoryResponseDto from (Prompt prompt, FeedbackScoreCategoryRequestDto feedbackScoreCategoryRequestDto) {
        return FeedbackScoreCategoryResponseDto.builder()
                .feedbackScoreDto(feedbackScoreCategoryRequestDto.getFeedbackScore())
                .replyFormat(prompt.getPromptDetails().getReplyFormat())
                .request(prompt.getPromptDetails().getRequest())
                .build();
    }
}
