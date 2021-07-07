// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package elb

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides an Elastic Load Balancer resource, also known as a "Classic
// Load Balancer" after the release of
// `Application/Network Load Balancers`.
//
// > **NOTE on ELB Instances and ELB Attachments:** This provider currently
// provides both a standalone ELB Attachment resource
// (describing an instance attached to an ELB), and an ELB resource with
// `instances` defined in-line. At this time you cannot use an ELB with in-line
// instances in conjunction with a ELB Attachment resources. Doing so will cause a
// conflict and will overwrite attachments.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-aws/sdk/v4/go/aws/elb"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		_, err := elb.NewLoadBalancer(ctx, "bar", &elb.LoadBalancerArgs{
// 			AvailabilityZones: pulumi.StringArray{
// 				pulumi.String("us-west-2a"),
// 				pulumi.String("us-west-2b"),
// 				pulumi.String("us-west-2c"),
// 			},
// 			AccessLogs: &elb.LoadBalancerAccessLogsArgs{
// 				Bucket:       pulumi.String("foo"),
// 				BucketPrefix: pulumi.String("bar"),
// 				Interval:     pulumi.Int(60),
// 			},
// 			Listeners: elb.LoadBalancerListenerArray{
// 				&elb.LoadBalancerListenerArgs{
// 					InstancePort:     pulumi.Int(8000),
// 					InstanceProtocol: pulumi.String("http"),
// 					LbPort:           pulumi.Int(80),
// 					LbProtocol:       pulumi.String("http"),
// 				},
// 				&elb.LoadBalancerListenerArgs{
// 					InstancePort:     pulumi.Int(8000),
// 					InstanceProtocol: pulumi.String("http"),
// 					LbPort:           pulumi.Int(443),
// 					LbProtocol:       pulumi.String("https"),
// 					SslCertificateId: pulumi.String("arn:aws:iam::123456789012:server-certificate/certName"),
// 				},
// 			},
// 			HealthCheck: &elb.LoadBalancerHealthCheckArgs{
// 				HealthyThreshold:   pulumi.Int(2),
// 				UnhealthyThreshold: pulumi.Int(2),
// 				Timeout:            pulumi.Int(3),
// 				Target:             pulumi.String("HTTP:8000/"),
// 				Interval:           pulumi.Int(30),
// 			},
// 			Instances: pulumi.StringArray{
// 				pulumi.Any(aws_instance.Foo.Id),
// 			},
// 			CrossZoneLoadBalancing:    pulumi.Bool(true),
// 			IdleTimeout:               pulumi.Int(400),
// 			ConnectionDraining:        pulumi.Bool(true),
// 			ConnectionDrainingTimeout: pulumi.Int(400),
// 			Tags: pulumi.StringMap{
// 				"Name": pulumi.String("foobar-elb"),
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
// ## Note on ECDSA Key Algorithm
//
// If the ARN of the `sslCertificateId` that is pointed to references a
// certificate that was signed by an ECDSA key, note that ELB only supports the
// P256 and P384 curves.  Using a certificate signed by a key using a different
// curve could produce the error `ERR_SSL_VERSION_OR_CIPHER_MISMATCH` in your
// browser.
//
// ## Import
//
// ELBs can be imported using the `name`, e.g.
//
// ```sh
//  $ pulumi import aws:elb/loadBalancer:LoadBalancer bar elb-production-12345
// ```
type LoadBalancer struct {
	pulumi.CustomResourceState

	// An Access Logs block. Access Logs documented below.
	AccessLogs LoadBalancerAccessLogsPtrOutput `pulumi:"accessLogs"`
	// The ARN of the ELB
	Arn pulumi.StringOutput `pulumi:"arn"`
	// The AZ's to serve traffic in.
	AvailabilityZones pulumi.StringArrayOutput `pulumi:"availabilityZones"`
	// Boolean to enable connection draining. Default: `false`
	ConnectionDraining pulumi.BoolPtrOutput `pulumi:"connectionDraining"`
	// The time in seconds to allow for connections to drain. Default: `300`
	ConnectionDrainingTimeout pulumi.IntPtrOutput `pulumi:"connectionDrainingTimeout"`
	// Enable cross-zone load balancing. Default: `true`
	CrossZoneLoadBalancing pulumi.BoolPtrOutput `pulumi:"crossZoneLoadBalancing"`
	// The DNS name of the ELB
	DnsName pulumi.StringOutput `pulumi:"dnsName"`
	// A healthCheck block. Health Check documented below.
	HealthCheck LoadBalancerHealthCheckOutput `pulumi:"healthCheck"`
	// The time in seconds that the connection is allowed to be idle. Default: `60`
	IdleTimeout pulumi.IntPtrOutput `pulumi:"idleTimeout"`
	// A list of instance ids to place in the ELB pool.
	Instances pulumi.StringArrayOutput `pulumi:"instances"`
	// If true, ELB will be an internal ELB.
	Internal pulumi.BoolOutput `pulumi:"internal"`
	// A list of listener blocks. Listeners documented below.
	Listeners LoadBalancerListenerArrayOutput `pulumi:"listeners"`
	// The name of the ELB. By default generated by this provider.
	Name pulumi.StringOutput `pulumi:"name"`
	// Creates a unique name beginning with the specified
	// prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrOutput `pulumi:"namePrefix"`
	// A list of security group IDs to assign to the ELB.
	// Only valid if creating an ELB within a VPC
	SecurityGroups pulumi.StringArrayOutput `pulumi:"securityGroups"`
	// The name of the security group that you can use as
	// part of your inbound rules for your load balancer's back-end application
	// instances. Use this for Classic or Default VPC only.
	SourceSecurityGroup pulumi.StringOutput `pulumi:"sourceSecurityGroup"`
	// The ID of the security group that you can use as
	// part of your inbound rules for your load balancer's back-end application
	// instances. Only available on ELBs launched in a VPC.
	SourceSecurityGroupId pulumi.StringOutput `pulumi:"sourceSecurityGroupId"`
	// A list of subnet IDs to attach to the ELB.
	Subnets pulumi.StringArrayOutput `pulumi:"subnets"`
	Tags    pulumi.StringMapOutput   `pulumi:"tags"`
	TagsAll pulumi.StringMapOutput   `pulumi:"tagsAll"`
	// The canonical hosted zone ID of the ELB (to be used in a Route 53 Alias record)
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewLoadBalancer registers a new resource with the given unique name, arguments, and options.
func NewLoadBalancer(ctx *pulumi.Context,
	name string, args *LoadBalancerArgs, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Listeners == nil {
		return nil, errors.New("invalid value for required argument 'Listeners'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("aws:elasticloadbalancing/loadBalancer:LoadBalancer"),
		},
	})
	opts = append(opts, aliases)
	var resource LoadBalancer
	err := ctx.RegisterResource("aws:elb/loadBalancer:LoadBalancer", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetLoadBalancer gets an existing LoadBalancer resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetLoadBalancer(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *LoadBalancerState, opts ...pulumi.ResourceOption) (*LoadBalancer, error) {
	var resource LoadBalancer
	err := ctx.ReadResource("aws:elb/loadBalancer:LoadBalancer", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering LoadBalancer resources.
type loadBalancerState struct {
	// An Access Logs block. Access Logs documented below.
	AccessLogs *LoadBalancerAccessLogs `pulumi:"accessLogs"`
	// The ARN of the ELB
	Arn *string `pulumi:"arn"`
	// The AZ's to serve traffic in.
	AvailabilityZones []string `pulumi:"availabilityZones"`
	// Boolean to enable connection draining. Default: `false`
	ConnectionDraining *bool `pulumi:"connectionDraining"`
	// The time in seconds to allow for connections to drain. Default: `300`
	ConnectionDrainingTimeout *int `pulumi:"connectionDrainingTimeout"`
	// Enable cross-zone load balancing. Default: `true`
	CrossZoneLoadBalancing *bool `pulumi:"crossZoneLoadBalancing"`
	// The DNS name of the ELB
	DnsName *string `pulumi:"dnsName"`
	// A healthCheck block. Health Check documented below.
	HealthCheck *LoadBalancerHealthCheck `pulumi:"healthCheck"`
	// The time in seconds that the connection is allowed to be idle. Default: `60`
	IdleTimeout *int `pulumi:"idleTimeout"`
	// A list of instance ids to place in the ELB pool.
	Instances []string `pulumi:"instances"`
	// If true, ELB will be an internal ELB.
	Internal *bool `pulumi:"internal"`
	// A list of listener blocks. Listeners documented below.
	Listeners []LoadBalancerListener `pulumi:"listeners"`
	// The name of the ELB. By default generated by this provider.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified
	// prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// A list of security group IDs to assign to the ELB.
	// Only valid if creating an ELB within a VPC
	SecurityGroups []string `pulumi:"securityGroups"`
	// The name of the security group that you can use as
	// part of your inbound rules for your load balancer's back-end application
	// instances. Use this for Classic or Default VPC only.
	SourceSecurityGroup *string `pulumi:"sourceSecurityGroup"`
	// The ID of the security group that you can use as
	// part of your inbound rules for your load balancer's back-end application
	// instances. Only available on ELBs launched in a VPC.
	SourceSecurityGroupId *string `pulumi:"sourceSecurityGroupId"`
	// A list of subnet IDs to attach to the ELB.
	Subnets []string          `pulumi:"subnets"`
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
	// The canonical hosted zone ID of the ELB (to be used in a Route 53 Alias record)
	ZoneId *string `pulumi:"zoneId"`
}

type LoadBalancerState struct {
	// An Access Logs block. Access Logs documented below.
	AccessLogs LoadBalancerAccessLogsPtrInput
	// The ARN of the ELB
	Arn pulumi.StringPtrInput
	// The AZ's to serve traffic in.
	AvailabilityZones pulumi.StringArrayInput
	// Boolean to enable connection draining. Default: `false`
	ConnectionDraining pulumi.BoolPtrInput
	// The time in seconds to allow for connections to drain. Default: `300`
	ConnectionDrainingTimeout pulumi.IntPtrInput
	// Enable cross-zone load balancing. Default: `true`
	CrossZoneLoadBalancing pulumi.BoolPtrInput
	// The DNS name of the ELB
	DnsName pulumi.StringPtrInput
	// A healthCheck block. Health Check documented below.
	HealthCheck LoadBalancerHealthCheckPtrInput
	// The time in seconds that the connection is allowed to be idle. Default: `60`
	IdleTimeout pulumi.IntPtrInput
	// A list of instance ids to place in the ELB pool.
	Instances pulumi.StringArrayInput
	// If true, ELB will be an internal ELB.
	Internal pulumi.BoolPtrInput
	// A list of listener blocks. Listeners documented below.
	Listeners LoadBalancerListenerArrayInput
	// The name of the ELB. By default generated by this provider.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified
	// prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// A list of security group IDs to assign to the ELB.
	// Only valid if creating an ELB within a VPC
	SecurityGroups pulumi.StringArrayInput
	// The name of the security group that you can use as
	// part of your inbound rules for your load balancer's back-end application
	// instances. Use this for Classic or Default VPC only.
	SourceSecurityGroup pulumi.StringPtrInput
	// The ID of the security group that you can use as
	// part of your inbound rules for your load balancer's back-end application
	// instances. Only available on ELBs launched in a VPC.
	SourceSecurityGroupId pulumi.StringPtrInput
	// A list of subnet IDs to attach to the ELB.
	Subnets pulumi.StringArrayInput
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
	// The canonical hosted zone ID of the ELB (to be used in a Route 53 Alias record)
	ZoneId pulumi.StringPtrInput
}

func (LoadBalancerState) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerState)(nil)).Elem()
}

type loadBalancerArgs struct {
	// An Access Logs block. Access Logs documented below.
	AccessLogs *LoadBalancerAccessLogs `pulumi:"accessLogs"`
	// The AZ's to serve traffic in.
	AvailabilityZones []string `pulumi:"availabilityZones"`
	// Boolean to enable connection draining. Default: `false`
	ConnectionDraining *bool `pulumi:"connectionDraining"`
	// The time in seconds to allow for connections to drain. Default: `300`
	ConnectionDrainingTimeout *int `pulumi:"connectionDrainingTimeout"`
	// Enable cross-zone load balancing. Default: `true`
	CrossZoneLoadBalancing *bool `pulumi:"crossZoneLoadBalancing"`
	// A healthCheck block. Health Check documented below.
	HealthCheck *LoadBalancerHealthCheck `pulumi:"healthCheck"`
	// The time in seconds that the connection is allowed to be idle. Default: `60`
	IdleTimeout *int `pulumi:"idleTimeout"`
	// A list of instance ids to place in the ELB pool.
	Instances []string `pulumi:"instances"`
	// If true, ELB will be an internal ELB.
	Internal *bool `pulumi:"internal"`
	// A list of listener blocks. Listeners documented below.
	Listeners []LoadBalancerListener `pulumi:"listeners"`
	// The name of the ELB. By default generated by this provider.
	Name *string `pulumi:"name"`
	// Creates a unique name beginning with the specified
	// prefix. Conflicts with `name`.
	NamePrefix *string `pulumi:"namePrefix"`
	// A list of security group IDs to assign to the ELB.
	// Only valid if creating an ELB within a VPC
	SecurityGroups []string `pulumi:"securityGroups"`
	// The name of the security group that you can use as
	// part of your inbound rules for your load balancer's back-end application
	// instances. Use this for Classic or Default VPC only.
	SourceSecurityGroup *string `pulumi:"sourceSecurityGroup"`
	// A list of subnet IDs to attach to the ELB.
	Subnets []string          `pulumi:"subnets"`
	Tags    map[string]string `pulumi:"tags"`
	TagsAll map[string]string `pulumi:"tagsAll"`
}

// The set of arguments for constructing a LoadBalancer resource.
type LoadBalancerArgs struct {
	// An Access Logs block. Access Logs documented below.
	AccessLogs LoadBalancerAccessLogsPtrInput
	// The AZ's to serve traffic in.
	AvailabilityZones pulumi.StringArrayInput
	// Boolean to enable connection draining. Default: `false`
	ConnectionDraining pulumi.BoolPtrInput
	// The time in seconds to allow for connections to drain. Default: `300`
	ConnectionDrainingTimeout pulumi.IntPtrInput
	// Enable cross-zone load balancing. Default: `true`
	CrossZoneLoadBalancing pulumi.BoolPtrInput
	// A healthCheck block. Health Check documented below.
	HealthCheck LoadBalancerHealthCheckPtrInput
	// The time in seconds that the connection is allowed to be idle. Default: `60`
	IdleTimeout pulumi.IntPtrInput
	// A list of instance ids to place in the ELB pool.
	Instances pulumi.StringArrayInput
	// If true, ELB will be an internal ELB.
	Internal pulumi.BoolPtrInput
	// A list of listener blocks. Listeners documented below.
	Listeners LoadBalancerListenerArrayInput
	// The name of the ELB. By default generated by this provider.
	Name pulumi.StringPtrInput
	// Creates a unique name beginning with the specified
	// prefix. Conflicts with `name`.
	NamePrefix pulumi.StringPtrInput
	// A list of security group IDs to assign to the ELB.
	// Only valid if creating an ELB within a VPC
	SecurityGroups pulumi.StringArrayInput
	// The name of the security group that you can use as
	// part of your inbound rules for your load balancer's back-end application
	// instances. Use this for Classic or Default VPC only.
	SourceSecurityGroup pulumi.StringPtrInput
	// A list of subnet IDs to attach to the ELB.
	Subnets pulumi.StringArrayInput
	Tags    pulumi.StringMapInput
	TagsAll pulumi.StringMapInput
}

func (LoadBalancerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*loadBalancerArgs)(nil)).Elem()
}

