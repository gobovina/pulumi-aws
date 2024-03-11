// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Quicksight
{
    /// <summary>
    /// Resource for managing an AWS QuickSight VPC Connection.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Usage
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
    ///     var vpcConnectionRole = new Aws.Iam.Role("vpc_connection_role", new()
    ///     {
    ///         AssumeRolePolicy = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///         {
    ///             ["version"] = "2012-10-17",
    ///             ["statement"] = new[]
    ///             {
    ///                 new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["effect"] = "Allow",
    ///                     ["action"] = "sts:AssumeRole",
    ///                     ["principal"] = new Dictionary&lt;string, object?&gt;
    ///                     {
    ///                         ["service"] = "quicksight.amazonaws.com",
    ///                     },
    ///                 },
    ///             },
    ///         }),
    ///         InlinePolicies = new[]
    ///         {
    ///             new Aws.Iam.Inputs.RoleInlinePolicyArgs
    ///             {
    ///                 Name = "QuickSightVPCConnectionRolePolicy",
    ///                 Policy = JsonSerializer.Serialize(new Dictionary&lt;string, object?&gt;
    ///                 {
    ///                     ["version"] = "2012-10-17",
    ///                     ["statement"] = new[]
    ///                     {
    ///                         new Dictionary&lt;string, object?&gt;
    ///                         {
    ///                             ["effect"] = "Allow",
    ///                             ["action"] = new[]
    ///                             {
    ///                                 "ec2:CreateNetworkInterface",
    ///                                 "ec2:ModifyNetworkInterfaceAttribute",
    ///                                 "ec2:DeleteNetworkInterface",
    ///                                 "ec2:DescribeSubnets",
    ///                                 "ec2:DescribeSecurityGroups",
    ///                             },
    ///                             ["resource"] = new[]
    ///                             {
    ///                                 "*",
    ///                             },
    ///                         },
    ///                     },
    ///                 }),
    ///             },
    ///         },
    ///     });
    /// 
    ///     var example = new Aws.Quicksight.VpcConnection("example", new()
    ///     {
    ///         VpcConnectionId = "example-connection-id",
    ///         Name = "Example Connection",
    ///         RoleArn = vpcConnectionRole.Arn,
    ///         SecurityGroupIds = new[]
    ///         {
    ///             "sg-00000000000000000",
    ///         },
    ///         SubnetIds = new[]
    ///         {
    ///             "subnet-00000000000000000",
    ///             "subnet-00000000000000001",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import QuickSight VPC connection using the AWS account ID and VPC connection ID separated by commas (`,`). For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:quicksight/vpcConnection:VpcConnection example 123456789012,example
    /// ```
    /// </summary>
    [AwsResourceType("aws:quicksight/vpcConnection:VpcConnection")]
    public partial class VpcConnection : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the VPC connection.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The availability status of the VPC connection. Valid values are `AVAILABLE`, `UNAVAILABLE` or `PARTIALLY_AVAILABLE`.
        /// </summary>
        [Output("availabilityStatus")]
        public Output<string> AvailabilityStatus { get; private set; } = null!;

        /// <summary>
        /// AWS account ID.
        /// </summary>
        [Output("awsAccountId")]
        public Output<string> AwsAccountId { get; private set; } = null!;

        /// <summary>
        /// A list of IP addresses of DNS resolver endpoints for the VPC connection.
        /// </summary>
        [Output("dnsResolvers")]
        public Output<ImmutableArray<string>> DnsResolvers { get; private set; } = null!;

        /// <summary>
        /// The display name for the VPC connection.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The IAM role to associate with the VPC connection.
        /// </summary>
        [Output("roleArn")]
        public Output<string> RoleArn { get; private set; } = null!;

        /// <summary>
        /// A list of security group IDs for the VPC connection.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// A list of subnet IDs for the VPC connection.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

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

        [Output("timeouts")]
        public Output<Outputs.VpcConnectionTimeouts?> Timeouts { get; private set; } = null!;

        /// <summary>
        /// The ID of the VPC connection.
        /// </summary>
        [Output("vpcConnectionId")]
        public Output<string> VpcConnectionId { get; private set; } = null!;


        /// <summary>
        /// Create a VpcConnection resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public VpcConnection(string name, VpcConnectionArgs args, CustomResourceOptions? options = null)
            : base("aws:quicksight/vpcConnection:VpcConnection", name, args ?? new VpcConnectionArgs(), MakeResourceOptions(options, ""))
        {
        }

        private VpcConnection(string name, Input<string> id, VpcConnectionState? state = null, CustomResourceOptions? options = null)
            : base("aws:quicksight/vpcConnection:VpcConnection", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing VpcConnection resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static VpcConnection Get(string name, Input<string> id, VpcConnectionState? state = null, CustomResourceOptions? options = null)
        {
            return new VpcConnection(name, id, state, options);
        }
    }

    public sealed class VpcConnectionArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// AWS account ID.
        /// </summary>
        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        [Input("dnsResolvers")]
        private InputList<string>? _dnsResolvers;

        /// <summary>
        /// A list of IP addresses of DNS resolver endpoints for the VPC connection.
        /// </summary>
        public InputList<string> DnsResolvers
        {
            get => _dnsResolvers ?? (_dnsResolvers = new InputList<string>());
            set => _dnsResolvers = value;
        }

        /// <summary>
        /// The display name for the VPC connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The IAM role to associate with the VPC connection.
        /// </summary>
        [Input("roleArn", required: true)]
        public Input<string> RoleArn { get; set; } = null!;

        [Input("securityGroupIds", required: true)]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// A list of security group IDs for the VPC connection.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("subnetIds", required: true)]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A list of subnet IDs for the VPC connection.
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

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

        [Input("timeouts")]
        public Input<Inputs.VpcConnectionTimeoutsArgs>? Timeouts { get; set; }

        /// <summary>
        /// The ID of the VPC connection.
        /// </summary>
        [Input("vpcConnectionId", required: true)]
        public Input<string> VpcConnectionId { get; set; } = null!;

        public VpcConnectionArgs()
        {
        }
        public static new VpcConnectionArgs Empty => new VpcConnectionArgs();
    }

    public sealed class VpcConnectionState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the VPC connection.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The availability status of the VPC connection. Valid values are `AVAILABLE`, `UNAVAILABLE` or `PARTIALLY_AVAILABLE`.
        /// </summary>
        [Input("availabilityStatus")]
        public Input<string>? AvailabilityStatus { get; set; }

        /// <summary>
        /// AWS account ID.
        /// </summary>
        [Input("awsAccountId")]
        public Input<string>? AwsAccountId { get; set; }

        [Input("dnsResolvers")]
        private InputList<string>? _dnsResolvers;

        /// <summary>
        /// A list of IP addresses of DNS resolver endpoints for the VPC connection.
        /// </summary>
        public InputList<string> DnsResolvers
        {
            get => _dnsResolvers ?? (_dnsResolvers = new InputList<string>());
            set => _dnsResolvers = value;
        }

        /// <summary>
        /// The display name for the VPC connection.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The IAM role to associate with the VPC connection.
        /// </summary>
        [Input("roleArn")]
        public Input<string>? RoleArn { get; set; }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// A list of security group IDs for the VPC connection.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A list of subnet IDs for the VPC connection.
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

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

        [Input("timeouts")]
        public Input<Inputs.VpcConnectionTimeoutsGetArgs>? Timeouts { get; set; }

        /// <summary>
        /// The ID of the VPC connection.
        /// </summary>
        [Input("vpcConnectionId")]
        public Input<string>? VpcConnectionId { get; set; }

        public VpcConnectionState()
        {
        }
        public static new VpcConnectionState Empty => new VpcConnectionState();
    }
}
