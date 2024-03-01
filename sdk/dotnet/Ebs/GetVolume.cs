// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ebs
{
    public static class GetVolume
    {
        /// <summary>
        /// Use this data source to get information about an EBS volume for use in other
        /// resources.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ebsVolume = Aws.Ebs.GetVolume.Invoke(new()
        ///     {
        ///         MostRecent = true,
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ebs.Inputs.GetVolumeFilterInputArgs
        ///             {
        ///                 Name = "volume-type",
        ///                 Values = new[]
        ///                 {
        ///                     "gp2",
        ///                 },
        ///             },
        ///             new Aws.Ebs.Inputs.GetVolumeFilterInputArgs
        ///             {
        ///                 Name = "tag:Name",
        ///                 Values = new[]
        ///                 {
        ///                     "Example",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Task<GetVolumeResult> InvokeAsync(GetVolumeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetVolumeResult>("aws:ebs/getVolume:getVolume", args ?? new GetVolumeArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about an EBS volume for use in other
        /// resources.
        /// 
        /// {{% examples %}}
        /// ## Example Usage
        /// {{% example %}}
        /// 
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var ebsVolume = Aws.Ebs.GetVolume.Invoke(new()
        ///     {
        ///         MostRecent = true,
        ///         Filters = new[]
        ///         {
        ///             new Aws.Ebs.Inputs.GetVolumeFilterInputArgs
        ///             {
        ///                 Name = "volume-type",
        ///                 Values = new[]
        ///                 {
        ///                     "gp2",
        ///                 },
        ///             },
        ///             new Aws.Ebs.Inputs.GetVolumeFilterInputArgs
        ///             {
        ///                 Name = "tag:Name",
        ///                 Values = new[]
        ///                 {
        ///                     "Example",
        ///                 },
        ///             },
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// {{% /example %}}
        /// {{% /examples %}}
        /// </summary>
        public static Output<GetVolumeResult> Invoke(GetVolumeInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetVolumeResult>("aws:ebs/getVolume:getVolume", args ?? new GetVolumeInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetVolumeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private List<Inputs.GetVolumeFilterArgs>? _filters;

        /// <summary>
        /// One or more name/value pairs to filter off of. There are
        /// several valid keys, for a full reference, check out
        /// [describe-volumes in the AWS CLI reference][1].
        /// </summary>
        public List<Inputs.GetVolumeFilterArgs> Filters
        {
            get => _filters ?? (_filters = new List<Inputs.GetVolumeFilterArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If more than one result is returned, use the most
        /// recent Volume.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Map of tags for the resource.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetVolumeArgs()
        {
        }
        public static new GetVolumeArgs Empty => new GetVolumeArgs();
    }

    public sealed class GetVolumeInvokeArgs : global::Pulumi.InvokeArgs
    {
        [Input("filters")]
        private InputList<Inputs.GetVolumeFilterInputArgs>? _filters;

        /// <summary>
        /// One or more name/value pairs to filter off of. There are
        /// several valid keys, for a full reference, check out
        /// [describe-volumes in the AWS CLI reference][1].
        /// </summary>
        public InputList<Inputs.GetVolumeFilterInputArgs> Filters
        {
            get => _filters ?? (_filters = new InputList<Inputs.GetVolumeFilterInputArgs>());
            set => _filters = value;
        }

        /// <summary>
        /// If more than one result is returned, use the most
        /// recent Volume.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags for the resource.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetVolumeInvokeArgs()
        {
        }
        public static new GetVolumeInvokeArgs Empty => new GetVolumeInvokeArgs();
    }


    [OutputType]
    public sealed class GetVolumeResult
    {
        /// <summary>
        /// Volume ARN (e.g., arn:aws:ec2:us-east-1:0123456789012:volume/vol-59fcb34e).
        /// </summary>
        public readonly string Arn;
        /// <summary>
        /// AZ where the EBS volume exists.
        /// </summary>
        public readonly string AvailabilityZone;
        /// <summary>
        /// Whether the disk is encrypted.
        /// </summary>
        public readonly bool Encrypted;
        public readonly ImmutableArray<Outputs.GetVolumeFilterResult> Filters;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        /// <summary>
        /// Amount of IOPS for the disk.
        /// </summary>
        public readonly int Iops;
        /// <summary>
        /// ARN for the KMS encryption key.
        /// </summary>
        public readonly string KmsKeyId;
        public readonly bool? MostRecent;
        /// <summary>
        /// (Optional) Specifies whether Amazon EBS Multi-Attach is enabled.
        /// </summary>
        public readonly bool MultiAttachEnabled;
        /// <summary>
        /// ARN of the Outpost.
        /// </summary>
        public readonly string OutpostArn;
        /// <summary>
        /// Size of the drive in GiBs.
        /// </summary>
        public readonly int Size;
        /// <summary>
        /// Snapshot_id the EBS volume is based off.
        /// </summary>
        public readonly string SnapshotId;
        /// <summary>
        /// Map of tags for the resource.
        /// </summary>
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// Throughput that the volume supports, in MiB/s.
        /// </summary>
        public readonly int Throughput;
        /// <summary>
        /// Volume ID (e.g., vol-59fcb34e).
        /// </summary>
        public readonly string VolumeId;
        /// <summary>
        /// Type of EBS volume.
        /// </summary>
        public readonly string VolumeType;

        [OutputConstructor]
        private GetVolumeResult(
            string arn,

            string availabilityZone,

            bool encrypted,

            ImmutableArray<Outputs.GetVolumeFilterResult> filters,

            string id,

            int iops,

            string kmsKeyId,

            bool? mostRecent,

            bool multiAttachEnabled,

            string outpostArn,

            int size,

            string snapshotId,

            ImmutableDictionary<string, string> tags,

            int throughput,

            string volumeId,

            string volumeType)
        {
            Arn = arn;
            AvailabilityZone = availabilityZone;
            Encrypted = encrypted;
            Filters = filters;
            Id = id;
            Iops = iops;
            KmsKeyId = kmsKeyId;
            MostRecent = mostRecent;
            MultiAttachEnabled = multiAttachEnabled;
            OutpostArn = outpostArn;
            Size = size;
            SnapshotId = snapshotId;
            Tags = tags;
            Throughput = throughput;
            VolumeId = volumeId;
            VolumeType = volumeType;
        }
    }
}