type LoadBalancerInput interface {
	pulumi.Input

	ToLoadBalancerOutput() LoadBalancerOutput
	ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput
}

func (*LoadBalancer) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadBalancer)(nil))
}

func (i *LoadBalancer) ToLoadBalancerOutput() LoadBalancerOutput {
	return i.ToLoadBalancerOutputWithContext(context.Background())
}

func (i *LoadBalancer) ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerOutput)
}

func (i *LoadBalancer) ToLoadBalancerPtrOutput() LoadBalancerPtrOutput {
	return i.ToLoadBalancerPtrOutputWithContext(context.Background())
}

func (i *LoadBalancer) ToLoadBalancerPtrOutputWithContext(ctx context.Context) LoadBalancerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPtrOutput)
}

type LoadBalancerPtrInput interface {
	pulumi.Input

	ToLoadBalancerPtrOutput() LoadBalancerPtrOutput
	ToLoadBalancerPtrOutputWithContext(ctx context.Context) LoadBalancerPtrOutput
}

type loadBalancerPtrType LoadBalancerArgs

func (*loadBalancerPtrType) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancer)(nil))
}

func (i *loadBalancerPtrType) ToLoadBalancerPtrOutput() LoadBalancerPtrOutput {
	return i.ToLoadBalancerPtrOutputWithContext(context.Background())
}

