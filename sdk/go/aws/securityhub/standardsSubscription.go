// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package securityhub

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Subscribes to a Security Hub standard.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/securityhub"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			example, err := securityhub.NewAccount(ctx, "example", nil)
//			if err != nil {
//				return err
//			}
//			current, err := aws.GetRegion(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			_, err = securityhub.NewStandardsSubscription(ctx, "cis", &securityhub.StandardsSubscriptionArgs{
//				StandardsArn: pulumi.String("arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0"),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				example,
//			}))
//			if err != nil {
//				return err
//			}
//			_, err = securityhub.NewStandardsSubscription(ctx, "pci321", &securityhub.StandardsSubscriptionArgs{
//				StandardsArn: pulumi.String(fmt.Sprintf("arn:aws:securityhub:%v::standards/pci-dss/v/3.2.1", current.Name)),
//			}, pulumi.DependsOn([]pulumi.Resource{
//				example,
//			}))
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
// In TODO v1.5.0 and later, use an `import` block to import Security Hub standards subscriptions using the standards subscription ARN. For exampleterraform import {
//
//	to = aws_securityhub_standards_subscription.cis
//
//	id = "arn:aws:securityhub:eu-west-1:123456789012:subscription/cis-aws-foundations-benchmark/v/1.2.0" } terraform import {
//
//	to = aws_securityhub_standards_subscription.pci_321
//
//	id = "arn:aws:securityhub:eu-west-1:123456789012:subscription/pci-dss/v/3.2.1" } terraform import {
//
//	to = aws_securityhub_standards_subscription.nist_800_53_rev_5
//
//	id = "arn:aws:securityhub:eu-west-1:123456789012:subscription/nist-800-53/v/5.0.0" } Using `TODO import`, import Security Hub standards subscriptions using the standards subscription ARN. For exampleconsole % TODO import aws_securityhub_standards_subscription.cis arn:aws:securityhub:eu-west-1:123456789012:subscription/cis-aws-foundations-benchmark/v/1.2.0 console % TODO import aws_securityhub_standards_subscription.pci_321 arn:aws:securityhub:eu-west-1:123456789012:subscription/pci-dss/v/3.2.1 console % TODO import aws_securityhub_standards_subscription.nist_800_53_rev_5 arn:aws:securityhub:eu-west-1:123456789012:subscription/nist-800-53/v/5.0.0
type StandardsSubscription struct {
	pulumi.CustomResourceState

	// The ARN of a standard - see below.
	//
	// Currently available standards (remember to replace `${var.region}` as appropriate):
	//
	// | Name                                     | ARN                                                                                             |
	// |------------------------------------------|-------------------------------------------------------------------------------------------------|
	// | AWS Foundational Security Best Practices | `arn:aws:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
	// | CIS AWS Foundations Benchmark v1.2.0     | `arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
	// | CIS AWS Foundations Benchmark v1.4.0     | `arn:aws:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
	// | NIST SP 800-53 Rev. 5                    | `arn:aws:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
	// | PCI DSS                                  | `arn:aws:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
	StandardsArn pulumi.StringOutput `pulumi:"standardsArn"`
}

