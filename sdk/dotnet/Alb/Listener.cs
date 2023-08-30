// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Alb
{
    /// <summary>
    /// Provides a Load Balancer Listener resource.
    /// 
    /// &gt; **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
    /// 
    /// ## Example Usage
    /// ### Forward Action
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var frontEndLoadBalancer = new Aws.LB.LoadBalancer("frontEndLoadBalancer");
    /// 
    ///     // ...
    ///     var frontEndTargetGroup = new Aws.LB.TargetGroup("frontEndTargetGroup");
    /// 
    ///     // ...
    ///     var frontEndListener = new Aws.LB.Listener("frontEndListener", new()
    ///     {
    ///         LoadBalancerArn = frontEndLoadBalancer.Arn,
    ///         Port = 443,
    ///         Protocol = "HTTPS",
    ///         SslPolicy = "ELBSecurityPolicy-2016-08",
    ///         CertificateArn = "arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4",
    ///         DefaultActions = new[]
    ///         {
    ///             new Aws.LB.Inputs.ListenerDefaultActionArgs
    ///             {
    ///                 Type = "forward",
    ///                 TargetGroupArn = frontEndTargetGroup.Arn,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// To a NLB:
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var frontEnd = new Aws.LB.Listener("frontEnd", new()
    ///     {
    ///         LoadBalancerArn = aws_lb.Front_end.Arn,
    ///         Port = 443,
    ///         Protocol = "TLS",
    ///         CertificateArn = "arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4",
    ///         AlpnPolicy = "HTTP2Preferred",
    ///         DefaultActions = new[]
    ///         {
    ///             new Aws.LB.Inputs.ListenerDefaultActionArgs
    ///             {
    ///                 Type = "forward",
    ///                 TargetGroupArn = aws_lb_target_group.Front_end.Arn,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Redirect Action
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var frontEndLoadBalancer = new Aws.LB.LoadBalancer("frontEndLoadBalancer");
    /// 
    ///     // ...
    ///     var frontEndListener = new Aws.LB.Listener("frontEndListener", new()
    ///     {
    ///         LoadBalancerArn = frontEndLoadBalancer.Arn,
    ///         Port = 80,
    ///         Protocol = "HTTP",
    ///         DefaultActions = new[]
    ///         {
    ///             new Aws.LB.Inputs.ListenerDefaultActionArgs
    ///             {
    ///                 Type = "redirect",
    ///                 Redirect = new Aws.LB.Inputs.ListenerDefaultActionRedirectArgs
    ///                 {
    ///                     Port = "443",
    ///                     Protocol = "HTTPS",
    ///                     StatusCode = "HTTP_301",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Fixed-response Action
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var frontEndLoadBalancer = new Aws.LB.LoadBalancer("frontEndLoadBalancer");
    /// 
    ///     // ...
    ///     var frontEndListener = new Aws.LB.Listener("frontEndListener", new()
    ///     {
    ///         LoadBalancerArn = frontEndLoadBalancer.Arn,
    ///         Port = 80,
    ///         Protocol = "HTTP",
    ///         DefaultActions = new[]
    ///         {
    ///             new Aws.LB.Inputs.ListenerDefaultActionArgs
    ///             {
    ///                 Type = "fixed-response",
    ///                 FixedResponse = new Aws.LB.Inputs.ListenerDefaultActionFixedResponseArgs
    ///                 {
    ///                     ContentType = "text/plain",
    ///                     MessageBody = "Fixed response content",
    ///                     StatusCode = "200",
    ///                 },
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Authenticate-cognito Action
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var frontEndLoadBalancer = new Aws.LB.LoadBalancer("frontEndLoadBalancer");
    /// 
    ///     // ...
    ///     var frontEndTargetGroup = new Aws.LB.TargetGroup("frontEndTargetGroup");
    /// 
    ///     // ...
    ///     var pool = new Aws.Cognito.UserPool("pool");
    /// 
    ///     // ...
    ///     var client = new Aws.Cognito.UserPoolClient("client");
    /// 
    ///     // ...
    ///     var domain = new Aws.Cognito.UserPoolDomain("domain");
    /// 
    ///     // ...
    ///     var frontEndListener = new Aws.LB.Listener("frontEndListener", new()
    ///     {
    ///         LoadBalancerArn = frontEndLoadBalancer.Arn,
    ///         Port = 80,
    ///         Protocol = "HTTP",
    ///         DefaultActions = new[]
    ///         {
    ///             new Aws.LB.Inputs.ListenerDefaultActionArgs
    ///             {
    ///                 Type = "authenticate-cognito",
    ///                 AuthenticateCognito = new Aws.LB.Inputs.ListenerDefaultActionAuthenticateCognitoArgs
    ///                 {
    ///                     UserPoolArn = pool.Arn,
    ///                     UserPoolClientId = client.Id,
    ///                     UserPoolDomain = domain.Domain,
    ///                 },
    ///             },
    ///             new Aws.LB.Inputs.ListenerDefaultActionArgs
    ///             {
    ///                 Type = "forward",
    ///                 TargetGroupArn = frontEndTargetGroup.Arn,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Authenticate-OIDC Action
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var frontEndLoadBalancer = new Aws.LB.LoadBalancer("frontEndLoadBalancer");
    /// 
    ///     // ...
    ///     var frontEndTargetGroup = new Aws.LB.TargetGroup("frontEndTargetGroup");
    /// 
    ///     // ...
    ///     var frontEndListener = new Aws.LB.Listener("frontEndListener", new()
    ///     {
    ///         LoadBalancerArn = frontEndLoadBalancer.Arn,
    ///         Port = 80,
    ///         Protocol = "HTTP",
    ///         DefaultActions = new[]
    ///         {
    ///             new Aws.LB.Inputs.ListenerDefaultActionArgs
    ///             {
    ///                 Type = "authenticate-oidc",
    ///                 AuthenticateOidc = new Aws.LB.Inputs.ListenerDefaultActionAuthenticateOidcArgs
    ///                 {
    ///                     AuthorizationEndpoint = "https://example.com/authorization_endpoint",
    ///                     ClientId = "client_id",
    ///                     ClientSecret = "client_secret",
    ///                     Issuer = "https://example.com",
    ///                     TokenEndpoint = "https://example.com/token_endpoint",
    ///                     UserInfoEndpoint = "https://example.com/user_info_endpoint",
    ///                 },
    ///             },
    ///             new Aws.LB.Inputs.ListenerDefaultActionArgs
    ///             {
    ///                 Type = "forward",
    ///                 TargetGroupArn = frontEndTargetGroup.Arn,
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Gateway Load Balancer Listener
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleLoadBalancer = new Aws.LB.LoadBalancer("exampleLoadBalancer", new()
    ///     {
    ///         LoadBalancerType = "gateway",
    ///         SubnetMappings = new[]
    ///         {
    ///             new Aws.LB.Inputs.LoadBalancerSubnetMappingArgs
    ///             {
    ///                 SubnetId = aws_subnet.Example.Id,
    ///             },
    ///         },
    ///     });
    /// 
    ///     var exampleTargetGroup = new Aws.LB.TargetGroup("exampleTargetGroup", new()
    ///     {
    ///         Port = 6081,
    ///         Protocol = "GENEVE",
    ///         VpcId = aws_vpc.Example.Id,
    ///         HealthCheck = new Aws.LB.Inputs.TargetGroupHealthCheckArgs
    ///         {
    ///             Port = "80",
    ///             Protocol = "HTTP",
    ///         },
    ///     });
    /// 
    ///     var exampleListener = new Aws.LB.Listener("exampleListener", new()
    ///     {
    ///         LoadBalancerArn = exampleLoadBalancer.Id,
    ///         DefaultActions = new[]
    ///         {
    ///             new Aws.LB.Inputs.ListenerDefaultActionArgs
    ///             {
    ///                 TargetGroupArn = exampleTargetGroup.Id,
    ///                 Type = "forward",
    ///             },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import listeners using their ARN. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:alb/listener:Listener front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener/app/front-end-alb/8e4497da625e2d8a/9ab28ade35828f96
    /// ```
    /// </summary>
    [AwsResourceType("aws:alb/listener:Listener")]
    public partial class Listener : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
        /// </summary>
        [Output("alpnPolicy")]
        public Output<string?> AlpnPolicy { get; private set; } = null!;

        /// <summary>
        /// ARN of the target group.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
        /// </summary>
        [Output("certificateArn")]
        public Output<string?> CertificateArn { get; private set; } = null!;

        /// <summary>
        /// Configuration block for default actions. Detailed below.
        /// </summary>
        [Output("defaultActions")]
        public Output<ImmutableArray<Outputs.ListenerDefaultAction>> DefaultActions { get; private set; } = null!;

        /// <summary>
        /// ARN of the load balancer.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("loadBalancerArn")]
        public Output<string> LoadBalancerArn { get; private set; } = null!;

        /// <summary>
        /// Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
        /// </summary>
        [Output("port")]
        public Output<int?> Port { get; private set; } = null!;

        /// <summary>
        /// Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
        /// </summary>
        [Output("protocol")]
        public Output<string> Protocol { get; private set; } = null!;

        /// <summary>
        /// Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
        /// </summary>
        [Output("sslPolicy")]
        public Output<string> SslPolicy { get; private set; } = null!;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// 
        /// &gt; **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;


        /// <summary>
        /// Create a Listener resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Listener(string name, ListenerArgs args, CustomResourceOptions? options = null)
            : base("aws:alb/listener:Listener", name, args ?? new ListenerArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Listener(string name, Input<string> id, ListenerState? state = null, CustomResourceOptions? options = null)
            : base("aws:alb/listener:Listener", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                Aliases =
                {
                    new global::Pulumi.Alias { Type = "aws:applicationloadbalancing/listener:Listener"},
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing Listener resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Listener Get(string name, Input<string> id, ListenerState? state = null, CustomResourceOptions? options = null)
        {
            return new Listener(name, id, state, options);
        }
    }

    public sealed class ListenerArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
        /// </summary>
        [Input("alpnPolicy")]
        public Input<string>? AlpnPolicy { get; set; }

        /// <summary>
        /// ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
        /// </summary>
        [Input("certificateArn")]
        public Input<string>? CertificateArn { get; set; }

        [Input("defaultActions", required: true)]
        private InputList<Inputs.ListenerDefaultActionArgs>? _defaultActions;

        /// <summary>
        /// Configuration block for default actions. Detailed below.
        /// </summary>
        public InputList<Inputs.ListenerDefaultActionArgs> DefaultActions
        {
            get => _defaultActions ?? (_defaultActions = new InputList<Inputs.ListenerDefaultActionArgs>());
            set => _defaultActions = value;
        }

        /// <summary>
        /// ARN of the load balancer.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("loadBalancerArn", required: true)]
        public Input<string> LoadBalancerArn { get; set; } = null!;

        /// <summary>
        /// Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
        /// </summary>
        [Input("sslPolicy")]
        public Input<string>? SslPolicy { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// 
        /// &gt; **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        public ListenerArgs()
        {
        }
        public static new ListenerArgs Empty => new ListenerArgs();
    }

    public sealed class ListenerState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
        /// </summary>
        [Input("alpnPolicy")]
        public Input<string>? AlpnPolicy { get; set; }

        /// <summary>
        /// ARN of the target group.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
        /// </summary>
        [Input("certificateArn")]
        public Input<string>? CertificateArn { get; set; }

        [Input("defaultActions")]
        private InputList<Inputs.ListenerDefaultActionGetArgs>? _defaultActions;

        /// <summary>
        /// Configuration block for default actions. Detailed below.
        /// </summary>
        public InputList<Inputs.ListenerDefaultActionGetArgs> DefaultActions
        {
            get => _defaultActions ?? (_defaultActions = new InputList<Inputs.ListenerDefaultActionGetArgs>());
            set => _defaultActions = value;
        }

        /// <summary>
        /// ARN of the load balancer.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("loadBalancerArn")]
        public Input<string>? LoadBalancerArn { get; set; }

        /// <summary>
        /// Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
        /// </summary>
        [Input("port")]
        public Input<int>? Port { get; set; }

        /// <summary>
        /// Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
        /// </summary>
        [Input("protocol")]
        public Input<string>? Protocol { get; set; }

        /// <summary>
        /// Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
        /// </summary>
        [Input("sslPolicy")]
        public Input<string>? SslPolicy { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// A map of tags to assign to the resource. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// 
        /// &gt; **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        public ListenerState()
        {
        }
        public static new ListenerState Empty => new ListenerState();
    }
}
