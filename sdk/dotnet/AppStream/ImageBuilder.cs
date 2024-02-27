// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppStream
{
    /// <summary>
    /// Provides an AppStream image builder.
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
    ///     var testFleet = new Aws.AppStream.ImageBuilder("testFleet", new()
    ///     {
    ///         Description = "Description of a ImageBuilder",
    ///         DisplayName = "Display name of a ImageBuilder",
    ///         EnableDefaultInternetAccess = false,
    ///         ImageName = "AppStream-WinServer2019-10-05-2022",
    ///         InstanceType = "stream.standard.large",
    ///         VpcConfig = new Aws.AppStream.Inputs.ImageBuilderVpcConfigArgs
    ///         {
    ///             SubnetIds = new[]
    ///             {
    ///                 aws_subnet.Example.Id,
    ///             },
    ///         },
    ///         Tags = 
    ///         {
    ///             { "Name", "Example Image Builder" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_appstream_image_builder` using the `name`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:appstream/imageBuilder:ImageBuilder example imageBuilderExample
    /// ```
    /// </summary>
    [AwsResourceType("aws:appstream/imageBuilder:ImageBuilder")]
    public partial class ImageBuilder : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Set of interface VPC endpoint (interface endpoint) objects. Maximum of 4. See below.
        /// </summary>
        [Output("accessEndpoints")]
        public Output<ImmutableArray<Outputs.ImageBuilderAccessEndpoint>> AccessEndpoints { get; private set; } = null!;

        /// <summary>
        /// Version of the AppStream 2.0 agent to use for this image builder.
        /// </summary>
        [Output("appstreamAgentVersion")]
        public Output<string> AppstreamAgentVersion { get; private set; } = null!;

        /// <summary>
        /// ARN of the appstream image builder.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Date and time, in UTC and extended RFC 3339 format, when the image builder was created.
        /// </summary>
        [Output("createdTime")]
        public Output<string> CreatedTime { get; private set; } = null!;

        /// <summary>
        /// Description to display.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Human-readable friendly name for the AppStream image builder.
        /// </summary>
        [Output("displayName")]
        public Output<string> DisplayName { get; private set; } = null!;

        /// <summary>
        /// Configuration block for the name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. See below.
        /// </summary>
        [Output("domainJoinInfo")]
        public Output<Outputs.ImageBuilderDomainJoinInfo> DomainJoinInfo { get; private set; } = null!;

        /// <summary>
        /// Enables or disables default internet access for the image builder.
        /// </summary>
        [Output("enableDefaultInternetAccess")]
        public Output<bool> EnableDefaultInternetAccess { get; private set; } = null!;

        /// <summary>
        /// ARN of the IAM role to apply to the image builder.
        /// </summary>
        [Output("iamRoleArn")]
        public Output<string> IamRoleArn { get; private set; } = null!;

        /// <summary>
        /// ARN of the public, private, or shared image to use.
        /// </summary>
        [Output("imageArn")]
        public Output<string> ImageArn { get; private set; } = null!;

        /// <summary>
        /// Name of the image used to create the image builder.
        /// </summary>
        [Output("imageName")]
        public Output<string> ImageName { get; private set; } = null!;

        /// <summary>
        /// Instance type to use when launching the image builder.
        /// </summary>
        [Output("instanceType")]
        public Output<string> InstanceType { get; private set; } = null!;

        /// <summary>
        /// Unique name for the image builder.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// State of the image builder. Can be: `PENDING`, `UPDATING_AGENT`, `RUNNING`, `STOPPING`, `STOPPED`, `REBOOTING`, `SNAPSHOTTING`, `DELETING`, `FAILED`, `UPDATING`, `PENDING_QUALIFICATION`
        /// </summary>
        [Output("state")]
        public Output<string> State { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to the instance. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Configuration block for the VPC configuration for the image builder. See below.
        /// </summary>
        [Output("vpcConfig")]
        public Output<Outputs.ImageBuilderVpcConfig> VpcConfig { get; private set; } = null!;


        /// <summary>
        /// Create a ImageBuilder resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ImageBuilder(string name, ImageBuilderArgs args, CustomResourceOptions? options = null)
            : base("aws:appstream/imageBuilder:ImageBuilder", name, args ?? new ImageBuilderArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ImageBuilder(string name, Input<string> id, ImageBuilderState? state = null, CustomResourceOptions? options = null)
            : base("aws:appstream/imageBuilder:ImageBuilder", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ImageBuilder resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ImageBuilder Get(string name, Input<string> id, ImageBuilderState? state = null, CustomResourceOptions? options = null)
        {
            return new ImageBuilder(name, id, state, options);
        }
    }

    public sealed class ImageBuilderArgs : global::Pulumi.ResourceArgs
    {
        [Input("accessEndpoints")]
        private InputList<Inputs.ImageBuilderAccessEndpointArgs>? _accessEndpoints;

        /// <summary>
        /// Set of interface VPC endpoint (interface endpoint) objects. Maximum of 4. See below.
        /// </summary>
        public InputList<Inputs.ImageBuilderAccessEndpointArgs> AccessEndpoints
        {
            get => _accessEndpoints ?? (_accessEndpoints = new InputList<Inputs.ImageBuilderAccessEndpointArgs>());
            set => _accessEndpoints = value;
        }

        /// <summary>
        /// Version of the AppStream 2.0 agent to use for this image builder.
        /// </summary>
        [Input("appstreamAgentVersion")]
        public Input<string>? AppstreamAgentVersion { get; set; }

        /// <summary>
        /// Description to display.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Human-readable friendly name for the AppStream image builder.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Configuration block for the name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. See below.
        /// </summary>
        [Input("domainJoinInfo")]
        public Input<Inputs.ImageBuilderDomainJoinInfoArgs>? DomainJoinInfo { get; set; }

        /// <summary>
        /// Enables or disables default internet access for the image builder.
        /// </summary>
        [Input("enableDefaultInternetAccess")]
        public Input<bool>? EnableDefaultInternetAccess { get; set; }

        /// <summary>
        /// ARN of the IAM role to apply to the image builder.
        /// </summary>
        [Input("iamRoleArn")]
        public Input<string>? IamRoleArn { get; set; }

        /// <summary>
        /// ARN of the public, private, or shared image to use.
        /// </summary>
        [Input("imageArn")]
        public Input<string>? ImageArn { get; set; }

        /// <summary>
        /// Name of the image used to create the image builder.
        /// </summary>
        [Input("imageName")]
        public Input<string>? ImageName { get; set; }

        /// <summary>
        /// Instance type to use when launching the image builder.
        /// </summary>
        [Input("instanceType", required: true)]
        public Input<string> InstanceType { get; set; } = null!;

        /// <summary>
        /// Unique name for the image builder.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the instance. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Configuration block for the VPC configuration for the image builder. See below.
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.ImageBuilderVpcConfigArgs>? VpcConfig { get; set; }

        public ImageBuilderArgs()
        {
        }
        public static new ImageBuilderArgs Empty => new ImageBuilderArgs();
    }

    public sealed class ImageBuilderState : global::Pulumi.ResourceArgs
    {
        [Input("accessEndpoints")]
        private InputList<Inputs.ImageBuilderAccessEndpointGetArgs>? _accessEndpoints;

        /// <summary>
        /// Set of interface VPC endpoint (interface endpoint) objects. Maximum of 4. See below.
        /// </summary>
        public InputList<Inputs.ImageBuilderAccessEndpointGetArgs> AccessEndpoints
        {
            get => _accessEndpoints ?? (_accessEndpoints = new InputList<Inputs.ImageBuilderAccessEndpointGetArgs>());
            set => _accessEndpoints = value;
        }

        /// <summary>
        /// Version of the AppStream 2.0 agent to use for this image builder.
        /// </summary>
        [Input("appstreamAgentVersion")]
        public Input<string>? AppstreamAgentVersion { get; set; }

        /// <summary>
        /// ARN of the appstream image builder.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Date and time, in UTC and extended RFC 3339 format, when the image builder was created.
        /// </summary>
        [Input("createdTime")]
        public Input<string>? CreatedTime { get; set; }

        /// <summary>
        /// Description to display.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Human-readable friendly name for the AppStream image builder.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Configuration block for the name of the directory and organizational unit (OU) to use to join the image builder to a Microsoft Active Directory domain. See below.
        /// </summary>
        [Input("domainJoinInfo")]
        public Input<Inputs.ImageBuilderDomainJoinInfoGetArgs>? DomainJoinInfo { get; set; }

        /// <summary>
        /// Enables or disables default internet access for the image builder.
        /// </summary>
        [Input("enableDefaultInternetAccess")]
        public Input<bool>? EnableDefaultInternetAccess { get; set; }

        /// <summary>
        /// ARN of the IAM role to apply to the image builder.
        /// </summary>
        [Input("iamRoleArn")]
        public Input<string>? IamRoleArn { get; set; }

        /// <summary>
        /// ARN of the public, private, or shared image to use.
        /// </summary>
        [Input("imageArn")]
        public Input<string>? ImageArn { get; set; }

        /// <summary>
        /// Name of the image used to create the image builder.
        /// </summary>
        [Input("imageName")]
        public Input<string>? ImageName { get; set; }

        /// <summary>
        /// Instance type to use when launching the image builder.
        /// </summary>
        [Input("instanceType")]
        public Input<string>? InstanceType { get; set; }

        /// <summary>
        /// Unique name for the image builder.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// State of the image builder. Can be: `PENDING`, `UPDATING_AGENT`, `RUNNING`, `STOPPING`, `STOPPED`, `REBOOTING`, `SNAPSHOTTING`, `DELETING`, `FAILED`, `UPDATING`, `PENDING_QUALIFICATION`
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the instance. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// Configuration block for the VPC configuration for the image builder. See below.
        /// </summary>
        [Input("vpcConfig")]
        public Input<Inputs.ImageBuilderVpcConfigGetArgs>? VpcConfig { get; set; }

        public ImageBuilderState()
        {
        }
        public static new ImageBuilderState Empty => new ImageBuilderState();
    }
}
