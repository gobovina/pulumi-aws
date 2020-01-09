// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2
{
    public static partial class Invokes
    {
        /// <summary>
        /// Provides information about a Launch Configuration.
        /// 
        /// &gt; This content is derived from https://github.com/terraform-providers/terraform-provider-aws/blob/master/website/docs/d/launch_configuration.html.markdown.
        /// </summary>
        public static Task<GetLaunchConfigurationResult> GetLaunchConfiguration(GetLaunchConfigurationArgs args, InvokeOptions? options = null)
            => Pulumi.Deployment.Instance.InvokeAsync<GetLaunchConfigurationResult>("aws:ec2/getLaunchConfiguration:getLaunchConfiguration", args ?? InvokeArgs.Empty, options.WithVersion());
    }

    public sealed class GetLaunchConfigurationArgs : Pulumi.InvokeArgs
    {
        /// <summary>
        /// The name of the launch configuration.
        /// </summary>
        [Input("name", required: true)]
        public string Name { get; set; } = null!;

        public GetLaunchConfigurationArgs()
        {
        }
    }

    [OutputType]
    public sealed class GetLaunchConfigurationResult
    {
        /// <summary>
        /// The Amazon Resource Name of the launch configuration.
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// Whether a Public IP address is associated with the instance.
        /// </summary>
        public readonly bool AssociatePublicIpAddress;
        /// <summary>
        /// The EBS Block Devices attached to the instance.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLaunchConfigurationEbsBlockDevicesResult> EbsBlockDevices;
        /// <summary>
        /// Whether the launched EC2 instance will be EBS-optimized.
        /// </summary>
        public readonly bool EbsOptimized;
        /// <summary>
        /// Whether Detailed Monitoring is Enabled.
        /// </summary>
        public readonly bool EnableMonitoring;
        /// <summary>
        /// The Ephemeral volumes on the instance.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLaunchConfigurationEphemeralBlockDevicesResult> EphemeralBlockDevices;
        /// <summary>
        /// The IAM Instance Profile to associate with launched instances.
        /// </summary>
        public readonly string IamInstanceProfile;
        /// <summary>
        /// The EC2 Image ID of the instance.
        /// </summary>
        public readonly string ImageId;
        /// <summary>
        /// The Instance Type of the instance to launch.
        /// </summary>
        public readonly string InstanceType;
        /// <summary>
        /// The Key Name that should be used for the instance.
        /// </summary>
        public readonly string KeyName;
        /// <summary>
        /// The Name of the launch configuration.
        /// </summary>
        public readonly string Name;
        /// <summary>
        /// The Tenancy of the instance.
        /// </summary>
        public readonly string PlacementTenancy;
        /// <summary>
        /// The Root Block Device of the instance.
        /// </summary>
        public readonly ImmutableArray<Outputs.GetLaunchConfigurationRootBlockDevicesResult> RootBlockDevices;
        /// <summary>
        /// A list of associated Security Group IDS.
        /// </summary>
        public readonly ImmutableArray<string> SecurityGroups;
        /// <summary>
        /// The Price to use for reserving Spot instances.
        /// </summary>
        public readonly string SpotPrice;
        /// <summary>
        /// The User Data of the instance.
        /// </summary>
        public readonly string UserData;
        /// <summary>
        /// The ID of a ClassicLink-enabled VPC.
        /// </summary>
        public readonly string VpcClassicLinkId;
        /// <summary>
        /// The IDs of one or more Security Groups for the specified ClassicLink-enabled VPC.
        /// </summary>
        public readonly ImmutableArray<string> VpcClassicLinkSecurityGroups;
        /// <summary>
        /// id is the provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;

        [OutputConstructor]
        private GetLaunchConfigurationResult(
            string arn,
            bool associatePublicIpAddress,
            ImmutableArray<Outputs.GetLaunchConfigurationEbsBlockDevicesResult> ebsBlockDevices,
            bool ebsOptimized,
            bool enableMonitoring,
            ImmutableArray<Outputs.GetLaunchConfigurationEphemeralBlockDevicesResult> ephemeralBlockDevices,
            string iamInstanceProfile,
            string imageId,
            string instanceType,
            string keyName,
            string name,
            string placementTenancy,
            ImmutableArray<Outputs.GetLaunchConfigurationRootBlockDevicesResult> rootBlockDevices,
            ImmutableArray<string> securityGroups,
            string spotPrice,
            string userData,
            string vpcClassicLinkId,
            ImmutableArray<string> vpcClassicLinkSecurityGroups,
            string id)
        {
            Arn = arn;
            AssociatePublicIpAddress = associatePublicIpAddress;
            EbsBlockDevices = ebsBlockDevices;
            EbsOptimized = ebsOptimized;
            EnableMonitoring = enableMonitoring;
            EphemeralBlockDevices = ephemeralBlockDevices;
            IamInstanceProfile = iamInstanceProfile;
            ImageId = imageId;
            InstanceType = instanceType;
            KeyName = keyName;
            Name = name;
            PlacementTenancy = placementTenancy;
            RootBlockDevices = rootBlockDevices;
            SecurityGroups = securityGroups;
            SpotPrice = spotPrice;
            UserData = userData;
            VpcClassicLinkId = vpcClassicLinkId;
            VpcClassicLinkSecurityGroups = vpcClassicLinkSecurityGroups;
            Id = id;
        }
    }

    namespace Outputs
    {

    [OutputType]
    public sealed class GetLaunchConfigurationEbsBlockDevicesResult
    {
        /// <summary>
        /// Whether the EBS Volume will be deleted on instance termination.
        /// </summary>
        public readonly bool DeleteOnTermination;
        /// <summary>
        /// The Name of the device.
        /// </summary>
        public readonly string DeviceName;
        /// <summary>
        /// Whether the volume is Encrypted.
        /// </summary>
        public readonly bool Encrypted;
        /// <summary>
        /// The provisioned IOPs of the volume.
        /// </summary>
        public readonly int Iops;
        /// <summary>
        /// The Snapshot ID of the mount.
        /// </summary>
        public readonly string SnapshotId;
        /// <summary>
        /// The Size of the volume.
        /// </summary>
        public readonly int VolumeSize;
        /// <summary>
        /// The Type of the volume.
        /// </summary>
        public readonly string VolumeType;

        [OutputConstructor]
        private GetLaunchConfigurationEbsBlockDevicesResult(
            bool deleteOnTermination,
            string deviceName,
            bool encrypted,
            int iops,
            string snapshotId,
            int volumeSize,
            string volumeType)
        {
            DeleteOnTermination = deleteOnTermination;
            DeviceName = deviceName;
            Encrypted = encrypted;
            Iops = iops;
            SnapshotId = snapshotId;
            VolumeSize = volumeSize;
            VolumeType = volumeType;
        }
    }

    [OutputType]
    public sealed class GetLaunchConfigurationEphemeralBlockDevicesResult
    {
        /// <summary>
        /// The Name of the device.
        /// </summary>
        public readonly string DeviceName;
        /// <summary>
        /// The Virtual Name of the device.
        /// </summary>
        public readonly string VirtualName;

        [OutputConstructor]
        private GetLaunchConfigurationEphemeralBlockDevicesResult(
            string deviceName,
            string virtualName)
        {
            DeviceName = deviceName;
            VirtualName = virtualName;
        }
    }

    [OutputType]
    public sealed class GetLaunchConfigurationRootBlockDevicesResult
    {
        /// <summary>
        /// Whether the EBS Volume will be deleted on instance termination.
        /// </summary>
        public readonly bool DeleteOnTermination;
        /// <summary>
        /// Whether the volume is Encrypted.
        /// </summary>
        public readonly bool Encrypted;
        /// <summary>
        /// The provisioned IOPs of the volume.
        /// </summary>
        public readonly int Iops;
        /// <summary>
        /// The Size of the volume.
        /// </summary>
        public readonly int VolumeSize;
        /// <summary>
        /// The Type of the volume.
        /// </summary>
        public readonly string VolumeType;

        [OutputConstructor]
        private GetLaunchConfigurationRootBlockDevicesResult(
            bool deleteOnTermination,
            bool encrypted,
            int iops,
            int volumeSize,
            string volumeType)
        {
            DeleteOnTermination = deleteOnTermination;
            Encrypted = encrypted;
            Iops = iops;
            VolumeSize = volumeSize;
            VolumeType = volumeType;
        }
    }
    }
}
