// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class CatalogTableStorageDescriptorColumn {
    /**
     * @return Free-form text comment.
     * 
     */
    private @Nullable String comment;
    /**
     * @return Name of the target table.
     * 
     */
    private String name;
    /**
     * @return Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    private @Nullable Map<String,String> parameters;
    /**
     * @return Datatype of data in the Column.
     * 
     */
    private @Nullable String type;

    private CatalogTableStorageDescriptorColumn() {}
    /**
     * @return Free-form text comment.
     * 
     */
    public Optional<String> comment() {
        return Optional.ofNullable(this.comment);
    }
    /**
     * @return Name of the target table.
     * 
     */
    public String name() {
        return this.name;
    }
    /**
     * @return Map of initialization parameters for the SerDe, in key-value form.
     * 
     */
    public Map<String,String> parameters() {
        return this.parameters == null ? Map.of() : this.parameters;
    }
    /**
     * @return Datatype of data in the Column.
     * 
     */
    public Optional<String> type() {
        return Optional.ofNullable(this.type);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(CatalogTableStorageDescriptorColumn defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String comment;
        private String name;
        private @Nullable Map<String,String> parameters;
        private @Nullable String type;
        public Builder() {}
        public Builder(CatalogTableStorageDescriptorColumn defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.comment = defaults.comment;
    	      this.name = defaults.name;
    	      this.parameters = defaults.parameters;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder comment(@Nullable String comment) {
            this.comment = comment;
            return this;
        }
        @CustomType.Setter
        public Builder name(String name) {
            this.name = Objects.requireNonNull(name);
            return this;
        }
        @CustomType.Setter
        public Builder parameters(@Nullable Map<String,String> parameters) {
            this.parameters = parameters;
            return this;
        }
        @CustomType.Setter
        public Builder type(@Nullable String type) {
            this.type = type;
            return this;
        }
        public CatalogTableStorageDescriptorColumn build() {
            final var o = new CatalogTableStorageDescriptorColumn();
            o.comment = comment;
            o.name = name;
            o.parameters = parameters;
            o.type = type;
            return o;
        }
    }
}
