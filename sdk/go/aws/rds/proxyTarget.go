// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package rds

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an RDS DB proxy target resource.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/rds"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleProxy, err := rds.NewProxy(ctx, "exampleProxy", &rds.ProxyArgs{
//				DebugLogging:      pulumi.Bool(false),
//				EngineFamily:      pulumi.String("MYSQL"),
//				IdleClientTimeout: pulumi.Int(1800),
//				RequireTls:        pulumi.Bool(true),
//				RoleArn:           pulumi.Any(aws_iam_role.Example.Arn),
//				VpcSecurityGroupIds: pulumi.StringArray{
//					aws_security_group.Example.Id,
//				},
//				VpcSubnetIds: pulumi.StringArray{
//					aws_subnet.Example.Id,
//				},
//				Auths: rds.ProxyAuthArray{
//					&rds.ProxyAuthArgs{
//						AuthScheme:  pulumi.String("SECRETS"),
//						Description: pulumi.String("example"),
//						IamAuth:     pulumi.String("DISABLED"),
//						SecretArn:   pulumi.Any(aws_secretsmanager_secret.Example.Arn),
//					},
//				},
//				Tags: pulumi.StringMap{
//					"Name": pulumi.String("example"),
//					"Key":  pulumi.String("value"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleProxyDefaultTargetGroup, err := rds.NewProxyDefaultTargetGroup(ctx, "exampleProxyDefaultTargetGroup", &rds.ProxyDefaultTargetGroupArgs{
//				DbProxyName: exampleProxy.Name,
//				ConnectionPoolConfig: &rds.ProxyDefaultTargetGroupConnectionPoolConfigArgs{
//					ConnectionBorrowTimeout:   pulumi.Int(120),
//					InitQuery:                 pulumi.String("SET x=1, y=2"),
//					MaxConnectionsPercent:     pulumi.Int(100),
//					MaxIdleConnectionsPercent: pulumi.Int(50),
//					SessionPinningFilters: pulumi.StringArray{
//						pulumi.String("EXCLUDE_VARIABLE_SETS"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = rds.NewProxyTarget(ctx, "exampleProxyTarget", &rds.ProxyTargetArgs{
//				DbInstanceIdentifier: pulumi.Any(aws_db_instance.Example.Id),
//				DbProxyName:          exampleProxy.Name,
//				TargetGroupName:      exampleProxyDefaultTargetGroup.Name,
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
// RDS DB Proxy Targets can be imported using the `db_proxy_name`, `target_group_name`, target type (e.g., `RDS_INSTANCE` or `TRACKED_CLUSTER`), and resource identifier separated by forward slashes (`/`), e.g., Instances
//
// ```sh
//
//	$ pulumi import aws:rds/proxyTarget:ProxyTarget example example-proxy/default/RDS_INSTANCE/example-instance
//
// ```
//
//	Provisioned Clusters
//
// ```sh
//
//	$ pulumi import aws:rds/proxyTarget:ProxyTarget example example-proxy/default/TRACKED_CLUSTER/example-cluster
//
// ```
type ProxyTarget struct {
	pulumi.CustomResourceState

	// DB cluster identifier.
	DbClusterIdentifier pulumi.StringPtrOutput `pulumi:"dbClusterIdentifier"`
	// DB instance identifier.
	DbInstanceIdentifier pulumi.StringPtrOutput `pulumi:"dbInstanceIdentifier"`
	// The name of the DB proxy.
	DbProxyName pulumi.StringOutput `pulumi:"dbProxyName"`
	// Hostname for the target RDS DB Instance. Only returned for `RDS_INSTANCE` type.
	Endpoint pulumi.StringOutput `pulumi:"endpoint"`
	// Port for the target RDS DB Instance or Aurora DB Cluster.
	Port pulumi.IntOutput `pulumi:"port"`
	// Identifier representing the DB Instance or DB Cluster target.
	RdsResourceId pulumi.StringOutput `pulumi:"rdsResourceId"`
	// Amazon Resource Name (ARN) for the DB instance or DB cluster. Currently not returned by the RDS API.
	TargetArn pulumi.StringOutput `pulumi:"targetArn"`
	// The name of the target group.
	TargetGroupName pulumi.StringOutput `pulumi:"targetGroupName"`
	// DB Cluster identifier for the DB Instance target. Not returned unless manually importing an `RDS_INSTANCE` target that is part of a DB Cluster.
	TrackedClusterId pulumi.StringOutput `pulumi:"trackedClusterId"`
	// Type of targetE.g., `RDS_INSTANCE` or `TRACKED_CLUSTER`
	Type pulumi.StringOutput `pulumi:"type"`
}

