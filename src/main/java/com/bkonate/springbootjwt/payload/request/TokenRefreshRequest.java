package com.bkonate.springbootjwt.payload.request;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class TokenRefreshRequest {
    @NotBlank
    @Size( min = 2)
    private String refreshToken;
    public String getRefreshToken() {
        return refreshToken;
    }
    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
