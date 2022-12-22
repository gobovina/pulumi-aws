// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package wafregional

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Manages an association with WAF Regional Web ACL.
//
// > **Note:** An Application Load Balancer can only be associated with one WAF Regional WebACL.
//
// ## Example Usage
// ### Application Load Balancer Association
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/alb"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/ec2"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/wafregional"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ipset, err := wafregional.NewIpSet(ctx, "ipset", &wafregional.IpSetArgs{
//				IpSetDescriptors: wafregional.IpSetIpSetDescriptorArray{
//					&wafregional.IpSetIpSetDescriptorArgs{
//						Type:  pulumi.String("IPV4"),
//						Value: pulumi.String("192.0.7.0/24"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			fooRule, err := wafregional.NewRule(ctx, "fooRule", &wafregional.RuleArgs{
//				MetricName: pulumi.String("tfWAFRule"),
//				Predicates: wafregional.RulePredicateArray{
//					&wafregional.RulePredicateArgs{
//						DataId:  ipset.ID(),
//						Negated: pulumi.Bool(false),
//						Type:    pulumi.String("IPMatch"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			fooWebAcl, err := wafregional.NewWebAcl(ctx, "fooWebAcl", &wafregional.WebAclArgs{
//				MetricName: pulumi.String("foo"),
//				DefaultAction: &wafregional.WebAclDefaultActionArgs{
//					Type: pulumi.String("ALLOW"),
//				},
//				Rules: wafregional.WebAclRuleArray{
//					&wafregional.WebAclRuleArgs{
//						Action: &wafregional.WebAclRuleActionArgs{
//							Type: pulumi.String("BLOCK"),
//						},
//						Priority: pulumi.Int(1),
//						RuleId:   fooRule.ID(),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			fooVpc, err := ec2.NewVpc(ctx, "fooVpc", &ec2.VpcArgs{
//				CidrBlock: pulumi.String("10.1.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			available, err := aws.GetAvailabilityZones(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			fooSubnet, err := ec2.NewSubnet(ctx, "fooSubnet", &ec2.SubnetArgs{
//				VpcId:            fooVpc.ID(),
//				CidrBlock:        pulumi.String("10.1.1.0/24"),
//				AvailabilityZone: *pulumi.String(available.Names[0]),
//			})
//			if err != nil {
//				return err
//			}
//			bar, err := ec2.NewSubnet(ctx, "bar", &ec2.SubnetArgs{
//				VpcId:            fooVpc.ID(),
//				CidrBlock:        pulumi.String("10.1.2.0/24"),
//				AvailabilityZone: *pulumi.String(available.Names[1]),
//			})
//			if err != nil {
//				return err
//			}
//			fooLoadBalancer, err := alb.NewLoadBalancer(ctx, "fooLoadBalancer", &alb.LoadBalancerArgs{
//				Internal: pulumi.Bool(true),
//				Subnets: pulumi.StringArray{
//					fooSubnet.ID(),
//					bar.ID(),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = wafregional.NewWebAclAssociation(ctx, "fooWebAclAssociation", &wafregional.WebAclAssociationArgs{
//				ResourceArn: fooLoadBalancer.Arn,
//				WebAclId:    fooWebAcl.ID(),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### API Gateway Association
//
// ```go
// package main
//
// import (
//
//	"crypto/sha1"
//	"encoding/json"
//	"fmt"
//
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/apigateway"
//	"github.com/pulumi/pulumi-aws/sdk/v5/go/aws/wafregional"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func sha1Hash(input string) string {
//		hash := sha1.Sum([]byte(input))
//		return hex.EncodeToString(hash[:])
//	}
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			ipset, err := wafregional.NewIpSet(ctx, "ipset", &wafregional.IpSetArgs{
//				IpSetDescriptors: wafregional.IpSetIpSetDescriptorArray{
//					&wafregional.IpSetIpSetDescriptorArgs{
//						Type:  pulumi.String("IPV4"),
//						Value: pulumi.String("192.0.7.0/24"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			fooRule, err := wafregional.NewRule(ctx, "fooRule", &wafregional.RuleArgs{
//				MetricName: pulumi.String("tfWAFRule"),
//				Predicates: wafregional.RulePredicateArray{
//					&wafregional.RulePredicateArgs{
//						DataId:  ipset.ID(),
//						Negated: pulumi.Bool(false),
//						Type:    pulumi.String("IPMatch"),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			fooWebAcl, err := wafregional.NewWebAcl(ctx, "fooWebAcl", &wafregional.WebAclArgs{
//				MetricName: pulumi.String("foo"),
//				DefaultAction: &wafregional.WebAclDefaultActionArgs{
//					Type: pulumi.String("ALLOW"),
//				},
//				Rules: wafregional.WebAclRuleArray{
//					&wafregional.WebAclRuleArgs{
//						Action: &wafregional.WebAclRuleActionArgs{
//							Type: pulumi.String("BLOCK"),
//						},
//						Priority: pulumi.Int(1),
//						RuleId:   fooRule.ID(),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			tmpJSON0, err := json.Marshal(map[string]interface{}{
//				"openapi": "3.0.1",
//				"info": map[string]interface{}{
//					"title":   "example",
//					"version": "1.0",
//				},
//				"paths": map[string]interface{}{
//					"/path1": map[string]interface{}{
//						"get": map[string]interface{}{
//							"x-amazon-apigateway-integration": map[string]interface{}{
//								"httpMethod":           "GET",
//								"payloadFormatVersion": "1.0",
//								"type":                 "HTTP_PROXY",
//								"uri":                  "https://ip-ranges.amazonaws.com/ip-ranges.json",
//							},
//						},
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			json0 := string(tmpJSON0)
//			exampleRestApi, err := apigateway.NewRestApi(ctx, "exampleRestApi", &apigateway.RestApiArgs{
//				Body: pulumi.String(json0),
//			})
//			if err != nil {
//				return err
//			}
//			exampleDeployment, err := apigateway.NewDeployment(ctx, "exampleDeployment", &apigateway.DeploymentArgs{
//				RestApi: exampleRestApi.ID(),
//				Triggers: pulumi.StringMap{
//					"redeployment": exampleRestApi.Body.ApplyT(func(body *string) (pulumi.String, error) {
//						var _zero pulumi.String
//						tmpJSON1, err := json.Marshal(body)
//						if err != nil {
//							return _zero, err
//						}
//						json1 := string(tmpJSON1)
//						return pulumi.String(json1), nil
//					}).(pulumi.StringOutput).ApplyT(func(toJSON string) (pulumi.String, error) {
//						return pulumi.String(sha1Hash(toJSON)), nil
//					}).(pulumi.StringOutput),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleStage, err := apigateway.NewStage(ctx, "exampleStage", &apigateway.StageArgs{
//				Deployment: exampleDeployment.ID(),
//				RestApi:    exampleRestApi.ID(),
//				StageName:  pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = wafregional.NewWebAclAssociation(ctx, "association", &wafregional.WebAclAssociationArgs{
//				ResourceArn: exampleStage.Arn,
//				WebAclId:    fooWebAcl.ID(),
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
// WAF Regional Web ACL Association can be imported using their `web_acl_id:resource_arn`, e.g.,
//
// ```sh
//
//	$ pulumi import aws:wafregional/webAclAssociation:WebAclAssociation foo web_acl_id:resource_arn
//
// ```
type WebAclAssociation struct {
	pulumi.CustomResourceState

	// ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
	ResourceArn pulumi.StringOutput `pulumi:"resourceArn"`
	// The ID of the WAF Regional WebACL to create an association.
	WebAclId pulumi.StringOutput `pulumi:"webAclId"`
}

// NewWebAclAssociation registers a new resource with the given unique name, arguments, and options.
func NewWebAclAssociation(ctx *pulumi.Context,
	name string, args *WebAclAssociationArgs, opts ...pulumi.ResourceOption) (*WebAclAssociation, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ResourceArn == nil {
		return nil, errors.New("invalid value for required argument 'ResourceArn'")
	}
	if args.WebAclId == nil {
		return nil, errors.New("invalid value for required argument 'WebAclId'")
	}
	var resource WebAclAssociation
	err := ctx.RegisterResource("aws:wafregional/webAclAssociation:WebAclAssociation", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetWebAclAssociation gets an existing WebAclAssociation resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetWebAclAssociation(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *WebAclAssociationState, opts ...pulumi.ResourceOption) (*WebAclAssociation, error) {
	var resource WebAclAssociation
	err := ctx.ReadResource("aws:wafregional/webAclAssociation:WebAclAssociation", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering WebAclAssociation resources.
type webAclAssociationState struct {
	// ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
	ResourceArn *string `pulumi:"resourceArn"`
	// The ID of the WAF Regional WebACL to create an association.
	WebAclId *string `pulumi:"webAclId"`
}

type WebAclAssociationState struct {
	// ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
	ResourceArn pulumi.StringPtrInput
	// The ID of the WAF Regional WebACL to create an association.
	WebAclId pulumi.StringPtrInput
}

func (WebAclAssociationState) ElementType() reflect.Type {
	return reflect.TypeOf((*webAclAssociationState)(nil)).Elem()
}

type webAclAssociationArgs struct {
	// ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
	ResourceArn string `pulumi:"resourceArn"`
	// The ID of the WAF Regional WebACL to create an association.
	WebAclId string `pulumi:"webAclId"`
}

// The set of arguments for constructing a WebAclAssociation resource.
type WebAclAssociationArgs struct {
	// ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
	ResourceArn pulumi.StringInput
	// The ID of the WAF Regional WebACL to create an association.
	WebAclId pulumi.StringInput
}

func (WebAclAssociationArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*webAclAssociationArgs)(nil)).Elem()
}

type WebAclAssociationInput interface {
	pulumi.Input

	ToWebAclAssociationOutput() WebAclAssociationOutput
	ToWebAclAssociationOutputWithContext(ctx context.Context) WebAclAssociationOutput
}

func (*WebAclAssociation) ElementType() reflect.Type {
	return reflect.TypeOf((**WebAclAssociation)(nil)).Elem()
}

func (i *WebAclAssociation) ToWebAclAssociationOutput() WebAclAssociationOutput {
	return i.ToWebAclAssociationOutputWithContext(context.Background())
}

func (i *WebAclAssociation) ToWebAclAssociationOutputWithContext(ctx context.Context) WebAclAssociationOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAclAssociationOutput)
}

// WebAclAssociationArrayInput is an input type that accepts WebAclAssociationArray and WebAclAssociationArrayOutput values.
// You can construct a concrete instance of `WebAclAssociationArrayInput` via:
//
//	WebAclAssociationArray{ WebAclAssociationArgs{...} }
type WebAclAssociationArrayInput interface {
	pulumi.Input

	ToWebAclAssociationArrayOutput() WebAclAssociationArrayOutput
	ToWebAclAssociationArrayOutputWithContext(context.Context) WebAclAssociationArrayOutput
}

type WebAclAssociationArray []WebAclAssociationInput

func (WebAclAssociationArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebAclAssociation)(nil)).Elem()
}

