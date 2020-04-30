Authorize 功能是后端配置类似JWT等权限配置而设置的,可以全局配置token等参数

![](images/auth.png)

当后台通过代码设置后,UI会自动识别,生成Authorize菜单功能,供开发者填相关auth参数等

后台代码示例(**[SwaggerConfiguration.java](https://gitee.com/xiaoym/swagger-bootstrap-ui-demo/blob/master/swagger-bootstrap-ui-demo/src/main/java/com/swagger/bootstrap/ui/demo/config/SwaggerConfiguration.java)**)：

```java
@Bean(value = "groupRestApi")
@Order(value = 1)
public Docket groupRestApi() {
    return new Docket(DocumentationType.SWAGGER_2)
        .apiInfo(groupApiInfo())
        .groupName("分组接口")
        .select()
        .apis(RequestHandlerSelectors.basePackage("com.swagger.bootstrap.ui.demo.group"))
        .paths(PathSelectors.any())
        .build().securityContexts(Lists.newArrayList(securityContext(),securityContext1())).securitySchemes(Lists.<SecurityScheme>newArrayList(apiKey(),apiKey1()));
}


private ApiKey apiKey() {
        return new ApiKey("BearerToken", "Authorization", "header");
}
private ApiKey apiKey1() {
    return new ApiKey("BearerToken1", "Authorization-x", "header");
}

private SecurityContext securityContext() {
    return SecurityContext.builder()
        .securityReferences(defaultAuth())
        .forPaths(PathSelectors.regex("/.*"))
        .build();
}
private SecurityContext securityContext1() {
    return SecurityContext.builder()
        .securityReferences(defaultAuth1())
        .forPaths(PathSelectors.regex("/.*"))
        .build();
}
```

