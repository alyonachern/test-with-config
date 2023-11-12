package alyonachern.config;

import org.aeonbits.owner.Config;

@Config.Sources({
        "classpath:config/${launch}.properties"
})
public interface LaunchConfig extends Config {

        @Key("browser")
        String browser();

        @Key("version")
        String version();

        @Key("remoteUrl")
        String remoteUrl();
    }
