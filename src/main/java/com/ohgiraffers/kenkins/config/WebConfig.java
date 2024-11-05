package com.ohgiraffers.kenkins.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebConfig implements WebMvcConfigurer {

    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**") // 모든 경로에 대해
                /* NodePort 설정으로 처맇라 때는 Origin이 달라서 CORS 처리가 필요함*/
                // .allowedOrigins("http://localhost:30000") // 허용할 출처
                /* Ingress 설정 시 단일 진입점을 사용하므로 CORS 처리가 불필요함
                * 다만 다른 CORS 처리가 필요할 가능성을 염두에 두고 코드만 남겨놨음 */
                .allowedMethods("GET", "POST", "PUT", "DELETE") // 허용할 HTTP 메서드
                .allowedOrigins()
                .allowedHeaders("*") // 모든 헤더 허용
                .allowCredentials(true); // 자격 증명(쿠키 등) 허용
    }
}