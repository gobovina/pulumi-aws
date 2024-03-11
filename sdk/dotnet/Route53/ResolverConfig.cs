// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Route53
{
    /// <summary>
    /// Provides a Route 53 Resolver config resource.
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
    ///     var example = new Aws.Ec2.Vpc("example", new()
    ///     {
    ///         CidrBlock = "10.0.0.0/16",
    ///         EnableDnsSupport = true,
    ///         EnableDnsHostnames = true,
    ///     });
    /// 
    ///     var exampleResolverConfig = new Aws.Route53.ResolverConfig("example", new()
    ///     {
    ///         ResourceId = example.Id,
    ///         AutodefinedReverseFlag = "DISABLE",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Route 53 Resolver configs using the Route 53 Resolver config ID. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:route53/resolverConfig:ResolverConfig example rslvr-rc-715aa20c73a23da7
    /// ```
    /// </summary>
    [AwsResourceType("aws:route53/resolverConfig:ResolverConfig")]
    public partial class ResolverConfig : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. Valid values: `ENABLE`, `DISABLE`.
        /// </summary>
        [Output("autodefinedReverseFlag")]
        public Output<string> AutodefinedReverseFlag { get; private set; } = null!;

        /// <summary>
        /// The AWS account ID of the owner of the VPC that this resolver configuration applies to.
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC that the configuration is for.
        /// </summary>
        [Output("resourceId")]
        public Output<string> ResourceId { get; private set; } = null!;


        /// <summary>
        /// Create a ResolverConfig resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ResolverConfig(string name, ResolverConfigArgs args, CustomResourceOptions? options = null)
            : base("aws:route53/resolverConfig:ResolverConfig", name, args ?? new ResolverConfigArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ResolverConfig(string name, Input<string> id, ResolverConfigState? state = null, CustomResourceOptions? options = null)
            : base("aws:route53/resolverConfig:ResolverConfig", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ResolverConfig resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ResolverConfig Get(string name, Input<string> id, ResolverConfigState? state = null, CustomResourceOptions? options = null)
        {
            return new ResolverConfig(name, id, state, options);
        }
    }

    public sealed class ResolverConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. Valid values: `ENABLE`, `DISABLE`.
        /// </summary>
        [Input("autodefinedReverseFlag", required: true)]
        public Input<string> AutodefinedReverseFlag { get; set; } = null!;

        /// <summary>
        /// The ID of the VPC that the configuration is for.
        /// </summary>
        [Input("resourceId", required: true)]
        public Input<string> ResourceId { get; set; } = null!;

        public ResolverConfigArgs()
        {
        }
        public static new ResolverConfigArgs Empty => new ResolverConfigArgs();
    }

    public sealed class ResolverConfigState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Indicates whether or not the Resolver will create autodefined rules for reverse DNS lookups. Valid values: `ENABLE`, `DISABLE`.
        /// </summary>
        [Input("autodefinedReverseFlag")]
        public Input<string>? AutodefinedReverseFlag { get; set; }

        /// <summary>
        /// The AWS account ID of the owner of the VPC that this resolver configuration applies to.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        /// <summary>
        /// The ID of the VPC that the configuration is for.
        /// </summary>
        [Input("resourceId")]
        public Input<string>? ResourceId { get; set; }

        public ResolverConfigState()
        {
        }
        public static new ResolverConfigState Empty => new ResolverConfigState();
    }
}
