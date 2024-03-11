// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.RedShift
{
    /// <summary>
    /// Creates a new Amazon Redshift Usage Limit.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.RedShift.UsageLimit("example", new()
    ///     {
    ///         ClusterIdentifier = exampleAwsRedshiftCluster.Id,
    ///         FeatureType = "concurrency-scaling",
    ///         LimitType = "time",
    ///         Amount = 60,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Redshift usage limits using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:redshift/usageLimit:UsageLimit example example-id
    /// ```
    /// </summary>
    [AwsResourceType("aws:redshift/usageLimit:UsageLimit")]
    public partial class UsageLimit : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The value must be a positive number.
        /// </summary>
        [Output("amount")]
        public Output<int> Amount { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name (ARN) of the Redshift Usage Limit.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The action that Amazon Redshift takes when the limit is reached. The default is `log`. Valid values are `log`, `emit-metric`, and `disable`.
        /// </summary>
        [Output("breachAction")]
        public Output<string?> BreachAction { get; private set; } = null!;

        /// <summary>
        /// The identifier of the cluster that you want to limit usage.
        /// </summary>
        [Output("clusterIdentifier")]
        public Output<string> ClusterIdentifier { get; private set; } = null!;

        /// <summary>
        /// The Amazon Redshift feature that you want to limit. Valid values are `spectrum`, `concurrency-scaling`, and `cross-region-datasharing`.
        /// </summary>
        [Output("featureType")]
        public Output<string> FeatureType { get; private set; } = null!;

        /// <summary>
        /// The type of limit. Depending on the feature type, this can be based on a time duration or data size. If FeatureType is `spectrum`, then LimitType must be `data-scanned`. If FeatureType is `concurrency-scaling`, then LimitType must be `time`. If FeatureType is `cross-region-datasharing`, then LimitType must be `data-scanned`. Valid values are `data-scanned`, and `time`.
        /// </summary>
        [Output("limitType")]
        public Output<string> LimitType { get; private set; } = null!;

        /// <summary>
        /// The time period that the amount applies to. A weekly period begins on Sunday. The default is `monthly`. Valid values are `daily`, `weekly`, and `monthly`.
        /// </summary>
        [Output("period")]
        public Output<string?> Period { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a UsageLimit resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UsageLimit(string name, UsageLimitArgs args, CustomResourceOptions? options = null)
            : base("aws:redshift/usageLimit:UsageLimit", name, args ?? new UsageLimitArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UsageLimit(string name, Input<string> id, UsageLimitState? state = null, CustomResourceOptions? options = null)
            : base("aws:redshift/usageLimit:UsageLimit", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UsageLimit resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UsageLimit Get(string name, Input<string> id, UsageLimitState? state = null, CustomResourceOptions? options = null)
        {
            return new UsageLimit(name, id, state, options);
        }
    }

    public sealed class UsageLimitArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The value must be a positive number.
        /// </summary>
        [Input("amount", required: true)]
        public Input<int> Amount { get; set; } = null!;

        /// <summary>
        /// The action that Amazon Redshift takes when the limit is reached. The default is `log`. Valid values are `log`, `emit-metric`, and `disable`.
        /// </summary>
        [Input("breachAction")]
        public Input<string>? BreachAction { get; set; }

        /// <summary>
        /// The identifier of the cluster that you want to limit usage.
        /// </summary>
        [Input("clusterIdentifier", required: true)]
        public Input<string> ClusterIdentifier { get; set; } = null!;

        /// <summary>
        /// The Amazon Redshift feature that you want to limit. Valid values are `spectrum`, `concurrency-scaling`, and `cross-region-datasharing`.
        /// </summary>
        [Input("featureType", required: true)]
        public Input<string> FeatureType { get; set; } = null!;

        /// <summary>
        /// The type of limit. Depending on the feature type, this can be based on a time duration or data size. If FeatureType is `spectrum`, then LimitType must be `data-scanned`. If FeatureType is `concurrency-scaling`, then LimitType must be `time`. If FeatureType is `cross-region-datasharing`, then LimitType must be `data-scanned`. Valid values are `data-scanned`, and `time`.
        /// </summary>
        [Input("limitType", required: true)]
        public Input<string> LimitType { get; set; } = null!;

        /// <summary>
        /// The time period that the amount applies to. A weekly period begins on Sunday. The default is `monthly`. Valid values are `daily`, `weekly`, and `monthly`.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public UsageLimitArgs()
        {
        }
        public static new UsageLimitArgs Empty => new UsageLimitArgs();
    }

    public sealed class UsageLimitState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The limit amount. If time-based, this amount is in minutes. If data-based, this amount is in terabytes (TB). The value must be a positive number.
        /// </summary>
        [Input("amount")]
        public Input<int>? Amount { get; set; }

        /// <summary>
        /// Amazon Resource Name (ARN) of the Redshift Usage Limit.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The action that Amazon Redshift takes when the limit is reached. The default is `log`. Valid values are `log`, `emit-metric`, and `disable`.
        /// </summary>
        [Input("breachAction")]
        public Input<string>? BreachAction { get; set; }

        /// <summary>
        /// The identifier of the cluster that you want to limit usage.
        /// </summary>
        [Input("clusterIdentifier")]
        public Input<string>? ClusterIdentifier { get; set; }

        /// <summary>
        /// The Amazon Redshift feature that you want to limit. Valid values are `spectrum`, `concurrency-scaling`, and `cross-region-datasharing`.
        /// </summary>
        [Input("featureType")]
        public Input<string>? FeatureType { get; set; }

        /// <summary>
        /// The type of limit. Depending on the feature type, this can be based on a time duration or data size. If FeatureType is `spectrum`, then LimitType must be `data-scanned`. If FeatureType is `concurrency-scaling`, then LimitType must be `time`. If FeatureType is `cross-region-datasharing`, then LimitType must be `data-scanned`. Valid values are `data-scanned`, and `time`.
        /// </summary>
        [Input("limitType")]
        public Input<string>? LimitType { get; set; }

        /// <summary>
        /// The time period that the amount applies to. A weekly period begins on Sunday. The default is `monthly`. Valid values are `daily`, `weekly`, and `monthly`.
        /// </summary>
        [Input("period")]
        public Input<string>? Period { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public UsageLimitState()
        {
        }
        public static new UsageLimitState Empty => new UsageLimitState();
    }
}
