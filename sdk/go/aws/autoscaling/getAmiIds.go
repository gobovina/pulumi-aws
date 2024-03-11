// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package autoscaling

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// The Autoscaling Groups data source allows access to the list of AWS
// ASGs within a specific region. This will allow you to pass a list of AutoScaling Groups to other resources.
//
// ## Example Usage
//
// <!--Start PulumiCodeChooser -->
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/autoscaling"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			groups, err := autoscaling.GetAmiIds(ctx, &autoscaling.GetAmiIdsArgs{
//				Filters: []autoscaling.GetAmiIdsFilter{
//					{
//						Name: "tag:Team",
//						Values: []string{
//							"Pets",
//						},
//					},
//					{
//						Name: "tag-key",
//						Values: []string{
//							"Environment",
//						},
//					},
//				},
//			}, nil)
//			if err != nil {
//				return err
//			}
//			_, err = autoscaling.NewNotification(ctx, "slack_notifications", &autoscaling.NotificationArgs{
//				GroupNames: interface{}(groups.Names),
//				Notifications: pulumi.StringArray{
//					pulumi.String("autoscaling:EC2_INSTANCE_LAUNCH"),
//					pulumi.String("autoscaling:EC2_INSTANCE_TERMINATE"),
//					pulumi.String("autoscaling:EC2_INSTANCE_LAUNCH_ERROR"),
//					pulumi.String("autoscaling:EC2_INSTANCE_TERMINATE_ERROR"),
//				},
//				TopicArn: pulumi.String("TOPIC ARN"),
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
func GetAmiIds(ctx *pulumi.Context, args *GetAmiIdsArgs, opts ...pulumi.InvokeOption) (*GetAmiIdsResult, error) {
	opts = internal.PkgInvokeDefaultOpts(opts)
	var rv GetAmiIdsResult
	err := ctx.Invoke("aws:autoscaling/getAmiIds:getAmiIds", args, &rv, opts...)
	if err != nil {
		return nil, err
	}
	return &rv, nil
}

// A collection of arguments for invoking getAmiIds.
type GetAmiIdsArgs struct {
	// Filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
	Filters []GetAmiIdsFilter `pulumi:"filters"`
	// List of autoscaling group names
	Names []string `pulumi:"names"`
}

// A collection of values returned by getAmiIds.
type GetAmiIdsResult struct {
	// List of the Autoscaling Groups Arns in the current region.
	Arns    []string          `pulumi:"arns"`
	Filters []GetAmiIdsFilter `pulumi:"filters"`
	// The provider-assigned unique ID for this managed resource.
	Id string `pulumi:"id"`
	// List of the Autoscaling Groups in the current region.
	Names []string `pulumi:"names"`
}

func GetAmiIdsOutput(ctx *pulumi.Context, args GetAmiIdsOutputArgs, opts ...pulumi.InvokeOption) GetAmiIdsResultOutput {
	return pulumi.ToOutputWithContext(context.Background(), args).
		ApplyT(func(v interface{}) (GetAmiIdsResult, error) {
			args := v.(GetAmiIdsArgs)
			r, err := GetAmiIds(ctx, &args, opts...)
			var s GetAmiIdsResult
			if r != nil {
				s = *r
			}
			return s, err
		}).(GetAmiIdsResultOutput)
}

// A collection of arguments for invoking getAmiIds.
type GetAmiIdsOutputArgs struct {
	// Filter used to scope the list e.g., by tags. See [related docs](http://docs.aws.amazon.com/AutoScaling/latest/APIReference/API_Filter.html).
	Filters GetAmiIdsFilterArrayInput `pulumi:"filters"`
	// List of autoscaling group names
	Names pulumi.StringArrayInput `pulumi:"names"`
}

func (GetAmiIdsOutputArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAmiIdsArgs)(nil)).Elem()
}

// A collection of values returned by getAmiIds.
type GetAmiIdsResultOutput struct{ *pulumi.OutputState }

func (GetAmiIdsResultOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*GetAmiIdsResult)(nil)).Elem()
}

func (o GetAmiIdsResultOutput) ToGetAmiIdsResultOutput() GetAmiIdsResultOutput {
	return o
}

func (o GetAmiIdsResultOutput) ToGetAmiIdsResultOutputWithContext(ctx context.Context) GetAmiIdsResultOutput {
	return o
}

// List of the Autoscaling Groups Arns in the current region.
func (o GetAmiIdsResultOutput) Arns() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAmiIdsResult) []string { return v.Arns }).(pulumi.StringArrayOutput)
}

func (o GetAmiIdsResultOutput) Filters() GetAmiIdsFilterArrayOutput {
	return o.ApplyT(func(v GetAmiIdsResult) []GetAmiIdsFilter { return v.Filters }).(GetAmiIdsFilterArrayOutput)
}

// The provider-assigned unique ID for this managed resource.
func (o GetAmiIdsResultOutput) Id() pulumi.StringOutput {
	return o.ApplyT(func(v GetAmiIdsResult) string { return v.Id }).(pulumi.StringOutput)
}

// List of the Autoscaling Groups in the current region.
func (o GetAmiIdsResultOutput) Names() pulumi.StringArrayOutput {
	return o.ApplyT(func(v GetAmiIdsResult) []string { return v.Names }).(pulumi.StringArrayOutput)
}

func init() {
	pulumi.RegisterOutputType(GetAmiIdsResultOutput{})
}
