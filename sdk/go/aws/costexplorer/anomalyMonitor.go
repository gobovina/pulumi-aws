// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package costexplorer

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a CE Anomaly Monitor.
//
// ## Example Usage
//
// There are two main types of a Cost Anomaly Monitor: `DIMENSIONAL` and `CUSTOM`.
// ### Dimensional Example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/costexplorer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := costexplorer.NewAnomalyMonitor(ctx, "serviceMonitor", &costexplorer.AnomalyMonitorArgs{
//				MonitorDimension: pulumi.String("SERVICE"),
//				MonitorType:      pulumi.String("DIMENSIONAL"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Custom Example
//
// ```go
// package main
//
// import (
//
//	"encoding/json"
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/costexplorer"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"And":            nil,
//				"CostCategories": nil,
//				"Dimensions":     nil,
//				"Not":            nil,
//				"Or":             nil,
//				"Tags": map[string]interface{}{
//					"Key":          "CostCenter",
//					"MatchOptions": nil,
//					"Values": []string{
//						"10000",
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			_, err = costexplorer.NewAnomalyMonitor(ctx, "test", &costexplorer.AnomalyMonitorArgs{
//				MonitorType:          pulumi.String("CUSTOM"),
//				MonitorSpecification: pulumi.String(json0),
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
// Using `pulumi import`, import `aws_ce_anomaly_monitor` using the `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:costexplorer/anomalyMonitor:AnomalyMonitor example costAnomalyMonitorARN
//
// ```
type AnomalyMonitor struct {
	pulumi.CustomResourceState

	// ARN of the anomaly monitor.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The dimensions to evaluate. Valid values: `SERVICE`.
	MonitorDimension pulumi.StringPtrOutput `pulumi:"monitorDimension"`
	// A valid JSON representation for the [Expression](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html) object.
	MonitorSpecification pulumi.StringPtrOutput `pulumi:"monitorSpecification"`
	// The possible type values. Valid values: `DIMENSIONAL` | `CUSTOM`.
	MonitorType pulumi.StringOutput `pulumi:"monitorType"`
	// The name of the monitor.
	Name pulumi.StringOutput `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewAnomalyMonitor registers a new resource with the given unique name, arguments, and options.
func NewAnomalyMonitor(ctx *pulumi.Context,
	name string, args *AnomalyMonitorArgs, opts ...pulumi.ResourceOption) (*AnomalyMonitor, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.MonitorType == nil {
		return nil, errors.New("invalid value for required argument 'MonitorType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource AnomalyMonitor
	err := ctx.RegisterResource("aws:costexplorer/anomalyMonitor:AnomalyMonitor", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetAnomalyMonitor gets an existing AnomalyMonitor resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetAnomalyMonitor(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *AnomalyMonitorState, opts ...pulumi.ResourceOption) (*AnomalyMonitor, error) {
	var resource AnomalyMonitor
	err := ctx.ReadResource("aws:costexplorer/anomalyMonitor:AnomalyMonitor", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering AnomalyMonitor resources.
type anomalyMonitorState struct {
	// ARN of the anomaly monitor.
	Arn *string `pulumi:"arn"`
	// The dimensions to evaluate. Valid values: `SERVICE`.
	MonitorDimension *string `pulumi:"monitorDimension"`
	// A valid JSON representation for the [Expression](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html) object.
	MonitorSpecification *string `pulumi:"monitorSpecification"`
	// The possible type values. Valid values: `DIMENSIONAL` | `CUSTOM`.
	MonitorType *string `pulumi:"monitorType"`
	// The name of the monitor.
	Name *string `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type AnomalyMonitorState struct {
	// ARN of the anomaly monitor.
	Arn pulumi.StringPtrInput
	// The dimensions to evaluate. Valid values: `SERVICE`.
	MonitorDimension pulumi.StringPtrInput
	// A valid JSON representation for the [Expression](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html) object.
	MonitorSpecification pulumi.StringPtrInput
	// The possible type values. Valid values: `DIMENSIONAL` | `CUSTOM`.
	MonitorType pulumi.StringPtrInput
	// The name of the monitor.
	Name pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (AnomalyMonitorState) ElementType() reflect.Type {
	return reflect.TypeOf((*anomalyMonitorState)(nil)).Elem()
}

type anomalyMonitorArgs struct {
	// The dimensions to evaluate. Valid values: `SERVICE`.
	MonitorDimension *string `pulumi:"monitorDimension"`
	// A valid JSON representation for the [Expression](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html) object.
	MonitorSpecification *string `pulumi:"monitorSpecification"`
	// The possible type values. Valid values: `DIMENSIONAL` | `CUSTOM`.
	MonitorType string `pulumi:"monitorType"`
	// The name of the monitor.
	Name *string `pulumi:"name"`
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a AnomalyMonitor resource.
type AnomalyMonitorArgs struct {
	// The dimensions to evaluate. Valid values: `SERVICE`.
	MonitorDimension pulumi.StringPtrInput
	// A valid JSON representation for the [Expression](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html) object.
	MonitorSpecification pulumi.StringPtrInput
	// The possible type values. Valid values: `DIMENSIONAL` | `CUSTOM`.
	MonitorType pulumi.StringInput
	// The name of the monitor.
	Name pulumi.StringPtrInput
	// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
}

func (AnomalyMonitorArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*anomalyMonitorArgs)(nil)).Elem()
}

type AnomalyMonitorInput interface {
	pulumi.Input

	ToAnomalyMonitorOutput() AnomalyMonitorOutput
	ToAnomalyMonitorOutputWithContext(ctx context.Context) AnomalyMonitorOutput
}

func (*AnomalyMonitor) ElementType() reflect.Type {
	return reflect.TypeOf((**AnomalyMonitor)(nil)).Elem()
}

func (i *AnomalyMonitor) ToAnomalyMonitorOutput() AnomalyMonitorOutput {
	return i.ToAnomalyMonitorOutputWithContext(context.Background())
}

func (i *AnomalyMonitor) ToAnomalyMonitorOutputWithContext(ctx context.Context) AnomalyMonitorOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AnomalyMonitorOutput)
}

// AnomalyMonitorArrayInput is an input type that accepts AnomalyMonitorArray and AnomalyMonitorArrayOutput values.
// You can construct a concrete instance of `AnomalyMonitorArrayInput` via:
//
//	AnomalyMonitorArray{ AnomalyMonitorArgs{...} }
type AnomalyMonitorArrayInput interface {
	pulumi.Input

	ToAnomalyMonitorArrayOutput() AnomalyMonitorArrayOutput
	ToAnomalyMonitorArrayOutputWithContext(context.Context) AnomalyMonitorArrayOutput
}

type AnomalyMonitorArray []AnomalyMonitorInput

func (AnomalyMonitorArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AnomalyMonitor)(nil)).Elem()
}

