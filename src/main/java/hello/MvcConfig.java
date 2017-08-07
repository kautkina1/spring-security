package hello;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {
    
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/home").setViewName("home");
        registry.addViewController("/").setViewName("home");
        registry.addViewController("/hello_all").setViewName("hello_all");
        registry.addViewController("/hello_admin").setViewName("hello_admin");
        registry.addViewController("/forbidden").setViewName("forbidden");
        registry.addViewController("/login").setViewName("login");
    }

}
