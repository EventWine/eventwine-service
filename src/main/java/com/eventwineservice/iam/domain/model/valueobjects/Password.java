package com.eventwineservice.iam.domain.model.valueobjects;

import jakarta.persistence.Embeddable;
import lombok.Getter;

@Getter
@Embeddable
public class Password {
    private String value;

    protected Password() {}

    public Password(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
