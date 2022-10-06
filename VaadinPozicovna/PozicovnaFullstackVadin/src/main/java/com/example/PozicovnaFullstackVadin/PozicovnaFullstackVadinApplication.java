package com.example.PozicovnaFullstackVadin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;

import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;

import com.example.PozicovnaFullstackVadin.ui.LoginView;
import com.vaadin.flow.spring.security.VaadinWebSecurity;


@SpringBootApplication
public class PozicovnaFullstackVadinApplication extends VaadinWebSecurity{

	

	public static void main(String[] args) {
		SpringApplication.run(PozicovnaFullstackVadinApplication.class, args);
	}

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		
		super.configure(http);
		setLoginView(http, LoginView.class);
	}
	
	@Bean
	public UserDetailsManager userDetailsService() throws Exception{
		
		return new InMemoryUserDetailsManager(
			User.withUsername("Filip").password("{noop}asdfghjkl").roles("ADMIN").build(),
			User.withUsername("Ondrej").password("{noop}h").roles("ADMIN").build()
		);
	}

}
