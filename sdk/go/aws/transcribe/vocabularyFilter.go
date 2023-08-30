// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package transcribe

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS Transcribe VocabularyFilter.
//
// ## Example Usage
// ### Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/transcribe"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := transcribe.NewVocabularyFilter(ctx, "example", &transcribe.VocabularyFilterArgs{
//				LanguageCode: pulumi.String("en-US"),
//				Tags: pulumi.StringMap{
//					"tag1": pulumi.String("value1"),
//					"tag2": pulumi.String("value3"),
//				},
//				VocabularyFilterName: pulumi.String("example"),
//				Words: pulumi.StringArray{
//					pulumi.String("cars"),
//					pulumi.String("bucket"),
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
// Using `pulumi import`, import Transcribe VocabularyFilter using the `vocabulary_filter_name`. For example:
//
// ```sh
//
//	$ pulumi import aws:transcribe/vocabularyFilter:VocabularyFilter example example-name
//
// ```
type VocabularyFilter struct {
	pulumi.CustomResourceState

	// ARN of the VocabularyFilter.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Generated download URI.
	DownloadUri pulumi.StringOutput `pulumi:"downloadUri"`
	// The language code you selected for your vocabulary filter. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
	LanguageCode pulumi.StringOutput `pulumi:"languageCode"`
	// A map of tags to assign to the VocabularyFilter. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    pulumi.StringMapOutput `pulumi:"tags"`
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The Amazon S3 location (URI) of the text file that contains your custom VocabularyFilter. Conflicts with `words` argument.
	VocabularyFilterFileUri pulumi.StringPtrOutput `pulumi:"vocabularyFilterFileUri"`
	// The name of the VocabularyFilter.
	//
	// The following arguments are optional:
	VocabularyFilterName pulumi.StringOutput `pulumi:"vocabularyFilterName"`
	// A list of terms to include in the vocabulary. Conflicts with `vocabularyFilterFileUri` argument.
	Words pulumi.StringArrayOutput `pulumi:"words"`
}

