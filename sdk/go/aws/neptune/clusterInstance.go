// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package neptune

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// A Cluster Instance Resource defines attributes that are specific to a single instance in a Neptune Cluster.
//
// You can simply add neptune instances and Neptune manages the replication. You can use the count
// meta-parameter to make multiple instances and join them all to the same Neptune Cluster, or you may specify different Cluster Instance resources with various `instanceClass` sizes.
//
// ## Example Usage
//
// The following example will create a neptune cluster with two neptune instances(one writer and one reader).
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/neptune"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := neptune.NewCluster(ctx, "default", &neptune.ClusterArgs{
//				ClusterIdentifier:                pulumi.String("neptune-cluster-demo"),
//				Engine:                           pulumi.String("neptune"),
//				BackupRetentionPeriod:            pulumi.Int(5),
//				PreferredBackupWindow:            pulumi.String("07:00-09:00"),
//				SkipFinalSnapshot:                pulumi.Bool(true),
//				IamDatabaseAuthenticationEnabled: pulumi.Bool(true),
//				ApplyImmediately:                 pulumi.Bool(true),
//			})
//			if err != nil {
//				return err
//			}
//			var example []*neptune.ClusterInstance
//			for index := 0; index < 2; index++ {
//				key0 := index
//				_ := index
//				__res, err := neptune.NewClusterInstance(ctx, fmt.Sprintf("example-%v", key0), &neptune.ClusterInstanceArgs{
//					ClusterIdentifier: _default.ID(),
//					Engine:            pulumi.String("neptune"),
//					InstanceClass:     pulumi.String("db.r4.large"),
//					ApplyImmediately:  pulumi.Bool(true),
//				})
//				if err != nil {
//					return err
//				}
//				example = append(example, __res)
//			}
//			return nil
//		})
//	}
//
// ```
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import `aws_neptune_cluster_instance` using the instance identifier. For example:
//
// ```sh
// $ pulumi import aws:neptune/clusterInstance:ClusterInstance example my-instance
// ```
type ClusterInstance struct {
	pulumi.CustomResourceState

	// The hostname of the instance. See also `endpoint` and `port`.
	Address pulumi.StringOutput `pulumi:"address"`
	// Specifies whether any instance modifications
	// are applied immediately, or during the next maintenance window. Default is`false`.
	ApplyImmediately pulumi.BoolOutput `pulumi:"applyImmediately"`
	// Amazon Resource Name (ARN) of neptune instance
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
	AutoMinorVersionUpgrade pulumi.BoolPtrOutput `pulumi:"autoMinorVersionUpgrade"`
	// The EC2 Availability Zone that the neptune instance is created in.
	AvailabilityZone pulumi.StringOutput `pulumi:"availabilityZone"`
	// The identifier of the `neptune.Cluster` in which to launch this instance.
	ClusterIdentifier pulumi.StringOutput `pulumi:"clusterIdentifier"`
	// The region-unique, immutable identifier for the neptune instance.
	DbiResourceId pulumi.StringOutput `pulumi:"dbiResourceId"`
	// The connection endpoint in `address:port` format.
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
	Engine pulumi.StringPtrOutput `pulumi:"engine"`
	// The neptune engine version. Currently configuring this argumnet has no effect.
	EngineVersion pulumi.StringOutput `pulumi:"engineVersion"`
	// The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
	Identifier pulumi.StringOutput `pulumi:"identifier"`
	// Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
	IdentifierPrefix pulumi.StringOutput `pulumi:"identifierPrefix"`
	// The instance class to use.
	InstanceClass pulumi.StringOutput `pulumi:"instanceClass"`
	// The ARN for the KMS encryption key if one is set to the neptune cluster.
	KmsKeyArn pulumi.StringOutput `pulumi:"kmsKeyArn"`
	// The name of the neptune parameter group to associate with this instance.
	NeptuneParameterGroupName pulumi.StringPtrOutput `pulumi:"neptuneParameterGroupName"`
	// A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptuneSubnetGroupName` of the attached `neptune.Cluster`.
	NeptuneSubnetGroupName pulumi.StringOutput `pulumi:"neptuneSubnetGroupName"`
	// The port on which the DB accepts connections. Defaults to `8182`.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
	PreferredBackupWindow pulumi.StringOutput `pulumi:"preferredBackupWindow"`
	// The window to perform maintenance in.
	// Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
	PreferredMaintenanceWindow pulumi.StringOutput `pulumi:"preferredMaintenanceWindow"`
	// Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
	PromotionTier pulumi.IntPtrOutput `pulumi:"promotionTier"`
	// Bool to control if instance is publicly accessible. Default is `false`.
	PubliclyAccessible pulumi.BoolPtrOutput `pulumi:"publiclyAccessible"`
	// Determines whether a final DB snapshot is created before the DB instance is deleted.
	SkipFinalSnapshot pulumi.BoolPtrOutput `pulumi:"skipFinalSnapshot"`
	// Specifies whether the neptune cluster is encrypted.
	StorageEncrypted pulumi.BoolOutput `pulumi:"storageEncrypted"`
	// Storage type associated with the cluster `standard/iopt1`.
	StorageType pulumi.StringOutput `pulumi:"storageType"`
	// A map of tags to assign to the instance. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
	Writer pulumi.BoolOutput `pulumi:"writer"`
}

