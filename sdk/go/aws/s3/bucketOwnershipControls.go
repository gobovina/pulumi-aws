// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package s3

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage S3 Bucket Ownership Controls. For more information, see the [S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html).
//
// > This resource cannot be used with S3 directory buckets.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := s3.NewBucketV2(ctx, "example", &s3.BucketV2Args{
//				Bucket: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = s3.NewBucketOwnershipControls(ctx, "example", &s3.BucketOwnershipControlsArgs{
//				Bucket: example.ID(),
//				Rule: &s3.BucketOwnershipControlsRuleArgs{
//					ObjectOwnership: pulumi.String("BucketOwnerPreferred"),
//				},
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
// Using `pulumi import`, import S3 Bucket Ownership Controls using S3 Bucket name. For example:
//
// ```sh
//
//	$ pulumi import aws:s3/bucketOwnershipControls:BucketOwnershipControls example my-bucket
//
// ```
type BucketOwnershipControls struct {
	pulumi.CustomResourceState

	// Name of the bucket that you want to associate this access point with.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Configuration block(s) with Ownership Controls rules. Detailed below.
	Rule BucketOwnershipControlsRuleOutput `pulumi:"rule"`
}

// NewBucketOwnershipControls registers a new resource with the given unique name, arguments, and options.
func NewBucketOwnershipControls(ctx *pulumi.Context,
	name string, args *BucketOwnershipControlsArgs, opts ...pulumi.ResourceOption) (*BucketOwnershipControls, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.Rule == nil {
		return nil, errors.New("invalid value for required argument 'Rule'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource BucketOwnershipControls
	err := ctx.RegisterResource("aws:s3/bucketOwnershipControls:BucketOwnershipControls", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetBucketOwnershipControls gets an existing BucketOwnershipControls resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetBucketOwnershipControls(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *BucketOwnershipControlsState, opts ...pulumi.ResourceOption) (*BucketOwnershipControls, error) {
	var resource BucketOwnershipControls
	err := ctx.ReadResource("aws:s3/bucketOwnershipControls:BucketOwnershipControls", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering BucketOwnershipControls resources.
type bucketOwnershipControlsState struct {
	// Name of the bucket that you want to associate this access point with.
	Bucket *string `pulumi:"bucket"`
	// Configuration block(s) with Ownership Controls rules. Detailed below.
	Rule *BucketOwnershipControlsRule `pulumi:"rule"`
}

type BucketOwnershipControlsState struct {
	// Name of the bucket that you want to associate this access point with.
	Bucket pulumi.StringPtrInput
	// Configuration block(s) with Ownership Controls rules. Detailed below.
	Rule BucketOwnershipControlsRulePtrInput
}

func (BucketOwnershipControlsState) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketOwnershipControlsState)(nil)).Elem()
}

type bucketOwnershipControlsArgs struct {
	// Name of the bucket that you want to associate this access point with.
	Bucket string `pulumi:"bucket"`
	// Configuration block(s) with Ownership Controls rules. Detailed below.
	Rule BucketOwnershipControlsRule `pulumi:"rule"`
}

// The set of arguments for constructing a BucketOwnershipControls resource.
type BucketOwnershipControlsArgs struct {
	// Name of the bucket that you want to associate this access point with.
	Bucket pulumi.StringInput
	// Configuration block(s) with Ownership Controls rules. Detailed below.
	Rule BucketOwnershipControlsRuleInput
}

func (BucketOwnershipControlsArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*bucketOwnershipControlsArgs)(nil)).Elem()
}

type BucketOwnershipControlsInput interface {
	pulumi.Input

	ToBucketOwnershipControlsOutput() BucketOwnershipControlsOutput
	ToBucketOwnershipControlsOutputWithContext(ctx context.Context) BucketOwnershipControlsOutput
}

func (*BucketOwnershipControls) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketOwnershipControls)(nil)).Elem()
}

func (i *BucketOwnershipControls) ToBucketOwnershipControlsOutput() BucketOwnershipControlsOutput {
	return i.ToBucketOwnershipControlsOutputWithContext(context.Background())
}

func (i *BucketOwnershipControls) ToBucketOwnershipControlsOutputWithContext(ctx context.Context) BucketOwnershipControlsOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketOwnershipControlsOutput)
}

// BucketOwnershipControlsArrayInput is an input type that accepts BucketOwnershipControlsArray and BucketOwnershipControlsArrayOutput values.
// You can construct a concrete instance of `BucketOwnershipControlsArrayInput` via:
//
//	BucketOwnershipControlsArray{ BucketOwnershipControlsArgs{...} }
type BucketOwnershipControlsArrayInput interface {
	pulumi.Input

	ToBucketOwnershipControlsArrayOutput() BucketOwnershipControlsArrayOutput
	ToBucketOwnershipControlsArrayOutputWithContext(context.Context) BucketOwnershipControlsArrayOutput
}

type BucketOwnershipControlsArray []BucketOwnershipControlsInput

