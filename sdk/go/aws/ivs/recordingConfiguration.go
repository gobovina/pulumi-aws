// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package ivs

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS IVS (Interactive Video) Recording Configuration.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/ivs"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := ivs.NewRecordingConfiguration(ctx, "example", &ivs.RecordingConfigurationArgs{
//				DestinationConfiguration: &ivs.RecordingConfigurationDestinationConfigurationArgs{
//					S3: &ivs.RecordingConfigurationDestinationConfigurationS3Args{
//						BucketName: pulumi.String("ivs-stream-archive"),
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
// Using `pulumi import`, import IVS (Interactive Video) Recording Configuration using the ARN. For example:
//
// ```sh
//
//	$ pulumi import aws:ivs/recordingConfiguration:RecordingConfiguration example arn:aws:ivs:us-west-2:326937407773:recording-configuration/KAk1sHBl2L47
//
// ```
type RecordingConfiguration struct {
	pulumi.CustomResourceState

	// ARN of the Recording Configuration.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Object containing destination configuration for where recorded video will be stored.
	DestinationConfiguration RecordingConfigurationDestinationConfigurationOutput `pulumi:"destinationConfiguration"`
	// Recording Configuration name.
	Name pulumi.StringOutput `pulumi:"name"`
	// If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be considered a single broadcast and merged together.
	RecordingReconnectWindowSeconds pulumi.IntOutput `pulumi:"recordingReconnectWindowSeconds"`
	// The current state of the Recording Configuration.
	State pulumi.StringOutput `pulumi:"state"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Object containing information to enable/disable the recording of thumbnails for a live session and modify the interval at which thumbnails are generated for the live session.
	ThumbnailConfiguration RecordingConfigurationThumbnailConfigurationOutput `pulumi:"thumbnailConfiguration"`
}

// NewRecordingConfiguration registers a new resource with the given unique name, arguments, and options.
func NewRecordingConfiguration(ctx *pulumi.Context,
	name string, args *RecordingConfigurationArgs, opts ...pulumi.ResourceOption) (*RecordingConfiguration, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DestinationConfiguration == nil {
		return nil, errors.New("invalid value for required argument 'DestinationConfiguration'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource RecordingConfiguration
	err := ctx.RegisterResource("aws:ivs/recordingConfiguration:RecordingConfiguration", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetRecordingConfiguration gets an existing RecordingConfiguration resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetRecordingConfiguration(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *RecordingConfigurationState, opts ...pulumi.ResourceOption) (*RecordingConfiguration, error) {
	var resource RecordingConfiguration
	err := ctx.ReadResource("aws:ivs/recordingConfiguration:RecordingConfiguration", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering RecordingConfiguration resources.
type recordingConfigurationState struct {
	// ARN of the Recording Configuration.
	Arn *string `pulumi:"arn"`
	// Object containing destination configuration for where recorded video will be stored.
	DestinationConfiguration *RecordingConfigurationDestinationConfiguration `pulumi:"destinationConfiguration"`
	// Recording Configuration name.
	Name *string `pulumi:"name"`
	// If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be considered a single broadcast and merged together.
	RecordingReconnectWindowSeconds *int `pulumi:"recordingReconnectWindowSeconds"`
	// The current state of the Recording Configuration.
	State *string `pulumi:"state"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Object containing information to enable/disable the recording of thumbnails for a live session and modify the interval at which thumbnails are generated for the live session.
	ThumbnailConfiguration *RecordingConfigurationThumbnailConfiguration `pulumi:"thumbnailConfiguration"`
}

type RecordingConfigurationState struct {
	// ARN of the Recording Configuration.
	Arn pulumi.StringPtrInput
	// Object containing destination configuration for where recorded video will be stored.
	DestinationConfiguration RecordingConfigurationDestinationConfigurationPtrInput
	// Recording Configuration name.
	Name pulumi.StringPtrInput
	// If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be considered a single broadcast and merged together.
	RecordingReconnectWindowSeconds pulumi.IntPtrInput
	// The current state of the Recording Configuration.
	State pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Object containing information to enable/disable the recording of thumbnails for a live session and modify the interval at which thumbnails are generated for the live session.
	ThumbnailConfiguration RecordingConfigurationThumbnailConfigurationPtrInput
}

func (RecordingConfigurationState) ElementType() reflect.Type {
	return reflect.TypeOf((*recordingConfigurationState)(nil)).Elem()
}