// NewClusterInstance registers a new resource with the given unique name, arguments, and options.
func NewClusterInstance(ctx *pulumi.Context,
	name string, args *ClusterInstanceArgs, opts ...pulumi.ResourceOption) (*ClusterInstance, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ClusterIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'ClusterIdentifier'")
	}
	if args.InstanceClass == nil {
		return nil, errors.New("invalid value for required argument 'InstanceClass'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ClusterInstance
	err := ctx.RegisterResource("aws:neptune/clusterInstance:ClusterInstance", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetClusterInstance gets an existing ClusterInstance resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetClusterInstance(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ClusterInstanceState, opts ...pulumi.ResourceOption) (*ClusterInstance, error) {
	var resource ClusterInstance
	err := ctx.ReadResource("aws:neptune/clusterInstance:ClusterInstance", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ClusterInstance resources.
type clusterInstanceState struct {
	// The hostname of the instance. See also `endpoint` and `port`.
	Address *string `pulumi:"address"`
	// Specifies whether any instance modifications
	// are applied immediately, or during the next maintenance window. Default is`false`.
	ApplyImmediately *bool `pulumi:"applyImmediately"`
	// Amazon Resource Name (ARN) of neptune instance
	Arn *string `pulumi:"arn"`
	// Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
	AutoMinorVersionUpgrade *bool `pulumi:"autoMinorVersionUpgrade"`
	// The EC2 Availability Zone that the neptune instance is created in.
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// The identifier of the `neptune.Cluster` in which to launch this instance.
	ClusterIdentifier *string `pulumi:"clusterIdentifier"`
	// The region-unique, immutable identifier for the neptune instance.
	DbiResourceId *string `pulumi:"dbiResourceId"`
	// The connection endpoint in `address:port` format.
	Endpoint *string `pulumi:"endpoint"`
	// The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
	Engine *string `pulumi:"engine"`
	// The neptune engine version. Currently configuring this argumnet has no effect.
	EngineVersion *string `pulumi:"engineVersion"`
	// The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
	Identifier *string `pulumi:"identifier"`
	// Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
	IdentifierPrefix *string `pulumi:"identifierPrefix"`
	// The instance class to use.
	InstanceClass *string `pulumi:"instanceClass"`
	// The ARN for the KMS encryption key if one is set to the neptune cluster.
	KmsKeyArn *string `pulumi:"kmsKeyArn"`
	// The name of the neptune parameter group to associate with this instance.
	NeptuneParameterGroupName *string `pulumi:"neptuneParameterGroupName"`
	// A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptuneSubnetGroupName` of the attached `neptune.Cluster`.
	NeptuneSubnetGroupName *string `pulumi:"neptuneSubnetGroupName"`
	// The port on which the DB accepts connections. Defaults to `8182`.
	Port *int `pulumi:"port"`
	// The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
	PreferredBackupWindow *string `pulumi:"preferredBackupWindow"`
	// The window to perform maintenance in.
	// Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
	PreferredMaintenanceWindow *string `pulumi:"preferredMaintenanceWindow"`
	// Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
	PromotionTier *int `pulumi:"promotionTier"`
	// Bool to control if instance is publicly accessible. Default is `false`.
	PubliclyAccessible *bool `pulumi:"publiclyAccessible"`
	// Determines whether a final DB snapshot is created before the DB instance is deleted.
	SkipFinalSnapshot *bool `pulumi:"skipFinalSnapshot"`
	// Specifies whether the neptune cluster is encrypted.
	StorageEncrypted *bool `pulumi:"storageEncrypted"`
	// Storage type associated with the cluster `standard/iopt1`.
	StorageType *string `pulumi:"storageType"`
	// A map of tags to assign to the instance. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
	Writer *bool `pulumi:"writer"`
}

type ClusterInstanceState struct {
	// The hostname of the instance. See also `endpoint` and `port`.
	Address pulumi.StringPtrInput
	// Specifies whether any instance modifications
	// are applied immediately, or during the next maintenance window. Default is`false`.
	ApplyImmediately pulumi.BoolPtrInput
	// Amazon Resource Name (ARN) of neptune instance
	Arn pulumi.StringPtrInput
	// Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
	AutoMinorVersionUpgrade pulumi.BoolPtrInput
	// The EC2 Availability Zone that the neptune instance is created in.
	AvailabilityZone pulumi.StringPtrInput
	// The identifier of the `neptune.Cluster` in which to launch this instance.
	ClusterIdentifier pulumi.StringPtrInput
	// The region-unique, immutable identifier for the neptune instance.
	DbiResourceId pulumi.StringPtrInput
	// The connection endpoint in `address:port` format.
	Endpoint pulumi.StringPtrInput
	// The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
	Engine pulumi.StringPtrInput
	// The neptune engine version. Currently configuring this argumnet has no effect.
	EngineVersion pulumi.StringPtrInput
	// The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
	Identifier pulumi.StringPtrInput
	// Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
	IdentifierPrefix pulumi.StringPtrInput
	// The instance class to use.
	InstanceClass pulumi.StringPtrInput
	// The ARN for the KMS encryption key if one is set to the neptune cluster.
	KmsKeyArn pulumi.StringPtrInput
	// The name of the neptune parameter group to associate with this instance.
	NeptuneParameterGroupName pulumi.StringPtrInput
	// A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptuneSubnetGroupName` of the attached `neptune.Cluster`.
	NeptuneSubnetGroupName pulumi.StringPtrInput
	// The port on which the DB accepts connections. Defaults to `8182`.
	Port pulumi.IntPtrInput
	// The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
	PreferredBackupWindow pulumi.StringPtrInput
	// The window to perform maintenance in.
	// Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
	PreferredMaintenanceWindow pulumi.StringPtrInput
	// Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
	PromotionTier pulumi.IntPtrInput
	// Bool to control if instance is publicly accessible. Default is `false`.
	PubliclyAccessible pulumi.BoolPtrInput
	// Determines whether a final DB snapshot is created before the DB instance is deleted.
	SkipFinalSnapshot pulumi.BoolPtrInput
	// Specifies whether the neptune cluster is encrypted.
	StorageEncrypted pulumi.BoolPtrInput
	// Storage type associated with the cluster `standard/iopt1`.
	StorageType pulumi.StringPtrInput
	// A map of tags to assign to the instance. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
	Writer pulumi.BoolPtrInput
}

func (ClusterInstanceState) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterInstanceState)(nil)).Elem()
}

type clusterInstanceArgs struct {
	// Specifies whether any instance modifications
	// are applied immediately, or during the next maintenance window. Default is`false`.
	ApplyImmediately *bool `pulumi:"applyImmediately"`
	// Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
	AutoMinorVersionUpgrade *bool `pulumi:"autoMinorVersionUpgrade"`
	// The EC2 Availability Zone that the neptune instance is created in.
	AvailabilityZone *string `pulumi:"availabilityZone"`
	// The identifier of the `neptune.Cluster` in which to launch this instance.
	ClusterIdentifier string `pulumi:"clusterIdentifier"`
	// The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
	Engine *string `pulumi:"engine"`
	// The neptune engine version. Currently configuring this argumnet has no effect.
	EngineVersion *string `pulumi:"engineVersion"`
	// The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
	Identifier *string `pulumi:"identifier"`
	// Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
	IdentifierPrefix *string `pulumi:"identifierPrefix"`
	// The instance class to use.
	InstanceClass string `pulumi:"instanceClass"`
	// The name of the neptune parameter group to associate with this instance.
	NeptuneParameterGroupName *string `pulumi:"neptuneParameterGroupName"`
	// A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptuneSubnetGroupName` of the attached `neptune.Cluster`.
	NeptuneSubnetGroupName *string `pulumi:"neptuneSubnetGroupName"`
	// The port on which the DB accepts connections. Defaults to `8182`.
	Port *int `pulumi:"port"`
	// The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
	PreferredBackupWindow *string `pulumi:"preferredBackupWindow"`
	// The window to perform maintenance in.
	// Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
	PreferredMaintenanceWindow *string `pulumi:"preferredMaintenanceWindow"`
	// Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
	PromotionTier *int `pulumi:"promotionTier"`
	// Bool to control if instance is publicly accessible. Default is `false`.
	PubliclyAccessible *bool `pulumi:"publiclyAccessible"`
	// Determines whether a final DB snapshot is created before the DB instance is deleted.
	SkipFinalSnapshot *bool `pulumi:"skipFinalSnapshot"`
	// A map of tags to assign to the instance. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ClusterInstance resource.
type ClusterInstanceArgs struct {
	// Specifies whether any instance modifications
	// are applied immediately, or during the next maintenance window. Default is`false`.
	ApplyImmediately pulumi.BoolPtrInput
	// Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
	AutoMinorVersionUpgrade pulumi.BoolPtrInput
	// The EC2 Availability Zone that the neptune instance is created in.
	AvailabilityZone pulumi.StringPtrInput
	// The identifier of the `neptune.Cluster` in which to launch this instance.
	ClusterIdentifier pulumi.StringInput
	// The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
	Engine pulumi.StringPtrInput
	// The neptune engine version. Currently configuring this argumnet has no effect.
	EngineVersion pulumi.StringPtrInput
	// The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
	Identifier pulumi.StringPtrInput
	// Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
	IdentifierPrefix pulumi.StringPtrInput
	// The instance class to use.
	InstanceClass pulumi.StringInput
	// The name of the neptune parameter group to associate with this instance.
	NeptuneParameterGroupName pulumi.StringPtrInput
	// A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptuneSubnetGroupName` of the attached `neptune.Cluster`.
	NeptuneSubnetGroupName pulumi.StringPtrInput
	// The port on which the DB accepts connections. Defaults to `8182`.
	Port pulumi.IntPtrInput
	// The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
	PreferredBackupWindow pulumi.StringPtrInput
	// The window to perform maintenance in.
	// Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
	PreferredMaintenanceWindow pulumi.StringPtrInput
	// Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
	PromotionTier pulumi.IntPtrInput
	// Bool to control if instance is publicly accessible. Default is `false`.
	PubliclyAccessible pulumi.BoolPtrInput
	// Determines whether a final DB snapshot is created before the DB instance is deleted.
	SkipFinalSnapshot pulumi.BoolPtrInput
	// A map of tags to assign to the instance. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ClusterInstanceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*clusterInstanceArgs)(nil)).Elem()
}

type ClusterInstanceInput interface {
	pulumi.Input

	ToClusterInstanceOutput() ClusterInstanceOutput
	ToClusterInstanceOutputWithContext(ctx context.Context) ClusterInstanceOutput
}

func (*ClusterInstance) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterInstance)(nil)).Elem()
}

