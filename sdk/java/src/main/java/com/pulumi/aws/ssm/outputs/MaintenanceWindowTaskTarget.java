// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ssm.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class MaintenanceWindowTaskTarget {
    private String key;
    /**
     * @return The array of strings.
     * 
     */
    private List<String> values;

    private MaintenanceWindowTaskTarget() {}
    public String key() {
        return this.key;
    }
    /**
     * @return The array of strings.
     * 
     */
    public List<String> values() {
        return this.values;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(MaintenanceWindowTaskTarget defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String key;
        private List<String> values;
        public Builder() {}
        public Builder(MaintenanceWindowTaskTarget defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.key = defaults.key;
    	      this.values = defaults.values;
        }

        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder values(List<String> values) {
            this.values = Objects.requireNonNull(values);
            return this;
        }
        public Builder values(String... values) {
            return values(List.of(values));
        }
        public MaintenanceWindowTaskTarget build() {
            final var o = new MaintenanceWindowTaskTarget();
            o.key = key;
            o.values = values;
            return o;
        }
    }
}