func (i WebAclAssociationArray) ToWebAclAssociationArrayOutput() WebAclAssociationArrayOutput {
	return i.ToWebAclAssociationArrayOutputWithContext(context.Background())
}

func (i WebAclAssociationArray) ToWebAclAssociationArrayOutputWithContext(ctx context.Context) WebAclAssociationArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAclAssociationArrayOutput)
}

// WebAclAssociationMapInput is an input type that accepts WebAclAssociationMap and WebAclAssociationMapOutput values.
// You can construct a concrete instance of `WebAclAssociationMapInput` via:
//
//	WebAclAssociationMap{ "key": WebAclAssociationArgs{...} }
type WebAclAssociationMapInput interface {
	pulumi.Input

	ToWebAclAssociationMapOutput() WebAclAssociationMapOutput
	ToWebAclAssociationMapOutputWithContext(context.Context) WebAclAssociationMapOutput
}

type WebAclAssociationMap map[string]WebAclAssociationInput

func (WebAclAssociationMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebAclAssociation)(nil)).Elem()
}

func (i WebAclAssociationMap) ToWebAclAssociationMapOutput() WebAclAssociationMapOutput {
	return i.ToWebAclAssociationMapOutputWithContext(context.Background())
}

func (i WebAclAssociationMap) ToWebAclAssociationMapOutputWithContext(ctx context.Context) WebAclAssociationMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(WebAclAssociationMapOutput)
}