func (i *ClusterInstance) ToClusterInstanceOutput() ClusterInstanceOutput {
	return i.ToClusterInstanceOutputWithContext(context.Background())
}

func (i *ClusterInstance) ToClusterInstanceOutputWithContext(ctx context.Context) ClusterInstanceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterInstanceOutput)
}

// ClusterInstanceArrayInput is an input type that accepts ClusterInstanceArray and ClusterInstanceArrayOutput values.
// You can construct a concrete instance of `ClusterInstanceArrayInput` via:
//
//	ClusterInstanceArray{ ClusterInstanceArgs{...} }
type ClusterInstanceArrayInput interface {
	pulumi.Input

	ToClusterInstanceArrayOutput() ClusterInstanceArrayOutput
	ToClusterInstanceArrayOutputWithContext(context.Context) ClusterInstanceArrayOutput
}

type ClusterInstanceArray []ClusterInstanceInput

func (ClusterInstanceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterInstance)(nil)).Elem()
}

func (i ClusterInstanceArray) ToClusterInstanceArrayOutput() ClusterInstanceArrayOutput {
	return i.ToClusterInstanceArrayOutputWithContext(context.Background())
}

func (i ClusterInstanceArray) ToClusterInstanceArrayOutputWithContext(ctx context.Context) ClusterInstanceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterInstanceArrayOutput)
}

