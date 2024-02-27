// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package msk

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS Managed Streaming for Kafka Replicator.
//
// ## Example Usage
//
// ## Import
//
// Using `pulumi import`, import MSK replicators using the replicator ARN. For example:
//
// ```sh
//
//	$ pulumi import aws:msk/replicator:Replicator example arn:aws:kafka:us-west-2:123456789012:configuration/example/279c0212-d057-4dba-9aa9-1c4e5a25bfc7-3
//
// ```
type Replicator struct {
	pulumi.CustomResourceState

	// ARN of the Replicator. Do not begin the description with "An", "The", "Defines", "Indicates", or "Specifies," as these are verbose. In other words, "Indicates the amount of storage," can be rewritten as "Amount of storage," without losing any information.
	Arn            pulumi.StringOutput `pulumi:"arn"`
	CurrentVersion pulumi.StringOutput `pulumi:"currentVersion"`
	// A summary description of the replicator.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// A list of Kafka clusters which are targets of the replicator.
	KafkaClusters ReplicatorKafkaClusterArrayOutput `pulumi:"kafkaClusters"`
	// A list of replication configurations, where each configuration targets a given source cluster to target cluster replication flow.
	ReplicationInfoList ReplicatorReplicationInfoListOutput `pulumi:"replicationInfoList"`
	// The name of the replicator.
	ReplicatorName pulumi.StringOutput `pulumi:"replicatorName"`
	// The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source and target clusters).
	ServiceExecutionRoleArn pulumi.StringOutput    `pulumi:"serviceExecutionRoleArn"`
	Tags                    pulumi.StringMapOutput `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewReplicator registers a new resource with the given unique name, arguments, and options.
func NewReplicator(ctx *pulumi.Context,
	name string, args *ReplicatorArgs, opts ...pulumi.ResourceOption) (*Replicator, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.KafkaClusters == nil {
		return nil, errors.New("invalid value for required argument 'KafkaClusters'")
	}
	if args.ReplicationInfoList == nil {
		return nil, errors.New("invalid value for required argument 'ReplicationInfoList'")
	}
	if args.ReplicatorName == nil {
		return nil, errors.New("invalid value for required argument 'ReplicatorName'")
	}
	if args.ServiceExecutionRoleArn == nil {
		return nil, errors.New("invalid value for required argument 'ServiceExecutionRoleArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Replicator
	err := ctx.RegisterResource("aws:msk/replicator:Replicator", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetReplicator gets an existing Replicator resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetReplicator(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ReplicatorState, opts ...pulumi.ResourceOption) (*Replicator, error) {
	var resource Replicator
	err := ctx.ReadResource("aws:msk/replicator:Replicator", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Replicator resources.
type replicatorState struct {
	// ARN of the Replicator. Do not begin the description with "An", "The", "Defines", "Indicates", or "Specifies," as these are verbose. In other words, "Indicates the amount of storage," can be rewritten as "Amount of storage," without losing any information.
	Arn            *string `pulumi:"arn"`
	CurrentVersion *string `pulumi:"currentVersion"`
	// A summary description of the replicator.
	Description *string `pulumi:"description"`
	// A list of Kafka clusters which are targets of the replicator.
	KafkaClusters []ReplicatorKafkaCluster `pulumi:"kafkaClusters"`
	// A list of replication configurations, where each configuration targets a given source cluster to target cluster replication flow.
	ReplicationInfoList *ReplicatorReplicationInfoList `pulumi:"replicationInfoList"`
	// The name of the replicator.
	ReplicatorName *string `pulumi:"replicatorName"`
	// The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source and target clusters).
	ServiceExecutionRoleArn *string           `pulumi:"serviceExecutionRoleArn"`
	Tags                    map[string]string `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ReplicatorState struct {
	// ARN of the Replicator. Do not begin the description with "An", "The", "Defines", "Indicates", or "Specifies," as these are verbose. In other words, "Indicates the amount of storage," can be rewritten as "Amount of storage," without losing any information.
	Arn            pulumi.StringPtrInput
	CurrentVersion pulumi.StringPtrInput
	// A summary description of the replicator.
	Description pulumi.StringPtrInput
	// A list of Kafka clusters which are targets of the replicator.
	KafkaClusters ReplicatorKafkaClusterArrayInput
	// A list of replication configurations, where each configuration targets a given source cluster to target cluster replication flow.
	ReplicationInfoList ReplicatorReplicationInfoListPtrInput
	// The name of the replicator.
	ReplicatorName pulumi.StringPtrInput
	// The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source and target clusters).
	ServiceExecutionRoleArn pulumi.StringPtrInput
	Tags                    pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ReplicatorState) ElementType() reflect.Type {
	return reflect.TypeOf((*replicatorState)(nil)).Elem()
}

type replicatorArgs struct {
	// A summary description of the replicator.
	Description *string `pulumi:"description"`
	// A list of Kafka clusters which are targets of the replicator.
	KafkaClusters []ReplicatorKafkaCluster `pulumi:"kafkaClusters"`
	// A list of replication configurations, where each configuration targets a given source cluster to target cluster replication flow.
	ReplicationInfoList ReplicatorReplicationInfoList `pulumi:"replicationInfoList"`
	// The name of the replicator.
	ReplicatorName string `pulumi:"replicatorName"`
	// The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source and target clusters).
	ServiceExecutionRoleArn string            `pulumi:"serviceExecutionRoleArn"`
	Tags                    map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Replicator resource.
type ReplicatorArgs struct {
	// A summary description of the replicator.
	Description pulumi.StringPtrInput
	// A list of Kafka clusters which are targets of the replicator.
	KafkaClusters ReplicatorKafkaClusterArrayInput
	// A list of replication configurations, where each configuration targets a given source cluster to target cluster replication flow.
	ReplicationInfoList ReplicatorReplicationInfoListInput
	// The name of the replicator.
	ReplicatorName pulumi.StringInput
	// The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source and target clusters).
	ServiceExecutionRoleArn pulumi.StringInput
	Tags                    pulumi.StringMapInput
}

func (ReplicatorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*replicatorArgs)(nil)).Elem()
}

