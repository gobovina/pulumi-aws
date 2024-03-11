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
    /// Provides a Route53 CIDR location resource.
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
    ///     var example = new Aws.Route53.CidrCollection("example", new()
    ///     {
    ///         Name = "collection-1",
    ///     });
    /// 
    ///     var exampleCidrLocation = new Aws.Route53.CidrLocation("example", new()
    ///     {
    ///         CidrCollectionId = example.Id,
    ///         Name = "office",
    ///         CidrBlocks = new[]
    ///         {
    ///             "200.5.3.0/24",
    ///             "200.6.3.0/24",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import CIDR locations using their the CIDR collection ID and location name. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:route53/cidrLocation:CidrLocation example 9ac32814-3e67-0932-6048-8d779cc6f511,office
    /// ```
    /// </summary>
    [AwsResourceType("aws:route53/cidrLocation:CidrLocation")]
    public partial class CidrLocation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// CIDR blocks for the location.
        /// </summary>
        [Output("cidrBlocks")]
        public Output<ImmutableArray<string>> CidrBlocks { get; private set; } = null!;

        /// <summary>
        /// The ID of the CIDR collection to update.
        /// </summary>
        [Output("cidrCollectionId")]
        public Output<string> CidrCollectionId { get; private set; } = null!;

        /// <summary>
        /// Name for the CIDR location.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a CidrLocation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public CidrLocation(string name, CidrLocationArgs args, CustomResourceOptions? options = null)
            : base("aws:route53/cidrLocation:CidrLocation", name, args ?? new CidrLocationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private CidrLocation(string name, Input<string> id, CidrLocationState? state = null, CustomResourceOptions? options = null)
            : base("aws:route53/cidrLocation:CidrLocation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing CidrLocation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static CidrLocation Get(string name, Input<string> id, CidrLocationState? state = null, CustomResourceOptions? options = null)
        {
            return new CidrLocation(name, id, state, options);
        }
    }

    public sealed class CidrLocationArgs : global::Pulumi.ResourceArgs
    {
        [Input("cidrBlocks", required: true)]
        private InputList<string>? _cidrBlocks;

        /// <summary>
        /// CIDR blocks for the location.
        /// </summary>
        public InputList<string> CidrBlocks
        {
            get => _cidrBlocks ?? (_cidrBlocks = new InputList<string>());
            set => _cidrBlocks = value;
        }

        /// <summary>
        /// The ID of the CIDR collection to update.
        /// </summary>
        [Input("cidrCollectionId", required: true)]
        public Input<string> CidrCollectionId { get; set; } = null!;

        /// <summary>
        /// Name for the CIDR location.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public CidrLocationArgs()
        {
        }
        public static new CidrLocationArgs Empty => new CidrLocationArgs();
    }

    public sealed class CidrLocationState : global::Pulumi.ResourceArgs
    {
        [Input("cidrBlocks")]
        private InputList<string>? _cidrBlocks;

        /// <summary>
        /// CIDR blocks for the location.
        /// </summary>
        public InputList<string> CidrBlocks
        {
            get => _cidrBlocks ?? (_cidrBlocks = new InputList<string>());
            set => _cidrBlocks = value;
        }

        /// <summary>
        /// The ID of the CIDR collection to update.
        /// </summary>
        [Input("cidrCollectionId")]
        public Input<string>? CidrCollectionId { get; set; }

        /// <summary>
        /// Name for the CIDR location.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public CidrLocationState()
        {
        }
        public static new CidrLocationState Empty => new CidrLocationState();
    }
}
