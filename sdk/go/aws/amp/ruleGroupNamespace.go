// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package amp

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an Amazon Managed Service for Prometheus (AMP) Rule Group Namespace
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/amp"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			demo, err := amp.NewWorkspace(ctx, "demo", nil)
//			if err != nil {
//				return err
//			}
//			_, err = amp.NewRuleGroupNamespace(ctx, "demo", &amp.RuleGroupNamespaceArgs{
//				Name:        pulumi.String("rules"),
//				WorkspaceId: demo.ID(),
//				Data: pulumi.String(`groups:
//	  - name: test
//	    rules:
//	    - record: metric:recording_rule
//	      expr: avg(rate(container_cpu_usage_seconds_total[5m]))
//
// `),
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
//
// ## Import
//
// Using `pulumi import`, import the prometheus rule group namespace using the arn. For example:
//
// ```sh
//
//	$ pulumi import aws:amp/ruleGroupNamespace:RuleGroupNamespace demo arn:aws:aps:us-west-2:123456789012:rulegroupsnamespace/IDstring/namespace_name
//
// ```
type RuleGroupNamespace struct {
	pulumi.CustomResourceState

	// the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
	Data pulumi.StringOutput `pulumi:"data"`
	// The name of the rule group namespace
	Name pulumi.StringOutput `pulumi:"name"`
	// ID of the prometheus workspace the rule group namespace should be linked to
	WorkspaceId pulumi.StringOutput `pulumi:"workspaceId"`
}

// NewRuleGroupNamespace registers a new resource with the given unique name, arguments, and options.
func NewRuleGroupNamespace(ctx *pulumi.Context,
	name string, args *RuleGroupNamespaceArgs, opts ...pulumi.ResourceOption) (*RuleGroupNamespace, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Data == nil {
		return nil, errors.New("invalid value for required argument 'Data'")
	}
	if args.WorkspaceId == nil {
		return nil, errors.New("invalid value for required argument 'WorkspaceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RuleGroupNamespace
	err := ctx.RegisterResource("aws:amp/ruleGroupNamespace:RuleGroupNamespace", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRuleGroupNamespace gets an existing RuleGroupNamespace resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRuleGroupNamespace(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RuleGroupNamespaceState, opts ...pulumi.ResourceOption) (*RuleGroupNamespace, error) {
	var resource RuleGroupNamespace
	err := ctx.ReadResource("aws:amp/ruleGroupNamespace:RuleGroupNamespace", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RuleGroupNamespace resources.
type ruleGroupNamespaceState struct {
	// the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
	Data *string `pulumi:"data"`
	// The name of the rule group namespace
	Name *string `pulumi:"name"`
	// ID of the prometheus workspace the rule group namespace should be linked to
	WorkspaceId *string `pulumi:"workspaceId"`
}

type RuleGroupNamespaceState struct {
	// the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
	Data pulumi.StringPtrInput
	// The name of the rule group namespace
	Name pulumi.StringPtrInput
	// ID of the prometheus workspace the rule group namespace should be linked to
	WorkspaceId pulumi.StringPtrInput
}

func (RuleGroupNamespaceState) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleGroupNamespaceState)(nil)).Elem()
}

type ruleGroupNamespaceArgs struct {
	// the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
	Data string `pulumi:"data"`
	// The name of the rule group namespace
	Name *string `pulumi:"name"`
	// ID of the prometheus workspace the rule group namespace should be linked to
	WorkspaceId string `pulumi:"workspaceId"`
}

// The set of arguments for constructing a RuleGroupNamespace resource.
type RuleGroupNamespaceArgs struct {
	// the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
	Data pulumi.StringInput
	// The name of the rule group namespace
	Name pulumi.StringPtrInput
	// ID of the prometheus workspace the rule group namespace should be linked to
	WorkspaceId pulumi.StringInput
}

func (RuleGroupNamespaceArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*ruleGroupNamespaceArgs)(nil)).Elem()
}

type RuleGroupNamespaceInput interface {
	pulumi.Input

	ToRuleGroupNamespaceOutput() RuleGroupNamespaceOutput
	ToRuleGroupNamespaceOutputWithContext(ctx context.Context) RuleGroupNamespaceOutput
}

func (*RuleGroupNamespace) ElementType() reflect.Type {
	return reflect.TypeOf((**RuleGroupNamespace)(nil)).Elem()
}

func (i *RuleGroupNamespace) ToRuleGroupNamespaceOutput() RuleGroupNamespaceOutput {
	return i.ToRuleGroupNamespaceOutputWithContext(context.Background())
}

func (i *RuleGroupNamespace) ToRuleGroupNamespaceOutputWithContext(ctx context.Context) RuleGroupNamespaceOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleGroupNamespaceOutput)
}

// RuleGroupNamespaceArrayInput is an input type that accepts RuleGroupNamespaceArray and RuleGroupNamespaceArrayOutput values.
// You can construct a concrete instance of `RuleGroupNamespaceArrayInput` via:
//
//	RuleGroupNamespaceArray{ RuleGroupNamespaceArgs{...} }
type RuleGroupNamespaceArrayInput interface {
	pulumi.Input

	ToRuleGroupNamespaceArrayOutput() RuleGroupNamespaceArrayOutput
	ToRuleGroupNamespaceArrayOutputWithContext(context.Context) RuleGroupNamespaceArrayOutput
}