func (i *loadBalancerPtrType) ToLoadBalancerPtrOutputWithContext(ctx context.Context) LoadBalancerPtrOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerPtrOutput)
}

// LoadBalancerArrayInput is an input type that accepts LoadBalancerArray and LoadBalancerArrayOutput values.
// You can construct a concrete instance of `LoadBalancerArrayInput` via:
//
//          LoadBalancerArray{ LoadBalancerArgs{...} }
type LoadBalancerArrayInput interface {
	pulumi.Input

	ToLoadBalancerArrayOutput() LoadBalancerArrayOutput
	ToLoadBalancerArrayOutputWithContext(context.Context) LoadBalancerArrayOutput
}

type LoadBalancerArray []LoadBalancerInput

func (LoadBalancerArray) ElementType() reflect.Type {
	return reflect.TypeOf(([]*LoadBalancer)(nil))
}

func (i LoadBalancerArray) ToLoadBalancerArrayOutput() LoadBalancerArrayOutput {
	return i.ToLoadBalancerArrayOutputWithContext(context.Background())
}

func (i LoadBalancerArray) ToLoadBalancerArrayOutputWithContext(ctx context.Context) LoadBalancerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerArrayOutput)
}

// LoadBalancerMapInput is an input type that accepts LoadBalancerMap and LoadBalancerMapOutput values.
// You can construct a concrete instance of `LoadBalancerMapInput` via:
//
//          LoadBalancerMap{ "key": LoadBalancerArgs{...} }
type LoadBalancerMapInput interface {
	pulumi.Input

	ToLoadBalancerMapOutput() LoadBalancerMapOutput
	ToLoadBalancerMapOutputWithContext(context.Context) LoadBalancerMapOutput
}

