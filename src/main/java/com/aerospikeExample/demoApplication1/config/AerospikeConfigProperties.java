package com.aerospikeExample.demoApplication1.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Data
@Component
@ConfigurationProperties(prefix = "aerospike")
public class AerospikeConfigProperties {
    private String host;
    private int port;
    private String namespace;
}
