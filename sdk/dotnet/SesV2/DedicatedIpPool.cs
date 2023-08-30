// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SesV2
{
    /// <summary>
    /// Resource for managing an AWS SESv2 (Simple Email V2) Dedicated IP Pool.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.SesV2.DedicatedIpPool("example", new()
    ///     {
    ///         PoolName = "my-pool",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Managed Pool
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.SesV2.DedicatedIpPool("example", new()
    ///     {
    ///         PoolName = "my-managed-pool",
    ///         ScalingMode = "MANAGED",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SESv2 (Simple Email V2) Dedicated IP Pool using the `pool_name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:sesv2/dedicatedIpPool:DedicatedIpPool example my-pool
    /// ```
    /// </summary>
    [AwsResourceType("aws:sesv2/dedicatedIpPool:DedicatedIpPool")]
    public partial class DedicatedIpPool : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the Dedicated IP Pool.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Name of the dedicated IP pool.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("poolName")]
        public Output<string> PoolName { get; private set; } = null!;

        /// <summary>
        /// IP pool scaling mode. Valid values: `STANDARD`, `MANAGED`. If omitted, the AWS API will default to a standard pool.
        /// </summary>
        [Output("scalingMode")]
        public Output<string> ScalingMode { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the pool. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a DedicatedIpPool resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public DedicatedIpPool(string name, DedicatedIpPoolArgs args, CustomResourceOptions? options = null)
            : base("aws:sesv2/dedicatedIpPool:DedicatedIpPool", name, args ?? new DedicatedIpPoolArgs(), MakeResourceOptions(options, ""))
        {
        }

        private DedicatedIpPool(string name, Input<string> id, DedicatedIpPoolState? state = null, CustomResourceOptions? options = null)
            : base("aws:sesv2/dedicatedIpPool:DedicatedIpPool", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing DedicatedIpPool resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static DedicatedIpPool Get(string name, Input<string> id, DedicatedIpPoolState? state = null, CustomResourceOptions? options = null)
        {
            return new DedicatedIpPool(name, id, state, options);
        }
    }

    public sealed class DedicatedIpPoolArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the dedicated IP pool.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("poolName", required: true)]
        public Input<string> PoolName { get; set; } = null!;

        /// <summary>
        /// IP pool scaling mode. Valid values: `STANDARD`, `MANAGED`. If omitted, the AWS API will default to a standard pool.
        /// </summary>
        [Input("scalingMode")]
        public Input<string>? ScalingMode { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the pool. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public DedicatedIpPoolArgs()
        {
        }
        public static new DedicatedIpPoolArgs Empty => new DedicatedIpPoolArgs();
    }

    public sealed class DedicatedIpPoolState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the Dedicated IP Pool.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Name of the dedicated IP pool.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("poolName")]
        public Input<string>? PoolName { get; set; }

        /// <summary>
        /// IP pool scaling mode. Valid values: `STANDARD`, `MANAGED`. If omitted, the AWS API will default to a standard pool.
        /// </summary>
        [Input("scalingMode")]
        public Input<string>? ScalingMode { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the pool. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public DedicatedIpPoolState()
        {
        }
        public static new DedicatedIpPoolState Empty => new DedicatedIpPoolState();
    }
}