// NewStandardsSubscription registers a new resource with the given unique name, arguments, and options.
func NewStandardsSubscription(ctx *pulumi.Context,
	name string, args *StandardsSubscriptionArgs, opts ...pulumi.ResourceOption) (*StandardsSubscription, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.StandardsArn == nil {
		return nil, errors.New("invalid value for required argument 'StandardsArn'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource StandardsSubscription
	err := ctx.RegisterResource("aws:securityhub/standardsSubscription:StandardsSubscription", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetStandardsSubscription gets an existing StandardsSubscription resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetStandardsSubscription(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *StandardsSubscriptionState, opts ...pulumi.ResourceOption) (*StandardsSubscription, error) {
	var resource StandardsSubscription
	err := ctx.ReadResource("aws:securityhub/standardsSubscription:StandardsSubscription", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering StandardsSubscription resources.
type standardsSubscriptionState struct {
	// The ARN of a standard - see below.
	//
	// Currently available standards (remember to replace `${var.region}` as appropriate):
	//
	// | Name                                     | ARN                                                                                             |
	// |------------------------------------------|-------------------------------------------------------------------------------------------------|
	// | AWS Foundational Security Best Practices | `arn:aws:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
	// | CIS AWS Foundations Benchmark v1.2.0     | `arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
	// | CIS AWS Foundations Benchmark v1.4.0     | `arn:aws:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
	// | NIST SP 800-53 Rev. 5                    | `arn:aws:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
	// | PCI DSS                                  | `arn:aws:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
	StandardsArn *string `pulumi:"standardsArn"`
}

type StandardsSubscriptionState struct {
	// The ARN of a standard - see below.
	//
	// Currently available standards (remember to replace `${var.region}` as appropriate):
	//
	// | Name                                     | ARN                                                                                             |
	// |------------------------------------------|-------------------------------------------------------------------------------------------------|
	// | AWS Foundational Security Best Practices | `arn:aws:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
	// | CIS AWS Foundations Benchmark v1.2.0     | `arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
	// | CIS AWS Foundations Benchmark v1.4.0     | `arn:aws:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
	// | NIST SP 800-53 Rev. 5                    | `arn:aws:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
	// | PCI DSS                                  | `arn:aws:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
	StandardsArn pulumi.StringPtrInput
}

func (StandardsSubscriptionState) ElementType() reflect.Type {
	return reflect.TypeOf((*standardsSubscriptionState)(nil)).Elem()
}

type standardsSubscriptionArgs struct {
	// The ARN of a standard - see below.
	//
	// Currently available standards (remember to replace `${var.region}` as appropriate):
	//
	// | Name                                     | ARN                                                                                             |
	// |------------------------------------------|-------------------------------------------------------------------------------------------------|
	// | AWS Foundational Security Best Practices | `arn:aws:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
	// | CIS AWS Foundations Benchmark v1.2.0     | `arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
	// | CIS AWS Foundations Benchmark v1.4.0     | `arn:aws:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
	// | NIST SP 800-53 Rev. 5                    | `arn:aws:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
	// | PCI DSS                                  | `arn:aws:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
	StandardsArn string `pulumi:"standardsArn"`
}

// The set of arguments for constructing a StandardsSubscription resource.
type StandardsSubscriptionArgs struct {
	// The ARN of a standard - see below.
	//
	// Currently available standards (remember to replace `${var.region}` as appropriate):
	//
	// | Name                                     | ARN                                                                                             |
	// |------------------------------------------|-------------------------------------------------------------------------------------------------|
	// | AWS Foundational Security Best Practices | `arn:aws:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
	// | CIS AWS Foundations Benchmark v1.2.0     | `arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
	// | CIS AWS Foundations Benchmark v1.4.0     | `arn:aws:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
	// | NIST SP 800-53 Rev. 5                    | `arn:aws:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
	// | PCI DSS                                  | `arn:aws:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
	StandardsArn pulumi.StringInput
}

func (StandardsSubscriptionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*standardsSubscriptionArgs)(nil)).Elem()
}

type StandardsSubscriptionInput interface {
	pulumi.Input

	ToStandardsSubscriptionOutput() StandardsSubscriptionOutput
	ToStandardsSubscriptionOutputWithContext(ctx context.Context) StandardsSubscriptionOutput
}

func (*StandardsSubscription) ElementType() reflect.Type {
	return reflect.TypeOf((**StandardsSubscription)(nil)).Elem()
}

func (i *StandardsSubscription) ToStandardsSubscriptionOutput() StandardsSubscriptionOutput {
	return i.ToStandardsSubscriptionOutputWithContext(context.Background())
}

func (i *StandardsSubscription) ToStandardsSubscriptionOutputWithContext(ctx context.Context) StandardsSubscriptionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StandardsSubscriptionOutput)
}

func (i *StandardsSubscription) ToOutput(ctx context.Context) pulumix.Output[*StandardsSubscription] {
	return pulumix.Output[*StandardsSubscription]{
		OutputState: i.ToStandardsSubscriptionOutputWithContext(ctx).OutputState,
	}
}

// StandardsSubscriptionArrayInput is an input type that accepts StandardsSubscriptionArray and StandardsSubscriptionArrayOutput values.
// You can construct a concrete instance of `StandardsSubscriptionArrayInput` via:
//
//	StandardsSubscriptionArray{ StandardsSubscriptionArgs{...} }
type StandardsSubscriptionArrayInput interface {
	pulumi.Input

	ToStandardsSubscriptionArrayOutput() StandardsSubscriptionArrayOutput
	ToStandardsSubscriptionArrayOutputWithContext(context.Context) StandardsSubscriptionArrayOutput
}

type StandardsSubscriptionArray []StandardsSubscriptionInput

func (StandardsSubscriptionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StandardsSubscription)(nil)).Elem()
}