func (i AnomalyMonitorArray) ToAnomalyMonitorArrayOutput() AnomalyMonitorArrayOutput {
	return i.ToAnomalyMonitorArrayOutputWithContext(context.Background())
}

func (i AnomalyMonitorArray) ToAnomalyMonitorArrayOutputWithContext(ctx context.Context) AnomalyMonitorArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AnomalyMonitorArrayOutput)
}

// AnomalyMonitorMapInput is an input type that accepts AnomalyMonitorMap and AnomalyMonitorMapOutput values.
// You can construct a concrete instance of `AnomalyMonitorMapInput` via:
//
//	AnomalyMonitorMap{ "key": AnomalyMonitorArgs{...} }
type AnomalyMonitorMapInput interface {
	pulumi.Input

	ToAnomalyMonitorMapOutput() AnomalyMonitorMapOutput
	ToAnomalyMonitorMapOutputWithContext(context.Context) AnomalyMonitorMapOutput
}

type AnomalyMonitorMap map[string]AnomalyMonitorInput

func (AnomalyMonitorMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AnomalyMonitor)(nil)).Elem()
}

func (i AnomalyMonitorMap) ToAnomalyMonitorMapOutput() AnomalyMonitorMapOutput {
	return i.ToAnomalyMonitorMapOutputWithContext(context.Background())
}

