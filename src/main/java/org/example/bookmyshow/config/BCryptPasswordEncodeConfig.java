package org.example.bookmyshow.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@Configuration
public class BCryptPasswordEncodeConfig {

    @Bean
    public BCryptPasswordEncoder getBCryptPasswordEncode() {
        return new BCryptPasswordEncoder();
    }

}
