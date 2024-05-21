// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package m2

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an [AWS Mainframe Modernization Application](https://docs.aws.amazon.com/m2/latest/userguide/applications-m2.html).
//
// ## Example Usage
//
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/m2"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := m2.NewApplication(ctx, "example", &m2.ApplicationArgs{
//				Name:       pulumi.String("Example"),
//				EngineType: pulumi.String("bluage"),
//				Definition: &m2.ApplicationDefinitionArgs{
//					Content: pulumi.String(fmt.Sprintf(`{
//	  "definition": {
//	    "listeners": [
//	      {
//	        "port": 8196,
//	        "type": "http"
//	      }
//	    ],
//	    "ba-application": {
//	      "app-location": "%v/PlanetsDemo-v1.zip"
//	    }
//	  },
//	  "source-locations": [
//	    {
//	      "source-id": "s3-source",
//	      "source-type": "s3",
//	      "properties": {
//	        "s3-bucket": "example-bucket",
//	        "s3-key-prefix": "v1"
//	      }
//	    }
//	  ],
//	  "template-version": "2.0"
//	}
//
// `, s3_source)),
//
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
// Using `pulumi import`, import Mainframe Modernization Application using the `01234567890abcdef012345678`. For example:
//
// ```sh
// $ pulumi import aws:m2/application:Application example 01234567890abcdef012345678
// ```
type Application struct {
	pulumi.CustomResourceState

	// Id of the Application.
	ApplicationId pulumi.StringOutput `pulumi:"applicationId"`
	// ARN of the Application.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Current version of the application deployed.
	CurrentVersion pulumi.IntOutput `pulumi:"currentVersion"`
	// The application definition for this application. You can specify either inline JSON or an S3 bucket location.
	Definition ApplicationDefinitionPtrOutput `pulumi:"definition"`
	// Description of the application.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Engine type must be `microfocus | bluage`.
	EngineType pulumi.StringOutput `pulumi:"engineType"`
	// KMS Key to use for the Application.
	KmsKeyId pulumi.StringPtrOutput `pulumi:"kmsKeyId"`
	// Unique identifier of the application.
	//
	// The following arguments are optional:
	Name pulumi.StringOutput `pulumi:"name"`
	// ARN of role for application to use to access AWS resources.
	RoleArn pulumi.StringPtrOutput `pulumi:"roleArn"`
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapOutput       `pulumi:"tagsAll"`
	Timeouts ApplicationTimeoutsPtrOutput `pulumi:"timeouts"`
}

// NewApplication registers a new resource with the given unique name, arguments, and options.
func NewApplication(ctx *pulumi.Context,
	name string, args *ApplicationArgs, opts ...pulumi.ResourceOption) (*Application, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.EngineType == nil {
		return nil, errors.New("invalid value for required argument 'EngineType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Application
	err := ctx.RegisterResource("aws:m2/application:Application", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetApplication gets an existing Application resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetApplication(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ApplicationState, opts ...pulumi.ResourceOption) (*Application, error) {
	var resource Application
	err := ctx.ReadResource("aws:m2/application:Application", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Application resources.
type applicationState struct {
	// Id of the Application.
	ApplicationId *string `pulumi:"applicationId"`
	// ARN of the Application.
	Arn *string `pulumi:"arn"`
	// Current version of the application deployed.
	CurrentVersion *int `pulumi:"currentVersion"`
	// The application definition for this application. You can specify either inline JSON or an S3 bucket location.
	Definition *ApplicationDefinition `pulumi:"definition"`
	// Description of the application.
	Description *string `pulumi:"description"`
	// Engine type must be `microfocus | bluage`.
	EngineType *string `pulumi:"engineType"`
	// KMS Key to use for the Application.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Unique identifier of the application.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// ARN of role for application to use to access AWS resources.
	RoleArn *string `pulumi:"roleArn"`
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  map[string]string    `pulumi:"tagsAll"`
	Timeouts *ApplicationTimeouts `pulumi:"timeouts"`
}

type ApplicationState struct {
	// Id of the Application.
	ApplicationId pulumi.StringPtrInput
	// ARN of the Application.
	Arn pulumi.StringPtrInput
	// Current version of the application deployed.
	CurrentVersion pulumi.IntPtrInput
	// The application definition for this application. You can specify either inline JSON or an S3 bucket location.
	Definition ApplicationDefinitionPtrInput
	// Description of the application.
	Description pulumi.StringPtrInput
	// Engine type must be `microfocus | bluage`.
	EngineType pulumi.StringPtrInput
	// KMS Key to use for the Application.
	KmsKeyId pulumi.StringPtrInput
	// Unique identifier of the application.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// ARN of role for application to use to access AWS resources.
	RoleArn pulumi.StringPtrInput
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll  pulumi.StringMapInput
	Timeouts ApplicationTimeoutsPtrInput
}

func (ApplicationState) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationState)(nil)).Elem()
}

type applicationArgs struct {
	// The application definition for this application. You can specify either inline JSON or an S3 bucket location.
	Definition *ApplicationDefinition `pulumi:"definition"`
	// Description of the application.
	Description *string `pulumi:"description"`
	// Engine type must be `microfocus | bluage`.
	EngineType string `pulumi:"engineType"`
	// KMS Key to use for the Application.
	KmsKeyId *string `pulumi:"kmsKeyId"`
	// Unique identifier of the application.
	//
	// The following arguments are optional:
	Name *string `pulumi:"name"`
	// ARN of role for application to use to access AWS resources.
	RoleArn *string `pulumi:"roleArn"`
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     map[string]string    `pulumi:"tags"`
	Timeouts *ApplicationTimeouts `pulumi:"timeouts"`
}

// The set of arguments for constructing a Application resource.
type ApplicationArgs struct {
	// The application definition for this application. You can specify either inline JSON or an S3 bucket location.
	Definition ApplicationDefinitionPtrInput
	// Description of the application.
	Description pulumi.StringPtrInput
	// Engine type must be `microfocus | bluage`.
	EngineType pulumi.StringInput
	// KMS Key to use for the Application.
	KmsKeyId pulumi.StringPtrInput
	// Unique identifier of the application.
	//
	// The following arguments are optional:
	Name pulumi.StringPtrInput
	// ARN of role for application to use to access AWS resources.
	RoleArn pulumi.StringPtrInput
	// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags     pulumi.StringMapInput
	Timeouts ApplicationTimeoutsPtrInput
}

func (ApplicationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*applicationArgs)(nil)).Elem()
}

type ApplicationInput interface {
	pulumi.Input

	ToApplicationOutput() ApplicationOutput
	ToApplicationOutputWithContext(ctx context.Context) ApplicationOutput
}

func (*Application) ElementType() reflect.Type {
	return reflect.TypeOf((**Application)(nil)).Elem()
}

func (i *Application) ToApplicationOutput() ApplicationOutput {
	return i.ToApplicationOutputWithContext(context.Background())
}

func (i *Application) ToApplicationOutputWithContext(ctx context.Context) ApplicationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationOutput)
}

