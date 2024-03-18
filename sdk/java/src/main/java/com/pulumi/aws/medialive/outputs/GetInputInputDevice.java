// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.medialive.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GetInputInputDevice {
    /**
     * @return The ID of the Input.
     * 
     */
    private String id;

    private GetInputInputDevice() {}
    /**
     * @return The ID of the Input.
     * 
     */
    public String id() {
        return this.id;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetInputInputDevice defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String id;
        public Builder() {}
        public Builder(GetInputInputDevice defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.id = defaults.id;
        }

        @CustomType.Setter
        public Builder id(String id) {
            if (id == null) {
              throw new MissingRequiredPropertyException("GetInputInputDevice", "id");
            }
            this.id = id;
            return this;
        }
        public GetInputInputDevice build() {
            final var _resultValue = new GetInputInputDevice();
            _resultValue.id = id;
            return _resultValue;
        }
    }
}
