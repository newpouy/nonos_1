package com.namee.nonos.config;

import org.springframework.boot.autoconfigure.web.WebMvcAutoConfiguration.WebMvcAutoConfigurationAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.UrlBasedViewResolver;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesView;

@Configuration
public class MvcConfig extends WebMvcAutoConfigurationAdapter {
////  컨트롤러를 별도로 두지 않고 이렇게 할 수도 있다. 	
////	@Override
////    public void addViewControllers(ViewControllerRegistry registry) {
////        registry.addViewController("/home").setViewName("home");
////        registry.addViewController("/").setViewName("home");
////        registry.addViewController("/hello").setViewName("hello");
////        registry.addViewController("/login").setViewName("login");
////    }
//	
	//이 설정도 application.properties에 넣을 수 있다. 
	@Bean
	public InternalResourceViewResolver viewResolver() {
		InternalResourceViewResolver resolver = new InternalResourceViewResolver();
		resolver.setPrefix("/WEB-INF/views/");
		resolver.setSuffix(".jsp");
		return resolver;
	}
	
	@Bean
	public UrlBasedViewResolver tilesResolver() {
		UrlBasedViewResolver tilesResolver = new UrlBasedViewResolver();
		tilesResolver.setOrder(1);
		tilesResolver.setViewClass(TilesView.class);
		return tilesResolver;
	}
	
	//tiles는 스프링에서 지원하지 않으므로 application.properties에 넣을 수 없다. 
	@Bean
	public TilesConfigurer configTiles() {
		TilesConfigurer tilesConfigurer = new TilesConfigurer();
		//tilesConfigurer.setDefinitions("","","");
		tilesConfigurer.setDefinitions("/WEB-INF/views/xml/tiles-layout.xml");
		return tilesConfigurer;
	}
	
//	@Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        registry.addResourceHandler("/static/**").addResourceLocations("/static/");
//    }
}
