// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    /// <summary>
    /// Provides a resource to create an association between a VPC endpoint and a security group.
    /// 
    /// &gt; **NOTE on VPC Endpoints and VPC Endpoint Security Group Associations:** The provider provides
    /// both a standalone VPC Endpoint Security Group Association (an association between a VPC endpoint
    /// and a single `security_group_id`) and a VPC Endpoint resource with a `security_group_ids`
    /// attribute. Do not use the same security group ID in both a VPC Endpoint resource and a VPC Endpoint Security
    /// Group Association resource. Doing so will cause a conflict of associations and will overwrite the association.
    /// 
    /// ## Example Usage
    /// 
    /// Basic usage:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var sgEc2 = new Aws.Ec2.SecurityGroupAssociation("sg_ec2", new()
    ///     {
    ///         VpcEndpointId = ec2.Id,
    ///         SecurityGroupId = sg.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/securityGroupAssociation:SecurityGroupAssociation")]
    public partial class SecurityGroupAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Whether this association should replace the association with the VPC's default security group that is created when no security groups are specified during VPC endpoint creation. At most 1 association per-VPC endpoint should be configured with `replace_default_association = true`.
        /// </summary>
        [Output("replaceDefaultAssociation")]
        public Output<bool?> ReplaceDefaultAssociation { get; private set; } = null!;

        /// <summary>
        /// The ID of the security group to be associated with the VPC endpoint.
        /// </summary>
        [Output("securityGroupId")]
        public Output<string> SecurityGroupId { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC endpoint with which the security group will be associated.
        /// </summary>
        [Output("vpcEndpointId")]
        public Output<string> VpcEndpointId { get; private set; } = null!;


        /// <summary>
        /// Create a SecurityGroupAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public SecurityGroupAssociation(string name, SecurityGroupAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/securityGroupAssociation:SecurityGroupAssociation", name, args ?? new SecurityGroupAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private SecurityGroupAssociation(string name, Input<string> id, SecurityGroupAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/securityGroupAssociation:SecurityGroupAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing SecurityGroupAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static SecurityGroupAssociation Get(string name, Input<string> id, SecurityGroupAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new SecurityGroupAssociation(name, id, state, options);
        }
    }

    public sealed class SecurityGroupAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether this association should replace the association with the VPC's default security group that is created when no security groups are specified during VPC endpoint creation. At most 1 association per-VPC endpoint should be configured with `replace_default_association = true`.
        /// </summary>
        [Input("replaceDefaultAssociation")]
        public Input<bool>? ReplaceDefaultAssociation { get; set; }

        /// <summary>
        /// The ID of the security group to be associated with the VPC endpoint.
        /// </summary>
        [Input("securityGroupId", required: true)]
        public Input<string> SecurityGroupId { get; set; } = null!;

        /// <summary>
        /// The ID of the VPC endpoint with which the security group will be associated.
        /// </summary>
        [Input("vpcEndpointId", required: true)]
        public Input<string> VpcEndpointId { get; set; } = null!;

        public SecurityGroupAssociationArgs()
        {
        }
        public static new SecurityGroupAssociationArgs Empty => new SecurityGroupAssociationArgs();
    }

    public sealed class SecurityGroupAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Whether this association should replace the association with the VPC's default security group that is created when no security groups are specified during VPC endpoint creation. At most 1 association per-VPC endpoint should be configured with `replace_default_association = true`.
        /// </summary>
        [Input("replaceDefaultAssociation")]
        public Input<bool>? ReplaceDefaultAssociation { get; set; }

        /// <summary>
        /// The ID of the security group to be associated with the VPC endpoint.
        /// </summary>
        [Input("securityGroupId")]
        public Input<string>? SecurityGroupId { get; set; }

        /// <summary>
        /// The ID of the VPC endpoint with which the security group will be associated.
        /// </summary>
        [Input("vpcEndpointId")]
        public Input<string>? VpcEndpointId { get; set; }

        public SecurityGroupAssociationState()
        {
        }
        public static new SecurityGroupAssociationState Empty => new SecurityGroupAssociationState();
    }
}
