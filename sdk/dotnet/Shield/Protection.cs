// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Shield
{
    /// <summary>
    /// Enables AWS Shield Advanced for a specific AWS resource.
    /// The resource can be an Amazon CloudFront distribution, Elastic Load Balancing load balancer, AWS Global Accelerator accelerator, Elastic IP Address, or an Amazon Route 53 hosted zone.
    /// 
    /// ## Example Usage
    /// ### Create protection
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var available = Aws.GetAvailabilityZones.Invoke();
    /// 
    ///     var currentRegion = Aws.GetRegion.Invoke();
    /// 
    ///     var currentCallerIdentity = Aws.GetCallerIdentity.Invoke();
    /// 
    ///     var exampleEip = new Aws.Ec2.Eip("exampleEip", new()
    ///     {
    ///         Domain = "vpc",
    ///     });
    /// 
    ///     var exampleProtection = new Aws.Shield.Protection("exampleProtection", new()
    ///     {
    ///         ResourceArn = Output.Tuple(currentRegion, currentCallerIdentity, exampleEip.Id).Apply(values =&gt;
    ///         {
    ///             var currentRegion = values.Item1;
    ///             var currentCallerIdentity = values.Item2;
    ///             var id = values.Item3;
    ///             return $"arn:aws:ec2:{currentRegion.Apply(getRegionResult =&gt; getRegionResult.Name)}:{currentCallerIdentity.Apply(getCallerIdentityResult =&gt; getCallerIdentityResult.AccountId)}:eip-allocation/{id}";
    ///         }),
    ///         Tags = 
    ///         {
    ///             { "Environment", "Dev" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Shield protection resources using specifying their ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:shield/protection:Protection example ff9592dc-22f3-4e88-afa1-7b29fde9669a
    /// ```
    /// </summary>
    [AwsResourceType("aws:shield/protection:Protection")]
    public partial class Protection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the Protection.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// A friendly name for the Protection you are creating.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The ARN (Amazon Resource Name) of the resource to be protected.
        /// </summary>
        [Output("resourceArn")]
        public Output<string> ResourceArn { get; private set; } = null!;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Protection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Protection(string name, ProtectionArgs args, CustomResourceOptions? options = null)
            : base("aws:shield/protection:Protection", name, args ?? new ProtectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Protection(string name, Input<string> id, ProtectionState? state = null, CustomResourceOptions? options = null)
            : base("aws:shield/protection:Protection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Protection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Protection Get(string name, Input<string> id, ProtectionState? state = null, CustomResourceOptions? options = null)
        {
            return new Protection(name, id, state, options);
        }
    }

    public sealed class ProtectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A friendly name for the Protection you are creating.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ARN (Amazon Resource Name) of the resource to be protected.
        /// </summary>
        [Input("resourceArn", required: true)]
        public Input<string> ResourceArn { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ProtectionArgs()
        {
        }
        public static new ProtectionArgs Empty => new ProtectionArgs();
    }

    public sealed class ProtectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the Protection.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// A friendly name for the Protection you are creating.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The ARN (Amazon Resource Name) of the resource to be protected.
        /// </summary>
        [Input("resourceArn")]
        public Input<string>? ResourceArn { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        public ProtectionState()
        {
        }
        public static new ProtectionState Empty => new ProtectionState();
    }
}
