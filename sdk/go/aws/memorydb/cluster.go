// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package memorydb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a MemoryDB Cluster.
//
// More information about MemoryDB can be found in the [Developer Guide](https://docs.aws.amazon.com/memorydb/latest/devguide/what-is-memorydb-for-redis.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/memorydb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := memorydb.NewCluster(ctx, "example", &memorydb.ClusterArgs{
//				AclName:   pulumi.String("open-access"),
//				Name:      pulumi.String("my-cluster"),
//				NodeType:  pulumi.String("db.t4g.small"),
//				NumShards: pulumi.Int(2),
//				SecurityGroupIds: pulumi.StringArray{
//					exampleAwsSecurityGroup.Id,
//				},
//				SnapshotRetentionLimit: pulumi.Int(7),
//				SubnetGroupName:        pulumi.Any(exampleAwsMemorydbSubnetGroup.Id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// Using `pulumi import`, import a cluster using the `name`. For example:
//
// ```sh
//
//	$ pulumi import aws:memorydb/cluster:Cluster example my-cluster
//
// ```
type Cluster struct {
	pulumi.CustomResourceState

	// The name of the Access Control List to associate with the cluster.
	AclName pulumi.StringOutput `pulumi:"aclName"`
	// The ARN of the cluster.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
	AutoMinorVersionUpgrade pulumi.BoolPtrOutput              `pulumi:"autoMinorVersionUpgrade"`
	ClusterEndpoints        ClusterClusterEndpointArrayOutput `pulumi:"clusterEndpoints"`
	// Enables data tiering. This option is not supported by all instance types. For more information, see [Data tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html).
	DataTiering pulumi.BoolPtrOutput `pulumi:"dataTiering"`
	// Description for the cluster.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Patch version number of the Redis engine used by the cluster.
	EnginePatchVersion pulumi.StringOutput `pulumi:"enginePatchVersion"`
	// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
	EngineVersion pulumi.StringOutput `pulumi:"engineVersion"`
	// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
	FinalSnapshotName pulumi.StringPtrOutput `pulumi:"finalSnapshotName"`
	// ARN of the KMS key used to encrypt the cluster at rest.
	KmsKeyArn pulumi.StringPtrOutput `pulumi:"kmsKeyArn"`
	// Specifies the weekly time range during which maintenance on the cluster is performed. Specify as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
	MaintenanceWindow pulumi.StringOutput `pulumi:"maintenanceWindow"`
	// Name of the cluster. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name pulumi.StringOutput `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringOutput `pulumi:"namePrefix"`
	// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
	//
	// The following arguments are optional:
	NodeType pulumi.StringOutput `pulumi:"nodeType"`
	// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
	NumReplicasPerShard pulumi.IntPtrOutput `pulumi:"numReplicasPerShard"`
	// The number of shards in the cluster. Defaults to `1`.
	NumShards pulumi.IntPtrOutput `pulumi:"numShards"`
	// The name of the parameter group associated with the cluster.
	ParameterGroupName pulumi.StringOutput `pulumi:"parameterGroupName"`
	// The port number on which each of the nodes accepts connections. Defaults to `6379`.
	Port pulumi.IntOutput `pulumi:"port"`
	// Set of VPC Security Group ID-s to associate with this cluster.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// Set of shards in this cluster.
	Shards ClusterShardArrayOutput `pulumi:"shards"`
	// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
	SnapshotArns pulumi.StringArrayOutput `pulumi:"snapshotArns"`
	// The name of a snapshot from which to restore data into the new cluster.
	SnapshotName pulumi.StringPtrOutput `pulumi:"snapshotName"`
	// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
	SnapshotRetentionLimit pulumi.IntOutput `pulumi:"snapshotRetentionLimit"`
	// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
	SnapshotWindow pulumi.StringOutput `pulumi:"snapshotWindow"`
	// ARN of the SNS topic to which cluster notifications are sent.
	SnsTopicArn pulumi.StringPtrOutput `pulumi:"snsTopicArn"`
	// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
	SubnetGroupName pulumi.StringOutput `pulumi:"subnetGroupName"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// A flag to enable in-transit encryption on the cluster. When set to `false`, the `aclName` must be `open-access`. Defaults to `true`.
	TlsEnabled pulumi.BoolPtrOutput `pulumi:"tlsEnabled"`
}

// NewCluster registers a new resource with the given unique name, arguments, and options.
func NewCluster(ctx *pulumi.Context,
	name string, args *ClusterArgs, opts ...pulumi.ResourceOption) (*Cluster, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AclName == nil {
		return nil, errors.New("invalid value for required argument 'AclName'")
	}
	if args.NodeType == nil {
		return nil, errors.New("invalid value for required argument 'NodeType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Cluster
	err := ctx.RegisterResource("aws:memorydb/cluster:Cluster", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetCluster gets an existing Cluster resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetCluster(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterState, opts ...pulumi.ResourceOption) (*Cluster, error) {
	var resource Cluster
	err := ctx.ReadResource("aws:memorydb/cluster:Cluster", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Cluster resources.
type clusterState struct {
	// The name of the Access Control List to associate with the cluster.
	AclName *string `pulumi:"aclName"`
	// The ARN of the cluster.
	Arn *string `pulumi:"arn"`
	// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
	AutoMinorVersionUpgrade *bool                    `pulumi:"autoMinorVersionUpgrade"`
	ClusterEndpoints        []ClusterClusterEndpoint `pulumi:"clusterEndpoints"`
	// Enables data tiering. This option is not supported by all instance types. For more information, see [Data tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html).
	DataTiering *bool `pulumi:"dataTiering"`
	// Description for the cluster.
	Description *string `pulumi:"description"`
	// Patch version number of the Redis engine used by the cluster.
	EnginePatchVersion *string `pulumi:"enginePatchVersion"`
	// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
	EngineVersion *string `pulumi:"engineVersion"`
	// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
	FinalSnapshotName *string `pulumi:"finalSnapshotName"`
	// ARN of the KMS key used to encrypt the cluster at rest.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// Specifies the weekly time range during which maintenance on the cluster is performed. Specify as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
	MaintenanceWindow *string `pulumi:"maintenanceWindow"`
	// Name of the cluster. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
	//
	// The following arguments are optional:
	NodeType *string `pulumi:"nodeType"`
	// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
	NumReplicasPerShard *int `pulumi:"numReplicasPerShard"`
	// The number of shards in the cluster. Defaults to `1`.
	NumShards *int `pulumi:"numShards"`
	// The name of the parameter group associated with the cluster.
	ParameterGroupName *string `pulumi:"parameterGroupName"`
	// The port number on which each of the nodes accepts connections. Defaults to `6379`.
	Port *int `pulumi:"port"`
	// Set of VPC Security Group ID-s to associate with this cluster.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// Set of shards in this cluster.
	Shards []ClusterShard `pulumi:"shards"`
	// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
	SnapshotArns []string `pulumi:"snapshotArns"`
	// The name of a snapshot from which to restore data into the new cluster.
	SnapshotName *string `pulumi:"snapshotName"`
	// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
	SnapshotRetentionLimit *int `pulumi:"snapshotRetentionLimit"`
	// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
	SnapshotWindow *string `pulumi:"snapshotWindow"`
	// ARN of the SNS topic to which cluster notifications are sent.
	SnsTopicArn *string `pulumi:"snsTopicArn"`
	// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
	SubnetGroupName *string `pulumi:"subnetGroupName"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// A flag to enable in-transit encryption on the cluster. When set to `false`, the `aclName` must be `open-access`. Defaults to `true`.
	TlsEnabled *bool `pulumi:"tlsEnabled"`
}

