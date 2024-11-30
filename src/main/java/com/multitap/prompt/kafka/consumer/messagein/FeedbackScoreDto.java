package com.multitap.prompt.kafka.consumer.messagein;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class FeedbackScoreDto {

    private ElementScore firstScore;
    private ElementScore lastScore;
    private String categoryCode;

    @Builder
    public FeedbackScoreDto(ElementScore firstScore, ElementScore lastScore, String categoryCode) {
        this.firstScore = firstScore;
        this.lastScore = lastScore;
        this.categoryCode = categoryCode;
    }

    @Getter
    @NoArgsConstructor
    public static class ElementScore {

        private Integer element1;
        private Integer element2;
        private Integer element3;
        private Integer element4;
        private Integer element5;
        private String mentoringDate;

        @Builder
        public ElementScore(Integer element1, Integer element2, Integer element3, Integer element4, Integer element5, String mentoringDate) {
            this.element1 = element1;
            this.element2 = element2;
            this.element3 = element3;
            this.element4 = element4;
            this.element5 = element5;
            this.mentoringDate = mentoringDate;
        }
    }
}
