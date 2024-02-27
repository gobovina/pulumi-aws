// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package alb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a Load Balancer Listener resource.
//
// > **Note:** `alb.Listener` is known as `lb.Listener`. The functionality is identical.
//
// ## Example Usage
// ### Forward Action
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			frontEndLoadBalancer, err := lb.NewLoadBalancer(ctx, "frontEndLoadBalancer", nil)
//			if err != nil {
//				return err
//			}
//			frontEndTargetGroup, err := lb.NewTargetGroup(ctx, "frontEndTargetGroup", nil)
//			if err != nil {
//				return err
//			}
//			_, err = lb.NewListener(ctx, "frontEndListener", &lb.ListenerArgs{
//				LoadBalancerArn: frontEndLoadBalancer.Arn,
//				Port:            pulumi.Int(443),
//				Protocol:        pulumi.String("HTTPS"),
//				SslPolicy:       pulumi.String("ELBSecurityPolicy-2016-08"),
//				CertificateArn:  pulumi.String("arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4"),
//				DefaultActions: lb.ListenerDefaultActionArray{
//					&lb.ListenerDefaultActionArgs{
//						Type:           pulumi.String("forward"),
//						TargetGroupArn: frontEndTargetGroup.Arn,
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
// To a NLB:
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			_, err := lb.NewListener(ctx, "frontEnd", &lb.ListenerArgs{
//				LoadBalancerArn: pulumi.Any(aws_lb.Front_end.Arn),
//				Port:            pulumi.Int(443),
//				Protocol:        pulumi.String("TLS"),
//				CertificateArn:  pulumi.String("arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4"),
//				AlpnPolicy:      pulumi.String("HTTP2Preferred"),
//				DefaultActions: lb.ListenerDefaultActionArray{
//					&lb.ListenerDefaultActionArgs{
//						Type:           pulumi.String("forward"),
//						TargetGroupArn: pulumi.Any(aws_lb_target_group.Front_end.Arn),
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
// ### Redirect Action
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			frontEndLoadBalancer, err := lb.NewLoadBalancer(ctx, "frontEndLoadBalancer", nil)
//			if err != nil {
//				return err
//			}
//			_, err = lb.NewListener(ctx, "frontEndListener", &lb.ListenerArgs{
//				LoadBalancerArn: frontEndLoadBalancer.Arn,
//				Port:            pulumi.Int(80),
//				Protocol:        pulumi.String("HTTP"),
//				DefaultActions: lb.ListenerDefaultActionArray{
//					&lb.ListenerDefaultActionArgs{
//						Type: pulumi.String("redirect"),
//						Redirect: &lb.ListenerDefaultActionRedirectArgs{
//							Port:       pulumi.String("443"),
//							Protocol:   pulumi.String("HTTPS"),
//							StatusCode: pulumi.String("HTTP_301"),
//						},
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
// ### Fixed-response Action
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			frontEndLoadBalancer, err := lb.NewLoadBalancer(ctx, "frontEndLoadBalancer", nil)
//			if err != nil {
//				return err
//			}
//			_, err = lb.NewListener(ctx, "frontEndListener", &lb.ListenerArgs{
//				LoadBalancerArn: frontEndLoadBalancer.Arn,
//				Port:            pulumi.Int(80),
//				Protocol:        pulumi.String("HTTP"),
//				DefaultActions: lb.ListenerDefaultActionArray{
//					&lb.ListenerDefaultActionArgs{
//						Type: pulumi.String("fixed-response"),
//						FixedResponse: &lb.ListenerDefaultActionFixedResponseArgs{
//							ContentType: pulumi.String("text/plain"),
//							MessageBody: pulumi.String("Fixed response content"),
//							StatusCode:  pulumi.String("200"),
//						},
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
// ### Authenticate-cognito Action
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/cognito"
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			frontEndLoadBalancer, err := lb.NewLoadBalancer(ctx, "frontEndLoadBalancer", nil)
//			if err != nil {
//				return err
//			}
//			frontEndTargetGroup, err := lb.NewTargetGroup(ctx, "frontEndTargetGroup", nil)
//			if err != nil {
//				return err
//			}
//			pool, err := cognito.NewUserPool(ctx, "pool", nil)
//			if err != nil {
//				return err
//			}
//			client, err := cognito.NewUserPoolClient(ctx, "client", nil)
//			if err != nil {
//				return err
//			}
//			domain, err := cognito.NewUserPoolDomain(ctx, "domain", nil)
//			if err != nil {
//				return err
//			}
//			_, err = lb.NewListener(ctx, "frontEndListener", &lb.ListenerArgs{
//				LoadBalancerArn: frontEndLoadBalancer.Arn,
//				Port:            pulumi.Int(80),
//				Protocol:        pulumi.String("HTTP"),
//				DefaultActions: lb.ListenerDefaultActionArray{
//					&lb.ListenerDefaultActionArgs{
//						Type: pulumi.String("authenticate-cognito"),
//						AuthenticateCognito: &lb.ListenerDefaultActionAuthenticateCognitoArgs{
//							UserPoolArn:      pool.Arn,
//							UserPoolClientId: client.ID(),
//							UserPoolDomain:   domain.Domain,
//						},
//					},
//					&lb.ListenerDefaultActionArgs{
//						Type:           pulumi.String("forward"),
//						TargetGroupArn: frontEndTargetGroup.Arn,
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
// ### Authenticate-OIDC Action
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			frontEndLoadBalancer, err := lb.NewLoadBalancer(ctx, "frontEndLoadBalancer", nil)
//			if err != nil {
//				return err
//			}
//			frontEndTargetGroup, err := lb.NewTargetGroup(ctx, "frontEndTargetGroup", nil)
//			if err != nil {
//				return err
//			}
//			_, err = lb.NewListener(ctx, "frontEndListener", &lb.ListenerArgs{
//				LoadBalancerArn: frontEndLoadBalancer.Arn,
//				Port:            pulumi.Int(80),
//				Protocol:        pulumi.String("HTTP"),
//				DefaultActions: lb.ListenerDefaultActionArray{
//					&lb.ListenerDefaultActionArgs{
//						Type: pulumi.String("authenticate-oidc"),
//						AuthenticateOidc: &lb.ListenerDefaultActionAuthenticateOidcArgs{
//							AuthorizationEndpoint: pulumi.String("https://example.com/authorization_endpoint"),
//							ClientId:              pulumi.String("client_id"),
//							ClientSecret:          pulumi.String("client_secret"),
//							Issuer:                pulumi.String("https://example.com"),
//							TokenEndpoint:         pulumi.String("https://example.com/token_endpoint"),
//							UserInfoEndpoint:      pulumi.String("https://example.com/user_info_endpoint"),
//						},
//					},
//					&lb.ListenerDefaultActionArgs{
//						Type:           pulumi.String("forward"),
//						TargetGroupArn: frontEndTargetGroup.Arn,
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
// ### Gateway Load Balancer Listener
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleLoadBalancer, err := lb.NewLoadBalancer(ctx, "exampleLoadBalancer", &lb.LoadBalancerArgs{
//				LoadBalancerType: pulumi.String("gateway"),
//				SubnetMappings: lb.LoadBalancerSubnetMappingArray{
//					&lb.LoadBalancerSubnetMappingArgs{
//						SubnetId: pulumi.Any(aws_subnet.Example.Id),
//					},
//				},
//			})
//			if err != nil {
//				return err
//			}
//			exampleTargetGroup, err := lb.NewTargetGroup(ctx, "exampleTargetGroup", &lb.TargetGroupArgs{
//				Port:     pulumi.Int(6081),
//				Protocol: pulumi.String("GENEVE"),
//				VpcId:    pulumi.Any(aws_vpc.Example.Id),
//				HealthCheck: &lb.TargetGroupHealthCheckArgs{
//					Port:     pulumi.String("80"),
//					Protocol: pulumi.String("HTTP"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = lb.NewListener(ctx, "exampleListener", &lb.ListenerArgs{
//				LoadBalancerArn: exampleLoadBalancer.ID(),
//				DefaultActions: lb.ListenerDefaultActionArray{
//					&lb.ListenerDefaultActionArgs{
//						TargetGroupArn: exampleTargetGroup.ID(),
//						Type:           pulumi.String("forward"),
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
// ### Mutual TLS Authentication
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-aws/sdk/v6/go/aws/lb"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			exampleLoadBalancer, err := lb.NewLoadBalancer(ctx, "exampleLoadBalancer", &lb.LoadBalancerArgs{
//				LoadBalancerType: pulumi.String("application"),
//			})
//			if err != nil {
//				return err
//			}
//			exampleTargetGroup, err := lb.NewTargetGroup(ctx, "exampleTargetGroup", nil)
//			if err != nil {
//				return err
//			}
//			_, err = lb.NewListener(ctx, "exampleListener", &lb.ListenerArgs{
//				LoadBalancerArn: exampleLoadBalancer.ID(),
//				DefaultActions: lb.ListenerDefaultActionArray{
//					&lb.ListenerDefaultActionArgs{
//						TargetGroupArn: exampleTargetGroup.ID(),
//						Type:           pulumi.String("forward"),
//					},
//				},
//				MutualAuthentication: &lb.ListenerMutualAuthenticationArgs{
//					Mode:          pulumi.String("verify"),
//					TrustStoreArn: pulumi.String("..."),
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
// Using `pulumi import`, import listeners using their ARN. For example:
//
// ```sh
//
//	$ pulumi import aws:alb/listener:Listener front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener/app/front-end-alb/8e4497da625e2d8a/9ab28ade35828f96
//
// ```
type Listener struct {
	pulumi.CustomResourceState

	// Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
	AlpnPolicy pulumi.StringPtrOutput `pulumi:"alpnPolicy"`
	// ARN of the target group.
	//
	// The following arguments are optional:
	Arn pulumi.StringOutput `pulumi:"arn"`
	// ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `lb.ListenerCertificate` resource.
	CertificateArn pulumi.StringPtrOutput `pulumi:"certificateArn"`
	// Configuration block for default actions. Detailed below.
	DefaultActions ListenerDefaultActionArrayOutput `pulumi:"defaultActions"`
	// ARN of the load balancer.
	//
	// The following arguments are optional:
	LoadBalancerArn pulumi.StringOutput `pulumi:"loadBalancerArn"`
	// The mutual authentication configuration information. Detailed below.
	MutualAuthentication ListenerMutualAuthenticationOutput `pulumi:"mutualAuthentication"`
	// Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
	Port pulumi.IntPtrOutput `pulumi:"port"`
	// Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
	Protocol pulumi.StringOutput `pulumi:"protocol"`
	// Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
	SslPolicy pulumi.StringOutput `pulumi:"sslPolicy"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	//
	// > **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
	Tags pulumi.StringMapOutput `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapOutput `pulumi:"tagsAll"`
}

// NewListener registers a new resource with the given unique name, arguments, and options.
func NewListener(ctx *pulumi.Context,
	name string, args *ListenerArgs, opts ...pulumi.ResourceOption) (*Listener, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DefaultActions == nil {
		return nil, errors.New("invalid value for required argument 'DefaultActions'")
	}
	if args.LoadBalancerArn == nil {
		return nil, errors.New("invalid value for required argument 'LoadBalancerArn'")
	}
	aliases := pulumi.Aliases([]pulumi.Alias{
		{
			Type: pulumi.String("aws:applicationloadbalancing/listener:Listener"),
		},
	})
	opts = append(opts, aliases)
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Listener
	err := ctx.RegisterResource("aws:alb/listener:Listener", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetListener gets an existing Listener resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetListener(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ListenerState, opts ...pulumi.ResourceOption) (*Listener, error) {
	var resource Listener
	err := ctx.ReadResource("aws:alb/listener:Listener", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Listener resources.
type listenerState struct {
	// Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
	AlpnPolicy *string `pulumi:"alpnPolicy"`
	// ARN of the target group.
	//
	// The following arguments are optional:
	Arn *string `pulumi:"arn"`
	// ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `lb.ListenerCertificate` resource.
	CertificateArn *string `pulumi:"certificateArn"`
	// Configuration block for default actions. Detailed below.
	DefaultActions []ListenerDefaultAction `pulumi:"defaultActions"`
	// ARN of the load balancer.
	//
	// The following arguments are optional:
	LoadBalancerArn *string `pulumi:"loadBalancerArn"`
	// The mutual authentication configuration information. Detailed below.
	MutualAuthentication *ListenerMutualAuthentication `pulumi:"mutualAuthentication"`
	// Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
	Port *int `pulumi:"port"`
	// Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
	Protocol *string `pulumi:"protocol"`
	// Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
	SslPolicy *string `pulumi:"sslPolicy"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	//
	// > **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
	Tags map[string]string `pulumi:"tags"`
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll map[string]string `pulumi:"tagsAll"`
}

type ListenerState struct {
	// Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
	AlpnPolicy pulumi.StringPtrInput
	// ARN of the target group.
	//
	// The following arguments are optional:
	Arn pulumi.StringPtrInput
	// ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `lb.ListenerCertificate` resource.
	CertificateArn pulumi.StringPtrInput
	// Configuration block for default actions. Detailed below.
	DefaultActions ListenerDefaultActionArrayInput
	// ARN of the load balancer.
	//
	// The following arguments are optional:
	LoadBalancerArn pulumi.StringPtrInput
	// The mutual authentication configuration information. Detailed below.
	MutualAuthentication ListenerMutualAuthenticationPtrInput
	// Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
	Port pulumi.IntPtrInput
	// Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
	Protocol pulumi.StringPtrInput
	// Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
	SslPolicy pulumi.StringPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	//
	// > **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
	Tags pulumi.StringMapInput
	// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
	//
	// Deprecated: Please use `tags` instead.
	TagsAll pulumi.StringMapInput
}

func (ListenerState) ElementType() reflect.Type {
	return reflect.TypeOf((*listenerState)(nil)).Elem()
}

type listenerArgs struct {
	// Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
	AlpnPolicy *string `pulumi:"alpnPolicy"`
	// ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `lb.ListenerCertificate` resource.
	CertificateArn *string `pulumi:"certificateArn"`
	// Configuration block for default actions. Detailed below.
	DefaultActions []ListenerDefaultAction `pulumi:"defaultActions"`
	// ARN of the load balancer.
	//
	// The following arguments are optional:
	LoadBalancerArn string `pulumi:"loadBalancerArn"`
	// The mutual authentication configuration information. Detailed below.
	MutualAuthentication *ListenerMutualAuthentication `pulumi:"mutualAuthentication"`
	// Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
	Port *int `pulumi:"port"`
	// Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
	Protocol *string `pulumi:"protocol"`
	// Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
	SslPolicy *string `pulumi:"sslPolicy"`
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	//
	// > **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
	Tags map[string]string `pulumi:"tags"`
}

// The set of arguments for constructing a Listener resource.
type ListenerArgs struct {
	// Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
	AlpnPolicy pulumi.StringPtrInput
	// ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `lb.ListenerCertificate` resource.
	CertificateArn pulumi.StringPtrInput
	// Configuration block for default actions. Detailed below.
	DefaultActions ListenerDefaultActionArrayInput
	// ARN of the load balancer.
	//
	// The following arguments are optional:
	LoadBalancerArn pulumi.StringInput
	// The mutual authentication configuration information. Detailed below.
	MutualAuthentication ListenerMutualAuthenticationPtrInput
	// Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
	Port pulumi.IntPtrInput
	// Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
	Protocol pulumi.StringPtrInput
	// Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
	SslPolicy pulumi.StringPtrInput
	// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
	//
	// > **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
	Tags pulumi.StringMapInput
}

func (ListenerArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*listenerArgs)(nil)).Elem()
}

type ListenerInput interface {
	pulumi.Input

	ToListenerOutput() ListenerOutput
	ToListenerOutputWithContext(ctx context.Context) ListenerOutput
}

func (*Listener) ElementType() reflect.Type {
	return reflect.TypeOf((**Listener)(nil)).Elem()
}

func (i *Listener) ToListenerOutput() ListenerOutput {
	return i.ToListenerOutputWithContext(context.Background())
}

func (i *Listener) ToListenerOutputWithContext(ctx context.Context) ListenerOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerOutput)
}

// ListenerArrayInput is an input type that accepts ListenerArray and ListenerArrayOutput values.
// You can construct a concrete instance of `ListenerArrayInput` via:
//
//	ListenerArray{ ListenerArgs{...} }
type ListenerArrayInput interface {
	pulumi.Input

	ToListenerArrayOutput() ListenerArrayOutput
	ToListenerArrayOutputWithContext(context.Context) ListenerArrayOutput
}

type ListenerArray []ListenerInput

func (ListenerArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Listener)(nil)).Elem()
}

func (i ListenerArray) ToListenerArrayOutput() ListenerArrayOutput {
	return i.ToListenerArrayOutputWithContext(context.Background())
}

func (i ListenerArray) ToListenerArrayOutputWithContext(ctx context.Context) ListenerArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerArrayOutput)
}

// ListenerMapInput is an input type that accepts ListenerMap and ListenerMapOutput values.
// You can construct a concrete instance of `ListenerMapInput` via:
//
//	ListenerMap{ "key": ListenerArgs{...} }
type ListenerMapInput interface {
	pulumi.Input

	ToListenerMapOutput() ListenerMapOutput
	ToListenerMapOutputWithContext(context.Context) ListenerMapOutput
}

type ListenerMap map[string]ListenerInput

func (ListenerMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Listener)(nil)).Elem()
}

func (i ListenerMap) ToListenerMapOutput() ListenerMapOutput {
	return i.ToListenerMapOutputWithContext(context.Background())
}

func (i ListenerMap) ToListenerMapOutputWithContext(ctx context.Context) ListenerMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ListenerMapOutput)
}

type ListenerOutput struct{ *pulumi.OutputState }

func (ListenerOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Listener)(nil)).Elem()
}

func (o ListenerOutput) ToListenerOutput() ListenerOutput {
	return o
}

func (o ListenerOutput) ToListenerOutputWithContext(ctx context.Context) ListenerOutput {
	return o
}

// Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
func (o ListenerOutput) AlpnPolicy() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringPtrOutput { return v.AlpnPolicy }).(pulumi.StringPtrOutput)
}

// ARN of the target group.
//
// The following arguments are optional:
func (o ListenerOutput) Arn() pulumi.StringOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringOutput { return v.Arn }).(pulumi.StringOutput)
}

// ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `lb.ListenerCertificate` resource.
func (o ListenerOutput) CertificateArn() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringPtrOutput { return v.CertificateArn }).(pulumi.StringPtrOutput)
}

// Configuration block for default actions. Detailed below.
func (o ListenerOutput) DefaultActions() ListenerDefaultActionArrayOutput {
	return o.ApplyT(func(v *Listener) ListenerDefaultActionArrayOutput { return v.DefaultActions }).(ListenerDefaultActionArrayOutput)
}

// ARN of the load balancer.
//
// The following arguments are optional:
func (o ListenerOutput) LoadBalancerArn() pulumi.StringOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringOutput { return v.LoadBalancerArn }).(pulumi.StringOutput)
}

// The mutual authentication configuration information. Detailed below.
func (o ListenerOutput) MutualAuthentication() ListenerMutualAuthenticationOutput {
	return o.ApplyT(func(v *Listener) ListenerMutualAuthenticationOutput { return v.MutualAuthentication }).(ListenerMutualAuthenticationOutput)
}

// Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
func (o ListenerOutput) Port() pulumi.IntPtrOutput {
	return o.ApplyT(func(v *Listener) pulumi.IntPtrOutput { return v.Port }).(pulumi.IntPtrOutput)
}

// Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
func (o ListenerOutput) Protocol() pulumi.StringOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringOutput { return v.Protocol }).(pulumi.StringOutput)
}

// Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
func (o ListenerOutput) SslPolicy() pulumi.StringOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringOutput { return v.SslPolicy }).(pulumi.StringOutput)
}

// A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
//
// > **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
func (o ListenerOutput) Tags() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringMapOutput { return v.Tags }).(pulumi.StringMapOutput)
}

// A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
//
// Deprecated: Please use `tags` instead.
func (o ListenerOutput) TagsAll() pulumi.StringMapOutput {
	return o.ApplyT(func(v *Listener) pulumi.StringMapOutput { return v.TagsAll }).(pulumi.StringMapOutput)
}

type ListenerArrayOutput struct{ *pulumi.OutputState }

func (ListenerArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Listener)(nil)).Elem()
}

func (o ListenerArrayOutput) ToListenerArrayOutput() ListenerArrayOutput {
	return o
}

func (o ListenerArrayOutput) ToListenerArrayOutputWithContext(ctx context.Context) ListenerArrayOutput {
	return o
}

func (o ListenerArrayOutput) Index(i pulumi.IntInput) ListenerOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Listener {
		return vs[0].([]*Listener)[vs[1].(int)]
	}).(ListenerOutput)
}

type ListenerMapOutput struct{ *pulumi.OutputState }

func (ListenerMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Listener)(nil)).Elem()
}

func (o ListenerMapOutput) ToListenerMapOutput() ListenerMapOutput {
	return o
}

func (o ListenerMapOutput) ToListenerMapOutputWithContext(ctx context.Context) ListenerMapOutput {
	return o
}

func (o ListenerMapOutput) MapIndex(k pulumi.StringInput) ListenerOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Listener {
		return vs[0].(map[string]*Listener)[vs[1].(string)]
	}).(ListenerOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerInput)(nil)).Elem(), &Listener{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerArrayInput)(nil)).Elem(), ListenerArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ListenerMapInput)(nil)).Elem(), ListenerMap{})
	pulumi.RegisterOutputType(ListenerOutput{})
	pulumi.RegisterOutputType(ListenerArrayOutput{})
	pulumi.RegisterOutputType(ListenerMapOutput{})
}
