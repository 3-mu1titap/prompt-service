package com.multitap.prompt.infrastructure;

import com.multitap.prompt.domain.Prompt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PromptRepository extends MongoRepository<Prompt, String> {

}
