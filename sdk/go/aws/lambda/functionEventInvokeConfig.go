// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lambda

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an asynchronous invocation configuration for a Lambda Function or Alias. More information about asynchronous invocations and the configurable values can be found in the [Lambda Developer Guide](https://docs.aws.amazon.com/lambda/latest/dg/invocation-async.html).
//
// ## Example Usage
// ### Destination Configuration
//
// > **NOTE:** Ensure the Lambda Function IAM Role has necessary permissions for the destination, such as `sqs:SendMessage` or `sns:Publish`, otherwise the API will return a generic `InvalidParameterValueException: The destination ARN arn:PARTITION:SERVICE:REGION:ACCOUNT:RESOURCE is invalid.` error.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lambda"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := lambda.NewFunctionEventInvokeConfig(ctx, "example", &lambda.FunctionEventInvokeConfigArgs{
//				FunctionName: pulumi.Any(aws_lambda_alias.Example.Function_name),
//				DestinationConfig: &lambda.FunctionEventInvokeConfigDestinationConfigArgs{
//					OnFailure: &lambda.FunctionEventInvokeConfigDestinationConfigOnFailureArgs{
//						Destination: pulumi.Any(aws_sqs_queue.Example.Arn),
//					},
//					OnSuccess: &lambda.FunctionEventInvokeConfigDestinationConfigOnSuccessArgs{
//						Destination: pulumi.Any(aws_sns_topic.Example.Arn),
//					},
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
// ### Error Handling Configuration
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lambda"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := lambda.NewFunctionEventInvokeConfig(ctx, "example", &lambda.FunctionEventInvokeConfigArgs{
//				FunctionName:             pulumi.Any(aws_lambda_alias.Example.Function_name),
//				MaximumEventAgeInSeconds: pulumi.Int(60),
//				MaximumRetryAttempts:     pulumi.Int(0),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Configuration for Alias Name
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lambda"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := lambda.NewFunctionEventInvokeConfig(ctx, "example", &lambda.FunctionEventInvokeConfigArgs{
//				FunctionName: pulumi.Any(aws_lambda_alias.Example.Function_name),
//				Qualifier:    pulumi.Any(aws_lambda_alias.Example.Name),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Configuration for Function Latest Unpublished Version
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lambda"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := lambda.NewFunctionEventInvokeConfig(ctx, "example", &lambda.FunctionEventInvokeConfigArgs{
//				FunctionName: pulumi.Any(aws_lambda_function.Example.Function_name),
//				Qualifier:    pulumi.String("$LATEST"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Configuration for Function Published Version
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lambda"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := lambda.NewFunctionEventInvokeConfig(ctx, "example", &lambda.FunctionEventInvokeConfigArgs{
//				FunctionName: pulumi.Any(aws_lambda_function.Example.Function_name),
//				Qualifier:    pulumi.Any(aws_lambda_function.Example.Version),
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
// ARN without qualifier (all versions and aliases):
//
// ARN with qualifier:
//
// Name without qualifier (all versions and aliases):
//
// Name with qualifier:
//
// __Using `pulumi import` to import__ Lambda Function Event Invoke Configs using the fully qualified Function name or Amazon Resource Name (ARN). For example:
//
// ARN without qualifier (all versions and aliases):
//
// ```sh
//
//	$ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example arn:aws:us-east-1:123456789012:function:my_function
//
// ```
//
//	ARN with qualifier:
//
// ```sh
//
//	$ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example arn:aws:us-east-1:123456789012:function:my_function:production
//
// ```
//
//	Name without qualifier (all versions and aliases):
//
// ```sh
//
//	$ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example my_function
//
// ```
//
//	Name with qualifier:
//
// ```sh
//
//	$ pulumi import aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig example my_function:production
//
// ```
type FunctionEventInvokeConfig struct {
	pulumi.CustomResourceState

	// Configuration block with destination configuration. See below for details.
	DestinationConfig FunctionEventInvokeConfigDestinationConfigPtrOutput `pulumi:"destinationConfig"`
	// Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
	//
	// The following arguments are optional:
	FunctionName pulumi.StringOutput `pulumi:"functionName"`
	// Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
	MaximumEventAgeInSeconds pulumi.IntPtrOutput `pulumi:"maximumEventAgeInSeconds"`
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
	MaximumRetryAttempts pulumi.IntPtrOutput `pulumi:"maximumRetryAttempts"`
	// Lambda Function published version, `$LATEST`, or Lambda Alias name.
	Qualifier pulumi.StringPtrOutput `pulumi:"qualifier"`
}

// NewFunctionEventInvokeConfig registers a new resource with the given unique name, arguments, and options.
func NewFunctionEventInvokeConfig(ctx *pulumi.Context,
	name string, args *FunctionEventInvokeConfigArgs, opts ...pulumi.ResourceOption) (*FunctionEventInvokeConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FunctionName == nil {
		return nil, errors.New("invalid value for required argument 'FunctionName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource FunctionEventInvokeConfig
	err := ctx.RegisterResource("aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetFunctionEventInvokeConfig gets an existing FunctionEventInvokeConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetFunctionEventInvokeConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *FunctionEventInvokeConfigState, opts ...pulumi.ResourceOption) (*FunctionEventInvokeConfig, error) {
	var resource FunctionEventInvokeConfig
	err := ctx.ReadResource("aws:lambda/functionEventInvokeConfig:FunctionEventInvokeConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering FunctionEventInvokeConfig resources.
type functionEventInvokeConfigState struct {
	// Configuration block with destination configuration. See below for details.
	DestinationConfig *FunctionEventInvokeConfigDestinationConfig `pulumi:"destinationConfig"`
	// Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
	//
	// The following arguments are optional:
	FunctionName *string `pulumi:"functionName"`
	// Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
	MaximumEventAgeInSeconds *int `pulumi:"maximumEventAgeInSeconds"`
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
	MaximumRetryAttempts *int `pulumi:"maximumRetryAttempts"`
	// Lambda Function published version, `$LATEST`, or Lambda Alias name.
	Qualifier *string `pulumi:"qualifier"`
}

type FunctionEventInvokeConfigState struct {
	// Configuration block with destination configuration. See below for details.
	DestinationConfig FunctionEventInvokeConfigDestinationConfigPtrInput
	// Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
	//
	// The following arguments are optional:
	FunctionName pulumi.StringPtrInput
	// Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
	MaximumEventAgeInSeconds pulumi.IntPtrInput
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
	MaximumRetryAttempts pulumi.IntPtrInput
	// Lambda Function published version, `$LATEST`, or Lambda Alias name.
	Qualifier pulumi.StringPtrInput
}

func (FunctionEventInvokeConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*functionEventInvokeConfigState)(nil)).Elem()
}

type functionEventInvokeConfigArgs struct {
	// Configuration block with destination configuration. See below for details.
	DestinationConfig *FunctionEventInvokeConfigDestinationConfig `pulumi:"destinationConfig"`
	// Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
	//
	// The following arguments are optional:
	FunctionName string `pulumi:"functionName"`
	// Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
	MaximumEventAgeInSeconds *int `pulumi:"maximumEventAgeInSeconds"`
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
	MaximumRetryAttempts *int `pulumi:"maximumRetryAttempts"`
	// Lambda Function published version, `$LATEST`, or Lambda Alias name.
	Qualifier *string `pulumi:"qualifier"`
}

// The set of arguments for constructing a FunctionEventInvokeConfig resource.
type FunctionEventInvokeConfigArgs struct {
	// Configuration block with destination configuration. See below for details.
	DestinationConfig FunctionEventInvokeConfigDestinationConfigPtrInput
	// Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
	//
	// The following arguments are optional:
	FunctionName pulumi.StringInput
	// Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
	MaximumEventAgeInSeconds pulumi.IntPtrInput
	// Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
	MaximumRetryAttempts pulumi.IntPtrInput
	// Lambda Function published version, `$LATEST`, or Lambda Alias name.
	Qualifier pulumi.StringPtrInput
}

func (FunctionEventInvokeConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*functionEventInvokeConfigArgs)(nil)).Elem()
}

type FunctionEventInvokeConfigInput interface {
	pulumi.Input

	ToFunctionEventInvokeConfigOutput() FunctionEventInvokeConfigOutput
	ToFunctionEventInvokeConfigOutputWithContext(ctx context.Context) FunctionEventInvokeConfigOutput
}

func (*FunctionEventInvokeConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**FunctionEventInvokeConfig)(nil)).Elem()
}

