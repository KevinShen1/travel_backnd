package com.travel.common;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpHeaders;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * GlobalCorsConfig 啟用跨網域
 *
 */
@Configuration
@Order(0)
public class GlobalCorsConfig {
	@Bean
	public CorsFilter corsFilter() {
		// 添加CORS配置信息
		CorsConfiguration corsConfiguration = new CorsConfiguration();
		// 放行那些原始域
		corsConfiguration.addAllowedOrigin("*");
		// 是否發送cookie信息
		corsConfiguration.setAllowCredentials(false);
		// 放行那些原始域（請求方式）
		corsConfiguration.addAllowedMethod("*");
		// 放行那些原始域（頭部信息）
		corsConfiguration.addAllowedHeader("*");
		// 曝露那些頭部信息（因為跨域訪問默認不能獲取全部的頭部信息）
		corsConfiguration.addExposedHeader(HttpHeaders.ACCEPT);

		// 添加映射路徑
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		source.registerCorsConfiguration("/**", corsConfiguration);

		return new CorsFilter(source);
	}

	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			// 重寫父類提供的跨域請求處理的接口
			public void addCorsMappings(CorsRegistry registry) {
				// 添加映射路徑
				registry.addMapping("/**")
						// 放行那些原始域
//						.allowedOrigins("*")
						.allowedOriginPatterns("*")
						// 是否發送cookie信息
						.allowCredentials(true)
						// 放行那些原始域（請求方式）
						.allowedMethods("GET", "POST", "PUT", "PATCH", "OPTIONS", "DELETE")
						// 放行那些原始域（頭部信息）
						.allowedHeaders("*")
						// 曝露那些頭部信息（因為跨域訪問默認不能獲取全部的頭部信息）
						.exposedHeaders("Header1", "Header2");
			}
		};
	}
}
