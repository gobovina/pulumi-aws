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

// Provides an Amazon Connect Contact Flow Module resource. For more information see
// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
//
// This resource embeds or references Contact Flows Modules specified in Amazon Connect Contact Flow Language. For more information see
// [Amazon Connect Flow language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html)
//
// !> **WARN:** Contact Flow Modules exported from the Console [See Contact Flow import/export which is the same for Contact Flow Modules](https://docs.aws.amazon.com/connect/latest/adminguide/contact-flow-import-export.html) are not in the Amazon Connect Contact Flow Language and can not be used with this resource. Instead, the recommendation is to use the AWS CLI [`describe-contact-flow-module`](https://docs.aws.amazon.com/cli/latest/reference/connect/describe-contact-flow-module.html).
// See example below which uses `jq` to extract the `Content` attribute and saves it to a local file.
//
// ## Example Usage
//
// ### Basic
//
// <!--Start PulumiCodeChooser -->
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
//						"parameters": map[string]interface{}{
//							"text": "Hello contact flow module",
//						},
//						"transitions": map[string]interface{}{
//							"nextAction": "abcdef-abcd-abcd-abcd-abcdefghijkl",
//							"errors":     []interface{}{},
//							"conditions": []interface{}{},
//						},
//						"type": "MessageParticipant",
//					},
//					map[string]interface{}{
//						"identifier":  "abcdef-abcd-abcd-abcd-abcdefghijkl",
//						"type":        "DisconnectParticipant",
//						"parameters":  nil,
//						"transitions": nil,
//					},
//				},
//				"settings": map[string]interface{}{
//					"inputParameters":  []interface{}{},
//					"outputParameters": []interface{}{},
//					"transitions": []map[string]interface{}{
//						map[string]interface{}{
//							"displayName":   "Success",
//							"referenceName": "Success",
//							"description":   "",
//						},
//						map[string]interface{}{
//							"displayName":   "Error",
//							"referenceName": "Error",
//							"description":   "",
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = connect.NewContactFlowModule(ctx, "example", &connect.ContactFlowModuleArgs{
//				InstanceId:  pulumi.String("aaaaaaaa-bbbb-cccc-dddd-111111111111"),
//				Name:        pulumi.String("Example"),
//				Description: pulumi.String("Example Contact Flow Module Description"),
//				Content:     pulumi.String(json0),
//				Tags: pulumi.StringMap{
//					"Name":        pulumi.String("Example Contact Flow Module"),
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
// <!--End PulumiCodeChooser -->
//
// ### With External Content
//
// Use the AWS CLI to extract Contact Flow Content:
//
// Use the generated file as input:
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/connect"
//	"github.com/pulumi/pulumi-std/sdk/go/std"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			invokeFilebase64sha256, err := std.Filebase64sha256(ctx, &std.Filebase64sha256Args{
//				Input: "contact_flow_module.json",
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = connect.NewContactFlowModule(ctx, "example", &connect.ContactFlowModuleArgs{
//				InstanceId:  pulumi.String("aaaaaaaa-bbbb-cccc-dddd-111111111111"),
//				Name:        pulumi.String("Example"),
//				Description: pulumi.String("Example Contact Flow Module Description"),
//				Filename:    pulumi.String("contact_flow_module.json"),
//				ContentHash: invokeFilebase64sha256.Result,
//				Tags: pulumi.StringMap{
//					"Name":        pulumi.String("Example Contact Flow Module"),
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
// <!--End PulumiCodeChooser -->
//
// ## Import
//
// Using `pulumi import`, import Amazon Connect Contact Flow Modules using the `instance_id` and `contact_flow_module_id` separated by a colon (`:`). For example:
//
// ```sh
// $ pulumi import aws:connect/contactFlowModule:ContactFlowModule example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
// ```
type ContactFlowModule struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the Contact Flow Module.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The identifier of the Contact Flow Module.
	ContactFlowModuleId pulumi.StringOutput `pulumi:"contactFlowModuleId"`
	// Specifies the content of the Contact Flow Module, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
	Content pulumi.StringOutput `pulumi:"content"`
	// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow Module source specified with `filename`.
	ContentHash pulumi.StringPtrOutput `pulumi:"contentHash"`
	// Specifies the description of the Contact Flow Module.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The path to the Contact Flow Module source within the local filesystem. Conflicts with `content`.
	Filename pulumi.StringPtrOutput `pulumi:"filename"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringOutput `pulumi:"instanceId"`
	// Specifies the name of the Contact Flow Module.
	Name pulumi.StringOutput `pulumi:"name"`
	// Tags to apply to the Contact Flow Module. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewContactFlowModule registers a new resource with the given unique name, arguments, and options.
func NewContactFlowModule(ctx *pulumi.Context,
	name string, args *ContactFlowModuleArgs, opts ...pulumi.ResourceOption) (*ContactFlowModule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.InstanceId == nil {
		return nil, errors.New("invalid value for required argument 'InstanceId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ContactFlowModule
	err := ctx.RegisterResource("aws:connect/contactFlowModule:ContactFlowModule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetContactFlowModule gets an existing ContactFlowModule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetContactFlowModule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ContactFlowModuleState, opts ...pulumi.ResourceOption) (*ContactFlowModule, error) {
	var resource ContactFlowModule
	err := ctx.ReadResource("aws:connect/contactFlowModule:ContactFlowModule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ContactFlowModule resources.
type contactFlowModuleState struct {
	// The Amazon Resource Name (ARN) of the Contact Flow Module.
	Arn *string `pulumi:"arn"`
	// The identifier of the Contact Flow Module.
	ContactFlowModuleId *string `pulumi:"contactFlowModuleId"`
	// Specifies the content of the Contact Flow Module, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
	Content *string `pulumi:"content"`
	// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow Module source specified with `filename`.
	ContentHash *string `pulumi:"contentHash"`
	// Specifies the description of the Contact Flow Module.
	Description *string `pulumi:"description"`
	// The path to the Contact Flow Module source within the local filesystem. Conflicts with `content`.
	Filename *string `pulumi:"filename"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId *string `pulumi:"instanceId"`
	// Specifies the name of the Contact Flow Module.
	Name *string `pulumi:"name"`
	// Tags to apply to the Contact Flow Module. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ContactFlowModuleState struct {
	// The Amazon Resource Name (ARN) of the Contact Flow Module.
	Arn pulumi.StringPtrInput
	// The identifier of the Contact Flow Module.
	ContactFlowModuleId pulumi.StringPtrInput
	// Specifies the content of the Contact Flow Module, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
	Content pulumi.StringPtrInput
	// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow Module source specified with `filename`.
	ContentHash pulumi.StringPtrInput
	// Specifies the description of the Contact Flow Module.
	Description pulumi.StringPtrInput
	// The path to the Contact Flow Module source within the local filesystem. Conflicts with `content`.
	Filename pulumi.StringPtrInput
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringPtrInput
	// Specifies the name of the Contact Flow Module.
	Name pulumi.StringPtrInput
	// Tags to apply to the Contact Flow Module. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ContactFlowModuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*contactFlowModuleState)(nil)).Elem()
}

type contactFlowModuleArgs struct {
	// Specifies the content of the Contact Flow Module, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
	Content *string `pulumi:"content"`
	// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow Module source specified with `filename`.
	ContentHash *string `pulumi:"contentHash"`
	// Specifies the description of the Contact Flow Module.
	Description *string `pulumi:"description"`
	// The path to the Contact Flow Module source within the local filesystem. Conflicts with `content`.
	Filename *string `pulumi:"filename"`
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId string `pulumi:"instanceId"`
	// Specifies the name of the Contact Flow Module.
	Name *string `pulumi:"name"`
	// Tags to apply to the Contact Flow Module. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a ContactFlowModule resource.
type ContactFlowModuleArgs struct {
	// Specifies the content of the Contact Flow Module, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
	Content pulumi.StringPtrInput
	// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow Module source specified with `filename`.
	ContentHash pulumi.StringPtrInput
	// Specifies the description of the Contact Flow Module.
	Description pulumi.StringPtrInput
	// The path to the Contact Flow Module source within the local filesystem. Conflicts with `content`.
	Filename pulumi.StringPtrInput
	// Specifies the identifier of the hosting Amazon Connect Instance.
	InstanceId pulumi.StringInput
	// Specifies the name of the Contact Flow Module.
	Name pulumi.StringPtrInput
	// Tags to apply to the Contact Flow Module. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (ContactFlowModuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*contactFlowModuleArgs)(nil)).Elem()
}

type ContactFlowModuleInput interface {
	pulumi.Input

	ToContactFlowModuleOutput() ContactFlowModuleOutput
	ToContactFlowModuleOutputWithContext(ctx context.Context) ContactFlowModuleOutput
}

func (*ContactFlowModule) ElementType() reflect.Type {
	return reflect.TypeOf((**ContactFlowModule)(nil)).Elem()
}

func (i *ContactFlowModule) ToContactFlowModuleOutput() ContactFlowModuleOutput {
	return i.ToContactFlowModuleOutputWithContext(context.Background())
}

func (i *ContactFlowModule) ToContactFlowModuleOutputWithContext(ctx context.Context) ContactFlowModuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContactFlowModuleOutput)
}

// ContactFlowModuleArrayInput is an input type that accepts ContactFlowModuleArray and ContactFlowModuleArrayOutput values.
// You can construct a concrete instance of `ContactFlowModuleArrayInput` via:
//
//	ContactFlowModuleArray{ ContactFlowModuleArgs{...} }
type ContactFlowModuleArrayInput interface {
	pulumi.Input

	ToContactFlowModuleArrayOutput() ContactFlowModuleArrayOutput
	ToContactFlowModuleArrayOutputWithContext(context.Context) ContactFlowModuleArrayOutput
}

type ContactFlowModuleArray []ContactFlowModuleInput

func (ContactFlowModuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContactFlowModule)(nil)).Elem()
}

