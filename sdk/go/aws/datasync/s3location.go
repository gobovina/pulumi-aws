// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package datasync

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an S3 Location within AWS DataSync.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/datasync"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := datasync.NewS3Location(ctx, "example", &datasync.S3LocationArgs{
//				S3BucketArn:  pulumi.Any(exampleAwsS3Bucket.Arn),
//				Subdirectory: pulumi.String("/example/prefix"),
//				S3Config: &datasync.S3LocationS3ConfigArgs{
//					BucketAccessRoleArn: pulumi.Any(exampleAwsIamRole.Arn),
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
// Using `pulumi import`, import `aws_datasync_location_s3` using the DataSync Task Amazon Resource Name (ARN). For example:
//
// ```sh
//
//	$ pulumi import aws:datasync/s3Location:S3Location example arn:aws:datasync:us-east-1:123456789012:location/loc-12345678901234567
//
// ```
type S3Location struct {
	pulumi.CustomResourceState

	// A list of DataSync Agent ARNs with which this location will be associated.
	AgentArns pulumi.StringArrayOutput `pulumi:"agentArns"`
	// Amazon Resource Name (ARN) of the DataSync Location.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Amazon Resource Name (ARN) of the S3 Bucket.
	S3BucketArn pulumi.StringOutput `pulumi:"s3BucketArn"`
	// Configuration block containing information for connecting to S3.
	S3Config S3LocationS3ConfigOutput `pulumi:"s3Config"`
	// The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
	S3StorageClass pulumi.StringOutput `pulumi:"s3StorageClass"`
	// Prefix to perform actions as source or destination.
	Subdirectory pulumi.StringOutput `pulumi:"subdirectory"`
	// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	Uri     pulumi.StringOutput    `pulumi:"uri"`
}

