package com.sample.api.common.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SwaggerConfig {
    private final String TITLE = "SAMPLE API";
    private final String DESCRIPTION = "Spring Lib Sample API Documentation";
    private final String VERSION = "V0.0.1";
    private final String CONTACT_NAME = "API Support";
    private final String CONTACT_URL = "https://example.com/support";
    private final String CONTACT_EMAIL = "support@example.com";
    private final String LICENSE_NAME = "Apache 2.0";
    private final String LICENSE_URL = "http://www.apache.org/licenses/LICENSE-2.0.html";

    @Bean
    public GroupedOpenApi api() {
        return GroupedOpenApi.builder()
                .group("SAMPLE API")
                .packagesToScan("com.sample.api")
                .pathsToMatch("/orders/**")
                .build();
    }

    @Bean
    public OpenAPI apiInfo() {
        return new OpenAPI()
                .info(new Info()
                        .title(TITLE)
                        .description(DESCRIPTION)
                        .version(VERSION)
                        .contact(new Contact()
                                .name(CONTACT_NAME)
                                .url(CONTACT_URL)
                                .email(CONTACT_EMAIL))
                        .license(new License()
                                .name(LICENSE_NAME)
                                .url(LICENSE_URL)));
    }

}