// NewProxyTarget registers a new resource with the given unique name, arguments, and options.
func NewProxyTarget(ctx *pulumi.Context,
	name string, args *ProxyTargetArgs, opts ...pulumi.ResourceOption) (*ProxyTarget, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DbProxyName == nil {
		return nil, errors.New("invalid value for required argument 'DbProxyName'")
	}
	if args.TargetGroupName == nil {
		return nil, errors.New("invalid value for required argument 'TargetGroupName'")
	}
	var resource ProxyTarget
	err := ctx.RegisterResource("aws:rds/proxyTarget:ProxyTarget", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProxyTarget gets an existing ProxyTarget resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProxyTarget(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProxyTargetState, opts ...pulumi.ResourceOption) (*ProxyTarget, error) {
	var resource ProxyTarget
	err := ctx.ReadResource("aws:rds/proxyTarget:ProxyTarget", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProxyTarget resources.
type proxyTargetState struct {
	// DB cluster identifier.
	DbClusterIdentifier *string `pulumi:"dbClusterIdentifier"`
	// DB instance identifier.
	DbInstanceIdentifier *string `pulumi:"dbInstanceIdentifier"`
	// The name of the DB proxy.
	DbProxyName *string `pulumi:"dbProxyName"`
	// Hostname for the target RDS DB Instance. Only returned for `RDS_INSTANCE` type.
	Endpoint *string `pulumi:"endpoint"`
	// Port for the target RDS DB Instance or Aurora DB Cluster.
	Port *int `pulumi:"port"`
	// Identifier representing the DB Instance or DB Cluster target.
	RdsResourceId *string `pulumi:"rdsResourceId"`
	// Amazon Resource Name (ARN) for the DB instance or DB cluster. Currently not returned by the RDS API.
	TargetArn *string `pulumi:"targetArn"`
	// The name of the target group.
	TargetGroupName *string `pulumi:"targetGroupName"`
	// DB Cluster identifier for the DB Instance target. Not returned unless manually importing an `RDS_INSTANCE` target that is part of a DB Cluster.
	TrackedClusterId *string `pulumi:"trackedClusterId"`
	// Type of targetE.g., `RDS_INSTANCE` or `TRACKED_CLUSTER`
	Type *string `pulumi:"type"`
}

type ProxyTargetState struct {
	// DB cluster identifier.
	DbClusterIdentifier pulumi.StringPtrInput
	// DB instance identifier.
	DbInstanceIdentifier pulumi.StringPtrInput
	// The name of the DB proxy.
	DbProxyName pulumi.StringPtrInput
	// Hostname for the target RDS DB Instance. Only returned for `RDS_INSTANCE` type.
	Endpoint pulumi.StringPtrInput
	// Port for the target RDS DB Instance or Aurora DB Cluster.
	Port pulumi.IntPtrInput
	// Identifier representing the DB Instance or DB Cluster target.
	RdsResourceId pulumi.StringPtrInput
	// Amazon Resource Name (ARN) for the DB instance or DB cluster. Currently not returned by the RDS API.
	TargetArn pulumi.StringPtrInput
	// The name of the target group.
	TargetGroupName pulumi.StringPtrInput
	// DB Cluster identifier for the DB Instance target. Not returned unless manually importing an `RDS_INSTANCE` target that is part of a DB Cluster.
	TrackedClusterId pulumi.StringPtrInput
	// Type of targetE.g., `RDS_INSTANCE` or `TRACKED_CLUSTER`
	Type pulumi.StringPtrInput
}

func (ProxyTargetState) ElementType() reflect.Type {
	return reflect.TypeOf((*proxyTargetState)(nil)).Elem()
}

type proxyTargetArgs struct {
	// DB cluster identifier.
	DbClusterIdentifier *string `pulumi:"dbClusterIdentifier"`
	// DB instance identifier.
	DbInstanceIdentifier *string `pulumi:"dbInstanceIdentifier"`
	// The name of the DB proxy.
	DbProxyName string `pulumi:"dbProxyName"`
	// The name of the target group.
	TargetGroupName string `pulumi:"targetGroupName"`
}

// The set of arguments for constructing a ProxyTarget resource.
type ProxyTargetArgs struct {
	// DB cluster identifier.
	DbClusterIdentifier pulumi.StringPtrInput
	// DB instance identifier.
	DbInstanceIdentifier pulumi.StringPtrInput
	// The name of the DB proxy.
	DbProxyName pulumi.StringInput
	// The name of the target group.
	TargetGroupName pulumi.StringInput
}

func (ProxyTargetArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*proxyTargetArgs)(nil)).Elem()
}

type ProxyTargetInput interface {
	pulumi.Input

	ToProxyTargetOutput() ProxyTargetOutput
	ToProxyTargetOutputWithContext(ctx context.Context) ProxyTargetOutput
}

func (*ProxyTarget) ElementType() reflect.Type {
	return reflect.TypeOf((**ProxyTarget)(nil)).Elem()
}

func (i *ProxyTarget) ToProxyTargetOutput() ProxyTargetOutput {
	return i.ToProxyTargetOutputWithContext(context.Background())
}

func (i *ProxyTarget) ToProxyTargetOutputWithContext(ctx context.Context) ProxyTargetOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProxyTargetOutput)
}

