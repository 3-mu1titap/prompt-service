package com.multitap.prompt.dto.in;

import com.multitap.prompt.domain.enums.DocumentType;
import com.multitap.prompt.domain.enums.IndustryType;
import com.multitap.prompt.vo.in.RetrievePromptRequestVo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class RetrievePromptRequestDto {

    private IndustryType industryType;
    private DocumentType documentType;

    @Builder
    public RetrievePromptRequestDto(IndustryType industryType, DocumentType documentType) {
        this.industryType = industryType;
        this.documentType = documentType;
    }

    public static RetrievePromptRequestDto from(RetrievePromptRequestVo retrievePromptRequestVo) {
        return RetrievePromptRequestDto.builder()
                .industryType(retrievePromptRequestVo.getIndustryType())
                .documentType(retrievePromptRequestVo.getDocumentType())
                .build();
    }

}
