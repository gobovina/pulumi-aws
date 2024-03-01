// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package kinesisanalyticsv2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Kinesis Analytics v2 Application Snapshot.
// Snapshots are the AWS implementation of [Flink Savepoints](https://ci.apache.org/projects/flink/flink-docs-release-1.11/ops/state/savepoints.html).
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/kinesisanalyticsv2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := kinesisanalyticsv2.NewApplicationSnapshot(ctx, "example", &kinesisanalyticsv2.ApplicationSnapshotArgs{
//				ApplicationName: pulumi.Any(exampleAwsKinesisanalyticsv2Application.Name),
//				SnapshotName:    pulumi.String("example-snapshot"),
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
// Using `pulumi import`, import `aws_kinesisanalyticsv2_application` using `application_name` together with `snapshot_name`. For example:
//
// ```sh
//
//	$ pulumi import aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot example example-application/example-snapshot
//
// ```
type ApplicationSnapshot struct {
	pulumi.CustomResourceState

	// The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
	ApplicationName pulumi.StringOutput `pulumi:"applicationName"`
	// The current application version ID when the snapshot was created.
	ApplicationVersionId pulumi.IntOutput `pulumi:"applicationVersionId"`
	// The timestamp of the application snapshot.
	SnapshotCreationTimestamp pulumi.StringOutput `pulumi:"snapshotCreationTimestamp"`
	// The name of the application snapshot.
	SnapshotName pulumi.StringOutput `pulumi:"snapshotName"`
}

// NewApplicationSnapshot registers a new resource with the given unique name, arguments, and options.
func NewApplicationSnapshot(ctx *pulumi.Context,
	name string, args *ApplicationSnapshotArgs, opts ...pulumi.ResourceOption) (*ApplicationSnapshot, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationName == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationName'")
	}
	if args.SnapshotName == nil {
		return nil, errors.New("invalid value for required argument 'SnapshotName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplicationSnapshot
	err := ctx.RegisterResource("aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplicationSnapshot gets an existing ApplicationSnapshot resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplicationSnapshot(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationSnapshotState, opts ...pulumi.ResourceOption) (*ApplicationSnapshot, error) {
	var resource ApplicationSnapshot
	err := ctx.ReadResource("aws:kinesisanalyticsv2/applicationSnapshot:ApplicationSnapshot", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplicationSnapshot resources.
type applicationSnapshotState struct {
	// The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
	ApplicationName *string `pulumi:"applicationName"`
	// The current application version ID when the snapshot was created.
	ApplicationVersionId *int `pulumi:"applicationVersionId"`
	// The timestamp of the application snapshot.
	SnapshotCreationTimestamp *string `pulumi:"snapshotCreationTimestamp"`
	// The name of the application snapshot.
	SnapshotName *string `pulumi:"snapshotName"`
}

type ApplicationSnapshotState struct {
	// The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
	ApplicationName pulumi.StringPtrInput
	// The current application version ID when the snapshot was created.
	ApplicationVersionId pulumi.IntPtrInput
	// The timestamp of the application snapshot.
	SnapshotCreationTimestamp pulumi.StringPtrInput
	// The name of the application snapshot.
	SnapshotName pulumi.StringPtrInput
}

func (ApplicationSnapshotState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationSnapshotState)(nil)).Elem()
}

type applicationSnapshotArgs struct {
	// The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
	ApplicationName string `pulumi:"applicationName"`
	// The name of the application snapshot.
	SnapshotName string `pulumi:"snapshotName"`
}

// The set of arguments for constructing a ApplicationSnapshot resource.
type ApplicationSnapshotArgs struct {
	// The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
	ApplicationName pulumi.StringInput
	// The name of the application snapshot.
	SnapshotName pulumi.StringInput
}

func (ApplicationSnapshotArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationSnapshotArgs)(nil)).Elem()
}

type ApplicationSnapshotInput interface {
	pulumi.Input

	ToApplicationSnapshotOutput() ApplicationSnapshotOutput
	ToApplicationSnapshotOutputWithContext(ctx context.Context) ApplicationSnapshotOutput
}

func (*ApplicationSnapshot) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationSnapshot)(nil)).Elem()
}

func (i *ApplicationSnapshot) ToApplicationSnapshotOutput() ApplicationSnapshotOutput {
	return i.ToApplicationSnapshotOutputWithContext(context.Background())
}

func (i *ApplicationSnapshot) ToApplicationSnapshotOutputWithContext(ctx context.Context) ApplicationSnapshotOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSnapshotOutput)
}

// ApplicationSnapshotArrayInput is an input type that accepts ApplicationSnapshotArray and ApplicationSnapshotArrayOutput values.
// You can construct a concrete instance of `ApplicationSnapshotArrayInput` via:
//
//	ApplicationSnapshotArray{ ApplicationSnapshotArgs{...} }
type ApplicationSnapshotArrayInput interface {
	pulumi.Input

	ToApplicationSnapshotArrayOutput() ApplicationSnapshotArrayOutput
	ToApplicationSnapshotArrayOutputWithContext(context.Context) ApplicationSnapshotArrayOutput
}

type ApplicationSnapshotArray []ApplicationSnapshotInput

