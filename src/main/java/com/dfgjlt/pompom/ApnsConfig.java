package com.dfgjlt.pompom;

import com.eatthepath.pushy.apns.ApnsClient;
import com.eatthepath.pushy.apns.ApnsClientBuilder;
import com.eatthepath.pushy.apns.auth.ApnsSigningKey;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.ClassPathResource;

import java.io.File;

@Configuration
public class ApnsConfig {

    @Bean
    public ApnsClient apnsClient() {
        ApnsClient returnValue = null;

        try {
            //File pkcs8File = new ClassPathResource("AuthKey_JMQRCDBP3A.p8").getFile();
            File pkcs8File = new File("../src/main/resources/AuthKey_JMQRCDBP3A.p8");

            returnValue = new ApnsClientBuilder()
                    .setApnsServer(ApnsClientBuilder.DEVELOPMENT_APNS_HOST)
                    .setSigningKey(ApnsSigningKey.loadFromPkcs8File(pkcs8File, "48GP9CQUU6", "JMQRCDBP3A"))
                    .build();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return returnValue;
    }
}
