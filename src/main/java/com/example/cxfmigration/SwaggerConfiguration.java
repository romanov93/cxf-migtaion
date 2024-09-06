package com.example.cxfmigration;

import org.apache.cxf.jaxrs.swagger.Swagger2Feature;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

    @Bean
    public Swagger2Feature swaggerFeature() {
        Swagger2Feature swagger = new Swagger2Feature();
        swagger.setVersion("1.0.0");
        swagger.setBasePath("/");
        swagger.setPrettyPrint(true);
        swagger.setSchemes(new String[]{"https", "http"});
        swagger.setContact("example@mail.ru");
        swagger.setDescription("Swagger cxf app");
        swagger.setTitle("Title");
        swagger.setSupportSwaggerUi(true);
        swagger.setHost("localhost:8080");
        System.out.println("http://localhost:8080/api-docs?url=/swagger.json");
        return swagger;
    }

}