func (i AnomalyMonitorMap) ToAnomalyMonitorMapOutputWithContext(ctx context.Context) AnomalyMonitorMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(AnomalyMonitorMapOutput)
}

type AnomalyMonitorOutput struct{ *pulumi.OutputState }

func (AnomalyMonitorOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**AnomalyMonitor)(nil)).Elem()
}

func (o AnomalyMonitorOutput) ToAnomalyMonitorOutput() AnomalyMonitorOutput {
	return o
}

func (o AnomalyMonitorOutput) ToAnomalyMonitorOutputWithContext(ctx context.Context) AnomalyMonitorOutput {
	return o
}

// ARN of the anomaly monitor.
func (o AnomalyMonitorOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *AnomalyMonitor) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// The dimensions to evaluate. Valid values: `SERVICE`.
func (o AnomalyMonitorOutput) MonitorDimension() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AnomalyMonitor) pulumi.StringPtrOutput { return v.MonitorDimension }).(pulumi.StringPtrOutput)
}

// A valid JSON representation for the [Expression](https://docs.aws.amazon.com/aws-cost-management/latest/APIReference/API_Expression.html) object.
func (o AnomalyMonitorOutput) MonitorSpecification() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *AnomalyMonitor) pulumi.StringPtrOutput { return v.MonitorSpecification }).(pulumi.StringPtrOutput)
}

// The possible type values. Valid values: `DIMENSIONAL` | `CUSTOM`.
func (o AnomalyMonitorOutput) MonitorType() pulumi.StringOutput {
	return o.ApplyT(func(v *AnomalyMonitor) pulumi.StringOutput { return v.MonitorType }).(pulumi.StringOutput)
}

// The name of the monitor.
func (o AnomalyMonitorOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *AnomalyMonitor) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o AnomalyMonitorOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AnomalyMonitor) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o AnomalyMonitorOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *AnomalyMonitor) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type AnomalyMonitorArrayOutput struct{ *pulumi.OutputState }

func (AnomalyMonitorArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*AnomalyMonitor)(nil)).Elem()
}

func (o AnomalyMonitorArrayOutput) ToAnomalyMonitorArrayOutput() AnomalyMonitorArrayOutput {
	return o
}

func (o AnomalyMonitorArrayOutput) ToAnomalyMonitorArrayOutputWithContext(ctx context.Context) AnomalyMonitorArrayOutput {
	return o
}

func (o AnomalyMonitorArrayOutput) Index(i pulumi.IntInput) AnomalyMonitorOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *AnomalyMonitor {
		return vs[0].([]*AnomalyMonitor)[vs[1].(int)]
	}).(AnomalyMonitorOutput)
}

type AnomalyMonitorMapOutput struct{ *pulumi.OutputState }

func (AnomalyMonitorMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*AnomalyMonitor)(nil)).Elem()
}

func (o AnomalyMonitorMapOutput) ToAnomalyMonitorMapOutput() AnomalyMonitorMapOutput {
	return o
}

func (o AnomalyMonitorMapOutput) ToAnomalyMonitorMapOutputWithContext(ctx context.Context) AnomalyMonitorMapOutput {
	return o
}

func (o AnomalyMonitorMapOutput) MapIndex(k pulumi.StringInput) AnomalyMonitorOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *AnomalyMonitor {
		return vs[0].(map[string]*AnomalyMonitor)[vs[1].(string)]
	}).(AnomalyMonitorOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*AnomalyMonitorInput)(nil)).Elem(), &AnomalyMonitor{})
	pulumi.RegisterInputType(reflect.TypeOf((*AnomalyMonitorArrayInput)(nil)).Elem(), AnomalyMonitorArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*AnomalyMonitorMapInput)(nil)).Elem(), AnomalyMonitorMap{})
	pulumi.RegisterOutputType(AnomalyMonitorOutput{})
	pulumi.RegisterOutputType(AnomalyMonitorArrayOutput{})
	pulumi.RegisterOutputType(AnomalyMonitorMapOutput{})
}
