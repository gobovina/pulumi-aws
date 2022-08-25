// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ecs.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class TaskSetLoadBalancer {
    /**
     * @return The name of the container to associate with the load balancer (as it appears in a container definition).
     * 
     */
    private String containerName;
    /**
     * @return The port on the container to associate with the load balancer. Defaults to `0` if not specified.
     * 
     */
    private @Nullable Integer containerPort;
    /**
     * @return The name of the ELB (Classic) to associate with the service.
     * 
     */
    private @Nullable String loadBalancerName;
    /**
     * @return The ARN of the Load Balancer target group to associate with the service.
     * 
     */
    private @Nullable String targetGroupArn;

    private TaskSetLoadBalancer() {}
    /**
     * @return The name of the container to associate with the load balancer (as it appears in a container definition).
     * 
     */
    public String containerName() {
        return this.containerName;
    }
    /**
     * @return The port on the container to associate with the load balancer. Defaults to `0` if not specified.
     * 
     */
    public Optional<Integer> containerPort() {
        return Optional.ofNullable(this.containerPort);
    }
    /**
     * @return The name of the ELB (Classic) to associate with the service.
     * 
     */
    public Optional<String> loadBalancerName() {
        return Optional.ofNullable(this.loadBalancerName);
    }
    /**
     * @return The ARN of the Load Balancer target group to associate with the service.
     * 
     */
    public Optional<String> targetGroupArn() {
        return Optional.ofNullable(this.targetGroupArn);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(TaskSetLoadBalancer defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String containerName;
        private @Nullable Integer containerPort;
        private @Nullable String loadBalancerName;
        private @Nullable String targetGroupArn;
        public Builder() {}
        public Builder(TaskSetLoadBalancer defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.containerName = defaults.containerName;
    	      this.containerPort = defaults.containerPort;
    	      this.loadBalancerName = defaults.loadBalancerName;
    	      this.targetGroupArn = defaults.targetGroupArn;
        }

        @CustomType.Setter
        public Builder containerName(String containerName) {
            this.containerName = Objects.requireNonNull(containerName);
            return this;
        }
        @CustomType.Setter
        public Builder containerPort(@Nullable Integer containerPort) {
            this.containerPort = containerPort;
            return this;
        }
        @CustomType.Setter
        public Builder loadBalancerName(@Nullable String loadBalancerName) {
            this.loadBalancerName = loadBalancerName;
            return this;
        }
        @CustomType.Setter
        public Builder targetGroupArn(@Nullable String targetGroupArn) {
            this.targetGroupArn = targetGroupArn;
            return this;
        }
        public TaskSetLoadBalancer build() {
            final var o = new TaskSetLoadBalancer();
            o.containerName = containerName;
            o.containerPort = containerPort;
            o.loadBalancerName = loadBalancerName;
            o.targetGroupArn = targetGroupArn;
            return o;
        }
    }
}
