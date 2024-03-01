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
    /// The AMI resource allows the creation and management of a completely-custom
    /// *Amazon Machine Image* (AMI).
    /// 
    /// If you just want to duplicate an existing AMI, possibly copying it to another
    /// region, it's better to use `aws.ec2.AmiCopy` instead.
    /// 
    /// If you just want to share an existing AMI with another AWS account,
    /// it's better to use `aws.ec2.AmiLaunchPermission` instead.
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
    ///     // Create an AMI that will start a machine whose root device is backed by
    ///     // an EBS volume populated from a snapshot. We assume that such a snapshot
    ///     // already exists with the id "snap-xxxxxxxx".
    ///     var example = new Aws.Ec2.Ami("example", new()
    ///     {
    ///         Name = "example",
    ///         VirtualizationType = "hvm",
    ///         RootDeviceName = "/dev/xvda",
    ///         ImdsSupport = "v2.0",
    ///         EbsBlockDevices = new[]
    ///         {
    ///             new Aws.Ec2.Inputs.AmiEbsBlockDeviceArgs
    ///             {
    ///                 DeviceName = "/dev/xvda",
    ///                 SnapshotId = "snap-xxxxxxxx",
    ///                 VolumeSize = 8,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_ami` using the ID of the AMI. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ec2/ami:Ami example ami-12345678
    /// ```
    /// </summary>
    [AwsResourceType("aws:ec2/ami:Ami")]
    public partial class Ami : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Machine architecture for created instances. Defaults to "x86_64".
        /// </summary>
        [Output("architecture")]
        public Output<string?> Architecture { get; private set; } = null!;

        /// <summary>
        /// ARN of the AMI.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Boot mode of the AMI. For more information, see [Boot modes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html) in the Amazon Elastic Compute Cloud User Guide.
        /// </summary>
        [Output("bootMode")]
        public Output<string?> BootMode { get; private set; } = null!;

        /// <summary>
        /// Date and time to deprecate the AMI. If you specified a value for seconds, Amazon EC2 rounds the seconds to the nearest minute. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        /// </summary>
        [Output("deprecationTime")]
        public Output<string?> DeprecationTime { get; private set; } = null!;

        /// <summary>
        /// Longer, human-readable description for the AMI.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Nested block describing an EBS block device that should be
        /// attached to created instances. The structure of this block is described below.
        /// </summary>
        [Output("ebsBlockDevices")]
        public Output<ImmutableArray<Outputs.AmiEbsBlockDevice>> EbsBlockDevices { get; private set; } = null!;

        /// <summary>
        /// Whether enhanced networking with ENA is enabled. Defaults to `false`.
        /// </summary>
        [Output("enaSupport")]
        public Output<bool?> EnaSupport { get; private set; } = null!;

        /// <summary>
        /// Nested block describing an ephemeral block device that
        /// should be attached to created instances. The structure of this block is described below.
        /// </summary>
        [Output("ephemeralBlockDevices")]
        public Output<ImmutableArray<Outputs.AmiEphemeralBlockDevice>> EphemeralBlockDevices { get; private set; } = null!;

        /// <summary>
        /// Hypervisor type of the image.
        /// </summary>
        [Output("hypervisor")]
        public Output<string> Hypervisor { get; private set; } = null!;

        /// <summary>
        /// Path to an S3 object containing an image manifest, e.g., created
        /// by the `ec2-upload-bundle` command in the EC2 command line tools.
        /// </summary>
        [Output("imageLocation")]
        public Output<string> ImageLocation { get; private set; } = null!;

        /// <summary>
        /// AWS account alias (for example, amazon, self) or the AWS account ID of the AMI owner.
        /// </summary>
        [Output("imageOwnerAlias")]
        public Output<string> ImageOwnerAlias { get; private set; } = null!;

        /// <summary>
        /// Type of image.
        /// </summary>
        [Output("imageType")]
        public Output<string> ImageType { get; private set; } = null!;

        /// <summary>
        /// If EC2 instances started from this image should require the use of the Instance Metadata Service V2 (IMDSv2), set this argument to `v2.0`. For more information, see [Configure instance metadata options for new instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration).
        /// </summary>
        [Output("imdsSupport")]
        public Output<string?> ImdsSupport { get; private set; } = null!;

        /// <summary>
        /// ID of the kernel image (AKI) that will be used as the paravirtual
        /// kernel in created instances.
        /// </summary>
        [Output("kernelId")]
        public Output<string?> KernelId { get; private set; } = null!;

        [Output("manageEbsSnapshots")]
        public Output<bool> ManageEbsSnapshots { get; private set; } = null!;

        /// <summary>
        /// Region-unique name for the AMI.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// AWS account ID of the image owner.
        /// </summary>
        [Output("ownerId")]
        public Output<string> OwnerId { get; private set; } = null!;

        /// <summary>
        /// This value is set to windows for Windows AMIs; otherwise, it is blank.
        /// </summary>
        [Output("platform")]
        public Output<string> Platform { get; private set; } = null!;

        /// <summary>
        /// Platform details associated with the billing code of the AMI.
        /// </summary>
        [Output("platformDetails")]
        public Output<string> PlatformDetails { get; private set; } = null!;

        /// <summary>
        /// Whether the image has public launch permissions.
        /// </summary>
        [Output("public")]
        public Output<bool> Public { get; private set; } = null!;

        /// <summary>
        /// ID of an initrd image (ARI) that will be used when booting the
        /// created instances.
        /// </summary>
        [Output("ramdiskId")]
        public Output<string?> RamdiskId { get; private set; } = null!;

        /// <summary>
        /// Name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
        /// </summary>
        [Output("rootDeviceName")]
        public Output<string?> RootDeviceName { get; private set; } = null!;

        /// <summary>
        /// Snapshot ID for the root volume (for EBS-backed AMIs)
        /// </summary>
        [Output("rootSnapshotId")]
        public Output<string> RootSnapshotId { get; private set; } = null!;

        /// <summary>
        /// When set to "simple" (the default), enables enhanced networking
        /// for created instances. No other value is supported at this time.
        /// </summary>
        [Output("sriovNetSupport")]
        public Output<string?> SriovNetSupport { get; private set; } = null!;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// If the image is configured for NitroTPM support, the value is `v2.0`. For more information, see [NitroTPM](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitrotpm.html) in the Amazon Elastic Compute Cloud User Guide.
        /// </summary>
        [Output("tpmSupport")]
        public Output<string?> TpmSupport { get; private set; } = null!;

        /// <summary>
        /// Operation of the Amazon EC2 instance and the billing code that is associated with the AMI.
        /// </summary>
        [Output("usageOperation")]
        public Output<string> UsageOperation { get; private set; } = null!;

        /// <summary>
        /// Keyword to choose what virtualization mode created instances
        /// will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
        /// changes the set of further arguments that are required, as described below.
        /// </summary>
        [Output("virtualizationType")]
        public Output<string?> VirtualizationType { get; private set; } = null!;


        /// <summary>
        /// Create a Ami resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Ami(string name, AmiArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:ec2/ami:Ami", name, args ?? new AmiArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Ami(string name, Input<string> id, AmiState? state = null, CustomResourceOptions? options = null)
            : base("aws:ec2/ami:Ami", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Ami resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Ami Get(string name, Input<string> id, AmiState? state = null, CustomResourceOptions? options = null)
        {
            return new Ami(name, id, state, options);
        }
    }

    public sealed class AmiArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Machine architecture for created instances. Defaults to "x86_64".
        /// </summary>
        [Input("architecture")]
        public Input<string>? Architecture { get; set; }

        /// <summary>
        /// Boot mode of the AMI. For more information, see [Boot modes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html) in the Amazon Elastic Compute Cloud User Guide.
        /// </summary>
        [Input("bootMode")]
        public Input<string>? BootMode { get; set; }

        /// <summary>
        /// Date and time to deprecate the AMI. If you specified a value for seconds, Amazon EC2 rounds the seconds to the nearest minute. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        /// </summary>
        [Input("deprecationTime")]
        public Input<string>? DeprecationTime { get; set; }

        /// <summary>
        /// Longer, human-readable description for the AMI.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("ebsBlockDevices")]
        private InputList<Inputs.AmiEbsBlockDeviceArgs>? _ebsBlockDevices;

        /// <summary>
        /// Nested block describing an EBS block device that should be
        /// attached to created instances. The structure of this block is described below.
        /// </summary>
        public InputList<Inputs.AmiEbsBlockDeviceArgs> EbsBlockDevices
        {
            get => _ebsBlockDevices ?? (_ebsBlockDevices = new InputList<Inputs.AmiEbsBlockDeviceArgs>());
            set => _ebsBlockDevices = value;
        }

        /// <summary>
        /// Whether enhanced networking with ENA is enabled. Defaults to `false`.
        /// </summary>
        [Input("enaSupport")]
        public Input<bool>? EnaSupport { get; set; }

        [Input("ephemeralBlockDevices")]
        private InputList<Inputs.AmiEphemeralBlockDeviceArgs>? _ephemeralBlockDevices;

        /// <summary>
        /// Nested block describing an ephemeral block device that
        /// should be attached to created instances. The structure of this block is described below.
        /// </summary>
        public InputList<Inputs.AmiEphemeralBlockDeviceArgs> EphemeralBlockDevices
        {
            get => _ephemeralBlockDevices ?? (_ephemeralBlockDevices = new InputList<Inputs.AmiEphemeralBlockDeviceArgs>());
            set => _ephemeralBlockDevices = value;
        }

        /// <summary>
        /// Path to an S3 object containing an image manifest, e.g., created
        /// by the `ec2-upload-bundle` command in the EC2 command line tools.
        /// </summary>
        [Input("imageLocation")]
        public Input<string>? ImageLocation { get; set; }

        /// <summary>
        /// If EC2 instances started from this image should require the use of the Instance Metadata Service V2 (IMDSv2), set this argument to `v2.0`. For more information, see [Configure instance metadata options for new instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration).
        /// </summary>
        [Input("imdsSupport")]
        public Input<string>? ImdsSupport { get; set; }

        /// <summary>
        /// ID of the kernel image (AKI) that will be used as the paravirtual
        /// kernel in created instances.
        /// </summary>
        [Input("kernelId")]
        public Input<string>? KernelId { get; set; }

        /// <summary>
        /// Region-unique name for the AMI.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// ID of an initrd image (ARI) that will be used when booting the
        /// created instances.
        /// </summary>
        [Input("ramdiskId")]
        public Input<string>? RamdiskId { get; set; }

        /// <summary>
        /// Name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
        /// </summary>
        [Input("rootDeviceName")]
        public Input<string>? RootDeviceName { get; set; }

        /// <summary>
        /// When set to "simple" (the default), enables enhanced networking
        /// for created instances. No other value is supported at this time.
        /// </summary>
        [Input("sriovNetSupport")]
        public Input<string>? SriovNetSupport { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// If the image is configured for NitroTPM support, the value is `v2.0`. For more information, see [NitroTPM](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitrotpm.html) in the Amazon Elastic Compute Cloud User Guide.
        /// </summary>
        [Input("tpmSupport")]
        public Input<string>? TpmSupport { get; set; }

        /// <summary>
        /// Keyword to choose what virtualization mode created instances
        /// will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
        /// changes the set of further arguments that are required, as described below.
        /// </summary>
        [Input("virtualizationType")]
        public Input<string>? VirtualizationType { get; set; }

        public AmiArgs()
        {
        }
        public static new AmiArgs Empty => new AmiArgs();
    }

    public sealed class AmiState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Machine architecture for created instances. Defaults to "x86_64".
        /// </summary>
        [Input("architecture")]
        public Input<string>? Architecture { get; set; }

        /// <summary>
        /// ARN of the AMI.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Boot mode of the AMI. For more information, see [Boot modes](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/ami-boot.html) in the Amazon Elastic Compute Cloud User Guide.
        /// </summary>
        [Input("bootMode")]
        public Input<string>? BootMode { get; set; }

        /// <summary>
        /// Date and time to deprecate the AMI. If you specified a value for seconds, Amazon EC2 rounds the seconds to the nearest minute. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
        /// </summary>
        [Input("deprecationTime")]
        public Input<string>? DeprecationTime { get; set; }

        /// <summary>
        /// Longer, human-readable description for the AMI.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("ebsBlockDevices")]
        private InputList<Inputs.AmiEbsBlockDeviceGetArgs>? _ebsBlockDevices;

        /// <summary>
        /// Nested block describing an EBS block device that should be
        /// attached to created instances. The structure of this block is described below.
        /// </summary>
        public InputList<Inputs.AmiEbsBlockDeviceGetArgs> EbsBlockDevices
        {
            get => _ebsBlockDevices ?? (_ebsBlockDevices = new InputList<Inputs.AmiEbsBlockDeviceGetArgs>());
            set => _ebsBlockDevices = value;
        }

        /// <summary>
        /// Whether enhanced networking with ENA is enabled. Defaults to `false`.
        /// </summary>
        [Input("enaSupport")]
        public Input<bool>? EnaSupport { get; set; }

        [Input("ephemeralBlockDevices")]
        private InputList<Inputs.AmiEphemeralBlockDeviceGetArgs>? _ephemeralBlockDevices;

        /// <summary>
        /// Nested block describing an ephemeral block device that
        /// should be attached to created instances. The structure of this block is described below.
        /// </summary>
        public InputList<Inputs.AmiEphemeralBlockDeviceGetArgs> EphemeralBlockDevices
        {
            get => _ephemeralBlockDevices ?? (_ephemeralBlockDevices = new InputList<Inputs.AmiEphemeralBlockDeviceGetArgs>());
            set => _ephemeralBlockDevices = value;
        }

        /// <summary>
        /// Hypervisor type of the image.
        /// </summary>
        [Input("hypervisor")]
        public Input<string>? Hypervisor { get; set; }

        /// <summary>
        /// Path to an S3 object containing an image manifest, e.g., created
        /// by the `ec2-upload-bundle` command in the EC2 command line tools.
        /// </summary>
        [Input("imageLocation")]
        public Input<string>? ImageLocation { get; set; }

        /// <summary>
        /// AWS account alias (for example, amazon, self) or the AWS account ID of the AMI owner.
        /// </summary>
        [Input("imageOwnerAlias")]
        public Input<string>? ImageOwnerAlias { get; set; }

        /// <summary>
        /// Type of image.
        /// </summary>
        [Input("imageType")]
        public Input<string>? ImageType { get; set; }

        /// <summary>
        /// If EC2 instances started from this image should require the use of the Instance Metadata Service V2 (IMDSv2), set this argument to `v2.0`. For more information, see [Configure instance metadata options for new instances](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/configuring-IMDS-new-instances.html#configure-IMDS-new-instances-ami-configuration).
        /// </summary>
        [Input("imdsSupport")]
        public Input<string>? ImdsSupport { get; set; }

        /// <summary>
        /// ID of the kernel image (AKI) that will be used as the paravirtual
        /// kernel in created instances.
        /// </summary>
        [Input("kernelId")]
        public Input<string>? KernelId { get; set; }

        [Input("manageEbsSnapshots")]
        public Input<bool>? ManageEbsSnapshots { get; set; }

        /// <summary>
        /// Region-unique name for the AMI.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// AWS account ID of the image owner.
        /// </summary>
        [Input("ownerId")]
        public Input<string>? OwnerId { get; set; }

        /// <summary>
        /// This value is set to windows for Windows AMIs; otherwise, it is blank.
        /// </summary>
        [Input("platform")]
        public Input<string>? Platform { get; set; }

        /// <summary>
        /// Platform details associated with the billing code of the AMI.
        /// </summary>
        [Input("platformDetails")]
        public Input<string>? PlatformDetails { get; set; }

        /// <summary>
        /// Whether the image has public launch permissions.
        /// </summary>
        [Input("public")]
        public Input<bool>? Public { get; set; }

        /// <summary>
        /// ID of an initrd image (ARI) that will be used when booting the
        /// created instances.
        /// </summary>
        [Input("ramdiskId")]
        public Input<string>? RamdiskId { get; set; }

        /// <summary>
        /// Name of the root device (for example, `/dev/sda1`, or `/dev/xvda`).
        /// </summary>
        [Input("rootDeviceName")]
        public Input<string>? RootDeviceName { get; set; }

        /// <summary>
        /// Snapshot ID for the root volume (for EBS-backed AMIs)
        /// </summary>
        [Input("rootSnapshotId")]
        public Input<string>? RootSnapshotId { get; set; }

        /// <summary>
        /// When set to "simple" (the default), enables enhanced networking
        /// for created instances. No other value is supported at this time.
        /// </summary>
        [Input("sriovNetSupport")]
        public Input<string>? SriovNetSupport { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        /// If the image is configured for NitroTPM support, the value is `v2.0`. For more information, see [NitroTPM](https://docs.aws.amazon.com/AWSEC2/latest/UserGuide/nitrotpm.html) in the Amazon Elastic Compute Cloud User Guide.
        /// </summary>
        [Input("tpmSupport")]
        public Input<string>? TpmSupport { get; set; }

        /// <summary>
        /// Operation of the Amazon EC2 instance and the billing code that is associated with the AMI.
        /// </summary>
        [Input("usageOperation")]
        public Input<string>? UsageOperation { get; set; }

        /// <summary>
        /// Keyword to choose what virtualization mode created instances
        /// will use. Can be either "paravirtual" (the default) or "hvm". The choice of virtualization type
        /// changes the set of further arguments that are required, as described below.
        /// </summary>
        [Input("virtualizationType")]
        public Input<string>? VirtualizationType { get; set; }

        public AmiState()
        {
        }
        public static new AmiState Empty => new AmiState();
    }
}
