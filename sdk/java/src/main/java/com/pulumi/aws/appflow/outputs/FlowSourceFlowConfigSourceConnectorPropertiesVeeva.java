// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.appflow.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class FlowSourceFlowConfigSourceConnectorPropertiesVeeva {
    /**
     * @return The document type specified in the Veeva document extract flow.
     * 
     */
    private @Nullable String documentType;
    /**
     * @return Boolean value to include All Versions of files in Veeva document extract flow.
     * 
     */
    private @Nullable Boolean includeAllVersions;
    /**
     * @return Boolean value to include file renditions in Veeva document extract flow.
     * 
     */
    private @Nullable Boolean includeRenditions;
    /**
     * @return Boolean value to include source files in Veeva document extract flow.
     * 
     */
    private @Nullable Boolean includeSourceFiles;
    /**
     * @return The object specified in the Veeva flow source.
     * 
     */
    private String object;

    private FlowSourceFlowConfigSourceConnectorPropertiesVeeva() {}
    /**
     * @return The document type specified in the Veeva document extract flow.
     * 
     */
    public Optional<String> documentType() {
        return Optional.ofNullable(this.documentType);
    }
    /**
     * @return Boolean value to include All Versions of files in Veeva document extract flow.
     * 
     */
    public Optional<Boolean> includeAllVersions() {
        return Optional.ofNullable(this.includeAllVersions);
    }
    /**
     * @return Boolean value to include file renditions in Veeva document extract flow.
     * 
     */
    public Optional<Boolean> includeRenditions() {
        return Optional.ofNullable(this.includeRenditions);
    }
    /**
     * @return Boolean value to include source files in Veeva document extract flow.
     * 
     */
    public Optional<Boolean> includeSourceFiles() {
        return Optional.ofNullable(this.includeSourceFiles);
    }
    /**
     * @return The object specified in the Veeva flow source.
     * 
     */
    public String object() {
        return this.object;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FlowSourceFlowConfigSourceConnectorPropertiesVeeva defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String documentType;
        private @Nullable Boolean includeAllVersions;
        private @Nullable Boolean includeRenditions;
        private @Nullable Boolean includeSourceFiles;
        private String object;
        public Builder() {}
        public Builder(FlowSourceFlowConfigSourceConnectorPropertiesVeeva defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.documentType = defaults.documentType;
    	      this.includeAllVersions = defaults.includeAllVersions;
    	      this.includeRenditions = defaults.includeRenditions;
    	      this.includeSourceFiles = defaults.includeSourceFiles;
    	      this.object = defaults.object;
        }

        @CustomType.Setter
        public Builder documentType(@Nullable String documentType) {
            this.documentType = documentType;
            return this;
        }
        @CustomType.Setter
        public Builder includeAllVersions(@Nullable Boolean includeAllVersions) {
            this.includeAllVersions = includeAllVersions;
            return this;
        }
        @CustomType.Setter
        public Builder includeRenditions(@Nullable Boolean includeRenditions) {
            this.includeRenditions = includeRenditions;
            return this;
        }
        @CustomType.Setter
        public Builder includeSourceFiles(@Nullable Boolean includeSourceFiles) {
            this.includeSourceFiles = includeSourceFiles;
            return this;
        }
        @CustomType.Setter
        public Builder object(String object) {
            this.object = Objects.requireNonNull(object);
            return this;
        }
        public FlowSourceFlowConfigSourceConnectorPropertiesVeeva build() {
            final var o = new FlowSourceFlowConfigSourceConnectorPropertiesVeeva();
            o.documentType = documentType;
            o.includeAllVersions = includeAllVersions;
            o.includeRenditions = includeRenditions;
            o.includeSourceFiles = includeSourceFiles;
            o.object = object;
            return o;
        }
    }
}
