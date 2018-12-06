package com.blog.edu.admin;


import com.spring4all.swagger.EnableSwagger2Doc;
import org.apache.logging.log4j.core.config.Configurator;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@SpringBootApplication
@EnableWebMvc
@ImportResource({"classpath*:config/spring/appcontext-*.xml"})
@ComponentScan({"com.blog.edu"})
@EnableSwagger2
public class AdminApplication extends SpringBootServletInitializer implements CommandLineRunner {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(AdminApplication.class);
    }

    public static void main(String[] args) {
       // String url = FileUploader.upload("", FileType.SERVICE.getCode(), new File)
        SpringApplication.run(AdminApplication.class, args);
    }

    @Override
    public void run(String... params) throws Exception {
        Configurator.initialize(null, "log4j2.xml");
    }

  }
