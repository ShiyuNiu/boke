package com.boke.house.configuration;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import javax.sql.DataSource;

@Configuration
@Data
@Slf4j
public class DatabaseConfig {
    @Value("${datasource.driver-class-name}")
    private String driverClassName;
    @Value("${datasource.url}")
    private String url;
    @Value("${datasource.config-location}")
    private String configLocation;

    public DatabaseConfig() {
    }

    @Bean
    public DataSource dataSource() {
        System.out.println("#1" + driverClassName);
        System.out.println("#2" + url);
        System.out.println("#3" + configLocation);
        DataSourceBuilder builder = DataSourceBuilder.create();
        builder.driverClassName(driverClassName);
        builder.url(url);
        return builder.build();
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource());
        sqlSessionFactoryBean.setConfigLocation(new ClassPathResource(configLocation));
        return sqlSessionFactoryBean.getObject();
    }

    @Bean
    public SqlSessionTemplate sqlSessionTemplate() throws Exception {
        return new SqlSessionTemplate(sqlSessionFactory());
    }
}
