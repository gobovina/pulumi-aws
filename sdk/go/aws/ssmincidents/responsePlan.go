// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ssmincidents

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a resource to manage response plans in AWS Systems Manager Incident Manager.
//
// ## Example Usage
//
// ### Basic Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ssmincidents"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ssmincidents.NewResponsePlan(ctx, "example", &ssmincidents.ResponsePlanArgs{
//				Name: pulumi.String("name"),
//				IncidentTemplate: &ssmincidents.ResponsePlanIncidentTemplateArgs{
//					Title:  pulumi.String("title"),
//					Impact: pulumi.Int(3),
//				},
//				Tags: pulumi.StringMap{
//					"key": pulumi.String("value"),
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
// <!--End PulumiCodeChooser -->
//
// ### Usage With All Fields
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ssmincidents"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ssmincidents.NewResponsePlan(ctx, "example", &ssmincidents.ResponsePlanArgs{
//				Name: pulumi.String("name"),
//				IncidentTemplate: &ssmincidents.ResponsePlanIncidentTemplateArgs{
//					Title:        pulumi.String("title"),
//					Impact:       pulumi.Int(3),
//					DedupeString: pulumi.String("dedupe"),
//					IncidentTags: pulumi.StringMap{
//						"key": pulumi.String("value"),
//					},
//					NotificationTargets: ssmincidents.ResponsePlanIncidentTemplateNotificationTargetArray{
//						&ssmincidents.ResponsePlanIncidentTemplateNotificationTargetArgs{
//							SnsTopicArn: pulumi.Any(example1.Arn),
//						},
//						&ssmincidents.ResponsePlanIncidentTemplateNotificationTargetArgs{
//							SnsTopicArn: pulumi.Any(example2.Arn),
//						},
//					},
//					Summary: pulumi.String("summary"),
//				},
//				DisplayName: pulumi.String("display name"),
//				ChatChannels: pulumi.StringArray{
//					topic.Arn,
//				},
//				Engagements: pulumi.StringArray{
//					pulumi.String("arn:aws:ssm-contacts:us-east-2:111122223333:contact/test1"),
//				},
//				Action: &ssmincidents.ResponsePlanActionArgs{
//					SsmAutomations: ssmincidents.ResponsePlanActionSsmAutomationArray{
//						&ssmincidents.ResponsePlanActionSsmAutomationArgs{
//							DocumentName:    pulumi.Any(document1.Name),
//							RoleArn:         pulumi.Any(role1.Arn),
//							DocumentVersion: pulumi.String("version1"),
//							TargetAccount:   pulumi.String("RESPONSE_PLAN_OWNER_ACCOUNT"),
//							Parameters: ssmincidents.ResponsePlanActionSsmAutomationParameterArray{
//								&ssmincidents.ResponsePlanActionSsmAutomationParameterArgs{
//									Name: pulumi.String("key"),
//									Values: pulumi.StringArray{
//										pulumi.String("value1"),
//										pulumi.String("value2"),
//									},
//								},
//								&ssmincidents.ResponsePlanActionSsmAutomationParameterArgs{
//									Name: pulumi.String("foo"),
//									Values: pulumi.StringArray{
//										pulumi.String("bar"),
//									},
//								},
//							},
//							DynamicParameters: pulumi.StringMap{
//								"someKey":    pulumi.String("INVOLVED_RESOURCES"),
//								"anotherKey": pulumi.String("INCIDENT_RECORD_ARN"),
//							},
//						},
//					},
//				},
//				Integration: &ssmincidents.ResponsePlanIntegrationArgs{
//					Pagerduties: ssmincidents.ResponsePlanIntegrationPagerdutyArray{
//						&ssmincidents.ResponsePlanIntegrationPagerdutyArgs{
//							Name:      pulumi.String("pagerdutyIntergration"),
//							ServiceId: pulumi.String("example"),
//							SecretId:  pulumi.String("example"),
//						},
//					},
//				},
//				Tags: pulumi.StringMap{
//					"key": pulumi.String("value"),
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import an Incident Manager response plan using the response plan ARN. You can find the response plan ARN in the AWS Management Console. For example:
//
// ```sh
// $ pulumi import aws:ssmincidents/responsePlan:ResponsePlan responsePlanName ARNValue
// ```
type ResponsePlan struct {
	pulumi.CustomResourceState

	// The actions that the response plan starts at the beginning of an incident.
	Action ResponsePlanActionPtrOutput `pulumi:"action"`
	// The ARN of the response plan.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The Chatbot chat channel used for collaboration during an incident.
	ChatChannels pulumi.StringArrayOutput `pulumi:"chatChannels"`
	// The long format of the response plan name. This field can contain spaces.
	DisplayName pulumi.StringPtrOutput `pulumi:"displayName"`
	// The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan engages during an incident.
	Engagements      pulumi.StringArrayOutput           `pulumi:"engagements"`
	IncidentTemplate ResponsePlanIncidentTemplateOutput `pulumi:"incidentTemplate"`
	// Information about third-party services integrated into the response plan. The following values are supported:
	Integration ResponsePlanIntegrationPtrOutput `pulumi:"integration"`
	// The name of the response plan.
	Name pulumi.StringOutput `pulumi:"name"`
	// The tags applied to the response plan.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewResponsePlan registers a new resource with the given unique name, arguments, and options.
func NewResponsePlan(ctx *pulumi.Context,
	name string, args *ResponsePlanArgs, opts ...pulumi.ResourceOption) (*ResponsePlan, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.IncidentTemplate == nil {
		return nil, errors.New("invalid value for required argument 'IncidentTemplate'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ResponsePlan
	err := ctx.RegisterResource("aws:ssmincidents/responsePlan:ResponsePlan", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetResponsePlan gets an existing ResponsePlan resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetResponsePlan(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ResponsePlanState, opts ...pulumi.ResourceOption) (*ResponsePlan, error) {
	var resource ResponsePlan
	err := ctx.ReadResource("aws:ssmincidents/responsePlan:ResponsePlan", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ResponsePlan resources.
type responsePlanState struct {
	// The actions that the response plan starts at the beginning of an incident.
	Action *ResponsePlanAction `pulumi:"action"`
	// The ARN of the response plan.
	Arn *string `pulumi:"arn"`
	// The Chatbot chat channel used for collaboration during an incident.
	ChatChannels []string `pulumi:"chatChannels"`
	// The long format of the response plan name. This field can contain spaces.
	DisplayName *string `pulumi:"displayName"`
	// The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan engages during an incident.
	Engagements      []string                      `pulumi:"engagements"`
	IncidentTemplate *ResponsePlanIncidentTemplate `pulumi:"incidentTemplate"`
	// Information about third-party services integrated into the response plan. The following values are supported:
	Integration *ResponsePlanIntegration `pulumi:"integration"`
	// The name of the response plan.
	Name *string `pulumi:"name"`
	// The tags applied to the response plan.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ResponsePlanState struct {
	// The actions that the response plan starts at the beginning of an incident.
	Action ResponsePlanActionPtrInput
	// The ARN of the response plan.
	Arn pulumi.StringPtrInput
	// The Chatbot chat channel used for collaboration during an incident.
	ChatChannels pulumi.StringArrayInput
	// The long format of the response plan name. This field can contain spaces.
	DisplayName pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan engages during an incident.
	Engagements      pulumi.StringArrayInput
	IncidentTemplate ResponsePlanIncidentTemplatePtrInput
	// Information about third-party services integrated into the response plan. The following values are supported:
	Integration ResponsePlanIntegrationPtrInput
	// The name of the response plan.
	Name pulumi.StringPtrInput
	// The tags applied to the response plan.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ResponsePlanState) ElementType() reflect.Type {
	return reflect.TypeOf((*responsePlanState)(nil)).Elem()
}

type responsePlanArgs struct {
	// The actions that the response plan starts at the beginning of an incident.
	Action *ResponsePlanAction `pulumi:"action"`
	// The Chatbot chat channel used for collaboration during an incident.
	ChatChannels []string `pulumi:"chatChannels"`
	// The long format of the response plan name. This field can contain spaces.
	DisplayName *string `pulumi:"displayName"`
	// The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan engages during an incident.
	Engagements      []string                     `pulumi:"engagements"`
	IncidentTemplate ResponsePlanIncidentTemplate `pulumi:"incidentTemplate"`
	// Information about third-party services integrated into the response plan. The following values are supported:
	Integration *ResponsePlanIntegration `pulumi:"integration"`
	// The name of the response plan.
	Name *string `pulumi:"name"`
	// The tags applied to the response plan.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ResponsePlan resource.
type ResponsePlanArgs struct {
	// The actions that the response plan starts at the beginning of an incident.
	Action ResponsePlanActionPtrInput
	// The Chatbot chat channel used for collaboration during an incident.
	ChatChannels pulumi.StringArrayInput
	// The long format of the response plan name. This field can contain spaces.
	DisplayName pulumi.StringPtrInput
	// The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan engages during an incident.
	Engagements      pulumi.StringArrayInput
	IncidentTemplate ResponsePlanIncidentTemplateInput
	// Information about third-party services integrated into the response plan. The following values are supported:
	Integration ResponsePlanIntegrationPtrInput
	// The name of the response plan.
	Name pulumi.StringPtrInput
	// The tags applied to the response plan.
	Tags pulumi.StringMapInput
}

func (ResponsePlanArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*responsePlanArgs)(nil)).Elem()
}

type ResponsePlanInput interface {
	pulumi.Input

	ToResponsePlanOutput() ResponsePlanOutput
	ToResponsePlanOutputWithContext(ctx context.Context) ResponsePlanOutput
}

func (*ResponsePlan) ElementType() reflect.Type {
	return reflect.TypeOf((**ResponsePlan)(nil)).Elem()
}

func (i *ResponsePlan) ToResponsePlanOutput() ResponsePlanOutput {
	return i.ToResponsePlanOutputWithContext(context.Background())
}

func (i *ResponsePlan) ToResponsePlanOutputWithContext(ctx context.Context) ResponsePlanOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResponsePlanOutput)
}

// ResponsePlanArrayInput is an input type that accepts ResponsePlanArray and ResponsePlanArrayOutput values.
// You can construct a concrete instance of `ResponsePlanArrayInput` via:
//
//	ResponsePlanArray{ ResponsePlanArgs{...} }
type ResponsePlanArrayInput interface {
	pulumi.Input

	ToResponsePlanArrayOutput() ResponsePlanArrayOutput
	ToResponsePlanArrayOutputWithContext(context.Context) ResponsePlanArrayOutput
}

type ResponsePlanArray []ResponsePlanInput

func (ResponsePlanArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResponsePlan)(nil)).Elem()
}

func (i ResponsePlanArray) ToResponsePlanArrayOutput() ResponsePlanArrayOutput {
	return i.ToResponsePlanArrayOutputWithContext(context.Background())
}

func (i ResponsePlanArray) ToResponsePlanArrayOutputWithContext(ctx context.Context) ResponsePlanArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResponsePlanArrayOutput)
}

