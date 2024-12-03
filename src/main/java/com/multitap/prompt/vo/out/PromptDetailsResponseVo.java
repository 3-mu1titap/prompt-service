package com.multitap.prompt.vo.out;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PromptDetailsResponseVo {

    private String replyFormat;
    private String request;

    @Builder
    public PromptDetailsResponseVo(String replyFormat, String request) {
        this.replyFormat = replyFormat;
        this.request = request;
    }
}
