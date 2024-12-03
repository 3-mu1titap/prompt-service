package com.multitap.prompt.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PromptDetails {

    private String replyFormat; // 응답 포맷
    private String request; // prompt 내용

    @Builder
    public PromptDetails(String replyFormat, String request) {
        this.replyFormat = replyFormat;
        this.request = request;
    }

}