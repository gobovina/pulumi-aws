// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package xray

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates and manages an AWS XRay Sampling Rule.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/xray"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := xray.NewSamplingRule(ctx, "example", &xray.SamplingRuleArgs{
//				Attributes: pulumi.StringMap{
//					"Hello": pulumi.String("Tris"),
//				},
//				FixedRate:     pulumi.Float64(0.05),
//				Host:          pulumi.String("*"),
//				HttpMethod:    pulumi.String("*"),
//				Priority:      pulumi.Int(9999),
//				ReservoirSize: pulumi.Int(1),
//				ResourceArn:   pulumi.String("*"),
//				RuleName:      pulumi.String("example"),
//				ServiceName:   pulumi.String("*"),
//				ServiceType:   pulumi.String("*"),
//				UrlPath:       pulumi.String("*"),
//				Version:       pulumi.Int(1),
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
// Using `pulumi import`, import XRay Sampling Rules using the name. For example:
//
// ```sh
//
//	$ pulumi import aws:xray/samplingRule:SamplingRule example example
//
// ```
type SamplingRule struct {
	pulumi.CustomResourceState

	// The ARN of the sampling rule.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// Matches attributes derived from the request.
	Attributes pulumi.StringMapOutput `pulumi:"attributes"`
	// The percentage of matching requests to instrument, after the reservoir is exhausted.
	FixedRate pulumi.Float64Output `pulumi:"fixedRate"`
	// Matches the hostname from a request URL.
	Host pulumi.StringOutput `pulumi:"host"`
	// Matches the HTTP method of a request.
	HttpMethod pulumi.StringOutput `pulumi:"httpMethod"`
	// The priority of the sampling rule.
	Priority pulumi.IntOutput `pulumi:"priority"`
	// A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
	ReservoirSize pulumi.IntOutput `pulumi:"reservoirSize"`
	// Matches the ARN of the AWS resource on which the service runs.
	ResourceArn pulumi.StringOutput `pulumi:"resourceArn"`
	// The name of the sampling rule.
	RuleName pulumi.StringPtrOutput `pulumi:"ruleName"`
	// Matches the `name` that the service uses to identify itself in segments.
	ServiceName pulumi.StringOutput `pulumi:"serviceName"`
	// Matches the `origin` that the service uses to identify its type in segments.
	ServiceType pulumi.StringOutput `pulumi:"serviceType"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Matches the path from a request URL.
	UrlPath pulumi.StringOutput `pulumi:"urlPath"`
	// The version of the sampling rule format (`1` )
	Version pulumi.IntOutput `pulumi:"version"`
}

// NewSamplingRule registers a new resource with the given unique name, arguments, and options.
func NewSamplingRule(ctx *pulumi.Context,
	name string, args *SamplingRuleArgs, opts ...pulumi.ResourceOption) (*SamplingRule, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.FixedRate == nil {
		return nil, errors.New("invalid value for required argument 'FixedRate'")
	}
	if args.Host == nil {
		return nil, errors.New("invalid value for required argument 'Host'")
	}
	if args.HttpMethod == nil {
		return nil, errors.New("invalid value for required argument 'HttpMethod'")
	}
	if args.Priority == nil {
		return nil, errors.New("invalid value for required argument 'Priority'")
	}
	if args.ReservoirSize == nil {
		return nil, errors.New("invalid value for required argument 'ReservoirSize'")
	}
	if args.ResourceArn == nil {
		return nil, errors.New("invalid value for required argument 'ResourceArn'")
	}
	if args.ServiceName == nil {
		return nil, errors.New("invalid value for required argument 'ServiceName'")
	}
	if args.ServiceType == nil {
		return nil, errors.New("invalid value for required argument 'ServiceType'")
	}
	if args.UrlPath == nil {
		return nil, errors.New("invalid value for required argument 'UrlPath'")
	}
	if args.Version == nil {
		return nil, errors.New("invalid value for required argument 'Version'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource SamplingRule
	err := ctx.RegisterResource("aws:xray/samplingRule:SamplingRule", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetSamplingRule gets an existing SamplingRule resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetSamplingRule(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *SamplingRuleState, opts ...pulumi.ResourceOption) (*SamplingRule, error) {
	var resource SamplingRule
	err := ctx.ReadResource("aws:xray/samplingRule:SamplingRule", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering SamplingRule resources.
type samplingRuleState struct {
	// The ARN of the sampling rule.
	Arn *string `pulumi:"arn"`
	// Matches attributes derived from the request.
	Attributes map[string]string `pulumi:"attributes"`
	// The percentage of matching requests to instrument, after the reservoir is exhausted.
	FixedRate *float64 `pulumi:"fixedRate"`
	// Matches the hostname from a request URL.
	Host *string `pulumi:"host"`
	// Matches the HTTP method of a request.
	HttpMethod *string `pulumi:"httpMethod"`
	// The priority of the sampling rule.
	Priority *int `pulumi:"priority"`
	// A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
	ReservoirSize *int `pulumi:"reservoirSize"`
	// Matches the ARN of the AWS resource on which the service runs.
	ResourceArn *string `pulumi:"resourceArn"`
	// The name of the sampling rule.
	RuleName *string `pulumi:"ruleName"`
	// Matches the `name` that the service uses to identify itself in segments.
	ServiceName *string `pulumi:"serviceName"`
	// Matches the `origin` that the service uses to identify its type in segments.
	ServiceType *string `pulumi:"serviceType"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Matches the path from a request URL.
	UrlPath *string `pulumi:"urlPath"`
	// The version of the sampling rule format (`1` )
	Version *int `pulumi:"version"`
}