type WebAclAssociationOutput struct{ *pulumi.OutputState }

func (WebAclAssociationOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**WebAclAssociation)(nil)).Elem()
}

func (o WebAclAssociationOutput) ToWebAclAssociationOutput() WebAclAssociationOutput {
	return o
}

func (o WebAclAssociationOutput) ToWebAclAssociationOutputWithContext(ctx context.Context) WebAclAssociationOutput {
	return o
}

// ARN of the resource to associate with. For example, an Application Load Balancer or API Gateway Stage.
func (o WebAclAssociationOutput) ResourceArn() pulumi.StringOutput {
	return o.ApplyT(func(v *WebAclAssociation) pulumi.StringOutput { return v.ResourceArn }).(pulumi.StringOutput)
}

// The ID of the WAF Regional WebACL to create an association.
func (o WebAclAssociationOutput) WebAclId() pulumi.StringOutput {
	return o.ApplyT(func(v *WebAclAssociation) pulumi.StringOutput { return v.WebAclId }).(pulumi.StringOutput)
}

type WebAclAssociationArrayOutput struct{ *pulumi.OutputState }

func (WebAclAssociationArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*WebAclAssociation)(nil)).Elem()
}

func (o WebAclAssociationArrayOutput) ToWebAclAssociationArrayOutput() WebAclAssociationArrayOutput {
	return o
}

