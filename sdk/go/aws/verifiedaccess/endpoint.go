// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package verifiedaccess

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Resource for managing an AWS EC2 (Elastic Compute Cloud) Verified Access Endpoint.
//
// ## Example Usage
// ### ALB Example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/verifiedaccess"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := verifiedaccess.NewEndpoint(ctx, "example", &verifiedaccess.EndpointArgs{
//				ApplicationDomain:    pulumi.String("example.com"),
//				AttachmentType:       pulumi.String("vpc"),
//				Description:          pulumi.String("example"),
//				DomainCertificateArn: pulumi.Any(aws_acm_certificate.Example.Arn),
//				EndpointDomainPrefix: pulumi.String("example"),
//				EndpointType:         pulumi.String("load-balancer"),
//				LoadBalancerOptions: &verifiedaccess.EndpointLoadBalancerOptionsArgs{
//					LoadBalancerArn: pulumi.Any(aws_lb.Example.Arn),
//					Port:            pulumi.Int(443),
//					Protocol:        pulumi.String("https"),
//					SubnetIds:       "TODO: For expression",
//				},
//				SecurityGroupIds: pulumi.StringArray{
//					aws_security_group.Example.Id,
//				},
//				VerifiedAccessGroupId: pulumi.Any(aws_verifiedaccess_group.Example.Id),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
// ### Network Interface Example
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/verifiedaccess"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := verifiedaccess.NewEndpoint(ctx, "example", &verifiedaccess.EndpointArgs{
//				ApplicationDomain:    pulumi.String("example.com"),
//				AttachmentType:       pulumi.String("vpc"),
//				Description:          pulumi.String("example"),
//				DomainCertificateArn: pulumi.Any(aws_acm_certificate.Example.Arn),
//				EndpointDomainPrefix: pulumi.String("example"),
//				EndpointType:         pulumi.String("network-interface"),
//				NetworkInterfaceOptions: &verifiedaccess.EndpointNetworkInterfaceOptionsArgs{
//					NetworkInterfaceId: pulumi.Any(aws_network_interface.Example.Id),
//					Port:               pulumi.Int(443),
//					Protocol:           pulumi.String("https"),
//				},
//				SecurityGroupIds: pulumi.StringArray{
//					aws_security_group.Example.Id,
//				},
//				VerifiedAccessGroupId: pulumi.Any(aws_verifiedaccess_group.Example.Id),
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
// # Using `pulumi import`, import Verified Access Instances using the
//
// `id`. For example:
//
// ```sh
//
//	$ pulumi import aws:verifiedaccess/endpoint:Endpoint example vae-8012925589
//
// ```
type Endpoint struct {
	pulumi.CustomResourceState

	// The DNS name for users to reach your application.
	ApplicationDomain pulumi.StringOutput `pulumi:"applicationDomain"`
	// The type of attachment. Currently, only `vpc` is supported.
	AttachmentType pulumi.StringOutput `pulumi:"attachmentType"`
	// A description for the Verified Access endpoint.
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// Returned if endpoint has a device trust provider attached.
	DeviceValidationDomain pulumi.StringOutput `pulumi:"deviceValidationDomain"`
	// The ARN of the public TLS/SSL certificate in AWS Certificate Manager to associate with the endpoint. The CN in the certificate must match the DNS name your end users will use to reach your application.
	DomainCertificateArn pulumi.StringOutput `pulumi:"domainCertificateArn"`
	// A DNS name that is generated for the endpoint.
	EndpointDomain pulumi.StringOutput `pulumi:"endpointDomain"`
	// A custom identifier that is prepended to the DNS name that is generated for the endpoint.
	EndpointDomainPrefix pulumi.StringOutput `pulumi:"endpointDomainPrefix"`
	// The type of Verified Access endpoint to create. Currently `load-balancer` or `network-interface` are supported.
	EndpointType pulumi.StringOutput `pulumi:"endpointType"`
	// The load balancer details. This parameter is required if the endpoint type is `load-balancer`.
	LoadBalancerOptions EndpointLoadBalancerOptionsPtrOutput `pulumi:"loadBalancerOptions"`
	// The network interface details. This parameter is required if the endpoint type is `network-interface`.
	NetworkInterfaceOptions EndpointNetworkInterfaceOptionsPtrOutput `pulumi:"networkInterfaceOptions"`
	// The policy document that is associated with this resource.
	PolicyDocument pulumi.StringPtrOutput `pulumi:"policyDocument"`
	// List of the the security groups IDs to associate with the Verified Access endpoint.
	SecurityGroupIds pulumi.StringArrayOutput `pulumi:"securityGroupIds"`
	// The options in use for server side encryption.
	SseSpecification EndpointSseSpecificationOutput `pulumi:"sseSpecification"`
	// Key-value tags for the Verified Access Endpoint. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
	// The ID of the Verified Access group to associate the endpoint with.
	//
	// The following arguments are optional:
	VerifiedAccessGroupId    pulumi.StringOutput `pulumi:"verifiedAccessGroupId"`
	VerifiedAccessInstanceId pulumi.StringOutput `pulumi:"verifiedAccessInstanceId"`
}

