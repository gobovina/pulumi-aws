// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Batch
{
    /// <summary>
    /// Provides a Batch Scheduling Policy resource.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Batch.SchedulingPolicy("example", new()
    ///     {
    ///         Name = "example",
    ///         FairSharePolicy = new Aws.Batch.Inputs.SchedulingPolicyFairSharePolicyArgs
    ///         {
    ///             ComputeReservation = 1,
    ///             ShareDecaySeconds = 3600,
    ///             ShareDistributions = new[]
    ///             {
    ///                 new Aws.Batch.Inputs.SchedulingPolicyFairSharePolicyShareDistributionArgs
    ///                 {
    ///                     ShareIdentifier = "A1*",
    ///                     WeightFactor = 0.1,
    ///                 },
    ///                 new Aws.Batch.Inputs.SchedulingPolicyFairSharePolicyShareDistributionArgs
    ///                 {
    ///                     ShareIdentifier = "A2",
    ///                     WeightFactor = 0.2,
    ///                 },
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Name", "Example Batch Scheduling Policy" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Batch Scheduling Policy using the `arn`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:batch/schedulingPolicy:SchedulingPolicy test_policy arn:aws:batch:us-east-1:123456789012:scheduling-policy/sample
    /// ```
    /// </summary>
    [AwsResourceType("aws:batch/schedulingPolicy:SchedulingPolicy")]
    public partial class SchedulingPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name of the scheduling policy.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        [Output("fairSharePolicy")]
        public Output<Outputs.SchedulingPolicyFairSharePolicy?> FairSharePolicy { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the scheduling policy.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a SchedulingPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SchedulingPolicy(string name, SchedulingPolicyArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:batch/schedulingPolicy:SchedulingPolicy", name, args ?? new SchedulingPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SchedulingPolicy(string name, Input<string> id, SchedulingPolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:batch/schedulingPolicy:SchedulingPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SchedulingPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SchedulingPolicy Get(string name, Input<string> id, SchedulingPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new SchedulingPolicy(name, id, state, options);
        }
    }

    public sealed class SchedulingPolicyArgs : global::Pulumi.ResourceArgs
    {
        [Input("fairSharePolicy")]
        public Input<Inputs.SchedulingPolicyFairSharePolicyArgs>? FairSharePolicy { get; set; }

        /// <summary>
        /// Specifies the name of the scheduling policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public SchedulingPolicyArgs()
        {
        }
        public static new SchedulingPolicyArgs Empty => new SchedulingPolicyArgs();
    }

    public sealed class SchedulingPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name of the scheduling policy.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("fairSharePolicy")]
        public Input<Inputs.SchedulingPolicyFairSharePolicyGetArgs>? FairSharePolicy { get; set; }

        /// <summary>
        /// Specifies the name of the scheduling policy.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public SchedulingPolicyState()
        {
        }
        public static new SchedulingPolicyState Empty => new SchedulingPolicyState();
    }
}
