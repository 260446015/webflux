package com.ydw;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.*;
import static org.springframework.web.reactive.function.server.RouterFunctions.route;

/**
 * @Author yindwe@yonyou.com
 * @Date 2020/4/2
 */
@Configuration
public class RoutingConfiguration {
    @Bean
    public RouterFunction<ServerResponse> monoRouterFunction(CustomerHandler customerHandler) {
        return route(GET("/api/customer").and(accept(MediaType.APPLICATION_JSON)), customerHandler::getAll)
                .andRoute(GET("/api/customer/{id}").and(accept(MediaType.APPLICATION_JSON)), customerHandler::getCustomer)
                .andRoute(POST("/api/customer/post").and(accept(MediaType.APPLICATION_JSON)), customerHandler::postCustomer)
                .andRoute(PUT("/api/customer/put/{id}").and(accept(MediaType.APPLICATION_JSON)), customerHandler::putCustomer)
                .andRoute(DELETE("/api/customer/delete/{id}").and(accept(MediaType.APPLICATION_JSON)), customerHandler::deleteCustomer);
    }
}
