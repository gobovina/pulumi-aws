// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ssmcontacts

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS SSM Contact Plan.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ssmcontacts"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ssmcontacts.NewPlan(ctx, "example", &ssmcontacts.PlanArgs{
//				ContactId: pulumi.String("arn:aws:ssm-contacts:us-west-2:123456789012:contact/contactalias"),
//				Stages: ssmcontacts.PlanStageArray{
//					&ssmcontacts.PlanStageArgs{
//						DurationInMinutes: pulumi.Int(1),
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
// ### Usage with SSM Contact
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ssmcontacts"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			contact, err := ssmcontacts.NewContact(ctx, "contact", &ssmcontacts.ContactArgs{
//				Alias: pulumi.String("alias"),
//				Type:  pulumi.String("PERSONAL"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ssmcontacts.NewPlan(ctx, "plan", &ssmcontacts.PlanArgs{
//				ContactId: contact.Arn,
//				Stages: ssmcontacts.PlanStageArray{
//					&ssmcontacts.PlanStageArgs{
//						DurationInMinutes: pulumi.Int(1),
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
// ### Usage With All Fields
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ssmcontacts"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			escalationPlan, err := ssmcontacts.NewContact(ctx, "escalationPlan", &ssmcontacts.ContactArgs{
//				Alias: pulumi.String("escalation-plan-alias"),
//				Type:  pulumi.String("ESCALATION"),
//			})
//			if err != nil {
//				return err
//			}
//			contactOne, err := ssmcontacts.NewContact(ctx, "contactOne", &ssmcontacts.ContactArgs{
//				Alias: pulumi.String("alias"),
//				Type:  pulumi.String("PERSONAL"),
//			})
//			if err != nil {
//				return err
//			}
//			contactTwo, err := ssmcontacts.NewContact(ctx, "contactTwo", &ssmcontacts.ContactArgs{
//				Alias: pulumi.String("alias"),
//				Type:  pulumi.String("PERSONAL"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = ssmcontacts.NewPlan(ctx, "test", &ssmcontacts.PlanArgs{
//				ContactId: escalationPlan.Arn,
//				Stages: ssmcontacts.PlanStageArray{
//					&ssmcontacts.PlanStageArgs{
//						DurationInMinutes: pulumi.Int(0),
//						Targets: ssmcontacts.PlanStageTargetArray{
//							&ssmcontacts.PlanStageTargetArgs{
//								ContactTargetInfo: &ssmcontacts.PlanStageTargetContactTargetInfoArgs{
//									IsEssential: pulumi.Bool(false),
//									ContactId:   contactOne.Arn,
//								},
//							},
//							&ssmcontacts.PlanStageTargetArgs{
//								ContactTargetInfo: &ssmcontacts.PlanStageTargetContactTargetInfoArgs{
//									IsEssential: pulumi.Bool(true),
//									ContactId:   contactTwo.Arn,
//								},
//							},
//						},
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
//
// ## Import
//
// Using `pulumi import`, import SSM Contact Plan using the Contact ARN. For example:
//
// ```sh
//
//	$ pulumi import aws:ssmcontacts/plan:Plan example {ARNValue}
//
// ```
type Plan struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the contact or escalation plan.
	ContactId pulumi.StringOutput `pulumi:"contactId"`
	// List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
	Stages PlanStageArrayOutput `pulumi:"stages"`
}

// NewPlan registers a new resource with the given unique name, arguments, and options.
func NewPlan(ctx *pulumi.Context,
	name string, args *PlanArgs, opts ...pulumi.ResourceOption) (*Plan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ContactId == nil {
		return nil, errors.New("invalid value for required argument 'ContactId'")
	}
	if args.Stages == nil {
		return nil, errors.New("invalid value for required argument 'Stages'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Plan
	err := ctx.RegisterResource("aws:ssmcontacts/plan:Plan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetPlan gets an existing Plan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetPlan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *PlanState, opts ...pulumi.ResourceOption) (*Plan, error) {
	var resource Plan
	err := ctx.ReadResource("aws:ssmcontacts/plan:Plan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Plan resources.
type planState struct {
	// The Amazon Resource Name (ARN) of the contact or escalation plan.
	ContactId *string `pulumi:"contactId"`
	// List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
	Stages []PlanStage `pulumi:"stages"`
}

type PlanState struct {
	// The Amazon Resource Name (ARN) of the contact or escalation plan.
	ContactId pulumi.StringPtrInput
	// List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
	Stages PlanStageArrayInput
}

func (PlanState) ElementType() reflect.Type {
	return reflect.TypeOf((*planState)(nil)).Elem()
}

type planArgs struct {
	// The Amazon Resource Name (ARN) of the contact or escalation plan.
	ContactId string `pulumi:"contactId"`
	// List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
	Stages []PlanStage `pulumi:"stages"`
}

// The set of arguments for constructing a Plan resource.
type PlanArgs struct {
	// The Amazon Resource Name (ARN) of the contact or escalation plan.
	ContactId pulumi.StringInput
	// List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
	Stages PlanStageArrayInput
}

func (PlanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*planArgs)(nil)).Elem()
}

type PlanInput interface {
	pulumi.Input

	ToPlanOutput() PlanOutput
	ToPlanOutputWithContext(ctx context.Context) PlanOutput
}

func (*Plan) ElementType() reflect.Type {
	return reflect.TypeOf((**Plan)(nil)).Elem()
}

func (i *Plan) ToPlanOutput() PlanOutput {
	return i.ToPlanOutputWithContext(context.Background())
}

func (i *Plan) ToPlanOutputWithContext(ctx context.Context) PlanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlanOutput)
}

// PlanArrayInput is an input type that accepts PlanArray and PlanArrayOutput values.
// You can construct a concrete instance of `PlanArrayInput` via:
//
//	PlanArray{ PlanArgs{...} }
type PlanArrayInput interface {
	pulumi.Input

	ToPlanArrayOutput() PlanArrayOutput
	ToPlanArrayOutputWithContext(context.Context) PlanArrayOutput
}

type PlanArray []PlanInput

func (PlanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Plan)(nil)).Elem()
}

