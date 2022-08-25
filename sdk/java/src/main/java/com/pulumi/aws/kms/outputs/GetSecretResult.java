// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms.outputs;

import com.pulumi.aws.kms.outputs.GetSecretSecret;
import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetSecretResult {
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    private String id;
    private List<GetSecretSecret> secrets;

    private GetSecretResult() {}
    /**
     * @return The provider-assigned unique ID for this managed resource.
     * 
     */
    public String id() {
        return this.id;
    }
    public List<GetSecretSecret> secrets() {
        return this.secrets;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetSecretResult defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        private List<GetSecretSecret> secrets;
        public Builder() {}
        public Builder(GetSecretResult defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
    	      this.secrets = defaults.secrets;
        }

        @CustomType.Setter
        public Builder id(String id) {
            this.id = Objects.requireNonNull(id);
            return this;
        }
        @CustomType.Setter
        public Builder secrets(List<GetSecretSecret> secrets) {
            this.secrets = Objects.requireNonNull(secrets);
            return this;
        }
        public Builder secrets(GetSecretSecret... secrets) {
            return secrets(List.of(secrets));
        }
        public GetSecretResult build() {
            final var o = new GetSecretResult();
            o.id = id;
            o.secrets = secrets;
            return o;
        }
    }
}
