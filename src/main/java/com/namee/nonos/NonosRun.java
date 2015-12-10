package com.namee.nonos;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.annotation.Order;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@SpringBootApplication
@MapperScan("com.namee.nonos.dao")
public class NonosRun {
	
	
	public static void main(String[] args) {
		SpringApplication.run(NonosRun.class, args);
	}
//config패키지에 별도로 분리하지 않고 여기에 내부클래스로 작성해도 된다. 	
//	class customSecurity extends WebSecurityConfigurerAdapter {
//	    @Override
//	    protected void configure(HttpSecurity http) throws Exception {
//	    	// http접근별 권한 및 로그인 설정  
//	        http
//	            .authorizeRequests()
//	                .antMatchers("/", "/orderList","/order/*","/loginProcess").permitAll()
//	                .antMatchers("/orderModify/**","/orderModifyView","/orderWrite","/orderWriteView").hasRole("USER")
//	                .antMatchers("/orderDelete").hasRole("EDITOR")
//	                .anyRequest().authenticated()
//	                .and()
//	            .formLogin()
//	                .loginPage("/login").defaultSuccessUrl("/orderList")
//	                .permitAll()
//	                .and()
//	            .logout()
//	                .permitAll();
//	          
//	      http.csrf().disable();    
//	    }
//
//	    //인메모리 사용자 등록 
//	    @Autowired
//	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
//	        auth
//	            .inMemoryAuthentication()
//	                .withUser("user").password("p").roles("USER").and()
//	        		.withUser("u2").password("22").roles("USER").and()
//	        		.withUser("u3").password("33").roles("USER").and()
//	        		.withUser("u5").password("55").roles("USER","EDITOR").and()
//	        		.withUser("admin").password("admin").roles("ADMIN","USER");
//	        
//	    }
//	}
	
//	mapperscan어노테이션으로 대체 
//	@Bean
//	public SqlSessionFactory sqlSessionFactory(DataSource dataSource) throws Exception {
//		SqlSessionFactoryBean sessionFactoryBean = new SqlSessionFactoryBean();
//		sessionFactoryBean.setDataSource(dataSource);
//		return sessionFactoryBean.getObject();
//	}
}
