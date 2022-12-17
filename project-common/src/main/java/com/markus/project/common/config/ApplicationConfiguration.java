package com.markus.project.common.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author: markus
 * @date: 2022/12/17 4:46 PM
 * @Description: 应用配置
 * @Blog: http://markuszhang.com
 * It's my honor to share what I've learned with you!
 */
@Configuration
@MapperScan("com.markus.project.mapper")
public class ApplicationConfiguration {
}
