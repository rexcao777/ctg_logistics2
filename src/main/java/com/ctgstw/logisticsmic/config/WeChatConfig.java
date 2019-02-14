package com.ctgstw.logisticsmic.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * 功能:
 * 创建日期:2019/1/29-13:32
 * 创建人:薛陈
 */
@Component
@ConfigurationProperties(prefix = "wechat")
@Data
public class WeChatConfig {
    private String appId;
    private String appSecret;
    private String accessTokenUrl;
    private String refreshTokenUrl;
    private String userInfoUrl;
}
