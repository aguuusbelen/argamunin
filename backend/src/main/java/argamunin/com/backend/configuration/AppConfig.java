package argamunin.com.backend.configuration;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import argamunin.com.backend.service.GameService;
 
@Configuration
@Import(GameService.class)
public class AppConfig {
 
    @Bean
    public GameService gameBean() {
        return new GameService();
    }
 
    @Bean
    public ModelMapper modelMapperBean() {
        return new ModelMapper();
    }
}
