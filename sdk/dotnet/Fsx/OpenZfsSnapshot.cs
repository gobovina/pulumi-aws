// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Fsx
{
    /// <summary>
    /// Manages an Amazon FSx for OpenZFS volume.
    /// See the [FSx OpenZFS User Guide](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/what-is-fsx.html) for more information.
    /// 
    /// ## Example Usage
    /// ### Root volume Example
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleOpenZfsFileSystem = new Aws.Fsx.OpenZfsFileSystem("example", new()
    ///     {
    ///         StorageCapacity = 64,
    ///         SubnetIds = exampleAwsSubnet.Id,
    ///         DeploymentType = "SINGLE_AZ_1",
    ///         ThroughputCapacity = 64,
    ///     });
    /// 
    ///     var example = new Aws.Fsx.OpenZfsSnapshot("example", new()
    ///     {
    ///         Name = "example",
    ///         VolumeId = exampleOpenZfsFileSystem.RootVolumeId,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Child volume Example
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleOpenZfsFileSystem = new Aws.Fsx.OpenZfsFileSystem("example", new()
    ///     {
    ///         StorageCapacity = 64,
    ///         SubnetIds = exampleAwsSubnet.Id,
    ///         DeploymentType = "SINGLE_AZ_1",
    ///         ThroughputCapacity = 64,
    ///     });
    /// 
    ///     var exampleOpenZfsVolume = new Aws.Fsx.OpenZfsVolume("example", new()
    ///     {
    ///         Name = "example",
    ///         ParentVolumeId = exampleOpenZfsFileSystem.RootVolumeId,
    ///     });
    /// 
    ///     var example = new Aws.Fsx.OpenZfsSnapshot("example", new()
    ///     {
    ///         Name = "example",
    ///         VolumeId = exampleOpenZfsVolume.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import FSx OpenZFS snapshot using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:fsx/openZfsSnapshot:OpenZfsSnapshot example fs-543ab12b1ca672f33
    /// ```
    /// </summary>
    [AwsResourceType("aws:fsx/openZfsSnapshot:OpenZfsSnapshot")]
    public partial class OpenZfsSnapshot : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name of the snapshot.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        [Output("creationTime")]
        public Output<string> CreationTime { get; private set; } = null!;

        /// <summary>
        /// The name of the Snapshot. You can use a maximum of 203 alphanumeric characters plus either _ or -  or : or . for the name.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The ID of the volume to snapshot. This can be the root volume or a child volume.
        /// </summary>
        [Output("volumeId")]
        public Output<string> VolumeId { get; private set; } = null!;


        /// <summary>
        /// Create a OpenZfsSnapshot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OpenZfsSnapshot(string name, OpenZfsSnapshotArgs args, CustomResourceOptions? options = null)
            : base("aws:fsx/openZfsSnapshot:OpenZfsSnapshot", name, args ?? new OpenZfsSnapshotArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OpenZfsSnapshot(string name, Input<string> id, OpenZfsSnapshotState? state = null, CustomResourceOptions? options = null)
            : base("aws:fsx/openZfsSnapshot:OpenZfsSnapshot", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OpenZfsSnapshot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OpenZfsSnapshot Get(string name, Input<string> id, OpenZfsSnapshotState? state = null, CustomResourceOptions? options = null)
        {
            return new OpenZfsSnapshot(name, id, state, options);
        }
    }

    public sealed class OpenZfsSnapshotArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the Snapshot. You can use a maximum of 203 alphanumeric characters plus either _ or -  or : or . for the name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The ID of the volume to snapshot. This can be the root volume or a child volume.
        /// </summary>
        [Input("volumeId", required: true)]
        public Input<string> VolumeId { get; set; } = null!;

        public OpenZfsSnapshotArgs()
        {
        }
        public static new OpenZfsSnapshotArgs Empty => new OpenZfsSnapshotArgs();
    }

    public sealed class OpenZfsSnapshotState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name of the snapshot.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("creationTime")]
        public Input<string>? CreationTime { get; set; }

        /// <summary>
        /// The name of the Snapshot. You can use a maximum of 203 alphanumeric characters plus either _ or -  or : or . for the name.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the file system. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level. If you have set `copy_tags_to_backups` to true, and you specify one or more tags, no existing file system tags are copied from the file system to the backup.
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

        /// <summary>
        /// The ID of the volume to snapshot. This can be the root volume or a child volume.
        /// </summary>
        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        public OpenZfsSnapshotState()
        {
        }
        public static new OpenZfsSnapshotState Empty => new OpenZfsSnapshotState();
    }
}
