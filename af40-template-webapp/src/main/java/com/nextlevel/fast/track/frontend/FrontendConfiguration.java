package com.nextlevel.fast.track.frontend;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;


@Configuration
@Order(SecurityProperties.ACCESS_OVERRIDE_ORDER)
@EnableGlobalMethodSecurity(prePostEnabled=true)
public class FrontendConfiguration extends WebSecurityConfigurerAdapter {

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
            .antMatchers(HttpMethod.OPTIONS, "/**")
            .antMatchers("/app/**/*.{js,html}")
            .antMatchers("/bower_components/**")
            .antMatchers("/i18n/**")
            .antMatchers("/assets/**")
            .antMatchers("/css/**")
            .antMatchers("/");
    }
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
        http
            .formLogin()
            .loginProcessingUrl("/api/authentication")
            .usernameParameter("j_username")
            .passwordParameter("j_password")
            .permitAll()
        .and()
            .authorizeRequests()
	        .antMatchers("/user").authenticated()
	        .antMatchers("/businessPartner").authenticated()
	        .antMatchers("/connectionObject").authenticated()
	        .antMatchers("/gateway").authenticated()
	        .antMatchers("/meteringPoint").authenticated()
	    .and()
	    	.csrf()
	    	.csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse());
	}
	
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth
            .inMemoryAuthentication()
                .withUser("user").password("password").roles("USER")
                .and()
                .withUser("admin").password("password").roles("USER", "ADMIN");
    }
}
