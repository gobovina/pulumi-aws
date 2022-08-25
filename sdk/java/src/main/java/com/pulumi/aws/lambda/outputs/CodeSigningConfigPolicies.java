// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class CodeSigningConfigPolicies {
    /**
     * @return Code signing configuration policy for deployment validation failure. If you set the policy to Enforce, Lambda blocks the deployment request if code-signing validation checks fail. If you set the policy to Warn, Lambda allows the deployment and creates a CloudWatch log. Valid values: `Warn`, `Enforce`. Default value: `Warn`.
     * 
     */
    private String untrustedArtifactOnDeployment;

    private CodeSigningConfigPolicies() {}
    /**
     * @return Code signing configuration policy for deployment validation failure. If you set the policy to Enforce, Lambda blocks the deployment request if code-signing validation checks fail. If you set the policy to Warn, Lambda allows the deployment and creates a CloudWatch log. Valid values: `Warn`, `Enforce`. Default value: `Warn`.
     * 
     */
    public String untrustedArtifactOnDeployment() {
        return this.untrustedArtifactOnDeployment;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CodeSigningConfigPolicies defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String untrustedArtifactOnDeployment;
        public Builder() {}
        public Builder(CodeSigningConfigPolicies defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.untrustedArtifactOnDeployment = defaults.untrustedArtifactOnDeployment;
        }

        @CustomType.Setter
        public Builder untrustedArtifactOnDeployment(String untrustedArtifactOnDeployment) {
            this.untrustedArtifactOnDeployment = Objects.requireNonNull(untrustedArtifactOnDeployment);
            return this;
        }
        public CodeSigningConfigPolicies build() {
            final var o = new CodeSigningConfigPolicies();
            o.untrustedArtifactOnDeployment = untrustedArtifactOnDeployment;
            return o;
        }
    }
}
