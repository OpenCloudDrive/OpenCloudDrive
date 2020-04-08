package net.geektop.account.user.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * @author Alex
 * @version V1.0
 * @Package net.geektop.account.user.configuration
 * @date 2020/3/29 01:06
 */

@Configuration
@EnableSwagger2
@ComponentScan("net.geektop.account.user.controller")
public class SwaggerConfiguration {
  @Bean
  public Docket api() {
    return new Docket(DocumentationType.SWAGGER_2)
//      .globalOperationParameters(getParameters())
      .apiInfo(apiInfo())
      .select()
      .apis(RequestHandlerSelectors.any())
      .build();
  }

  private ApiInfo apiInfo() {
    return new ApiInfoBuilder()
      .title("用户系统 API")
      .description("用户系统 API 文档")
      .termsOfServiceUrl("https://github.com/Alexcn/insight-project")
      .version("1.0")
      .contact(new Contact("Alex", "https://github.com/Alexcn/insight-project",
        "zhiliang.im@gmail.com"))
      .build();
  }
}
