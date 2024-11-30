package com.multitap.prompt.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Category {
    RESUME("RESUME"),
    COVER_LETTER("COVER_LETTER"),
    PORTFOLIO("PORTFOLIO"),
    INTERVIEW("INTERVIEW");
    private final String value;
}