type SamplingRuleState struct {
	// The ARN of the sampling rule.
	Arn pulumi.StringPtrInput
	// Matches attributes derived from the request.
	Attributes pulumi.StringMapInput
	// The percentage of matching requests to instrument, after the reservoir is exhausted.
	FixedRate pulumi.Float64PtrInput
	// Matches the hostname from a request URL.
	Host pulumi.StringPtrInput
	// Matches the HTTP method of a request.
	HttpMethod pulumi.StringPtrInput
	// The priority of the sampling rule.
	Priority pulumi.IntPtrInput
	// A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
	ReservoirSize pulumi.IntPtrInput
	// Matches the ARN of the AWS resource on which the service runs.
	ResourceArn pulumi.StringPtrInput
	// The name of the sampling rule.
	RuleName pulumi.StringPtrInput
	// Matches the `name` that the service uses to identify itself in segments.
	ServiceName pulumi.StringPtrInput
	// Matches the `origin` that the service uses to identify its type in segments.
	ServiceType pulumi.StringPtrInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// Matches the path from a request URL.
	UrlPath pulumi.StringPtrInput
	// The version of the sampling rule format (`1` )
	Version pulumi.IntPtrInput
}

func (SamplingRuleState) ElementType() reflect.Type {
	return reflect.TypeOf((*samplingRuleState)(nil)).Elem()
}

type samplingRuleArgs struct {
	// Matches attributes derived from the request.
	Attributes map[string]string `pulumi:"attributes"`
	// The percentage of matching requests to instrument, after the reservoir is exhausted.
	FixedRate float64 `pulumi:"fixedRate"`
	// Matches the hostname from a request URL.
	Host string `pulumi:"host"`
	// Matches the HTTP method of a request.
	HttpMethod string `pulumi:"httpMethod"`
	// The priority of the sampling rule.
	Priority int `pulumi:"priority"`
	// A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
	ReservoirSize int `pulumi:"reservoirSize"`
	// Matches the ARN of the AWS resource on which the service runs.
	ResourceArn string `pulumi:"resourceArn"`
	// The name of the sampling rule.
	RuleName *string `pulumi:"ruleName"`
	// Matches the `name` that the service uses to identify itself in segments.
	ServiceName string `pulumi:"serviceName"`
	// Matches the `origin` that the service uses to identify its type in segments.
	ServiceType string `pulumi:"serviceType"`
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
	Tags map[string]string `pulumi:"tags"`
	// Matches the path from a request URL.
	UrlPath string `pulumi:"urlPath"`
	// The version of the sampling rule format (`1` )
	Version int `pulumi:"version"`
}

