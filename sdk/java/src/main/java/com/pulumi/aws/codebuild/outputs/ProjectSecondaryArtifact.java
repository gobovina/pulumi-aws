// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codebuild.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Boolean;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;

@CustomType
public final class ProjectSecondaryArtifact {
    /**
     * @return Artifact identifier. Must be the same specified inside the AWS CodeBuild build specification.
     * 
     */
    private String artifactIdentifier;
    /**
     * @return Specifies the bucket owner&#39;s access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     * 
     */
    private @Nullable String bucketOwnerAccess;
    /**
     * @return Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     * 
     */
    private @Nullable Boolean encryptionDisabled;
    /**
     * @return Location of the source code from git or s3.
     * 
     */
    private @Nullable String location;
    /**
     * @return Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    private @Nullable String name;
    /**
     * @return Namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values are `BUILD_ID` or `NONE`.
     * 
     */
    private @Nullable String namespaceType;
    /**
     * @return Whether a name specified in the build specification overrides the artifact name.
     * 
     */
    private @Nullable Boolean overrideArtifactName;
    /**
     * @return Type of build output artifact to create. If `type` is set to `S3`, valid values are `NONE`, `ZIP`
     * 
     */
    private @Nullable String packaging;
    /**
     * @return If `type` is set to `S3`, this is the path to the output artifact.
     * 
     */
    private @Nullable String path;
    /**
     * @return Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    private String type;

    private ProjectSecondaryArtifact() {}
    /**
     * @return Artifact identifier. Must be the same specified inside the AWS CodeBuild build specification.
     * 
     */
    public String artifactIdentifier() {
        return this.artifactIdentifier;
    }
    /**
     * @return Specifies the bucket owner&#39;s access for objects that another account uploads to their Amazon S3 bucket. By default, only the account that uploads the objects to the bucket has access to these objects. This property allows you to give the bucket owner access to these objects. Valid values are `NONE`, `READ_ONLY`, and `FULL`. your CodeBuild service role must have the `s3:PutBucketAcl` permission. This permission allows CodeBuild to modify the access control list for the bucket.
     * 
     */
    public Optional<String> bucketOwnerAccess() {
        return Optional.ofNullable(this.bucketOwnerAccess);
    }
    /**
     * @return Whether to disable encrypting output artifacts. If `type` is set to `NO_ARTIFACTS`, this value is ignored. Defaults to `false`.
     * 
     */
    public Optional<Boolean> encryptionDisabled() {
        return Optional.ofNullable(this.encryptionDisabled);
    }
    /**
     * @return Location of the source code from git or s3.
     * 
     */
    public Optional<String> location() {
        return Optional.ofNullable(this.location);
    }
    /**
     * @return Name of the project. If `type` is set to `S3`, this is the name of the output artifact object
     * 
     */
    public Optional<String> name() {
        return Optional.ofNullable(this.name);
    }
    /**
     * @return Namespace to use in storing build artifacts. If `type` is set to `S3`, then valid values are `BUILD_ID` or `NONE`.
     * 
     */
    public Optional<String> namespaceType() {
        return Optional.ofNullable(this.namespaceType);
    }
    /**
     * @return Whether a name specified in the build specification overrides the artifact name.
     * 
     */
    public Optional<Boolean> overrideArtifactName() {
        return Optional.ofNullable(this.overrideArtifactName);
    }
    /**
     * @return Type of build output artifact to create. If `type` is set to `S3`, valid values are `NONE`, `ZIP`
     * 
     */
    public Optional<String> packaging() {
        return Optional.ofNullable(this.packaging);
    }
    /**
     * @return If `type` is set to `S3`, this is the path to the output artifact.
     * 
     */
    public Optional<String> path() {
        return Optional.ofNullable(this.path);
    }
    /**
     * @return Type of repository that contains the source code to be built. Valid values: `CODECOMMIT`, `CODEPIPELINE`, `GITHUB`, `GITHUB_ENTERPRISE`, `BITBUCKET`, `S3`, `NO_SOURCE`.
     * 
     */
    public String type() {
        return this.type;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(ProjectSecondaryArtifact defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String artifactIdentifier;
        private @Nullable String bucketOwnerAccess;
        private @Nullable Boolean encryptionDisabled;
        private @Nullable String location;
        private @Nullable String name;
        private @Nullable String namespaceType;
        private @Nullable Boolean overrideArtifactName;
        private @Nullable String packaging;
        private @Nullable String path;
        private String type;
        public Builder() {}
        public Builder(ProjectSecondaryArtifact defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.artifactIdentifier = defaults.artifactIdentifier;
    	      this.bucketOwnerAccess = defaults.bucketOwnerAccess;
    	      this.encryptionDisabled = defaults.encryptionDisabled;
    	      this.location = defaults.location;
    	      this.name = defaults.name;
    	      this.namespaceType = defaults.namespaceType;
    	      this.overrideArtifactName = defaults.overrideArtifactName;
    	      this.packaging = defaults.packaging;
    	      this.path = defaults.path;
    	      this.type = defaults.type;
        }

        @CustomType.Setter
        public Builder artifactIdentifier(String artifactIdentifier) {
            this.artifactIdentifier = Objects.requireNonNull(artifactIdentifier);
            return this;
        }
        @CustomType.Setter
        public Builder bucketOwnerAccess(@Nullable String bucketOwnerAccess) {
            this.bucketOwnerAccess = bucketOwnerAccess;
            return this;
        }
        @CustomType.Setter
        public Builder encryptionDisabled(@Nullable Boolean encryptionDisabled) {
            this.encryptionDisabled = encryptionDisabled;
            return this;
        }
        @CustomType.Setter
        public Builder location(@Nullable String location) {
            this.location = location;
            return this;
        }
        @CustomType.Setter
        public Builder name(@Nullable String name) {
            this.name = name;
            return this;
        }
        @CustomType.Setter
        public Builder namespaceType(@Nullable String namespaceType) {
            this.namespaceType = namespaceType;
            return this;
        }
        @CustomType.Setter
        public Builder overrideArtifactName(@Nullable Boolean overrideArtifactName) {
            this.overrideArtifactName = overrideArtifactName;
            return this;
        }
        @CustomType.Setter
        public Builder packaging(@Nullable String packaging) {
            this.packaging = packaging;
            return this;
        }
        @CustomType.Setter
        public Builder path(@Nullable String path) {
            this.path = path;
            return this;
        }
        @CustomType.Setter
        public Builder type(String type) {
            this.type = Objects.requireNonNull(type);
            return this;
        }
        public ProjectSecondaryArtifact build() {
            final var o = new ProjectSecondaryArtifact();
            o.artifactIdentifier = artifactIdentifier;
            o.bucketOwnerAccess = bucketOwnerAccess;
            o.encryptionDisabled = encryptionDisabled;
            o.location = location;
            o.name = name;
            o.namespaceType = namespaceType;
            o.overrideArtifactName = overrideArtifactName;
            o.packaging = packaging;
            o.path = path;
            o.type = type;
            return o;
        }
    }
}