// ProxyTargetArrayInput is an input type that accepts ProxyTargetArray and ProxyTargetArrayOutput values.
// You can construct a concrete instance of `ProxyTargetArrayInput` via:
//
//	ProxyTargetArray{ ProxyTargetArgs{...} }
type ProxyTargetArrayInput interface {
	pulumi.Input

	ToProxyTargetArrayOutput() ProxyTargetArrayOutput
	ToProxyTargetArrayOutputWithContext(context.Context) ProxyTargetArrayOutput
}

type ProxyTargetArray []ProxyTargetInput

func (ProxyTargetArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProxyTarget)(nil)).Elem()
}

func (i ProxyTargetArray) ToProxyTargetArrayOutput() ProxyTargetArrayOutput {
	return i.ToProxyTargetArrayOutputWithContext(context.Background())
}

func (i ProxyTargetArray) ToProxyTargetArrayOutputWithContext(ctx context.Context) ProxyTargetArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProxyTargetArrayOutput)
}

// ProxyTargetMapInput is an input type that accepts ProxyTargetMap and ProxyTargetMapOutput values.
// You can construct a concrete instance of `ProxyTargetMapInput` via:
//
//	ProxyTargetMap{ "key": ProxyTargetArgs{...} }
type ProxyTargetMapInput interface {
	pulumi.Input

	ToProxyTargetMapOutput() ProxyTargetMapOutput
	ToProxyTargetMapOutputWithContext(context.Context) ProxyTargetMapOutput
}

type ProxyTargetMap map[string]ProxyTargetInput

func (ProxyTargetMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProxyTarget)(nil)).Elem()
}

func (i ProxyTargetMap) ToProxyTargetMapOutput() ProxyTargetMapOutput {
	return i.ToProxyTargetMapOutputWithContext(context.Background())
}

func (i ProxyTargetMap) ToProxyTargetMapOutputWithContext(ctx context.Context) ProxyTargetMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProxyTargetMapOutput)
}

type ProxyTargetOutput struct{ *pulumi.OutputState }

func (ProxyTargetOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProxyTarget)(nil)).Elem()
}

func (o ProxyTargetOutput) ToProxyTargetOutput() ProxyTargetOutput {
	return o
}

func (o ProxyTargetOutput) ToProxyTargetOutputWithContext(ctx context.Context) ProxyTargetOutput {
	return o
}

// DB cluster identifier.
func (o ProxyTargetOutput) DbClusterIdentifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProxyTarget) pulumi.StringPtrOutput { return v.DbClusterIdentifier }).(pulumi.StringPtrOutput)
}

