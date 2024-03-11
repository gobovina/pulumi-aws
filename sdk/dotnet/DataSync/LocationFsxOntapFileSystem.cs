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
    /// Resource for managing an AWS DataSync Location FSx Ontap File System.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_datasync_location_fsx_ontap_file_system` using the `DataSync-ARN#FSx-ontap-svm-ARN`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:datasync/locationFsxOntapFileSystem:LocationFsxOntapFileSystem example arn:aws:datasync:us-west-2:123456789012:location/loc-12345678901234567#arn:aws:fsx:us-west-2:123456789012:storage-virtual-machine/svm-12345678abcdef123
    /// ```
    /// </summary>
    [AwsResourceType("aws:datasync/locationFsxOntapFileSystem:LocationFsxOntapFileSystem")]
    public partial class LocationFsxOntapFileSystem : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the DataSync Location for the FSx Ontap File System.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        [Output("creationTime")]
        public Output<string> CreationTime { get; private set; } = null!;

        /// <summary>
        /// ARN of the FSx Ontap File System.
        /// </summary>
        [Output("fsxFilesystemArn")]
        public Output<string> FsxFilesystemArn { get; private set; } = null!;

        /// <summary>
        /// The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
        /// </summary>
        [Output("protocol")]
        public Output<Outputs.LocationFsxOntapFileSystemProtocol> Protocol { get; private set; } = null!;

        /// <summary>
        /// The security groups that provide access to your file system's preferred subnet. The security groups must allow outbbound traffic on the following ports (depending on the protocol you use):
        /// * Network File System (NFS): TCP ports 111, 635, and 2049
        /// * Server Message Block (SMB): TCP port 445
        /// </summary>
        [Output("securityGroupArns")]
        public Output<ImmutableArray<string>> SecurityGroupArns { get; private set; } = null!;

        /// <summary>
        /// The ARN of the SVM in your file system where you want to copy data to of from.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("storageVirtualMachineArn")]
        public Output<string> StorageVirtualMachineArn { get; private set; } = null!;

        /// <summary>
        /// Path to the file share in the SVM where you'll copy your data. You can specify a junction path (also known as a mount point), qtree path (for NFS file shares), or share name (for SMB file shares) (e.g. `/vol1`, `/vol1/tree1`, `share1`).
        /// </summary>
        [Output("subdirectory")]
        public Output<string> Subdirectory { get; private set; } = null!;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// URI of the FSx ONTAP file system location
        /// </summary>
        [Output("uri")]
        public Output<string> Uri { get; private set; } = null!;


        /// <summary>
        /// Create a LocationFsxOntapFileSystem resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public LocationFsxOntapFileSystem(string name, LocationFsxOntapFileSystemArgs args, CustomResourceOptions? options = null)
            : base("aws:datasync/locationFsxOntapFileSystem:LocationFsxOntapFileSystem", name, args ?? new LocationFsxOntapFileSystemArgs(), MakeResourceOptions(options, ""))
        {
        }

        private LocationFsxOntapFileSystem(string name, Input<string> id, LocationFsxOntapFileSystemState? state = null, CustomResourceOptions? options = null)
            : base("aws:datasync/locationFsxOntapFileSystem:LocationFsxOntapFileSystem", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing LocationFsxOntapFileSystem resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static LocationFsxOntapFileSystem Get(string name, Input<string> id, LocationFsxOntapFileSystemState? state = null, CustomResourceOptions? options = null)
        {
            return new LocationFsxOntapFileSystem(name, id, state, options);
        }
    }

    public sealed class LocationFsxOntapFileSystemArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
        /// </summary>
        [Input("protocol", required: true)]
        public Input<Inputs.LocationFsxOntapFileSystemProtocolArgs> Protocol { get; set; } = null!;

        [Input("securityGroupArns", required: true)]
        private InputList<string>? _securityGroupArns;

        /// <summary>
        /// The security groups that provide access to your file system's preferred subnet. The security groups must allow outbbound traffic on the following ports (depending on the protocol you use):
        /// * Network File System (NFS): TCP ports 111, 635, and 2049
        /// * Server Message Block (SMB): TCP port 445
        /// </summary>
        public InputList<string> SecurityGroupArns
        {
            get => _securityGroupArns ?? (_securityGroupArns = new InputList<string>());
            set => _securityGroupArns = value;
        }

        /// <summary>
        /// The ARN of the SVM in your file system where you want to copy data to of from.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("storageVirtualMachineArn", required: true)]
        public Input<string> StorageVirtualMachineArn { get; set; } = null!;

        /// <summary>
        /// Path to the file share in the SVM where you'll copy your data. You can specify a junction path (also known as a mount point), qtree path (for NFS file shares), or share name (for SMB file shares) (e.g. `/vol1`, `/vol1/tree1`, `share1`).
        /// </summary>
        [Input("subdirectory")]
        public Input<string>? Subdirectory { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public LocationFsxOntapFileSystemArgs()
        {
        }
        public static new LocationFsxOntapFileSystemArgs Empty => new LocationFsxOntapFileSystemArgs();
    }

    public sealed class LocationFsxOntapFileSystemState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the DataSync Location for the FSx Ontap File System.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("creationTime")]
        public Input<string>? CreationTime { get; set; }

        /// <summary>
        /// ARN of the FSx Ontap File System.
        /// </summary>
        [Input("fsxFilesystemArn")]
        public Input<string>? FsxFilesystemArn { get; set; }

        /// <summary>
        /// The data transfer protocol that DataSync uses to access your Amazon FSx file system. See Protocol below.
        /// </summary>
        [Input("protocol")]
        public Input<Inputs.LocationFsxOntapFileSystemProtocolGetArgs>? Protocol { get; set; }

        [Input("securityGroupArns")]
        private InputList<string>? _securityGroupArns;

        /// <summary>
        /// The security groups that provide access to your file system's preferred subnet. The security groups must allow outbbound traffic on the following ports (depending on the protocol you use):
        /// * Network File System (NFS): TCP ports 111, 635, and 2049
        /// * Server Message Block (SMB): TCP port 445
        /// </summary>
        public InputList<string> SecurityGroupArns
        {
            get => _securityGroupArns ?? (_securityGroupArns = new InputList<string>());
            set => _securityGroupArns = value;
        }

        /// <summary>
        /// The ARN of the SVM in your file system where you want to copy data to of from.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("storageVirtualMachineArn")]
        public Input<string>? StorageVirtualMachineArn { get; set; }

        /// <summary>
        /// Path to the file share in the SVM where you'll copy your data. You can specify a junction path (also known as a mount point), qtree path (for NFS file shares), or share name (for SMB file shares) (e.g. `/vol1`, `/vol1/tree1`, `share1`).
        /// </summary>
        [Input("subdirectory")]
        public Input<string>? Subdirectory { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// URI of the FSx ONTAP file system location
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        public LocationFsxOntapFileSystemState()
        {
        }
        public static new LocationFsxOntapFileSystemState Empty => new LocationFsxOntapFileSystemState();
    }
}
