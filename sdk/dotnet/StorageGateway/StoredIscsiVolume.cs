// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.StorageGateway
{
    /// <summary>
    /// Manages an AWS Storage Gateway stored iSCSI volume.
    /// 
    /// &gt; **NOTE:** The gateway must have a working storage added (e.g., via the `aws.storagegateway.WorkingStorage` resource) before the volume is operational to clients, however the Storage Gateway API will allow volume creation without error in that case and return volume status as `WORKING STORAGE NOT CONFIGURED`.
    /// 
    /// ## Example Usage
    /// ### Create Empty Stored iSCSI Volume
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.StorageGateway.StoredIscsiVolume("example", new()
    ///     {
    ///         GatewayArn = aws_storagegateway_cache.Example.Gateway_arn,
    ///         NetworkInterfaceId = aws_instance.Example.Private_ip,
    ///         TargetName = "example",
    ///         PreserveExistingData = false,
    ///         DiskId = data.Aws_storagegateway_local_disk.Test.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// ### Create Stored iSCSI Volume From Snapshot
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.StorageGateway.StoredIscsiVolume("example", new()
    ///     {
    ///         GatewayArn = aws_storagegateway_cache.Example.Gateway_arn,
    ///         NetworkInterfaceId = aws_instance.Example.Private_ip,
    ///         SnapshotId = aws_ebs_snapshot.Example.Id,
    ///         TargetName = "example",
    ///         PreserveExistingData = false,
    ///         DiskId = data.Aws_storagegateway_local_disk.Test.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_storagegateway_stored_iscsi_volume` using the volume Amazon Resource Name (ARN). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:storagegateway/storedIscsiVolume:StoredIscsiVolume example arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678
    /// ```
    /// </summary>
    [AwsResourceType("aws:storagegateway/storedIscsiVolume:StoredIscsiVolume")]
    public partial class StoredIscsiVolume : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Whether mutual CHAP is enabled for the iSCSI target.
        /// </summary>
        [Output("chapEnabled")]
        public Output<bool> ChapEnabled { get; private set; } = null!;

        /// <summary>
        /// The unique identifier for the gateway local disk that is configured as a stored volume.
        /// </summary>
        [Output("diskId")]
        public Output<string> DiskId { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the gateway.
        /// </summary>
        [Output("gatewayArn")]
        public Output<string> GatewayArn { get; private set; } = null!;

        /// <summary>
        /// `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
        /// </summary>
        [Output("kmsEncrypted")]
        public Output<bool?> KmsEncrypted { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is `true`.
        /// </summary>
        [Output("kmsKey")]
        public Output<string?> KmsKey { get; private set; } = null!;

        /// <summary>
        /// Logical disk number.
        /// </summary>
        [Output("lunNumber")]
        public Output<int> LunNumber { get; private set; } = null!;

        /// <summary>
        /// The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
        /// </summary>
        [Output("networkInterfaceId")]
        public Output<string> NetworkInterfaceId { get; private set; } = null!;

        /// <summary>
        /// The port used to communicate with iSCSI targets.
        /// </summary>
        [Output("networkInterfacePort")]
        public Output<int> NetworkInterfacePort { get; private set; } = null!;

        /// <summary>
        /// Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
        /// </summary>
        [Output("preserveExistingData")]
        public Output<bool> PreserveExistingData { get; private set; } = null!;

        /// <summary>
        /// The snapshot ID of the snapshot to restore as the new stored volumeE.g., `snap-1122aabb`.
        /// </summary>
        [Output("snapshotId")]
        public Output<string?> SnapshotId { get; private set; } = null!;

        /// <summary>
        /// Key-value mapping of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Target Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
        /// </summary>
        [Output("targetArn")]
        public Output<string> TargetArn { get; private set; } = null!;

        /// <summary>
        /// The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
        /// </summary>
        [Output("targetName")]
        public Output<string> TargetName { get; private set; } = null!;

        /// <summary>
        /// A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway.
        /// </summary>
        [Output("volumeAttachmentStatus")]
        public Output<string> VolumeAttachmentStatus { get; private set; } = null!;

        /// <summary>
        /// Volume ID, e.g., `vol-12345678`.
        /// </summary>
        [Output("volumeId")]
        public Output<string> VolumeId { get; private set; } = null!;

        /// <summary>
        /// The size of the data stored on the volume in bytes.
        /// </summary>
        [Output("volumeSizeInBytes")]
        public Output<int> VolumeSizeInBytes { get; private set; } = null!;

        /// <summary>
        /// indicates the state of the storage volume.
        /// </summary>
        [Output("volumeStatus")]
        public Output<string> VolumeStatus { get; private set; } = null!;

        /// <summary>
        /// indicates the type of the volume.
        /// </summary>
        [Output("volumeType")]
        public Output<string> VolumeType { get; private set; } = null!;


        /// <summary>
        /// Create a StoredIscsiVolume resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public StoredIscsiVolume(string name, StoredIscsiVolumeArgs args, CustomResourceOptions? options = null)
            : base("aws:storagegateway/storedIscsiVolume:StoredIscsiVolume", name, args ?? new StoredIscsiVolumeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private StoredIscsiVolume(string name, Input<string> id, StoredIscsiVolumeState? state = null, CustomResourceOptions? options = null)
            : base("aws:storagegateway/storedIscsiVolume:StoredIscsiVolume", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing StoredIscsiVolume resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static StoredIscsiVolume Get(string name, Input<string> id, StoredIscsiVolumeState? state = null, CustomResourceOptions? options = null)
        {
            return new StoredIscsiVolume(name, id, state, options);
        }
    }

    public sealed class StoredIscsiVolumeArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique identifier for the gateway local disk that is configured as a stored volume.
        /// </summary>
        [Input("diskId", required: true)]
        public Input<string> DiskId { get; set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) of the gateway.
        /// </summary>
        [Input("gatewayArn", required: true)]
        public Input<string> GatewayArn { get; set; } = null!;

        /// <summary>
        /// `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
        /// </summary>
        [Input("kmsEncrypted")]
        public Input<bool>? KmsEncrypted { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is `true`.
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        /// <summary>
        /// The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
        /// </summary>
        [Input("networkInterfaceId", required: true)]
        public Input<string> NetworkInterfaceId { get; set; } = null!;

        /// <summary>
        /// Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
        /// </summary>
        [Input("preserveExistingData", required: true)]
        public Input<bool> PreserveExistingData { get; set; } = null!;

        /// <summary>
        /// The snapshot ID of the snapshot to restore as the new stored volumeE.g., `snap-1122aabb`.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
        /// </summary>
        [Input("targetName", required: true)]
        public Input<string> TargetName { get; set; } = null!;

        public StoredIscsiVolumeArgs()
        {
        }
        public static new StoredIscsiVolumeArgs Empty => new StoredIscsiVolumeArgs();
    }

    public sealed class StoredIscsiVolumeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Volume Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/volume/vol-12345678`.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Whether mutual CHAP is enabled for the iSCSI target.
        /// </summary>
        [Input("chapEnabled")]
        public Input<bool>? ChapEnabled { get; set; }

        /// <summary>
        /// The unique identifier for the gateway local disk that is configured as a stored volume.
        /// </summary>
        [Input("diskId")]
        public Input<string>? DiskId { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the gateway.
        /// </summary>
        [Input("gatewayArn")]
        public Input<string>? GatewayArn { get; set; }

        /// <summary>
        /// `true` to use Amazon S3 server side encryption with your own AWS KMS key, or `false` to use a key managed by Amazon S3. Optional.
        /// </summary>
        [Input("kmsEncrypted")]
        public Input<bool>? KmsEncrypted { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) of the AWS KMS key used for Amazon S3 server side encryption. This value can only be set when `kms_encrypted` is `true`.
        /// </summary>
        [Input("kmsKey")]
        public Input<string>? KmsKey { get; set; }

        /// <summary>
        /// Logical disk number.
        /// </summary>
        [Input("lunNumber")]
        public Input<int>? LunNumber { get; set; }

        /// <summary>
        /// The network interface of the gateway on which to expose the iSCSI target. Only IPv4 addresses are accepted.
        /// </summary>
        [Input("networkInterfaceId")]
        public Input<string>? NetworkInterfaceId { get; set; }

        /// <summary>
        /// The port used to communicate with iSCSI targets.
        /// </summary>
        [Input("networkInterfacePort")]
        public Input<int>? NetworkInterfacePort { get; set; }

        /// <summary>
        /// Specify this field as `true` if you want to preserve the data on the local disk. Otherwise, specifying this field as false creates an empty volume.
        /// </summary>
        [Input("preserveExistingData")]
        public Input<bool>? PreserveExistingData { get; set; }

        /// <summary>
        /// The snapshot ID of the snapshot to restore as the new stored volumeE.g., `snap-1122aabb`.
        /// </summary>
        [Input("snapshotId")]
        public Input<string>? SnapshotId { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value mapping of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Target Amazon Resource Name (ARN), e.g., `arn:aws:storagegateway:us-east-1:123456789012:gateway/sgw-12345678/target/iqn.1997-05.com.amazon:TargetName`.
        /// </summary>
        [Input("targetArn")]
        public Input<string>? TargetArn { get; set; }

        /// <summary>
        /// The name of the iSCSI target used by initiators to connect to the target and as a suffix for the target ARN. The target name must be unique across all volumes of a gateway.
        /// </summary>
        [Input("targetName")]
        public Input<string>? TargetName { get; set; }

        /// <summary>
        /// A value that indicates whether a storage volume is attached to, detached from, or is in the process of detaching from a gateway.
        /// </summary>
        [Input("volumeAttachmentStatus")]
        public Input<string>? VolumeAttachmentStatus { get; set; }

        /// <summary>
        /// Volume ID, e.g., `vol-12345678`.
        /// </summary>
        [Input("volumeId")]
        public Input<string>? VolumeId { get; set; }

        /// <summary>
        /// The size of the data stored on the volume in bytes.
        /// </summary>
        [Input("volumeSizeInBytes")]
        public Input<int>? VolumeSizeInBytes { get; set; }

        /// <summary>
        /// indicates the state of the storage volume.
        /// </summary>
        [Input("volumeStatus")]
        public Input<string>? VolumeStatus { get; set; }

        /// <summary>
        /// indicates the type of the volume.
        /// </summary>
        [Input("volumeType")]
        public Input<string>? VolumeType { get; set; }

        public StoredIscsiVolumeState()
        {
        }
        public static new StoredIscsiVolumeState Empty => new StoredIscsiVolumeState();
    }
}