// DB instance identifier.
func (o ProxyTargetOutput) DbInstanceIdentifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ProxyTarget) pulumi.StringPtrOutput { return v.DbInstanceIdentifier }).(pulumi.StringPtrOutput)
}

// The name of the DB proxy.
func (o ProxyTargetOutput) DbProxyName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProxyTarget) pulumi.StringOutput { return v.DbProxyName }).(pulumi.StringOutput)
}

// Hostname for the target RDS DB Instance. Only returned for `RDS_INSTANCE` type.
func (o ProxyTargetOutput) Endpoint() pulumi.StringOutput {
	return o.ApplyT(func(v *ProxyTarget) pulumi.StringOutput { return v.Endpoint }).(pulumi.StringOutput)
}

// Port for the target RDS DB Instance or Aurora DB Cluster.
func (o ProxyTargetOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v *ProxyTarget) pulumi.IntOutput { return v.Port }).(pulumi.IntOutput)
}

// Identifier representing the DB Instance or DB Cluster target.
func (o ProxyTargetOutput) RdsResourceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProxyTarget) pulumi.StringOutput { return v.RdsResourceId }).(pulumi.StringOutput)
}

// Amazon Resource Name (ARN) for the DB instance or DB cluster. Currently not returned by the RDS API.
func (o ProxyTargetOutput) TargetArn() pulumi.StringOutput {
	return o.ApplyT(func(v *ProxyTarget) pulumi.StringOutput { return v.TargetArn }).(pulumi.StringOutput)
}

// The name of the target group.
func (o ProxyTargetOutput) TargetGroupName() pulumi.StringOutput {
	return o.ApplyT(func(v *ProxyTarget) pulumi.StringOutput { return v.TargetGroupName }).(pulumi.StringOutput)
}

// DB Cluster identifier for the DB Instance target. Not returned unless manually importing an `RDS_INSTANCE` target that is part of a DB Cluster.
func (o ProxyTargetOutput) TrackedClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *ProxyTarget) pulumi.StringOutput { return v.TrackedClusterId }).(pulumi.StringOutput)
}

// Type of targetE.g., `RDS_INSTANCE` or `TRACKED_CLUSTER`
func (o ProxyTargetOutput) Type() pulumi.StringOutput {
	return o.ApplyT(func(v *ProxyTarget) pulumi.StringOutput { return v.Type }).(pulumi.StringOutput)
}

type ProxyTargetArrayOutput struct{ *pulumi.OutputState }

func (ProxyTargetArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProxyTarget)(nil)).Elem()
}

func (o ProxyTargetArrayOutput) ToProxyTargetArrayOutput() ProxyTargetArrayOutput {
	return o
}

func (o ProxyTargetArrayOutput) ToProxyTargetArrayOutputWithContext(ctx context.Context) ProxyTargetArrayOutput {
	return o
}

func (o ProxyTargetArrayOutput) Index(i pulumi.IntInput) ProxyTargetOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ProxyTarget {
		return vs[0].([]*ProxyTarget)[vs[1].(int)]
	}).(ProxyTargetOutput)
}

type ProxyTargetMapOutput struct{ *pulumi.OutputState }

func (ProxyTargetMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProxyTarget)(nil)).Elem()
}

func (o ProxyTargetMapOutput) ToProxyTargetMapOutput() ProxyTargetMapOutput {
	return o
}

func (o ProxyTargetMapOutput) ToProxyTargetMapOutputWithContext(ctx context.Context) ProxyTargetMapOutput {
	return o
}

func (o ProxyTargetMapOutput) MapIndex(k pulumi.StringInput) ProxyTargetOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ProxyTarget {
		return vs[0].(map[string]*ProxyTarget)[vs[1].(string)]
	}).(ProxyTargetOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ProxyTargetInput)(nil)).Elem(), &ProxyTarget{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProxyTargetArrayInput)(nil)).Elem(), ProxyTargetArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ProxyTargetMapInput)(nil)).Elem(), ProxyTargetMap{})
	pulumi.RegisterOutputType(ProxyTargetOutput{})
	pulumi.RegisterOutputType(ProxyTargetArrayOutput{})
	pulumi.RegisterOutputType(ProxyTargetMapOutput{})
}
