// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package lightsail

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Configures Https Redirection for a Lightsail Load Balancer. A valid Certificate must be attached to the load balancer in order to enable https redirection.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lightsail"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			test, err := lightsail.NewLb(ctx, "test", &lightsail.LbArgs{
//				Name:            pulumi.String("test-load-balancer"),
//				HealthCheckPath: pulumi.String("/"),
//				InstancePort:    pulumi.Int(80),
//				Tags: pulumi.StringMap{
//					"foo": pulumi.String("bar"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			testLbCertificate, err := lightsail.NewLbCertificate(ctx, "test", &lightsail.LbCertificateArgs{
//				Name:       pulumi.String("test-load-balancer-certificate"),
//				LbName:     test.ID(),
//				DomainName: pulumi.String("test.com"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = lightsail.NewLbCertificateAttachment(ctx, "test", &lightsail.LbCertificateAttachmentArgs{
//				LbName:          test.Name,
//				CertificateName: testLbCertificate.Name,
//			})
//			if err != nil {
//				return err
//			}
//			_, err = lightsail.NewLbHttpsRedirectionPolicy(ctx, "test", &lightsail.LbHttpsRedirectionPolicyArgs{
//				LbName:  test.Name,
//				Enabled: pulumi.Bool(true),
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
// Using `pulumi import`, import `aws_lightsail_lb_https_redirection_policy` using the `lb_name` attribute. For example:
//
// ```sh
//
//	$ pulumi import aws:lightsail/lbHttpsRedirectionPolicy:LbHttpsRedirectionPolicy test example-load-balancer
//
// ```
type LbHttpsRedirectionPolicy struct {
	pulumi.CustomResourceState

	// The Https Redirection state of the load balancer. `true` to activate http to https redirection or `false` to deactivate http to https redirection.
	Enabled pulumi.BoolOutput `pulumi:"enabled"`
	// The name of the load balancer to which you want to enable http to https redirection.
	LbName pulumi.StringOutput `pulumi:"lbName"`
}