type LoadBalancerMap map[string]LoadBalancerInput

func (LoadBalancerMap) ElementType() reflect.Type {
	return reflect.TypeOf((map[string]*LoadBalancer)(nil))
}

func (i LoadBalancerMap) ToLoadBalancerMapOutput() LoadBalancerMapOutput {
	return i.ToLoadBalancerMapOutputWithContext(context.Background())
}

func (i LoadBalancerMap) ToLoadBalancerMapOutputWithContext(ctx context.Context) LoadBalancerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(LoadBalancerMapOutput)
}

type LoadBalancerOutput struct {
	*pulumi.OutputState
}

func (LoadBalancerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*LoadBalancer)(nil))
}

func (o LoadBalancerOutput) ToLoadBalancerOutput() LoadBalancerOutput {
	return o
}

func (o LoadBalancerOutput) ToLoadBalancerOutputWithContext(ctx context.Context) LoadBalancerOutput {
	return o
}

func (o LoadBalancerOutput) ToLoadBalancerPtrOutput() LoadBalancerPtrOutput {
	return o.ToLoadBalancerPtrOutputWithContext(context.Background())
}

func (o LoadBalancerOutput) ToLoadBalancerPtrOutputWithContext(ctx context.Context) LoadBalancerPtrOutput {
	return o.ApplyT(func(v LoadBalancer) *LoadBalancer {
		return &v
	}).(LoadBalancerPtrOutput)
}

