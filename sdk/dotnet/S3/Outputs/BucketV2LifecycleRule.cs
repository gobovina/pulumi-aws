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
    public sealed class BucketV2LifecycleRule
    {
        /// <summary>
        /// Number of days after initiating a multipart upload when the multipart upload must be completed.
        /// </summary>
        public readonly int? AbortIncompleteMultipartUploadDays;
        /// <summary>
        /// Whether versioning is enabled.
        /// </summary>
        public readonly bool? Enabled;
        /// <summary>
        /// The expiration for the lifecycle of the object in the form of date, days and, whether the object has a delete marker.
        /// </summary>
        public readonly ImmutableArray<Outputs.BucketV2LifecycleRuleExpiration> Expirations;
        /// <summary>
        /// Unique identifier for the rule.
        /// </summary>
        public readonly string? Id;
        /// <summary>
        /// When noncurrent object versions expire.
        /// </summary>
        public readonly ImmutableArray<Outputs.BucketV2LifecycleRuleNoncurrentVersionExpiration> NoncurrentVersionExpirations;
        /// <summary>
        /// When noncurrent object versions transition.
        /// </summary>
        public readonly ImmutableArray<Outputs.BucketV2LifecycleRuleNoncurrentVersionTransition> NoncurrentVersionTransitions;
        /// <summary>
        /// Object keyname prefix identifying one or more objects to which the rule applies
        /// </summary>
        public readonly string? Prefix;
        /// <summary>
        /// A map of tags to assign to the bucket. If configured with a provider [`default_tags` configuration blockpresent, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public readonly ImmutableDictionary<string, string>? Tags;
        /// <summary>
        /// Specifies when an Amazon S3 object transitions to a specified storage class.
        /// </summary>
        public readonly ImmutableArray<Outputs.BucketV2LifecycleRuleTransition> Transitions;

        [OutputConstructor]
        private BucketV2LifecycleRule(
            int? abortIncompleteMultipartUploadDays,

            bool? enabled,

            ImmutableArray<Outputs.BucketV2LifecycleRuleExpiration> expirations,

            string? id,

            ImmutableArray<Outputs.BucketV2LifecycleRuleNoncurrentVersionExpiration> noncurrentVersionExpirations,

            ImmutableArray<Outputs.BucketV2LifecycleRuleNoncurrentVersionTransition> noncurrentVersionTransitions,

            string? prefix,

            ImmutableDictionary<string, string>? tags,

            ImmutableArray<Outputs.BucketV2LifecycleRuleTransition> transitions)
        {
            AbortIncompleteMultipartUploadDays = abortIncompleteMultipartUploadDays;
            Enabled = enabled;
            Expirations = expirations;
            Id = id;
            NoncurrentVersionExpirations = noncurrentVersionExpirations;
            NoncurrentVersionTransitions = noncurrentVersionTransitions;
            Prefix = prefix;
            Tags = tags;
            Transitions = transitions;
        }
    }
}