type ClusterState struct {
	// The name of the Access Control List to associate with the cluster.
	AclName pulumi.StringPtrInput
	// The ARN of the cluster.
	Arn pulumi.StringPtrInput
	// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
	AutoMinorVersionUpgrade pulumi.BoolPtrInput
	ClusterEndpoints        ClusterClusterEndpointArrayInput
	// Enables data tiering. This option is not supported by all instance types. For more information, see [Data tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html).
	DataTiering pulumi.BoolPtrInput
	// Description for the cluster.
	Description pulumi.StringPtrInput
	// Patch version number of the Redis engine used by the cluster.
	EnginePatchVersion pulumi.StringPtrInput
	// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
	EngineVersion pulumi.StringPtrInput
	// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
	FinalSnapshotName pulumi.StringPtrInput
	// ARN of the KMS key used to encrypt the cluster at rest.
	KmsKeyArn pulumi.StringPtrInput
	// Specifies the weekly time range during which maintenance on the cluster is performed. Specify as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
	MaintenanceWindow pulumi.StringPtrInput
	// Name of the cluster. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
	//
	// The following arguments are optional:
	NodeType pulumi.StringPtrInput
	// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
	NumReplicasPerShard pulumi.IntPtrInput
	// The number of shards in the cluster. Defaults to `1`.
	NumShards pulumi.IntPtrInput
	// The name of the parameter group associated with the cluster.
	ParameterGroupName pulumi.StringPtrInput
	// The port number on which each of the nodes accepts connections. Defaults to `6379`.
	Port pulumi.IntPtrInput
	// Set of VPC Security Group ID-s to associate with this cluster.
	SecurityGroupIds pulumi.StringArrayInput
	// Set of shards in this cluster.
	Shards ClusterShardArrayInput
	// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
	SnapshotArns pulumi.StringArrayInput
	// The name of a snapshot from which to restore data into the new cluster.
	SnapshotName pulumi.StringPtrInput
	// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
	SnapshotRetentionLimit pulumi.IntPtrInput
	// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
	SnapshotWindow pulumi.StringPtrInput
	// ARN of the SNS topic to which cluster notifications are sent.
	SnsTopicArn pulumi.StringPtrInput
	// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
	SubnetGroupName pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// A flag to enable in-transit encryption on the cluster. When set to `false`, the `aclName` must be `open-access`. Defaults to `true`.
	TlsEnabled pulumi.BoolPtrInput
}

