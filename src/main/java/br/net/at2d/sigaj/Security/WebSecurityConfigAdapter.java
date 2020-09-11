package br.net.at2d.sigaj.Security;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.http.HttpMethod;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.session.SessionManagementFilter;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import br.net.at2d.sigaj.Cliente.ClienteService;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfigAdapter extends WebSecurityConfigurerAdapter {

  @Autowired
  private ClienteService Service;

  private Md5 md5 = new Md5();

  @Bean
  public AuthenticationManager customAuthenticationManager() throws Exception {
    return super.authenticationManagerBean();
  }

  @Override
  protected void configure(HttpSecurity http) throws Exception {
    http.cors().and()
        // .addFilterBefore(corsFilter(), SessionManagementFilter.class) // adds your
        // custom CorsFilter
        .csrf().disable().authorizeRequests()
        .antMatchers("/h2-console", "/h2-console/**", "/authenticate", "/authenticatecnpj", "/v3/api-docs/**",
            "/swagger-ui/**", "/swagger-ui.html", "/webjars/**")
        .permitAll()
        // bloqueando as outras rotas
        .anyRequest().authenticated().and().addFilter(new JWTAuthenticationFilter(authenticationManager()))
        .addFilter(new JWTAuthorizationFilter(authenticationManager()))
        // this disables session creation on Spring Security
        .sessionManagement().sessionCreationPolicy(SessionCreationPolicy.STATELESS);
  }

  @Override
  public void configure(WebSecurity web) throws Exception {
    web.ignoring()
        .antMatchers("/h2-console", "/h2-console/**", "/authenticate", "/authenticatecnpj", "/v3/api-docs/**",
            "/v3/api-docs/swagger-config", "/swagger-ui/**", "/v3/api-docs.yml", "/configuration/ui",
            "/swagger-resources/**", "/configuration/security", "/swagger-ui.html", "/webjars/**")
        .antMatchers(HttpMethod.OPTIONS);

  }

  @Override
  protected void configure(AuthenticationManagerBuilder auth) throws Exception {
    auth.userDetailsService(Service).passwordEncoder(passwordEncoder());
  }

  @Bean
  public PasswordEncoder passwordEncoder() {
    return NoOpPasswordEncoder.getInstance();
    // new PasswordEncoder() {
    // @Override
    // public String encode(CharSequence charSequence) {
    // return md5.getMd5(charSequence.toString());
    // }

    // @Override
    // public boolean matches(CharSequence charSequence, String s) {
    // return md5.getMd5(charSequence.toString()).equals(s);
    // }
    // };
  }

  @Bean
  public WebMvcConfigurer corsConfigurer() {
    return new WebMvcConfigurer() {
      @Override
      public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**").allowedOrigins("*");
      }
    };
  }

  @Bean
  public CorsConfigurationSource corsConfigurationSource() {
    CorsConfiguration configuration = new CorsConfiguration();
    configuration.setAllowedOrigins(Arrays.asList("*"));
    configuration.setAllowedMethods(Arrays.asList("GET", "POST", "PUT", "PATCH", "DELETE", "OPTIONS"));
    configuration.setAllowedHeaders(Arrays.asList("*"));
    configuration.setExposedHeaders(Arrays.asList("Authorization"));
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return source;
  }
}