type LoadBalancerPtrOutput struct {
	*pulumi.OutputState
}

func (LoadBalancerPtrOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**LoadBalancer)(nil))
}

func (o LoadBalancerPtrOutput) ToLoadBalancerPtrOutput() LoadBalancerPtrOutput {
	return o
}

func (o LoadBalancerPtrOutput) ToLoadBalancerPtrOutputWithContext(ctx context.Context) LoadBalancerPtrOutput {
	return o
}

type LoadBalancerArrayOutput struct{ *pulumi.OutputState }

func (LoadBalancerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]LoadBalancer)(nil))
}

func (o LoadBalancerArrayOutput) ToLoadBalancerArrayOutput() LoadBalancerArrayOutput {
	return o
}

func (o LoadBalancerArrayOutput) ToLoadBalancerArrayOutputWithContext(ctx context.Context) LoadBalancerArrayOutput {
	return o
}

func (o LoadBalancerArrayOutput) Index(i pulumi.IntInput) LoadBalancerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) LoadBalancer {
		return vs[0].([]LoadBalancer)[vs[1].(int)]
	}).(LoadBalancerOutput)
}

type LoadBalancerMapOutput struct{ *pulumi.OutputState }

func (LoadBalancerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]LoadBalancer)(nil))
}

func (o LoadBalancerMapOutput) ToLoadBalancerMapOutput() LoadBalancerMapOutput {
	return o
}

func (o LoadBalancerMapOutput) ToLoadBalancerMapOutputWithContext(ctx context.Context) LoadBalancerMapOutput {
	return o
}

func (o LoadBalancerMapOutput) MapIndex(k pulumi.StringInput) LoadBalancerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) LoadBalancer {
		return vs[0].(map[string]LoadBalancer)[vs[1].(string)]
	}).(LoadBalancerOutput)
}

func init() {
	pulumi.RegisterOutputType(LoadBalancerOutput{})
	pulumi.RegisterOutputType(LoadBalancerPtrOutput{})
	pulumi.RegisterOutputType(LoadBalancerArrayOutput{})
	pulumi.RegisterOutputType(LoadBalancerMapOutput{})
}
