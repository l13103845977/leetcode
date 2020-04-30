package com.leetcode.config;

import com.github.xiaoymin.swaggerbootstrapui.annotations.EnableSwaggerBootstrapUI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.RequestHandlerKey;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * swagger 地址 http://127.0.0.1:9999/leetcode/swagger-ui.html
 * swagger-bootstrapui 地址 http://127.0.0.1:9999/leetcode/doc.html
 */

@EnableSwagger2
@Configuration
@EnableSwaggerBootstrapUI
public class SwaggerUiConfig {

    //api接口包扫描路径
    public static final String SWAGGER_SCAN_BASE_PACKAGE = "com.leetcode.controller";

    public static final String VERSION = "1.0.0";





    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .pathMapping("/")
                .select()
                .apis(RequestHandlerSelectors.basePackage(SWAGGER_SCAN_BASE_PACKAGE))
                .paths(PathSelectors.any())  //根据url路径选择哪些加入请求，哪些忽略
                .build();
    }


    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("leetcode")  //设置文档标题
                .description("leetcode文档")  //设置文档描述
                .version(VERSION) //设置文档版本信息
                .termsOfServiceUrl("http://www.baidu.com") // 设置文档的License信息
                .build();
    }
}
