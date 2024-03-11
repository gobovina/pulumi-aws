// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.VpcLattice
{
    /// <summary>
    /// Resource for managing an AWS VPC Lattice Target Group.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Usage
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
    ///     var example = new Aws.VpcLattice.TargetGroup("example", new()
    ///     {
    ///         Name = "example",
    ///         Type = "INSTANCE",
    ///         Config = new Aws.VpcLattice.Inputs.TargetGroupConfigArgs
    ///         {
    ///             VpcIdentifier = exampleAwsVpc.Id,
    ///             Port = 443,
    ///             Protocol = "HTTPS",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Basic usage with Health check
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
    ///     var example = new Aws.VpcLattice.TargetGroup("example", new()
    ///     {
    ///         Name = "example",
    ///         Type = "IP",
    ///         Config = new Aws.VpcLattice.Inputs.TargetGroupConfigArgs
    ///         {
    ///             VpcIdentifier = exampleAwsVpc.Id,
    ///             IpAddressType = "IPV4",
    ///             Port = 443,
    ///             Protocol = "HTTPS",
    ///             ProtocolVersion = "HTTP1",
    ///             HealthCheck = new Aws.VpcLattice.Inputs.TargetGroupConfigHealthCheckArgs
    ///             {
    ///                 Enabled = true,
    ///                 HealthCheckIntervalSeconds = 20,
    ///                 HealthCheckTimeoutSeconds = 10,
    ///                 HealthyThresholdCount = 7,
    ///                 UnhealthyThresholdCount = 3,
    ///                 Matcher = new Aws.VpcLattice.Inputs.TargetGroupConfigHealthCheckMatcherArgs
    ///                 {
    ///                     Value = "200-299",
    ///                 },
    ///                 Path = "/instance",
    ///                 Port = 80,
    ///                 Protocol = "HTTP",
    ///                 ProtocolVersion = "HTTP1",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### ALB
    /// 
    /// If the type is ALB, `health_check` block is not supported.
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
    ///     var example = new Aws.VpcLattice.TargetGroup("example", new()
    ///     {
    ///         Name = "example",
    ///         Type = "ALB",
    ///         Config = new Aws.VpcLattice.Inputs.TargetGroupConfigArgs
    ///         {
    ///             VpcIdentifier = exampleAwsVpc.Id,
    ///             Port = 443,
    ///             Protocol = "HTTPS",
    ///             ProtocolVersion = "HTTP1",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ### Lambda
    /// 
    /// If the type is Lambda, `config` block is not supported.
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
    ///     var example = new Aws.VpcLattice.TargetGroup("example", new()
    ///     {
    ///         Name = "example",
    ///         Type = "LAMBDA",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import VPC Lattice Target Group using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:vpclattice/targetGroup:TargetGroup example tg-0c11d4dc16ed96bdb
    /// ```
    /// </summary>
    [AwsResourceType("aws:vpclattice/targetGroup:TargetGroup")]
    public partial class TargetGroup : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the target group.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The target group configuration.
        /// </summary>
        [Output("config")]
        public Output<Outputs.TargetGroupConfig?> Config { get; private set; } = null!;

        /// <summary>
        /// The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Status of the target group.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a TargetGroup resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public TargetGroup(string name, TargetGroupArgs args, CustomResourceOptions? options = null)
            : base("aws:vpclattice/targetGroup:TargetGroup", name, args ?? new TargetGroupArgs(), MakeResourceOptions(options, ""))
        {
        }

        private TargetGroup(string name, Input<string> id, TargetGroupState? state = null, CustomResourceOptions? options = null)
            : base("aws:vpclattice/targetGroup:TargetGroup", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing TargetGroup resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static TargetGroup Get(string name, Input<string> id, TargetGroupState? state = null, CustomResourceOptions? options = null)
        {
            return new TargetGroup(name, id, state, options);
        }
    }

    public sealed class TargetGroupArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The target group configuration.
        /// </summary>
        [Input("config")]
        public Input<Inputs.TargetGroupConfigArgs>? Config { get; set; }

        /// <summary>
        /// The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public TargetGroupArgs()
        {
        }
        public static new TargetGroupArgs Empty => new TargetGroupArgs();
    }

    public sealed class TargetGroupState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the target group.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The target group configuration.
        /// </summary>
        [Input("config")]
        public Input<Inputs.TargetGroupConfigGetArgs>? Config { get; set; }

        /// <summary>
        /// The name of the target group. The name must be unique within the account. The valid characters are a-z, 0-9, and hyphens (-). You can't use a hyphen as the first or last character, or immediately after another hyphen.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// Status of the target group.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The type of target group. Valid Values are `IP` | `LAMBDA` | `INSTANCE` | `ALB`
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public TargetGroupState()
        {
        }
        public static new TargetGroupState Empty => new TargetGroupState();
    }
}
