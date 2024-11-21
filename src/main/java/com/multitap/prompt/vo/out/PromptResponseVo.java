package com.multitap.prompt.vo.out;

import com.multitap.prompt.domain.PromptDetails;
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
    private String industry;
    private String documentType;
    private PromptDetails promptDetails;

}
