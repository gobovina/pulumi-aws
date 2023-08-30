// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sagemaker

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a SageMaker App resource.
//
// ## Example Usage
// ### Basic usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sagemaker"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sagemaker.NewApp(ctx, "example", &sagemaker.AppArgs{
//				DomainId:        pulumi.Any(aws_sagemaker_domain.Example.Id),
//				UserProfileName: pulumi.Any(aws_sagemaker_user_profile.Example.User_profile_name),
//				AppName:         pulumi.String("example"),
//				AppType:         pulumi.String("JupyterServer"),
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
// Using `pulumi import`, import SageMaker Apps using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:sagemaker/app:App example arn:aws:sagemaker:us-west-2:012345678912:app/domain-id/user-profile-name/app-type/app-name
//
// ```
type App struct {
	pulumi.CustomResourceState

	// The name of the app.
	AppName pulumi.StringOutput `pulumi:"appName"`
	// The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
	AppType pulumi.StringOutput `pulumi:"appType"`
	// The Amazon Resource Name (ARN) of the app.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The domain ID.
	DomainId pulumi.StringOutput `pulumi:"domainId"`
	// The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
	ResourceSpec AppResourceSpecOutput `pulumi:"resourceSpec"`
	// The name of the space. At least one of `userProfileName` or `spaceName` required.
	SpaceName pulumi.StringPtrOutput `pulumi:"spaceName"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The user profile name. At least one of `userProfileName` or `spaceName` required.
	UserProfileName pulumi.StringPtrOutput `pulumi:"userProfileName"`
}

// NewApp registers a new resource with the given unique name, arguments, and options.
func NewApp(ctx *pulumi.Context,
	name string, args *AppArgs, opts ...pulumi.ResourceOption) (*App, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AppName == nil {
		return nil, errors.New("invalid value for required argument 'AppName'")
	}
	if args.AppType == nil {
		return nil, errors.New("invalid value for required argument 'AppType'")
	}
	if args.DomainId == nil {
		return nil, errors.New("invalid value for required argument 'DomainId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource App
	err := ctx.RegisterResource("aws:sagemaker/app:App", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApp gets an existing App resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApp(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AppState, opts ...pulumi.ResourceOption) (*App, error) {
	var resource App
	err := ctx.ReadResource("aws:sagemaker/app:App", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering App resources.
type appState struct {
	// The name of the app.
	AppName *string `pulumi:"appName"`
	// The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
	AppType *string `pulumi:"appType"`
	// The Amazon Resource Name (ARN) of the app.
	Arn *string `pulumi:"arn"`
	// The domain ID.
	DomainId *string `pulumi:"domainId"`
	// The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
	ResourceSpec *AppResourceSpec `pulumi:"resourceSpec"`
	// The name of the space. At least one of `userProfileName` or `spaceName` required.
	SpaceName *string `pulumi:"spaceName"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The user profile name. At least one of `userProfileName` or `spaceName` required.
	UserProfileName *string `pulumi:"userProfileName"`
}

type AppState struct {
	// The name of the app.
	AppName pulumi.StringPtrInput
	// The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
	AppType pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the app.
	Arn pulumi.StringPtrInput
	// The domain ID.
	DomainId pulumi.StringPtrInput
	// The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
	ResourceSpec AppResourceSpecPtrInput
	// The name of the space. At least one of `userProfileName` or `spaceName` required.
	SpaceName pulumi.StringPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// The user profile name. At least one of `userProfileName` or `spaceName` required.
	UserProfileName pulumi.StringPtrInput
}

func (AppState) ElementType() reflect.Type {
	return reflect.TypeOf((*appState)(nil)).Elem()
}

