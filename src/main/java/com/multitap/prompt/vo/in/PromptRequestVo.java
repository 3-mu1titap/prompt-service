package com.multitap.prompt.vo.in;

import com.multitap.prompt.domain.enums.DocumentType;
import com.multitap.prompt.domain.enums.IndustryType;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PromptRequestVo {

    private IndustryType industry;
    private DocumentType documentType;
    private String replyFormat;
    private String request;

}