// NewLbHttpsRedirectionPolicy registers a new resource with the given unique name, arguments, and options.
func NewLbHttpsRedirectionPolicy(ctx *pulumi.Context,
	name string, args *LbHttpsRedirectionPolicyArgs, opts ...pulumi.ResourceOption) (*LbHttpsRedirectionPolicy, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Enabled == nil {
		return nil, errors.New("invalid value for required argument 'Enabled'")
	}
	if args.LbName == nil {
		return nil, errors.New("invalid value for required argument 'LbName'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource LbHttpsRedirectionPolicy
	err := ctx.RegisterResource("aws:lightsail/lbHttpsRedirectionPolicy:LbHttpsRedirectionPolicy", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLbHttpsRedirectionPolicy gets an existing LbHttpsRedirectionPolicy resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLbHttpsRedirectionPolicy(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LbHttpsRedirectionPolicyState, opts ...pulumi.ResourceOption) (*LbHttpsRedirectionPolicy, error) {
	var resource LbHttpsRedirectionPolicy
	err := ctx.ReadResource("aws:lightsail/lbHttpsRedirectionPolicy:LbHttpsRedirectionPolicy", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LbHttpsRedirectionPolicy resources.
type lbHttpsRedirectionPolicyState struct {
	// The Https Redirection state of the load balancer. `true` to activate http to https redirection or `false` to deactivate http to https redirection.
	Enabled *bool `pulumi:"enabled"`
	// The name of the load balancer to which you want to enable http to https redirection.
	LbName *string `pulumi:"lbName"`
}

type LbHttpsRedirectionPolicyState struct {
	// The Https Redirection state of the load balancer. `true` to activate http to https redirection or `false` to deactivate http to https redirection.
	Enabled pulumi.BoolPtrInput
	// The name of the load balancer to which you want to enable http to https redirection.
	LbName pulumi.StringPtrInput
}

func (LbHttpsRedirectionPolicyState) ElementType() reflect.Type {
	return reflect.TypeOf((*lbHttpsRedirectionPolicyState)(nil)).Elem()
}

type lbHttpsRedirectionPolicyArgs struct {
	// The Https Redirection state of the load balancer. `true` to activate http to https redirection or `false` to deactivate http to https redirection.
	Enabled bool `pulumi:"enabled"`
	// The name of the load balancer to which you want to enable http to https redirection.
	LbName string `pulumi:"lbName"`
}

// The set of arguments for constructing a LbHttpsRedirectionPolicy resource.
type LbHttpsRedirectionPolicyArgs struct {
	// The Https Redirection state of the load balancer. `true` to activate http to https redirection or `false` to deactivate http to https redirection.
	Enabled pulumi.BoolInput
	// The name of the load balancer to which you want to enable http to https redirection.
	LbName pulumi.StringInput
}

func (LbHttpsRedirectionPolicyArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*lbHttpsRedirectionPolicyArgs)(nil)).Elem()
}

type LbHttpsRedirectionPolicyInput interface {
	pulumi.Input

	ToLbHttpsRedirectionPolicyOutput() LbHttpsRedirectionPolicyOutput
	ToLbHttpsRedirectionPolicyOutputWithContext(ctx context.Context) LbHttpsRedirectionPolicyOutput
}

func (*LbHttpsRedirectionPolicy) ElementType() reflect.Type {
	return reflect.TypeOf((**LbHttpsRedirectionPolicy)(nil)).Elem()
}

func (i *LbHttpsRedirectionPolicy) ToLbHttpsRedirectionPolicyOutput() LbHttpsRedirectionPolicyOutput {
	return i.ToLbHttpsRedirectionPolicyOutputWithContext(context.Background())
}

func (i *LbHttpsRedirectionPolicy) ToLbHttpsRedirectionPolicyOutputWithContext(ctx context.Context) LbHttpsRedirectionPolicyOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LbHttpsRedirectionPolicyOutput)
}

// LbHttpsRedirectionPolicyArrayInput is an input type that accepts LbHttpsRedirectionPolicyArray and LbHttpsRedirectionPolicyArrayOutput values.
// You can construct a concrete instance of `LbHttpsRedirectionPolicyArrayInput` via:
//
//	LbHttpsRedirectionPolicyArray{ LbHttpsRedirectionPolicyArgs{...} }
type LbHttpsRedirectionPolicyArrayInput interface {
	pulumi.Input

	ToLbHttpsRedirectionPolicyArrayOutput() LbHttpsRedirectionPolicyArrayOutput
	ToLbHttpsRedirectionPolicyArrayOutputWithContext(context.Context) LbHttpsRedirectionPolicyArrayOutput
}

type LbHttpsRedirectionPolicyArray []LbHttpsRedirectionPolicyInput

func (LbHttpsRedirectionPolicyArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LbHttpsRedirectionPolicy)(nil)).Elem()
}

func (i LbHttpsRedirectionPolicyArray) ToLbHttpsRedirectionPolicyArrayOutput() LbHttpsRedirectionPolicyArrayOutput {
	return i.ToLbHttpsRedirectionPolicyArrayOutputWithContext(context.Background())
}

func (i LbHttpsRedirectionPolicyArray) ToLbHttpsRedirectionPolicyArrayOutputWithContext(ctx context.Context) LbHttpsRedirectionPolicyArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LbHttpsRedirectionPolicyArrayOutput)
}

// LbHttpsRedirectionPolicyMapInput is an input type that accepts LbHttpsRedirectionPolicyMap and LbHttpsRedirectionPolicyMapOutput values.
// You can construct a concrete instance of `LbHttpsRedirectionPolicyMapInput` via:
//
//	LbHttpsRedirectionPolicyMap{ "key": LbHttpsRedirectionPolicyArgs{...} }
type LbHttpsRedirectionPolicyMapInput interface {
	pulumi.Input

	ToLbHttpsRedirectionPolicyMapOutput() LbHttpsRedirectionPolicyMapOutput
	ToLbHttpsRedirectionPolicyMapOutputWithContext(context.Context) LbHttpsRedirectionPolicyMapOutput
}

type LbHttpsRedirectionPolicyMap map[string]LbHttpsRedirectionPolicyInput

func (LbHttpsRedirectionPolicyMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LbHttpsRedirectionPolicy)(nil)).Elem()
}

func (i LbHttpsRedirectionPolicyMap) ToLbHttpsRedirectionPolicyMapOutput() LbHttpsRedirectionPolicyMapOutput {
	return i.ToLbHttpsRedirectionPolicyMapOutputWithContext(context.Background())
}

