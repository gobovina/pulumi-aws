// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package elasticbeanstalk

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Elastic Beanstalk Application Version Resource. Elastic Beanstalk allows
// you to deploy and manage applications in the AWS cloud without worrying about
// the infrastructure that runs those applications.
//
// This resource creates a Beanstalk Application Version that can be deployed to a Beanstalk
// Environment.
//
// > **NOTE on Application Version Resource:**  When using the Application Version resource with multiple
// Elastic Beanstalk Environments it is possible that an error may be returned
// when attempting to delete an Application Version while it is still in use by a different environment.
// To work around this you can either create each environment in a separate AWS account or create your `elasticbeanstalk.ApplicationVersion` resources with a unique names in your Elastic Beanstalk Application. For example &lt;revision&gt;-&lt;environment&gt;.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/elasticbeanstalk"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/s3"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := s3.NewBucketV2(ctx, "default", &s3.BucketV2Args{
//				Bucket: pulumi.String("tftest.applicationversion.bucket"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultBucketObjectv2, err := s3.NewBucketObjectv2(ctx, "default", &s3.BucketObjectv2Args{
//				Bucket: _default.ID(),
//				Key:    pulumi.String("beanstalk/go-v1.zip"),
//				Source: pulumi.NewFileAsset("go-v1.zip"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = elasticbeanstalk.NewApplication(ctx, "default", &elasticbeanstalk.ApplicationArgs{
//				Name:        pulumi.String("tf-test-name"),
//				Description: pulumi.String("tf-test-desc"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = elasticbeanstalk.NewApplicationVersion(ctx, "default", &elasticbeanstalk.ApplicationVersionArgs{
//				Name:        pulumi.String("tf-test-version-label"),
//				Application: pulumi.Any("tf-test-name"),
//				Description: pulumi.String("application version"),
//				Bucket:      _default.ID(),
//				Key:         defaultBucketObjectv2.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
type ApplicationVersion struct {
	pulumi.CustomResourceState

	// Name of the Beanstalk Application the version is associated with.
	Application pulumi.StringOutput `pulumi:"application"`
	// ARN assigned by AWS for this Elastic Beanstalk Application.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// S3 bucket that contains the Application Version source bundle.
	Bucket pulumi.StringOutput `pulumi:"bucket"`
	// Short description of the Application Version.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
	ForceDelete pulumi.BoolPtrOutput `pulumi:"forceDelete"`
	// S3 object that is the Application Version source bundle.
	Key pulumi.StringOutput `pulumi:"key"`
	// Unique name for the this Application Version.
	//
	// The following arguments are optional:
	Name pulumi.StringOutput `pulumi:"name"`
	// Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewApplicationVersion registers a new resource with the given unique name, arguments, and options.
func NewApplicationVersion(ctx *pulumi.Context,
	name string, args *ApplicationVersionArgs, opts ...pulumi.ResourceOption) (*ApplicationVersion, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Application == nil {
		return nil, errors.New("invalid value for required argument 'Application'")
	}
	if args.Bucket == nil {
		return nil, errors.New("invalid value for required argument 'Bucket'")
	}
	if args.Key == nil {
		return nil, errors.New("invalid value for required argument 'Key'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ApplicationVersion
	err := ctx.RegisterResource("aws:elasticbeanstalk/applicationVersion:ApplicationVersion", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplicationVersion gets an existing ApplicationVersion resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplicationVersion(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationVersionState, opts ...pulumi.ResourceOption) (*ApplicationVersion, error) {
	var resource ApplicationVersion
	err := ctx.ReadResource("aws:elasticbeanstalk/applicationVersion:ApplicationVersion", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ApplicationVersion resources.
type applicationVersionState struct {
	// Name of the Beanstalk Application the version is associated with.
	Application interface{} `pulumi:"application"`
	// ARN assigned by AWS for this Elastic Beanstalk Application.
	Arn *string `pulumi:"arn"`
	// S3 bucket that contains the Application Version source bundle.
	Bucket interface{} `pulumi:"bucket"`
	// Short description of the Application Version.
	Description *string `pulumi:"description"`
	// On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
	ForceDelete *bool `pulumi:"forceDelete"`
	// S3 object that is the Application Version source bundle.
	Key *string `pulumi:"key"`
	// Unique name for the this Application Version.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ApplicationVersionState struct {
	// Name of the Beanstalk Application the version is associated with.
	Application pulumi.Input
	// ARN assigned by AWS for this Elastic Beanstalk Application.
	Arn pulumi.StringPtrInput
	// S3 bucket that contains the Application Version source bundle.
	Bucket pulumi.Input
	// Short description of the Application Version.
	Description pulumi.StringPtrInput
	// On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
	ForceDelete pulumi.BoolPtrInput
	// S3 object that is the Application Version source bundle.
	Key pulumi.StringPtrInput
	// Unique name for the this Application Version.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ApplicationVersionState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationVersionState)(nil)).Elem()
}

type applicationVersionArgs struct {
	// Name of the Beanstalk Application the version is associated with.
	Application interface{} `pulumi:"application"`
	// S3 bucket that contains the Application Version source bundle.
	Bucket interface{} `pulumi:"bucket"`
	// Short description of the Application Version.
	Description *string `pulumi:"description"`
	// On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
	ForceDelete *bool `pulumi:"forceDelete"`
	// S3 object that is the Application Version source bundle.
	Key string `pulumi:"key"`
	// Unique name for the this Application Version.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ApplicationVersion resource.
type ApplicationVersionArgs struct {
	// Name of the Beanstalk Application the version is associated with.
	Application pulumi.Input
	// S3 bucket that contains the Application Version source bundle.
	Bucket pulumi.Input
	// Short description of the Application Version.
	Description pulumi.StringPtrInput
	// On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
	ForceDelete pulumi.BoolPtrInput
	// S3 object that is the Application Version source bundle.
	Key pulumi.StringInput
	// Unique name for the this Application Version.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ApplicationVersionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationVersionArgs)(nil)).Elem()
}

type ApplicationVersionInput interface {
	pulumi.Input

	ToApplicationVersionOutput() ApplicationVersionOutput
	ToApplicationVersionOutputWithContext(ctx context.Context) ApplicationVersionOutput
}

func (*ApplicationVersion) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationVersion)(nil)).Elem()
}

func (i *ApplicationVersion) ToApplicationVersionOutput() ApplicationVersionOutput {
	return i.ToApplicationVersionOutputWithContext(context.Background())
}

func (i *ApplicationVersion) ToApplicationVersionOutputWithContext(ctx context.Context) ApplicationVersionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationVersionOutput)
}

// ApplicationVersionArrayInput is an input type that accepts ApplicationVersionArray and ApplicationVersionArrayOutput values.
// You can construct a concrete instance of `ApplicationVersionArrayInput` via:
//
//	ApplicationVersionArray{ ApplicationVersionArgs{...} }
type ApplicationVersionArrayInput interface {
	pulumi.Input

	ToApplicationVersionArrayOutput() ApplicationVersionArrayOutput
	ToApplicationVersionArrayOutputWithContext(context.Context) ApplicationVersionArrayOutput
}

type ApplicationVersionArray []ApplicationVersionInput

func (ApplicationVersionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationVersion)(nil)).Elem()
}

func (i ApplicationVersionArray) ToApplicationVersionArrayOutput() ApplicationVersionArrayOutput {
	return i.ToApplicationVersionArrayOutputWithContext(context.Background())
}

func (i ApplicationVersionArray) ToApplicationVersionArrayOutputWithContext(ctx context.Context) ApplicationVersionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationVersionArrayOutput)
}

