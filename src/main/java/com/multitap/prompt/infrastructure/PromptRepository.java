package com.multitap.prompt.infrastructure;

import com.multitap.prompt.domain.Prompt;
import com.multitap.prompt.domain.enums.DocumentType;
import com.multitap.prompt.domain.enums.IndustryType;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromptRepository extends MongoRepository<Prompt, String> {

    Prompt findByIndustryAndDocumentType(IndustryType industry, DocumentType documentType);
}
