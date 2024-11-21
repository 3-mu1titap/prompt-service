package com.multitap.prompt.infrastructure;

import com.multitap.prompt.entity.Prompt;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface PromptRepository extends MongoRepository<Prompt, String> {

}
