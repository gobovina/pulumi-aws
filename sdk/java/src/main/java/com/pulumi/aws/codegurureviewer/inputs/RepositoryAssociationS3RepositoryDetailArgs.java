// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.codegurureviewer.inputs;

import com.pulumi.aws.codegurureviewer.inputs.RepositoryAssociationS3RepositoryDetailCodeArtifactArgs;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class RepositoryAssociationS3RepositoryDetailArgs extends com.pulumi.resources.ResourceArgs {

    public static final RepositoryAssociationS3RepositoryDetailArgs Empty = new RepositoryAssociationS3RepositoryDetailArgs();

    /**
     * The name of the S3 bucket used for associating a new S3 repository. Note: The name must begin with `codeguru-reviewer-`.
     * 
     */
    @Import(name="bucketName")
    private @Nullable Output<String> bucketName;

    /**
     * @return The name of the S3 bucket used for associating a new S3 repository. Note: The name must begin with `codeguru-reviewer-`.
     * 
     */
    public Optional<Output<String>> bucketName() {
        return Optional.ofNullable(this.bucketName);
    }

    @Import(name="codeArtifacts")
    private @Nullable Output<List<RepositoryAssociationS3RepositoryDetailCodeArtifactArgs>> codeArtifacts;

    public Optional<Output<List<RepositoryAssociationS3RepositoryDetailCodeArtifactArgs>>> codeArtifacts() {
        return Optional.ofNullable(this.codeArtifacts);
    }

    private RepositoryAssociationS3RepositoryDetailArgs() {}

    private RepositoryAssociationS3RepositoryDetailArgs(RepositoryAssociationS3RepositoryDetailArgs $) {
        this.bucketName = $.bucketName;
        this.codeArtifacts = $.codeArtifacts;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(RepositoryAssociationS3RepositoryDetailArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private RepositoryAssociationS3RepositoryDetailArgs $;

        public Builder() {
            $ = new RepositoryAssociationS3RepositoryDetailArgs();
        }

        public Builder(RepositoryAssociationS3RepositoryDetailArgs defaults) {
            $ = new RepositoryAssociationS3RepositoryDetailArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param bucketName The name of the S3 bucket used for associating a new S3 repository. Note: The name must begin with `codeguru-reviewer-`.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(@Nullable Output<String> bucketName) {
            $.bucketName = bucketName;
            return this;
        }

        /**
         * @param bucketName The name of the S3 bucket used for associating a new S3 repository. Note: The name must begin with `codeguru-reviewer-`.
         * 
         * @return builder
         * 
         */
        public Builder bucketName(String bucketName) {
            return bucketName(Output.of(bucketName));
        }

        public Builder codeArtifacts(@Nullable Output<List<RepositoryAssociationS3RepositoryDetailCodeArtifactArgs>> codeArtifacts) {
            $.codeArtifacts = codeArtifacts;
            return this;
        }

        public Builder codeArtifacts(List<RepositoryAssociationS3RepositoryDetailCodeArtifactArgs> codeArtifacts) {
            return codeArtifacts(Output.of(codeArtifacts));
        }

        public Builder codeArtifacts(RepositoryAssociationS3RepositoryDetailCodeArtifactArgs... codeArtifacts) {
            return codeArtifacts(List.of(codeArtifacts));
        }

        public RepositoryAssociationS3RepositoryDetailArgs build() {
            return $;
        }
    }

}
