// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Outputs
{

    [OutputType]
    public sealed class BucketLifecycleConfigurationV2RuleExpiration
    {
        /// <summary>
        /// The date the object is to be moved or deleted. Should be in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8).
        /// </summary>
        public readonly string? Date;
        /// <summary>
        /// The lifetime, in days, of the objects that are subject to the rule. The value must be a non-zero positive integer.
        /// </summary>
        public readonly int? Days;
        /// <summary>
        /// Indicates whether Amazon S3 will remove a delete marker with no noncurrent versions. If set to `true`, the delete marker will be expired; if set to `false` the policy takes no action.
        /// </summary>
        public readonly bool? ExpiredObjectDeleteMarker;

        [OutputConstructor]
        private BucketLifecycleConfigurationV2RuleExpiration(
            string? date,

            int? days,

            bool? expiredObjectDeleteMarker)
        {
            Date = date;
            Days = days;
            ExpiredObjectDeleteMarker = expiredObjectDeleteMarker;
        }
    }
}