// ResponsePlanMapInput is an input type that accepts ResponsePlanMap and ResponsePlanMapOutput values.
// You can construct a concrete instance of `ResponsePlanMapInput` via:
//
//	ResponsePlanMap{ "key": ResponsePlanArgs{...} }
type ResponsePlanMapInput interface {
	pulumi.Input

	ToResponsePlanMapOutput() ResponsePlanMapOutput
	ToResponsePlanMapOutputWithContext(context.Context) ResponsePlanMapOutput
}

type ResponsePlanMap map[string]ResponsePlanInput

func (ResponsePlanMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResponsePlan)(nil)).Elem()
}

func (i ResponsePlanMap) ToResponsePlanMapOutput() ResponsePlanMapOutput {
	return i.ToResponsePlanMapOutputWithContext(context.Background())
}

func (i ResponsePlanMap) ToResponsePlanMapOutputWithContext(ctx context.Context) ResponsePlanMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ResponsePlanMapOutput)
}

type ResponsePlanOutput struct{ *pulumi.OutputState }

func (ResponsePlanOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ResponsePlan)(nil)).Elem()
}

func (o ResponsePlanOutput) ToResponsePlanOutput() ResponsePlanOutput {
	return o
}

func (o ResponsePlanOutput) ToResponsePlanOutputWithContext(ctx context.Context) ResponsePlanOutput {
	return o
}