func (i LbHttpsRedirectionPolicyMap) ToLbHttpsRedirectionPolicyMapOutputWithContext(ctx context.Context) LbHttpsRedirectionPolicyMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LbHttpsRedirectionPolicyMapOutput)
}

type LbHttpsRedirectionPolicyOutput struct{ *pulumi.OutputState }

func (LbHttpsRedirectionPolicyOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LbHttpsRedirectionPolicy)(nil)).Elem()
}

func (o LbHttpsRedirectionPolicyOutput) ToLbHttpsRedirectionPolicyOutput() LbHttpsRedirectionPolicyOutput {
	return o
}

func (o LbHttpsRedirectionPolicyOutput) ToLbHttpsRedirectionPolicyOutputWithContext(ctx context.Context) LbHttpsRedirectionPolicyOutput {
	return o
}

// The Https Redirection state of the load balancer. `true` to activate http to https redirection or `false` to deactivate http to https redirection.
func (o LbHttpsRedirectionPolicyOutput) Enabled() pulumi.BoolOutput {
	return o.ApplyT(func(v *LbHttpsRedirectionPolicy) pulumi.BoolOutput { return v.Enabled }).(pulumi.BoolOutput)
}

// The name of the load balancer to which you want to enable http to https redirection.
func (o LbHttpsRedirectionPolicyOutput) LbName() pulumi.StringOutput {
	return o.ApplyT(func(v *LbHttpsRedirectionPolicy) pulumi.StringOutput { return v.LbName }).(pulumi.StringOutput)
}

type LbHttpsRedirectionPolicyArrayOutput struct{ *pulumi.OutputState }

func (LbHttpsRedirectionPolicyArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*LbHttpsRedirectionPolicy)(nil)).Elem()
}

func (o LbHttpsRedirectionPolicyArrayOutput) ToLbHttpsRedirectionPolicyArrayOutput() LbHttpsRedirectionPolicyArrayOutput {
	return o
}

func (o LbHttpsRedirectionPolicyArrayOutput) ToLbHttpsRedirectionPolicyArrayOutputWithContext(ctx context.Context) LbHttpsRedirectionPolicyArrayOutput {
	return o
}

func (o LbHttpsRedirectionPolicyArrayOutput) Index(i pulumi.IntInput) LbHttpsRedirectionPolicyOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *LbHttpsRedirectionPolicy {
		return vs[0].([]*LbHttpsRedirectionPolicy)[vs[1].(int)]
	}).(LbHttpsRedirectionPolicyOutput)
}

type LbHttpsRedirectionPolicyMapOutput struct{ *pulumi.OutputState }

func (LbHttpsRedirectionPolicyMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*LbHttpsRedirectionPolicy)(nil)).Elem()
}

func (o LbHttpsRedirectionPolicyMapOutput) ToLbHttpsRedirectionPolicyMapOutput() LbHttpsRedirectionPolicyMapOutput {
	return o
}

func (o LbHttpsRedirectionPolicyMapOutput) ToLbHttpsRedirectionPolicyMapOutputWithContext(ctx context.Context) LbHttpsRedirectionPolicyMapOutput {
	return o
}

func (o LbHttpsRedirectionPolicyMapOutput) MapIndex(k pulumi.StringInput) LbHttpsRedirectionPolicyOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *LbHttpsRedirectionPolicy {
		return vs[0].(map[string]*LbHttpsRedirectionPolicy)[vs[1].(string)]
	}).(LbHttpsRedirectionPolicyOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*LbHttpsRedirectionPolicyInput)(nil)).Elem(), &LbHttpsRedirectionPolicy{})
	pulumi.RegisterInputType(reflect.TypeOf((*LbHttpsRedirectionPolicyArrayInput)(nil)).Elem(), LbHttpsRedirectionPolicyArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*LbHttpsRedirectionPolicyMapInput)(nil)).Elem(), LbHttpsRedirectionPolicyMap{})
	pulumi.RegisterOutputType(LbHttpsRedirectionPolicyOutput{})
	pulumi.RegisterOutputType(LbHttpsRedirectionPolicyArrayOutput{})
	pulumi.RegisterOutputType(LbHttpsRedirectionPolicyMapOutput{})
}