func (i *FunctionEventInvokeConfig) ToFunctionEventInvokeConfigOutput() FunctionEventInvokeConfigOutput {
	return i.ToFunctionEventInvokeConfigOutputWithContext(context.Background())
}

func (i *FunctionEventInvokeConfig) ToFunctionEventInvokeConfigOutputWithContext(ctx context.Context) FunctionEventInvokeConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionEventInvokeConfigOutput)
}

// FunctionEventInvokeConfigArrayInput is an input type that accepts FunctionEventInvokeConfigArray and FunctionEventInvokeConfigArrayOutput values.
// You can construct a concrete instance of `FunctionEventInvokeConfigArrayInput` via:
//
//	FunctionEventInvokeConfigArray{ FunctionEventInvokeConfigArgs{...} }
type FunctionEventInvokeConfigArrayInput interface {
	pulumi.Input

	ToFunctionEventInvokeConfigArrayOutput() FunctionEventInvokeConfigArrayOutput
	ToFunctionEventInvokeConfigArrayOutputWithContext(context.Context) FunctionEventInvokeConfigArrayOutput
}

type FunctionEventInvokeConfigArray []FunctionEventInvokeConfigInput

func (FunctionEventInvokeConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FunctionEventInvokeConfig)(nil)).Elem()
}