type appArgs struct {
	// The name of the app.
	AppName string `pulumi:"appName"`
	// The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
	AppType string `pulumi:"appType"`
	// The domain ID.
	DomainId string `pulumi:"domainId"`
	// The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
	ResourceSpec *AppResourceSpec `pulumi:"resourceSpec"`
	// The name of the space. At least one of `userProfileName` or `spaceName` required.
	SpaceName *string `pulumi:"spaceName"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The user profile name. At least one of `userProfileName` or `spaceName` required.
	UserProfileName *string `pulumi:"userProfileName"`
}

// The set of arguments for constructing a App resource.
type AppArgs struct {
	// The name of the app.
	AppName pulumi.StringInput
	// The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
	AppType pulumi.StringInput
	// The domain ID.
	DomainId pulumi.StringInput
	// The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
	ResourceSpec AppResourceSpecPtrInput
	// The name of the space. At least one of `userProfileName` or `spaceName` required.
	SpaceName pulumi.StringPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The user profile name. At least one of `userProfileName` or `spaceName` required.
	UserProfileName pulumi.StringPtrInput
}

func (AppArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*appArgs)(nil)).Elem()
}

type AppInput interface {
	pulumi.Input

	ToAppOutput() AppOutput
	ToAppOutputWithContext(ctx context.Context) AppOutput
}

func (*App) ElementType() reflect.Type {
	return reflect.TypeOf((**App)(nil)).Elem()
}

func (i *App) ToAppOutput() AppOutput {
	return i.ToAppOutputWithContext(context.Background())
}

func (i *App) ToAppOutputWithContext(ctx context.Context) AppOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppOutput)
}

// AppArrayInput is an input type that accepts AppArray and AppArrayOutput values.
// You can construct a concrete instance of `AppArrayInput` via:
//
//	AppArray{ AppArgs{...} }
type AppArrayInput interface {
	pulumi.Input

	ToAppArrayOutput() AppArrayOutput
	ToAppArrayOutputWithContext(context.Context) AppArrayOutput
}

type AppArray []AppInput

func (AppArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*App)(nil)).Elem()
}

func (i AppArray) ToAppArrayOutput() AppArrayOutput {
	return i.ToAppArrayOutputWithContext(context.Background())
}

func (i AppArray) ToAppArrayOutputWithContext(ctx context.Context) AppArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppArrayOutput)
}

// AppMapInput is an input type that accepts AppMap and AppMapOutput values.
// You can construct a concrete instance of `AppMapInput` via:
//
//	AppMap{ "key": AppArgs{...} }
type AppMapInput interface {
	pulumi.Input

	ToAppMapOutput() AppMapOutput
	ToAppMapOutputWithContext(context.Context) AppMapOutput
}

type AppMap map[string]AppInput

func (AppMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*App)(nil)).Elem()
}

func (i AppMap) ToAppMapOutput() AppMapOutput {
	return i.ToAppMapOutputWithContext(context.Background())
}

func (i AppMap) ToAppMapOutputWithContext(ctx context.Context) AppMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AppMapOutput)
}

type AppOutput struct{ *pulumi.OutputState }

func (AppOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**App)(nil)).Elem()
}

func (o AppOutput) ToAppOutput() AppOutput {
	return o
}

func (o AppOutput) ToAppOutputWithContext(ctx context.Context) AppOutput {
	return o
}

// The name of the app.
func (o AppOutput) AppName() pulumi.StringOutput {
	return o.ApplyT(func(v *App) pulumi.StringOutput { return v.AppName }).(pulumi.StringOutput)
}

// The type of app. Valid values are `JupyterServer`, `KernelGateway`, `RStudioServerPro`, `RSessionGateway` and `TensorBoard`.
func (o AppOutput) AppType() pulumi.StringOutput {
	return o.ApplyT(func(v *App) pulumi.StringOutput { return v.AppType }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the app.
func (o AppOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *App) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The domain ID.
func (o AppOutput) DomainId() pulumi.StringOutput {
	return o.ApplyT(func(v *App) pulumi.StringOutput { return v.DomainId }).(pulumi.StringOutput)
}

// The instance type and the Amazon Resource Name (ARN) of the SageMaker image created on the instance.See Resource Spec below.
func (o AppOutput) ResourceSpec() AppResourceSpecOutput {
	return o.ApplyT(func(v *App) AppResourceSpecOutput { return v.ResourceSpec }).(AppResourceSpecOutput)
}

// The name of the space. At least one of `userProfileName` or `spaceName` required.
func (o AppOutput) SpaceName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *App) pulumi.StringPtrOutput { return v.SpaceName }).(pulumi.StringPtrOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o AppOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *App) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o AppOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *App) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The user profile name. At least one of `userProfileName` or `spaceName` required.
func (o AppOutput) UserProfileName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *App) pulumi.StringPtrOutput { return v.UserProfileName }).(pulumi.StringPtrOutput)
}

type AppArrayOutput struct{ *pulumi.OutputState }

func (AppArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*App)(nil)).Elem()
}

func (o AppArrayOutput) ToAppArrayOutput() AppArrayOutput {
	return o
}

func (o AppArrayOutput) ToAppArrayOutputWithContext(ctx context.Context) AppArrayOutput {
	return o
}

func (o AppArrayOutput) Index(i pulumi.IntInput) AppOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *App {
		return vs[0].([]*App)[vs[1].(int)]
	}).(AppOutput)
}

type AppMapOutput struct{ *pulumi.OutputState }

func (AppMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*App)(nil)).Elem()
}

func (o AppMapOutput) ToAppMapOutput() AppMapOutput {
	return o
}

func (o AppMapOutput) ToAppMapOutputWithContext(ctx context.Context) AppMapOutput {
	return o
}

func (o AppMapOutput) MapIndex(k pulumi.StringInput) AppOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *App {
		return vs[0].(map[string]*App)[vs[1].(string)]
	}).(AppOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AppInput)(nil)).Elem(), &App{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppArrayInput)(nil)).Elem(), AppArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AppMapInput)(nil)).Elem(), AppMap{})
	pulumi.RegisterOutputType(AppOutput{})
	pulumi.RegisterOutputType(AppArrayOutput{})
	pulumi.RegisterOutputType(AppMapOutput{})
}
