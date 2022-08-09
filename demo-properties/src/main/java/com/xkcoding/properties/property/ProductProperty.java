package com.xkcoding.properties.property;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@ConfigurationProperties(prefix = "product")
@Component
public class ProductProperty {
    private String name;
    private String website;
    private String qq;
    private String phoneNumber;
}