// NewVocabularyFilter registers a new resource with the given unique name, arguments, and options.
func NewVocabularyFilter(ctx *pulumi.Context,
	name string, args *VocabularyFilterArgs, opts ...pulumi.ResourceOption) (*VocabularyFilter, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.LanguageCode == nil {
		return nil, errors.New("invalid value for required argument 'LanguageCode'")
	}
	if args.VocabularyFilterName == nil {
		return nil, errors.New("invalid value for required argument 'VocabularyFilterName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource VocabularyFilter
	err := ctx.RegisterResource("aws:transcribe/vocabularyFilter:VocabularyFilter", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetVocabularyFilter gets an existing VocabularyFilter resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetVocabularyFilter(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *VocabularyFilterState, opts ...pulumi.ResourceOption) (*VocabularyFilter, error) {
	var resource VocabularyFilter
	err := ctx.ReadResource("aws:transcribe/vocabularyFilter:VocabularyFilter", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering VocabularyFilter resources.
type vocabularyFilterState struct {
	// ARN of the VocabularyFilter.
	Arn *string `pulumi:"arn"`
	// Generated download URI.
	DownloadUri *string `pulumi:"downloadUri"`
	// The language code you selected for your vocabulary filter. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
	LanguageCode *string `pulumi:"languageCode"`
	// A map of tags to assign to the VocabularyFilter. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The Amazon S3 location (URI) of the text file that contains your custom VocabularyFilter. Conflicts with `words` argument.
	VocabularyFilterFileUri *string `pulumi:"vocabularyFilterFileUri"`
	// The name of the VocabularyFilter.
	//
	// The following arguments are optional:
	VocabularyFilterName *string `pulumi:"vocabularyFilterName"`
	// A list of terms to include in the vocabulary. Conflicts with `vocabularyFilterFileUri` argument.
	Words []string `pulumi:"words"`
}

type VocabularyFilterState struct {
	// ARN of the VocabularyFilter.
	Arn pulumi.StringPtrInput
	// Generated download URI.
	DownloadUri pulumi.StringPtrInput
	// The language code you selected for your vocabulary filter. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
	LanguageCode pulumi.StringPtrInput
	// A map of tags to assign to the VocabularyFilter. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
	// The Amazon S3 location (URI) of the text file that contains your custom VocabularyFilter. Conflicts with `words` argument.
	VocabularyFilterFileUri pulumi.StringPtrInput
	// The name of the VocabularyFilter.
	//
	// The following arguments are optional:
	VocabularyFilterName pulumi.StringPtrInput
	// A list of terms to include in the vocabulary. Conflicts with `vocabularyFilterFileUri` argument.
	Words pulumi.StringArrayInput
}

func (VocabularyFilterState) ElementType() reflect.Type {
	return reflect.TypeOf((*vocabularyFilterState)(nil)).Elem()
}

type vocabularyFilterArgs struct {
	// The language code you selected for your vocabulary filter. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
	LanguageCode string `pulumi:"languageCode"`
	// A map of tags to assign to the VocabularyFilter. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The Amazon S3 location (URI) of the text file that contains your custom VocabularyFilter. Conflicts with `words` argument.
	VocabularyFilterFileUri *string `pulumi:"vocabularyFilterFileUri"`
	// The name of the VocabularyFilter.
	//
	// The following arguments are optional:
	VocabularyFilterName string `pulumi:"vocabularyFilterName"`
	// A list of terms to include in the vocabulary. Conflicts with `vocabularyFilterFileUri` argument.
	Words []string `pulumi:"words"`
}

// The set of arguments for constructing a VocabularyFilter resource.
type VocabularyFilterArgs struct {
	// The language code you selected for your vocabulary filter. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
	LanguageCode pulumi.StringInput
	// A map of tags to assign to the VocabularyFilter. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The Amazon S3 location (URI) of the text file that contains your custom VocabularyFilter. Conflicts with `words` argument.
	VocabularyFilterFileUri pulumi.StringPtrInput
	// The name of the VocabularyFilter.
	//
	// The following arguments are optional:
	VocabularyFilterName pulumi.StringInput
	// A list of terms to include in the vocabulary. Conflicts with `vocabularyFilterFileUri` argument.
	Words pulumi.StringArrayInput
}

func (VocabularyFilterArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*vocabularyFilterArgs)(nil)).Elem()
}

type VocabularyFilterInput interface {
	pulumi.Input

	ToVocabularyFilterOutput() VocabularyFilterOutput
	ToVocabularyFilterOutputWithContext(ctx context.Context) VocabularyFilterOutput
}

func (*VocabularyFilter) ElementType() reflect.Type {
	return reflect.TypeOf((**VocabularyFilter)(nil)).Elem()
}

func (i *VocabularyFilter) ToVocabularyFilterOutput() VocabularyFilterOutput {
	return i.ToVocabularyFilterOutputWithContext(context.Background())
}

func (i *VocabularyFilter) ToVocabularyFilterOutputWithContext(ctx context.Context) VocabularyFilterOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VocabularyFilterOutput)
}

// VocabularyFilterArrayInput is an input type that accepts VocabularyFilterArray and VocabularyFilterArrayOutput values.
// You can construct a concrete instance of `VocabularyFilterArrayInput` via:
//
//	VocabularyFilterArray{ VocabularyFilterArgs{...} }
type VocabularyFilterArrayInput interface {
	pulumi.Input

	ToVocabularyFilterArrayOutput() VocabularyFilterArrayOutput
	ToVocabularyFilterArrayOutputWithContext(context.Context) VocabularyFilterArrayOutput
}

type VocabularyFilterArray []VocabularyFilterInput

func (VocabularyFilterArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VocabularyFilter)(nil)).Elem()
}

func (i VocabularyFilterArray) ToVocabularyFilterArrayOutput() VocabularyFilterArrayOutput {
	return i.ToVocabularyFilterArrayOutputWithContext(context.Background())
}

func (i VocabularyFilterArray) ToVocabularyFilterArrayOutputWithContext(ctx context.Context) VocabularyFilterArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VocabularyFilterArrayOutput)
}

// VocabularyFilterMapInput is an input type that accepts VocabularyFilterMap and VocabularyFilterMapOutput values.
// You can construct a concrete instance of `VocabularyFilterMapInput` via:
//
//	VocabularyFilterMap{ "key": VocabularyFilterArgs{...} }
type VocabularyFilterMapInput interface {
	pulumi.Input

	ToVocabularyFilterMapOutput() VocabularyFilterMapOutput
	ToVocabularyFilterMapOutputWithContext(context.Context) VocabularyFilterMapOutput
}

type VocabularyFilterMap map[string]VocabularyFilterInput

func (VocabularyFilterMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VocabularyFilter)(nil)).Elem()
}

func (i VocabularyFilterMap) ToVocabularyFilterMapOutput() VocabularyFilterMapOutput {
	return i.ToVocabularyFilterMapOutputWithContext(context.Background())
}

