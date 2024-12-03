package com.multitap.prompt.domain;

import com.multitap.prompt.domain.enums.Category;
import com.multitap.prompt.domain.enums.DocumentType;
import com.multitap.prompt.domain.enums.IndustryType;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.CompoundIndex;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
@CompoundIndex(def = "{'industry': 1, 'documentType': 1}", name = "industry_documentType_index")
@Data
@Builder
public class Prompt {

    @Id
    private String id;

    @Indexed
    private IndustryType industry;

    @Indexed
    private DocumentType documentType;

    @Indexed
    private Category category;

    private PromptDetails promptDetails;

}
