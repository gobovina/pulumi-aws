// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codedeploy.outputs;

import com.pulumi.aws.codedeploy.outputs.DeploymentGroupLoadBalancerInfoElbInfo;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupLoadBalancerInfoTargetGroupInfo;
import com.pulumi.aws.codedeploy.outputs.DeploymentGroupLoadBalancerInfoTargetGroupPairInfo;
import com.pulumi.core.annotations.CustomType;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class DeploymentGroupLoadBalancerInfo {
    /**
     * @return The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
     * 
     */
    private @Nullable List<DeploymentGroupLoadBalancerInfoElbInfo> elbInfos;
    /**
     * @return The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
     * 
     */
    private @Nullable List<DeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfos;
    /**
     * @return The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elb_info` and `target_group_info`.
     * 
     */
    private @Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfo targetGroupPairInfo;

    private DeploymentGroupLoadBalancerInfo() {}
    /**
     * @return The Classic Elastic Load Balancer to use in a deployment. Conflicts with `target_group_info` and `target_group_pair_info`.
     * 
     */
    public List<DeploymentGroupLoadBalancerInfoElbInfo> elbInfos() {
        return this.elbInfos == null ? List.of() : this.elbInfos;
    }
    /**
     * @return The (Application/Network Load Balancer) target group to use in a deployment. Conflicts with `elb_info` and `target_group_pair_info`.
     * 
     */
    public List<DeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfos() {
        return this.targetGroupInfos == null ? List.of() : this.targetGroupInfos;
    }
    /**
     * @return The (Application/Network Load Balancer) target group pair to use in a deployment. Conflicts with `elb_info` and `target_group_info`.
     * 
     */
    public Optional<DeploymentGroupLoadBalancerInfoTargetGroupPairInfo> targetGroupPairInfo() {
        return Optional.ofNullable(this.targetGroupPairInfo);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DeploymentGroupLoadBalancerInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<DeploymentGroupLoadBalancerInfoElbInfo> elbInfos;
        private @Nullable List<DeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfos;
        private @Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfo targetGroupPairInfo;
        public Builder() {}
        public Builder(DeploymentGroupLoadBalancerInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.elbInfos = defaults.elbInfos;
    	      this.targetGroupInfos = defaults.targetGroupInfos;
    	      this.targetGroupPairInfo = defaults.targetGroupPairInfo;
        }

        @CustomType.Setter
        public Builder elbInfos(@Nullable List<DeploymentGroupLoadBalancerInfoElbInfo> elbInfos) {
            this.elbInfos = elbInfos;
            return this;
        }
        public Builder elbInfos(DeploymentGroupLoadBalancerInfoElbInfo... elbInfos) {
            return elbInfos(List.of(elbInfos));
        }
        @CustomType.Setter
        public Builder targetGroupInfos(@Nullable List<DeploymentGroupLoadBalancerInfoTargetGroupInfo> targetGroupInfos) {
            this.targetGroupInfos = targetGroupInfos;
            return this;
        }
        public Builder targetGroupInfos(DeploymentGroupLoadBalancerInfoTargetGroupInfo... targetGroupInfos) {
            return targetGroupInfos(List.of(targetGroupInfos));
        }
        @CustomType.Setter
        public Builder targetGroupPairInfo(@Nullable DeploymentGroupLoadBalancerInfoTargetGroupPairInfo targetGroupPairInfo) {
            this.targetGroupPairInfo = targetGroupPairInfo;
            return this;
        }
        public DeploymentGroupLoadBalancerInfo build() {
            final var o = new DeploymentGroupLoadBalancerInfo();
            o.elbInfos = elbInfos;
            o.targetGroupInfos = targetGroupInfos;
            o.targetGroupPairInfo = targetGroupPairInfo;
            return o;
        }
    }
}
