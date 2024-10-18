package com.travel.common;

import com.zaxxer.hikari.HikariDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

@Configuration
@MapperScan(basePackages = {TravelDBConfig.MAPPER_PACKAGE,
        TravelDBConfig.UMAPPER_PACKAGE}, sqlSessionFactoryRef = "TravelSqlSessionFactory")
public class TravelDBConfig {

    private final Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    static final String MAPPER_PACKAGE = "com.travel.mapper";
    static final String UMAPPER_PACKAGE = "com.travel.umapper";
    static final String MAPPER_LOCATION = "classpath*:com/travel/*/*Mapper.xml";

    @Value("${spring.datasource.url}")
    private String url;

    @Value("${spring.datasource.username}")
    private String user;

    @Value("${spring.datasource.password}")
    private String password;

    @Value("${spring.datasource.driver-class-name}")
    private String driverClass;

    @Bean(name = "travelDataSource")
    public HikariDataSource travelDataSource() {

        logger.info("TRAVEL driverClass :{}", driverClass);
        logger.info("TRAVEL url :{}", url);
        logger.info("TRAVEL user :{}", user);

        HikariDataSource dataSource = new HikariDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setJdbcUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        dataSource.setConnectionTimeout(45000);
        dataSource.setIdleTimeout(60000);
        dataSource.setMaxLifetime(1200000);
        dataSource.setMaximumPoolSize(20);
        return dataSource;
    }

    @Bean(name = "TravelTransactionManager")
    public DataSourceTransactionManager TEMSTransactionManager() {
        return new DataSourceTransactionManager(travelDataSource());
    }

    @Bean(name = "TravelSqlSessionFactory")
    public SqlSessionFactory TEMSSqlSessionFactory(@Qualifier("travelDataSource") HikariDataSource travelDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(travelDataSource);
        sessionFactory.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources(TravelDBConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}
