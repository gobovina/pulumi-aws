// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package alb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Load Balancer Listener Certificate resource.
//
// This resource is for additional certificates and does not replace the default certificate on the listener.
//
// > **Note:** `alb.ListenerCertificate` is known as `lb.ListenerCertificate`. The functionality is identical.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/acm"
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/lb"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		exampleCertificate, err := acm.NewCertificate(ctx, "exampleCertificate", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = lb.NewLoadBalancer(ctx, "frontEndLoadBalancer", nil)
// 		if err != nil {
// 			return err
// 		}
// 		frontEndListener, err := lb.NewListener(ctx, "frontEndListener", nil)
// 		if err != nil {
// 			return err
// 		}
// 		_, err = lb.NewListenerCertificate(ctx, "exampleListenerCertificate", &lb.ListenerCertificateArgs{
// 			ListenerArn:    frontEndListener.Arn,
// 			CertificateArn: exampleCertificate.Arn,
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
// Listener Certificates can be imported using their id, e.g.
//
// ```sh
//  $ pulumi import aws:alb/listenerCertificate:ListenerCertificate example arn:aws:elasticloadbalancing:us-west-2:123456789012:listener/app/test/8e4497da625e2d8a/9ab28ade35828f96/67b3d2d36dd7c26b_arn:aws:iam::123456789012:server-certificate/tf-acc-test-6453083910015726063
// ```
type ListenerCertificate struct {
	pulumi.CustomResourceState

	// The ARN of the certificate to attach to the listener.
	CertificateArn pulumi.StringOutput `pulumi:"certificateArn"`
	// The ARN of the listener to which to attach the certificate.
	ListenerArn pulumi.StringOutput `pulumi:"listenerArn"`
}

// NewListenerCertificate registers a new resource with the given unique name, arguments, and options.
func NewListenerCertificate(ctx *pulumi.Context,
	name string, args *ListenerCertificateArgs, opts ...pulumi.ResourceOption) (*ListenerCertificate, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.CertificateArn == nil {
		return nil, errors.New("invalid value for required argument 'CertificateArn'")
	}
	if args.ListenerArn == nil {
		return nil, errors.New("invalid value for required argument 'ListenerArn'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("aws:applicationloadbalancing/listenerCertificate:ListenerCertificate"),
		},
	})
	opts = append(opts, aliases)
	var resource ListenerCertificate
	err := ctx.RegisterResource("aws:alb/listenerCertificate:ListenerCertificate", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetListenerCertificate gets an existing ListenerCertificate resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetListenerCertificate(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ListenerCertificateState, opts ...pulumi.ResourceOption) (*ListenerCertificate, error) {
	var resource ListenerCertificate
	err := ctx.ReadResource("aws:alb/listenerCertificate:ListenerCertificate", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ListenerCertificate resources.
type listenerCertificateState struct {
	// The ARN of the certificate to attach to the listener.
	CertificateArn *string `pulumi:"certificateArn"`
	// The ARN of the listener to which to attach the certificate.
	ListenerArn *string `pulumi:"listenerArn"`
}

type ListenerCertificateState struct {
	// The ARN of the certificate to attach to the listener.
	CertificateArn pulumi.StringPtrInput
	// The ARN of the listener to which to attach the certificate.
	ListenerArn pulumi.StringPtrInput
}

func (ListenerCertificateState) ElementType() reflect.Type {
	return reflect.TypeOf((*listenerCertificateState)(nil)).Elem()
}

type listenerCertificateArgs struct {
	// The ARN of the certificate to attach to the listener.
	CertificateArn string `pulumi:"certificateArn"`
	// The ARN of the listener to which to attach the certificate.
	ListenerArn string `pulumi:"listenerArn"`
}

// The set of arguments for constructing a ListenerCertificate resource.
type ListenerCertificateArgs struct {
	// The ARN of the certificate to attach to the listener.
	CertificateArn pulumi.StringInput
	// The ARN of the listener to which to attach the certificate.
	ListenerArn pulumi.StringInput
}

func (ListenerCertificateArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*listenerCertificateArgs)(nil)).Elem()
}

type ListenerCertificateInput interface {
	pulumi.Input

	ToListenerCertificateOutput() ListenerCertificateOutput
	ToListenerCertificateOutputWithContext(ctx context.Context) ListenerCertificateOutput
}

func (*ListenerCertificate) ElementType() reflect.Type {
	return reflect.TypeOf((*ListenerCertificate)(nil))
}

func (i *ListenerCertificate) ToListenerCertificateOutput() ListenerCertificateOutput {
	return i.ToListenerCertificateOutputWithContext(context.Background())
}

func (i *ListenerCertificate) ToListenerCertificateOutputWithContext(ctx context.Context) ListenerCertificateOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerCertificateOutput)
}

func (i *ListenerCertificate) ToListenerCertificatePtrOutput() ListenerCertificatePtrOutput {
	return i.ToListenerCertificatePtrOutputWithContext(context.Background())
}

func (i *ListenerCertificate) ToListenerCertificatePtrOutputWithContext(ctx context.Context) ListenerCertificatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerCertificatePtrOutput)
}

type ListenerCertificatePtrInput interface {
	pulumi.Input

	ToListenerCertificatePtrOutput() ListenerCertificatePtrOutput
	ToListenerCertificatePtrOutputWithContext(ctx context.Context) ListenerCertificatePtrOutput
}

type listenerCertificatePtrType ListenerCertificateArgs

func (*listenerCertificatePtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**ListenerCertificate)(nil))
}