func (i FunctionEventInvokeConfigArray) ToFunctionEventInvokeConfigArrayOutput() FunctionEventInvokeConfigArrayOutput {
	return i.ToFunctionEventInvokeConfigArrayOutputWithContext(context.Background())
}

func (i FunctionEventInvokeConfigArray) ToFunctionEventInvokeConfigArrayOutputWithContext(ctx context.Context) FunctionEventInvokeConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionEventInvokeConfigArrayOutput)
}

// FunctionEventInvokeConfigMapInput is an input type that accepts FunctionEventInvokeConfigMap and FunctionEventInvokeConfigMapOutput values.
// You can construct a concrete instance of `FunctionEventInvokeConfigMapInput` via:
//
//	FunctionEventInvokeConfigMap{ "key": FunctionEventInvokeConfigArgs{...} }
type FunctionEventInvokeConfigMapInput interface {
	pulumi.Input

	ToFunctionEventInvokeConfigMapOutput() FunctionEventInvokeConfigMapOutput
	ToFunctionEventInvokeConfigMapOutputWithContext(context.Context) FunctionEventInvokeConfigMapOutput
}

type FunctionEventInvokeConfigMap map[string]FunctionEventInvokeConfigInput

func (FunctionEventInvokeConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FunctionEventInvokeConfig)(nil)).Elem()
}

func (i FunctionEventInvokeConfigMap) ToFunctionEventInvokeConfigMapOutput() FunctionEventInvokeConfigMapOutput {
	return i.ToFunctionEventInvokeConfigMapOutputWithContext(context.Background())
}

func (i FunctionEventInvokeConfigMap) ToFunctionEventInvokeConfigMapOutputWithContext(ctx context.Context) FunctionEventInvokeConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(FunctionEventInvokeConfigMapOutput)
}

type FunctionEventInvokeConfigOutput struct{ *pulumi.OutputState }

func (FunctionEventInvokeConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**FunctionEventInvokeConfig)(nil)).Elem()
}

func (o FunctionEventInvokeConfigOutput) ToFunctionEventInvokeConfigOutput() FunctionEventInvokeConfigOutput {
	return o
}

func (o FunctionEventInvokeConfigOutput) ToFunctionEventInvokeConfigOutputWithContext(ctx context.Context) FunctionEventInvokeConfigOutput {
	return o
}