// ClusterInstanceMapInput is an input type that accepts ClusterInstanceMap and ClusterInstanceMapOutput values.
// You can construct a concrete instance of `ClusterInstanceMapInput` via:
//
//	ClusterInstanceMap{ "key": ClusterInstanceArgs{...} }
type ClusterInstanceMapInput interface {
	pulumi.Input

	ToClusterInstanceMapOutput() ClusterInstanceMapOutput
	ToClusterInstanceMapOutputWithContext(context.Context) ClusterInstanceMapOutput
}

type ClusterInstanceMap map[string]ClusterInstanceInput

func (ClusterInstanceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterInstance)(nil)).Elem()
}

func (i ClusterInstanceMap) ToClusterInstanceMapOutput() ClusterInstanceMapOutput {
	return i.ToClusterInstanceMapOutputWithContext(context.Background())
}

func (i ClusterInstanceMap) ToClusterInstanceMapOutputWithContext(ctx context.Context) ClusterInstanceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ClusterInstanceMapOutput)
}

type ClusterInstanceOutput struct{ *pulumi.OutputState }

func (ClusterInstanceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ClusterInstance)(nil)).Elem()
}

func (o ClusterInstanceOutput) ToClusterInstanceOutput() ClusterInstanceOutput {
	return o
}

func (o ClusterInstanceOutput) ToClusterInstanceOutputWithContext(ctx context.Context) ClusterInstanceOutput {
	return o
}