// NewEndpoint registers a new resource with the given unique name, arguments, and options.
func NewEndpoint(ctx *pulumi.Context,
	name string, args *EndpointArgs, opts ...pulumi.ResourceOption) (*Endpoint, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.ApplicationDomain == nil {
		return nil, errors.New("invalid value for required argument 'ApplicationDomain'")
	}
	if args.AttachmentType == nil {
		return nil, errors.New("invalid value for required argument 'AttachmentType'")
	}
	if args.DomainCertificateArn == nil {
		return nil, errors.New("invalid value for required argument 'DomainCertificateArn'")
	}
	if args.EndpointDomainPrefix == nil {
		return nil, errors.New("invalid value for required argument 'EndpointDomainPrefix'")
	}
	if args.EndpointType == nil {
		return nil, errors.New("invalid value for required argument 'EndpointType'")
	}
	if args.VerifiedAccessGroupId == nil {
		return nil, errors.New("invalid value for required argument 'VerifiedAccessGroupId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Endpoint
	err := ctx.RegisterResource("aws:verifiedaccess/endpoint:Endpoint", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetEndpoint gets an existing Endpoint resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetEndpoint(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *EndpointState, opts ...pulumi.ResourceOption) (*Endpoint, error) {
	var resource Endpoint
	err := ctx.ReadResource("aws:verifiedaccess/endpoint:Endpoint", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Endpoint resources.
type endpointState struct {
	// The DNS name for users to reach your application.
	ApplicationDomain *string `pulumi:"applicationDomain"`
	// The type of attachment. Currently, only `vpc` is supported.
	AttachmentType *string `pulumi:"attachmentType"`
	// A description for the Verified Access endpoint.
	Description *string `pulumi:"description"`
	// Returned if endpoint has a device trust provider attached.
	DeviceValidationDomain *string `pulumi:"deviceValidationDomain"`
	// The ARN of the public TLS/SSL certificate in AWS Certificate Manager to associate with the endpoint. The CN in the certificate must match the DNS name your end users will use to reach your application.
	DomainCertificateArn *string `pulumi:"domainCertificateArn"`
	// A DNS name that is generated for the endpoint.
	EndpointDomain *string `pulumi:"endpointDomain"`
	// A custom identifier that is prepended to the DNS name that is generated for the endpoint.
	EndpointDomainPrefix *string `pulumi:"endpointDomainPrefix"`
	// The type of Verified Access endpoint to create. Currently `load-balancer` or `network-interface` are supported.
	EndpointType *string `pulumi:"endpointType"`
	// The load balancer details. This parameter is required if the endpoint type is `load-balancer`.
	LoadBalancerOptions *EndpointLoadBalancerOptions `pulumi:"loadBalancerOptions"`
	// The network interface details. This parameter is required if the endpoint type is `network-interface`.
	NetworkInterfaceOptions *EndpointNetworkInterfaceOptions `pulumi:"networkInterfaceOptions"`
	// The policy document that is associated with this resource.
	PolicyDocument *string `pulumi:"policyDocument"`
	// List of the the security groups IDs to associate with the Verified Access endpoint.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The options in use for server side encryption.
	SseSpecification *EndpointSseSpecification `pulumi:"sseSpecification"`
	// Key-value tags for the Verified Access Endpoint. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The ID of the Verified Access group to associate the endpoint with.
	//
	// The following arguments are optional:
	VerifiedAccessGroupId    *string `pulumi:"verifiedAccessGroupId"`
	VerifiedAccessInstanceId *string `pulumi:"verifiedAccessInstanceId"`
}

type EndpointState struct {
	// The DNS name for users to reach your application.
	ApplicationDomain pulumi.StringPtrInput
	// The type of attachment. Currently, only `vpc` is supported.
	AttachmentType pulumi.StringPtrInput
	// A description for the Verified Access endpoint.
	Description pulumi.StringPtrInput
	// Returned if endpoint has a device trust provider attached.
	DeviceValidationDomain pulumi.StringPtrInput
	// The ARN of the public TLS/SSL certificate in AWS Certificate Manager to associate with the endpoint. The CN in the certificate must match the DNS name your end users will use to reach your application.
	DomainCertificateArn pulumi.StringPtrInput
	// A DNS name that is generated for the endpoint.
	EndpointDomain pulumi.StringPtrInput
	// A custom identifier that is prepended to the DNS name that is generated for the endpoint.
	EndpointDomainPrefix pulumi.StringPtrInput
	// The type of Verified Access endpoint to create. Currently `load-balancer` or `network-interface` are supported.
	EndpointType pulumi.StringPtrInput
	// The load balancer details. This parameter is required if the endpoint type is `load-balancer`.
	LoadBalancerOptions EndpointLoadBalancerOptionsPtrInput
	// The network interface details. This parameter is required if the endpoint type is `network-interface`.
	NetworkInterfaceOptions EndpointNetworkInterfaceOptionsPtrInput
	// The policy document that is associated with this resource.
	PolicyDocument pulumi.StringPtrInput
	// List of the the security groups IDs to associate with the Verified Access endpoint.
	SecurityGroupIds pulumi.StringArrayInput
	// The options in use for server side encryption.
	SseSpecification EndpointSseSpecificationPtrInput
	// Key-value tags for the Verified Access Endpoint. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
	// The ID of the Verified Access group to associate the endpoint with.
	//
	// The following arguments are optional:
	VerifiedAccessGroupId    pulumi.StringPtrInput
	VerifiedAccessInstanceId pulumi.StringPtrInput
}

func (EndpointState) ElementType() reflect.Type {
	return reflect.TypeOf((*endpointState)(nil)).Elem()
}

type endpointArgs struct {
	// The DNS name for users to reach your application.
	ApplicationDomain string `pulumi:"applicationDomain"`
	// The type of attachment. Currently, only `vpc` is supported.
	AttachmentType string `pulumi:"attachmentType"`
	// A description for the Verified Access endpoint.
	Description *string `pulumi:"description"`
	// The ARN of the public TLS/SSL certificate in AWS Certificate Manager to associate with the endpoint. The CN in the certificate must match the DNS name your end users will use to reach your application.
	DomainCertificateArn string `pulumi:"domainCertificateArn"`
	// A custom identifier that is prepended to the DNS name that is generated for the endpoint.
	EndpointDomainPrefix string `pulumi:"endpointDomainPrefix"`
	// The type of Verified Access endpoint to create. Currently `load-balancer` or `network-interface` are supported.
	EndpointType string `pulumi:"endpointType"`
	// The load balancer details. This parameter is required if the endpoint type is `load-balancer`.
	LoadBalancerOptions *EndpointLoadBalancerOptions `pulumi:"loadBalancerOptions"`
	// The network interface details. This parameter is required if the endpoint type is `network-interface`.
	NetworkInterfaceOptions *EndpointNetworkInterfaceOptions `pulumi:"networkInterfaceOptions"`
	// The policy document that is associated with this resource.
	PolicyDocument *string `pulumi:"policyDocument"`
	// List of the the security groups IDs to associate with the Verified Access endpoint.
	SecurityGroupIds []string `pulumi:"securityGroupIds"`
	// The options in use for server side encryption.
	SseSpecification *EndpointSseSpecification `pulumi:"sseSpecification"`
	// Key-value tags for the Verified Access Endpoint. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags map[string]string `pulumi:"tags"`
	// The ID of the Verified Access group to associate the endpoint with.
	//
	// The following arguments are optional:
	VerifiedAccessGroupId string `pulumi:"verifiedAccessGroupId"`
}

// The set of arguments for constructing a Endpoint resource.
type EndpointArgs struct {
	// The DNS name for users to reach your application.
	ApplicationDomain pulumi.StringInput
	// The type of attachment. Currently, only `vpc` is supported.
	AttachmentType pulumi.StringInput
	// A description for the Verified Access endpoint.
	Description pulumi.StringPtrInput
	// The ARN of the public TLS/SSL certificate in AWS Certificate Manager to associate with the endpoint. The CN in the certificate must match the DNS name your end users will use to reach your application.
	DomainCertificateArn pulumi.StringInput
	// A custom identifier that is prepended to the DNS name that is generated for the endpoint.
	EndpointDomainPrefix pulumi.StringInput
	// The type of Verified Access endpoint to create. Currently `load-balancer` or `network-interface` are supported.
	EndpointType pulumi.StringInput
	// The load balancer details. This parameter is required if the endpoint type is `load-balancer`.
	LoadBalancerOptions EndpointLoadBalancerOptionsPtrInput
	// The network interface details. This parameter is required if the endpoint type is `network-interface`.
	NetworkInterfaceOptions EndpointNetworkInterfaceOptionsPtrInput
	// The policy document that is associated with this resource.
	PolicyDocument pulumi.StringPtrInput
	// List of the the security groups IDs to associate with the Verified Access endpoint.
	SecurityGroupIds pulumi.StringArrayInput
	// The options in use for server side encryption.
	SseSpecification EndpointSseSpecificationPtrInput
	// Key-value tags for the Verified Access Endpoint. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	Tags pulumi.StringMapInput
	// The ID of the Verified Access group to associate the endpoint with.
	//
	// The following arguments are optional:
	VerifiedAccessGroupId pulumi.StringInput
}

func (EndpointArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*endpointArgs)(nil)).Elem()
}

type EndpointInput interface {
	pulumi.Input

	ToEndpointOutput() EndpointOutput
	ToEndpointOutputWithContext(ctx context.Context) EndpointOutput
}

func (*Endpoint) ElementType() reflect.Type {
	return reflect.TypeOf((**Endpoint)(nil)).Elem()
}

func (i *Endpoint) ToEndpointOutput() EndpointOutput {
	return i.ToEndpointOutputWithContext(context.Background())
}

func (i *Endpoint) ToEndpointOutputWithContext(ctx context.Context) EndpointOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointOutput)
}

// EndpointArrayInput is an input type that accepts EndpointArray and EndpointArrayOutput values.
// You can construct a concrete instance of `EndpointArrayInput` via:
//
//	EndpointArray{ EndpointArgs{...} }
type EndpointArrayInput interface {
	pulumi.Input

	ToEndpointArrayOutput() EndpointArrayOutput
	ToEndpointArrayOutputWithContext(context.Context) EndpointArrayOutput
}

type EndpointArray []EndpointInput

func (EndpointArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Endpoint)(nil)).Elem()
}

