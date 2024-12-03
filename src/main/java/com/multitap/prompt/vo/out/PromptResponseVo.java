package com.multitap.prompt.vo.out;

import com.multitap.prompt.domain.PromptDetails;
import com.multitap.prompt.domain.enums.DocumentType;
import com.multitap.prompt.domain.enums.IndustryType;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@Builder
@AllArgsConstructor
public class PromptResponseVo {

    private String id;
    private IndustryType industry;
    private DocumentType documentType;
    private PromptDetails promptDetails;

}
