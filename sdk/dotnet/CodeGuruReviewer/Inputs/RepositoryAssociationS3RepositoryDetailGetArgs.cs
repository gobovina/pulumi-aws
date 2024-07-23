// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CodeGuruReviewer.Inputs
{

    public sealed class RepositoryAssociationS3RepositoryDetailGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the S3 bucket used for associating a new S3 repository. Note: The name must begin with `codeguru-reviewer-`.
        /// </summary>
        [Input("bucketName")]
        public Input<string>? BucketName { get; set; }

        [Input("codeArtifacts")]
        private InputList<Inputs.RepositoryAssociationS3RepositoryDetailCodeArtifactGetArgs>? _codeArtifacts;
        public InputList<Inputs.RepositoryAssociationS3RepositoryDetailCodeArtifactGetArgs> CodeArtifacts
        {
            get => _codeArtifacts ?? (_codeArtifacts = new InputList<Inputs.RepositoryAssociationS3RepositoryDetailCodeArtifactGetArgs>());
            set => _codeArtifacts = value;
        }

        public RepositoryAssociationS3RepositoryDetailGetArgs()
        {
        }
        public static new RepositoryAssociationS3RepositoryDetailGetArgs Empty => new RepositoryAssociationS3RepositoryDetailGetArgs();
    }
}
