package com.example.springvault;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

@Data
@Configuration
public class VaultConfiguration {

    @Value("${firstName}")
    private String firstName;

    @Value("${lastName}")
    private String lastName;
}
