// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appmesh.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class MeshSpecEgressFilter {
    /**
     * @return Egress filter type. By default, the type is `DROP_ALL`. Valid values are `ALLOW_ALL` and `DROP_ALL`.
     * 
     */
    private @Nullable String type;

    private MeshSpecEgressFilter() {}
    /**
     * @return Egress filter type. By default, the type is `DROP_ALL`. Valid values are `ALLOW_ALL` and `DROP_ALL`.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MeshSpecEgressFilter defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String type;
        public Builder() {}
        public Builder(MeshSpecEgressFilter defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder type(@Nullable String type) {

            this.type = type;
            return this;
        }
        public MeshSpecEgressFilter build() {
            final var _resultValue = new MeshSpecEgressFilter();
            _resultValue.type = type;
            return _resultValue;
        }
    }
}