func (i StandardsSubscriptionArray) ToStandardsSubscriptionArrayOutput() StandardsSubscriptionArrayOutput {
	return i.ToStandardsSubscriptionArrayOutputWithContext(context.Background())
}

func (i StandardsSubscriptionArray) ToStandardsSubscriptionArrayOutputWithContext(ctx context.Context) StandardsSubscriptionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StandardsSubscriptionArrayOutput)
}

func (i StandardsSubscriptionArray) ToOutput(ctx context.Context) pulumix.Output[[]*StandardsSubscription] {
	return pulumix.Output[[]*StandardsSubscription]{
		OutputState: i.ToStandardsSubscriptionArrayOutputWithContext(ctx).OutputState,
	}
}

// StandardsSubscriptionMapInput is an input type that accepts StandardsSubscriptionMap and StandardsSubscriptionMapOutput values.
// You can construct a concrete instance of `StandardsSubscriptionMapInput` via:
//
//	StandardsSubscriptionMap{ "key": StandardsSubscriptionArgs{...} }
type StandardsSubscriptionMapInput interface {
	pulumi.Input

	ToStandardsSubscriptionMapOutput() StandardsSubscriptionMapOutput
	ToStandardsSubscriptionMapOutputWithContext(context.Context) StandardsSubscriptionMapOutput
}

type StandardsSubscriptionMap map[string]StandardsSubscriptionInput

func (StandardsSubscriptionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StandardsSubscription)(nil)).Elem()
}

func (i StandardsSubscriptionMap) ToStandardsSubscriptionMapOutput() StandardsSubscriptionMapOutput {
	return i.ToStandardsSubscriptionMapOutputWithContext(context.Background())
}

func (i StandardsSubscriptionMap) ToStandardsSubscriptionMapOutputWithContext(ctx context.Context) StandardsSubscriptionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(StandardsSubscriptionMapOutput)
}

func (i StandardsSubscriptionMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*StandardsSubscription] {
	return pulumix.Output[map[string]*StandardsSubscription]{
		OutputState: i.ToStandardsSubscriptionMapOutputWithContext(ctx).OutputState,
	}
}

type StandardsSubscriptionOutput struct{ *pulumi.OutputState }

func (StandardsSubscriptionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**StandardsSubscription)(nil)).Elem()
}

func (o StandardsSubscriptionOutput) ToStandardsSubscriptionOutput() StandardsSubscriptionOutput {
	return o
}

func (o StandardsSubscriptionOutput) ToStandardsSubscriptionOutputWithContext(ctx context.Context) StandardsSubscriptionOutput {
	return o
}

