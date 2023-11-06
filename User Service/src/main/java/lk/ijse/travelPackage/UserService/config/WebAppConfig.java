package lk.ijse.travelPackage.UserService.config;

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
/**
 * Created by Vishnuka Yahan
 *
 * @author  : Vishnuka Yahan
 * @data    : 10/17/2023
 * @project : Next TravelPvt. Ltd
 *
 */
@Configuration
public class WebAppConfig {
    @Bean
    public ModelMapper modelMapper(){
        return new ModelMapper();
    }
}