func (i VocabularyFilterMap) ToVocabularyFilterMapOutputWithContext(ctx context.Context) VocabularyFilterMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(VocabularyFilterMapOutput)
}

type VocabularyFilterOutput struct{ *pulumi.OutputState }

func (VocabularyFilterOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**VocabularyFilter)(nil)).Elem()
}

func (o VocabularyFilterOutput) ToVocabularyFilterOutput() VocabularyFilterOutput {
	return o
}

func (o VocabularyFilterOutput) ToVocabularyFilterOutputWithContext(ctx context.Context) VocabularyFilterOutput {
	return o
}

// ARN of the VocabularyFilter.
func (o VocabularyFilterOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *VocabularyFilter) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Generated download URI.
func (o VocabularyFilterOutput) DownloadUri() pulumi.StringOutput {
	return o.ApplyT(func(v *VocabularyFilter) pulumi.StringOutput { return v.DownloadUri }).(pulumi.StringOutput)
}

// The language code you selected for your vocabulary filter. Refer to the [supported languages](https://docs.aws.amazon.com/transcribe/latest/dg/supported-languages.html) page for accepted codes.
func (o VocabularyFilterOutput) LanguageCode() pulumi.StringOutput {
	return o.ApplyT(func(v *VocabularyFilter) pulumi.StringOutput { return v.LanguageCode }).(pulumi.StringOutput)
}

// A map of tags to assign to the VocabularyFilter. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o VocabularyFilterOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *VocabularyFilter) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

func (o VocabularyFilterOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *VocabularyFilter) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The Amazon S3 location (URI) of the text file that contains your custom VocabularyFilter. Conflicts with `words` argument.
func (o VocabularyFilterOutput) VocabularyFilterFileUri() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *VocabularyFilter) pulumi.StringPtrOutput { return v.VocabularyFilterFileUri }).(pulumi.StringPtrOutput)
}

// The name of the VocabularyFilter.
//
// The following arguments are optional:
func (o VocabularyFilterOutput) VocabularyFilterName() pulumi.StringOutput {
	return o.ApplyT(func(v *VocabularyFilter) pulumi.StringOutput { return v.VocabularyFilterName }).(pulumi.StringOutput)
}

// A list of terms to include in the vocabulary. Conflicts with `vocabularyFilterFileUri` argument.
func (o VocabularyFilterOutput) Words() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *VocabularyFilter) pulumi.StringArrayOutput { return v.Words }).(pulumi.StringArrayOutput)
}

type VocabularyFilterArrayOutput struct{ *pulumi.OutputState }

func (VocabularyFilterArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*VocabularyFilter)(nil)).Elem()
}

func (o VocabularyFilterArrayOutput) ToVocabularyFilterArrayOutput() VocabularyFilterArrayOutput {
	return o
}

func (o VocabularyFilterArrayOutput) ToVocabularyFilterArrayOutputWithContext(ctx context.Context) VocabularyFilterArrayOutput {
	return o
}

func (o VocabularyFilterArrayOutput) Index(i pulumi.IntInput) VocabularyFilterOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *VocabularyFilter {
		return vs[0].([]*VocabularyFilter)[vs[1].(int)]
	}).(VocabularyFilterOutput)
}

type VocabularyFilterMapOutput struct{ *pulumi.OutputState }

func (VocabularyFilterMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*VocabularyFilter)(nil)).Elem()
}

func (o VocabularyFilterMapOutput) ToVocabularyFilterMapOutput() VocabularyFilterMapOutput {
	return o
}

func (o VocabularyFilterMapOutput) ToVocabularyFilterMapOutputWithContext(ctx context.Context) VocabularyFilterMapOutput {
	return o
}

func (o VocabularyFilterMapOutput) MapIndex(k pulumi.StringInput) VocabularyFilterOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *VocabularyFilter {
		return vs[0].(map[string]*VocabularyFilter)[vs[1].(string)]
	}).(VocabularyFilterOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*VocabularyFilterInput)(nil)).Elem(), &VocabularyFilter{})
	pulumi.RegisterInputType(reflect.TypeOf((*VocabularyFilterArrayInput)(nil)).Elem(), VocabularyFilterArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*VocabularyFilterMapInput)(nil)).Elem(), VocabularyFilterMap{})
	pulumi.RegisterOutputType(VocabularyFilterOutput{})
	pulumi.RegisterOutputType(VocabularyFilterArrayOutput{})
	pulumi.RegisterOutputType(VocabularyFilterMapOutput{})
}
