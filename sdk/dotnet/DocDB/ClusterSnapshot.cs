// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.DocDB
{
    /// <summary>
    /// Manages a DocumentDB database cluster snapshot for DocumentDB clusters.
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
    ///     var example = new Aws.DocDB.ClusterSnapshot("example", new()
    ///     {
    ///         DbClusterIdentifier = exampleAwsDocdbCluster.Id,
    ///         DbClusterSnapshotIdentifier = "resourcetestsnapshot1234",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_docdb_cluster_snapshot` using the cluster snapshot identifier. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:docdb/clusterSnapshot:ClusterSnapshot example my-cluster-snapshot
    /// ```
    /// </summary>
    [AwsResourceType("aws:docdb/clusterSnapshot:ClusterSnapshot")]
    public partial class ClusterSnapshot : global::Pulumi.CustomResource
    {
        /// <summary>
        /// List of EC2 Availability Zones that instances in the DocumentDB cluster snapshot can be restored in.
        /// </summary>
        [Output("availabilityZones")]
        public Output<ImmutableArray<string>> AvailabilityZones { get; private set; } = null!;

        /// <summary>
        /// The DocumentDB Cluster Identifier from which to take the snapshot.
        /// </summary>
        [Output("dbClusterIdentifier")]
        public Output<string> DbClusterIdentifier { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) for the DocumentDB Cluster Snapshot.
        /// </summary>
        [Output("dbClusterSnapshotArn")]
        public Output<string> DbClusterSnapshotArn { get; private set; } = null!;

        /// <summary>
        /// The Identifier for the snapshot.
        /// </summary>
        [Output("dbClusterSnapshotIdentifier")]
        public Output<string> DbClusterSnapshotIdentifier { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the database engine.
        /// </summary>
        [Output("engine")]
        public Output<string> Engine { get; private set; } = null!;

        /// <summary>
        /// Version of the database engine for this DocumentDB cluster snapshot.
        /// </summary>
        [Output("engineVersion")]
        public Output<string> EngineVersion { get; private set; } = null!;

        /// <summary>
        /// If storage_encrypted is true, the AWS KMS key identifier for the encrypted DocumentDB cluster snapshot.
        /// </summary>
        [Output("kmsKeyId")]
        public Output<string> KmsKeyId { get; private set; } = null!;

        /// <summary>
        /// Port that the DocumentDB cluster was listening on at the time of the snapshot.
        /// </summary>
        [Output("port")]
        public Output<int> Port { get; private set; } = null!;

        [Output("snapshotType")]
        public Output<string> SnapshotType { get; private set; } = null!;

        [Output("sourceDbClusterSnapshotArn")]
        public Output<string> SourceDbClusterSnapshotArn { get; private set; } = null!;

        /// <summary>
        /// The status of this DocumentDB Cluster Snapshot.
        /// </summary>
        [Output("status")]
        public Output<string> Status { get; private set; } = null!;

        /// <summary>
        /// Specifies whether the DocumentDB cluster snapshot is encrypted.
        /// </summary>
        [Output("storageEncrypted")]
        public Output<bool> StorageEncrypted { get; private set; } = null!;

        /// <summary>
        /// The VPC ID associated with the DocumentDB cluster snapshot.
        /// </summary>
        [Output("vpcId")]
        public Output<string> VpcId { get; private set; } = null!;


        /// <summary>
        /// Create a ClusterSnapshot resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ClusterSnapshot(string name, ClusterSnapshotArgs args, CustomResourceOptions? options = null)
            : base("aws:docdb/clusterSnapshot:ClusterSnapshot", name, args ?? new ClusterSnapshotArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ClusterSnapshot(string name, Input<string> id, ClusterSnapshotState? state = null, CustomResourceOptions? options = null)
            : base("aws:docdb/clusterSnapshot:ClusterSnapshot", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ClusterSnapshot resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ClusterSnapshot Get(string name, Input<string> id, ClusterSnapshotState? state = null, CustomResourceOptions? options = null)
        {
            return new ClusterSnapshot(name, id, state, options);
        }
    }

    public sealed class ClusterSnapshotArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The DocumentDB Cluster Identifier from which to take the snapshot.
        /// </summary>
        [Input("dbClusterIdentifier", required: true)]
        public Input<string> DbClusterIdentifier { get; set; } = null!;

        /// <summary>
        /// The Identifier for the snapshot.
        /// </summary>
        [Input("dbClusterSnapshotIdentifier", required: true)]
        public Input<string> DbClusterSnapshotIdentifier { get; set; } = null!;

        public ClusterSnapshotArgs()
        {
        }
        public static new ClusterSnapshotArgs Empty => new ClusterSnapshotArgs();
    }

    public sealed class ClusterSnapshotState : global::Pulumi.ResourceArgs
    {
        [Input("availabilityZones")]
        private InputList<string>? _availabilityZones;

        /// <summary>
        /// List of EC2 Availability Zones that instances in the DocumentDB cluster snapshot can be restored in.
        /// </summary>
        public InputList<string> AvailabilityZones
        {
            get => _availabilityZones ?? (_availabilityZones = new InputList<string>());
            set => _availabilityZones = value;
        }

        /// <summary>
        /// The DocumentDB Cluster Identifier from which to take the snapshot.
        /// </summary>
        [Input("dbClusterIdentifier")]
        public Input<string>? DbClusterIdentifier { get; set; }

        /// <summary>
        /// The Amazon Resource Name (ARN) for the DocumentDB Cluster Snapshot.
        /// </summary>
        [Input("dbClusterSnapshotArn")]
        public Input<string>? DbClusterSnapshotArn { get; set; }

        /// <summary>
        /// The Identifier for the snapshot.
        /// </summary>
        [Input("dbClusterSnapshotIdentifier")]
        public Input<string>? DbClusterSnapshotIdentifier { get; set; }

        /// <summary>
        /// Specifies the name of the database engine.
        /// </summary>
        [Input("engine")]
        public Input<string>? Engine { get; set; }

        /// <summary>
        /// Version of the database engine for this DocumentDB cluster snapshot.
        /// </summary>
        [Input("engineVersion")]
        public Input<string>? EngineVersion { get; set; }

        /// <summary>
        /// If storage_encrypted is true, the AWS KMS key identifier for the encrypted DocumentDB cluster snapshot.
        /// </summary>
        [Input("kmsKeyId")]
        public Input<string>? KmsKeyId { get; set; }

        /// <summary>
        /// Port that the DocumentDB cluster was listening on at the time of the snapshot.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        [Input("snapshotType")]
        public Input<string>? SnapshotType { get; set; }

        [Input("sourceDbClusterSnapshotArn")]
        public Input<string>? SourceDbClusterSnapshotArn { get; set; }

        /// <summary>
        /// The status of this DocumentDB Cluster Snapshot.
        /// </summary>
        [Input("status")]
        public Input<string>? Status { get; set; }

        /// <summary>
        /// Specifies whether the DocumentDB cluster snapshot is encrypted.
        /// </summary>
        [Input("storageEncrypted")]
        public Input<bool>? StorageEncrypted { get; set; }

        /// <summary>
        /// The VPC ID associated with the DocumentDB cluster snapshot.
        /// </summary>
        [Input("vpcId")]
        public Input<string>? VpcId { get; set; }

        public ClusterSnapshotState()
        {
        }
        public static new ClusterSnapshotState Empty => new ClusterSnapshotState();
    }
}
