package com.multitap.prompt.dto.out;

import com.multitap.prompt.domain.PromptDetails;
import com.multitap.prompt.vo.out.PromptDetailsResponseVo;
import jakarta.annotation.security.DenyAll;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PromptDetailsResponseDto {

    private String replyFormat; // 응답 포맷
    private String request; // prompt 내용

    @Builder
    public PromptDetailsResponseDto(String replyFormat, String request) {
        this.replyFormat = replyFormat;
        this.request = request;
    }

    public static PromptDetailsResponseDto from(PromptDetails promptDetails) {
        return PromptDetailsResponseDto.builder()
                .replyFormat(promptDetails.getReplyFormat())
                .request(promptDetails.getRequest())
                .build();
    }

    public PromptDetailsResponseVo toVo() {
        return PromptDetailsResponseVo.builder()
                .replyFormat(replyFormat)
                .request(request)
                .build();
    }


}
