// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3Control.Inputs
{

    public sealed class BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Number of days after which Amazon S3 aborts an incomplete multipart upload.
        /// </summary>
        [Input("daysAfterInitiation", required: true)]
        public Input<int> DaysAfterInitiation { get; set; } = null!;

        public BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs()
        {
        }
        public static new BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs Empty => new BucketLifecycleConfigurationRuleAbortIncompleteMultipartUploadGetArgs();
    }
}
