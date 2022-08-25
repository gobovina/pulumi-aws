// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.elastictranscoder.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class PipelineContentConfigPermission {
    /**
     * @return The permission that you want to give to the AWS user that you specified in `content_config_permissions.grantee`. Valid values are `Read`, `ReadAcp`, `WriteAcp` or `FullControl`.
     * 
     */
    private @Nullable List<String> accesses;
    /**
     * @return The AWS user or group that you want to have access to transcoded files and playlists.
     * 
     */
    private @Nullable String grantee;
    /**
     * @return Specify the type of value that appears in the `content_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
     * 
     */
    private @Nullable String granteeType;

    private PipelineContentConfigPermission() {}
    /**
     * @return The permission that you want to give to the AWS user that you specified in `content_config_permissions.grantee`. Valid values are `Read`, `ReadAcp`, `WriteAcp` or `FullControl`.
     * 
     */
    public List<String> accesses() {
        return this.accesses == null ? List.of() : this.accesses;
    }
    /**
     * @return The AWS user or group that you want to have access to transcoded files and playlists.
     * 
     */
    public Optional<String> grantee() {
        return Optional.ofNullable(this.grantee);
    }
    /**
     * @return Specify the type of value that appears in the `content_config_permissions.grantee` object. Valid values are `Canonical`, `Email` or `Group`.
     * 
     */
    public Optional<String> granteeType() {
        return Optional.ofNullable(this.granteeType);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(PipelineContentConfigPermission defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable List<String> accesses;
        private @Nullable String grantee;
        private @Nullable String granteeType;
        public Builder() {}
        public Builder(PipelineContentConfigPermission defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.accesses = defaults.accesses;
    	      this.grantee = defaults.grantee;
    	      this.granteeType = defaults.granteeType;
        }

        @CustomType.Setter
        public Builder accesses(@Nullable List<String> accesses) {
            this.accesses = accesses;
            return this;
        }
        public Builder accesses(String... accesses) {
            return accesses(List.of(accesses));
        }
        @CustomType.Setter
        public Builder grantee(@Nullable String grantee) {
            this.grantee = grantee;
            return this;
        }
        @CustomType.Setter
        public Builder granteeType(@Nullable String granteeType) {
            this.granteeType = granteeType;
            return this;
        }
        public PipelineContentConfigPermission build() {
            final var o = new PipelineContentConfigPermission();
            o.accesses = accesses;
            o.grantee = grantee;
            o.granteeType = granteeType;
            return o;
        }
    }
}
