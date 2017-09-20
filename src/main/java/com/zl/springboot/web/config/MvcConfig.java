package com.zl.springboot.web.config;

import com.zl.springboot.web.intercepetor.MyIntercepetor;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 注册所有的intercepetor
 */
@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter{

    /**
     * 添加 intercepetor
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new MyIntercepetor()).addPathPatterns("/*");
        super.addInterceptors(registry);
    }
}
