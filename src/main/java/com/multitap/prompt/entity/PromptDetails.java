package com.multitap.prompt.entity;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PromptDetails {

    private String feedbackType;
    private String request;

    @Builder
    public PromptDetails(String feedbackType, String request) {
        this.feedbackType = feedbackType;
        this.request = request;
    }

}