func (i EndpointArray) ToEndpointArrayOutput() EndpointArrayOutput {
	return i.ToEndpointArrayOutputWithContext(context.Background())
}

func (i EndpointArray) ToEndpointArrayOutputWithContext(ctx context.Context) EndpointArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointArrayOutput)
}

// EndpointMapInput is an input type that accepts EndpointMap and EndpointMapOutput values.
// You can construct a concrete instance of `EndpointMapInput` via:
//
//	EndpointMap{ "key": EndpointArgs{...} }
type EndpointMapInput interface {
	pulumi.Input

	ToEndpointMapOutput() EndpointMapOutput
	ToEndpointMapOutputWithContext(context.Context) EndpointMapOutput
}

type EndpointMap map[string]EndpointInput

func (EndpointMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Endpoint)(nil)).Elem()
}

func (i EndpointMap) ToEndpointMapOutput() EndpointMapOutput {
	return i.ToEndpointMapOutputWithContext(context.Background())
}

func (i EndpointMap) ToEndpointMapOutputWithContext(ctx context.Context) EndpointMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(EndpointMapOutput)
}

type EndpointOutput struct{ *pulumi.OutputState }

func (EndpointOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Endpoint)(nil)).Elem()
}

func (o EndpointOutput) ToEndpointOutput() EndpointOutput {
	return o
}

