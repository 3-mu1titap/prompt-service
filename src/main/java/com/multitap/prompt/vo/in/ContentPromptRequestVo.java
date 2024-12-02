package com.multitap.prompt.vo.in;

import com.multitap.prompt.domain.enums.Category;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ContentPromptRequestVo {

    private Category category;
    private String replyFormat;
    private String request;
}
