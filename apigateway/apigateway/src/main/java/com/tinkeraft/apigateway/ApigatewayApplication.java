package com.tinkeraft.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@SpringBootApplication
public class ApigatewayApplication {

	@Bean
	public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
		return builder.routes()
				.route("referential", r -> r.path("/referential/**")
						.filters(f -> f.stripPrefix(1))
						.uri("lb://REFERENTIAL"))
				.route("member_service", r -> r.path("/member/**")
						.filters(f -> f.stripPrefix(1))
						.uri("lb://MEMBER"))
				.build();
	}

	public static void main(String[] args) {
		SpringApplication.run(ApigatewayApplication.class, args);
	}

}
