package com.namee.nonos.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;

@Configuration
@EnableWebMvcSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
    	// http접근별 권한 및 로그인 설정  
        http
            .authorizeRequests()
                .antMatchers("/", "/orderList","/order/*").permitAll()
                .antMatchers("/orderModify/**","/orderModifyView","/orderWrite","/orderWriteView").hasRole("USER")
                .antMatchers("/orderDelete").hasRole("EDITOR")
                .anyRequest().authenticated()
                .and()
            .formLogin()
                .loginPage("/login").defaultSuccessUrl("/orderList")
                .permitAll()
                .and()
            .logout()//.logoutSuccessUrl("/logoutSuccess")
                .permitAll();
      http.csrf().disable();    
    }

    //인메모리 사용자 등록 
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("u1").password("11").roles("USER","LEADER").and()
        		.withUser("u2").password("22").roles("USER").and()
        		.withUser("u3").password("33").roles("USER").and()
        		.withUser("u5").password("55").roles("USER").and()
        		.withUser("admin").password("admin").roles("ADMIN","LEADER","USER");
        
    }
}
