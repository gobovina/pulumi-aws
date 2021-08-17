// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package shield

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Creates a grouping of protected resources so they can be handled as a collective.
// This resource grouping improves the accuracy of detection and reduces false positives. For more information see
// [Managing AWS Shield Advanced protection groups](https://docs.aws.amazon.com/waf/latest/developerguide/manage-protection-group.html)
//
// ## Example Usage
// ### Create protection group for all resources
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/shield"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := shield.NewProtectionGroup(ctx, "example", &shield.ProtectionGroupArgs{
// 			Aggregation:       pulumi.String("MAX"),
// 			Pattern:           pulumi.String("ALL"),
// 			ProtectionGroupId: pulumi.String("example"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Create protection group for arbitrary number of resources
//
// ```go
// package main
//
// import (
// 	"fmt"
//
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws"
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/ec2"
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/shield"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		currentRegion, err := aws.GetRegion(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		currentCallerIdentity, err := aws.GetCallerIdentity(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		exampleEip, err := ec2.NewEip(ctx, "exampleEip", &ec2.EipArgs{
// 			Vpc: pulumi.Bool(true),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		exampleProtection, err := shield.NewProtection(ctx, "exampleProtection", &shield.ProtectionArgs{
// 			ResourceArn: exampleEip.ID().ApplyT(func(id string) (string, error) {
// 				return fmt.Sprintf("%v%v%v%v%v%v", "arn:aws:ec2:", currentRegion.Name, ":", currentCallerIdentity.AccountId, ":eip-allocation/", id), nil
// 			}).(pulumi.StringOutput),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = shield.NewProtectionGroup(ctx, "exampleProtectionGroup", &shield.ProtectionGroupArgs{
// 			ProtectionGroupId: pulumi.String("example"),
// 			Aggregation:       pulumi.String("MEAN"),
// 			Pattern:           pulumi.String("ARBITRARY"),
// 			Members: pulumi.StringArray{
// 				exampleEip.ID().ApplyT(func(id string) (string, error) {
// 					return fmt.Sprintf("%v%v%v%v%v%v", "arn:aws:ec2:", currentRegion.Name, ":", currentCallerIdentity.AccountId, ":eip-allocation/", id), nil
// 				}).(pulumi.StringOutput),
// 			},
// 		}, pulumi.DependsOn([]pulumi.Resource{
// 			exampleProtection,
// 		}))
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ### Create protection group for a type of resource
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/shield"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := shield.NewProtectionGroup(ctx, "example", &shield.ProtectionGroupArgs{
// 			Aggregation:       pulumi.String("SUM"),
// 			Pattern:           pulumi.String("BY_RESOURCE_TYPE"),
// 			ProtectionGroupId: pulumi.String("example"),
// 			ResourceType:      pulumi.String("ELASTIC_IP_ALLOCATION"),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// Shield protection group resources can be imported by specifying their protection group id.
//
// ```sh
//  $ pulumi import aws:shield/protectionGroup:ProtectionGroup example example
// ```
type ProtectionGroup struct {
	pulumi.CustomResourceState

	// Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
	Aggregation pulumi.StringOutput `pulumi:"aggregation"`
	// The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
	Members pulumi.StringArrayOutput `pulumi:"members"`
	// The criteria to use to choose the protected resources for inclusion in the group.
	Pattern pulumi.StringOutput `pulumi:"pattern"`
	// The ARN (Amazon Resource Name) of the protection group.
	ProtectionGroupArn pulumi.StringOutput `pulumi:"protectionGroupArn"`
	// The name of the protection group.
	ProtectionGroupId pulumi.StringOutput `pulumi:"protectionGroupId"`
	// The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
	ResourceType pulumi.StringPtrOutput `pulumi:"resourceType"`
	// Key-value map of resource tags. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewProtectionGroup registers a new resource with the given unique name, arguments, and options.
func NewProtectionGroup(ctx *pulumi.Context,
	name string, args *ProtectionGroupArgs, opts ...pulumi.ResourceOption) (*ProtectionGroup, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Aggregation == nil {
		return nil, errors.New("invalid value for required argument 'Aggregation'")
	}
	if args.Pattern == nil {
		return nil, errors.New("invalid value for required argument 'Pattern'")
	}
	if args.ProtectionGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ProtectionGroupId'")
	}
	var resource ProtectionGroup
	err := ctx.RegisterResource("aws:shield/protectionGroup:ProtectionGroup", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetProtectionGroup gets an existing ProtectionGroup resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetProtectionGroup(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ProtectionGroupState, opts ...pulumi.ResourceOption) (*ProtectionGroup, error) {
	var resource ProtectionGroup
	err := ctx.ReadResource("aws:shield/protectionGroup:ProtectionGroup", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ProtectionGroup resources.
type protectionGroupState struct {
	// Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
	Aggregation *string `pulumi:"aggregation"`
	// The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
	Members []string `pulumi:"members"`
	// The criteria to use to choose the protected resources for inclusion in the group.
	Pattern *string `pulumi:"pattern"`
	// The ARN (Amazon Resource Name) of the protection group.
	ProtectionGroupArn *string `pulumi:"protectionGroupArn"`
	// The name of the protection group.
	ProtectionGroupId *string `pulumi:"protectionGroupId"`
	// The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
	ResourceType *string `pulumi:"resourceType"`
	// Key-value map of resource tags. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ProtectionGroupState struct {
	// Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
	Aggregation pulumi.StringPtrInput
	// The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
	Members pulumi.StringArrayInput
	// The criteria to use to choose the protected resources for inclusion in the group.
	Pattern pulumi.StringPtrInput
	// The ARN (Amazon Resource Name) of the protection group.
	ProtectionGroupArn pulumi.StringPtrInput
	// The name of the protection group.
	ProtectionGroupId pulumi.StringPtrInput
	// The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
	ResourceType pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll pulumi.StringMapInput
}

func (ProtectionGroupState) ElementType() reflect.Type {
	return reflect.TypeOf((*protectionGroupState)(nil)).Elem()
}

type protectionGroupArgs struct {
	// Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
	Aggregation string `pulumi:"aggregation"`
	// The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
	Members []string `pulumi:"members"`
	// The criteria to use to choose the protected resources for inclusion in the group.
	Pattern string `pulumi:"pattern"`
	// The name of the protection group.
	ProtectionGroupId string `pulumi:"protectionGroupId"`
	// The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
	ResourceType *string `pulumi:"resourceType"`
	// Key-value map of resource tags. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll map[string]string `pulumi:"tagsAll"`
}

// The set of arguments for constructing a ProtectionGroup resource.
type ProtectionGroupArgs struct {
	// Defines how AWS Shield combines resource data for the group in order to detect, mitigate, and report events.
	Aggregation pulumi.StringInput
	// The Amazon Resource Names (ARNs) of the resources to include in the protection group. You must set this when you set `pattern` to ARBITRARY and you must not set it for any other `pattern` setting.
	Members pulumi.StringArrayInput
	// The criteria to use to choose the protected resources for inclusion in the group.
	Pattern pulumi.StringInput
	// The name of the protection group.
	ProtectionGroupId pulumi.StringInput
	// The resource type to include in the protection group. You must set this when you set `pattern` to BY_RESOURCE_TYPE and you must not set it for any other `pattern` setting.
	ResourceType pulumi.StringPtrInput
	// Key-value map of resource tags. If configured with a provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block) present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider [`defaultTags` configuration block](https://www.terraform.io/docs/providers/aws/index.html#default_tags-configuration-block).
	TagsAll pulumi.StringMapInput
}

func (ProtectionGroupArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*protectionGroupArgs)(nil)).Elem()
}

type ProtectionGroupInput interface {
	pulumi.Input

	ToProtectionGroupOutput() ProtectionGroupOutput
	ToProtectionGroupOutputWithContext(ctx context.Context) ProtectionGroupOutput
}

func (*ProtectionGroup) ElementType() reflect.Type {
	return reflect.TypeOf((*ProtectionGroup)(nil))
}

func (i *ProtectionGroup) ToProtectionGroupOutput() ProtectionGroupOutput {
	return i.ToProtectionGroupOutputWithContext(context.Background())
}

func (i *ProtectionGroup) ToProtectionGroupOutputWithContext(ctx context.Context) ProtectionGroupOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProtectionGroupOutput)
}

