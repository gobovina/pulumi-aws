// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class InstanceEnclaveOptions {
    /**
     * @return Whether Nitro Enclaves will be enabled on the instance. Defaults to `false`.
     * 
     */
    private @Nullable Boolean enabled;

    private InstanceEnclaveOptions() {}
    /**
     * @return Whether Nitro Enclaves will be enabled on the instance. Defaults to `false`.
     * 
     */
    public Optional<Boolean> enabled() {
        return Optional.ofNullable(this.enabled);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(InstanceEnclaveOptions defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable Boolean enabled;
        public Builder() {}
        public Builder(InstanceEnclaveOptions defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.enabled = defaults.enabled;
        }

        @CustomType.Setter
        public Builder enabled(@Nullable Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public InstanceEnclaveOptions build() {
            final var o = new InstanceEnclaveOptions();
            o.enabled = enabled;
            return o;
        }
    }
}
