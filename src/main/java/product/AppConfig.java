package product;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class AppConfig implements WebMvcConfigurer {

  @Override
  public void addCorsMappings(CorsRegistry registry) {
    registry.addMapping("/api/**")          //요청 URL
        .allowedOrigins("http://localhost:5502")      //요청 Client
        .allowedMethods("*")                          //모든 Method
        .maxAge(3000);                                //캐쉬시간
  }
}