// The set of arguments for constructing a SamplingRule resource.
type SamplingRuleArgs struct {
	// Matches attributes derived from the request.
	Attributes pulumi.StringMapInput
	// The percentage of matching requests to instrument, after the reservoir is exhausted.
	FixedRate pulumi.Float64Input
	// Matches the hostname from a request URL.
	Host pulumi.StringInput
	// Matches the HTTP method of a request.
	HttpMethod pulumi.StringInput
	// The priority of the sampling rule.
	Priority pulumi.IntInput
	// A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
	ReservoirSize pulumi.IntInput
	// Matches the ARN of the AWS resource on which the service runs.
	ResourceArn pulumi.StringInput
	// The name of the sampling rule.
	RuleName pulumi.StringPtrInput
	// Matches the `name` that the service uses to identify itself in segments.
	ServiceName pulumi.StringInput
	// Matches the `origin` that the service uses to identify its type in segments.
	ServiceType pulumi.StringInput
	// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
	Tags pulumi.StringMapInput
	// Matches the path from a request URL.
	UrlPath pulumi.StringInput
	// The version of the sampling rule format (`1` )
	Version pulumi.IntInput
}

func (SamplingRuleArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*samplingRuleArgs)(nil)).Elem()
}

type SamplingRuleInput interface {
	pulumi.Input

	ToSamplingRuleOutput() SamplingRuleOutput
	ToSamplingRuleOutputWithContext(ctx context.Context) SamplingRuleOutput
}

func (*SamplingRule) ElementType() reflect.Type {
	return reflect.TypeOf((**SamplingRule)(nil)).Elem()
}

func (i *SamplingRule) ToSamplingRuleOutput() SamplingRuleOutput {
	return i.ToSamplingRuleOutputWithContext(context.Background())
}

func (i *SamplingRule) ToSamplingRuleOutputWithContext(ctx context.Context) SamplingRuleOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamplingRuleOutput)
}

// SamplingRuleArrayInput is an input type that accepts SamplingRuleArray and SamplingRuleArrayOutput values.
// You can construct a concrete instance of `SamplingRuleArrayInput` via:
//
//	SamplingRuleArray{ SamplingRuleArgs{...} }
type SamplingRuleArrayInput interface {
	pulumi.Input

	ToSamplingRuleArrayOutput() SamplingRuleArrayOutput
	ToSamplingRuleArrayOutputWithContext(context.Context) SamplingRuleArrayOutput
}

type SamplingRuleArray []SamplingRuleInput

func (SamplingRuleArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SamplingRule)(nil)).Elem()
}

func (i SamplingRuleArray) ToSamplingRuleArrayOutput() SamplingRuleArrayOutput {
	return i.ToSamplingRuleArrayOutputWithContext(context.Background())
}

func (i SamplingRuleArray) ToSamplingRuleArrayOutputWithContext(ctx context.Context) SamplingRuleArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamplingRuleArrayOutput)
}

// SamplingRuleMapInput is an input type that accepts SamplingRuleMap and SamplingRuleMapOutput values.
// You can construct a concrete instance of `SamplingRuleMapInput` via:
//
//	SamplingRuleMap{ "key": SamplingRuleArgs{...} }
type SamplingRuleMapInput interface {
	pulumi.Input

	ToSamplingRuleMapOutput() SamplingRuleMapOutput
	ToSamplingRuleMapOutputWithContext(context.Context) SamplingRuleMapOutput
}

type SamplingRuleMap map[string]SamplingRuleInput

func (SamplingRuleMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SamplingRule)(nil)).Elem()
}

func (i SamplingRuleMap) ToSamplingRuleMapOutput() SamplingRuleMapOutput {
	return i.ToSamplingRuleMapOutputWithContext(context.Background())
}

func (i SamplingRuleMap) ToSamplingRuleMapOutputWithContext(ctx context.Context) SamplingRuleMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(SamplingRuleMapOutput)
}

type SamplingRuleOutput struct{ *pulumi.OutputState }

func (SamplingRuleOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**SamplingRule)(nil)).Elem()
}

func (o SamplingRuleOutput) ToSamplingRuleOutput() SamplingRuleOutput {
	return o
}

func (o SamplingRuleOutput) ToSamplingRuleOutputWithContext(ctx context.Context) SamplingRuleOutput {
	return o
}

// The ARN of the sampling rule.
func (o SamplingRuleOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// Matches attributes derived from the request.
func (o SamplingRuleOutput) Attributes() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.StringMapOutput { return v.Attributes }).(pulumi.StringMapOutput)
}