// The actions that the response plan starts at the beginning of an incident.
func (o ResponsePlanOutput) Action() ResponsePlanActionPtrOutput {
	return o.ApplyT(func(v *ResponsePlan) ResponsePlanActionPtrOutput { return v.Action }).(ResponsePlanActionPtrOutput)
}

// The ARN of the response plan.
func (o ResponsePlanOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ResponsePlan) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The Chatbot chat channel used for collaboration during an incident.
func (o ResponsePlanOutput) ChatChannels() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ResponsePlan) pulumi.StringArrayOutput { return v.ChatChannels }).(pulumi.StringArrayOutput)
}

// The long format of the response plan name. This field can contain spaces.
func (o ResponsePlanOutput) DisplayName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ResponsePlan) pulumi.StringPtrOutput { return v.DisplayName }).(pulumi.StringPtrOutput)
}

// The Amazon Resource Name (ARN) for the contacts and escalation plans that the response plan engages during an incident.
func (o ResponsePlanOutput) Engagements() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *ResponsePlan) pulumi.StringArrayOutput { return v.Engagements }).(pulumi.StringArrayOutput)
}

func (o ResponsePlanOutput) IncidentTemplate() ResponsePlanIncidentTemplateOutput {
	return o.ApplyT(func(v *ResponsePlan) ResponsePlanIncidentTemplateOutput { return v.IncidentTemplate }).(ResponsePlanIncidentTemplateOutput)
}