func (BucketOwnershipControlsArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketOwnershipControls)(nil)).Elem()
}

func (i BucketOwnershipControlsArray) ToBucketOwnershipControlsArrayOutput() BucketOwnershipControlsArrayOutput {
	return i.ToBucketOwnershipControlsArrayOutputWithContext(context.Background())
}

func (i BucketOwnershipControlsArray) ToBucketOwnershipControlsArrayOutputWithContext(ctx context.Context) BucketOwnershipControlsArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketOwnershipControlsArrayOutput)
}

// BucketOwnershipControlsMapInput is an input type that accepts BucketOwnershipControlsMap and BucketOwnershipControlsMapOutput values.
// You can construct a concrete instance of `BucketOwnershipControlsMapInput` via:
//
//	BucketOwnershipControlsMap{ "key": BucketOwnershipControlsArgs{...} }
type BucketOwnershipControlsMapInput interface {
	pulumi.Input

	ToBucketOwnershipControlsMapOutput() BucketOwnershipControlsMapOutput
	ToBucketOwnershipControlsMapOutputWithContext(context.Context) BucketOwnershipControlsMapOutput
}

type BucketOwnershipControlsMap map[string]BucketOwnershipControlsInput

func (BucketOwnershipControlsMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketOwnershipControls)(nil)).Elem()
}

func (i BucketOwnershipControlsMap) ToBucketOwnershipControlsMapOutput() BucketOwnershipControlsMapOutput {
	return i.ToBucketOwnershipControlsMapOutputWithContext(context.Background())
}

func (i BucketOwnershipControlsMap) ToBucketOwnershipControlsMapOutputWithContext(ctx context.Context) BucketOwnershipControlsMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(BucketOwnershipControlsMapOutput)
}

type BucketOwnershipControlsOutput struct{ *pulumi.OutputState }

func (BucketOwnershipControlsOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**BucketOwnershipControls)(nil)).Elem()
}

func (o BucketOwnershipControlsOutput) ToBucketOwnershipControlsOutput() BucketOwnershipControlsOutput {
	return o
}

func (o BucketOwnershipControlsOutput) ToBucketOwnershipControlsOutputWithContext(ctx context.Context) BucketOwnershipControlsOutput {
	return o
}

// Name of the bucket that you want to associate this access point with.
func (o BucketOwnershipControlsOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *BucketOwnershipControls) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Configuration block(s) with Ownership Controls rules. Detailed below.
func (o BucketOwnershipControlsOutput) Rule() BucketOwnershipControlsRuleOutput {
	return o.ApplyT(func(v *BucketOwnershipControls) BucketOwnershipControlsRuleOutput { return v.Rule }).(BucketOwnershipControlsRuleOutput)
}

type BucketOwnershipControlsArrayOutput struct{ *pulumi.OutputState }

func (BucketOwnershipControlsArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*BucketOwnershipControls)(nil)).Elem()
}

func (o BucketOwnershipControlsArrayOutput) ToBucketOwnershipControlsArrayOutput() BucketOwnershipControlsArrayOutput {
	return o
}

func (o BucketOwnershipControlsArrayOutput) ToBucketOwnershipControlsArrayOutputWithContext(ctx context.Context) BucketOwnershipControlsArrayOutput {
	return o
}

func (o BucketOwnershipControlsArrayOutput) Index(i pulumi.IntInput) BucketOwnershipControlsOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *BucketOwnershipControls {
		return vs[0].([]*BucketOwnershipControls)[vs[1].(int)]
	}).(BucketOwnershipControlsOutput)
}

type BucketOwnershipControlsMapOutput struct{ *pulumi.OutputState }

func (BucketOwnershipControlsMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*BucketOwnershipControls)(nil)).Elem()
}

func (o BucketOwnershipControlsMapOutput) ToBucketOwnershipControlsMapOutput() BucketOwnershipControlsMapOutput {
	return o
}

func (o BucketOwnershipControlsMapOutput) ToBucketOwnershipControlsMapOutputWithContext(ctx context.Context) BucketOwnershipControlsMapOutput {
	return o
}

func (o BucketOwnershipControlsMapOutput) MapIndex(k pulumi.StringInput) BucketOwnershipControlsOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *BucketOwnershipControls {
		return vs[0].(map[string]*BucketOwnershipControls)[vs[1].(string)]
	}).(BucketOwnershipControlsOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*BucketOwnershipControlsInput)(nil)).Elem(), &BucketOwnershipControls{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketOwnershipControlsArrayInput)(nil)).Elem(), BucketOwnershipControlsArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*BucketOwnershipControlsMapInput)(nil)).Elem(), BucketOwnershipControlsMap{})
	pulumi.RegisterOutputType(BucketOwnershipControlsOutput{})
	pulumi.RegisterOutputType(BucketOwnershipControlsArrayOutput{})
	pulumi.RegisterOutputType(BucketOwnershipControlsMapOutput{})
}
