// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import javax.annotation.Nullable;

@CustomType
public final class CatalogTableStorageDescriptorSkewedInfo {
    /**
     * @return List of names of columns that contain skewed values.
     * 
     */
    private @Nullable List<String> skewedColumnNames;
    /**
     * @return List of values that appear so frequently as to be considered skewed.
     * 
     */
    private @Nullable Map<String,String> skewedColumnValueLocationMaps;
    /**
     * @return Map of skewed values to the columns that contain them.
     * 
     */
    private @Nullable List<String> skewedColumnValues;

    private CatalogTableStorageDescriptorSkewedInfo() {}
    /**
     * @return List of names of columns that contain skewed values.
     * 
     */
    public List<String> skewedColumnNames() {
        return this.skewedColumnNames == null ? List.of() : this.skewedColumnNames;
    }
    /**
     * @return List of values that appear so frequently as to be considered skewed.
     * 
     */
    public Map<String,String> skewedColumnValueLocationMaps() {
        return this.skewedColumnValueLocationMaps == null ? Map.of() : this.skewedColumnValueLocationMaps;
    }
    /**
     * @return Map of skewed values to the columns that contain them.
     * 
     */
    public List<String> skewedColumnValues() {
        return this.skewedColumnValues == null ? List.of() : this.skewedColumnValues;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorSkewedInfo defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> skewedColumnNames;
        private @Nullable Map<String,String> skewedColumnValueLocationMaps;
        private @Nullable List<String> skewedColumnValues;
        public Builder() {}
        public Builder(CatalogTableStorageDescriptorSkewedInfo defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.skewedColumnNames = defaults.skewedColumnNames;
    	      this.skewedColumnValueLocationMaps = defaults.skewedColumnValueLocationMaps;
    	      this.skewedColumnValues = defaults.skewedColumnValues;
        }

        @CustomType.Setter
        public Builder skewedColumnNames(@Nullable List<String> skewedColumnNames) {
            this.skewedColumnNames = skewedColumnNames;
            return this;
        }
        public Builder skewedColumnNames(String... skewedColumnNames) {
            return skewedColumnNames(List.of(skewedColumnNames));
        }
        @CustomType.Setter
        public Builder skewedColumnValueLocationMaps(@Nullable Map<String,String> skewedColumnValueLocationMaps) {
            this.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
            return this;
        }
        @CustomType.Setter
        public Builder skewedColumnValues(@Nullable List<String> skewedColumnValues) {
            this.skewedColumnValues = skewedColumnValues;
            return this;
        }
        public Builder skewedColumnValues(String... skewedColumnValues) {
            return skewedColumnValues(List.of(skewedColumnValues));
        }
        public CatalogTableStorageDescriptorSkewedInfo build() {
            final var o = new CatalogTableStorageDescriptorSkewedInfo();
            o.skewedColumnNames = skewedColumnNames;
            o.skewedColumnValueLocationMaps = skewedColumnValueLocationMaps;
            o.skewedColumnValues = skewedColumnValues;
            return o;
        }
    }
}