func (i *ProtectionGroup) ToProtectionGroupPtrOutput() ProtectionGroupPtrOutput {
	return i.ToProtectionGroupPtrOutputWithContext(context.Background())
}

func (i *ProtectionGroup) ToProtectionGroupPtrOutputWithContext(ctx context.Context) ProtectionGroupPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProtectionGroupPtrOutput)
}

type ProtectionGroupPtrInput interface {
	pulumi.Input

	ToProtectionGroupPtrOutput() ProtectionGroupPtrOutput
	ToProtectionGroupPtrOutputWithContext(ctx context.Context) ProtectionGroupPtrOutput
}

type protectionGroupPtrType ProtectionGroupArgs

func (*protectionGroupPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ProtectionGroup)(nil))
}

func (i *protectionGroupPtrType) ToProtectionGroupPtrOutput() ProtectionGroupPtrOutput {
	return i.ToProtectionGroupPtrOutputWithContext(context.Background())
}

func (i *protectionGroupPtrType) ToProtectionGroupPtrOutputWithContext(ctx context.Context) ProtectionGroupPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProtectionGroupPtrOutput)
}

// ProtectionGroupArrayInput is an input type that accepts ProtectionGroupArray and ProtectionGroupArrayOutput values.
// You can construct a concrete instance of `ProtectionGroupArrayInput` via:
//
//          ProtectionGroupArray{ ProtectionGroupArgs{...} }
type ProtectionGroupArrayInput interface {
	pulumi.Input

	ToProtectionGroupArrayOutput() ProtectionGroupArrayOutput
	ToProtectionGroupArrayOutputWithContext(context.Context) ProtectionGroupArrayOutput
}

