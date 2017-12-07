package com.rebelscrum.MSUBanner.Application.Configurations;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * repository configuration
 */
@Configuration
@EnableAutoConfiguration
@EntityScan(basePackages = {"com.rebelscrum.MSUBanner.Application.Entity"})
@EnableJpaRepositories(basePackages = {
        "com.rebelscrum.MSUBanner.Application.Repository"})
@EnableTransactionManagement
public class RepositoryConfiguration {
}