// NewS3Location registers a new resource with the given unique name, arguments, and options.
func NewS3Location(ctx *pulumi.Context,
	name string, args *S3LocationArgs, opts ...pulumi.ResourceOption) (*S3Location, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.S3BucketArn == nil {
		return nil, errors.New("invalid value for required argument 'S3BucketArn'")
	}
	if args.S3Config == nil {
		return nil, errors.New("invalid value for required argument 'S3Config'")
	}
	if args.Subdirectory == nil {
		return nil, errors.New("invalid value for required argument 'Subdirectory'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource S3Location
	err := ctx.RegisterResource("aws:datasync/s3Location:S3Location", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetS3Location gets an existing S3Location resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetS3Location(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *S3LocationState, opts ...pulumi.ResourceOption) (*S3Location, error) {
	var resource S3Location
	err := ctx.ReadResource("aws:datasync/s3Location:S3Location", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering S3Location resources.
type s3locationState struct {
	// A list of DataSync Agent ARNs with which this location will be associated.
	AgentArns []string `pulumi:"agentArns"`
	// Amazon Resource Name (ARN) of the DataSync Location.
	Arn *string `pulumi:"arn"`
	// Amazon Resource Name (ARN) of the S3 Bucket.
	S3BucketArn *string `pulumi:"s3BucketArn"`
	// Configuration block containing information for connecting to S3.
	S3Config *S3LocationS3Config `pulumi:"s3Config"`
	// The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
	S3StorageClass *string `pulumi:"s3StorageClass"`
	// Prefix to perform actions as source or destination.
	Subdirectory *string `pulumi:"subdirectory"`
	// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	Uri     *string           `pulumi:"uri"`
}

type S3LocationState struct {
	// A list of DataSync Agent ARNs with which this location will be associated.
	AgentArns pulumi.StringArrayInput
	// Amazon Resource Name (ARN) of the DataSync Location.
	Arn pulumi.StringPtrInput
	// Amazon Resource Name (ARN) of the S3 Bucket.
	S3BucketArn pulumi.StringPtrInput
	// Configuration block containing information for connecting to S3.
	S3Config S3LocationS3ConfigPtrInput
	// The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
	S3StorageClass pulumi.StringPtrInput
	// Prefix to perform actions as source or destination.
	Subdirectory pulumi.StringPtrInput
	// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	Uri     pulumi.StringPtrInput
}

func (S3LocationState) ElementType() reflect.Type {
	return reflect.TypeOf((*s3locationState)(nil)).Elem()
}

type s3locationArgs struct {
	// A list of DataSync Agent ARNs with which this location will be associated.
	AgentArns []string `pulumi:"agentArns"`
	// Amazon Resource Name (ARN) of the S3 Bucket.
	S3BucketArn string `pulumi:"s3BucketArn"`
	// Configuration block containing information for connecting to S3.
	S3Config S3LocationS3Config `pulumi:"s3Config"`
	// The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
	S3StorageClass *string `pulumi:"s3StorageClass"`
	// Prefix to perform actions as source or destination.
	Subdirectory string `pulumi:"subdirectory"`
	// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a S3Location resource.
type S3LocationArgs struct {
	// A list of DataSync Agent ARNs with which this location will be associated.
	AgentArns pulumi.StringArrayInput
	// Amazon Resource Name (ARN) of the S3 Bucket.
	S3BucketArn pulumi.StringInput
	// Configuration block containing information for connecting to S3.
	S3Config S3LocationS3ConfigInput
	// The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
	S3StorageClass pulumi.StringPtrInput
	// Prefix to perform actions as source or destination.
	Subdirectory pulumi.StringInput
	// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (S3LocationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*s3locationArgs)(nil)).Elem()
}

type S3LocationInput interface {
	pulumi.Input

	ToS3LocationOutput() S3LocationOutput
	ToS3LocationOutputWithContext(ctx context.Context) S3LocationOutput
}

func (*S3Location) ElementType() reflect.Type {
	return reflect.TypeOf((**S3Location)(nil)).Elem()
}

func (i *S3Location) ToS3LocationOutput() S3LocationOutput {
	return i.ToS3LocationOutputWithContext(context.Background())
}

func (i *S3Location) ToS3LocationOutputWithContext(ctx context.Context) S3LocationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(S3LocationOutput)
}

// S3LocationArrayInput is an input type that accepts S3LocationArray and S3LocationArrayOutput values.
// You can construct a concrete instance of `S3LocationArrayInput` via:
//
//	S3LocationArray{ S3LocationArgs{...} }
type S3LocationArrayInput interface {
	pulumi.Input

	ToS3LocationArrayOutput() S3LocationArrayOutput
	ToS3LocationArrayOutputWithContext(context.Context) S3LocationArrayOutput
}

type S3LocationArray []S3LocationInput

func (S3LocationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*S3Location)(nil)).Elem()
}

func (i S3LocationArray) ToS3LocationArrayOutput() S3LocationArrayOutput {
	return i.ToS3LocationArrayOutputWithContext(context.Background())
}

func (i S3LocationArray) ToS3LocationArrayOutputWithContext(ctx context.Context) S3LocationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(S3LocationArrayOutput)
}

// S3LocationMapInput is an input type that accepts S3LocationMap and S3LocationMapOutput values.
// You can construct a concrete instance of `S3LocationMapInput` via:
//
//	S3LocationMap{ "key": S3LocationArgs{...} }
type S3LocationMapInput interface {
	pulumi.Input

	ToS3LocationMapOutput() S3LocationMapOutput
	ToS3LocationMapOutputWithContext(context.Context) S3LocationMapOutput
}

type S3LocationMap map[string]S3LocationInput

func (S3LocationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*S3Location)(nil)).Elem()
}

func (i S3LocationMap) ToS3LocationMapOutput() S3LocationMapOutput {
	return i.ToS3LocationMapOutputWithContext(context.Background())
}

func (i S3LocationMap) ToS3LocationMapOutputWithContext(ctx context.Context) S3LocationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(S3LocationMapOutput)
}

type S3LocationOutput struct{ *pulumi.OutputState }

