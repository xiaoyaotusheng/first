package com.zhiyun.first.config;



import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.service.Contact;
import springfox.documentation.service.ApiInfo;

import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.builders.ApiInfoBuilder;

import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

import springfox.documentation.swagger2.annotations.EnableSwagger2;


/**
 * Swagger配置类
 * @author bfy--lujian
 * @version 1.0.0
 * 创建时间：2018/8/1
 * @email bfyjian@gmail.com
 */
@Configuration //标记配置类
@EnableSwagger2 //开启在线接口文档
public class SwaggerConfig {
    /**
     * 添加摘要信息(Docket)
     */
    @Bean
    public Docket controllerApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //自行修改为自己的包路径
                .apis(RequestHandlerSelectors.basePackage("com.zhiyun.first.controller"))
                .paths(PathSelectors.any())
                .build();

    }

    private ApiInfo apiInfo(){
        return  new ApiInfoBuilder()
                .title("XIAOYAOTU_汽车租赁系统_接口文档")
                .description("描述：用于线上用户购租用车辆,具体包括XXX,XXX模块...")
                .contact(new Contact("LQ", "http://www.baidu.com","383118820@163.com"))
                .version("版本号:1.0")
                .build();
    }


}
