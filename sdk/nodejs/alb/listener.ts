// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a Load Balancer Listener resource.
 *
 * > **Note:** `aws.alb.Listener` is known as `aws.lb.Listener`. The functionality is identical.
 *
 * ## Example Usage
 * ### Forward Action
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const frontEnd = new aws.lb.LoadBalancer("front_end", {});
 * const frontEndTargetGroup = new aws.lb.TargetGroup("front_end", {});
 * const frontEndListener = new aws.lb.Listener("front_end", {
 *     loadBalancerArn: frontEnd.arn,
 *     port: 443,
 *     protocol: "HTTPS",
 *     sslPolicy: "ELBSecurityPolicy-2016-08",
 *     certificateArn: "arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4",
 *     defaultActions: [{
 *         type: "forward",
 *         targetGroupArn: frontEndTargetGroup.arn,
 *     }],
 * });
 * ```
 *
 * To a NLB:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const frontEnd = new aws.lb.Listener("front_end", {
 *     loadBalancerArn: frontEndAwsLb.arn,
 *     port: 443,
 *     protocol: "TLS",
 *     certificateArn: "arn:aws:iam::187416307283:server-certificate/test_cert_rab3wuqwgja25ct3n4jdj2tzu4",
 *     alpnPolicy: "HTTP2Preferred",
 *     defaultActions: [{
 *         type: "forward",
 *         targetGroupArn: frontEndAwsLbTargetGroup.arn,
 *     }],
 * });
 * ```
 * ### Redirect Action
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const frontEnd = new aws.lb.LoadBalancer("front_end", {});
 * const frontEndListener = new aws.lb.Listener("front_end", {
 *     loadBalancerArn: frontEnd.arn,
 *     port: 80,
 *     protocol: "HTTP",
 *     defaultActions: [{
 *         type: "redirect",
 *         redirect: {
 *             port: "443",
 *             protocol: "HTTPS",
 *             statusCode: "HTTP_301",
 *         },
 *     }],
 * });
 * ```
 * ### Fixed-response Action
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const frontEnd = new aws.lb.LoadBalancer("front_end", {});
 * const frontEndListener = new aws.lb.Listener("front_end", {
 *     loadBalancerArn: frontEnd.arn,
 *     port: 80,
 *     protocol: "HTTP",
 *     defaultActions: [{
 *         type: "fixed-response",
 *         fixedResponse: {
 *             contentType: "text/plain",
 *             messageBody: "Fixed response content",
 *             statusCode: "200",
 *         },
 *     }],
 * });
 * ```
 * ### Authenticate-cognito Action
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const frontEnd = new aws.lb.LoadBalancer("front_end", {});
 * const frontEndTargetGroup = new aws.lb.TargetGroup("front_end", {});
 * const pool = new aws.cognito.UserPool("pool", {});
 * const client = new aws.cognito.UserPoolClient("client", {});
 * const domain = new aws.cognito.UserPoolDomain("domain", {});
 * const frontEndListener = new aws.lb.Listener("front_end", {
 *     loadBalancerArn: frontEnd.arn,
 *     port: 80,
 *     protocol: "HTTP",
 *     defaultActions: [
 *         {
 *             type: "authenticate-cognito",
 *             authenticateCognito: {
 *                 userPoolArn: pool.arn,
 *                 userPoolClientId: client.id,
 *                 userPoolDomain: domain.domain,
 *             },
 *         },
 *         {
 *             type: "forward",
 *             targetGroupArn: frontEndTargetGroup.arn,
 *         },
 *     ],
 * });
 * ```
 * ### Authenticate-OIDC Action
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const frontEnd = new aws.lb.LoadBalancer("front_end", {});
 * const frontEndTargetGroup = new aws.lb.TargetGroup("front_end", {});
 * const frontEndListener = new aws.lb.Listener("front_end", {
 *     loadBalancerArn: frontEnd.arn,
 *     port: 80,
 *     protocol: "HTTP",
 *     defaultActions: [
 *         {
 *             type: "authenticate-oidc",
 *             authenticateOidc: {
 *                 authorizationEndpoint: "https://example.com/authorization_endpoint",
 *                 clientId: "client_id",
 *                 clientSecret: "client_secret",
 *                 issuer: "https://example.com",
 *                 tokenEndpoint: "https://example.com/token_endpoint",
 *                 userInfoEndpoint: "https://example.com/user_info_endpoint",
 *             },
 *         },
 *         {
 *             type: "forward",
 *             targetGroupArn: frontEndTargetGroup.arn,
 *         },
 *     ],
 * });
 * ```
 * ### Gateway Load Balancer Listener
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.lb.LoadBalancer("example", {
 *     loadBalancerType: "gateway",
 *     name: "example",
 *     subnetMappings: [{
 *         subnetId: exampleAwsSubnet.id,
 *     }],
 * });
 * const exampleTargetGroup = new aws.lb.TargetGroup("example", {
 *     name: "example",
 *     port: 6081,
 *     protocol: "GENEVE",
 *     vpcId: exampleAwsVpc.id,
 *     healthCheck: {
 *         port: "80",
 *         protocol: "HTTP",
 *     },
 * });
 * const exampleListener = new aws.lb.Listener("example", {
 *     loadBalancerArn: example.id,
 *     defaultActions: [{
 *         targetGroupArn: exampleTargetGroup.id,
 *         type: "forward",
 *     }],
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import listeners using their ARN. For example:
 *
 * ```sh
 *  $ pulumi import aws:alb/listener:Listener front_end arn:aws:elasticloadbalancing:us-west-2:187416307283:listener/app/front-end-alb/8e4497da625e2d8a/9ab28ade35828f96
 * ```
 */
export class Listener extends pulumi.CustomResource {
    /**
     * Get an existing Listener resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ListenerState, opts?: pulumi.CustomResourceOptions): Listener {
        return new Listener(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:alb/listener:Listener';

    /**
     * Returns true if the given object is an instance of Listener.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Listener {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Listener.__pulumiType;
    }

    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     */
    public readonly alpnPolicy!: pulumi.Output<string | undefined>;
    /**
     * ARN of the target group.
     *
     * The following arguments are optional:
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     */
    public readonly certificateArn!: pulumi.Output<string | undefined>;
    /**
     * Configuration block for default actions. Detailed below.
     */
    public readonly defaultActions!: pulumi.Output<outputs.alb.ListenerDefaultAction[]>;
    /**
     * ARN of the load balancer.
     *
     * The following arguments are optional:
     */
    public readonly loadBalancerArn!: pulumi.Output<string>;
    /**
     * The mutual authentication configuration information. Detailed below.
     */
    public readonly mutualAuthentication!: pulumi.Output<outputs.alb.ListenerMutualAuthentication>;
    /**
     * Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
     */
    public readonly port!: pulumi.Output<number | undefined>;
    /**
     * Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
     */
    public readonly protocol!: pulumi.Output<string>;
    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     */
    public readonly sslPolicy!: pulumi.Output<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * > **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;

    /**
     * Create a Listener resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ListenerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ListenerArgs | ListenerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ListenerState | undefined;
            resourceInputs["alpnPolicy"] = state ? state.alpnPolicy : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["certificateArn"] = state ? state.certificateArn : undefined;
            resourceInputs["defaultActions"] = state ? state.defaultActions : undefined;
            resourceInputs["loadBalancerArn"] = state ? state.loadBalancerArn : undefined;
            resourceInputs["mutualAuthentication"] = state ? state.mutualAuthentication : undefined;
            resourceInputs["port"] = state ? state.port : undefined;
            resourceInputs["protocol"] = state ? state.protocol : undefined;
            resourceInputs["sslPolicy"] = state ? state.sslPolicy : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as ListenerArgs | undefined;
            if ((!args || args.defaultActions === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultActions'");
            }
            if ((!args || args.loadBalancerArn === undefined) && !opts.urn) {
                throw new Error("Missing required property 'loadBalancerArn'");
            }
            resourceInputs["alpnPolicy"] = args ? args.alpnPolicy : undefined;
            resourceInputs["certificateArn"] = args ? args.certificateArn : undefined;
            resourceInputs["defaultActions"] = args ? args.defaultActions : undefined;
            resourceInputs["loadBalancerArn"] = args ? args.loadBalancerArn : undefined;
            resourceInputs["mutualAuthentication"] = args ? args.mutualAuthentication : undefined;
            resourceInputs["port"] = args ? args.port : undefined;
            resourceInputs["protocol"] = args ? args.protocol : undefined;
            resourceInputs["sslPolicy"] = args ? args.sslPolicy : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const aliasOpts = { aliases: [{ type: "aws:applicationloadbalancing/listener:Listener" }] };
        opts = pulumi.mergeOptions(opts, aliasOpts);
        super(Listener.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Listener resources.
 */
export interface ListenerState {
    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     */
    alpnPolicy?: pulumi.Input<string>;
    /**
     * ARN of the target group.
     *
     * The following arguments are optional:
     */
    arn?: pulumi.Input<string>;
    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     */
    certificateArn?: pulumi.Input<string>;
    /**
     * Configuration block for default actions. Detailed below.
     */
    defaultActions?: pulumi.Input<pulumi.Input<inputs.alb.ListenerDefaultAction>[]>;
    /**
     * ARN of the load balancer.
     *
     * The following arguments are optional:
     */
    loadBalancerArn?: pulumi.Input<string>;
    /**
     * The mutual authentication configuration information. Detailed below.
     */
    mutualAuthentication?: pulumi.Input<inputs.alb.ListenerMutualAuthentication>;
    /**
     * Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
     */
    port?: pulumi.Input<number>;
    /**
     * Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
     */
    protocol?: pulumi.Input<string>;
    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     */
    sslPolicy?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * > **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}

/**
 * The set of arguments for constructing a Listener resource.
 */
export interface ListenerArgs {
    /**
     * Name of the Application-Layer Protocol Negotiation (ALPN) policy. Can be set if `protocol` is `TLS`. Valid values are `HTTP1Only`, `HTTP2Only`, `HTTP2Optional`, `HTTP2Preferred`, and `None`.
     */
    alpnPolicy?: pulumi.Input<string>;
    /**
     * ARN of the default SSL server certificate. Exactly one certificate is required if the protocol is HTTPS. For adding additional SSL certificates, see the `aws.lb.ListenerCertificate` resource.
     */
    certificateArn?: pulumi.Input<string>;
    /**
     * Configuration block for default actions. Detailed below.
     */
    defaultActions: pulumi.Input<pulumi.Input<inputs.alb.ListenerDefaultAction>[]>;
    /**
     * ARN of the load balancer.
     *
     * The following arguments are optional:
     */
    loadBalancerArn: pulumi.Input<string>;
    /**
     * The mutual authentication configuration information. Detailed below.
     */
    mutualAuthentication?: pulumi.Input<inputs.alb.ListenerMutualAuthentication>;
    /**
     * Port on which the load balancer is listening. Not valid for Gateway Load Balancers.
     */
    port?: pulumi.Input<number>;
    /**
     * Protocol for connections from clients to the load balancer. For Application Load Balancers, valid values are `HTTP` and `HTTPS`, with a default of `HTTP`. For Network Load Balancers, valid values are `TCP`, `TLS`, `UDP`, and `TCP_UDP`. Not valid to use `UDP` or `TCP_UDP` if dual-stack mode is enabled. Not valid for Gateway Load Balancers.
     */
    protocol?: pulumi.Input<string>;
    /**
     * Name of the SSL Policy for the listener. Required if `protocol` is `HTTPS` or `TLS`.
     */
    sslPolicy?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     *
     * > **NOTE::** Please note that listeners that are attached to Application Load Balancers must use either `HTTP` or `HTTPS` protocols while listeners that are attached to Network Load Balancers must use the `TCP` protocol.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