type recordingConfigurationArgs struct {
	// Object containing destination configuration for where recorded video will be stored.
	DestinationConfiguration RecordingConfigurationDestinationConfiguration `pulumi:"destinationConfiguration"`
	// Recording Configuration name.
	Name *string `pulumi:"name"`
	// If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be considered a single broadcast and merged together.
	RecordingReconnectWindowSeconds *int `pulumi:"recordingReconnectWindowSeconds"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Object containing information to enable/disable the recording of thumbnails for a live session and modify the interval at which thumbnails are generated for the live session.
	ThumbnailConfiguration *RecordingConfigurationThumbnailConfiguration `pulumi:"thumbnailConfiguration"`
}

// The set of arguments for constructing a RecordingConfiguration resource.
type RecordingConfigurationArgs struct {
	// Object containing destination configuration for where recorded video will be stored.
	DestinationConfiguration RecordingConfigurationDestinationConfigurationInput
	// Recording Configuration name.
	Name pulumi.StringPtrInput
	// If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be considered a single broadcast and merged together.
	RecordingReconnectWindowSeconds pulumi.IntPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Object containing information to enable/disable the recording of thumbnails for a live session and modify the interval at which thumbnails are generated for the live session.
	ThumbnailConfiguration RecordingConfigurationThumbnailConfigurationPtrInput
}

func (RecordingConfigurationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*recordingConfigurationArgs)(nil)).Elem()
}

type RecordingConfigurationInput interface {
	pulumi.Input

	ToRecordingConfigurationOutput() RecordingConfigurationOutput
	ToRecordingConfigurationOutputWithContext(ctx context.Context) RecordingConfigurationOutput
}

func (*RecordingConfiguration) ElementType() reflect.Type {
	return reflect.TypeOf((**RecordingConfiguration)(nil)).Elem()
}

func (i *RecordingConfiguration) ToRecordingConfigurationOutput() RecordingConfigurationOutput {
	return i.ToRecordingConfigurationOutputWithContext(context.Background())
}

func (i *RecordingConfiguration) ToRecordingConfigurationOutputWithContext(ctx context.Context) RecordingConfigurationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordingConfigurationOutput)
}

// RecordingConfigurationArrayInput is an input type that accepts RecordingConfigurationArray and RecordingConfigurationArrayOutput values.
// You can construct a concrete instance of `RecordingConfigurationArrayInput` via:
//
//	RecordingConfigurationArray{ RecordingConfigurationArgs{...} }
type RecordingConfigurationArrayInput interface {
	pulumi.Input

	ToRecordingConfigurationArrayOutput() RecordingConfigurationArrayOutput
	ToRecordingConfigurationArrayOutputWithContext(context.Context) RecordingConfigurationArrayOutput
}

type RecordingConfigurationArray []RecordingConfigurationInput

func (RecordingConfigurationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RecordingConfiguration)(nil)).Elem()
}

func (i RecordingConfigurationArray) ToRecordingConfigurationArrayOutput() RecordingConfigurationArrayOutput {
	return i.ToRecordingConfigurationArrayOutputWithContext(context.Background())
}

func (i RecordingConfigurationArray) ToRecordingConfigurationArrayOutputWithContext(ctx context.Context) RecordingConfigurationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordingConfigurationArrayOutput)
}

// RecordingConfigurationMapInput is an input type that accepts RecordingConfigurationMap and RecordingConfigurationMapOutput values.
// You can construct a concrete instance of `RecordingConfigurationMapInput` via:
//
//	RecordingConfigurationMap{ "key": RecordingConfigurationArgs{...} }
type RecordingConfigurationMapInput interface {
	pulumi.Input

	ToRecordingConfigurationMapOutput() RecordingConfigurationMapOutput
	ToRecordingConfigurationMapOutputWithContext(context.Context) RecordingConfigurationMapOutput
}

type RecordingConfigurationMap map[string]RecordingConfigurationInput

func (RecordingConfigurationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RecordingConfiguration)(nil)).Elem()
}

func (i RecordingConfigurationMap) ToRecordingConfigurationMapOutput() RecordingConfigurationMapOutput {
	return i.ToRecordingConfigurationMapOutputWithContext(context.Background())
}

func (i RecordingConfigurationMap) ToRecordingConfigurationMapOutputWithContext(ctx context.Context) RecordingConfigurationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(RecordingConfigurationMapOutput)
}

type RecordingConfigurationOutput struct{ *pulumi.OutputState }

func (RecordingConfigurationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**RecordingConfiguration)(nil)).Elem()
}

func (o RecordingConfigurationOutput) ToRecordingConfigurationOutput() RecordingConfigurationOutput {
	return o
}

func (o RecordingConfigurationOutput) ToRecordingConfigurationOutputWithContext(ctx context.Context) RecordingConfigurationOutput {
	return o
}

// ARN of the Recording Configuration.
func (o RecordingConfigurationOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *RecordingConfiguration) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Object containing destination configuration for where recorded video will be stored.
func (o RecordingConfigurationOutput) DestinationConfiguration() RecordingConfigurationDestinationConfigurationOutput {
	return o.ApplyT(func(v *RecordingConfiguration) RecordingConfigurationDestinationConfigurationOutput {
		return v.DestinationConfiguration
	}).(RecordingConfigurationDestinationConfigurationOutput)
}

// Recording Configuration name.
func (o RecordingConfigurationOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *RecordingConfiguration) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// If a broadcast disconnects and then reconnects within the specified interval, the multiple streams will be considered a single broadcast and merged together.
func (o RecordingConfigurationOutput) RecordingReconnectWindowSeconds() pulumi.IntOutput {
	return o.ApplyT(func(v *RecordingConfiguration) pulumi.IntOutput { return v.RecordingReconnectWindowSeconds }).(pulumi.IntOutput)
}

// The current state of the Recording Configuration.
func (o RecordingConfigurationOutput) State() pulumi.StringOutput {
	return o.ApplyT(func(v *RecordingConfiguration) pulumi.StringOutput { return v.State }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o RecordingConfigurationOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *RecordingConfiguration) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o RecordingConfigurationOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *RecordingConfiguration) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Object containing information to enable/disable the recording of thumbnails for a live session and modify the interval at which thumbnails are generated for the live session.
func (o RecordingConfigurationOutput) ThumbnailConfiguration() RecordingConfigurationThumbnailConfigurationOutput {
	return o.ApplyT(func(v *RecordingConfiguration) RecordingConfigurationThumbnailConfigurationOutput {
		return v.ThumbnailConfiguration
	}).(RecordingConfigurationThumbnailConfigurationOutput)
}

type RecordingConfigurationArrayOutput struct{ *pulumi.OutputState }

func (RecordingConfigurationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*RecordingConfiguration)(nil)).Elem()
}

func (o RecordingConfigurationArrayOutput) ToRecordingConfigurationArrayOutput() RecordingConfigurationArrayOutput {
	return o
}

func (o RecordingConfigurationArrayOutput) ToRecordingConfigurationArrayOutputWithContext(ctx context.Context) RecordingConfigurationArrayOutput {
	return o
}

func (o RecordingConfigurationArrayOutput) Index(i pulumi.IntInput) RecordingConfigurationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *RecordingConfiguration {
		return vs[0].([]*RecordingConfiguration)[vs[1].(int)]
	}).(RecordingConfigurationOutput)
}

type RecordingConfigurationMapOutput struct{ *pulumi.OutputState }

func (RecordingConfigurationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*RecordingConfiguration)(nil)).Elem()
}

func (o RecordingConfigurationMapOutput) ToRecordingConfigurationMapOutput() RecordingConfigurationMapOutput {
	return o
}

func (o RecordingConfigurationMapOutput) ToRecordingConfigurationMapOutputWithContext(ctx context.Context) RecordingConfigurationMapOutput {
	return o
}

func (o RecordingConfigurationMapOutput) MapIndex(k pulumi.StringInput) RecordingConfigurationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *RecordingConfiguration {
		return vs[0].(map[string]*RecordingConfiguration)[vs[1].(string)]
	}).(RecordingConfigurationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*RecordingConfigurationInput)(nil)).Elem(), &RecordingConfiguration{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecordingConfigurationArrayInput)(nil)).Elem(), RecordingConfigurationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*RecordingConfigurationMapInput)(nil)).Elem(), RecordingConfigurationMap{})
	pulumi.RegisterOutputType(RecordingConfigurationOutput{})
	pulumi.RegisterOutputType(RecordingConfigurationArrayOutput{})
	pulumi.RegisterOutputType(RecordingConfigurationMapOutput{})
}
