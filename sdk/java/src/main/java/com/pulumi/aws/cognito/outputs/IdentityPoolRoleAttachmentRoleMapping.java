// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cognito.outputs;

import com.pulumi.aws.cognito.outputs.IdentityPoolRoleAttachmentRoleMappingMappingRule;
import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class IdentityPoolRoleAttachmentRoleMapping {
    /**
     * @return Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
     * 
     */
    private @Nullable String ambiguousRoleResolution;
    /**
     * @return A string identifying the identity provider, for example, &#34;graph.facebook.com&#34; or &#34;cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id&#34;. Depends on `cognito_identity_providers` set on `aws.cognito.IdentityPool` resource or a `aws.cognito.IdentityProvider` resource.
     * 
     */
    private String identityProvider;
    /**
     * @return The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
     * 
     */
    private @Nullable List<IdentityPoolRoleAttachmentRoleMappingMappingRule> mappingRules;
    /**
     * @return The role mapping type.
     * 
     */
    private String type;

    private IdentityPoolRoleAttachmentRoleMapping() {}
    /**
     * @return Specifies the action to be taken if either no rules match the claim value for the Rules type, or there is no cognito:preferred_role claim and there are multiple cognito:roles matches for the Token type. `Required` if you specify Token or Rules as the Type.
     * 
     */
    public Optional<String> ambiguousRoleResolution() {
        return Optional.ofNullable(this.ambiguousRoleResolution);
    }
    /**
     * @return A string identifying the identity provider, for example, &#34;graph.facebook.com&#34; or &#34;cognito-idp.us-east-1.amazonaws.com/us-east-1_abcdefghi:app_client_id&#34;. Depends on `cognito_identity_providers` set on `aws.cognito.IdentityPool` resource or a `aws.cognito.IdentityProvider` resource.
     * 
     */
    public String identityProvider() {
        return this.identityProvider;
    }
    /**
     * @return The Rules Configuration to be used for mapping users to roles. You can specify up to 25 rules per identity provider. Rules are evaluated in order. The first one to match specifies the role.
     * 
     */
    public List<IdentityPoolRoleAttachmentRoleMappingMappingRule> mappingRules() {
        return this.mappingRules == null ? List.of() : this.mappingRules;
    }
    /**
     * @return The role mapping type.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(IdentityPoolRoleAttachmentRoleMapping defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String ambiguousRoleResolution;
        private String identityProvider;
        private @Nullable List<IdentityPoolRoleAttachmentRoleMappingMappingRule> mappingRules;
        private String type;
        public Builder() {}
        public Builder(IdentityPoolRoleAttachmentRoleMapping defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.ambiguousRoleResolution = defaults.ambiguousRoleResolution;
    	      this.identityProvider = defaults.identityProvider;
    	      this.mappingRules = defaults.mappingRules;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder ambiguousRoleResolution(@Nullable String ambiguousRoleResolution) {

            this.ambiguousRoleResolution = ambiguousRoleResolution;
            return this;
        }
        @CustomType.Setter
        public Builder identityProvider(String identityProvider) {
            if (identityProvider == null) {
              throw new MissingRequiredPropertyException("IdentityPoolRoleAttachmentRoleMapping", "identityProvider");
            }
            this.identityProvider = identityProvider;
            return this;
        }
        @CustomType.Setter
        public Builder mappingRules(@Nullable List<IdentityPoolRoleAttachmentRoleMappingMappingRule> mappingRules) {

            this.mappingRules = mappingRules;
            return this;
        }
        public Builder mappingRules(IdentityPoolRoleAttachmentRoleMappingMappingRule... mappingRules) {
            return mappingRules(List.of(mappingRules));
        }
        @CustomType.Setter
        public Builder type(String type) {
            if (type == null) {
              throw new MissingRequiredPropertyException("IdentityPoolRoleAttachmentRoleMapping", "type");
            }
            this.type = type;
            return this;
        }
        public IdentityPoolRoleAttachmentRoleMapping build() {
            final var _resultValue = new IdentityPoolRoleAttachmentRoleMapping();
            _resultValue.ambiguousRoleResolution = ambiguousRoleResolution;
            _resultValue.identityProvider = identityProvider;
            _resultValue.mappingRules = mappingRules;
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
