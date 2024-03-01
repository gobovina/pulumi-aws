// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.LB
{
    /// <summary>
    /// Provides a ELBv2 Trust Store for use with Application Load Balancer Listener resources.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Target Groups using their ARN. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:lb/trustStore:TrustStore example arn:aws:elasticloadbalancing:us-west-2:187416307283:truststore/my-trust-store/20cfe21448b66314
    /// ```
    /// </summary>
    [AwsResourceType("aws:lb/trustStore:TrustStore")]
    public partial class TrustStore : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Trust Store (matches `id`).
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// ARN suffix for use with CloudWatch Metrics.
        /// </summary>
        [Output("arnSuffix")]
        public Output<string> ArnSuffix { get; private set; } = null!;

        /// <summary>
        /// S3 Bucket name holding the client certificate CA bundle.
        /// </summary>
        [Output("caCertificatesBundleS3Bucket")]
        public Output<string> CaCertificatesBundleS3Bucket { get; private set; } = null!;

        /// <summary>
        /// S3 object key holding the client certificate CA bundle.
        /// </summary>
        [Output("caCertificatesBundleS3Key")]
        public Output<string> CaCertificatesBundleS3Key { get; private set; } = null!;

        /// <summary>
        /// Version Id of CA bundle S3 bucket object, if versioned, defaults to latest if omitted.
        /// </summary>
        [Output("caCertificatesBundleS3ObjectVersion")]
        public Output<string?> CaCertificatesBundleS3ObjectVersion { get; private set; } = null!;

        /// <summary>
        /// Name of the Trust Store. If omitted, the provider will assign a random, unique name. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
        /// </summary>
        [Output("namePrefix")]
        public Output<string> NamePrefix { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a TrustStore resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TrustStore(string name, TrustStoreArgs args, CustomResourceOptions? options = null)
            : base("aws:lb/trustStore:TrustStore", name, args ?? new TrustStoreArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TrustStore(string name, Input<string> id, TrustStoreState? state = null, CustomResourceOptions? options = null)
            : base("aws:lb/trustStore:TrustStore", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing TrustStore resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TrustStore Get(string name, Input<string> id, TrustStoreState? state = null, CustomResourceOptions? options = null)
        {
            return new TrustStore(name, id, state, options);
        }
    }

    public sealed class TrustStoreArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// S3 Bucket name holding the client certificate CA bundle.
        /// </summary>
        [Input("caCertificatesBundleS3Bucket", required: true)]
        public Input<string> CaCertificatesBundleS3Bucket { get; set; } = null!;

        /// <summary>
        /// S3 object key holding the client certificate CA bundle.
        /// </summary>
        [Input("caCertificatesBundleS3Key", required: true)]
        public Input<string> CaCertificatesBundleS3Key { get; set; } = null!;

        /// <summary>
        /// Version Id of CA bundle S3 bucket object, if versioned, defaults to latest if omitted.
        /// </summary>
        [Input("caCertificatesBundleS3ObjectVersion")]
        public Input<string>? CaCertificatesBundleS3ObjectVersion { get; set; }

        /// <summary>
        /// Name of the Trust Store. If omitted, the provider will assign a random, unique name. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public TrustStoreArgs()
        {
        }
        public static new TrustStoreArgs Empty => new TrustStoreArgs();
    }

    public sealed class TrustStoreState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Trust Store (matches `id`).
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// ARN suffix for use with CloudWatch Metrics.
        /// </summary>
        [Input("arnSuffix")]
        public Input<string>? ArnSuffix { get; set; }

        /// <summary>
        /// S3 Bucket name holding the client certificate CA bundle.
        /// </summary>
        [Input("caCertificatesBundleS3Bucket")]
        public Input<string>? CaCertificatesBundleS3Bucket { get; set; }

        /// <summary>
        /// S3 object key holding the client certificate CA bundle.
        /// </summary>
        [Input("caCertificatesBundleS3Key")]
        public Input<string>? CaCertificatesBundleS3Key { get; set; }

        /// <summary>
        /// Version Id of CA bundle S3 bucket object, if versioned, defaults to latest if omitted.
        /// </summary>
        [Input("caCertificatesBundleS3ObjectVersion")]
        public Input<string>? CaCertificatesBundleS3ObjectVersion { get; set; }

        /// <summary>
        /// Name of the Trust Store. If omitted, the provider will assign a random, unique name. This name must be unique per region per account, can have a maximum of 32 characters, must contain only alphanumeric characters or hyphens, and must not begin or end with a hyphen.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Creates a unique name beginning with the specified prefix. Conflicts with `name`. Cannot be longer than 6 characters.
        /// </summary>
        [Input("namePrefix")]
        public Input<string>? NamePrefix { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public TrustStoreState()
        {
        }
        public static new TrustStoreState Empty => new TrustStoreState();
    }
}
