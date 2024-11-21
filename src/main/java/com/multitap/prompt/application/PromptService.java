package com.multitap.prompt.application;

import com.multitap.prompt.dto.in.PromptRequestDto;
import com.multitap.prompt.dto.out.PromptResponseDto;

import java.util.List;

public interface PromptService {
    void addPrompt(PromptRequestDto promptRequestDto);
    List<PromptResponseDto> getPromptList();
    void changePrompt(PromptRequestDto promptRequestDto, String id);
}
