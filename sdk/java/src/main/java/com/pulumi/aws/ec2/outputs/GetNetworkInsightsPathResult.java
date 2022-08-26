// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetNetworkInsightsPathFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetNetworkInsightsPathResult {
    /**
     * @return The ARN of the selected Network Insights Path.
     * 
     */
    private String arn;
    /**
     * @return The AWS resource that is the destination of the path.
     * 
     */
    private String destination;
    /**
     * @return The IP address of the AWS resource that is the destination of the path.
     * 
     */
    private String destinationIp;
    /**
     * @return The destination port.
     * 
     */
    private Integer destinationPort;
    private @Nullable List<GetNetworkInsightsPathFilter> filters;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private String networkInsightsPathId;
    /**
     * @return The protocol.
     * 
     */
    private String protocol;
    /**
     * @return The AWS resource that is the source of the path.
     * 
     */
    private String source;
    /**
     * @return The IP address of the AWS resource that is the source of the path.
     * 
     */
    private String sourceIp;
    /**
     * @return A map of tags assigned to the resource.
     * 
     */
    private Map<String,String> tags;

    private GetNetworkInsightsPathResult() {}
    /**
     * @return The ARN of the selected Network Insights Path.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The AWS resource that is the destination of the path.
     * 
     */
    public String destination() {
        return this.destination;
    }
    /**
     * @return The IP address of the AWS resource that is the destination of the path.
     * 
     */
    public String destinationIp() {
        return this.destinationIp;
    }
    /**
     * @return The destination port.
     * 
     */
    public Integer destinationPort() {
        return this.destinationPort;
    }
    public List<GetNetworkInsightsPathFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public String networkInsightsPathId() {
        return this.networkInsightsPathId;
    }
    /**
     * @return The protocol.
     * 
     */
    public String protocol() {
        return this.protocol;
    }
    /**
     * @return The AWS resource that is the source of the path.
     * 
     */
    public String source() {
        return this.source;
    }
    /**
     * @return The IP address of the AWS resource that is the source of the path.
     * 
     */
    public String sourceIp() {
        return this.sourceIp;
    }
    /**
     * @return A map of tags assigned to the resource.
     * 
     */
    public Map<String,String> tags() {
        return this.tags;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInsightsPathResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String destination;
        private String destinationIp;
        private Integer destinationPort;
        private @Nullable List<GetNetworkInsightsPathFilter> filters;
        private String id;
        private String networkInsightsPathId;
        private String protocol;
        private String source;
        private String sourceIp;
        private Map<String,String> tags;
        public Builder() {}
        public Builder(GetNetworkInsightsPathResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.destination = defaults.destination;
    	      this.destinationIp = defaults.destinationIp;
    	      this.destinationPort = defaults.destinationPort;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.networkInsightsPathId = defaults.networkInsightsPathId;
    	      this.protocol = defaults.protocol;
    	      this.source = defaults.source;
    	      this.sourceIp = defaults.sourceIp;
    	      this.tags = defaults.tags;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder destination(String destination) {
            this.destination = Objects.requireNonNull(destination);
            return this;
        }
        @CustomType.Setter
        public Builder destinationIp(String destinationIp) {
            this.destinationIp = Objects.requireNonNull(destinationIp);
            return this;
        }
        @CustomType.Setter
        public Builder destinationPort(Integer destinationPort) {
            this.destinationPort = Objects.requireNonNull(destinationPort);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetNetworkInsightsPathFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetNetworkInsightsPathFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder networkInsightsPathId(String networkInsightsPathId) {
            this.networkInsightsPathId = Objects.requireNonNull(networkInsightsPathId);
            return this;
        }
        @CustomType.Setter
        public Builder protocol(String protocol) {
            this.protocol = Objects.requireNonNull(protocol);
            return this;
        }
        @CustomType.Setter
        public Builder source(String source) {
            this.source = Objects.requireNonNull(source);
            return this;
        }
        @CustomType.Setter
        public Builder sourceIp(String sourceIp) {
            this.sourceIp = Objects.requireNonNull(sourceIp);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        public GetNetworkInsightsPathResult build() {
            final var o = new GetNetworkInsightsPathResult();
            o.arn = arn;
            o.destination = destination;
            o.destinationIp = destinationIp;
            o.destinationPort = destinationPort;
            o.filters = filters;
            o.id = id;
            o.networkInsightsPathId = networkInsightsPathId;
            o.protocol = protocol;
            o.source = source;
            o.sourceIp = sourceIp;
            o.tags = tags;
            return o;
        }
    }
}