// Configuration block with destination configuration. See below for details.
func (o FunctionEventInvokeConfigOutput) DestinationConfig() FunctionEventInvokeConfigDestinationConfigPtrOutput {
	return o.ApplyT(func(v *FunctionEventInvokeConfig) FunctionEventInvokeConfigDestinationConfigPtrOutput {
		return v.DestinationConfig
	}).(FunctionEventInvokeConfigDestinationConfigPtrOutput)
}

// Name or Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
//
// The following arguments are optional:
func (o FunctionEventInvokeConfigOutput) FunctionName() pulumi.StringOutput {
	return o.ApplyT(func(v *FunctionEventInvokeConfig) pulumi.StringOutput { return v.FunctionName }).(pulumi.StringOutput)
}

// Maximum age of a request that Lambda sends to a function for processing in seconds. Valid values between 60 and 21600.
func (o FunctionEventInvokeConfigOutput) MaximumEventAgeInSeconds() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FunctionEventInvokeConfig) pulumi.IntPtrOutput { return v.MaximumEventAgeInSeconds }).(pulumi.IntPtrOutput)
}

// Maximum number of times to retry when the function returns an error. Valid values between 0 and 2. Defaults to 2.
func (o FunctionEventInvokeConfigOutput) MaximumRetryAttempts() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *FunctionEventInvokeConfig) pulumi.IntPtrOutput { return v.MaximumRetryAttempts }).(pulumi.IntPtrOutput)
}

// Lambda Function published version, `$LATEST`, or Lambda Alias name.
func (o FunctionEventInvokeConfigOutput) Qualifier() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *FunctionEventInvokeConfig) pulumi.StringPtrOutput { return v.Qualifier }).(pulumi.StringPtrOutput)
}

type FunctionEventInvokeConfigArrayOutput struct{ *pulumi.OutputState }

func (FunctionEventInvokeConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*FunctionEventInvokeConfig)(nil)).Elem()
}

func (o FunctionEventInvokeConfigArrayOutput) ToFunctionEventInvokeConfigArrayOutput() FunctionEventInvokeConfigArrayOutput {
	return o
}

func (o FunctionEventInvokeConfigArrayOutput) ToFunctionEventInvokeConfigArrayOutputWithContext(ctx context.Context) FunctionEventInvokeConfigArrayOutput {
	return o
}

func (o FunctionEventInvokeConfigArrayOutput) Index(i pulumi.IntInput) FunctionEventInvokeConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *FunctionEventInvokeConfig {
		return vs[0].([]*FunctionEventInvokeConfig)[vs[1].(int)]
	}).(FunctionEventInvokeConfigOutput)
}

type FunctionEventInvokeConfigMapOutput struct{ *pulumi.OutputState }

func (FunctionEventInvokeConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*FunctionEventInvokeConfig)(nil)).Elem()
}

func (o FunctionEventInvokeConfigMapOutput) ToFunctionEventInvokeConfigMapOutput() FunctionEventInvokeConfigMapOutput {
	return o
}

func (o FunctionEventInvokeConfigMapOutput) ToFunctionEventInvokeConfigMapOutputWithContext(ctx context.Context) FunctionEventInvokeConfigMapOutput {
	return o
}

func (o FunctionEventInvokeConfigMapOutput) MapIndex(k pulumi.StringInput) FunctionEventInvokeConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *FunctionEventInvokeConfig {
		return vs[0].(map[string]*FunctionEventInvokeConfig)[vs[1].(string)]
	}).(FunctionEventInvokeConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionEventInvokeConfigInput)(nil)).Elem(), &FunctionEventInvokeConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionEventInvokeConfigArrayInput)(nil)).Elem(), FunctionEventInvokeConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*FunctionEventInvokeConfigMapInput)(nil)).Elem(), FunctionEventInvokeConfigMap{})
	pulumi.RegisterOutputType(FunctionEventInvokeConfigOutput{})
	pulumi.RegisterOutputType(FunctionEventInvokeConfigArrayOutput{})
	pulumi.RegisterOutputType(FunctionEventInvokeConfigMapOutput{})
}
