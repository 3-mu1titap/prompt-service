package com.multitap.prompt.application;

import com.multitap.prompt.common.exception.BaseException;
import com.multitap.prompt.common.response.BaseResponseStatus;
import com.multitap.prompt.dto.in.PromptRequestDto;
import com.multitap.prompt.dto.in.RetrievePromptRequestDto;
import com.multitap.prompt.dto.out.PromptDetailsResponseDto;
import com.multitap.prompt.dto.out.PromptResponseDto;
import com.multitap.prompt.domain.Prompt;
import com.multitap.prompt.infrastructure.PromptRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class PromptServiceImpl implements PromptService {

    private final PromptRepository promptRepository;

    @Override
    public void addPrompt(PromptRequestDto promptRequestDto) {
        promptRepository.save(PromptRequestDto.toEntity(promptRequestDto));
    }

    @Override
    public List<PromptResponseDto> getPromptList() {
        return promptRepository.findAll().stream()
                .map(PromptResponseDto::from)
                .toList();
    }

    @Override
    public void changePrompt(PromptRequestDto promptRequestDto, String id) {
       Prompt prompt =  promptRepository.findById(id).orElseThrow(() -> new BaseException(BaseResponseStatus.NO_EXIST_PROMPT));
       promptRepository.save(PromptRequestDto.updateToEntity(promptRequestDto,prompt));
    }

    @Override
    public PromptDetailsResponseDto searchPromptDetails(RetrievePromptRequestDto retrievePromptRequestDto) {
        Prompt prompt = promptRepository.findByIndustryAndDocumentType(retrievePromptRequestDto.getIndustryType(),retrievePromptRequestDto.getDocumentType())
                .orElseThrow(()-> new BaseException(BaseResponseStatus.NO_EXIST_PROMPT));

        log.info("프롬프트 전달 값:{},{}",prompt.getPromptDetails().getReplyFormat(),prompt.getPromptDetails().getRequest());

        return PromptDetailsResponseDto.from(prompt);
    }

}