// ApplicationVersionMapInput is an input type that accepts ApplicationVersionMap and ApplicationVersionMapOutput values.
// You can construct a concrete instance of `ApplicationVersionMapInput` via:
//
//	ApplicationVersionMap{ "key": ApplicationVersionArgs{...} }
type ApplicationVersionMapInput interface {
	pulumi.Input

	ToApplicationVersionMapOutput() ApplicationVersionMapOutput
	ToApplicationVersionMapOutputWithContext(context.Context) ApplicationVersionMapOutput
}

type ApplicationVersionMap map[string]ApplicationVersionInput

func (ApplicationVersionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationVersion)(nil)).Elem()
}

func (i ApplicationVersionMap) ToApplicationVersionMapOutput() ApplicationVersionMapOutput {
	return i.ToApplicationVersionMapOutputWithContext(context.Background())
}

func (i ApplicationVersionMap) ToApplicationVersionMapOutputWithContext(ctx context.Context) ApplicationVersionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationVersionMapOutput)
}

type ApplicationVersionOutput struct{ *pulumi.OutputState }

func (ApplicationVersionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ApplicationVersion)(nil)).Elem()
}

func (o ApplicationVersionOutput) ToApplicationVersionOutput() ApplicationVersionOutput {
	return o
}

func (o ApplicationVersionOutput) ToApplicationVersionOutputWithContext(ctx context.Context) ApplicationVersionOutput {
	return o
}

