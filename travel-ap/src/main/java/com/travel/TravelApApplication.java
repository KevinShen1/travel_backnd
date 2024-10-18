package com.travel;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.AnnotationBeanNameGenerator;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.scheduling.annotation.EnableAsync;


@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
@EnableAsync
@ServletComponentScan
//@MapperScan(basePackages = {"com.travel.mapper"})
@ComponentScan(nameGenerator = TravelApApplication.SpringBeanNameGenerator.class)
public class TravelApApplication {
    public static class SpringBeanNameGenerator extends AnnotationBeanNameGenerator {
        @Override
        protected String buildDefaultBeanName(BeanDefinition definition) {
            return definition.getBeanClassName();
        }
    }
    public static void main(String[] args) {
        SpringApplication.run(TravelApApplication.class);
    }
}
