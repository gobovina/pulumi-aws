// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetEmailIdentityResult {
    /**
     * @return The ARN of the email identity.
     * 
     */
    private String arn;
    /**
     * @return The email identity.
     * 
     */
    private String email;
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;

    private GetEmailIdentityResult() {}
    /**
     * @return The ARN of the email identity.
     * 
     */
    public String arn() {
        return this.arn;
    }
    /**
     * @return The email identity.
     * 
     */
    public String email() {
        return this.email;
    }
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEmailIdentityResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String arn;
        private String email;
        private String id;
        public Builder() {}
        public Builder(GetEmailIdentityResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.email = defaults.email;
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder arn(String arn) {
            this.arn = Objects.requireNonNull(arn);
            return this;
        }
        @CustomType.Setter
        public Builder email(String email) {
            this.email = Objects.requireNonNull(email);
            return this;
        }
        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        public GetEmailIdentityResult build() {
            final var o = new GetEmailIdentityResult();
            o.arn = arn;
            o.email = email;
            o.id = id;
            return o;
        }
    }
}
