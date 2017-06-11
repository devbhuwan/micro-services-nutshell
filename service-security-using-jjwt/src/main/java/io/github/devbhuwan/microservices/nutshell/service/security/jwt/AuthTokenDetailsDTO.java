package io.github.devbhuwan.microservices.nutshell.service.security.jwt;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;
import java.util.List;

/**
 * @author Bhuwan Upadhyay
 * @date 2017/06/10
 */
public class AuthTokenDetailsDTO {
    public String userId;
    public String email;
    public List<String> roleNames;

    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSZ")
    public Date expirationDate;
}