// ApplicationArrayInput is an input type that accepts ApplicationArray and ApplicationArrayOutput values.
// You can construct a concrete instance of `ApplicationArrayInput` via:
//
//	ApplicationArray{ ApplicationArgs{...} }
type ApplicationArrayInput interface {
	pulumi.Input

	ToApplicationArrayOutput() ApplicationArrayOutput
	ToApplicationArrayOutputWithContext(context.Context) ApplicationArrayOutput
}

type ApplicationArray []ApplicationInput

func (ApplicationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Application)(nil)).Elem()
}

func (i ApplicationArray) ToApplicationArrayOutput() ApplicationArrayOutput {
	return i.ToApplicationArrayOutputWithContext(context.Background())
}

func (i ApplicationArray) ToApplicationArrayOutputWithContext(ctx context.Context) ApplicationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationArrayOutput)
}

// ApplicationMapInput is an input type that accepts ApplicationMap and ApplicationMapOutput values.
// You can construct a concrete instance of `ApplicationMapInput` via:
//
//	ApplicationMap{ "key": ApplicationArgs{...} }
type ApplicationMapInput interface {
	pulumi.Input

	ToApplicationMapOutput() ApplicationMapOutput
	ToApplicationMapOutputWithContext(context.Context) ApplicationMapOutput
}

type ApplicationMap map[string]ApplicationInput

