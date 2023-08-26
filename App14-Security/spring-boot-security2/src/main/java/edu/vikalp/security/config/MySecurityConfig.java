package edu.vikalp.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.*;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@Configuration
@EnableWebSecurity
//@EnableGlobalMethodSecurity(prePostEnabled = true)
public class MySecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {

//        http
//                .authorizeRequests()
//                .antMatchers("/public/**").permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .httpBasic();

        http
                .authorizeRequests()
                .antMatchers("/public/**").hasRole("SUPER")
                .antMatchers("/api/v1/**").hasRole("BASIC")
                .anyRequest()
                .authenticated()
                .and()
                .httpBasic();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth
                .inMemoryAuthentication()
                .withUser("admin")
                .password("admin")
                .roles("ADMIN");

        auth
                .inMemoryAuthentication()
                .withUser("basic")
                .password(this.passwordEncoder2().encode("basic"))
                .roles("BASIC");

        auth
                .inMemoryAuthentication()
                .withUser("super")
                .password(this.passwordEncoder2().encode("super"))
                .roles("SUPER");
    }

    @Bean
    public PasswordEncoder passwordEncoder2(){
        return new BCryptPasswordEncoder(9);
    }

//    @Bean
//    public PasswordEncoder passwordEncoder(){
//        return NoOpPasswordEncoder.getInstance();
//    }


}
