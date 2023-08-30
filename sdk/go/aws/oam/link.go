// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package oam

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS CloudWatch Observability Access Manager Link.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/oam"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := oam.NewLink(ctx, "example", &oam.LinkArgs{
//				LabelTemplate: pulumi.String("$AccountName"),
//				ResourceTypes: pulumi.StringArray{
//					pulumi.String("AWS::CloudWatch::Metric"),
//				},
//				SinkIdentifier: pulumi.Any(aws_oam_sink.Test.Id),
//				Tags: pulumi.StringMap{
//					"Env": pulumi.String("prod"),
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
// Using `pulumi import`, import CloudWatch Observability Access Manager Link using the `arn`. For example:
//
// ```sh
//
//	$ pulumi import aws:oam/link:Link example arn:aws:oam:us-west-2:123456789012:link/link-id
//
// ```
type Link struct {
	pulumi.CustomResourceState

	// ARN of the link.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Label that is assigned to this link.
	Label pulumi.StringOutput `pulumi:"label"`
	// Human-readable name to use to identify this source account when you are viewing data from it in the monitoring account.
	LabelTemplate pulumi.StringOutput `pulumi:"labelTemplate"`
	// ID string that AWS generated as part of the link ARN.
	LinkId pulumi.StringOutput `pulumi:"linkId"`
	// Types of data that the source account shares with the monitoring account.
	ResourceTypes pulumi.StringArrayOutput `pulumi:"resourceTypes"`
	// ARN of the sink that is used for this link.
	SinkArn pulumi.StringOutput `pulumi:"sinkArn"`
	// Identifier of the sink to use to create this link.
	//
	// The following arguments are optional:
	SinkIdentifier pulumi.StringOutput `pulumi:"sinkIdentifier"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    pulumi.StringMapOutput `pulumi:"tags"`
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewLink registers a new resource with the given unique name, arguments, and options.
func NewLink(ctx *pulumi.Context,
	name string, args *LinkArgs, opts ...pulumi.ResourceOption) (*Link, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LabelTemplate == nil {
		return nil, errors.New("invalid value for required argument 'LabelTemplate'")
	}
	if args.ResourceTypes == nil {
		return nil, errors.New("invalid value for required argument 'ResourceTypes'")
	}
	if args.SinkIdentifier == nil {
		return nil, errors.New("invalid value for required argument 'SinkIdentifier'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Link
	err := ctx.RegisterResource("aws:oam/link:Link", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLink gets an existing Link resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLink(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LinkState, opts ...pulumi.ResourceOption) (*Link, error) {
	var resource Link
	err := ctx.ReadResource("aws:oam/link:Link", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Link resources.
type linkState struct {
	// ARN of the link.
	Arn *string `pulumi:"arn"`
	// Label that is assigned to this link.
	Label *string `pulumi:"label"`
	// Human-readable name to use to identify this source account when you are viewing data from it in the monitoring account.
	LabelTemplate *string `pulumi:"labelTemplate"`
	// ID string that AWS generated as part of the link ARN.
	LinkId *string `pulumi:"linkId"`
	// Types of data that the source account shares with the monitoring account.
	ResourceTypes []string `pulumi:"resourceTypes"`
	// ARN of the sink that is used for this link.
	SinkArn *string `pulumi:"sinkArn"`
	// Identifier of the sink to use to create this link.
	//
	// The following arguments are optional:
	SinkIdentifier *string `pulumi:"sinkIdentifier"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type LinkState struct {
	// ARN of the link.
	Arn pulumi.StringPtrInput
	// Label that is assigned to this link.
	Label pulumi.StringPtrInput
	// Human-readable name to use to identify this source account when you are viewing data from it in the monitoring account.
	LabelTemplate pulumi.StringPtrInput
	// ID string that AWS generated as part of the link ARN.
	LinkId pulumi.StringPtrInput
	// Types of data that the source account shares with the monitoring account.
	ResourceTypes pulumi.StringArrayInput
	// ARN of the sink that is used for this link.
	SinkArn pulumi.StringPtrInput
	// Identifier of the sink to use to create this link.
	//
	// The following arguments are optional:
	SinkIdentifier pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
}

func (LinkState) ElementType() reflect.Type {
	return reflect.TypeOf((*linkState)(nil)).Elem()
}

type linkArgs struct {
	// Human-readable name to use to identify this source account when you are viewing data from it in the monitoring account.
	LabelTemplate string `pulumi:"labelTemplate"`
	// Types of data that the source account shares with the monitoring account.
	ResourceTypes []string `pulumi:"resourceTypes"`
	// Identifier of the sink to use to create this link.
	//
	// The following arguments are optional:
	SinkIdentifier string `pulumi:"sinkIdentifier"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Link resource.
type LinkArgs struct {
	// Human-readable name to use to identify this source account when you are viewing data from it in the monitoring account.
	LabelTemplate pulumi.StringInput
	// Types of data that the source account shares with the monitoring account.
	ResourceTypes pulumi.StringArrayInput
	// Identifier of the sink to use to create this link.
	//
	// The following arguments are optional:
	SinkIdentifier pulumi.StringInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (LinkArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*linkArgs)(nil)).Elem()
}

type LinkInput interface {
	pulumi.Input

	ToLinkOutput() LinkOutput
	ToLinkOutputWithContext(ctx context.Context) LinkOutput
}

func (*Link) ElementType() reflect.Type {
	return reflect.TypeOf((**Link)(nil)).Elem()
}

func (i *Link) ToLinkOutput() LinkOutput {
	return i.ToLinkOutputWithContext(context.Background())
}

func (i *Link) ToLinkOutputWithContext(ctx context.Context) LinkOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkOutput)
}

// LinkArrayInput is an input type that accepts LinkArray and LinkArrayOutput values.
// You can construct a concrete instance of `LinkArrayInput` via:
//
//	LinkArray{ LinkArgs{...} }
type LinkArrayInput interface {
	pulumi.Input

	ToLinkArrayOutput() LinkArrayOutput
	ToLinkArrayOutputWithContext(context.Context) LinkArrayOutput
}

type LinkArray []LinkInput

func (LinkArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Link)(nil)).Elem()
}

func (i LinkArray) ToLinkArrayOutput() LinkArrayOutput {
	return i.ToLinkArrayOutputWithContext(context.Background())
}

func (i LinkArray) ToLinkArrayOutputWithContext(ctx context.Context) LinkArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkArrayOutput)
}

// LinkMapInput is an input type that accepts LinkMap and LinkMapOutput values.
// You can construct a concrete instance of `LinkMapInput` via:
//
//	LinkMap{ "key": LinkArgs{...} }
type LinkMapInput interface {
	pulumi.Input

	ToLinkMapOutput() LinkMapOutput
	ToLinkMapOutputWithContext(context.Context) LinkMapOutput
}

type LinkMap map[string]LinkInput

func (LinkMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Link)(nil)).Elem()
}

func (i LinkMap) ToLinkMapOutput() LinkMapOutput {
	return i.ToLinkMapOutputWithContext(context.Background())
}

func (i LinkMap) ToLinkMapOutputWithContext(ctx context.Context) LinkMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LinkMapOutput)
}

type LinkOutput struct{ *pulumi.OutputState }

func (LinkOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Link)(nil)).Elem()
}

func (o LinkOutput) ToLinkOutput() LinkOutput {
	return o
}

func (o LinkOutput) ToLinkOutputWithContext(ctx context.Context) LinkOutput {
	return o
}

// ARN of the link.
func (o LinkOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Link) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Label that is assigned to this link.
func (o LinkOutput) Label() pulumi.StringOutput {
	return o.ApplyT(func(v *Link) pulumi.StringOutput { return v.Label }).(pulumi.StringOutput)
}

// Human-readable name to use to identify this source account when you are viewing data from it in the monitoring account.
func (o LinkOutput) LabelTemplate() pulumi.StringOutput {
	return o.ApplyT(func(v *Link) pulumi.StringOutput { return v.LabelTemplate }).(pulumi.StringOutput)
}

// ID string that AWS generated as part of the link ARN.
func (o LinkOutput) LinkId() pulumi.StringOutput {
	return o.ApplyT(func(v *Link) pulumi.StringOutput { return v.LinkId }).(pulumi.StringOutput)
}

// Types of data that the source account shares with the monitoring account.
func (o LinkOutput) ResourceTypes() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Link) pulumi.StringArrayOutput { return v.ResourceTypes }).(pulumi.StringArrayOutput)
}

// ARN of the sink that is used for this link.
func (o LinkOutput) SinkArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Link) pulumi.StringOutput { return v.SinkArn }).(pulumi.StringOutput)
}

// Identifier of the sink to use to create this link.
//
// The following arguments are optional:
func (o LinkOutput) SinkIdentifier() pulumi.StringOutput {
	return o.ApplyT(func(v *Link) pulumi.StringOutput { return v.SinkIdentifier }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o LinkOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Link) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

func (o LinkOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Link) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type LinkArrayOutput struct{ *pulumi.OutputState }

func (LinkArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Link)(nil)).Elem()
}

func (o LinkArrayOutput) ToLinkArrayOutput() LinkArrayOutput {
	return o
}

func (o LinkArrayOutput) ToLinkArrayOutputWithContext(ctx context.Context) LinkArrayOutput {
	return o
}

func (o LinkArrayOutput) Index(i pulumi.IntInput) LinkOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Link {
		return vs[0].([]*Link)[vs[1].(int)]
	}).(LinkOutput)
}

type LinkMapOutput struct{ *pulumi.OutputState }

func (LinkMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Link)(nil)).Elem()
}

func (o LinkMapOutput) ToLinkMapOutput() LinkMapOutput {
	return o
}

func (o LinkMapOutput) ToLinkMapOutputWithContext(ctx context.Context) LinkMapOutput {
	return o
}

func (o LinkMapOutput) MapIndex(k pulumi.StringInput) LinkOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Link {
		return vs[0].(map[string]*Link)[vs[1].(string)]
	}).(LinkOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LinkInput)(nil)).Elem(), &Link{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkArrayInput)(nil)).Elem(), LinkArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LinkMapInput)(nil)).Elem(), LinkMap{})
	pulumi.RegisterOutputType(LinkOutput{})
	pulumi.RegisterOutputType(LinkArrayOutput{})
	pulumi.RegisterOutputType(LinkMapOutput{})
}
