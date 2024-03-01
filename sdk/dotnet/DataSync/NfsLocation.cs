// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DataSync
{
    /// <summary>
    /// Manages an NFS Location within AWS DataSync.
    /// 
    /// &gt; **NOTE:** The DataSync Agents must be available before creating this resource.
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
    ///     var example = new Aws.DataSync.NfsLocation("example", new()
    ///     {
    ///         ServerHostname = "nfs.example.com",
    ///         Subdirectory = "/exported/path",
    ///         OnPremConfig = new Aws.DataSync.Inputs.NfsLocationOnPremConfigArgs
    ///         {
    ///             AgentArns = new[]
    ///             {
    ///                 exampleAwsDatasyncAgent.Arn,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_datasync_location_nfs` using the DataSync Task Amazon Resource Name (ARN). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:datasync/nfsLocation:NfsLocation example arn:aws:datasync:us-east-1:123456789012:location/loc-12345678901234567
    /// ```
    /// </summary>
    [AwsResourceType("aws:datasync/nfsLocation:NfsLocation")]
    public partial class NfsLocation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the DataSync Location.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Configuration block containing mount options used by DataSync to access the NFS Server.
        /// </summary>
        [Output("mountOptions")]
        public Output<Outputs.NfsLocationMountOptions?> MountOptions { get; private set; } = null!;

        /// <summary>
        /// Configuration block containing information for connecting to the NFS File System.
        /// </summary>
        [Output("onPremConfig")]
        public Output<Outputs.NfsLocationOnPremConfig> OnPremConfig { get; private set; } = null!;

        /// <summary>
        /// Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
        /// </summary>
        [Output("serverHostname")]
        public Output<string> ServerHostname { get; private set; } = null!;

        /// <summary>
        /// Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
        /// </summary>
        [Output("subdirectory")]
        public Output<string> Subdirectory { get; private set; } = null!;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        [Output("uri")]
        public Output<string> Uri { get; private set; } = null!;


        /// <summary>
        /// Create a NfsLocation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public NfsLocation(string name, NfsLocationArgs args, CustomResourceOptions? options = null)
            : base("aws:datasync/nfsLocation:NfsLocation", name, args ?? new NfsLocationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private NfsLocation(string name, Input<string> id, NfsLocationState? state = null, CustomResourceOptions? options = null)
            : base("aws:datasync/nfsLocation:NfsLocation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing NfsLocation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static NfsLocation Get(string name, Input<string> id, NfsLocationState? state = null, CustomResourceOptions? options = null)
        {
            return new NfsLocation(name, id, state, options);
        }
    }

    public sealed class NfsLocationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Configuration block containing mount options used by DataSync to access the NFS Server.
        /// </summary>
        [Input("mountOptions")]
        public Input<Inputs.NfsLocationMountOptionsArgs>? MountOptions { get; set; }

        /// <summary>
        /// Configuration block containing information for connecting to the NFS File System.
        /// </summary>
        [Input("onPremConfig", required: true)]
        public Input<Inputs.NfsLocationOnPremConfigArgs> OnPremConfig { get; set; } = null!;

        /// <summary>
        /// Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
        /// </summary>
        [Input("serverHostname", required: true)]
        public Input<string> ServerHostname { get; set; } = null!;

        /// <summary>
        /// Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
        /// </summary>
        [Input("subdirectory", required: true)]
        public Input<string> Subdirectory { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public NfsLocationArgs()
        {
        }
        public static new NfsLocationArgs Empty => new NfsLocationArgs();
    }

    public sealed class NfsLocationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the DataSync Location.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Configuration block containing mount options used by DataSync to access the NFS Server.
        /// </summary>
        [Input("mountOptions")]
        public Input<Inputs.NfsLocationMountOptionsGetArgs>? MountOptions { get; set; }

        /// <summary>
        /// Configuration block containing information for connecting to the NFS File System.
        /// </summary>
        [Input("onPremConfig")]
        public Input<Inputs.NfsLocationOnPremConfigGetArgs>? OnPremConfig { get; set; }

        /// <summary>
        /// Specifies the IP address or DNS name of the NFS server. The DataSync Agent(s) use this to mount the NFS server.
        /// </summary>
        [Input("serverHostname")]
        public Input<string>? ServerHostname { get; set; }

        /// <summary>
        /// Subdirectory to perform actions as source or destination. Should be exported by the NFS server.
        /// </summary>
        [Input("subdirectory")]
        public Input<string>? Subdirectory { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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

        [Input("uri")]
        public Input<string>? Uri { get; set; }

        public NfsLocationState()
        {
        }
        public static new NfsLocationState Empty => new NfsLocationState();
    }
}