type ProtectionGroupArray []ProtectionGroupInput

func (ProtectionGroupArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ProtectionGroup)(nil)).Elem()
}

func (i ProtectionGroupArray) ToProtectionGroupArrayOutput() ProtectionGroupArrayOutput {
	return i.ToProtectionGroupArrayOutputWithContext(context.Background())
}

func (i ProtectionGroupArray) ToProtectionGroupArrayOutputWithContext(ctx context.Context) ProtectionGroupArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProtectionGroupArrayOutput)
}

// ProtectionGroupMapInput is an input type that accepts ProtectionGroupMap and ProtectionGroupMapOutput values.
// You can construct a concrete instance of `ProtectionGroupMapInput` via:
//
//          ProtectionGroupMap{ "key": ProtectionGroupArgs{...} }
type ProtectionGroupMapInput interface {
	pulumi.Input

	ToProtectionGroupMapOutput() ProtectionGroupMapOutput
	ToProtectionGroupMapOutputWithContext(context.Context) ProtectionGroupMapOutput
}

type ProtectionGroupMap map[string]ProtectionGroupInput

func (ProtectionGroupMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ProtectionGroup)(nil)).Elem()
}

func (i ProtectionGroupMap) ToProtectionGroupMapOutput() ProtectionGroupMapOutput {
	return i.ToProtectionGroupMapOutputWithContext(context.Background())
}

func (i ProtectionGroupMap) ToProtectionGroupMapOutputWithContext(ctx context.Context) ProtectionGroupMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ProtectionGroupMapOutput)
}

type ProtectionGroupOutput struct{ *pulumi.OutputState }

func (ProtectionGroupOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ProtectionGroup)(nil))
}

func (o ProtectionGroupOutput) ToProtectionGroupOutput() ProtectionGroupOutput {
	return o
}

func (o ProtectionGroupOutput) ToProtectionGroupOutputWithContext(ctx context.Context) ProtectionGroupOutput {
	return o
}

func (o ProtectionGroupOutput) ToProtectionGroupPtrOutput() ProtectionGroupPtrOutput {
	return o.ToProtectionGroupPtrOutputWithContext(context.Background())
}

func (o ProtectionGroupOutput) ToProtectionGroupPtrOutputWithContext(ctx context.Context) ProtectionGroupPtrOutput {
	return o.ApplyTWithContext(ctx, func(_ context.Context, v ProtectionGroup) *ProtectionGroup {
		return &v
	}).(ProtectionGroupPtrOutput)
}

type ProtectionGroupPtrOutput struct{ *pulumi.OutputState }

func (ProtectionGroupPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ProtectionGroup)(nil))
}

func (o ProtectionGroupPtrOutput) ToProtectionGroupPtrOutput() ProtectionGroupPtrOutput {
	return o
}

func (o ProtectionGroupPtrOutput) ToProtectionGroupPtrOutputWithContext(ctx context.Context) ProtectionGroupPtrOutput {
	return o
}

func (o ProtectionGroupPtrOutput) Elem() ProtectionGroupOutput {
	return o.ApplyT(func(v *ProtectionGroup) ProtectionGroup {
		if v != nil {
			return *v
		}
		var ret ProtectionGroup
		return ret
	}).(ProtectionGroupOutput)
}

type ProtectionGroupArrayOutput struct{ *pulumi.OutputState }

func (ProtectionGroupArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ProtectionGroup)(nil))
}

func (o ProtectionGroupArrayOutput) ToProtectionGroupArrayOutput() ProtectionGroupArrayOutput {
	return o
}

func (o ProtectionGroupArrayOutput) ToProtectionGroupArrayOutputWithContext(ctx context.Context) ProtectionGroupArrayOutput {
	return o
}

func (o ProtectionGroupArrayOutput) Index(i pulumi.IntInput) ProtectionGroupOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ProtectionGroup {
		return vs[0].([]ProtectionGroup)[vs[1].(int)]
	}).(ProtectionGroupOutput)
}

type ProtectionGroupMapOutput struct{ *pulumi.OutputState }

func (ProtectionGroupMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ProtectionGroup)(nil))
}

func (o ProtectionGroupMapOutput) ToProtectionGroupMapOutput() ProtectionGroupMapOutput {
	return o
}

func (o ProtectionGroupMapOutput) ToProtectionGroupMapOutputWithContext(ctx context.Context) ProtectionGroupMapOutput {
	return o
}

func (o ProtectionGroupMapOutput) MapIndex(k pulumi.StringInput) ProtectionGroupOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ProtectionGroup {
		return vs[0].(map[string]ProtectionGroup)[vs[1].(string)]
	}).(ProtectionGroupOutput)
}

func init() {
	pulumi.RegisterOutputType(ProtectionGroupOutput{})
	pulumi.RegisterOutputType(ProtectionGroupPtrOutput{})
	pulumi.RegisterOutputType(ProtectionGroupArrayOutput{})
	pulumi.RegisterOutputType(ProtectionGroupMapOutput{})
}
