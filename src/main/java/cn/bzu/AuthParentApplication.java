package cn.bzu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;

@SpringBootApplication
@EnableAuthorizationServer
@EnableWebSecurity
@MapperScan("cn.bzu.*")
public class AuthParentApplication {

    public static void main(String[] args) {
        SpringApplication.run(AuthParentApplication.class, args);
    }

}
