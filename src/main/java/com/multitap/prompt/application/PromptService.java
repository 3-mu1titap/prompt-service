package com.multitap.prompt.application;

import com.multitap.prompt.dto.in.ContentPromptRequestDto;
import com.multitap.prompt.dto.in.PromptRequestDto;
import com.multitap.prompt.dto.in.RetrievePromptRequestDto;
import com.multitap.prompt.dto.out.PromptDetailsResponseDto;
import com.multitap.prompt.dto.out.PromptResponseDto;

import java.util.List;

public interface PromptService {
    void addPrompt(PromptRequestDto promptRequestDto);
    void addContentPrompt(ContentPromptRequestDto contentPromptRequestDto);
    List<PromptResponseDto> getPromptList();
    void changePrompt(PromptRequestDto promptRequestDto, String id);
    PromptDetailsResponseDto searchPromptDetails(RetrievePromptRequestDto retrievePromptRequestDto);
}
