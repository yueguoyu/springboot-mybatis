package com.ygy.config;

import com.ygy.service.UserDao;
import com.ygy.service.UserDaoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;

/**
 * @author ygy
 * websecurity配置文件
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    //注册userdetsilsService的Bean
    @Bean
    UserDao userDaoImpl() {
        return new UserDaoImpl();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        super.configure(auth);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .anyRequest().authenticated()//经过身份验证的用户
                .and()
                .formLogin()
                .loginPage("/")
                .failureUrl("/")
                .permitAll()//登录界面任意访问
                .and()
                .logout().permitAll();//注销行为人以访问
    }
}
