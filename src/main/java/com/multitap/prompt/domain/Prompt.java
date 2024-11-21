package com.multitap.prompt.domain;

import com.multitap.prompt.domain.enums.DocumentType;
import com.multitap.prompt.domain.enums.IndustryType;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@Data
@Builder
public class Prompt {

    @Id
    private String id;
    private IndustryType industry;
    private DocumentType documentType;
    private PromptDetails promptDetails;

}