// The hostname of the instance. See also `endpoint` and `port`.
func (o ClusterInstanceOutput) Address() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.Address }).(pulumi.StringOutput)
}

// Specifies whether any instance modifications
// are applied immediately, or during the next maintenance window. Default is`false`.
func (o ClusterInstanceOutput) ApplyImmediately() pulumi.BoolOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.BoolOutput { return v.ApplyImmediately }).(pulumi.BoolOutput)
}

// Amazon Resource Name (ARN) of neptune instance
func (o ClusterInstanceOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Indicates that minor engine upgrades will be applied automatically to the instance during the maintenance window. Default is `true`.
func (o ClusterInstanceOutput) AutoMinorVersionUpgrade() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.BoolPtrOutput { return v.AutoMinorVersionUpgrade }).(pulumi.BoolPtrOutput)
}

// The EC2 Availability Zone that the neptune instance is created in.
func (o ClusterInstanceOutput) AvailabilityZone() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.AvailabilityZone }).(pulumi.StringOutput)
}

// The identifier of the `neptune.Cluster` in which to launch this instance.
func (o ClusterInstanceOutput) ClusterIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.ClusterIdentifier }).(pulumi.StringOutput)
}

// The region-unique, immutable identifier for the neptune instance.
func (o ClusterInstanceOutput) DbiResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.DbiResourceId }).(pulumi.StringOutput)
}

// The connection endpoint in `address:port` format.
func (o ClusterInstanceOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.Endpoint }).(pulumi.StringOutput)
}

// The name of the database engine to be used for the neptune instance. Defaults to `neptune`. Valid Values: `neptune`.
func (o ClusterInstanceOutput) Engine() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringPtrOutput { return v.Engine }).(pulumi.StringPtrOutput)
}

// The neptune engine version. Currently configuring this argumnet has no effect.
func (o ClusterInstanceOutput) EngineVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.EngineVersion }).(pulumi.StringOutput)
}

// The identifier for the neptune instance, if omitted, this provider will assign a random, unique identifier.
func (o ClusterInstanceOutput) Identifier() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.Identifier }).(pulumi.StringOutput)
}

// Creates a unique identifier beginning with the specified prefix. Conflicts with `identifier`.
func (o ClusterInstanceOutput) IdentifierPrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.IdentifierPrefix }).(pulumi.StringOutput)
}

// The instance class to use.
func (o ClusterInstanceOutput) InstanceClass() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.InstanceClass }).(pulumi.StringOutput)
}

// The ARN for the KMS encryption key if one is set to the neptune cluster.
func (o ClusterInstanceOutput) KmsKeyArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.KmsKeyArn }).(pulumi.StringOutput)
}

// The name of the neptune parameter group to associate with this instance.
func (o ClusterInstanceOutput) NeptuneParameterGroupName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringPtrOutput { return v.NeptuneParameterGroupName }).(pulumi.StringPtrOutput)
}

