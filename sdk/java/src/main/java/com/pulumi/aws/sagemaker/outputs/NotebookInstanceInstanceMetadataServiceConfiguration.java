// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class NotebookInstanceInstanceMetadataServiceConfiguration {
    /**
     * @return Indicates the minimum IMDS version that the notebook instance supports. When passed &#34;1&#34; is passed. This means that both IMDSv1 and IMDSv2 are supported. Valid values are `1` and `2`.
     * 
     */
    private @Nullable String minimumInstanceMetadataServiceVersion;

    private NotebookInstanceInstanceMetadataServiceConfiguration() {}
    /**
     * @return Indicates the minimum IMDS version that the notebook instance supports. When passed &#34;1&#34; is passed. This means that both IMDSv1 and IMDSv2 are supported. Valid values are `1` and `2`.
     * 
     */
    public Optional<String> minimumInstanceMetadataServiceVersion() {
        return Optional.ofNullable(this.minimumInstanceMetadataServiceVersion);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(NotebookInstanceInstanceMetadataServiceConfiguration defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String minimumInstanceMetadataServiceVersion;
        public Builder() {}
        public Builder(NotebookInstanceInstanceMetadataServiceConfiguration defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.minimumInstanceMetadataServiceVersion = defaults.minimumInstanceMetadataServiceVersion;
        }

        @CustomType.Setter
        public Builder minimumInstanceMetadataServiceVersion(@Nullable String minimumInstanceMetadataServiceVersion) {
            this.minimumInstanceMetadataServiceVersion = minimumInstanceMetadataServiceVersion;
            return this;
        }
        public NotebookInstanceInstanceMetadataServiceConfiguration build() {
            final var o = new NotebookInstanceInstanceMetadataServiceConfiguration();
            o.minimumInstanceMetadataServiceVersion = minimumInstanceMetadataServiceVersion;
            return o;
        }
    }
}
