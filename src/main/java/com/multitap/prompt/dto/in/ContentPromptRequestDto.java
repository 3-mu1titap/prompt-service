package com.multitap.prompt.dto.in;


import com.multitap.prompt.domain.Prompt;
import com.multitap.prompt.domain.PromptDetails;
import com.multitap.prompt.domain.enums.Category;
import com.multitap.prompt.vo.in.ContentPromptRequestVo;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class ContentPromptRequestDto {

    private Category category;
    private String replyFormat;
    private String request;

    @Builder
    public ContentPromptRequestDto(Category category, String replyFormat, String request) {
        this.category = category;
        this.replyFormat = replyFormat;
        this.request = request;
    }

    public static ContentPromptRequestDto from(ContentPromptRequestVo contentPromptRequestVo){
        return ContentPromptRequestDto.builder()
               .category(contentPromptRequestVo.getCategory())
               .replyFormat(contentPromptRequestVo.getReplyFormat())
               .request(contentPromptRequestVo.getRequest())
               .build();
    }

    public Prompt toEntity(ContentPromptRequestDto contentPromptRequestDto) {
        return Prompt.builder()
                .category(contentPromptRequestDto.getCategory())
                .promptDetails(PromptDetails.builder()
                        .replyFormat(contentPromptRequestDto.getReplyFormat())
                        .request(contentPromptRequestDto.getRequest())
                        .build())
                .build();
    }

}