func (o WebAclAssociationArrayOutput) ToWebAclAssociationArrayOutputWithContext(ctx context.Context) WebAclAssociationArrayOutput {
	return o
}

func (o WebAclAssociationArrayOutput) Index(i pulumi.IntInput) WebAclAssociationOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *WebAclAssociation {
		return vs[0].([]*WebAclAssociation)[vs[1].(int)]
	}).(WebAclAssociationOutput)
}

type WebAclAssociationMapOutput struct{ *pulumi.OutputState }

func (WebAclAssociationMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*WebAclAssociation)(nil)).Elem()
}

func (o WebAclAssociationMapOutput) ToWebAclAssociationMapOutput() WebAclAssociationMapOutput {
	return o
}

func (o WebAclAssociationMapOutput) ToWebAclAssociationMapOutputWithContext(ctx context.Context) WebAclAssociationMapOutput {
	return o
}

func (o WebAclAssociationMapOutput) MapIndex(k pulumi.StringInput) WebAclAssociationOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *WebAclAssociation {
		return vs[0].(map[string]*WebAclAssociation)[vs[1].(string)]
	}).(WebAclAssociationOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*WebAclAssociationInput)(nil)).Elem(), &WebAclAssociation{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebAclAssociationArrayInput)(nil)).Elem(), WebAclAssociationArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*WebAclAssociationMapInput)(nil)).Elem(), WebAclAssociationMap{})
	pulumi.RegisterOutputType(WebAclAssociationOutput{})
	pulumi.RegisterOutputType(WebAclAssociationArrayOutput{})
	pulumi.RegisterOutputType(WebAclAssociationMapOutput{})
}