func (S3LocationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**S3Location)(nil)).Elem()
}

func (o S3LocationOutput) ToS3LocationOutput() S3LocationOutput {
	return o
}

func (o S3LocationOutput) ToS3LocationOutputWithContext(ctx context.Context) S3LocationOutput {
	return o
}

// A list of DataSync Agent ARNs with which this location will be associated.
func (o S3LocationOutput) AgentArns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *S3Location) pulumi.StringArrayOutput { return v.AgentArns }).(pulumi.StringArrayOutput)
}

// Amazon Resource Name (ARN) of the DataSync Location.
func (o S3LocationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *S3Location) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Amazon Resource Name (ARN) of the S3 Bucket.
func (o S3LocationOutput) S3BucketArn() pulumi.StringOutput {
	return o.ApplyT(func(v *S3Location) pulumi.StringOutput { return v.S3BucketArn }).(pulumi.StringOutput)
}

// Configuration block containing information for connecting to S3.
func (o S3LocationOutput) S3Config() S3LocationS3ConfigOutput {
	return o.ApplyT(func(v *S3Location) S3LocationS3ConfigOutput { return v.S3Config }).(S3LocationS3ConfigOutput)
}

// The Amazon S3 storage class that you want to store your files in when this location is used as a task destination. [Valid values](https://docs.aws.amazon.com/datasync/latest/userguide/create-s3-location.html#using-storage-classes)
func (o S3LocationOutput) S3StorageClass() pulumi.StringOutput {
	return o.ApplyT(func(v *S3Location) pulumi.StringOutput { return v.S3StorageClass }).(pulumi.StringOutput)
}

// Prefix to perform actions as source or destination.
func (o S3LocationOutput) Subdirectory() pulumi.StringOutput {
	return o.ApplyT(func(v *S3Location) pulumi.StringOutput { return v.Subdirectory }).(pulumi.StringOutput)
}

// Key-value pairs of resource tags to assign to the DataSync Location. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o S3LocationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *S3Location) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o S3LocationOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *S3Location) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

func (o S3LocationOutput) Uri() pulumi.StringOutput {
	return o.ApplyT(func(v *S3Location) pulumi.StringOutput { return v.Uri }).(pulumi.StringOutput)
}

type S3LocationArrayOutput struct{ *pulumi.OutputState }

func (S3LocationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*S3Location)(nil)).Elem()
}

func (o S3LocationArrayOutput) ToS3LocationArrayOutput() S3LocationArrayOutput {
	return o
}

func (o S3LocationArrayOutput) ToS3LocationArrayOutputWithContext(ctx context.Context) S3LocationArrayOutput {
	return o
}

func (o S3LocationArrayOutput) Index(i pulumi.IntInput) S3LocationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *S3Location {
		return vs[0].([]*S3Location)[vs[1].(int)]
	}).(S3LocationOutput)
}

type S3LocationMapOutput struct{ *pulumi.OutputState }

func (S3LocationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*S3Location)(nil)).Elem()
}

func (o S3LocationMapOutput) ToS3LocationMapOutput() S3LocationMapOutput {
	return o
}

func (o S3LocationMapOutput) ToS3LocationMapOutputWithContext(ctx context.Context) S3LocationMapOutput {
	return o
}

func (o S3LocationMapOutput) MapIndex(k pulumi.StringInput) S3LocationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *S3Location {
		return vs[0].(map[string]*S3Location)[vs[1].(string)]
	}).(S3LocationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*S3LocationInput)(nil)).Elem(), &S3Location{})
	pulumi.RegisterInputType(reflect.TypeOf((*S3LocationArrayInput)(nil)).Elem(), S3LocationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*S3LocationMapInput)(nil)).Elem(), S3LocationMap{})
	pulumi.RegisterOutputType(S3LocationOutput{})
	pulumi.RegisterOutputType(S3LocationArrayOutput{})
	pulumi.RegisterOutputType(S3LocationMapOutput{})
}
