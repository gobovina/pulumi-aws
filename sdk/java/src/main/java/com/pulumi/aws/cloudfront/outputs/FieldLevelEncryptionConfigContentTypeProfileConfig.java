// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront.outputs;

import com.pulumi.aws.cloudfront.outputs.FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles;
import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.util.Objects;

@CustomType
public final class FieldLevelEncryptionConfigContentTypeProfileConfig {
    /**
     * @return Object that contains an attribute `items` that contains the list of configurations for a field-level encryption content type-profile. See Content Type Profile.
     * 
     */
    private FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles contentTypeProfiles;
    /**
     * @return specifies what to do when an unknown content type is provided for the profile. If true, content is forwarded without being encrypted when the content type is unknown. If false (the default), an error is returned when the content type is unknown.
     * 
     */
    private Boolean forwardWhenContentTypeIsUnknown;

    private FieldLevelEncryptionConfigContentTypeProfileConfig() {}
    /**
     * @return Object that contains an attribute `items` that contains the list of configurations for a field-level encryption content type-profile. See Content Type Profile.
     * 
     */
    public FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles contentTypeProfiles() {
        return this.contentTypeProfiles;
    }
    /**
     * @return specifies what to do when an unknown content type is provided for the profile. If true, content is forwarded without being encrypted when the content type is unknown. If false (the default), an error is returned when the content type is unknown.
     * 
     */
    public Boolean forwardWhenContentTypeIsUnknown() {
        return this.forwardWhenContentTypeIsUnknown;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(FieldLevelEncryptionConfigContentTypeProfileConfig defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles contentTypeProfiles;
        private Boolean forwardWhenContentTypeIsUnknown;
        public Builder() {}
        public Builder(FieldLevelEncryptionConfigContentTypeProfileConfig defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.contentTypeProfiles = defaults.contentTypeProfiles;
    	      this.forwardWhenContentTypeIsUnknown = defaults.forwardWhenContentTypeIsUnknown;
        }

        @CustomType.Setter
        public Builder contentTypeProfiles(FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfiles contentTypeProfiles) {
            this.contentTypeProfiles = Objects.requireNonNull(contentTypeProfiles);
            return this;
        }
        @CustomType.Setter
        public Builder forwardWhenContentTypeIsUnknown(Boolean forwardWhenContentTypeIsUnknown) {
            this.forwardWhenContentTypeIsUnknown = Objects.requireNonNull(forwardWhenContentTypeIsUnknown);
            return this;
        }
        public FieldLevelEncryptionConfigContentTypeProfileConfig build() {
            final var o = new FieldLevelEncryptionConfigContentTypeProfileConfig();
            o.contentTypeProfiles = contentTypeProfiles;
            o.forwardWhenContentTypeIsUnknown = forwardWhenContentTypeIsUnknown;
            return o;
        }
    }
}
