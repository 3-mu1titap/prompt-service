package com.multitap.prompt.dto.in;

import com.multitap.prompt.entity.Prompt;
import com.multitap.prompt.entity.PromptDetails;
import com.multitap.prompt.vo.in.PromptRequestVo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PromptRequestDto {

    private String industry;
    private String documentType;
    private String feedbackType;
    private String request;

    @Builder
    public PromptRequestDto(String industry, String documentType,String feedbackType, String request) {
        this.industry = industry;
        this.documentType = documentType;
        this.feedbackType = feedbackType;
        this.request = request;

    }

    public static PromptRequestDto from(PromptRequestVo promptRequestVo) {
        return PromptRequestDto.builder()
                .industry(promptRequestVo.getIndustry())
                .documentType(promptRequestVo.getDocumentType())
                .feedbackType(promptRequestVo.getFeedbackType())
                .request(promptRequestVo.getRequest())
                .build();
    }

    public static Prompt toEntity(PromptRequestDto promptRequestDto) {
        return Prompt.builder()
                .industry(promptRequestDto.getIndustry())
                .documentType(promptRequestDto.getDocumentType())
                .promptDetails(PromptDetails.builder()
                        .feedbackType(promptRequestDto.feedbackType)
                        .request(promptRequestDto.request)
                        .build())
                .build();
    }

    public static Prompt updateToEntity(PromptRequestDto promptRequestDto, Prompt prompt) {
        return Prompt.builder()
                .id(prompt.getId())
                .industry(promptRequestDto.getIndustry())
                .documentType(promptRequestDto.getDocumentType())
                .promptDetails(PromptDetails.builder()
                        .feedbackType(promptRequestDto.feedbackType)
                        .request(promptRequestDto.request)
                        .build())
                .build();
    }

}