type ReplicatorInput interface {
	pulumi.Input

	ToReplicatorOutput() ReplicatorOutput
	ToReplicatorOutputWithContext(ctx context.Context) ReplicatorOutput
}

func (*Replicator) ElementType() reflect.Type {
	return reflect.TypeOf((**Replicator)(nil)).Elem()
}

func (i *Replicator) ToReplicatorOutput() ReplicatorOutput {
	return i.ToReplicatorOutputWithContext(context.Background())
}

func (i *Replicator) ToReplicatorOutputWithContext(ctx context.Context) ReplicatorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicatorOutput)
}

// ReplicatorArrayInput is an input type that accepts ReplicatorArray and ReplicatorArrayOutput values.
// You can construct a concrete instance of `ReplicatorArrayInput` via:
//
//	ReplicatorArray{ ReplicatorArgs{...} }
type ReplicatorArrayInput interface {
	pulumi.Input

	ToReplicatorArrayOutput() ReplicatorArrayOutput
	ToReplicatorArrayOutputWithContext(context.Context) ReplicatorArrayOutput
}

type ReplicatorArray []ReplicatorInput

func (ReplicatorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Replicator)(nil)).Elem()
}

func (i ReplicatorArray) ToReplicatorArrayOutput() ReplicatorArrayOutput {
	return i.ToReplicatorArrayOutputWithContext(context.Background())
}

func (i ReplicatorArray) ToReplicatorArrayOutputWithContext(ctx context.Context) ReplicatorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicatorArrayOutput)
}

// ReplicatorMapInput is an input type that accepts ReplicatorMap and ReplicatorMapOutput values.
// You can construct a concrete instance of `ReplicatorMapInput` via:
//
//	ReplicatorMap{ "key": ReplicatorArgs{...} }
type ReplicatorMapInput interface {
	pulumi.Input

	ToReplicatorMapOutput() ReplicatorMapOutput
	ToReplicatorMapOutputWithContext(context.Context) ReplicatorMapOutput
}

type ReplicatorMap map[string]ReplicatorInput

func (ReplicatorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Replicator)(nil)).Elem()
}