func (ApplicationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Application)(nil)).Elem()
}

func (i ApplicationMap) ToApplicationMapOutput() ApplicationMapOutput {
	return i.ToApplicationMapOutputWithContext(context.Background())
}

func (i ApplicationMap) ToApplicationMapOutputWithContext(ctx context.Context) ApplicationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ApplicationMapOutput)
}

type ApplicationOutput struct{ *pulumi.OutputState }

func (ApplicationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Application)(nil)).Elem()
}

func (o ApplicationOutput) ToApplicationOutput() ApplicationOutput {
	return o
}

func (o ApplicationOutput) ToApplicationOutputWithContext(ctx context.Context) ApplicationOutput {
	return o
}

// Id of the Application.
func (o ApplicationOutput) ApplicationId() pulumi.StringOutput {
	return o.ApplyT(func(v *Application) pulumi.StringOutput { return v.ApplicationId }).(pulumi.StringOutput)
}

// ARN of the Application.
func (o ApplicationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Application) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Current version of the application deployed.
func (o ApplicationOutput) CurrentVersion() pulumi.IntOutput {
	return o.ApplyT(func(v *Application) pulumi.IntOutput { return v.CurrentVersion }).(pulumi.IntOutput)
}

// The application definition for this application. You can specify either inline JSON or an S3 bucket location.
func (o ApplicationOutput) Definition() ApplicationDefinitionPtrOutput {
	return o.ApplyT(func(v *Application) ApplicationDefinitionPtrOutput { return v.Definition }).(ApplicationDefinitionPtrOutput)
}

// Description of the application.
func (o ApplicationOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Application) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Engine type must be `microfocus | bluage`.
func (o ApplicationOutput) EngineType() pulumi.StringOutput {
	return o.ApplyT(func(v *Application) pulumi.StringOutput { return v.EngineType }).(pulumi.StringOutput)
}

// KMS Key to use for the Application.
func (o ApplicationOutput) KmsKeyId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Application) pulumi.StringPtrOutput { return v.KmsKeyId }).(pulumi.StringPtrOutput)
}

// Unique identifier of the application.
//
// The following arguments are optional:
func (o ApplicationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Application) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// ARN of role for application to use to access AWS resources.
func (o ApplicationOutput) RoleArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Application) pulumi.StringPtrOutput { return v.RoleArn }).(pulumi.StringPtrOutput)
}

// Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ApplicationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Application) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ApplicationOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Application) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

func (o ApplicationOutput) Timeouts() ApplicationTimeoutsPtrOutput {
	return o.ApplyT(func(v *Application) ApplicationTimeoutsPtrOutput { return v.Timeouts }).(ApplicationTimeoutsPtrOutput)
}

type ApplicationArrayOutput struct{ *pulumi.OutputState }

func (ApplicationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Application)(nil)).Elem()
}

func (o ApplicationArrayOutput) ToApplicationArrayOutput() ApplicationArrayOutput {
	return o
}

func (o ApplicationArrayOutput) ToApplicationArrayOutputWithContext(ctx context.Context) ApplicationArrayOutput {
	return o
}

func (o ApplicationArrayOutput) Index(i pulumi.IntInput) ApplicationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Application {
		return vs[0].([]*Application)[vs[1].(int)]
	}).(ApplicationOutput)
}

type ApplicationMapOutput struct{ *pulumi.OutputState }

func (ApplicationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Application)(nil)).Elem()
}

func (o ApplicationMapOutput) ToApplicationMapOutput() ApplicationMapOutput {
	return o
}

func (o ApplicationMapOutput) ToApplicationMapOutputWithContext(ctx context.Context) ApplicationMapOutput {
	return o
}

func (o ApplicationMapOutput) MapIndex(k pulumi.StringInput) ApplicationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Application {
		return vs[0].(map[string]*Application)[vs[1].(string)]
	}).(ApplicationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationInput)(nil)).Elem(), &Application{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationArrayInput)(nil)).Elem(), ApplicationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ApplicationMapInput)(nil)).Elem(), ApplicationMap{})
	pulumi.RegisterOutputType(ApplicationOutput{})
	pulumi.RegisterOutputType(ApplicationArrayOutput{})
	pulumi.RegisterOutputType(ApplicationMapOutput{})
}
