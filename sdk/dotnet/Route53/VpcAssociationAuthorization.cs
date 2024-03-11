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
    /// Authorizes a VPC in a different account to be associated with a local Route53 Hosted Zone.
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
    ///         CidrBlock = "10.6.0.0/16",
    ///         EnableDnsHostnames = true,
    ///         EnableDnsSupport = true,
    ///     });
    /// 
    ///     var exampleZone = new Aws.Route53.Zone("example", new()
    ///     {
    ///         Name = "example.com",
    ///         Vpcs = new[]
    ///         {
    ///             new Aws.Route53.Inputs.ZoneVpcArgs
    ///             {
    ///                 VpcId = example.Id,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var alternate = new Aws.Ec2.Vpc("alternate", new()
    ///     {
    ///         CidrBlock = "10.7.0.0/16",
    ///         EnableDnsHostnames = true,
    ///         EnableDnsSupport = true,
    ///     });
    /// 
    ///     var exampleVpcAssociationAuthorization = new Aws.Route53.VpcAssociationAuthorization("example", new()
    ///     {
    ///         VpcId = alternate.Id,
    ///         ZoneId = exampleZone.Id,
    ///     });
    /// 
    ///     var exampleZoneAssociation = new Aws.Route53.ZoneAssociation("example", new()
    ///     {
    ///         VpcId = exampleVpcAssociationAuthorization.VpcId,
    ///         ZoneId = exampleVpcAssociationAuthorization.ZoneId,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Route 53 VPC Association Authorizations using the Hosted Zone ID and VPC ID, separated by a colon (`:`). For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization example Z123456ABCDEFG:vpc-12345678
    /// ```
    /// </summary>
    [AwsResourceType("aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization")]
    public partial class VpcAssociationAuthorization : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The VPC to authorize for association with the private hosted zone.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The VPC's region. Defaults to the region of the AWS provider.
        /// </summary>
        [Output("vpcRegion")]
        public Output<string> VpcRegion { get; private set; } = null!;

        /// <summary>
        /// The ID of the private hosted zone that you want to authorize associating a VPC with.
        /// </summary>
        [Output("zoneId")]
        public Output<string> ZoneId { get; private set; } = null!;


        /// <summary>
        /// Create a VpcAssociationAuthorization resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcAssociationAuthorization(string name, VpcAssociationAuthorizationArgs args, CustomResourceOptions? options = null)
            : base("aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization", name, args ?? new VpcAssociationAuthorizationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcAssociationAuthorization(string name, Input<string> id, VpcAssociationAuthorizationState? state = null, CustomResourceOptions? options = null)
            : base("aws:route53/vpcAssociationAuthorization:VpcAssociationAuthorization", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcAssociationAuthorization resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcAssociationAuthorization Get(string name, Input<string> id, VpcAssociationAuthorizationState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcAssociationAuthorization(name, id, state, options);
        }
    }

    public sealed class VpcAssociationAuthorizationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The VPC to authorize for association with the private hosted zone.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        /// <summary>
        /// The VPC's region. Defaults to the region of the AWS provider.
        /// </summary>
        [Input("vpcRegion")]
        public Input<string>? VpcRegion { get; set; }

        /// <summary>
        /// The ID of the private hosted zone that you want to authorize associating a VPC with.
        /// </summary>
        [Input("zoneId", required: true)]
        public Input<string> ZoneId { get; set; } = null!;

        public VpcAssociationAuthorizationArgs()
        {
        }
        public static new VpcAssociationAuthorizationArgs Empty => new VpcAssociationAuthorizationArgs();
    }

    public sealed class VpcAssociationAuthorizationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The VPC to authorize for association with the private hosted zone.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The VPC's region. Defaults to the region of the AWS provider.
        /// </summary>
        [Input("vpcRegion")]
        public Input<string>? VpcRegion { get; set; }

        /// <summary>
        /// The ID of the private hosted zone that you want to authorize associating a VPC with.
        /// </summary>
        [Input("zoneId")]
        public Input<string>? ZoneId { get; set; }

        public VpcAssociationAuthorizationState()
        {
        }
        public static new VpcAssociationAuthorizationState Empty => new VpcAssociationAuthorizationState();
    }
}
