// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package route53

import (
	"context"
	"reflect"

	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages a Route53 Hosted Zone. For managing Domain Name System Security Extensions (DNSSEC), see the `route53.KeySigningKey` and `route53.HostedZoneDnsSec` resources.
//
// ## Example Usage
// ### Public Zone
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/route53"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := route53.NewZone(ctx, "primary", nil)
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Public Subdomain Zone
//
// For use in subdomains, note that you need to create a
// `route53.Record` of type `NS` as well as the subdomain
// zone.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/route53"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			main, err := route53.NewZone(ctx, "main", nil)
//			if err != nil {
//				return err
//			}
//			dev, err := route53.NewZone(ctx, "dev", &route53.ZoneArgs{
//				Tags: pulumi.StringMap{
//					"Environment": pulumi.String("dev"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = route53.NewRecord(ctx, "dev-ns", &route53.RecordArgs{
//				ZoneId:  main.ZoneId,
//				Name:    pulumi.String("dev.example.com"),
//				Type:    pulumi.String("NS"),
//				Ttl:     pulumi.Int(30),
//				Records: dev.NameServers,
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Private Zone
//
// > **NOTE:** This provider provides both exclusive VPC associations defined in-line in this resource via `vpc` configuration blocks and a separate ` Zone VPC Association resource. At this time, you cannot use in-line VPC associations in conjunction with any  `route53.ZoneAssociation`  resources with the same zone ID otherwise it will cause a perpetual difference in plan output. You can optionally use [ `ignoreChanges` ](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) to manage additional associations via the  `route53.ZoneAssociation` resource.
//
// > **NOTE:** Private zones require at least one VPC association at all times.
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/route53"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := route53.NewZone(ctx, "private", &route53.ZoneArgs{
//				Vpcs: route53.ZoneVpcArray{
//					&route53.ZoneVpcArgs{
//						VpcId: pulumi.Any(aws_vpc.Example.Id),
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
// Route53 Zones can be imported using the `zone id`, e.g.,
//
// ```sh
//
//	$ pulumi import aws:route53/zone:Zone myzone Z1D633PJN98FT9
//
// ```
type Zone struct {
	pulumi.CustomResourceState

	// The Amazon Resource Name (ARN) of the Hosted Zone.
	Arn pulumi.StringOutput `pulumi:"arn"`
	// A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
	Comment pulumi.StringOutput `pulumi:"comment"`
	// The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
	DelegationSetId pulumi.StringPtrOutput `pulumi:"delegationSetId"`
	// Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
	ForceDestroy pulumi.BoolPtrOutput `pulumi:"forceDestroy"`
	// This is the name of the hosted zone.
	Name pulumi.StringOutput `pulumi:"name"`
	// A list of name servers in associated (or default) delegation set.
	// Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
	NameServers pulumi.StringArrayOutput `pulumi:"nameServers"`
	// The Route 53 name server that created the SOA record.
	PrimaryNameServer pulumi.StringOutput `pulumi:"primaryNameServer"`
	// A mapping of tags to assign to the zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
	Vpcs ZoneVpcArrayOutput `pulumi:"vpcs"`
	// The Hosted Zone ID. This can be referenced by zone records.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewZone registers a new resource with the given unique name, arguments, and options.
func NewZone(ctx *pulumi.Context,
	name string, args *ZoneArgs, opts ...pulumi.ResourceOption) (*Zone, error) {
	if args == nil {
		args = &ZoneArgs{}
	}

	if args.Comment == nil {
		args.Comment = pulumi.StringPtr("Managed by Pulumi")
	}
	var resource Zone
	err := ctx.RegisterResource("aws:route53/zone:Zone", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetZone gets an existing Zone resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetZone(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ZoneState, opts ...pulumi.ResourceOption) (*Zone, error) {
	var resource Zone
	err := ctx.ReadResource("aws:route53/zone:Zone", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Zone resources.
type zoneState struct {
	// The Amazon Resource Name (ARN) of the Hosted Zone.
	Arn *string `pulumi:"arn"`
	// A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
	Comment *string `pulumi:"comment"`
	// The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
	DelegationSetId *string `pulumi:"delegationSetId"`
	// Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// This is the name of the hosted zone.
	Name *string `pulumi:"name"`
	// A list of name servers in associated (or default) delegation set.
	// Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
	NameServers []string `pulumi:"nameServers"`
	// The Route 53 name server that created the SOA record.
	PrimaryNameServer *string `pulumi:"primaryNameServer"`
	// A mapping of tags to assign to the zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
	Vpcs []ZoneVpc `pulumi:"vpcs"`
	// The Hosted Zone ID. This can be referenced by zone records.
	ZoneId *string `pulumi:"zoneId"`
}

type ZoneState struct {
	// The Amazon Resource Name (ARN) of the Hosted Zone.
	Arn pulumi.StringPtrInput
	// A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
	Comment pulumi.StringPtrInput
	// The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
	DelegationSetId pulumi.StringPtrInput
	// Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
	ForceDestroy pulumi.BoolPtrInput
	// This is the name of the hosted zone.
	Name pulumi.StringPtrInput
	// A list of name servers in associated (or default) delegation set.
	// Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
	NameServers pulumi.StringArrayInput
	// The Route 53 name server that created the SOA record.
	PrimaryNameServer pulumi.StringPtrInput
	// A mapping of tags to assign to the zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
	Vpcs ZoneVpcArrayInput
	// The Hosted Zone ID. This can be referenced by zone records.
	ZoneId pulumi.StringPtrInput
}

func (ZoneState) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneState)(nil)).Elem()
}

type zoneArgs struct {
	// A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
	Comment *string `pulumi:"comment"`
	// The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
	DelegationSetId *string `pulumi:"delegationSetId"`
	// Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
	ForceDestroy *bool `pulumi:"forceDestroy"`
	// This is the name of the hosted zone.
	Name *string `pulumi:"name"`
	// A mapping of tags to assign to the zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
	Vpcs []ZoneVpc `pulumi:"vpcs"`
}

// The set of arguments for constructing a Zone resource.
type ZoneArgs struct {
	// A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
	Comment pulumi.StringPtrInput
	// The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
	DelegationSetId pulumi.StringPtrInput
	// Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
	ForceDestroy pulumi.BoolPtrInput
	// This is the name of the hosted zone.
	Name pulumi.StringPtrInput
	// A mapping of tags to assign to the zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	TagsAll pulumi.StringMapInput
	// Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
	Vpcs ZoneVpcArrayInput
}

func (ZoneArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*zoneArgs)(nil)).Elem()
}

type ZoneInput interface {
	pulumi.Input

	ToZoneOutput() ZoneOutput
	ToZoneOutputWithContext(ctx context.Context) ZoneOutput
}

func (*Zone) ElementType() reflect.Type {
	return reflect.TypeOf((**Zone)(nil)).Elem()
}

func (i *Zone) ToZoneOutput() ZoneOutput {
	return i.ToZoneOutputWithContext(context.Background())
}

func (i *Zone) ToZoneOutputWithContext(ctx context.Context) ZoneOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneOutput)
}

