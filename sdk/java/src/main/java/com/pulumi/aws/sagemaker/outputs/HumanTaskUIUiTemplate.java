// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class HumanTaskUIUiTemplate {
    /**
     * @return The content of the Liquid template for the worker user interface.
     * 
     */
    private @Nullable String content;
    /**
     * @return The SHA-256 digest of the contents of the template.
     * 
     */
    private @Nullable String contentSha256;
    /**
     * @return The URL for the user interface template.
     * 
     */
    private @Nullable String url;

    private HumanTaskUIUiTemplate() {}
    /**
     * @return The content of the Liquid template for the worker user interface.
     * 
     */
    public Optional<String> content() {
        return Optional.ofNullable(this.content);
    }
    /**
     * @return The SHA-256 digest of the contents of the template.
     * 
     */
    public Optional<String> contentSha256() {
        return Optional.ofNullable(this.contentSha256);
    }
    /**
     * @return The URL for the user interface template.
     * 
     */
    public Optional<String> url() {
        return Optional.ofNullable(this.url);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(HumanTaskUIUiTemplate defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String content;
        private @Nullable String contentSha256;
        private @Nullable String url;
        public Builder() {}
        public Builder(HumanTaskUIUiTemplate defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.content = defaults.content;
    	      this.contentSha256 = defaults.contentSha256;
    	      this.url = defaults.url;
        }

        @CustomType.Setter
        public Builder content(@Nullable String content) {
            this.content = content;
            return this;
        }
        @CustomType.Setter
        public Builder contentSha256(@Nullable String contentSha256) {
            this.contentSha256 = contentSha256;
            return this;
        }
        @CustomType.Setter
        public Builder url(@Nullable String url) {
            this.url = url;
            return this;
        }
        public HumanTaskUIUiTemplate build() {
            final var o = new HumanTaskUIUiTemplate();
            o.content = content;
            o.contentSha256 = contentSha256;
            o.url = url;
            return o;
        }
    }
}
