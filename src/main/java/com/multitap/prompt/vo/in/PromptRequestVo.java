package com.multitap.prompt.vo.in;

import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PromptRequestVo {

    private String industry;
    private String documentType;
    private String feedbackType;
    private String request;

}
