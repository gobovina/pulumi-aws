// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Rds
{
    public static class GetSnapshot
    {
        /// <summary>
        /// Use this data source to get information about a DB Snapshot for use when provisioning DB instances
        /// 
        /// &gt; **NOTE:** This data source does not apply to snapshots created on Aurora DB clusters.
        /// See the `aws.rds.ClusterSnapshot` data source for DB Cluster snapshots.
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
        ///     var prod = new Aws.Rds.Instance("prod", new()
        ///     {
        ///         AllocatedStorage = 10,
        ///         Engine = "mysql",
        ///         EngineVersion = "5.6.17",
        ///         InstanceClass = "db.t2.micro",
        ///         DbName = "mydb",
        ///         Username = "foo",
        ///         Password = "bar",
        ///         DbSubnetGroupName = "my_database_subnet_group",
        ///         ParameterGroupName = "default.mysql5.6",
        ///     });
        /// 
        ///     var latestProdSnapshot = Aws.Rds.GetSnapshot.Invoke(new()
        ///     {
        ///         DbInstanceIdentifier = prod.Identifier,
        ///         MostRecent = true,
        ///     });
        /// 
        ///     // Use the latest production snapshot to create a dev instance.
        ///     var dev = new Aws.Rds.Instance("dev", new()
        ///     {
        ///         InstanceClass = "db.t2.micro",
        ///         DbName = "mydbdev",
        ///         SnapshotIdentifier = latestProdSnapshot.Apply(getSnapshotResult =&gt; getSnapshotResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetSnapshotResult> InvokeAsync(GetSnapshotArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetSnapshotResult>("aws:rds/getSnapshot:getSnapshot", args ?? new GetSnapshotArgs(), options.WithDefaults());

        /// <summary>
        /// Use this data source to get information about a DB Snapshot for use when provisioning DB instances
        /// 
        /// &gt; **NOTE:** This data source does not apply to snapshots created on Aurora DB clusters.
        /// See the `aws.rds.ClusterSnapshot` data source for DB Cluster snapshots.
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
        ///     var prod = new Aws.Rds.Instance("prod", new()
        ///     {
        ///         AllocatedStorage = 10,
        ///         Engine = "mysql",
        ///         EngineVersion = "5.6.17",
        ///         InstanceClass = "db.t2.micro",
        ///         DbName = "mydb",
        ///         Username = "foo",
        ///         Password = "bar",
        ///         DbSubnetGroupName = "my_database_subnet_group",
        ///         ParameterGroupName = "default.mysql5.6",
        ///     });
        /// 
        ///     var latestProdSnapshot = Aws.Rds.GetSnapshot.Invoke(new()
        ///     {
        ///         DbInstanceIdentifier = prod.Identifier,
        ///         MostRecent = true,
        ///     });
        /// 
        ///     // Use the latest production snapshot to create a dev instance.
        ///     var dev = new Aws.Rds.Instance("dev", new()
        ///     {
        ///         InstanceClass = "db.t2.micro",
        ///         DbName = "mydbdev",
        ///         SnapshotIdentifier = latestProdSnapshot.Apply(getSnapshotResult =&gt; getSnapshotResult.Id),
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetSnapshotResult> Invoke(GetSnapshotInvokeArgs? args = null, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetSnapshotResult>("aws:rds/getSnapshot:getSnapshot", args ?? new GetSnapshotInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetSnapshotArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Returns the list of snapshots created by the specific db_instance
        /// </summary>
        [Input("dbInstanceIdentifier")]
        public string? DbInstanceIdentifier { get; set; }

        /// <summary>
        /// Returns information on a specific snapshot_id.
        /// </summary>
        [Input("dbSnapshotIdentifier")]
        public string? DbSnapshotIdentifier { get; set; }

        /// <summary>
        /// Set this value to true to include manual DB snapshots that are public and can be
        /// copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
        /// </summary>
        [Input("includePublic")]
        public bool? IncludePublic { get; set; }

        /// <summary>
        /// Set this value to true to include shared manual DB snapshots from other
        /// AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
        /// The default is `false`.
        /// </summary>
        [Input("includeShared")]
        public bool? IncludeShared { get; set; }

        /// <summary>
        /// If more than one result is returned, use the most
        /// recent Snapshot.
        /// </summary>
        [Input("mostRecent")]
        public bool? MostRecent { get; set; }

        /// <summary>
        /// Type of snapshots to be returned. If you don't specify a SnapshotType
        /// value, then both automated and manual snapshots are returned. Shared and public DB snapshots are not
        /// included in the returned results by default. Possible values are, `automated`, `manual`, `shared`, `public` and `awsbackup`.
        /// </summary>
        [Input("snapshotType")]
        public string? SnapshotType { get; set; }

        [Input("tags")]
        private Dictionary<string, string>? _tags;

        /// <summary>
        /// Mapping of tags, each pair of which must exactly match
        /// a pair on the desired DB snapshot.
        /// </summary>
        public Dictionary<string, string> Tags
        {
            get => _tags ?? (_tags = new Dictionary<string, string>());
            set => _tags = value;
        }

        public GetSnapshotArgs()
        {
        }
        public static new GetSnapshotArgs Empty => new GetSnapshotArgs();
    }

    public sealed class GetSnapshotInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Returns the list of snapshots created by the specific db_instance
        /// </summary>
        [Input("dbInstanceIdentifier")]
        public Input<string>? DbInstanceIdentifier { get; set; }

        /// <summary>
        /// Returns information on a specific snapshot_id.
        /// </summary>
        [Input("dbSnapshotIdentifier")]
        public Input<string>? DbSnapshotIdentifier { get; set; }

        /// <summary>
        /// Set this value to true to include manual DB snapshots that are public and can be
        /// copied or restored by any AWS account, otherwise set this value to false. The default is `false`.
        /// </summary>
        [Input("includePublic")]
        public Input<bool>? IncludePublic { get; set; }

        /// <summary>
        /// Set this value to true to include shared manual DB snapshots from other
        /// AWS accounts that this AWS account has been given permission to copy or restore, otherwise set this value to false.
        /// The default is `false`.
        /// </summary>
        [Input("includeShared")]
        public Input<bool>? IncludeShared { get; set; }

        /// <summary>
        /// If more than one result is returned, use the most
        /// recent Snapshot.
        /// </summary>
        [Input("mostRecent")]
        public Input<bool>? MostRecent { get; set; }

        /// <summary>
        /// Type of snapshots to be returned. If you don't specify a SnapshotType
        /// value, then both automated and manual snapshots are returned. Shared and public DB snapshots are not
        /// included in the returned results by default. Possible values are, `automated`, `manual`, `shared`, `public` and `awsbackup`.
        /// </summary>
        [Input("snapshotType")]
        public Input<string>? SnapshotType { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Mapping of tags, each pair of which must exactly match
        /// a pair on the desired DB snapshot.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public GetSnapshotInvokeArgs()
        {
        }
        public static new GetSnapshotInvokeArgs Empty => new GetSnapshotInvokeArgs();
    }


    [OutputType]
    public sealed class GetSnapshotResult
    {
        /// <summary>
        /// Allocated storage size in gigabytes (GB).
        /// </summary>
        public readonly int AllocatedStorage;
        /// <summary>
        /// Name of the Availability Zone the DB instance was located in at the time of the DB snapshot.
        /// </summary>
        public readonly string AvailabilityZone;
        public readonly string? DbInstanceIdentifier;
        /// <summary>
        /// ARN for the DB snapshot.
        /// </summary>
        public readonly string DbSnapshotArn;
        public readonly string? DbSnapshotIdentifier;
        /// <summary>
        /// Whether the DB snapshot is encrypted.
        /// </summary>
        public readonly bool Encrypted;
        /// <summary>
        /// Name of the database engine.
        /// </summary>
        public readonly string Engine;
        /// <summary>
        /// Version of the database engine.
        /// </summary>
        public readonly string EngineVersion;
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly bool? IncludePublic;
        public readonly bool? IncludeShared;
        /// <summary>
        /// Provisioned IOPS (I/O operations per second) value of the DB instance at the time of the snapshot.
        /// </summary>
        public readonly int Iops;
        /// <summary>
        /// ARN for the KMS encryption key.
        /// </summary>
        public readonly string KmsKeyId;
        /// <summary>
        /// License model information for the restored DB instance.
        /// </summary>
        public readonly string LicenseModel;
        public readonly bool? MostRecent;
        /// <summary>
        /// Provides the option group name for the DB snapshot.
        /// </summary>
        public readonly string OptionGroupName;
        public readonly int Port;
        /// <summary>
        /// Provides the time when the snapshot was taken, in Universal Coordinated Time (UTC).
        /// </summary>
        public readonly string SnapshotCreateTime;
        public readonly string? SnapshotType;
        /// <summary>
        /// DB snapshot ARN that the DB snapshot was copied from. It only has value in case of cross customer or cross region copy.
        /// </summary>
        public readonly string SourceDbSnapshotIdentifier;
        /// <summary>
        /// Region that the DB snapshot was created in or copied from.
        /// </summary>
        public readonly string SourceRegion;
        /// <summary>
        /// Status of this DB snapshot.
        /// </summary>
        public readonly string Status;
        /// <summary>
        /// Storage type associated with DB snapshot.
        /// </summary>
        public readonly string StorageType;
        public readonly ImmutableDictionary<string, string> Tags;
        /// <summary>
        /// ID of the VPC associated with the DB snapshot.
        /// </summary>
        public readonly string VpcId;

        [OutputConstructor]
        private GetSnapshotResult(
            int allocatedStorage,

            string availabilityZone,

            string? dbInstanceIdentifier,

            string dbSnapshotArn,

            string? dbSnapshotIdentifier,

            bool encrypted,

            string engine,

            string engineVersion,

            string id,

            bool? includePublic,

            bool? includeShared,

            int iops,

            string kmsKeyId,

            string licenseModel,

            bool? mostRecent,

            string optionGroupName,

            int port,

            string snapshotCreateTime,

            string? snapshotType,

            string sourceDbSnapshotIdentifier,

            string sourceRegion,

            string status,

            string storageType,

            ImmutableDictionary<string, string> tags,

            string vpcId)
        {
            AllocatedStorage = allocatedStorage;
            AvailabilityZone = availabilityZone;
            DbInstanceIdentifier = dbInstanceIdentifier;
            DbSnapshotArn = dbSnapshotArn;
            DbSnapshotIdentifier = dbSnapshotIdentifier;
            Encrypted = encrypted;
            Engine = engine;
            EngineVersion = engineVersion;
            Id = id;
            IncludePublic = includePublic;
            IncludeShared = includeShared;
            Iops = iops;
            KmsKeyId = kmsKeyId;
            LicenseModel = licenseModel;
            MostRecent = mostRecent;
            OptionGroupName = optionGroupName;
            Port = port;
            SnapshotCreateTime = snapshotCreateTime;
            SnapshotType = snapshotType;
            SourceDbSnapshotIdentifier = sourceDbSnapshotIdentifier;
            SourceRegion = sourceRegion;
            Status = status;
            StorageType = storageType;
            Tags = tags;
            VpcId = vpcId;
        }
    }
}