func (i PlanArray) ToPlanArrayOutput() PlanArrayOutput {
	return i.ToPlanArrayOutputWithContext(context.Background())
}

func (i PlanArray) ToPlanArrayOutputWithContext(ctx context.Context) PlanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlanArrayOutput)
}

// PlanMapInput is an input type that accepts PlanMap and PlanMapOutput values.
// You can construct a concrete instance of `PlanMapInput` via:
//
//	PlanMap{ "key": PlanArgs{...} }
type PlanMapInput interface {
	pulumi.Input

	ToPlanMapOutput() PlanMapOutput
	ToPlanMapOutputWithContext(context.Context) PlanMapOutput
}

type PlanMap map[string]PlanInput

func (PlanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Plan)(nil)).Elem()
}

func (i PlanMap) ToPlanMapOutput() PlanMapOutput {
	return i.ToPlanMapOutputWithContext(context.Background())
}

func (i PlanMap) ToPlanMapOutputWithContext(ctx context.Context) PlanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(PlanMapOutput)
}

type PlanOutput struct{ *pulumi.OutputState }

func (PlanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Plan)(nil)).Elem()
}

func (o PlanOutput) ToPlanOutput() PlanOutput {
	return o
}

func (o PlanOutput) ToPlanOutputWithContext(ctx context.Context) PlanOutput {
	return o
}

// The Amazon Resource Name (ARN) of the contact or escalation plan.
func (o PlanOutput) ContactId() pulumi.StringOutput {
	return o.ApplyT(func(v *Plan) pulumi.StringOutput { return v.ContactId }).(pulumi.StringOutput)
}

// List of stages. A contact has an engagement plan with stages that contact specified contact channels. An escalation plan uses stages that contact specified contacts.
func (o PlanOutput) Stages() PlanStageArrayOutput {
	return o.ApplyT(func(v *Plan) PlanStageArrayOutput { return v.Stages }).(PlanStageArrayOutput)
}

type PlanArrayOutput struct{ *pulumi.OutputState }

func (PlanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Plan)(nil)).Elem()
}

func (o PlanArrayOutput) ToPlanArrayOutput() PlanArrayOutput {
	return o
}

func (o PlanArrayOutput) ToPlanArrayOutputWithContext(ctx context.Context) PlanArrayOutput {
	return o
}

func (o PlanArrayOutput) Index(i pulumi.IntInput) PlanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Plan {
		return vs[0].([]*Plan)[vs[1].(int)]
	}).(PlanOutput)
}

type PlanMapOutput struct{ *pulumi.OutputState }

func (PlanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Plan)(nil)).Elem()
}

func (o PlanMapOutput) ToPlanMapOutput() PlanMapOutput {
	return o
}

func (o PlanMapOutput) ToPlanMapOutputWithContext(ctx context.Context) PlanMapOutput {
	return o
}

func (o PlanMapOutput) MapIndex(k pulumi.StringInput) PlanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Plan {
		return vs[0].(map[string]*Plan)[vs[1].(string)]
	}).(PlanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*PlanInput)(nil)).Elem(), &Plan{})
	pulumi.RegisterInputType(reflect.TypeOf((*PlanArrayInput)(nil)).Elem(), PlanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*PlanMapInput)(nil)).Elem(), PlanMap{})
	pulumi.RegisterOutputType(PlanOutput{})
	pulumi.RegisterOutputType(PlanArrayOutput{})
	pulumi.RegisterOutputType(PlanMapOutput{})
}
