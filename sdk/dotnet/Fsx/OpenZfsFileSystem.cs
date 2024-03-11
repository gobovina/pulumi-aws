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
    /// Manages an Amazon FSx for OpenZFS file system.
    /// See the [FSx OpenZFS User Guide](https://docs.aws.amazon.com/fsx/latest/OpenZFSGuide/what-is-fsx.html) for more information.
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
    ///     var test = new Aws.Fsx.OpenZfsFileSystem("test", new()
    ///     {
    ///         StorageCapacity = 64,
    ///         SubnetIds = test1.Id,
    ///         DeploymentType = "SINGLE_AZ_1",
    ///         ThroughputCapacity = 64,
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import FSx File Systems using the `id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:fsx/openZfsFileSystem:OpenZfsFileSystem example fs-543ab12b1ca672f33
    /// ```
    /// Certain resource arguments, like `security_group_ids`, do not have a FSx API method for reading the information after creation. If the argument is set in the Pulumi program on an imported resource, Pulumi will always show a difference. To workaround this behavior, either omit the argument from the Pulumi program or use `ignore_changes` to hide the difference. For example:
    /// </summary>
    [AwsResourceType("aws:fsx/openZfsFileSystem:OpenZfsFileSystem")]
    public partial class OpenZfsFileSystem : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name of the file system.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
        /// </summary>
        [Output("automaticBackupRetentionDays")]
        public Output<int?> AutomaticBackupRetentionDays { get; private set; } = null!;

        /// <summary>
        /// The ID of the source backup to create the filesystem from.
        /// </summary>
        [Output("backupId")]
        public Output<string?> BackupId { get; private set; } = null!;

        /// <summary>
        /// A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false.
        /// </summary>
        [Output("copyTagsToBackups")]
        public Output<bool?> CopyTagsToBackups { get; private set; } = null!;

        /// <summary>
        /// A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
        /// </summary>
        [Output("copyTagsToVolumes")]
        public Output<bool?> CopyTagsToVolumes { get; private set; } = null!;

        /// <summary>
        /// A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
        /// </summary>
        [Output("dailyAutomaticBackupStartTime")]
        public Output<string> DailyAutomaticBackupStartTime { get; private set; } = null!;

        /// <summary>
        /// The filesystem deployment type. Valid values: `SINGLE_AZ_1`, `SINGLE_AZ_2` and `MULTI_AZ_1`.
        /// </summary>
        [Output("deploymentType")]
        public Output<string> DeploymentType { get; private set; } = null!;

        /// <summary>
        /// The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See Disk Iops Configuration below.
        /// </summary>
        [Output("diskIopsConfiguration")]
        public Output<Outputs.OpenZfsFileSystemDiskIopsConfiguration> DiskIopsConfiguration { get; private set; } = null!;

        /// <summary>
        /// DNS name for the file system, e.g., `fs-12345678.fsx.us-west-2.amazonaws.com`
        /// </summary>
        [Output("dnsName")]
        public Output<string> DnsName { get; private set; } = null!;

        /// <summary>
        /// (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be created.
        /// </summary>
        [Output("endpointIpAddressRange")]
        public Output<string> EndpointIpAddressRange { get; private set; } = null!;

        /// <summary>
        /// ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// Set of Elastic Network Interface identifiers from which the file system is accessible The first network interface returned is the primary network interface.
        /// </summary>
        [Output("networkInterfaceIds")]
        public Output<ImmutableArray<string>> NetworkInterfaceIds { get; private set; } = null!;

        /// <summary>
        /// AWS account identifier that created the file system.
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// (Multi-AZ only) Required when `deployment_type` is set to `MULTI_AZ_1`. This specifies the subnet in which you want the preferred file server to be located.
        /// </summary>
        [Output("preferredSubnetId")]
        public Output<string?> PreferredSubnetId { get; private set; } = null!;

        /// <summary>
        /// The configuration for the root volume of the file system. All other volumes are children or the root volume. See Root Volume Configuration below.
        /// </summary>
        [Output("rootVolumeConfiguration")]
        public Output<Outputs.OpenZfsFileSystemRootVolumeConfiguration> RootVolumeConfiguration { get; private set; } = null!;

        /// <summary>
        /// Identifier of the root volume, e.g., `fsvol-12345678`
        /// </summary>
        [Output("rootVolumeId")]
        public Output<string> RootVolumeId { get; private set; } = null!;

        /// <summary>
        /// (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to the correct file server. You should specify all virtual private cloud (VPC) route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
        /// </summary>
        [Output("routeTableIds")]
        public Output<ImmutableArray<string>> RouteTableIds { get; private set; } = null!;

        /// <summary>
        /// A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// When enabled, will skip the default final backup taken when the file system is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
        /// </summary>
        [Output("skipFinalBackup")]
        public Output<bool?> SkipFinalBackup { get; private set; } = null!;

        /// <summary>
        /// The storage capacity (GiB) of the file system. Valid values between `64` and `524288`.
        /// </summary>
        [Output("storageCapacity")]
        public Output<int?> StorageCapacity { get; private set; } = null!;

        /// <summary>
        /// The filesystem storage type. Only `SSD` is supported.
        /// </summary>
        [Output("storageType")]
        public Output<string?> StorageType { get; private set; } = null!;

        /// <summary>
        /// A list of IDs for the subnets that the file system will be accessible from.
        /// </summary>
        [Output("subnetIds")]
        public Output<string> SubnetIds { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the file system. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Throughput (MB/s) of the file system. Valid values depend on `deployment_type`. Must be one of `64`, `128`, `256`, `512`, `1024`, `2048`, `3072`, `4096` for `SINGLE_AZ_1`. Must be one of `160`, `320`, `640`, `1280`, `2560`, `3840`, `5120`, `7680`, `10240` for `SINGLE_AZ_2`.
        /// </summary>
        [Output("throughputCapacity")]
        public Output<int> ThroughputCapacity { get; private set; } = null!;

        /// <summary>
        /// Identifier of the Virtual Private Cloud for the file system.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;

        /// <summary>
        /// The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
        /// </summary>
        [Output("weeklyMaintenanceStartTime")]
        public Output<string> WeeklyMaintenanceStartTime { get; private set; } = null!;


        /// <summary>
        /// Create a OpenZfsFileSystem resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OpenZfsFileSystem(string name, OpenZfsFileSystemArgs args, CustomResourceOptions? options = null)
            : base("aws:fsx/openZfsFileSystem:OpenZfsFileSystem", name, args ?? new OpenZfsFileSystemArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OpenZfsFileSystem(string name, Input<string> id, OpenZfsFileSystemState? state = null, CustomResourceOptions? options = null)
            : base("aws:fsx/openZfsFileSystem:OpenZfsFileSystem", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing OpenZfsFileSystem resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OpenZfsFileSystem Get(string name, Input<string> id, OpenZfsFileSystemState? state = null, CustomResourceOptions? options = null)
        {
            return new OpenZfsFileSystem(name, id, state, options);
        }
    }

    public sealed class OpenZfsFileSystemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
        /// </summary>
        [Input("automaticBackupRetentionDays")]
        public Input<int>? AutomaticBackupRetentionDays { get; set; }

        /// <summary>
        /// The ID of the source backup to create the filesystem from.
        /// </summary>
        [Input("backupId")]
        public Input<string>? BackupId { get; set; }

        /// <summary>
        /// A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false.
        /// </summary>
        [Input("copyTagsToBackups")]
        public Input<bool>? CopyTagsToBackups { get; set; }

        /// <summary>
        /// A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
        /// </summary>
        [Input("copyTagsToVolumes")]
        public Input<bool>? CopyTagsToVolumes { get; set; }

        /// <summary>
        /// A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
        /// </summary>
        [Input("dailyAutomaticBackupStartTime")]
        public Input<string>? DailyAutomaticBackupStartTime { get; set; }

        /// <summary>
        /// The filesystem deployment type. Valid values: `SINGLE_AZ_1`, `SINGLE_AZ_2` and `MULTI_AZ_1`.
        /// </summary>
        [Input("deploymentType", required: true)]
        public Input<string> DeploymentType { get; set; } = null!;

        /// <summary>
        /// The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See Disk Iops Configuration below.
        /// </summary>
        [Input("diskIopsConfiguration")]
        public Input<Inputs.OpenZfsFileSystemDiskIopsConfigurationArgs>? DiskIopsConfiguration { get; set; }

        /// <summary>
        /// (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be created.
        /// </summary>
        [Input("endpointIpAddressRange")]
        public Input<string>? EndpointIpAddressRange { get; set; }

        /// <summary>
        /// ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// (Multi-AZ only) Required when `deployment_type` is set to `MULTI_AZ_1`. This specifies the subnet in which you want the preferred file server to be located.
        /// </summary>
        [Input("preferredSubnetId")]
        public Input<string>? PreferredSubnetId { get; set; }

        /// <summary>
        /// The configuration for the root volume of the file system. All other volumes are children or the root volume. See Root Volume Configuration below.
        /// </summary>
        [Input("rootVolumeConfiguration")]
        public Input<Inputs.OpenZfsFileSystemRootVolumeConfigurationArgs>? RootVolumeConfiguration { get; set; }

        [Input("routeTableIds")]
        private InputList<string>? _routeTableIds;

        /// <summary>
        /// (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to the correct file server. You should specify all virtual private cloud (VPC) route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
        /// </summary>
        public InputList<string> RouteTableIds
        {
            get => _routeTableIds ?? (_routeTableIds = new InputList<string>());
            set => _routeTableIds = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// When enabled, will skip the default final backup taken when the file system is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
        /// </summary>
        [Input("skipFinalBackup")]
        public Input<bool>? SkipFinalBackup { get; set; }

        /// <summary>
        /// The storage capacity (GiB) of the file system. Valid values between `64` and `524288`.
        /// </summary>
        [Input("storageCapacity")]
        public Input<int>? StorageCapacity { get; set; }

        /// <summary>
        /// The filesystem storage type. Only `SSD` is supported.
        /// </summary>
        [Input("storageType")]
        public Input<string>? StorageType { get; set; }

        /// <summary>
        /// A list of IDs for the subnets that the file system will be accessible from.
        /// </summary>
        [Input("subnetIds", required: true)]
        public Input<string> SubnetIds { get; set; } = null!;

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the file system. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Throughput (MB/s) of the file system. Valid values depend on `deployment_type`. Must be one of `64`, `128`, `256`, `512`, `1024`, `2048`, `3072`, `4096` for `SINGLE_AZ_1`. Must be one of `160`, `320`, `640`, `1280`, `2560`, `3840`, `5120`, `7680`, `10240` for `SINGLE_AZ_2`.
        /// </summary>
        [Input("throughputCapacity", required: true)]
        public Input<int> ThroughputCapacity { get; set; } = null!;

        /// <summary>
        /// The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
        /// </summary>
        [Input("weeklyMaintenanceStartTime")]
        public Input<string>? WeeklyMaintenanceStartTime { get; set; }

        public OpenZfsFileSystemArgs()
        {
        }
        public static new OpenZfsFileSystemArgs Empty => new OpenZfsFileSystemArgs();
    }

    public sealed class OpenZfsFileSystemState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name of the file system.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
        /// </summary>
        [Input("automaticBackupRetentionDays")]
        public Input<int>? AutomaticBackupRetentionDays { get; set; }

        /// <summary>
        /// The ID of the source backup to create the filesystem from.
        /// </summary>
        [Input("backupId")]
        public Input<string>? BackupId { get; set; }

        /// <summary>
        /// A boolean flag indicating whether tags for the file system should be copied to backups. The default value is false.
        /// </summary>
        [Input("copyTagsToBackups")]
        public Input<bool>? CopyTagsToBackups { get; set; }

        /// <summary>
        /// A boolean flag indicating whether tags for the file system should be copied to snapshots. The default value is false.
        /// </summary>
        [Input("copyTagsToVolumes")]
        public Input<bool>? CopyTagsToVolumes { get; set; }

        /// <summary>
        /// A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
        /// </summary>
        [Input("dailyAutomaticBackupStartTime")]
        public Input<string>? DailyAutomaticBackupStartTime { get; set; }

        /// <summary>
        /// The filesystem deployment type. Valid values: `SINGLE_AZ_1`, `SINGLE_AZ_2` and `MULTI_AZ_1`.
        /// </summary>
        [Input("deploymentType")]
        public Input<string>? DeploymentType { get; set; }

        /// <summary>
        /// The SSD IOPS configuration for the Amazon FSx for OpenZFS file system. See Disk Iops Configuration below.
        /// </summary>
        [Input("diskIopsConfiguration")]
        public Input<Inputs.OpenZfsFileSystemDiskIopsConfigurationGetArgs>? DiskIopsConfiguration { get; set; }

        /// <summary>
        /// DNS name for the file system, e.g., `fs-12345678.fsx.us-west-2.amazonaws.com`
        /// </summary>
        [Input("dnsName")]
        public Input<string>? DnsName { get; set; }

        /// <summary>
        /// (Multi-AZ only) Specifies the IP address range in which the endpoints to access your file system will be created.
        /// </summary>
        [Input("endpointIpAddressRange")]
        public Input<string>? EndpointIpAddressRange { get; set; }

        /// <summary>
        /// ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        [Input("networkInterfaceIds")]
        private InputList<string>? _networkInterfaceIds;

        /// <summary>
        /// Set of Elastic Network Interface identifiers from which the file system is accessible The first network interface returned is the primary network interface.
        /// </summary>
        public InputList<string> NetworkInterfaceIds
        {
            get => _networkInterfaceIds ?? (_networkInterfaceIds = new InputList<string>());
            set => _networkInterfaceIds = value;
        }

        /// <summary>
        /// AWS account identifier that created the file system.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        /// <summary>
        /// (Multi-AZ only) Required when `deployment_type` is set to `MULTI_AZ_1`. This specifies the subnet in which you want the preferred file server to be located.
        /// </summary>
        [Input("preferredSubnetId")]
        public Input<string>? PreferredSubnetId { get; set; }

        /// <summary>
        /// The configuration for the root volume of the file system. All other volumes are children or the root volume. See Root Volume Configuration below.
        /// </summary>
        [Input("rootVolumeConfiguration")]
        public Input<Inputs.OpenZfsFileSystemRootVolumeConfigurationGetArgs>? RootVolumeConfiguration { get; set; }

        /// <summary>
        /// Identifier of the root volume, e.g., `fsvol-12345678`
        /// </summary>
        [Input("rootVolumeId")]
        public Input<string>? RootVolumeId { get; set; }

        [Input("routeTableIds")]
        private InputList<string>? _routeTableIds;

        /// <summary>
        /// (Multi-AZ only) Specifies the route tables in which Amazon FSx creates the rules for routing traffic to the correct file server. You should specify all virtual private cloud (VPC) route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
        /// </summary>
        public InputList<string> RouteTableIds
        {
            get => _routeTableIds ?? (_routeTableIds = new InputList<string>());
            set => _routeTableIds = value;
        }

        [Input("securityGroupIds")]
        private InputList<string>? _securityGroupIds;

        /// <summary>
        /// A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
        /// </summary>
        public InputList<string> SecurityGroupIds
        {
            get => _securityGroupIds ?? (_securityGroupIds = new InputList<string>());
            set => _securityGroupIds = value;
        }

        /// <summary>
        /// When enabled, will skip the default final backup taken when the file system is deleted. This configuration must be applied separately before attempting to delete the resource to have the desired behavior. Defaults to `false`.
        /// </summary>
        [Input("skipFinalBackup")]
        public Input<bool>? SkipFinalBackup { get; set; }

        /// <summary>
        /// The storage capacity (GiB) of the file system. Valid values between `64` and `524288`.
        /// </summary>
        [Input("storageCapacity")]
        public Input<int>? StorageCapacity { get; set; }

        /// <summary>
        /// The filesystem storage type. Only `SSD` is supported.
        /// </summary>
        [Input("storageType")]
        public Input<string>? StorageType { get; set; }

        /// <summary>
        /// A list of IDs for the subnets that the file system will be accessible from.
        /// </summary>
        [Input("subnetIds")]
        public Input<string>? SubnetIds { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the file system. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// Throughput (MB/s) of the file system. Valid values depend on `deployment_type`. Must be one of `64`, `128`, `256`, `512`, `1024`, `2048`, `3072`, `4096` for `SINGLE_AZ_1`. Must be one of `160`, `320`, `640`, `1280`, `2560`, `3840`, `5120`, `7680`, `10240` for `SINGLE_AZ_2`.
        /// </summary>
        [Input("throughputCapacity")]
        public Input<int>? ThroughputCapacity { get; set; }

        /// <summary>
        /// Identifier of the Virtual Private Cloud for the file system.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        /// <summary>
        /// The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
        /// </summary>
        [Input("weeklyMaintenanceStartTime")]
        public Input<string>? WeeklyMaintenanceStartTime { get; set; }

        public OpenZfsFileSystemState()
        {
        }
        public static new OpenZfsFileSystemState Empty => new OpenZfsFileSystemState();
    }
}
