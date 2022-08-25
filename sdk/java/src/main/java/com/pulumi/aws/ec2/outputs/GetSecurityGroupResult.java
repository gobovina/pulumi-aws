// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.aws.ec2.outputs.GetSecurityGroupFilter;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class GetSecurityGroupResult {
    /**
     * @return The computed ARN of the security group.
     * 
     */
    private String arn;
    /**
     * @return The description of the security group.
     * 
     */
    private String description;
    private @Nullable List<GetSecurityGroupFilter> filters;
    private String id;
    private String name;
    private Map<String,String> tags;
    private String vpcId;

    private GetSecurityGroupResult() {}
    /**
     * @return The computed ARN of the security group.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The description of the security group.
     * 
     */
    public String description() {
        return this.description;
    }
    public List<GetSecurityGroupFilter> filters() {
        return this.filters == null ? List.of() : this.filters;
    }
    public String id() {
        return this.id;
    }
    public String name() {
        return this.name;
    }
    public Map<String,String> tags() {
        return this.tags;
    }
    public String vpcId() {
        return this.vpcId;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecurityGroupResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String description;
        private @Nullable List<GetSecurityGroupFilter> filters;
        private String id;
        private String name;
        private Map<String,String> tags;
        private String vpcId;
        public Builder() {}
        public Builder(GetSecurityGroupResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.description = defaults.description;
    	      this.filters = defaults.filters;
    	      this.id = defaults.id;
    	      this.name = defaults.name;
    	      this.tags = defaults.tags;
    	      this.vpcId = defaults.vpcId;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder description(String description) {
            this.description = Objects.requireNonNull(description);
            return this;
        }
        @CustomType.Setter
        public Builder filters(@Nullable List<GetSecurityGroupFilter> filters) {
            this.filters = filters;
            return this;
        }
        public Builder filters(GetSecurityGroupFilter... filters) {
            return filters(List.of(filters));
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder tags(Map<String,String> tags) {
            this.tags = Objects.requireNonNull(tags);
            return this;
        }
        @CustomType.Setter
        public Builder vpcId(String vpcId) {
            this.vpcId = Objects.requireNonNull(vpcId);
            return this;
        }
        public GetSecurityGroupResult build() {
            final var o = new GetSecurityGroupResult();
            o.arn = arn;
            o.description = description;
            o.filters = filters;
            o.id = id;
            o.name = name;
            o.tags = tags;
            o.vpcId = vpcId;
            return o;
        }
    }
}
