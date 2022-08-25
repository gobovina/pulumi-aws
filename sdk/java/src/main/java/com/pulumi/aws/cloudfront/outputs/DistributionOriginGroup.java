// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.DistributionOriginGroupFailoverCriteria;
import com.pulumi.aws.cloudfront.outputs.DistributionOriginGroupMember;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class DistributionOriginGroup {
    /**
     * @return The failover criteria for when to failover to the secondary origin
     * 
     */
    private DistributionOriginGroupFailoverCriteria failoverCriteria;
    /**
     * @return Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
     * 
     */
    private List<DistributionOriginGroupMember> members;
    /**
     * @return The unique identifier of the member origin
     * 
     */
    private String originId;

    private DistributionOriginGroup() {}
    /**
     * @return The failover criteria for when to failover to the secondary origin
     * 
     */
    public DistributionOriginGroupFailoverCriteria failoverCriteria() {
        return this.failoverCriteria;
    }
    /**
     * @return Ordered member configuration blocks assigned to the origin group, where the first member is the primary origin. You must specify two members.
     * 
     */
    public List<DistributionOriginGroupMember> members() {
        return this.members;
    }
    /**
     * @return The unique identifier of the member origin
     * 
     */
    public String originId() {
        return this.originId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(DistributionOriginGroup defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private DistributionOriginGroupFailoverCriteria failoverCriteria;
        private List<DistributionOriginGroupMember> members;
        private String originId;
        public Builder() {}
        public Builder(DistributionOriginGroup defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.failoverCriteria = defaults.failoverCriteria;
    	      this.members = defaults.members;
    	      this.originId = defaults.originId;
        }

        @CustomType.Setter
        public Builder failoverCriteria(DistributionOriginGroupFailoverCriteria failoverCriteria) {
            this.failoverCriteria = Objects.requireNonNull(failoverCriteria);
            return this;
        }
        @CustomType.Setter
        public Builder members(List<DistributionOriginGroupMember> members) {
            this.members = Objects.requireNonNull(members);
            return this;
        }
        public Builder members(DistributionOriginGroupMember... members) {
            return members(List.of(members));
        }
        @CustomType.Setter
        public Builder originId(String originId) {
            this.originId = Objects.requireNonNull(originId);
            return this;
        }
        public DistributionOriginGroup build() {
            final var o = new DistributionOriginGroup();
            o.failoverCriteria = failoverCriteria;
            o.members = members;
            o.originId = originId;
            return o;
        }
    }
}