// ZoneArrayInput is an input type that accepts ZoneArray and ZoneArrayOutput values.
// You can construct a concrete instance of `ZoneArrayInput` via:
//
//	ZoneArray{ ZoneArgs{...} }
type ZoneArrayInput interface {
	pulumi.Input

	ToZoneArrayOutput() ZoneArrayOutput
	ToZoneArrayOutputWithContext(context.Context) ZoneArrayOutput
}

type ZoneArray []ZoneInput

func (ZoneArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Zone)(nil)).Elem()
}

func (i ZoneArray) ToZoneArrayOutput() ZoneArrayOutput {
	return i.ToZoneArrayOutputWithContext(context.Background())
}

func (i ZoneArray) ToZoneArrayOutputWithContext(ctx context.Context) ZoneArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneArrayOutput)
}

// ZoneMapInput is an input type that accepts ZoneMap and ZoneMapOutput values.
// You can construct a concrete instance of `ZoneMapInput` via:
//
//	ZoneMap{ "key": ZoneArgs{...} }
type ZoneMapInput interface {
	pulumi.Input

	ToZoneMapOutput() ZoneMapOutput
	ToZoneMapOutputWithContext(context.Context) ZoneMapOutput
}

type ZoneMap map[string]ZoneInput

func (ZoneMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Zone)(nil)).Elem()
}

