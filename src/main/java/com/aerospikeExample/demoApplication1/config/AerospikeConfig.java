package com.aerospikeExample.demoApplication1.config;

import com.aerospike.client.Host;
import com.aerospikeExample.demoApplication1.repository.UserInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.aerospike.config.AbstractAerospikeDataConfiguration;
import org.springframework.data.aerospike.repository.config.EnableAerospikeRepositories;

import java.util.Collection;
import java.util.Collections;

@Configuration
@EnableConfigurationProperties(AerospikeConfigProperties.class)
@EnableAerospikeRepositories(basePackageClasses = UserInterface.class)
public class AerospikeConfig extends AbstractAerospikeDataConfiguration {

    @Autowired
    AerospikeConfigProperties aerospikeConfigProperties;

    @Override
    protected Collection<Host> getHosts() {
        Host hostData = new Host(aerospikeConfigProperties.getHost(), aerospikeConfigProperties.getPort());
        System.out.println(hostData.name+hostData.port);
        return Collections.singleton(hostData);
    }

    @Override
    protected String nameSpace() {
        return aerospikeConfigProperties.getNamespace();
    }
}
