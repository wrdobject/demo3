package com.example.demo3.Config;

import org.assertj.core.util.Lists;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.HashSet;
@org.springframework.context.annotation.Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket documentation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.example.demo3"))
                .build()
                .protocols(new HashSet<String>(Lists.newArrayList("http")))
                .pathMapping("/")
                .apiInfo(apiInfo());
    }
  /*  @Bean
    public UiConfiguration uiConfig(){
        return UiConfiguration.DEFAULT;
    }*/
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("服务API")
                .description("服务端后台接口说明文档")
                .version("1.0")
                .build();

    }
}
