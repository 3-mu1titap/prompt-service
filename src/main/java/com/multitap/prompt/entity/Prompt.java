package com.multitap.prompt.entity;

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
    private String industry;
    private String documentType;
    private PromptDetails promptDetails;

}