func (i ZoneMap) ToZoneMapOutput() ZoneMapOutput {
	return i.ToZoneMapOutputWithContext(context.Background())
}

func (i ZoneMap) ToZoneMapOutputWithContext(ctx context.Context) ZoneMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ZoneMapOutput)
}

type ZoneOutput struct{ *pulumi.OutputState }

func (ZoneOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Zone)(nil)).Elem()
}

func (o ZoneOutput) ToZoneOutput() ZoneOutput {
	return o
}

func (o ZoneOutput) ToZoneOutputWithContext(ctx context.Context) ZoneOutput {
	return o
}

// The Amazon Resource Name (ARN) of the Hosted Zone.
func (o ZoneOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// A comment for the hosted zone. Defaults to 'Managed by Pulumi'.
func (o ZoneOutput) Comment() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.Comment }).(pulumi.StringOutput)
}

// The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
func (o ZoneOutput) DelegationSetId() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringPtrOutput { return v.DelegationSetId }).(pulumi.StringPtrOutput)
}

// Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
func (o ZoneOutput) ForceDestroy() pulumi.BoolPtrOutput {
	return o.ApplyT(func(v *Zone) pulumi.BoolPtrOutput { return v.ForceDestroy }).(pulumi.BoolPtrOutput)
}

// This is the name of the hosted zone.
func (o ZoneOutput) Name() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.Name }).(pulumi.StringOutput)
}

// A list of name servers in associated (or default) delegation set.
// Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
func (o ZoneOutput) NameServers() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringArrayOutput { return v.NameServers }).(pulumi.StringArrayOutput)
}

// The Route 53 name server that created the SOA record.
func (o ZoneOutput) PrimaryNameServer() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.PrimaryNameServer }).(pulumi.StringOutput)
}

// A mapping of tags to assign to the zone. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o ZoneOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
func (o ZoneOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegationSetId` argument in this resource and any `route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
func (o ZoneOutput) Vpcs() ZoneVpcArrayOutput {
	return o.ApplyT(func(v *Zone) ZoneVpcArrayOutput { return v.Vpcs }).(ZoneVpcArrayOutput)
}

// The Hosted Zone ID. This can be referenced by zone records.
func (o ZoneOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *Zone) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type ZoneArrayOutput struct{ *pulumi.OutputState }

func (ZoneArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Zone)(nil)).Elem()
}

func (o ZoneArrayOutput) ToZoneArrayOutput() ZoneArrayOutput {
	return o
}

func (o ZoneArrayOutput) ToZoneArrayOutputWithContext(ctx context.Context) ZoneArrayOutput {
	return o
}

func (o ZoneArrayOutput) Index(i pulumi.IntInput) ZoneOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Zone {
		return vs[0].([]*Zone)[vs[1].(int)]
	}).(ZoneOutput)
}

type ZoneMapOutput struct{ *pulumi.OutputState }

func (ZoneMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Zone)(nil)).Elem()
}

func (o ZoneMapOutput) ToZoneMapOutput() ZoneMapOutput {
	return o
}

func (o ZoneMapOutput) ToZoneMapOutputWithContext(ctx context.Context) ZoneMapOutput {
	return o
}

func (o ZoneMapOutput) MapIndex(k pulumi.StringInput) ZoneOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Zone {
		return vs[0].(map[string]*Zone)[vs[1].(string)]
	}).(ZoneOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneInput)(nil)).Elem(), &Zone{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneArrayInput)(nil)).Elem(), ZoneArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ZoneMapInput)(nil)).Elem(), ZoneMap{})
	pulumi.RegisterOutputType(ZoneOutput{})
	pulumi.RegisterOutputType(ZoneArrayOutput{})
	pulumi.RegisterOutputType(ZoneMapOutput{})
}
