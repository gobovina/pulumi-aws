// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.mediapackage.outputs;

import com.pulumi.aws.mediapackage.outputs.ChannelHlsIngestIngestEndpoint;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class ChannelHlsIngest {
    /**
     * @return A list of the ingest endpoints
     * 
     */
    private @Nullable List<ChannelHlsIngestIngestEndpoint> ingestEndpoints;

    private ChannelHlsIngest() {}
    /**
     * @return A list of the ingest endpoints
     * 
     */
    public List<ChannelHlsIngestIngestEndpoint> ingestEndpoints() {
        return this.ingestEndpoints == null ? List.of() : this.ingestEndpoints;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ChannelHlsIngest defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<ChannelHlsIngestIngestEndpoint> ingestEndpoints;
        public Builder() {}
        public Builder(ChannelHlsIngest defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ingestEndpoints = defaults.ingestEndpoints;
        }

        @CustomType.Setter
        public Builder ingestEndpoints(@Nullable List<ChannelHlsIngestIngestEndpoint> ingestEndpoints) {
            this.ingestEndpoints = ingestEndpoints;
            return this;
        }
        public Builder ingestEndpoints(ChannelHlsIngestIngestEndpoint... ingestEndpoints) {
            return ingestEndpoints(List.of(ingestEndpoints));
        }
        public ChannelHlsIngest build() {
            final var o = new ChannelHlsIngest();
            o.ingestEndpoints = ingestEndpoints;
            return o;
        }
    }
}
