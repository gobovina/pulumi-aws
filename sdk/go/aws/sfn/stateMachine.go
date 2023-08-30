// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package sfn

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Step Function State Machine resource
//
// ## Example Usage
// ### Basic (Standard Workflow)
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sfn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sfn.NewStateMachine(ctx, "sfnStateMachine", &sfn.StateMachineArgs{
//				RoleArn: pulumi.Any(aws_iam_role.Iam_for_sfn.Arn),
//				Definition: pulumi.String(fmt.Sprintf(`{
//	  "Comment": "A Hello World example of the Amazon States Language using an AWS Lambda Function",
//	  "StartAt": "HelloWorld",
//	  "States": {
//	    "HelloWorld": {
//	      "Type": "Task",
//	      "Resource": "%v",
//	      "End": true
//	    }
//	  }
//	}
//
// `, aws_lambda_function.Lambda.Arn)),
//
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Basic (Express Workflow)
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sfn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sfn.NewStateMachine(ctx, "sfnStateMachine", &sfn.StateMachineArgs{
//				RoleArn: pulumi.Any(aws_iam_role.Iam_for_sfn.Arn),
//				Type:    pulumi.String("EXPRESS"),
//				Definition: pulumi.String(fmt.Sprintf(`{
//	  "Comment": "A Hello World example of the Amazon States Language using an AWS Lambda Function",
//	  "StartAt": "HelloWorld",
//	  "States": {
//	    "HelloWorld": {
//	      "Type": "Task",
//	      "Resource": "%v",
//	      "End": true
//	    }
//	  }
//	}
//
// `, aws_lambda_function.Lambda.Arn)),
//
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Publish (Publish SFN version)
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sfn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sfn.NewStateMachine(ctx, "sfnStateMachine", &sfn.StateMachineArgs{
//				RoleArn: pulumi.Any(aws_iam_role.Iam_for_sfn.Arn),
//				Publish: pulumi.Bool(true),
//				Type:    pulumi.String("EXPRESS"),
//				Definition: pulumi.String(fmt.Sprintf(`{
//	  "Comment": "A Hello World example of the Amazon States Language using an AWS Lambda Function",
//	  "StartAt": "HelloWorld",
//	  "States": {
//	    "HelloWorld": {
//	      "Type": "Task",
//	      "Resource": "%v",
//	      "End": true
//	    }
//	  }
//	}
//
// `, aws_lambda_function.Lambda.Arn)),
//
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Logging
//
// > *NOTE:* See the [AWS Step Functions Developer Guide](https://docs.aws.amazon.com/step-functions/latest/dg/welcome.html) for more information about enabling Step Function logging.
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/sfn"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := sfn.NewStateMachine(ctx, "sfnStateMachine", &sfn.StateMachineArgs{
//				RoleArn: pulumi.Any(aws_iam_role.Iam_for_sfn.Arn),
//				Definition: pulumi.String(fmt.Sprintf(`{
//	  "Comment": "A Hello World example of the Amazon States Language using an AWS Lambda Function",
//	  "StartAt": "HelloWorld",
//	  "States": {
//	    "HelloWorld": {
//	      "Type": "Task",
//	      "Resource": "%v",
//	      "End": true
//	    }
//	  }
//	}
//
// `, aws_lambda_function.Lambda.Arn)),
//
//				LoggingConfiguration: &sfn.StateMachineLoggingConfigurationArgs{
//					LogDestination:       pulumi.String(fmt.Sprintf("%v:*", aws_cloudwatch_log_group.Log_group_for_sfn.Arn)),
//					IncludeExecutionData: pulumi.Bool(true),
//					Level:                pulumi.String("ERROR"),
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
// Using `pulumi import`, import State Machines using the `arn`. For example:
//
// ```sh
//
//	$ pulumi import aws:sfn/stateMachine:StateMachine foo arn:aws:states:eu-west-1:123456789098:stateMachine:bar
//
// ```
type StateMachine struct {
	pulumi.CustomResourceState

	// The ARN of the state machine.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The date the state machine was created.
	CreationDate pulumi.StringOutput `pulumi:"creationDate"`
	// The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
	Definition  pulumi.StringOutput `pulumi:"definition"`
	Description pulumi.StringOutput `pulumi:"description"`
	// Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
	LoggingConfiguration StateMachineLoggingConfigurationOutput `pulumi:"loggingConfiguration"`
	// The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
	Name pulumi.StringOutput `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringOutput `pulumi:"namePrefix"`
	// Set to true to publish a version of the state machine during creation. Default: false.
	Publish    pulumi.BoolPtrOutput `pulumi:"publish"`
	RevisionId pulumi.StringOutput  `pulumi:"revisionId"`
	// The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
	RoleArn                pulumi.StringOutput `pulumi:"roleArn"`
	StateMachineVersionArn pulumi.StringOutput `pulumi:"stateMachineVersionArn"`
	// The current status of the state machine. Either `ACTIVE` or `DELETING`.
	Status pulumi.StringOutput `pulumi:"status"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Selects whether AWS X-Ray tracing is enabled.
	TracingConfiguration StateMachineTracingConfigurationOutput `pulumi:"tracingConfiguration"`
	// Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
	Type               pulumi.StringPtrOutput `pulumi:"type"`
	VersionDescription pulumi.StringOutput    `pulumi:"versionDescription"`
}

// NewStateMachine registers a new resource with the given unique name, arguments, and options.
func NewStateMachine(ctx *pulumi.Context,
	name string, args *StateMachineArgs, opts ...pulumi.ResourceOption) (*StateMachine, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Definition == nil {
		return nil, errors.New("invalid value for required argument 'Definition'")
	}
	if args.RoleArn == nil {
		return nil, errors.New("invalid value for required argument 'RoleArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StateMachine
	err := ctx.RegisterResource("aws:sfn/stateMachine:StateMachine", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStateMachine gets an existing StateMachine resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStateMachine(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StateMachineState, opts ...pulumi.ResourceOption) (*StateMachine, error) {
	var resource StateMachine
	err := ctx.ReadResource("aws:sfn/stateMachine:StateMachine", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StateMachine resources.
type stateMachineState struct {
	// The ARN of the state machine.
	Arn *string `pulumi:"arn"`
	// The date the state machine was created.
	CreationDate *string `pulumi:"creationDate"`
	// The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
	Definition  *string `pulumi:"definition"`
	Description *string `pulumi:"description"`
	// Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
	LoggingConfiguration *StateMachineLoggingConfiguration `pulumi:"loggingConfiguration"`
	// The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// Set to true to publish a version of the state machine during creation. Default: false.
	Publish    *bool   `pulumi:"publish"`
	RevisionId *string `pulumi:"revisionId"`
	// The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
	RoleArn                *string `pulumi:"roleArn"`
	StateMachineVersionArn *string `pulumi:"stateMachineVersionArn"`
	// The current status of the state machine. Either `ACTIVE` or `DELETING`.
	Status *string `pulumi:"status"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Selects whether AWS X-Ray tracing is enabled.
	TracingConfiguration *StateMachineTracingConfiguration `pulumi:"tracingConfiguration"`
	// Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
	Type               *string `pulumi:"type"`
	VersionDescription *string `pulumi:"versionDescription"`
}

type StateMachineState struct {
	// The ARN of the state machine.
	Arn pulumi.StringPtrInput
	// The date the state machine was created.
	CreationDate pulumi.StringPtrInput
	// The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
	Definition  pulumi.StringPtrInput
	Description pulumi.StringPtrInput
	// Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
	LoggingConfiguration StateMachineLoggingConfigurationPtrInput
	// The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// Set to true to publish a version of the state machine during creation. Default: false.
	Publish    pulumi.BoolPtrInput
	RevisionId pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
	RoleArn                pulumi.StringPtrInput
	StateMachineVersionArn pulumi.StringPtrInput
	// The current status of the state machine. Either `ACTIVE` or `DELETING`.
	Status pulumi.StringPtrInput
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// Selects whether AWS X-Ray tracing is enabled.
	TracingConfiguration StateMachineTracingConfigurationPtrInput
	// Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
	Type               pulumi.StringPtrInput
	VersionDescription pulumi.StringPtrInput
}

func (StateMachineState) ElementType() reflect.Type {
	return reflect.TypeOf((*stateMachineState)(nil)).Elem()
}

type stateMachineArgs struct {
	// The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
	Definition string `pulumi:"definition"`
	// Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
	LoggingConfiguration *StateMachineLoggingConfiguration `pulumi:"loggingConfiguration"`
	// The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// Set to true to publish a version of the state machine during creation. Default: false.
	Publish *bool `pulumi:"publish"`
	// The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
	RoleArn string `pulumi:"roleArn"`
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Selects whether AWS X-Ray tracing is enabled.
	TracingConfiguration *StateMachineTracingConfiguration `pulumi:"tracingConfiguration"`
	// Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a StateMachine resource.
type StateMachineArgs struct {
	// The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
	Definition pulumi.StringInput
	// Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
	LoggingConfiguration StateMachineLoggingConfigurationPtrInput
	// The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// Set to true to publish a version of the state machine during creation. Default: false.
	Publish pulumi.BoolPtrInput
	// The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
	RoleArn pulumi.StringInput
	// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Selects whether AWS X-Ray tracing is enabled.
	TracingConfiguration StateMachineTracingConfigurationPtrInput
	// Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
	Type pulumi.StringPtrInput
}

func (StateMachineArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*stateMachineArgs)(nil)).Elem()
}

type StateMachineInput interface {
	pulumi.Input

	ToStateMachineOutput() StateMachineOutput
	ToStateMachineOutputWithContext(ctx context.Context) StateMachineOutput
}

func (*StateMachine) ElementType() reflect.Type {
	return reflect.TypeOf((**StateMachine)(nil)).Elem()
}

func (i *StateMachine) ToStateMachineOutput() StateMachineOutput {
	return i.ToStateMachineOutputWithContext(context.Background())
}

func (i *StateMachine) ToStateMachineOutputWithContext(ctx context.Context) StateMachineOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StateMachineOutput)
}

// StateMachineArrayInput is an input type that accepts StateMachineArray and StateMachineArrayOutput values.
// You can construct a concrete instance of `StateMachineArrayInput` via:
//
//	StateMachineArray{ StateMachineArgs{...} }
type StateMachineArrayInput interface {
	pulumi.Input

	ToStateMachineArrayOutput() StateMachineArrayOutput
	ToStateMachineArrayOutputWithContext(context.Context) StateMachineArrayOutput
}

type StateMachineArray []StateMachineInput

func (StateMachineArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StateMachine)(nil)).Elem()
}

func (i StateMachineArray) ToStateMachineArrayOutput() StateMachineArrayOutput {
	return i.ToStateMachineArrayOutputWithContext(context.Background())
}

func (i StateMachineArray) ToStateMachineArrayOutputWithContext(ctx context.Context) StateMachineArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StateMachineArrayOutput)
}

// StateMachineMapInput is an input type that accepts StateMachineMap and StateMachineMapOutput values.
// You can construct a concrete instance of `StateMachineMapInput` via:
//
//	StateMachineMap{ "key": StateMachineArgs{...} }
type StateMachineMapInput interface {
	pulumi.Input

	ToStateMachineMapOutput() StateMachineMapOutput
	ToStateMachineMapOutputWithContext(context.Context) StateMachineMapOutput
}

type StateMachineMap map[string]StateMachineInput

func (StateMachineMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StateMachine)(nil)).Elem()
}

func (i StateMachineMap) ToStateMachineMapOutput() StateMachineMapOutput {
	return i.ToStateMachineMapOutputWithContext(context.Background())
}

func (i StateMachineMap) ToStateMachineMapOutputWithContext(ctx context.Context) StateMachineMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StateMachineMapOutput)
}

type StateMachineOutput struct{ *pulumi.OutputState }

func (StateMachineOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StateMachine)(nil)).Elem()
}

func (o StateMachineOutput) ToStateMachineOutput() StateMachineOutput {
	return o
}

func (o StateMachineOutput) ToStateMachineOutputWithContext(ctx context.Context) StateMachineOutput {
	return o
}

// The ARN of the state machine.
func (o StateMachineOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The date the state machine was created.
func (o StateMachineOutput) CreationDate() pulumi.StringOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringOutput { return v.CreationDate }).(pulumi.StringOutput)
}

// The [Amazon States Language](https://docs.aws.amazon.com/step-functions/latest/dg/concepts-amazon-states-language.html) definition of the state machine.
func (o StateMachineOutput) Definition() pulumi.StringOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringOutput { return v.Definition }).(pulumi.StringOutput)
}

func (o StateMachineOutput) Description() pulumi.StringOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringOutput { return v.Description }).(pulumi.StringOutput)
}

// Defines what execution history events are logged and where they are logged. The `loggingConfiguration` parameter is only valid when `type` is set to `EXPRESS`. Defaults to `OFF`. For more information see [Logging Express Workflows](https://docs.aws.amazon.com/step-functions/latest/dg/cw-logs.html) and [Log Levels](https://docs.aws.amazon.com/step-functions/latest/dg/cloudwatch-log-level.html) in the AWS Step Functions User Guide.
func (o StateMachineOutput) LoggingConfiguration() StateMachineLoggingConfigurationOutput {
	return o.ApplyT(func(v *StateMachine) StateMachineLoggingConfigurationOutput { return v.LoggingConfiguration }).(StateMachineLoggingConfigurationOutput)
}

// The name of the state machine. The name should only contain `0`-`9`, `A`-`Z`, `a`-`z`, `-` and `_`. If omitted, the provider will assign a random, unique name.
func (o StateMachineOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Creates a unique name beginning with the specified prefix. Conflicts with `name`.
func (o StateMachineOutput) NamePrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringOutput { return v.NamePrefix }).(pulumi.StringOutput)
}

// Set to true to publish a version of the state machine during creation. Default: false.
func (o StateMachineOutput) Publish() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.BoolPtrOutput { return v.Publish }).(pulumi.BoolPtrOutput)
}

func (o StateMachineOutput) RevisionId() pulumi.StringOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringOutput { return v.RevisionId }).(pulumi.StringOutput)
}

// The Amazon Resource Name (ARN) of the IAM role to use for this state machine.
func (o StateMachineOutput) RoleArn() pulumi.StringOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringOutput { return v.RoleArn }).(pulumi.StringOutput)
}

func (o StateMachineOutput) StateMachineVersionArn() pulumi.StringOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringOutput { return v.StateMachineVersionArn }).(pulumi.StringOutput)
}

// The current status of the state machine. Either `ACTIVE` or `DELETING`.
func (o StateMachineOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// Key-value map of resource tags. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o StateMachineOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o StateMachineOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Selects whether AWS X-Ray tracing is enabled.
func (o StateMachineOutput) TracingConfiguration() StateMachineTracingConfigurationOutput {
	return o.ApplyT(func(v *StateMachine) StateMachineTracingConfigurationOutput { return v.TracingConfiguration }).(StateMachineTracingConfigurationOutput)
}

// Determines whether a Standard or Express state machine is created. The default is `STANDARD`. You cannot update the type of a state machine once it has been created. Valid values: `STANDARD`, `EXPRESS`.
func (o StateMachineOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

func (o StateMachineOutput) VersionDescription() pulumi.StringOutput {
	return o.ApplyT(func(v *StateMachine) pulumi.StringOutput { return v.VersionDescription }).(pulumi.StringOutput)
}

type StateMachineArrayOutput struct{ *pulumi.OutputState }

func (StateMachineArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StateMachine)(nil)).Elem()
}

func (o StateMachineArrayOutput) ToStateMachineArrayOutput() StateMachineArrayOutput {
	return o
}

func (o StateMachineArrayOutput) ToStateMachineArrayOutputWithContext(ctx context.Context) StateMachineArrayOutput {
	return o
}

func (o StateMachineArrayOutput) Index(i pulumi.IntInput) StateMachineOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StateMachine {
		return vs[0].([]*StateMachine)[vs[1].(int)]
	}).(StateMachineOutput)
}

type StateMachineMapOutput struct{ *pulumi.OutputState }

func (StateMachineMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StateMachine)(nil)).Elem()
}

func (o StateMachineMapOutput) ToStateMachineMapOutput() StateMachineMapOutput {
	return o
}

func (o StateMachineMapOutput) ToStateMachineMapOutputWithContext(ctx context.Context) StateMachineMapOutput {
	return o
}

func (o StateMachineMapOutput) MapIndex(k pulumi.StringInput) StateMachineOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StateMachine {
		return vs[0].(map[string]*StateMachine)[vs[1].(string)]
	}).(StateMachineOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StateMachineInput)(nil)).Elem(), &StateMachine{})
	pulumi.RegisterInputType(reflect.TypeOf((*StateMachineArrayInput)(nil)).Elem(), StateMachineArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StateMachineMapInput)(nil)).Elem(), StateMachineMap{})
	pulumi.RegisterOutputType(StateMachineOutput{})
	pulumi.RegisterOutputType(StateMachineArrayOutput{})
	pulumi.RegisterOutputType(StateMachineMapOutput{})
}
