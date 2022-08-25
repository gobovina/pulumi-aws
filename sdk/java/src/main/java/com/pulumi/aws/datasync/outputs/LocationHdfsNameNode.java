// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.datasync.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class LocationHdfsNameNode {
    /**
     * @return The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent that&#39;s installed on-premises uses this hostname to communicate with the NameNode in the network.
     * 
     */
    private String hostname;
    /**
     * @return The port that the NameNode uses to listen to client requests.
     * 
     */
    private Integer port;

    private LocationHdfsNameNode() {}
    /**
     * @return The hostname of the NameNode in the HDFS cluster. This value is the IP address or Domain Name Service (DNS) name of the NameNode. An agent that&#39;s installed on-premises uses this hostname to communicate with the NameNode in the network.
     * 
     */
    public String hostname() {
        return this.hostname;
    }
    /**
     * @return The port that the NameNode uses to listen to client requests.
     * 
     */
    public Integer port() {
        return this.port;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LocationHdfsNameNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String hostname;
        private Integer port;
        public Builder() {}
        public Builder(LocationHdfsNameNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.hostname = defaults.hostname;
    	      this.port = defaults.port;
        }

        @CustomType.Setter
        public Builder hostname(String hostname) {
            this.hostname = Objects.requireNonNull(hostname);
            return this;
        }
        @CustomType.Setter
        public Builder port(Integer port) {
            this.port = Objects.requireNonNull(port);
            return this;
        }
        public LocationHdfsNameNode build() {
            final var o = new LocationHdfsNameNode();
            o.hostname = hostname;
            o.port = port;
            return o;
        }
    }
}
