// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package connect

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Amazon Connect Contact Flow resource. For more information see
// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
//
// This resource embeds or references Contact Flows specified in Amazon Connect Contact Flow Language. For more information see
// [Amazon Connect Flow language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html)
//
// !> **WARN:** Contact Flows exported from the Console [Contact Flow import/export](https://docs.aws.amazon.com/connect/latest/adminguide/contact-flow-import-export.html) are not in the Amazon Connect Contact Flow Language and can not be used with this resource. Instead, the recommendation is to use the AWS CLI [`describe-contact-flow`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/connect/describe-contact-flow.html).
// See example below which uses `jq` to extract the `Content` attribute and saves it to a local file.
//
// ## Example Usage
// ### Basic
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/connect"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"version":     "2019-10-30",
//				"startAction": "12345678-1234-1234-1234-123456789012",
//				"actions": []interface{}{
//					map[string]interface{}{
//						"identifier": "12345678-1234-1234-1234-123456789012",
//						"type":       "MessageParticipant",
//						"transitions": map[string]interface{}{
//							"nextAction": "abcdef-abcd-abcd-abcd-abcdefghijkl",
//							"errors":     []interface{}{},
//							"conditions": []interface{}{},
//						},
//						"parameters": map[string]interface{}{
//							"text": "Thanks for calling the sample flow!",
//						},
//					},
//					map[string]interface{}{
//						"identifier":  "abcdef-abcd-abcd-abcd-abcdefghijkl",
//						"type":        "DisconnectParticipant",
//						"transitions": nil,
//						"parameters":  nil,
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = connect.NewContactFlow(ctx, "test", &connect.ContactFlowArgs{
//				InstanceId:  pulumi.String("aaaaaaaa-bbbb-cccc-dddd-111111111111"),
//				Name:        pulumi.String("Test"),
//				Description: pulumi.String("Test Contact Flow Description"),
//				Type:        pulumi.String("CONTACT_FLOW"),
//				Content:     pulumi.String(json0),
//				Tags: pulumi.StringMap{
//					"Name":        pulumi.String("Test Contact Flow"),
//					"Application": pulumi.String("Example"),
//					"Method":      pulumi.String("Create"),
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
// Using `pulumi import`, import Amazon Connect Contact Flows using the `instance_id` and `contact_flow_id` separated by a colon (`:`). For example:
//
// ```sh
//
//	$ pulumi import aws:connect/contactFlow:ContactFlow example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
//
// ```
type ContactFlow struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the Contact Flow.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The identifier of the Contact Flow.
	ContactFlowId pulumi.StringOutput `pulumi:"contactFlowId"`
	// Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
	Content pulumi.StringOutput `pulumi:"content"`
	// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow source specified with `filename`.
	ContentHash pulumi.StringPtrOutput `pulumi:"contentHash"`
	// Specifies the description of the Contact Flow.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
	Filename pulumi.StringPtrOutput `pulumi:"filename"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// Specifies the name of the Contact Flow.
	Name pulumi.StringOutput `pulumi:"name"`
	// Tags to apply to the Contact Flow. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
	Type pulumi.StringPtrOutput `pulumi:"type"`
}

// NewContactFlow registers a new resource with the given unique name, arguments, and options.
func NewContactFlow(ctx *pulumi.Context,
	name string, args *ContactFlowArgs, opts ...pulumi.ResourceOption) (*ContactFlow, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ContactFlow
	err := ctx.RegisterResource("aws:connect/contactFlow:ContactFlow", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetContactFlow gets an existing ContactFlow resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetContactFlow(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ContactFlowState, opts ...pulumi.ResourceOption) (*ContactFlow, error) {
	var resource ContactFlow
	err := ctx.ReadResource("aws:connect/contactFlow:ContactFlow", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ContactFlow resources.
type contactFlowState struct {
	// The Amazon Resource Name (ARN) of the Contact Flow.
	Arn *string `pulumi:"arn"`
	// The identifier of the Contact Flow.
	ContactFlowId *string `pulumi:"contactFlowId"`
	// Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
	Content *string `pulumi:"content"`
	// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow source specified with `filename`.
	ContentHash *string `pulumi:"contentHash"`
	// Specifies the description of the Contact Flow.
	Description *string `pulumi:"description"`
	// The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
	Filename *string `pulumi:"filename"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId *string `pulumi:"instanceId"`
	// Specifies the name of the Contact Flow.
	Name *string `pulumi:"name"`
	// Tags to apply to the Contact Flow. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
	Type *string `pulumi:"type"`
}

type ContactFlowState struct {
	// The Amazon Resource Name (ARN) of the Contact Flow.
	Arn pulumi.StringPtrInput
	// The identifier of the Contact Flow.
	ContactFlowId pulumi.StringPtrInput
	// Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
	Content pulumi.StringPtrInput
	// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow source specified with `filename`.
	ContentHash pulumi.StringPtrInput
	// Specifies the description of the Contact Flow.
	Description pulumi.StringPtrInput
	// The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
	Filename pulumi.StringPtrInput
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringPtrInput
	// Specifies the name of the Contact Flow.
	Name pulumi.StringPtrInput
	// Tags to apply to the Contact Flow. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
	Type pulumi.StringPtrInput
}

func (ContactFlowState) ElementType() reflect.Type {
	return reflect.TypeOf((*contactFlowState)(nil)).Elem()
}

type contactFlowArgs struct {
	// Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
	Content *string `pulumi:"content"`
	// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow source specified with `filename`.
	ContentHash *string `pulumi:"contentHash"`
	// Specifies the description of the Contact Flow.
	Description *string `pulumi:"description"`
	// The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
	Filename *string `pulumi:"filename"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId string `pulumi:"instanceId"`
	// Specifies the name of the Contact Flow.
	Name *string `pulumi:"name"`
	// Tags to apply to the Contact Flow. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
	Type *string `pulumi:"type"`
}

// The set of arguments for constructing a ContactFlow resource.
type ContactFlowArgs struct {
	// Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
	Content pulumi.StringPtrInput
	// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow source specified with `filename`.
	ContentHash pulumi.StringPtrInput
	// Specifies the description of the Contact Flow.
	Description pulumi.StringPtrInput
	// The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
	Filename pulumi.StringPtrInput
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringInput
	// Specifies the name of the Contact Flow.
	Name pulumi.StringPtrInput
	// Tags to apply to the Contact Flow. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
	Type pulumi.StringPtrInput
}

func (ContactFlowArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*contactFlowArgs)(nil)).Elem()
}

type ContactFlowInput interface {
	pulumi.Input

	ToContactFlowOutput() ContactFlowOutput
	ToContactFlowOutputWithContext(ctx context.Context) ContactFlowOutput
}

func (*ContactFlow) ElementType() reflect.Type {
	return reflect.TypeOf((**ContactFlow)(nil)).Elem()
}

func (i *ContactFlow) ToContactFlowOutput() ContactFlowOutput {
	return i.ToContactFlowOutputWithContext(context.Background())
}

func (i *ContactFlow) ToContactFlowOutputWithContext(ctx context.Context) ContactFlowOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContactFlowOutput)
}

// ContactFlowArrayInput is an input type that accepts ContactFlowArray and ContactFlowArrayOutput values.
// You can construct a concrete instance of `ContactFlowArrayInput` via:
//
//	ContactFlowArray{ ContactFlowArgs{...} }
type ContactFlowArrayInput interface {
	pulumi.Input

	ToContactFlowArrayOutput() ContactFlowArrayOutput
	ToContactFlowArrayOutputWithContext(context.Context) ContactFlowArrayOutput
}

type ContactFlowArray []ContactFlowInput

func (ContactFlowArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContactFlow)(nil)).Elem()
}

func (i ContactFlowArray) ToContactFlowArrayOutput() ContactFlowArrayOutput {
	return i.ToContactFlowArrayOutputWithContext(context.Background())
}

func (i ContactFlowArray) ToContactFlowArrayOutputWithContext(ctx context.Context) ContactFlowArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContactFlowArrayOutput)
}

// ContactFlowMapInput is an input type that accepts ContactFlowMap and ContactFlowMapOutput values.
// You can construct a concrete instance of `ContactFlowMapInput` via:
//
//	ContactFlowMap{ "key": ContactFlowArgs{...} }
type ContactFlowMapInput interface {
	pulumi.Input

	ToContactFlowMapOutput() ContactFlowMapOutput
	ToContactFlowMapOutputWithContext(context.Context) ContactFlowMapOutput
}

type ContactFlowMap map[string]ContactFlowInput

func (ContactFlowMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContactFlow)(nil)).Elem()
}

func (i ContactFlowMap) ToContactFlowMapOutput() ContactFlowMapOutput {
	return i.ToContactFlowMapOutputWithContext(context.Background())
}

func (i ContactFlowMap) ToContactFlowMapOutputWithContext(ctx context.Context) ContactFlowMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContactFlowMapOutput)
}

type ContactFlowOutput struct{ *pulumi.OutputState }

func (ContactFlowOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ContactFlow)(nil)).Elem()
}

func (o ContactFlowOutput) ToContactFlowOutput() ContactFlowOutput {
	return o
}

func (o ContactFlowOutput) ToContactFlowOutputWithContext(ctx context.Context) ContactFlowOutput {
	return o
}

// The Amazon Resource Name (ARN) of the Contact Flow.
func (o ContactFlowOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ContactFlow) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The identifier of the Contact Flow.
func (o ContactFlowOutput) ContactFlowId() pulumi.StringOutput {
	return o.ApplyT(func(v *ContactFlow) pulumi.StringOutput { return v.ContactFlowId }).(pulumi.StringOutput)
}

// Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
func (o ContactFlowOutput) Content() pulumi.StringOutput {
	return o.ApplyT(func(v *ContactFlow) pulumi.StringOutput { return v.Content }).(pulumi.StringOutput)
}

// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow source specified with `filename`.
func (o ContactFlowOutput) ContentHash() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContactFlow) pulumi.StringPtrOutput { return v.ContentHash }).(pulumi.StringPtrOutput)
}

// Specifies the description of the Contact Flow.
func (o ContactFlowOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContactFlow) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
func (o ContactFlowOutput) Filename() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContactFlow) pulumi.StringPtrOutput { return v.Filename }).(pulumi.StringPtrOutput)
}

// Specifies the identifier of the hosting Amazon Connect Instance.
func (o ContactFlowOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ContactFlow) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// Specifies the name of the Contact Flow.
func (o ContactFlowOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ContactFlow) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Tags to apply to the Contact Flow. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ContactFlowOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ContactFlow) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ContactFlowOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ContactFlow) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
func (o ContactFlowOutput) Type() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContactFlow) pulumi.StringPtrOutput { return v.Type }).(pulumi.StringPtrOutput)
}

type ContactFlowArrayOutput struct{ *pulumi.OutputState }

func (ContactFlowArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContactFlow)(nil)).Elem()
}

func (o ContactFlowArrayOutput) ToContactFlowArrayOutput() ContactFlowArrayOutput {
	return o
}

func (o ContactFlowArrayOutput) ToContactFlowArrayOutputWithContext(ctx context.Context) ContactFlowArrayOutput {
	return o
}

func (o ContactFlowArrayOutput) Index(i pulumi.IntInput) ContactFlowOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ContactFlow {
		return vs[0].([]*ContactFlow)[vs[1].(int)]
	}).(ContactFlowOutput)
}

type ContactFlowMapOutput struct{ *pulumi.OutputState }

func (ContactFlowMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContactFlow)(nil)).Elem()
}

func (o ContactFlowMapOutput) ToContactFlowMapOutput() ContactFlowMapOutput {
	return o
}

func (o ContactFlowMapOutput) ToContactFlowMapOutputWithContext(ctx context.Context) ContactFlowMapOutput {
	return o
}

func (o ContactFlowMapOutput) MapIndex(k pulumi.StringInput) ContactFlowOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ContactFlow {
		return vs[0].(map[string]*ContactFlow)[vs[1].(string)]
	}).(ContactFlowOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ContactFlowInput)(nil)).Elem(), &ContactFlow{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContactFlowArrayInput)(nil)).Elem(), ContactFlowArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContactFlowMapInput)(nil)).Elem(), ContactFlowMap{})
	pulumi.RegisterOutputType(ContactFlowOutput{})
	pulumi.RegisterOutputType(ContactFlowArrayOutput{})
	pulumi.RegisterOutputType(ContactFlowMapOutput{})
}
