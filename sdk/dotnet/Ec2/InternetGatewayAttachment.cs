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
    /// Provides a resource to create a VPC Internet Gateway Attachment.
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
    ///     var exampleVpc = new Aws.Ec2.Vpc("exampleVpc", new()
    ///     {
    ///         CidrBlock = "10.1.0.0/16",
    ///     });
    /// 
    ///     var exampleInternetGateway = new Aws.Ec2.InternetGateway("exampleInternetGateway");
    /// 
    ///     var exampleInternetGatewayAttachment = new Aws.Ec2.InternetGatewayAttachment("exampleInternetGatewayAttachment", new()
    ///     {
    ///         InternetGatewayId = exampleInternetGateway.Id,
    ///         VpcId = exampleVpc.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Internet Gateway Attachments using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/internetGatewayAttachment:InternetGatewayAttachment example igw-c0a643a9:vpc-123456
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/internetGatewayAttachment:InternetGatewayAttachment")]
    public partial class InternetGatewayAttachment : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the internet gateway.
        /// </summary>
        [Output("internetGatewayId")]
        public Output<string> InternetGatewayId { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a InternetGatewayAttachment resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public InternetGatewayAttachment(string name, InternetGatewayAttachmentArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/internetGatewayAttachment:InternetGatewayAttachment", name, args ?? new InternetGatewayAttachmentArgs(), MakeResourceOptions(options, ""))
        {
        }

        private InternetGatewayAttachment(string name, Input<string> id, InternetGatewayAttachmentState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/internetGatewayAttachment:InternetGatewayAttachment", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing InternetGatewayAttachment resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static InternetGatewayAttachment Get(string name, Input<string> id, InternetGatewayAttachmentState? state = null, CustomResourceOptions? options = null)
        {
            return new InternetGatewayAttachment(name, id, state, options);
        }
    }

    public sealed class InternetGatewayAttachmentArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the internet gateway.
        /// </summary>
        [Input("internetGatewayId", required: true)]
        public Input<string> InternetGatewayId { get; set; } = null!;

        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Input("vpcId", required: true)]
        public Input<string> VpcId { get; set; } = null!;

        public InternetGatewayAttachmentArgs()
        {
        }
        public static new InternetGatewayAttachmentArgs Empty => new InternetGatewayAttachmentArgs();
    }

    public sealed class InternetGatewayAttachmentState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the internet gateway.
        /// </summary>
        [Input("internetGatewayId")]
        public Input<string>? InternetGatewayId { get; set; }

        /// <summary>
        /// The ID of the VPC.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public InternetGatewayAttachmentState()
        {
        }
        public static new InternetGatewayAttachmentState Empty => new InternetGatewayAttachmentState();
    }
}
