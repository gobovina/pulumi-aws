// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class GetInstanceEnclaveOption {
    /**
     * @return Whether Nitro Enclaves are enabled.
     * 
     */
    private Boolean enabled;

    private GetInstanceEnclaveOption() {}
    /**
     * @return Whether Nitro Enclaves are enabled.
     * 
     */
    public Boolean enabled() {
        return this.enabled;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInstanceEnclaveOption defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private Boolean enabled;
        public Builder() {}
        public Builder(GetInstanceEnclaveOption defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(Boolean enabled) {
            this.enabled = Objects.requireNonNull(enabled);
            return this;
        }
        public GetInstanceEnclaveOption build() {
            final var o = new GetInstanceEnclaveOption();
            o.enabled = enabled;
            return o;
        }
    }
}
