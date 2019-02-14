package com.ctgstw.logisticsmic.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.validation.beanvalidation.MethodValidationPostProcessor;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

/**
 * 功能: 系统配置类
 * 创建日期:2019/1/28-16:42
 * 创建人:薛陈
 */
@Configuration
public class SystemConfig {
    /**
     * 结合@Validated @NotNull等验证类注解，可以在进入方法前进行参数验证 本系统暂时用于controller层
     *
     * @return
     */
    @Bean
    public MethodValidationPostProcessor mvp() {
        return new MethodValidationPostProcessor();
    }

    /**
     * 首先要注入ServerEndpointExporter，这个bean会自动注册使用了@ServerEndpoint注解声明的Websocket endpoint。要注意，如果使用独立的servlet容器，而不是直接使用springboot的内置容器，就不要注入ServerEndpointExporter，因为它将由容器自己提供和管理。
     *
     * @return 使用@SpringBootApplication启动类进行启动时需要下面这段代码，但生成war包部署在tomcat中不需要这段
     */
    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }

    /**
     * 跨域配置 保证浏览器可以跨域请求后台服务(需要另外的机制 只能允许信任的客户端访问 比如基于token的认证)
     *
     * @return
     */
    @Bean
    public WebMvcConfigurer corsConfigurer() {
        return new WebMvcConfigurerAdapter() {
            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping("/**");
            }
        };
    }
}
