package com.multitap.prompt.application;

import com.multitap.prompt.common.exception.BaseException;
import com.multitap.prompt.common.response.BaseResponseStatus;
import com.multitap.prompt.dto.in.PromptRequestDto;
import com.multitap.prompt.dto.out.PromptResponseDto;
import com.multitap.prompt.domain.Prompt;
import com.multitap.prompt.infrastructure.PromptRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
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

}
