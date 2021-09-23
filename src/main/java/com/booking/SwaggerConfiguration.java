package com.booking;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration

public class SwaggerConfiguration
{
	@Bean
	public Docket api()
{
return new Docket(DocumentationType:OAS_30)
.select()
.apis(RequestHandlerSelectors.basePackage("com.booking"))
.paths(PathSelectors.any())
.build().apiInfo(apiEndPointInfo());
}
public ApiInfo apiEndPointInfo()
{
return new ApiInfoBuilder().title("Spring Boot Project Rest API")
.description("Consumer API")
.contact(new Contact("NetjsTech","https://netjstech.com","infojtutor@gmail.com"))
.license("Apache 2.0")
.licenseUrl("http://www.apache.org/lisence/LICENSE-2.0.html")
.version("0.0.1-SNAPSHOT")
.build();
}

}