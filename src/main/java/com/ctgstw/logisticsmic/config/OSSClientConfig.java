package com.ctgstw.logisticsmic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 功能:
 * 创建日期:2019/1/10-11:46
 * 创建人:薛陈
 */
@Component
@ConfigurationProperties(prefix = "oss")
@Data
public class OSSClientConfig {
    private String endpoint;
    private String accessKeyId;
    private String accessKeySecret;
    private String bucketName;
    private String keyPath;
}
