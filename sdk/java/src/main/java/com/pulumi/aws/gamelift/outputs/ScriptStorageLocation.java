// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.gamelift.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ScriptStorageLocation {
    /**
     * @return Name of your S3 bucket.
     * 
     */
    private String bucket;
    /**
     * @return Name of the zip file containing your script files.
     * 
     */
    private String key;
    /**
     * @return A specific version of the file. If not set, the latest version of the file is retrieved.
     * 
     */
    private @Nullable String objectVersion;
    /**
     * @return ARN of the access role that allows Amazon GameLift to access your S3 bucket.
     * 
     */
    private String roleArn;

    private ScriptStorageLocation() {}
    /**
     * @return Name of your S3 bucket.
     * 
     */
    public String bucket() {
        return this.bucket;
    }
    /**
     * @return Name of the zip file containing your script files.
     * 
     */
    public String key() {
        return this.key;
    }
    /**
     * @return A specific version of the file. If not set, the latest version of the file is retrieved.
     * 
     */
    public Optional<String> objectVersion() {
        return Optional.ofNullable(this.objectVersion);
    }
    /**
     * @return ARN of the access role that allows Amazon GameLift to access your S3 bucket.
     * 
     */
    public String roleArn() {
        return this.roleArn;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ScriptStorageLocation defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String bucket;
        private String key;
        private @Nullable String objectVersion;
        private String roleArn;
        public Builder() {}
        public Builder(ScriptStorageLocation defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.bucket = defaults.bucket;
    	      this.key = defaults.key;
    	      this.objectVersion = defaults.objectVersion;
    	      this.roleArn = defaults.roleArn;
        }

        @CustomType.Setter
        public Builder bucket(String bucket) {
            this.bucket = Objects.requireNonNull(bucket);
            return this;
        }
        @CustomType.Setter
        public Builder key(String key) {
            this.key = Objects.requireNonNull(key);
            return this;
        }
        @CustomType.Setter
        public Builder objectVersion(@Nullable String objectVersion) {
            this.objectVersion = objectVersion;
            return this;
        }
        @CustomType.Setter
        public Builder roleArn(String roleArn) {
            this.roleArn = Objects.requireNonNull(roleArn);
            return this;
        }
        public ScriptStorageLocation build() {
            final var o = new ScriptStorageLocation();
            o.bucket = bucket;
            o.key = key;
            o.objectVersion = objectVersion;
            o.roleArn = roleArn;
            return o;
        }
    }
}
