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
    /// Manages an Amazon FSx for NetApp ONTAP file system.
    /// See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/what-is-fsx-ontap.html) for more information.
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
    ///     var test = new Aws.Fsx.OntapFileSystem("test", new()
    ///     {
    ///         StorageCapacity = 1024,
    ///         SubnetIds = new[]
    ///         {
    ///             aws_subnet.Test1.Id,
    ///             aws_subnet.Test2.Id,
    ///         },
    ///         DeploymentType = "MULTI_AZ_1",
    ///         ThroughputCapacity = 512,
    ///         PreferredSubnetId = aws_subnet.Test1.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import FSx File Systems using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:fsx/ontapFileSystem:OntapFileSystem example fs-543ab12b1ca672f33
    /// ```
    ///  Certain resource arguments, like `security_group_ids`, do not have a FSx API method for reading the information after creation. If the argument is set in the TODO configuration on an imported resource, TODO will always show a difference. To workaround this behavior, either omit the argument from the TODO configuration or use `ignore_changes` to hide the difference. For example:
    /// </summary>
    [AwsResourceType("aws:fsx/ontapFileSystem:OntapFileSystem")]
    public partial class OntapFileSystem : global::Pulumi.CustomResource
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
        /// A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
        /// </summary>
        [Output("dailyAutomaticBackupStartTime")]
        public Output<string> DailyAutomaticBackupStartTime { get; private set; } = null!;

        /// <summary>
        /// The filesystem deployment type. Supports `MULTI_AZ_1` and `SINGLE_AZ_1`.
        /// </summary>
        [Output("deploymentType")]
        public Output<string> DeploymentType { get; private set; } = null!;

        /// <summary>
        /// The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration Below.
        /// </summary>
        [Output("diskIopsConfiguration")]
        public Output<Outputs.OntapFileSystemDiskIopsConfiguration> DiskIopsConfiguration { get; private set; } = null!;

        /// <summary>
        /// The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
        /// </summary>
        [Output("dnsName")]
        public Output<string> DnsName { get; private set; } = null!;

        /// <summary>
        /// Specifies the IP address range in which the endpoints to access your file system will be created. By default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
        /// </summary>
        [Output("endpointIpAddressRange")]
        public Output<string> EndpointIpAddressRange { get; private set; } = null!;

        /// <summary>
        /// The endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
        /// </summary>
        [Output("endpoints")]
        public Output<ImmutableArray<Outputs.OntapFileSystemEndpoint>> Endpoints { get; private set; } = null!;

        /// <summary>
        /// The ONTAP administrative password for the fsxadmin user that you can use to administer your file system using the ONTAP CLI and REST API.
        /// </summary>
        [Output("fsxAdminPassword")]
        public Output<string?> FsxAdminPassword { get; private set; } = null!;

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
        /// The ID for a subnet. A subnet is a range of IP addresses in your virtual private cloud (VPC).
        /// </summary>
        [Output("preferredSubnetId")]
        public Output<string> PreferredSubnetId { get; private set; } = null!;

        /// <summary>
        /// Specifies the VPC route tables in which your file system's endpoints will be created. You should specify all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
        /// </summary>
        [Output("routeTableIds")]
        public Output<ImmutableArray<string>> RouteTableIds { get; private set; } = null!;

        /// <summary>
        /// A list of IDs for the security groups that apply to the specified network interfaces created for file system access. These security groups will apply to all network interfaces.
        /// </summary>
        [Output("securityGroupIds")]
        public Output<ImmutableArray<string>> SecurityGroupIds { get; private set; } = null!;

        /// <summary>
        /// The storage capacity (GiB) of the file system. Valid values between `1024` and `196608`.
        /// </summary>
        [Output("storageCapacity")]
        public Output<int?> StorageCapacity { get; private set; } = null!;

        /// <summary>
        /// The filesystem storage type. defaults to `SSD`.
        /// </summary>
        [Output("storageType")]
        public Output<string?> StorageType { get; private set; } = null!;

        /// <summary>
        /// A list of IDs for the subnets that the file system will be accessible from. Upto 2 subnets can be provided.
        /// </summary>
        [Output("subnetIds")]
        public Output<ImmutableArray<string>> SubnetIds { get; private set; } = null!;

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
        /// Sets the throughput capacity (in MBps) for the file system that you're creating. Valid values are `128`, `256`, `512`, `1024`, `2048`, and `4096`.
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
        /// Create a OntapFileSystem resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public OntapFileSystem(string name, OntapFileSystemArgs args, CustomResourceOptions? options = null)
            : base("aws:fsx/ontapFileSystem:OntapFileSystem", name, args ?? new OntapFileSystemArgs(), MakeResourceOptions(options, ""))
        {
        }

        private OntapFileSystem(string name, Input<string> id, OntapFileSystemState? state = null, CustomResourceOptions? options = null)
            : base("aws:fsx/ontapFileSystem:OntapFileSystem", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "fsxAdminPassword",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing OntapFileSystem resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static OntapFileSystem Get(string name, Input<string> id, OntapFileSystemState? state = null, CustomResourceOptions? options = null)
        {
            return new OntapFileSystem(name, id, state, options);
        }
    }

    public sealed class OntapFileSystemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The number of days to retain automatic backups. Setting this to 0 disables automatic backups. You can retain automatic backups for a maximum of 90 days.
        /// </summary>
        [Input("automaticBackupRetentionDays")]
        public Input<int>? AutomaticBackupRetentionDays { get; set; }

        /// <summary>
        /// A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
        /// </summary>
        [Input("dailyAutomaticBackupStartTime")]
        public Input<string>? DailyAutomaticBackupStartTime { get; set; }

        /// <summary>
        /// The filesystem deployment type. Supports `MULTI_AZ_1` and `SINGLE_AZ_1`.
        /// </summary>
        [Input("deploymentType", required: true)]
        public Input<string> DeploymentType { get; set; } = null!;

        /// <summary>
        /// The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration Below.
        /// </summary>
        [Input("diskIopsConfiguration")]
        public Input<Inputs.OntapFileSystemDiskIopsConfigurationArgs>? DiskIopsConfiguration { get; set; }

        /// <summary>
        /// Specifies the IP address range in which the endpoints to access your file system will be created. By default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
        /// </summary>
        [Input("endpointIpAddressRange")]
        public Input<string>? EndpointIpAddressRange { get; set; }

        [Input("fsxAdminPassword")]
        private Input<string>? _fsxAdminPassword;

        /// <summary>
        /// The ONTAP administrative password for the fsxadmin user that you can use to administer your file system using the ONTAP CLI and REST API.
        /// </summary>
        public Input<string>? FsxAdminPassword
        {
            get => _fsxAdminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _fsxAdminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// ARN for the KMS Key to encrypt the file system at rest, Defaults to an AWS managed KMS Key.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// The ID for a subnet. A subnet is a range of IP addresses in your virtual private cloud (VPC).
        /// </summary>
        [Input("preferredSubnetId", required: true)]
        public Input<string> PreferredSubnetId { get; set; } = null!;

        [Input("routeTableIds")]
        private InputList<string>? _routeTableIds;

        /// <summary>
        /// Specifies the VPC route tables in which your file system's endpoints will be created. You should specify all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
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
        /// The storage capacity (GiB) of the file system. Valid values between `1024` and `196608`.
        /// </summary>
        [Input("storageCapacity")]
        public Input<int>? StorageCapacity { get; set; }

        /// <summary>
        /// The filesystem storage type. defaults to `SSD`.
        /// </summary>
        [Input("storageType")]
        public Input<string>? StorageType { get; set; }

        [Input("subnetIds", required: true)]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A list of IDs for the subnets that the file system will be accessible from. Upto 2 subnets can be provided.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

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
        /// Sets the throughput capacity (in MBps) for the file system that you're creating. Valid values are `128`, `256`, `512`, `1024`, `2048`, and `4096`.
        /// </summary>
        [Input("throughputCapacity", required: true)]
        public Input<int> ThroughputCapacity { get; set; } = null!;

        /// <summary>
        /// The preferred start time (in `d:HH:MM` format) to perform weekly maintenance, in the UTC time zone.
        /// </summary>
        [Input("weeklyMaintenanceStartTime")]
        public Input<string>? WeeklyMaintenanceStartTime { get; set; }

        public OntapFileSystemArgs()
        {
        }
        public static new OntapFileSystemArgs Empty => new OntapFileSystemArgs();
    }

    public sealed class OntapFileSystemState : global::Pulumi.ResourceArgs
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
        /// A recurring daily time, in the format HH:MM. HH is the zero-padded hour of the day (0-23), and MM is the zero-padded minute of the hour. For example, 05:00 specifies 5 AM daily. Requires `automatic_backup_retention_days` to be set.
        /// </summary>
        [Input("dailyAutomaticBackupStartTime")]
        public Input<string>? DailyAutomaticBackupStartTime { get; set; }

        /// <summary>
        /// The filesystem deployment type. Supports `MULTI_AZ_1` and `SINGLE_AZ_1`.
        /// </summary>
        [Input("deploymentType")]
        public Input<string>? DeploymentType { get; set; }

        /// <summary>
        /// The SSD IOPS configuration for the Amazon FSx for NetApp ONTAP file system. See Disk Iops Configuration Below.
        /// </summary>
        [Input("diskIopsConfiguration")]
        public Input<Inputs.OntapFileSystemDiskIopsConfigurationGetArgs>? DiskIopsConfiguration { get; set; }

        /// <summary>
        /// The Domain Name Service (DNS) name for the file system. You can mount your file system using its DNS name.
        /// </summary>
        [Input("dnsName")]
        public Input<string>? DnsName { get; set; }

        /// <summary>
        /// Specifies the IP address range in which the endpoints to access your file system will be created. By default, Amazon FSx selects an unused IP address range for you from the 198.19.* range.
        /// </summary>
        [Input("endpointIpAddressRange")]
        public Input<string>? EndpointIpAddressRange { get; set; }

        [Input("endpoints")]
        private InputList<Inputs.OntapFileSystemEndpointGetArgs>? _endpoints;

        /// <summary>
        /// The endpoints that are used to access data or to manage the file system using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
        /// </summary>
        public InputList<Inputs.OntapFileSystemEndpointGetArgs> Endpoints
        {
            get => _endpoints ?? (_endpoints = new InputList<Inputs.OntapFileSystemEndpointGetArgs>());
            set => _endpoints = value;
        }

        [Input("fsxAdminPassword")]
        private Input<string>? _fsxAdminPassword;

        /// <summary>
        /// The ONTAP administrative password for the fsxadmin user that you can use to administer your file system using the ONTAP CLI and REST API.
        /// </summary>
        public Input<string>? FsxAdminPassword
        {
            get => _fsxAdminPassword;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _fsxAdminPassword = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

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
        /// The ID for a subnet. A subnet is a range of IP addresses in your virtual private cloud (VPC).
        /// </summary>
        [Input("preferredSubnetId")]
        public Input<string>? PreferredSubnetId { get; set; }

        [Input("routeTableIds")]
        private InputList<string>? _routeTableIds;

        /// <summary>
        /// Specifies the VPC route tables in which your file system's endpoints will be created. You should specify all VPC route tables associated with the subnets in which your clients are located. By default, Amazon FSx selects your VPC's default route table.
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
        /// The storage capacity (GiB) of the file system. Valid values between `1024` and `196608`.
        /// </summary>
        [Input("storageCapacity")]
        public Input<int>? StorageCapacity { get; set; }

        /// <summary>
        /// The filesystem storage type. defaults to `SSD`.
        /// </summary>
        [Input("storageType")]
        public Input<string>? StorageType { get; set; }

        [Input("subnetIds")]
        private InputList<string>? _subnetIds;

        /// <summary>
        /// A list of IDs for the subnets that the file system will be accessible from. Upto 2 subnets can be provided.
        /// </summary>
        public InputList<string> SubnetIds
        {
            get => _subnetIds ?? (_subnetIds = new InputList<string>());
            set => _subnetIds = value;
        }

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
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Sets the throughput capacity (in MBps) for the file system that you're creating. Valid values are `128`, `256`, `512`, `1024`, `2048`, and `4096`.
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

        public OntapFileSystemState()
        {
        }
        public static new OntapFileSystemState Empty => new OntapFileSystemState();
    }
}
