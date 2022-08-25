// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class LaunchTemplateIamInstanceProfile {
    /**
     * @return The Amazon Resource Name (ARN) of the instance profile.
     * 
     */
    private @Nullable String arn;
    /**
     * @return The name of the instance profile.
     * 
     */
    private @Nullable String name;

    private LaunchTemplateIamInstanceProfile() {}
    /**
     * @return The Amazon Resource Name (ARN) of the instance profile.
     * 
     */
    public Optional<String> arn() {
        return Optional.ofNullable(this.arn);
    }
    /**
     * @return The name of the instance profile.
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(LaunchTemplateIamInstanceProfile defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private @Nullable String arn;
        private @Nullable String name;
        public Builder() {}
        public Builder(LaunchTemplateIamInstanceProfile defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.arn = defaults.arn;
    	      this.name = defaults.name;
        }

        @CustomType.Setter
        public Builder arn(@Nullable String arn) {
            this.arn = arn;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        public LaunchTemplateIamInstanceProfile build() {
            final var o = new LaunchTemplateIamInstanceProfile();
            o.arn = arn;
            o.name = name;
            return o;
        }
    }
}