// The percentage of matching requests to instrument, after the reservoir is exhausted.
func (o SamplingRuleOutput) FixedRate() pulumi.Float64Output {
	return o.ApplyT(func(v *SamplingRule) pulumi.Float64Output { return v.FixedRate }).(pulumi.Float64Output)
}

// Matches the hostname from a request URL.
func (o SamplingRuleOutput) Host() pulumi.StringOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.StringOutput { return v.Host }).(pulumi.StringOutput)
}

// Matches the HTTP method of a request.
func (o SamplingRuleOutput) HttpMethod() pulumi.StringOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.StringOutput { return v.HttpMethod }).(pulumi.StringOutput)
}

// The priority of the sampling rule.
func (o SamplingRuleOutput) Priority() pulumi.IntOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.IntOutput { return v.Priority }).(pulumi.IntOutput)
}

// A fixed number of matching requests to instrument per second, prior to applying the fixed rate. The reservoir is not used directly by services, but applies to all services using the rule collectively.
func (o SamplingRuleOutput) ReservoirSize() pulumi.IntOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.IntOutput { return v.ReservoirSize }).(pulumi.IntOutput)
}

// Matches the ARN of the AWS resource on which the service runs.
func (o SamplingRuleOutput) ResourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.StringOutput { return v.ResourceArn }).(pulumi.StringOutput)
}

// The name of the sampling rule.
func (o SamplingRuleOutput) RuleName() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.StringPtrOutput { return v.RuleName }).(pulumi.StringPtrOutput)
}

// Matches the `name` that the service uses to identify itself in segments.
func (o SamplingRuleOutput) ServiceName() pulumi.StringOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.StringOutput { return v.ServiceName }).(pulumi.StringOutput)
}

// Matches the `origin` that the service uses to identify its type in segments.
func (o SamplingRuleOutput) ServiceType() pulumi.StringOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.StringOutput { return v.ServiceType }).(pulumi.StringOutput)
}

// Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level
func (o SamplingRuleOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o SamplingRuleOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Matches the path from a request URL.
func (o SamplingRuleOutput) UrlPath() pulumi.StringOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.StringOutput { return v.UrlPath }).(pulumi.StringOutput)
}

// The version of the sampling rule format (`1` )
func (o SamplingRuleOutput) Version() pulumi.IntOutput {
	return o.ApplyT(func(v *SamplingRule) pulumi.IntOutput { return v.Version }).(pulumi.IntOutput)
}

type SamplingRuleArrayOutput struct{ *pulumi.OutputState }

func (SamplingRuleArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*SamplingRule)(nil)).Elem()
}

func (o SamplingRuleArrayOutput) ToSamplingRuleArrayOutput() SamplingRuleArrayOutput {
	return o
}

func (o SamplingRuleArrayOutput) ToSamplingRuleArrayOutputWithContext(ctx context.Context) SamplingRuleArrayOutput {
	return o
}

func (o SamplingRuleArrayOutput) Index(i pulumi.IntInput) SamplingRuleOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *SamplingRule {
		return vs[0].([]*SamplingRule)[vs[1].(int)]
	}).(SamplingRuleOutput)
}

type SamplingRuleMapOutput struct{ *pulumi.OutputState }

func (SamplingRuleMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*SamplingRule)(nil)).Elem()
}

func (o SamplingRuleMapOutput) ToSamplingRuleMapOutput() SamplingRuleMapOutput {
	return o
}

func (o SamplingRuleMapOutput) ToSamplingRuleMapOutputWithContext(ctx context.Context) SamplingRuleMapOutput {
	return o
}

func (o SamplingRuleMapOutput) MapIndex(k pulumi.StringInput) SamplingRuleOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *SamplingRule {
		return vs[0].(map[string]*SamplingRule)[vs[1].(string)]
	}).(SamplingRuleOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*SamplingRuleInput)(nil)).Elem(), &SamplingRule{})
	pulumi.RegisterInputType(reflect.TypeOf((*SamplingRuleArrayInput)(nil)).Elem(), SamplingRuleArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*SamplingRuleMapInput)(nil)).Elem(), SamplingRuleMap{})
	pulumi.RegisterOutputType(SamplingRuleOutput{})
	pulumi.RegisterOutputType(SamplingRuleArrayOutput{})
	pulumi.RegisterOutputType(SamplingRuleMapOutput{})
}
