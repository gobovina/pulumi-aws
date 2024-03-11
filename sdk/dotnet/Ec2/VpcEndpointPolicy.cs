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
    /// Provides a VPC Endpoint Policy resource.
    /// 
    /// ## Example Usage
    /// 
    /// &lt;!--Start PulumiCodeChooser --&gt;
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using System.Text.Json;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = Aws.Ec2.GetVpcEndpointService.Invoke(new()
    ///     {
    ///         Service = "dynamodb",
    ///     });
    /// 
    ///     var exampleVpc = new Aws.Ec2.Vpc("example", new()
    ///     {
    ///         CidrBlock = "10.0.0.0/16",
    ///     });
    /// 
    ///     var exampleVpcEndpoint = new Aws.Ec2.VpcEndpoint("example", new()
    ///     {
    ///         ServiceName = example.Apply(getVpcEndpointServiceResult =&gt; getVpcEndpointServiceResult.ServiceName),
    ///         VpcId = exampleVpc.Id,
    ///     });
    /// 
    ///     var exampleVpcEndpointPolicy = new Aws.Ec2.VpcEndpointPolicy("example", new()
    ///     {
    ///         VpcEndpointId = exampleVpcEndpoint.Id,
    ///         Policy = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["Version"] = "2012-10-17",
    ///             ["Statement"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["Sid"] = "AllowAll",
    ///                     ["Effect"] = "Allow",
    ///                     ["Principal"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["AWS"] = "*",
    ///                     },
    ///                     ["Action"] = new[]
    ///                     {
    ///                         "dynamodb:*",
    ///                     },
    ///                     ["Resource"] = "*",
    ///                 },
    ///             },
    ///         }),
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import VPC Endpoint Policies using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:ec2/vpcEndpointPolicy:VpcEndpointPolicy example vpce-3ecf2a57
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/vpcEndpointPolicy:VpcEndpointPolicy")]
    public partial class VpcEndpointPolicy : global::Pulumi.CustomResource
    {
        /// <summary>
        /// A policy to attach to the endpoint that controls access to the service. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
        /// </summary>
        [Output("policy")]
        public Output<string> Policy { get; private set; } = null!;

        /// <summary>
        /// The VPC Endpoint ID.
        /// </summary>
        [Output("vpcEndpointId")]
        public Output<string> VpcEndpointId { get; private set; } = null!;


        /// <summary>
        /// Create a VpcEndpointPolicy resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcEndpointPolicy(string name, VpcEndpointPolicyArgs args, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcEndpointPolicy:VpcEndpointPolicy", name, args ?? new VpcEndpointPolicyArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcEndpointPolicy(string name, Input<string> id, VpcEndpointPolicyState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/vpcEndpointPolicy:VpcEndpointPolicy", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcEndpointPolicy resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcEndpointPolicy Get(string name, Input<string> id, VpcEndpointPolicyState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcEndpointPolicy(name, id, state, options);
        }
    }

    public sealed class VpcEndpointPolicyArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A policy to attach to the endpoint that controls access to the service. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The VPC Endpoint ID.
        /// </summary>
        [Input("vpcEndpointId", required: true)]
        public Input<string> VpcEndpointId { get; set; } = null!;

        public VpcEndpointPolicyArgs()
        {
        }
        public static new VpcEndpointPolicyArgs Empty => new VpcEndpointPolicyArgs();
    }

    public sealed class VpcEndpointPolicyState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// A policy to attach to the endpoint that controls access to the service. Defaults to full access. All `Gateway` and some `Interface` endpoints support policies - see the [relevant AWS documentation](https://docs.aws.amazon.com/vpc/latest/userguide/vpc-endpoints-access.html) for more details.
        /// </summary>
        [Input("policy")]
        public Input<string>? Policy { get; set; }

        /// <summary>
        /// The VPC Endpoint ID.
        /// </summary>
        [Input("vpcEndpointId")]
        public Input<string>? VpcEndpointId { get; set; }

        public VpcEndpointPolicyState()
        {
        }
        public static new VpcEndpointPolicyState Empty => new VpcEndpointPolicyState();
    }
}
