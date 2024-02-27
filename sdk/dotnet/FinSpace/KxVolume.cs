// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.FinSpace
{
    /// <summary>
    /// Resource for managing an AWS FinSpace Kx Volume.
    /// 
    /// ## Example Usage
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.FinSpace.KxVolume("example", new()
    ///     {
    ///         EnvironmentId = aws_finspace_kx_environment.Example.Id,
    ///         AvailabilityZones = "use1-az2",
    ///         AzMode = "SINGLE",
    ///         Type = "NAS_1",
    ///         Nas1Configurations = new[]
    ///         {
    ///             new Aws.FinSpace.Inputs.KxVolumeNas1ConfigurationArgs
    ///             {
    ///                 Size = 1200,
    ///                 Type = "SSD_250",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import an AWS FinSpace Kx Volume using the `id` (environment ID and volume name, comma-delimited). For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:finspace/kxVolume:KxVolume example n3ceo7wqxoxcti5tujqwzs,my-tf-kx-volume
    /// ```
    /// </summary>
    [AwsResourceType("aws:finspace/kxVolume:KxVolume")]
    public partial class KxVolume : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) identifier of the KX volume.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        [Output("attachedClusters")]
        public Output<ImmutableArray<Outputs.KxVolumeAttachedCluster>> AttachedClusters { get; private set; } = null!;

        /// <summary>
        /// The identifier of the AWS Availability Zone IDs.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("availabilityZones")]
        public Output<ImmutableArray<string>> AvailabilityZones { get; private set; } = null!;

        /// <summary>
        /// The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
        /// </summary>
        [Output("azMode")]
        public Output<string> AzMode { get; private set; } = null!;

        /// <summary>
        /// The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
        /// </summary>
        [Output("createdTimestamp")]
        public Output<string> CreatedTimestamp { get; private set; } = null!;

        /// <summary>
        /// Description of the volume.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// A unique identifier for the kdb environment, whose clusters can attach to the volume.
        /// </summary>
        [Output("environmentId")]
        public Output<string> EnvironmentId { get; private set; } = null!;

        /// <summary>
        /// Last timestamp at which the volume was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        /// </summary>
        [Output("lastModifiedTimestamp")]
        public Output<string> LastModifiedTimestamp { get; private set; } = null!;

        /// <summary>
        /// Unique name for the volumr that you want to create.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
        /// </summary>
        [Output("nas1Configurations")]
        public Output<ImmutableArray<Outputs.KxVolumeNas1Configuration>> Nas1Configurations { get; private set; } = null!;

        /// <summary>
        /// The status of volume creation.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// The error message when a failed state occurs.
        /// </summary>
        [Output("statusReason")]
        public Output<string> StatusReason { get; private set; } = null!;

        /// <summary>
        /// A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a KxVolume resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public KxVolume(string name, KxVolumeArgs args, CustomResourceOptions? options = null)
            : base("aws:finspace/kxVolume:KxVolume", name, args ?? new KxVolumeArgs(), MakeResourceOptions(options, ""))
        {
        }

        private KxVolume(string name, Input<string> id, KxVolumeState? state = null, CustomResourceOptions? options = null)
            : base("aws:finspace/kxVolume:KxVolume", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing KxVolume resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static KxVolume Get(string name, Input<string> id, KxVolumeState? state = null, CustomResourceOptions? options = null)
        {
            return new KxVolume(name, id, state, options);
        }
    }

    public sealed class KxVolumeArgs : global::Pulumi.ResourceArgs
    {
        [Input("availabilityZones", required: true)]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// The identifier of the AWS Availability Zone IDs.
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        /// <summary>
        /// The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
        /// </summary>
        [Input("azMode", required: true)]
        public Input<string> AzMode { get; set; } = null!;

        /// <summary>
        /// Description of the volume.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A unique identifier for the kdb environment, whose clusters can attach to the volume.
        /// </summary>
        [Input("environmentId", required: true)]
        public Input<string> EnvironmentId { get; set; } = null!;

        /// <summary>
        /// Unique name for the volumr that you want to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nas1Configurations")]
        private InputList<Inputs.KxVolumeNas1ConfigurationArgs>? _nas1Configurations;

        /// <summary>
        /// Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
        /// </summary>
        public InputList<Inputs.KxVolumeNas1ConfigurationArgs> Nas1Configurations
        {
            get => _nas1Configurations ?? (_nas1Configurations = new InputList<Inputs.KxVolumeNas1ConfigurationArgs>());
            set => _nas1Configurations = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public KxVolumeArgs()
        {
        }
        public static new KxVolumeArgs Empty => new KxVolumeArgs();
    }

    public sealed class KxVolumeState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) identifier of the KX volume.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        [Input("attachedClusters")]
        private InputList<Inputs.KxVolumeAttachedClusterGetArgs>? _attachedClusters;
        public InputList<Inputs.KxVolumeAttachedClusterGetArgs> AttachedClusters
        {
            get => _attachedClusters ?? (_attachedClusters = new InputList<Inputs.KxVolumeAttachedClusterGetArgs>());
            set => _attachedClusters = value;
        }

        [Input("availabilityZones")]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// The identifier of the AWS Availability Zone IDs.
        /// 
        /// The following arguments are optional:
        /// </summary>
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        /// <summary>
        /// The number of availability zones you want to assign per volume. Currently, Finspace only support SINGLE for volumes.
        /// </summary>
        [Input("azMode")]
        public Input<string>? AzMode { get; set; }

        /// <summary>
        /// The timestamp at which the volume was created in FinSpace. The value is determined as epoch time in milliseconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000000.
        /// </summary>
        [Input("createdTimestamp")]
        public Input<string>? CreatedTimestamp { get; set; }

        /// <summary>
        /// Description of the volume.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// A unique identifier for the kdb environment, whose clusters can attach to the volume.
        /// </summary>
        [Input("environmentId")]
        public Input<string>? EnvironmentId { get; set; }

        /// <summary>
        /// Last timestamp at which the volume was updated in FinSpace. Value determined as epoch time in seconds. For example, the value for Monday, November 1, 2021 12:00:00 PM UTC is specified as 1635768000.
        /// </summary>
        [Input("lastModifiedTimestamp")]
        public Input<string>? LastModifiedTimestamp { get; set; }

        /// <summary>
        /// Unique name for the volumr that you want to create.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("nas1Configurations")]
        private InputList<Inputs.KxVolumeNas1ConfigurationGetArgs>? _nas1Configurations;

        /// <summary>
        /// Specifies the configuration for the Network attached storage (`NAS_1`) file system volume. This parameter is required when `volume_type` is `NAS_1`. See `nas1_configuration` Argument Reference below.
        /// </summary>
        public InputList<Inputs.KxVolumeNas1ConfigurationGetArgs> Nas1Configurations
        {
            get => _nas1Configurations ?? (_nas1Configurations = new InputList<Inputs.KxVolumeNas1ConfigurationGetArgs>());
            set => _nas1Configurations = value;
        }

        /// <summary>
        /// The status of volume creation.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// The error message when a failed state occurs.
        /// </summary>
        [Input("statusReason")]
        public Input<string>? StatusReason { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A list of key-value pairs to label the volume. You can add up to 50 tags to a volume
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
        /// The type of file system volume. Currently, FinSpace only supports the `NAS_1` volume type. When you select the `NAS_1` volume type, you must also provide `nas1_configuration`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public KxVolumeState()
        {
        }
        public static new KxVolumeState Empty => new KxVolumeState();
    }
}