// Information about third-party services integrated into the response plan. The following values are supported:
func (o ResponsePlanOutput) Integration() ResponsePlanIntegrationPtrOutput {
	return o.ApplyT(func(v *ResponsePlan) ResponsePlanIntegrationPtrOutput { return v.Integration }).(ResponsePlanIntegrationPtrOutput)
}

// The name of the response plan.
func (o ResponsePlanOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ResponsePlan) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// The tags applied to the response plan.
func (o ResponsePlanOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ResponsePlan) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ResponsePlanOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ResponsePlan) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ResponsePlanArrayOutput struct{ *pulumi.OutputState }

func (ResponsePlanArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ResponsePlan)(nil)).Elem()
}

func (o ResponsePlanArrayOutput) ToResponsePlanArrayOutput() ResponsePlanArrayOutput {
	return o
}

func (o ResponsePlanArrayOutput) ToResponsePlanArrayOutputWithContext(ctx context.Context) ResponsePlanArrayOutput {
	return o
}

func (o ResponsePlanArrayOutput) Index(i pulumi.IntInput) ResponsePlanOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ResponsePlan {
		return vs[0].([]*ResponsePlan)[vs[1].(int)]
	}).(ResponsePlanOutput)
}

type ResponsePlanMapOutput struct{ *pulumi.OutputState }

func (ResponsePlanMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ResponsePlan)(nil)).Elem()
}

func (o ResponsePlanMapOutput) ToResponsePlanMapOutput() ResponsePlanMapOutput {
	return o
}

func (o ResponsePlanMapOutput) ToResponsePlanMapOutputWithContext(ctx context.Context) ResponsePlanMapOutput {
	return o
}

func (o ResponsePlanMapOutput) MapIndex(k pulumi.StringInput) ResponsePlanOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ResponsePlan {
		return vs[0].(map[string]*ResponsePlan)[vs[1].(string)]
	}).(ResponsePlanOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ResponsePlanInput)(nil)).Elem(), &ResponsePlan{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResponsePlanArrayInput)(nil)).Elem(), ResponsePlanArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ResponsePlanMapInput)(nil)).Elem(), ResponsePlanMap{})
	pulumi.RegisterOutputType(ResponsePlanOutput{})
	pulumi.RegisterOutputType(ResponsePlanArrayOutput{})
	pulumi.RegisterOutputType(ResponsePlanMapOutput{})
}