func (i ReplicatorMap) ToReplicatorMapOutput() ReplicatorMapOutput {
	return i.ToReplicatorMapOutputWithContext(context.Background())
}

func (i ReplicatorMap) ToReplicatorMapOutputWithContext(ctx context.Context) ReplicatorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ReplicatorMapOutput)
}

type ReplicatorOutput struct{ *pulumi.OutputState }

func (ReplicatorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Replicator)(nil)).Elem()
}

func (o ReplicatorOutput) ToReplicatorOutput() ReplicatorOutput {
	return o
}

func (o ReplicatorOutput) ToReplicatorOutputWithContext(ctx context.Context) ReplicatorOutput {
	return o
}

// ARN of the Replicator. Do not begin the description with "An", "The", "Defines", "Indicates", or "Specifies," as these are verbose. In other words, "Indicates the amount of storage," can be rewritten as "Amount of storage," without losing any information.
func (o ReplicatorOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Replicator) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

func (o ReplicatorOutput) CurrentVersion() pulumi.StringOutput {
	return o.ApplyT(func(v *Replicator) pulumi.StringOutput { return v.CurrentVersion }).(pulumi.StringOutput)
}

// A summary description of the replicator.
func (o ReplicatorOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Replicator) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// A list of Kafka clusters which are targets of the replicator.
func (o ReplicatorOutput) KafkaClusters() ReplicatorKafkaClusterArrayOutput {
	return o.ApplyT(func(v *Replicator) ReplicatorKafkaClusterArrayOutput { return v.KafkaClusters }).(ReplicatorKafkaClusterArrayOutput)
}

// A list of replication configurations, where each configuration targets a given source cluster to target cluster replication flow.
func (o ReplicatorOutput) ReplicationInfoList() ReplicatorReplicationInfoListOutput {
	return o.ApplyT(func(v *Replicator) ReplicatorReplicationInfoListOutput { return v.ReplicationInfoList }).(ReplicatorReplicationInfoListOutput)
}

// The name of the replicator.
func (o ReplicatorOutput) ReplicatorName() pulumi.StringOutput {
	return o.ApplyT(func(v *Replicator) pulumi.StringOutput { return v.ReplicatorName }).(pulumi.StringOutput)
}

// The ARN of the IAM role used by the replicator to access resources in the customer's account (e.g source and target clusters).
func (o ReplicatorOutput) ServiceExecutionRoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Replicator) pulumi.StringOutput { return v.ServiceExecutionRoleArn }).(pulumi.StringOutput)
}

func (o ReplicatorOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Replicator) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o ReplicatorOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Replicator) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ReplicatorArrayOutput struct{ *pulumi.OutputState }

func (ReplicatorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Replicator)(nil)).Elem()
}

func (o ReplicatorArrayOutput) ToReplicatorArrayOutput() ReplicatorArrayOutput {
	return o
}

func (o ReplicatorArrayOutput) ToReplicatorArrayOutputWithContext(ctx context.Context) ReplicatorArrayOutput {
	return o
}

func (o ReplicatorArrayOutput) Index(i pulumi.IntInput) ReplicatorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Replicator {
		return vs[0].([]*Replicator)[vs[1].(int)]
	}).(ReplicatorOutput)
}

type ReplicatorMapOutput struct{ *pulumi.OutputState }

func (ReplicatorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Replicator)(nil)).Elem()
}

func (o ReplicatorMapOutput) ToReplicatorMapOutput() ReplicatorMapOutput {
	return o
}

func (o ReplicatorMapOutput) ToReplicatorMapOutputWithContext(ctx context.Context) ReplicatorMapOutput {
	return o
}

func (o ReplicatorMapOutput) MapIndex(k pulumi.StringInput) ReplicatorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Replicator {
		return vs[0].(map[string]*Replicator)[vs[1].(string)]
	}).(ReplicatorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicatorInput)(nil)).Elem(), &Replicator{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicatorArrayInput)(nil)).Elem(), ReplicatorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ReplicatorMapInput)(nil)).Elem(), ReplicatorMap{})
	pulumi.RegisterOutputType(ReplicatorOutput{})
	pulumi.RegisterOutputType(ReplicatorArrayOutput{})
	pulumi.RegisterOutputType(ReplicatorMapOutput{})
}