func (o EndpointOutput) ToEndpointOutputWithContext(ctx context.Context) EndpointOutput {
	return o
}

// The DNS name for users to reach your application.
func (o EndpointOutput) ApplicationDomain() pulumi.StringOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringOutput { return v.ApplicationDomain }).(pulumi.StringOutput)
}

// The type of attachment. Currently, only `vpc` is supported.
func (o EndpointOutput) AttachmentType() pulumi.StringOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringOutput { return v.AttachmentType }).(pulumi.StringOutput)
}

// A description for the Verified Access endpoint.
func (o EndpointOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// Returned if endpoint has a device trust provider attached.
func (o EndpointOutput) DeviceValidationDomain() pulumi.StringOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringOutput { return v.DeviceValidationDomain }).(pulumi.StringOutput)
}

// The ARN of the public TLS/SSL certificate in AWS Certificate Manager to associate with the endpoint. The CN in the certificate must match the DNS name your end users will use to reach your application.
func (o EndpointOutput) DomainCertificateArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringOutput { return v.DomainCertificateArn }).(pulumi.StringOutput)
}

// A DNS name that is generated for the endpoint.
func (o EndpointOutput) EndpointDomain() pulumi.StringOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringOutput { return v.EndpointDomain }).(pulumi.StringOutput)
}

