package ghailene.souissi.springbootapp.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Swagger configuration
 */
@Configuration
@EnableSwagger2
public class SwaggerConfig {
    /***
     * a bean for swagger configuration
     * @return
     */
    @Bean
    public Docket api() {
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .apis(RequestHandlerSelectors.any())
                .paths(PathSelectors.any())
                .build();
    }

    /***
     * Adding information about the swagger
     * @return
     */
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("SpringBoot REST API with Swagger")
                .description("SpringBoot REST API with Swagger")
                .version("2.0")
                .build();
    }
}