func (o StandardsSubscriptionOutput) ToOutput(ctx context.Context) pulumix.Output[*StandardsSubscription] {
	return pulumix.Output[*StandardsSubscription]{
		OutputState: o.OutputState,
	}
}

// The ARN of a standard - see below.
//
// Currently available standards (remember to replace `${var.region}` as appropriate):
//
// | Name                                     | ARN                                                                                             |
// |------------------------------------------|-------------------------------------------------------------------------------------------------|
// | AWS Foundational Security Best Practices | `arn:aws:securityhub:${var.region}::standards/aws-foundational-security-best-practices/v/1.0.0` |
// | CIS AWS Foundations Benchmark v1.2.0     | `arn:aws:securityhub:::ruleset/cis-aws-foundations-benchmark/v/1.2.0`                           |
// | CIS AWS Foundations Benchmark v1.4.0     | `arn:aws:securityhub:${var.region}::standards/cis-aws-foundations-benchmark/v/1.4.0`            |
// | NIST SP 800-53 Rev. 5                    | `arn:aws:securityhub:${var.region}::standards/nist-800-53/v/5.0.0`                              |
// | PCI DSS                                  | `arn:aws:securityhub:${var.region}::standards/pci-dss/v/3.2.1`                                  |
func (o StandardsSubscriptionOutput) StandardsArn() pulumi.StringOutput {
	return o.ApplyT(func(v *StandardsSubscription) pulumi.StringOutput { return v.StandardsArn }).(pulumi.StringOutput)
}

type StandardsSubscriptionArrayOutput struct{ *pulumi.OutputState }

func (StandardsSubscriptionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*StandardsSubscription)(nil)).Elem()
}

func (o StandardsSubscriptionArrayOutput) ToStandardsSubscriptionArrayOutput() StandardsSubscriptionArrayOutput {
	return o
}

func (o StandardsSubscriptionArrayOutput) ToStandardsSubscriptionArrayOutputWithContext(ctx context.Context) StandardsSubscriptionArrayOutput {
	return o
}

func (o StandardsSubscriptionArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*StandardsSubscription] {
	return pulumix.Output[[]*StandardsSubscription]{
		OutputState: o.OutputState,
	}
}

func (o StandardsSubscriptionArrayOutput) Index(i pulumi.IntInput) StandardsSubscriptionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *StandardsSubscription {
		return vs[0].([]*StandardsSubscription)[vs[1].(int)]
	}).(StandardsSubscriptionOutput)
}

type StandardsSubscriptionMapOutput struct{ *pulumi.OutputState }

func (StandardsSubscriptionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*StandardsSubscription)(nil)).Elem()
}

func (o StandardsSubscriptionMapOutput) ToStandardsSubscriptionMapOutput() StandardsSubscriptionMapOutput {
	return o
}

func (o StandardsSubscriptionMapOutput) ToStandardsSubscriptionMapOutputWithContext(ctx context.Context) StandardsSubscriptionMapOutput {
	return o
}

func (o StandardsSubscriptionMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*StandardsSubscription] {
	return pulumix.Output[map[string]*StandardsSubscription]{
		OutputState: o.OutputState,
	}
}

func (o StandardsSubscriptionMapOutput) MapIndex(k pulumi.StringInput) StandardsSubscriptionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *StandardsSubscription {
		return vs[0].(map[string]*StandardsSubscription)[vs[1].(string)]
	}).(StandardsSubscriptionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*StandardsSubscriptionInput)(nil)).Elem(), &StandardsSubscription{})
	pulumi.RegisterInputType(reflect.TypeOf((*StandardsSubscriptionArrayInput)(nil)).Elem(), StandardsSubscriptionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*StandardsSubscriptionMapInput)(nil)).Elem(), StandardsSubscriptionMap{})
	pulumi.RegisterOutputType(StandardsSubscriptionOutput{})
	pulumi.RegisterOutputType(StandardsSubscriptionArrayOutput{})
	pulumi.RegisterOutputType(StandardsSubscriptionMapOutput{})
}
