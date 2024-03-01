// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Efs
{
    /// <summary>
    /// Provides an Elastic File System (EFS) mount target.
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
    ///     var foo = new Aws.Ec2.Vpc("foo", new()
    ///     {
    ///         CidrBlock = "10.0.0.0/16",
    ///     });
    /// 
    ///     var alphaSubnet = new Aws.Ec2.Subnet("alpha", new()
    ///     {
    ///         VpcId = foo.Id,
    ///         AvailabilityZone = "us-west-2a",
    ///         CidrBlock = "10.0.1.0/24",
    ///     });
    /// 
    ///     var alpha = new Aws.Efs.MountTarget("alpha", new()
    ///     {
    ///         FileSystemId = fooAwsEfsFileSystem.Id,
    ///         SubnetId = alphaSubnet.Id,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import the EFS mount targets using the `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:efs/mountTarget:MountTarget alpha fsmt-52a643fb
    /// ```
    /// </summary>
    [AwsResourceType("aws:efs/mountTarget:MountTarget")]
    public partial class MountTarget : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
        /// </summary>
        [Output("availabilityZoneId")]
        public Output<string> AvailabilityZoneId { get; private set; } = null!;

        /// <summary>
        /// The name of the Availability Zone (AZ) that the mount target resides in.
        /// </summary>
        [Output("availabilityZoneName")]
        public Output<string> AvailabilityZoneName { get; private set; } = null!;

        /// <summary>
        /// The DNS name for the EFS file system.
        /// </summary>
        [Output("dnsName")]
        public Output<string> DnsName { get; private set; } = null!;

        /// <summary>
        /// Amazon Resource Name of the file system.
        /// </summary>
        [Output("fileSystemArn")]
        public Output<string> FileSystemArn { get; private set; } = null!;

        /// <summary>
        /// The ID of the file system for which the mount target is intended.
        /// </summary>
        [Output("fileSystemId")]
        public Output<string> FileSystemId { get; private set; } = null!;

        /// <summary>
        /// The address (within the address range of the specified subnet) at
        /// which the file system may be mounted via the mount target.
        /// </summary>
        [Output("ipAddress")]
        public Output<string> IpAddress { get; private set; } = null!;

        /// <summary>
        /// The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
        /// </summary>
        [Output("mountTargetDnsName")]
        public Output<string> MountTargetDnsName { get; private set; } = null!;

        /// <summary>
        /// The ID of the network interface that Amazon EFS created when it created the mount target.
        /// </summary>
        [Output("networkInterfaceId")]
        public Output<string> NetworkInterfaceId { get; private set; } = null!;

        /// <summary>
        /// AWS account ID that owns the resource.
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// A list of up to 5 VPC security group IDs (that must
        /// be for the same VPC as subnet specified) in effect for the mount target.
        /// </summary>
        [Output("securityGroups")]
        public Output<ImmutableArray<string>> SecurityGroups { get; private set; } = null!;

        /// <summary>
        /// The ID of the subnet to add the mount target in.
        /// </summary>
        [Output("subnetId")]
        public Output<string> SubnetId { get; private set; } = null!;


        /// <summary>
        /// Create a MountTarget resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public MountTarget(string name, MountTargetArgs args, CustomResourceOptions? options = null)
            : base("aws:efs/mountTarget:MountTarget", name, args ?? new MountTargetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private MountTarget(string name, Input<string> id, MountTargetState? state = null, CustomResourceOptions? options = null)
            : base("aws:efs/mountTarget:MountTarget", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing MountTarget resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static MountTarget Get(string name, Input<string> id, MountTargetState? state = null, CustomResourceOptions? options = null)
        {
            return new MountTarget(name, id, state, options);
        }
    }

    public sealed class MountTargetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the file system for which the mount target is intended.
        /// </summary>
        [Input("fileSystemId", required: true)]
        public Input<string> FileSystemId { get; set; } = null!;

        /// <summary>
        /// The address (within the address range of the specified subnet) at
        /// which the file system may be mounted via the mount target.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        [Input("securityGroups")]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// A list of up to 5 VPC security group IDs (that must
        /// be for the same VPC as subnet specified) in effect for the mount target.
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// The ID of the subnet to add the mount target in.
        /// </summary>
        [Input("subnetId", required: true)]
        public Input<string> SubnetId { get; set; } = null!;

        public MountTargetArgs()
        {
        }
        public static new MountTargetArgs Empty => new MountTargetArgs();
    }

    public sealed class MountTargetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The unique and consistent identifier of the Availability Zone (AZ) that the mount target resides in.
        /// </summary>
        [Input("availabilityZoneId")]
        public Input<string>? AvailabilityZoneId { get; set; }

        /// <summary>
        /// The name of the Availability Zone (AZ) that the mount target resides in.
        /// </summary>
        [Input("availabilityZoneName")]
        public Input<string>? AvailabilityZoneName { get; set; }

        /// <summary>
        /// The DNS name for the EFS file system.
        /// </summary>
        [Input("dnsName")]
        public Input<string>? DnsName { get; set; }

        /// <summary>
        /// Amazon Resource Name of the file system.
        /// </summary>
        [Input("fileSystemArn")]
        public Input<string>? FileSystemArn { get; set; }

        /// <summary>
        /// The ID of the file system for which the mount target is intended.
        /// </summary>
        [Input("fileSystemId")]
        public Input<string>? FileSystemId { get; set; }

        /// <summary>
        /// The address (within the address range of the specified subnet) at
        /// which the file system may be mounted via the mount target.
        /// </summary>
        [Input("ipAddress")]
        public Input<string>? IpAddress { get; set; }

        /// <summary>
        /// The DNS name for the given subnet/AZ per [documented convention](http://docs.aws.amazon.com/efs/latest/ug/mounting-fs-mount-cmd-dns-name.html).
        /// </summary>
        [Input("mountTargetDnsName")]
        public Input<string>? MountTargetDnsName { get; set; }

        /// <summary>
        /// The ID of the network interface that Amazon EFS created when it created the mount target.
        /// </summary>
        [Input("networkInterfaceId")]
        public Input<string>? NetworkInterfaceId { get; set; }

        /// <summary>
        /// AWS account ID that owns the resource.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        [Input("securityGroups")]
        private InputList<string>? _securityGroups;

        /// <summary>
        /// A list of up to 5 VPC security group IDs (that must
        /// be for the same VPC as subnet specified) in effect for the mount target.
        /// </summary>
        public InputList<string> SecurityGroups
        {
            get => _securityGroups ?? (_securityGroups = new InputList<string>());
            set => _securityGroups = value;
        }

        /// <summary>
        /// The ID of the subnet to add the mount target in.
        /// </summary>
        [Input("subnetId")]
        public Input<string>? SubnetId { get; set; }

        public MountTargetState()
        {
        }
        public static new MountTargetState Empty => new MountTargetState();
    }
}