func (i ContactFlowModuleArray) ToContactFlowModuleArrayOutput() ContactFlowModuleArrayOutput {
	return i.ToContactFlowModuleArrayOutputWithContext(context.Background())
}

func (i ContactFlowModuleArray) ToContactFlowModuleArrayOutputWithContext(ctx context.Context) ContactFlowModuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContactFlowModuleArrayOutput)
}

// ContactFlowModuleMapInput is an input type that accepts ContactFlowModuleMap and ContactFlowModuleMapOutput values.
// You can construct a concrete instance of `ContactFlowModuleMapInput` via:
//
//	ContactFlowModuleMap{ "key": ContactFlowModuleArgs{...} }
type ContactFlowModuleMapInput interface {
	pulumi.Input

	ToContactFlowModuleMapOutput() ContactFlowModuleMapOutput
	ToContactFlowModuleMapOutputWithContext(context.Context) ContactFlowModuleMapOutput
}

type ContactFlowModuleMap map[string]ContactFlowModuleInput

func (ContactFlowModuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContactFlowModule)(nil)).Elem()
}

func (i ContactFlowModuleMap) ToContactFlowModuleMapOutput() ContactFlowModuleMapOutput {
	return i.ToContactFlowModuleMapOutputWithContext(context.Background())
}