func (ApplicationSnapshotArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationSnapshot)(nil)).Elem()
}

func (i ApplicationSnapshotArray) ToApplicationSnapshotArrayOutput() ApplicationSnapshotArrayOutput {
	return i.ToApplicationSnapshotArrayOutputWithContext(context.Background())
}

func (i ApplicationSnapshotArray) ToApplicationSnapshotArrayOutputWithContext(ctx context.Context) ApplicationSnapshotArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSnapshotArrayOutput)
}

// ApplicationSnapshotMapInput is an input type that accepts ApplicationSnapshotMap and ApplicationSnapshotMapOutput values.
// You can construct a concrete instance of `ApplicationSnapshotMapInput` via:
//
//	ApplicationSnapshotMap{ "key": ApplicationSnapshotArgs{...} }
type ApplicationSnapshotMapInput interface {
	pulumi.Input

	ToApplicationSnapshotMapOutput() ApplicationSnapshotMapOutput
	ToApplicationSnapshotMapOutputWithContext(context.Context) ApplicationSnapshotMapOutput
}

type ApplicationSnapshotMap map[string]ApplicationSnapshotInput

func (ApplicationSnapshotMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationSnapshot)(nil)).Elem()
}

func (i ApplicationSnapshotMap) ToApplicationSnapshotMapOutput() ApplicationSnapshotMapOutput {
	return i.ToApplicationSnapshotMapOutputWithContext(context.Background())
}

func (i ApplicationSnapshotMap) ToApplicationSnapshotMapOutputWithContext(ctx context.Context) ApplicationSnapshotMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationSnapshotMapOutput)
}

type ApplicationSnapshotOutput struct{ *pulumi.OutputState }

func (ApplicationSnapshotOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationSnapshot)(nil)).Elem()
}

func (o ApplicationSnapshotOutput) ToApplicationSnapshotOutput() ApplicationSnapshotOutput {
	return o
}

func (o ApplicationSnapshotOutput) ToApplicationSnapshotOutputWithContext(ctx context.Context) ApplicationSnapshotOutput {
	return o
}

// The name of an existing  Kinesis Analytics v2 Application. Note that the application must be running for a snapshot to be created.
func (o ApplicationSnapshotOutput) ApplicationName() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationSnapshot) pulumi.StringOutput { return v.ApplicationName }).(pulumi.StringOutput)
}

// The current application version ID when the snapshot was created.
func (o ApplicationSnapshotOutput) ApplicationVersionId() pulumi.IntOutput {
	return o.ApplyT(func(v *ApplicationSnapshot) pulumi.IntOutput { return v.ApplicationVersionId }).(pulumi.IntOutput)
}

// The timestamp of the application snapshot.
func (o ApplicationSnapshotOutput) SnapshotCreationTimestamp() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationSnapshot) pulumi.StringOutput { return v.SnapshotCreationTimestamp }).(pulumi.StringOutput)
}

// The name of the application snapshot.
func (o ApplicationSnapshotOutput) SnapshotName() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationSnapshot) pulumi.StringOutput { return v.SnapshotName }).(pulumi.StringOutput)
}

type ApplicationSnapshotArrayOutput struct{ *pulumi.OutputState }

func (ApplicationSnapshotArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationSnapshot)(nil)).Elem()
}

func (o ApplicationSnapshotArrayOutput) ToApplicationSnapshotArrayOutput() ApplicationSnapshotArrayOutput {
	return o
}

func (o ApplicationSnapshotArrayOutput) ToApplicationSnapshotArrayOutputWithContext(ctx context.Context) ApplicationSnapshotArrayOutput {
	return o
}

func (o ApplicationSnapshotArrayOutput) Index(i pulumi.IntInput) ApplicationSnapshotOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplicationSnapshot {
		return vs[0].([]*ApplicationSnapshot)[vs[1].(int)]
	}).(ApplicationSnapshotOutput)
}

type ApplicationSnapshotMapOutput struct{ *pulumi.OutputState }

func (ApplicationSnapshotMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationSnapshot)(nil)).Elem()
}

func (o ApplicationSnapshotMapOutput) ToApplicationSnapshotMapOutput() ApplicationSnapshotMapOutput {
	return o
}

func (o ApplicationSnapshotMapOutput) ToApplicationSnapshotMapOutputWithContext(ctx context.Context) ApplicationSnapshotMapOutput {
	return o
}

func (o ApplicationSnapshotMapOutput) MapIndex(k pulumi.StringInput) ApplicationSnapshotOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplicationSnapshot {
		return vs[0].(map[string]*ApplicationSnapshot)[vs[1].(string)]
	}).(ApplicationSnapshotOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSnapshotInput)(nil)).Elem(), &ApplicationSnapshot{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSnapshotArrayInput)(nil)).Elem(), ApplicationSnapshotArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationSnapshotMapInput)(nil)).Elem(), ApplicationSnapshotMap{})
	pulumi.RegisterOutputType(ApplicationSnapshotOutput{})
	pulumi.RegisterOutputType(ApplicationSnapshotArrayOutput{})
	pulumi.RegisterOutputType(ApplicationSnapshotMapOutput{})
}