func (ClusterState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterState)(nil)).Elem()
}

type clusterArgs struct {
	// The name of the Access Control List to associate with the cluster.
	AclName string `pulumi:"aclName"`
	// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
	AutoMinorVersionUpgrade *bool `pulumi:"autoMinorVersionUpgrade"`
	// Enables data tiering. This option is not supported by all instance types. For more information, see [Data tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html).
	DataTiering *bool `pulumi:"dataTiering"`
	// Description for the cluster.
	Description *string `pulumi:"description"`
	// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
	EngineVersion *string `pulumi:"engineVersion"`
	// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
	FinalSnapshotName *string `pulumi:"finalSnapshotName"`
	// ARN of the KMS key used to encrypt the cluster at rest.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// Specifies the weekly time range during which maintenance on the cluster is performed. Specify as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
	MaintenanceWindow *string `pulumi:"maintenanceWindow"`
	// Name of the cluster. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
	//
	// The following arguments are optional:
	NodeType string `pulumi:"nodeType"`
	// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
	NumReplicasPerShard *int `pulumi:"numReplicasPerShard"`
	// The number of shards in the cluster. Defaults to `1`.
	NumShards *int `pulumi:"numShards"`
	// The name of the parameter group associated with the cluster.
	ParameterGroupName *string `pulumi:"parameterGroupName"`
	// The port number on which each of the nodes accepts connections. Defaults to `6379`.
	Port *int `pulumi:"port"`
	// Set of VPC Security Group ID-s to associate with this cluster.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
	SnapshotArns []string `pulumi:"snapshotArns"`
	// The name of a snapshot from which to restore data into the new cluster.
	SnapshotName *string `pulumi:"snapshotName"`
	// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
	SnapshotRetentionLimit *int `pulumi:"snapshotRetentionLimit"`
	// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
	SnapshotWindow *string `pulumi:"snapshotWindow"`
	// ARN of the SNS topic to which cluster notifications are sent.
	SnsTopicArn *string `pulumi:"snsTopicArn"`
	// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
	SubnetGroupName *string `pulumi:"subnetGroupName"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A flag to enable in-transit encryption on the cluster. When set to `false`, the `aclName` must be `open-access`. Defaults to `true`.
	TlsEnabled *bool `pulumi:"tlsEnabled"`
}

// The set of arguments for constructing a Cluster resource.
type ClusterArgs struct {
	// The name of the Access Control List to associate with the cluster.
	AclName pulumi.StringInput
	// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
	AutoMinorVersionUpgrade pulumi.BoolPtrInput
	// Enables data tiering. This option is not supported by all instance types. For more information, see [Data tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html).
	DataTiering pulumi.BoolPtrInput
	// Description for the cluster.
	Description pulumi.StringPtrInput
	// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
	EngineVersion pulumi.StringPtrInput
	// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
	FinalSnapshotName pulumi.StringPtrInput
	// ARN of the KMS key used to encrypt the cluster at rest.
	KmsKeyArn pulumi.StringPtrInput
	// Specifies the weekly time range during which maintenance on the cluster is performed. Specify as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
	MaintenanceWindow pulumi.StringPtrInput
	// Name of the cluster. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
	//
	// The following arguments are optional:
	NodeType pulumi.StringInput
	// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
	NumReplicasPerShard pulumi.IntPtrInput
	// The number of shards in the cluster. Defaults to `1`.
	NumShards pulumi.IntPtrInput
	// The name of the parameter group associated with the cluster.
	ParameterGroupName pulumi.StringPtrInput
	// The port number on which each of the nodes accepts connections. Defaults to `6379`.
	Port pulumi.IntPtrInput
	// Set of VPC Security Group ID-s to associate with this cluster.
	SecurityGroupIds pulumi.StringArrayInput
	// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
	SnapshotArns pulumi.StringArrayInput
	// The name of a snapshot from which to restore data into the new cluster.
	SnapshotName pulumi.StringPtrInput
	// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
	SnapshotRetentionLimit pulumi.IntPtrInput
	// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
	SnapshotWindow pulumi.StringPtrInput
	// ARN of the SNS topic to which cluster notifications are sent.
	SnsTopicArn pulumi.StringPtrInput
	// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
	SubnetGroupName pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A flag to enable in-transit encryption on the cluster. When set to `false`, the `aclName` must be `open-access`. Defaults to `true`.
	TlsEnabled pulumi.BoolPtrInput
}

func (ClusterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterArgs)(nil)).Elem()
}

type ClusterInput interface {
	pulumi.Input

	ToClusterOutput() ClusterOutput
	ToClusterOutputWithContext(ctx context.Context) ClusterOutput
}

func (*Cluster) ElementType() reflect.Type {
	return reflect.TypeOf((**Cluster)(nil)).Elem()
}

func (i *Cluster) ToClusterOutput() ClusterOutput {
	return i.ToClusterOutputWithContext(context.Background())
}

func (i *Cluster) ToClusterOutputWithContext(ctx context.Context) ClusterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterOutput)
}

// ClusterArrayInput is an input type that accepts ClusterArray and ClusterArrayOutput values.
// You can construct a concrete instance of `ClusterArrayInput` via:
//
//	ClusterArray{ ClusterArgs{...} }
type ClusterArrayInput interface {
	pulumi.Input

	ToClusterArrayOutput() ClusterArrayOutput
	ToClusterArrayOutputWithContext(context.Context) ClusterArrayOutput
}

type ClusterArray []ClusterInput

func (ClusterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Cluster)(nil)).Elem()
}

func (i ClusterArray) ToClusterArrayOutput() ClusterArrayOutput {
	return i.ToClusterArrayOutputWithContext(context.Background())
}

func (i ClusterArray) ToClusterArrayOutputWithContext(ctx context.Context) ClusterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterArrayOutput)
}

// ClusterMapInput is an input type that accepts ClusterMap and ClusterMapOutput values.
// You can construct a concrete instance of `ClusterMapInput` via:
//
//	ClusterMap{ "key": ClusterArgs{...} }
type ClusterMapInput interface {
	pulumi.Input

	ToClusterMapOutput() ClusterMapOutput
	ToClusterMapOutputWithContext(context.Context) ClusterMapOutput
}

type ClusterMap map[string]ClusterInput

func (ClusterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Cluster)(nil)).Elem()
}

func (i ClusterMap) ToClusterMapOutput() ClusterMapOutput {
	return i.ToClusterMapOutputWithContext(context.Background())
}

func (i ClusterMap) ToClusterMapOutputWithContext(ctx context.Context) ClusterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterMapOutput)
}

type ClusterOutput struct{ *pulumi.OutputState }

func (ClusterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Cluster)(nil)).Elem()
}

func (o ClusterOutput) ToClusterOutput() ClusterOutput {
	return o
}

func (o ClusterOutput) ToClusterOutputWithContext(ctx context.Context) ClusterOutput {
	return o
}

// The name of the Access Control List to associate with the cluster.
func (o ClusterOutput) AclName() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.AclName }).(pulumi.StringOutput)
}

// The ARN of the cluster.
func (o ClusterOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// When set to `true`, the cluster will automatically receive minor engine version upgrades after launch. Defaults to `true`.
func (o ClusterOutput) AutoMinorVersionUpgrade() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.BoolPtrOutput { return v.AutoMinorVersionUpgrade }).(pulumi.BoolPtrOutput)
}

func (o ClusterOutput) ClusterEndpoints() ClusterClusterEndpointArrayOutput {
	return o.ApplyT(func(v *Cluster) ClusterClusterEndpointArrayOutput { return v.ClusterEndpoints }).(ClusterClusterEndpointArrayOutput)
}

// Enables data tiering. This option is not supported by all instance types. For more information, see [Data tiering](https://docs.aws.amazon.com/memorydb/latest/devguide/data-tiering.html).
func (o ClusterOutput) DataTiering() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.BoolPtrOutput { return v.DataTiering }).(pulumi.BoolPtrOutput)
}

// Description for the cluster.
func (o ClusterOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Patch version number of the Redis engine used by the cluster.
func (o ClusterOutput) EnginePatchVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.EnginePatchVersion }).(pulumi.StringOutput)
}

// Version number of the Redis engine to be used for the cluster. Downgrades are not supported.
func (o ClusterOutput) EngineVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.EngineVersion }).(pulumi.StringOutput)
}

// Name of the final cluster snapshot to be created when this resource is deleted. If omitted, no final snapshot will be made.
func (o ClusterOutput) FinalSnapshotName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringPtrOutput { return v.FinalSnapshotName }).(pulumi.StringPtrOutput)
}

// ARN of the KMS key used to encrypt the cluster at rest.
func (o ClusterOutput) KmsKeyArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringPtrOutput { return v.KmsKeyArn }).(pulumi.StringPtrOutput)
}

// Specifies the weekly time range during which maintenance on the cluster is performed. Specify as a range in the format `ddd:hh24:mi-ddd:hh24:mi` (24H Clock UTC). The minimum maintenance window is a 60 minute period. Example: `sun:23:00-mon:01:30`.
func (o ClusterOutput) MaintenanceWindow() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.MaintenanceWindow }).(pulumi.StringOutput)
}

// Name of the cluster. If omitted, the provider will assign a random, unique name. Conflicts with `namePrefix`.
func (o ClusterOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
func (o ClusterOutput) NamePrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.NamePrefix }).(pulumi.StringOutput)
}

// The compute and memory capacity of the nodes in the cluster. See AWS documentation on [supported node types](https://docs.aws.amazon.com/memorydb/latest/devguide/nodes.supportedtypes.html) as well as [vertical scaling](https://docs.aws.amazon.com/memorydb/latest/devguide/cluster-vertical-scaling.html).
//
// The following arguments are optional:
func (o ClusterOutput) NodeType() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.NodeType }).(pulumi.StringOutput)
}

// The number of replicas to apply to each shard, up to a maximum of 5. Defaults to `1` (i.e. 2 nodes per shard).
func (o ClusterOutput) NumReplicasPerShard() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.IntPtrOutput { return v.NumReplicasPerShard }).(pulumi.IntPtrOutput)
}

// The number of shards in the cluster. Defaults to `1`.
func (o ClusterOutput) NumShards() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.IntPtrOutput { return v.NumShards }).(pulumi.IntPtrOutput)
}

// The name of the parameter group associated with the cluster.
func (o ClusterOutput) ParameterGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.ParameterGroupName }).(pulumi.StringOutput)
}

// The port number on which each of the nodes accepts connections. Defaults to `6379`.
func (o ClusterOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v *Cluster) pulumi.IntOutput { return v.Port }).(pulumi.IntOutput)
}

// Set of VPC Security Group ID-s to associate with this cluster.
func (o ClusterOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringArrayOutput { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// Set of shards in this cluster.
func (o ClusterOutput) Shards() ClusterShardArrayOutput {
	return o.ApplyT(func(v *Cluster) ClusterShardArrayOutput { return v.Shards }).(ClusterShardArrayOutput)
}

// List of ARN-s that uniquely identify RDB snapshot files stored in S3. The snapshot files will be used to populate the new cluster. Object names in the ARN-s cannot contain any commas.
func (o ClusterOutput) SnapshotArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringArrayOutput { return v.SnapshotArns }).(pulumi.StringArrayOutput)
}

// The name of a snapshot from which to restore data into the new cluster.
func (o ClusterOutput) SnapshotName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringPtrOutput { return v.SnapshotName }).(pulumi.StringPtrOutput)
}

// The number of days for which MemoryDB retains automatic snapshots before deleting them. When set to `0`, automatic backups are disabled. Defaults to `0`.
func (o ClusterOutput) SnapshotRetentionLimit() pulumi.IntOutput {
	return o.ApplyT(func(v *Cluster) pulumi.IntOutput { return v.SnapshotRetentionLimit }).(pulumi.IntOutput)
}

// The daily time range (in UTC) during which MemoryDB begins taking a daily snapshot of your shard. Example: `05:00-09:00`.
func (o ClusterOutput) SnapshotWindow() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.SnapshotWindow }).(pulumi.StringOutput)
}

// ARN of the SNS topic to which cluster notifications are sent.
func (o ClusterOutput) SnsTopicArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringPtrOutput { return v.SnsTopicArn }).(pulumi.StringPtrOutput)
}

// The name of the subnet group to be used for the cluster. Defaults to a subnet group consisting of default VPC subnets.
func (o ClusterOutput) SubnetGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringOutput { return v.SubnetGroupName }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ClusterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ClusterOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Cluster) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// A flag to enable in-transit encryption on the cluster. When set to `false`, the `aclName` must be `open-access`. Defaults to `true`.
func (o ClusterOutput) TlsEnabled() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Cluster) pulumi.BoolPtrOutput { return v.TlsEnabled }).(pulumi.BoolPtrOutput)
}

type ClusterArrayOutput struct{ *pulumi.OutputState }

func (ClusterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Cluster)(nil)).Elem()
}

func (o ClusterArrayOutput) ToClusterArrayOutput() ClusterArrayOutput {
	return o
}

func (o ClusterArrayOutput) ToClusterArrayOutputWithContext(ctx context.Context) ClusterArrayOutput {
	return o
}

func (o ClusterArrayOutput) Index(i pulumi.IntInput) ClusterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Cluster {
		return vs[0].([]*Cluster)[vs[1].(int)]
	}).(ClusterOutput)
}

type ClusterMapOutput struct{ *pulumi.OutputState }

func (ClusterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Cluster)(nil)).Elem()
}

func (o ClusterMapOutput) ToClusterMapOutput() ClusterMapOutput {
	return o
}

func (o ClusterMapOutput) ToClusterMapOutputWithContext(ctx context.Context) ClusterMapOutput {
	return o
}

func (o ClusterMapOutput) MapIndex(k pulumi.StringInput) ClusterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Cluster {
		return vs[0].(map[string]*Cluster)[vs[1].(string)]
	}).(ClusterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterInput)(nil)).Elem(), &Cluster{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterArrayInput)(nil)).Elem(), ClusterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterMapInput)(nil)).Elem(), ClusterMap{})
	pulumi.RegisterOutputType(ClusterOutput{})
	pulumi.RegisterOutputType(ClusterArrayOutput{})
	pulumi.RegisterOutputType(ClusterMapOutput{})
}