func (i ContactFlowModuleMap) ToContactFlowModuleMapOutputWithContext(ctx context.Context) ContactFlowModuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ContactFlowModuleMapOutput)
}

type ContactFlowModuleOutput struct{ *pulumi.OutputState }

func (ContactFlowModuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ContactFlowModule)(nil)).Elem()
}

func (o ContactFlowModuleOutput) ToContactFlowModuleOutput() ContactFlowModuleOutput {
	return o
}

func (o ContactFlowModuleOutput) ToContactFlowModuleOutputWithContext(ctx context.Context) ContactFlowModuleOutput {
	return o
}

// The Amazon Resource Name (ARN) of the Contact Flow Module.
func (o ContactFlowModuleOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *ContactFlowModule) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The identifier of the Contact Flow Module.
func (o ContactFlowModuleOutput) ContactFlowModuleId() pulumi.StringOutput {
	return o.ApplyT(func(v *ContactFlowModule) pulumi.StringOutput { return v.ContactFlowModuleId }).(pulumi.StringOutput)
}

// Specifies the content of the Contact Flow Module, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
func (o ContactFlowModuleOutput) Content() pulumi.StringOutput {
	return o.ApplyT(func(v *ContactFlowModule) pulumi.StringOutput { return v.Content }).(pulumi.StringOutput)
}

// Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow Module source specified with `filename`.
func (o ContactFlowModuleOutput) ContentHash() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContactFlowModule) pulumi.StringPtrOutput { return v.ContentHash }).(pulumi.StringPtrOutput)
}

// Specifies the description of the Contact Flow Module.
func (o ContactFlowModuleOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContactFlowModule) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The path to the Contact Flow Module source within the local filesystem. Conflicts with `content`.
func (o ContactFlowModuleOutput) Filename() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ContactFlowModule) pulumi.StringPtrOutput { return v.Filename }).(pulumi.StringPtrOutput)
}

// Specifies the identifier of the hosting Amazon Connect Instance.
func (o ContactFlowModuleOutput) InstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *ContactFlowModule) pulumi.StringOutput { return v.InstanceId }).(pulumi.StringOutput)
}

// Specifies the name of the Contact Flow Module.
func (o ContactFlowModuleOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *ContactFlowModule) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// Tags to apply to the Contact Flow Module. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ContactFlowModuleOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ContactFlowModule) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ContactFlowModuleOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *ContactFlowModule) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ContactFlowModuleArrayOutput struct{ *pulumi.OutputState }

func (ContactFlowModuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ContactFlowModule)(nil)).Elem()
}

func (o ContactFlowModuleArrayOutput) ToContactFlowModuleArrayOutput() ContactFlowModuleArrayOutput {
	return o
}

func (o ContactFlowModuleArrayOutput) ToContactFlowModuleArrayOutputWithContext(ctx context.Context) ContactFlowModuleArrayOutput {
	return o
}

func (o ContactFlowModuleArrayOutput) Index(i pulumi.IntInput) ContactFlowModuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ContactFlowModule {
		return vs[0].([]*ContactFlowModule)[vs[1].(int)]
	}).(ContactFlowModuleOutput)
}

type ContactFlowModuleMapOutput struct{ *pulumi.OutputState }

func (ContactFlowModuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ContactFlowModule)(nil)).Elem()
}

func (o ContactFlowModuleMapOutput) ToContactFlowModuleMapOutput() ContactFlowModuleMapOutput {
	return o
}

func (o ContactFlowModuleMapOutput) ToContactFlowModuleMapOutputWithContext(ctx context.Context) ContactFlowModuleMapOutput {
	return o
}

func (o ContactFlowModuleMapOutput) MapIndex(k pulumi.StringInput) ContactFlowModuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ContactFlowModule {
		return vs[0].(map[string]*ContactFlowModule)[vs[1].(string)]
	}).(ContactFlowModuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ContactFlowModuleInput)(nil)).Elem(), &ContactFlowModule{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContactFlowModuleArrayInput)(nil)).Elem(), ContactFlowModuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ContactFlowModuleMapInput)(nil)).Elem(), ContactFlowModuleMap{})
	pulumi.RegisterOutputType(ContactFlowModuleOutput{})
	pulumi.RegisterOutputType(ContactFlowModuleArrayOutput{})
	pulumi.RegisterOutputType(ContactFlowModuleMapOutput{})
}
