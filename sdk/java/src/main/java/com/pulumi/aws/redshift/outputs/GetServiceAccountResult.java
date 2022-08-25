// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class GetServiceAccountResult {
    /**
     * @return The ARN of the AWS Redshift service account in the selected region.
     * 
     */
    private String arn;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private @Nullable String region;

    private GetServiceAccountResult() {}
    /**
     * @return The ARN of the AWS Redshift service account in the selected region.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public Optional<String> region() {
        return Optional.ofNullable(this.region);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetServiceAccountResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String id;
        private @Nullable String region;
        public Builder() {}
        public Builder(GetServiceAccountResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.id = defaults.id;
    	      this.region = defaults.region;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder region(@Nullable String region) {
            this.region = region;
            return this;
        }
        public GetServiceAccountResult build() {
            final var o = new GetServiceAccountResult();
            o.arn = arn;
            o.id = id;
            o.region = region;
            return o;
        }
    }
}