// A subnet group to associate with this neptune instance. **NOTE:** This must match the `neptuneSubnetGroupName` of the attached `neptune.Cluster`.
func (o ClusterInstanceOutput) NeptuneSubnetGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.NeptuneSubnetGroupName }).(pulumi.StringOutput)
}

// The port on which the DB accepts connections. Defaults to `8182`.
func (o ClusterInstanceOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// The daily time range during which automated backups are created if automated backups are enabled. Eg: "04:00-09:00"
func (o ClusterInstanceOutput) PreferredBackupWindow() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.PreferredBackupWindow }).(pulumi.StringOutput)
}

// The window to perform maintenance in.
// Syntax: "ddd:hh24:mi-ddd:hh24:mi". Eg: "Mon:00:00-Mon:03:00".
func (o ClusterInstanceOutput) PreferredMaintenanceWindow() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.PreferredMaintenanceWindow }).(pulumi.StringOutput)
}

// Default 0. Failover Priority setting on instance level. The reader who has lower tier has higher priority to get promoter to writer.
func (o ClusterInstanceOutput) PromotionTier() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.IntPtrOutput { return v.PromotionTier }).(pulumi.IntPtrOutput)
}

// Bool to control if instance is publicly accessible. Default is `false`.
func (o ClusterInstanceOutput) PubliclyAccessible() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.BoolPtrOutput { return v.PubliclyAccessible }).(pulumi.BoolPtrOutput)
}

// Determines whether a final DB snapshot is created before the DB instance is deleted.
func (o ClusterInstanceOutput) SkipFinalSnapshot() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.BoolPtrOutput { return v.SkipFinalSnapshot }).(pulumi.BoolPtrOutput)
}

// Specifies whether the neptune cluster is encrypted.
func (o ClusterInstanceOutput) StorageEncrypted() pulumi.BoolOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.BoolOutput { return v.StorageEncrypted }).(pulumi.BoolOutput)
}

// Storage type associated with the cluster `standard/iopt1`.
func (o ClusterInstanceOutput) StorageType() pulumi.StringOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringOutput { return v.StorageType }).(pulumi.StringOutput)
}

// A map of tags to assign to the instance. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ClusterInstanceOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ClusterInstanceOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Boolean indicating if this instance is writable. `False` indicates this instance is a read replica.
func (o ClusterInstanceOutput) Writer() pulumi.BoolOutput {
	return o.ApplyT(func(v *ClusterInstance) pulumi.BoolOutput { return v.Writer }).(pulumi.BoolOutput)
}

type ClusterInstanceArrayOutput struct{ *pulumi.OutputState }

func (ClusterInstanceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ClusterInstance)(nil)).Elem()
}

func (o ClusterInstanceArrayOutput) ToClusterInstanceArrayOutput() ClusterInstanceArrayOutput {
	return o
}

func (o ClusterInstanceArrayOutput) ToClusterInstanceArrayOutputWithContext(ctx context.Context) ClusterInstanceArrayOutput {
	return o
}

func (o ClusterInstanceArrayOutput) Index(i pulumi.IntInput) ClusterInstanceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ClusterInstance {
		return vs[0].([]*ClusterInstance)[vs[1].(int)]
	}).(ClusterInstanceOutput)
}

type ClusterInstanceMapOutput struct{ *pulumi.OutputState }

func (ClusterInstanceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ClusterInstance)(nil)).Elem()
}

func (o ClusterInstanceMapOutput) ToClusterInstanceMapOutput() ClusterInstanceMapOutput {
	return o
}

func (o ClusterInstanceMapOutput) ToClusterInstanceMapOutputWithContext(ctx context.Context) ClusterInstanceMapOutput {
	return o
}

func (o ClusterInstanceMapOutput) MapIndex(k pulumi.StringInput) ClusterInstanceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ClusterInstance {
		return vs[0].(map[string]*ClusterInstance)[vs[1].(string)]
	}).(ClusterInstanceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterInstanceInput)(nil)).Elem(), &ClusterInstance{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterInstanceArrayInput)(nil)).Elem(), ClusterInstanceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ClusterInstanceMapInput)(nil)).Elem(), ClusterInstanceMap{})
	pulumi.RegisterOutputType(ClusterInstanceOutput{})
	pulumi.RegisterOutputType(ClusterInstanceArrayOutput{})
	pulumi.RegisterOutputType(ClusterInstanceMapOutput{})
}