// Name of the Beanstalk Application the version is associated with.
func (o ApplicationVersionOutput) Application() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationVersion) pulumi.StringOutput { return v.Application }).(pulumi.StringOutput)
}

// ARN assigned by AWS for this Elastic Beanstalk Application.
func (o ApplicationVersionOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationVersion) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// S3 bucket that contains the Application Version source bundle.
func (o ApplicationVersionOutput) Bucket() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationVersion) pulumi.StringOutput { return v.Bucket }).(pulumi.StringOutput)
}

// Short description of the Application Version.
func (o ApplicationVersionOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ApplicationVersion) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// On delete, force an Application Version to be deleted when it may be in use by multiple Elastic Beanstalk Environments.
func (o ApplicationVersionOutput) ForceDelete() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *ApplicationVersion) pulumi.BoolPtrOutput { return v.ForceDelete }).(pulumi.BoolPtrOutput)
}

// S3 object that is the Application Version source bundle.
func (o ApplicationVersionOutput) Key() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationVersion) pulumi.StringOutput { return v.Key }).(pulumi.StringOutput)
}

// Unique name for the this Application Version.
//
// The following arguments are optional:
func (o ApplicationVersionOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ApplicationVersion) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Key-value map of tags for the Elastic Beanstalk Application Version. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ApplicationVersionOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ApplicationVersion) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ApplicationVersionOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ApplicationVersion) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ApplicationVersionArrayOutput struct{ *pulumi.OutputState }

func (ApplicationVersionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ApplicationVersion)(nil)).Elem()
}

func (o ApplicationVersionArrayOutput) ToApplicationVersionArrayOutput() ApplicationVersionArrayOutput {
	return o
}

func (o ApplicationVersionArrayOutput) ToApplicationVersionArrayOutputWithContext(ctx context.Context) ApplicationVersionArrayOutput {
	return o
}

func (o ApplicationVersionArrayOutput) Index(i pulumi.IntInput) ApplicationVersionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ApplicationVersion {
		return vs[0].([]*ApplicationVersion)[vs[1].(int)]
	}).(ApplicationVersionOutput)
}

type ApplicationVersionMapOutput struct{ *pulumi.OutputState }

func (ApplicationVersionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ApplicationVersion)(nil)).Elem()
}

func (o ApplicationVersionMapOutput) ToApplicationVersionMapOutput() ApplicationVersionMapOutput {
	return o
}

func (o ApplicationVersionMapOutput) ToApplicationVersionMapOutputWithContext(ctx context.Context) ApplicationVersionMapOutput {
	return o
}

func (o ApplicationVersionMapOutput) MapIndex(k pulumi.StringInput) ApplicationVersionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ApplicationVersion {
		return vs[0].(map[string]*ApplicationVersion)[vs[1].(string)]
	}).(ApplicationVersionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationVersionInput)(nil)).Elem(), &ApplicationVersion{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationVersionArrayInput)(nil)).Elem(), ApplicationVersionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationVersionMapInput)(nil)).Elem(), ApplicationVersionMap{})
	pulumi.RegisterOutputType(ApplicationVersionOutput{})
	pulumi.RegisterOutputType(ApplicationVersionArrayOutput{})
	pulumi.RegisterOutputType(ApplicationVersionMapOutput{})
}