type RuleGroupNamespaceArray []RuleGroupNamespaceInput

func (RuleGroupNamespaceArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuleGroupNamespace)(nil)).Elem()
}

func (i RuleGroupNamespaceArray) ToRuleGroupNamespaceArrayOutput() RuleGroupNamespaceArrayOutput {
	return i.ToRuleGroupNamespaceArrayOutputWithContext(context.Background())
}

func (i RuleGroupNamespaceArray) ToRuleGroupNamespaceArrayOutputWithContext(ctx context.Context) RuleGroupNamespaceArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleGroupNamespaceArrayOutput)
}

// RuleGroupNamespaceMapInput is an input type that accepts RuleGroupNamespaceMap and RuleGroupNamespaceMapOutput values.
// You can construct a concrete instance of `RuleGroupNamespaceMapInput` via:
//
//	RuleGroupNamespaceMap{ "key": RuleGroupNamespaceArgs{...} }
type RuleGroupNamespaceMapInput interface {
	pulumi.Input

	ToRuleGroupNamespaceMapOutput() RuleGroupNamespaceMapOutput
	ToRuleGroupNamespaceMapOutputWithContext(context.Context) RuleGroupNamespaceMapOutput
}

type RuleGroupNamespaceMap map[string]RuleGroupNamespaceInput

func (RuleGroupNamespaceMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuleGroupNamespace)(nil)).Elem()
}

func (i RuleGroupNamespaceMap) ToRuleGroupNamespaceMapOutput() RuleGroupNamespaceMapOutput {
	return i.ToRuleGroupNamespaceMapOutputWithContext(context.Background())
}

func (i RuleGroupNamespaceMap) ToRuleGroupNamespaceMapOutputWithContext(ctx context.Context) RuleGroupNamespaceMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RuleGroupNamespaceMapOutput)
}

type RuleGroupNamespaceOutput struct{ *pulumi.OutputState }

func (RuleGroupNamespaceOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RuleGroupNamespace)(nil)).Elem()
}

func (o RuleGroupNamespaceOutput) ToRuleGroupNamespaceOutput() RuleGroupNamespaceOutput {
	return o
}

func (o RuleGroupNamespaceOutput) ToRuleGroupNamespaceOutputWithContext(ctx context.Context) RuleGroupNamespaceOutput {
	return o
}

// the rule group namespace data that you want to be applied. See more [in AWS Docs](https://docs.aws.amazon.com/prometheus/latest/userguide/AMP-Ruler.html).
func (o RuleGroupNamespaceOutput) Data() pulumi.StringOutput {
	return o.ApplyT(func(v *RuleGroupNamespace) pulumi.StringOutput { return v.Data }).(pulumi.StringOutput)
}

// The name of the rule group namespace
func (o RuleGroupNamespaceOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RuleGroupNamespace) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// ID of the prometheus workspace the rule group namespace should be linked to
func (o RuleGroupNamespaceOutput) WorkspaceId() pulumi.StringOutput {
	return o.ApplyT(func(v *RuleGroupNamespace) pulumi.StringOutput { return v.WorkspaceId }).(pulumi.StringOutput)
}

type RuleGroupNamespaceArrayOutput struct{ *pulumi.OutputState }

func (RuleGroupNamespaceArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RuleGroupNamespace)(nil)).Elem()
}

func (o RuleGroupNamespaceArrayOutput) ToRuleGroupNamespaceArrayOutput() RuleGroupNamespaceArrayOutput {
	return o
}

func (o RuleGroupNamespaceArrayOutput) ToRuleGroupNamespaceArrayOutputWithContext(ctx context.Context) RuleGroupNamespaceArrayOutput {
	return o
}

func (o RuleGroupNamespaceArrayOutput) Index(i pulumi.IntInput) RuleGroupNamespaceOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RuleGroupNamespace {
		return vs[0].([]*RuleGroupNamespace)[vs[1].(int)]
	}).(RuleGroupNamespaceOutput)
}

type RuleGroupNamespaceMapOutput struct{ *pulumi.OutputState }

func (RuleGroupNamespaceMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RuleGroupNamespace)(nil)).Elem()
}

func (o RuleGroupNamespaceMapOutput) ToRuleGroupNamespaceMapOutput() RuleGroupNamespaceMapOutput {
	return o
}

func (o RuleGroupNamespaceMapOutput) ToRuleGroupNamespaceMapOutputWithContext(ctx context.Context) RuleGroupNamespaceMapOutput {
	return o
}

func (o RuleGroupNamespaceMapOutput) MapIndex(k pulumi.StringInput) RuleGroupNamespaceOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RuleGroupNamespace {
		return vs[0].(map[string]*RuleGroupNamespace)[vs[1].(string)]
	}).(RuleGroupNamespaceOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RuleGroupNamespaceInput)(nil)).Elem(), &RuleGroupNamespace{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleGroupNamespaceArrayInput)(nil)).Elem(), RuleGroupNamespaceArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RuleGroupNamespaceMapInput)(nil)).Elem(), RuleGroupNamespaceMap{})
	pulumi.RegisterOutputType(RuleGroupNamespaceOutput{})
	pulumi.RegisterOutputType(RuleGroupNamespaceArrayOutput{})
	pulumi.RegisterOutputType(RuleGroupNamespaceMapOutput{})
}
