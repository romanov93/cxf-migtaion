package com.example.cxfmigration;

import org.apache.cxf.jaxrs.openapi.OpenApiFeature;
import org.apache.cxf.jaxrs.swagger.ui.SwaggerUiConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfiguration {

//    @Bean
//    public Server jaxRsServer(Bus bus) {
//        final JAXRSServerFactoryBean factory = new JAXRSServerFactoryBean();
//
//        factory.setServiceBean(userController);
//        factory.setProvider(new JacksonJsonProvider());
//        factory.setFeatures(Arrays.asList(swaggerFeature()));
//        factory.setBus(bus);
//        factory.setAddress("/");
//        return factory.create();
//    }


    @Bean
    public OpenApiFeature swaggerFeature() {
        OpenApiFeature swagger = new OpenApiFeature();
        swagger.setVersion("1.0.0");
        //swagger.setBasePath("/");
        swagger.setPrettyPrint(true);
        //swagger.setSchemes(new String[]{"https", "http"});
        swagger.setContactEmail("example@mail.ru");
        swagger.setDescription("Swagger cxf app");
        swagger.setTitle("Title");
        swagger.setSupportSwaggerUi(true);
        swagger.setSwaggerUiConfig(new SwaggerUiConfig().configUrl("/openapi.json"));
        //swagger.setHost("localhost:8080");
        System.out.println("http://localhost:8080/api-docs?url=/openapi.json");
        return swagger;
    }

}
