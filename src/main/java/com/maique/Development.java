package com.maique;
//annotation @Development criada para q n precisamos sempre por uma string "development" no profile.

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@Profile("development")
public @interface Development {
}