// A custom identifier that is prepended to the DNS name that is generated for the endpoint.
func (o EndpointOutput) EndpointDomainPrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringOutput { return v.EndpointDomainPrefix }).(pulumi.StringOutput)
}

// The type of Verified Access endpoint to create. Currently `load-balancer` or `network-interface` are supported.
func (o EndpointOutput) EndpointType() pulumi.StringOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringOutput { return v.EndpointType }).(pulumi.StringOutput)
}

// The load balancer details. This parameter is required if the endpoint type is `load-balancer`.
func (o EndpointOutput) LoadBalancerOptions() EndpointLoadBalancerOptionsPtrOutput {
	return o.ApplyT(func(v *Endpoint) EndpointLoadBalancerOptionsPtrOutput { return v.LoadBalancerOptions }).(EndpointLoadBalancerOptionsPtrOutput)
}

// The network interface details. This parameter is required if the endpoint type is `network-interface`.
func (o EndpointOutput) NetworkInterfaceOptions() EndpointNetworkInterfaceOptionsPtrOutput {
	return o.ApplyT(func(v *Endpoint) EndpointNetworkInterfaceOptionsPtrOutput { return v.NetworkInterfaceOptions }).(EndpointNetworkInterfaceOptionsPtrOutput)
}

// The policy document that is associated with this resource.
func (o EndpointOutput) PolicyDocument() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringPtrOutput { return v.PolicyDocument }).(pulumi.StringPtrOutput)
}

// List of the the security groups IDs to associate with the Verified Access endpoint.
func (o EndpointOutput) SecurityGroupIds() pulumi.StringArrayOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringArrayOutput { return v.SecurityGroupIds }).(pulumi.StringArrayOutput)
}

// The options in use for server side encryption.
func (o EndpointOutput) SseSpecification() EndpointSseSpecificationOutput {
	return o.ApplyT(func(v *Endpoint) EndpointSseSpecificationOutput { return v.SseSpecification }).(EndpointSseSpecificationOutput)
}

// Key-value tags for the Verified Access Endpoint. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
func (o EndpointOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// Deprecated: Please use `tags` instead.
func (o EndpointOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

// The ID of the Verified Access group to associate the endpoint with.
//
// The following arguments are optional:
func (o EndpointOutput) VerifiedAccessGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringOutput { return v.VerifiedAccessGroupId }).(pulumi.StringOutput)
}

func (o EndpointOutput) VerifiedAccessInstanceId() pulumi.StringOutput {
	return o.ApplyT(func(v *Endpoint) pulumi.StringOutput { return v.VerifiedAccessInstanceId }).(pulumi.StringOutput)
}

type EndpointArrayOutput struct{ *pulumi.OutputState }

func (EndpointArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Endpoint)(nil)).Elem()
}

func (o EndpointArrayOutput) ToEndpointArrayOutput() EndpointArrayOutput {
	return o
}

func (o EndpointArrayOutput) ToEndpointArrayOutputWithContext(ctx context.Context) EndpointArrayOutput {
	return o
}

func (o EndpointArrayOutput) Index(i pulumi.IntInput) EndpointOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Endpoint {
		return vs[0].([]*Endpoint)[vs[1].(int)]
	}).(EndpointOutput)
}

type EndpointMapOutput struct{ *pulumi.OutputState }

func (EndpointMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Endpoint)(nil)).Elem()
}

func (o EndpointMapOutput) ToEndpointMapOutput() EndpointMapOutput {
	return o
}

func (o EndpointMapOutput) ToEndpointMapOutputWithContext(ctx context.Context) EndpointMapOutput {
	return o
}

func (o EndpointMapOutput) MapIndex(k pulumi.StringInput) EndpointOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Endpoint {
		return vs[0].(map[string]*Endpoint)[vs[1].(string)]
	}).(EndpointOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*EndpointInput)(nil)).Elem(), &Endpoint{})
	pulumi.RegisterInputType(reflect.TypeOf((*EndpointArrayInput)(nil)).Elem(), EndpointArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*EndpointMapInput)(nil)).Elem(), EndpointMap{})
	pulumi.RegisterOutputType(EndpointOutput{})
	pulumi.RegisterOutputType(EndpointArrayOutput{})
	pulumi.RegisterOutputType(EndpointMapOutput{})
}