func (i *listenerCertificatePtrType) ToListenerCertificatePtrOutput() ListenerCertificatePtrOutput {
	return i.ToListenerCertificatePtrOutputWithContext(context.Background())
}

func (i *listenerCertificatePtrType) ToListenerCertificatePtrOutputWithContext(ctx context.Context) ListenerCertificatePtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerCertificatePtrOutput)
}

// ListenerCertificateArrayInput is an input type that accepts ListenerCertificateArray and ListenerCertificateArrayOutput values.
// You can construct a concrete instance of `ListenerCertificateArrayInput` via:
//
//          ListenerCertificateArray{ ListenerCertificateArgs{...} }
type ListenerCertificateArrayInput interface {
	pulumi.Input

	ToListenerCertificateArrayOutput() ListenerCertificateArrayOutput
	ToListenerCertificateArrayOutputWithContext(context.Context) ListenerCertificateArrayOutput
}

type ListenerCertificateArray []ListenerCertificateInput

func (ListenerCertificateArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*ListenerCertificate)(nil))
}

func (i ListenerCertificateArray) ToListenerCertificateArrayOutput() ListenerCertificateArrayOutput {
	return i.ToListenerCertificateArrayOutputWithContext(context.Background())
}

func (i ListenerCertificateArray) ToListenerCertificateArrayOutputWithContext(ctx context.Context) ListenerCertificateArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerCertificateArrayOutput)
}

// ListenerCertificateMapInput is an input type that accepts ListenerCertificateMap and ListenerCertificateMapOutput values.
// You can construct a concrete instance of `ListenerCertificateMapInput` via:
//
//          ListenerCertificateMap{ "key": ListenerCertificateArgs{...} }
type ListenerCertificateMapInput interface {
	pulumi.Input

	ToListenerCertificateMapOutput() ListenerCertificateMapOutput
	ToListenerCertificateMapOutputWithContext(context.Context) ListenerCertificateMapOutput
}

type ListenerCertificateMap map[string]ListenerCertificateInput

func (ListenerCertificateMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*ListenerCertificate)(nil))
}

func (i ListenerCertificateMap) ToListenerCertificateMapOutput() ListenerCertificateMapOutput {
	return i.ToListenerCertificateMapOutputWithContext(context.Background())
}

func (i ListenerCertificateMap) ToListenerCertificateMapOutputWithContext(ctx context.Context) ListenerCertificateMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerCertificateMapOutput)
}

type ListenerCertificateOutput struct {
	*pulumi.OutputState
}

func (ListenerCertificateOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*ListenerCertificate)(nil))
}

func (o ListenerCertificateOutput) ToListenerCertificateOutput() ListenerCertificateOutput {
	return o
}

func (o ListenerCertificateOutput) ToListenerCertificateOutputWithContext(ctx context.Context) ListenerCertificateOutput {
	return o
}

func (o ListenerCertificateOutput) ToListenerCertificatePtrOutput() ListenerCertificatePtrOutput {
	return o.ToListenerCertificatePtrOutputWithContext(context.Background())
}

func (o ListenerCertificateOutput) ToListenerCertificatePtrOutputWithContext(ctx context.Context) ListenerCertificatePtrOutput {
	return o.ApplyT(func(v ListenerCertificate) *ListenerCertificate {
		return &v
	}).(ListenerCertificatePtrOutput)
}

type ListenerCertificatePtrOutput struct {
	*pulumi.OutputState
}

func (ListenerCertificatePtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ListenerCertificate)(nil))
}

func (o ListenerCertificatePtrOutput) ToListenerCertificatePtrOutput() ListenerCertificatePtrOutput {
	return o
}

func (o ListenerCertificatePtrOutput) ToListenerCertificatePtrOutputWithContext(ctx context.Context) ListenerCertificatePtrOutput {
	return o
}

type ListenerCertificateArrayOutput struct{ *pulumi.OutputState }

func (ListenerCertificateArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]ListenerCertificate)(nil))
}

func (o ListenerCertificateArrayOutput) ToListenerCertificateArrayOutput() ListenerCertificateArrayOutput {
	return o
}

func (o ListenerCertificateArrayOutput) ToListenerCertificateArrayOutputWithContext(ctx context.Context) ListenerCertificateArrayOutput {
	return o
}

func (o ListenerCertificateArrayOutput) Index(i pulumi.IntInput) ListenerCertificateOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) ListenerCertificate {
		return vs[0].([]ListenerCertificate)[vs[1].(int)]
	}).(ListenerCertificateOutput)
}

type ListenerCertificateMapOutput struct{ *pulumi.OutputState }

func (ListenerCertificateMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]ListenerCertificate)(nil))
}

func (o ListenerCertificateMapOutput) ToListenerCertificateMapOutput() ListenerCertificateMapOutput {
	return o
}

func (o ListenerCertificateMapOutput) ToListenerCertificateMapOutputWithContext(ctx context.Context) ListenerCertificateMapOutput {
	return o
}

func (o ListenerCertificateMapOutput) MapIndex(k pulumi.StringInput) ListenerCertificateOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) ListenerCertificate {
		return vs[0].(map[string]ListenerCertificate)[vs[1].(string)]
	}).(ListenerCertificateOutput)
}

func init() {
	pulumi.RegisterOutputType(ListenerCertificateOutput{})
	pulumi.RegisterOutputType(ListenerCertificatePtrOutput{})
	pulumi.RegisterOutputType(ListenerCertificateArrayOutput{})
	pulumi.RegisterOutputType(ListenerCertificateMapOutput{})
}
