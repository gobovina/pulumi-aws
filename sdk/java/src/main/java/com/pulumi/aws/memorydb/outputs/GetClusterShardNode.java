// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.memorydb.outputs;

import com.pulumi.aws.memorydb.outputs.GetClusterShardNodeEndpoint;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetClusterShardNode {
    /**
     * @return The Availability Zone in which the node resides.
     * 
     */
    private String availabilityZone;
    /**
     * @return The date and time when the node was created. Example: `2022-01-01T21:00:00Z`.
     * 
     */
    private String createTime;
    private List<GetClusterShardNodeEndpoint> endpoints;
    /**
     * @return Name of the cluster.
     * 
     */
    private String name;

    private GetClusterShardNode() {}
    /**
     * @return The Availability Zone in which the node resides.
     * 
     */
    public String availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * @return The date and time when the node was created. Example: `2022-01-01T21:00:00Z`.
     * 
     */
    public String createTime() {
        return this.createTime;
    }
    public List<GetClusterShardNodeEndpoint> endpoints() {
        return this.endpoints;
    }
    /**
     * @return Name of the cluster.
     * 
     */
    public String name() {
        return this.name;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetClusterShardNode defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String availabilityZone;
        private String createTime;
        private List<GetClusterShardNodeEndpoint> endpoints;
        private String name;
        public Builder() {}
        public Builder(GetClusterShardNode defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.availabilityZone = defaults.availabilityZone;
    	      this.createTime = defaults.createTime;
    	      this.endpoints = defaults.endpoints;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder availabilityZone(String availabilityZone) {
            this.availabilityZone = Objects.requireNonNull(availabilityZone);
            return this;
        }
        @CustomType.Setter
        public Builder createTime(String createTime) {
            this.createTime = Objects.requireNonNull(createTime);
            return this;
        }
        @CustomType.Setter
        public Builder endpoints(List<GetClusterShardNodeEndpoint> endpoints) {
            this.endpoints = Objects.requireNonNull(endpoints);
            return this;
        }
        public Builder endpoints(GetClusterShardNodeEndpoint... endpoints) {
            return endpoints(List.of(endpoints));
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        public GetClusterShardNode build() {
            final var o = new GetClusterShardNode();
            o.availabilityZone = availabilityZone;
            o.createTime = createTime;
            o.endpoints = endpoints;
            o.name = name;
            return o;
        }
    }
}
