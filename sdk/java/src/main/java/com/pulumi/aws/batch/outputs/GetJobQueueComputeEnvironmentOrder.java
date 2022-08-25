// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.batch.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetJobQueueComputeEnvironmentOrder {
    private String computeEnvironment;
    private Integer order;

    private GetJobQueueComputeEnvironmentOrder() {}
    public String computeEnvironment() {
        return this.computeEnvironment;
    }
    public Integer order() {
        return this.order;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetJobQueueComputeEnvironmentOrder defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String computeEnvironment;
        private Integer order;
        public Builder() {}
        public Builder(GetJobQueueComputeEnvironmentOrder defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.computeEnvironment = defaults.computeEnvironment;
    	      this.order = defaults.order;
        }

        @CustomType.Setter
        public Builder computeEnvironment(String computeEnvironment) {
            this.computeEnvironment = Objects.requireNonNull(computeEnvironment);
            return this;
        }
        @CustomType.Setter
        public Builder order(Integer order) {
            this.order = Objects.requireNonNull(order);
            return this;
        }
        public GetJobQueueComputeEnvironmentOrder build() {
            final var o = new GetJobQueueComputeEnvironmentOrder();
            o.computeEnvironment = computeEnvironment;
            o.order = order;
            return o;
        }
    }
}
