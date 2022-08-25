// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetNetworkInterfaceAttachment {
    private String attachmentId;
    private Integer deviceIndex;
    private String instanceId;
    private String instanceOwnerId;

    private GetNetworkInterfaceAttachment() {}
    public String attachmentId() {
        return this.attachmentId;
    }
    public Integer deviceIndex() {
        return this.deviceIndex;
    }
    public String instanceId() {
        return this.instanceId;
    }
    public String instanceOwnerId() {
        return this.instanceOwnerId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetNetworkInterfaceAttachment defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String attachmentId;
        private Integer deviceIndex;
        private String instanceId;
        private String instanceOwnerId;
        public Builder() {}
        public Builder(GetNetworkInterfaceAttachment defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.attachmentId = defaults.attachmentId;
    	      this.deviceIndex = defaults.deviceIndex;
    	      this.instanceId = defaults.instanceId;
    	      this.instanceOwnerId = defaults.instanceOwnerId;
        }

        @CustomType.Setter
        public Builder attachmentId(String attachmentId) {
            this.attachmentId = Objects.requireNonNull(attachmentId);
            return this;
        }
        @CustomType.Setter
        public Builder deviceIndex(Integer deviceIndex) {
            this.deviceIndex = Objects.requireNonNull(deviceIndex);
            return this;
        }
        @CustomType.Setter
        public Builder instanceId(String instanceId) {
            this.instanceId = Objects.requireNonNull(instanceId);
            return this;
        }
        @CustomType.Setter
        public Builder instanceOwnerId(String instanceOwnerId) {
            this.instanceOwnerId = Objects.requireNonNull(instanceOwnerId);
            return this;
        }
        public GetNetworkInterfaceAttachment build() {
            final var o = new GetNetworkInterfaceAttachment();
            o.attachmentId = attachmentId;
            o.deviceIndex = deviceIndex;
            o.instanceId = instanceId;
            o.instanceOwnerId = instanceOwnerId;
            return o;
        }
    }
}
