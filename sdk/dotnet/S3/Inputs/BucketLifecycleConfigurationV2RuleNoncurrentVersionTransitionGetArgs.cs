// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Inputs
{

    public sealed class BucketLifecycleConfigurationV2RuleNoncurrentVersionTransitionGetArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of noncurrent versions Amazon S3 will retain. Must be a non-zero positive integer.
        /// </summary>
        [Input("newerNoncurrentVersions")]
        public Input<string>? NewerNoncurrentVersions { get; set; }

        /// <summary>
        /// The number of days an object is noncurrent before Amazon S3 can perform the associated action.
        /// </summary>
        [Input("noncurrentDays")]
        public Input<int>? NoncurrentDays { get; set; }

        /// <summary>
        /// The class of storage used to store the object. Valid Values: `GLACIER`, `STANDARD_IA`, `ONEZONE_IA`, `INTELLIGENT_TIERING`, `DEEP_ARCHIVE`, `GLACIER_IR`.
        /// </summary>
        [Input("storageClass", required: true)]
        public Input<string> StorageClass { get; set; } = null!;

        public BucketLifecycleConfigurationV2RuleNoncurrentVersionTransitionGetArgs()
        {
        }
    }
}
