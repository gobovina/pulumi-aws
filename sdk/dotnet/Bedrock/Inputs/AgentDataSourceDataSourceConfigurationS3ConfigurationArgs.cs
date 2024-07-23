// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Bedrock.Inputs
{

    public sealed class AgentDataSourceDataSourceConfigurationS3ConfigurationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the bucket that contains the data source.
        /// </summary>
        [Input("bucketArn", required: true)]
        public Input<string> BucketArn { get; set; } = null!;

        /// <summary>
        /// Bucket account owner ID for the S3 bucket.
        /// </summary>
        [Input("bucketOwnerAccountId")]
        public Input<string>? BucketOwnerAccountId { get; set; }

        [Input("inclusionPrefixes")]
        private InputList<string>? _inclusionPrefixes;

        /// <summary>
        /// List of S3 prefixes that define the object containing the data sources. For more information, see [Organizing objects using prefixes](https://docs.aws.amazon.com/AmazonS3/latest/userguide/using-prefixes.html).
        /// </summary>
        public InputList<string> InclusionPrefixes
        {
            get => _inclusionPrefixes ?? (_inclusionPrefixes = new InputList<string>());
            set => _inclusionPrefixes = value;
        }

        public AgentDataSourceDataSourceConfigurationS3ConfigurationArgs()
        {
        }
        public static new AgentDataSourceDataSourceConfigurationS3ConfigurationArgs Empty => new AgentDataSourceDataSourceConfigurationS3ConfigurationArgs();
    }
}
