// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs, enums } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a AWS Transfer Server resource.
 *
 * > **NOTE on AWS IAM permissions:** If the `endpointType` is set to `VPC`, the `ec2:DescribeVpcEndpoints` and `ec2:ModifyVpcEndpoint` [actions](https://docs.aws.amazon.com/service-authorization/latest/reference/list_amazonec2.html#amazonec2-actions-as-permissions) are used.
 *
 * ## Example Usage
 * ### Basic
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.transfer.Server("example", {
 *     tags: {
 *         Name: "Example",
 *     },
 * });
 * ```
 * ### Security Policy Name
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.transfer.Server("example", {
 *     securityPolicyName: "TransferSecurityPolicy-2020-06",
 * });
 * ```
 * ### VPC Endpoint
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.transfer.Server("example", {
 *     endpointType: "VPC",
 *     endpointDetails: {
 *         addressAllocationIds: [aws_eip.example.id],
 *         subnetIds: [aws_subnet.example.id],
 *         vpcId: aws_vpc.example.id,
 *     },
 * });
 * ```
 * ### AWS Directory authentication
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.transfer.Server("example", {
 *     identityProviderType: "AWS_DIRECTORY_SERVICE",
 *     directoryId: aws_directory_service_directory.example.id,
 * });
 * ```
 * ### AWS Lambda authentication
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.transfer.Server("example", {
 *     identityProviderType: "AWS_LAMBDA",
 *     "function": aws_lambda_identity_provider.example.arn,
 * });
 * ```
 * ### Protocols
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.transfer.Server("example", {
 *     endpointType: "VPC",
 *     endpointDetails: {
 *         subnetIds: [aws_subnet.example.id],
 *         vpcId: aws_vpc.example.id,
 *     },
 *     protocols: [
 *         "FTP",
 *         "FTPS",
 *     ],
 *     certificate: aws_acm_certificate.example.arn,
 *     identityProviderType: "API_GATEWAY",
 *     url: `${aws_api_gateway_deployment.example.invoke_url}${aws_api_gateway_resource.example.path}`,
 * });
 * ```
 *
 * ## Import
 *
 * Transfer Servers can be imported using the `server id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:transfer/server:Server example s-12345678
 * ```
 *
 *  Certain resource arguments, such as `host_key`, cannot be read via the API and imported into the provider. This provider will display a difference for these arguments the first run after import if declared in the provider configuration for an imported resource.
 */
export class Server extends pulumi.CustomResource {
    /**
     * Get an existing Server resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ServerState, opts?: pulumi.CustomResourceOptions): Server {
        return new Server(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:transfer/server:Server';

    /**
     * Returns true if the given object is an instance of Server.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Server {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Server.__pulumiType;
    }

    /**
     * Amazon Resource Name (ARN) of Transfer Server
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM) certificate. This is required when `protocols` is set to `FTPS`
     */
    public readonly certificate!: pulumi.Output<string | undefined>;
    /**
     * The directory service ID of the directory service you want to connect to with an `identityProviderType` of `AWS_DIRECTORY_SERVICE`.
     */
    public readonly directoryId!: pulumi.Output<string | undefined>;
    /**
     * The domain of the storage system that is used for file transfers. Valid values are: `S3` and `EFS`. The default value is `S3`.
     */
    public readonly domain!: pulumi.Output<string | undefined>;
    /**
     * The endpoint of the Transfer Server (e.g., `s-12345678.server.transfer.REGION.amazonaws.com`)
     */
    public /*out*/ readonly endpoint!: pulumi.Output<string>;
    /**
     * The virtual private cloud (VPC) endpoint settings that you want to configure for your SFTP server. Fields documented below.
     */
    public readonly endpointDetails!: pulumi.Output<outputs.transfer.ServerEndpointDetails | undefined>;
    /**
     * The type of endpoint that you want your SFTP server connect to. If you connect to a `VPC` (or `VPC_ENDPOINT`), your SFTP server isn't accessible over the public internet. If you want to connect your SFTP server via public internet, set `PUBLIC`.  Defaults to `PUBLIC`.
     */
    public readonly endpointType!: pulumi.Output<string | undefined>;
    /**
     * A boolean that indicates all users associated with the server should be deleted so that the Server can be destroyed without error. The default value is `false`. This option only applies to servers configured with a `SERVICE_MANAGED` `identityProviderType`.
     */
    public readonly forceDestroy!: pulumi.Output<boolean | undefined>;
    /**
     * The ARN for a lambda function to use for the Identity provider.
     */
    public readonly function!: pulumi.Output<string | undefined>;
    /**
     * RSA private key (e.g., as generated by the `ssh-keygen -N "" -m PEM -f my-new-server-key` command).
     */
    public readonly hostKey!: pulumi.Output<string | undefined>;
    /**
     * This value contains the message-digest algorithm (MD5) hash of the server's host key. This value is equivalent to the output of the `ssh-keygen -l -E md5 -f my-new-server-key` command.
     */
    public /*out*/ readonly hostKeyFingerprint!: pulumi.Output<string>;
    /**
     * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice. Using `AWS_DIRECTORY_SERVICE` will allow for authentication against AWS Managed Active Directory or Microsoft Active Directory in your on-premises environment, or in AWS using AD Connectors. Use the `AWS_LAMBDA` value to directly use a Lambda function as your identity provider. If you choose this value, you must specify the ARN for the lambda function in the `function` argument.
     */
    public readonly identityProviderType!: pulumi.Output<string | undefined>;
    /**
     * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identityProviderType` of `API_GATEWAY`.
     */
    public readonly invocationRole!: pulumi.Output<string | undefined>;
    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
     */
    public readonly loggingRole!: pulumi.Output<string | undefined>;
    /**
     * Specify a string to display when users connect to a server. This string is displayed after the user authenticates. The SFTP protocol does not support post-authentication display banners.
     */
    public readonly postAuthenticationLoginBanner!: pulumi.Output<string | undefined>;
    /**
     * Specify a string to display when users connect to a server. This string is displayed before the user authenticates.
     */
    public readonly preAuthenticationLoginBanner!: pulumi.Output<string | undefined>;
    /**
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint. This defaults to `SFTP` . The available protocols are:
     * * `SFTP`: File transfer over SSH
     * * `FTPS`: File transfer with TLS encryption
     * * `FTP`: Unencrypted file transfer
     */
    public readonly protocols!: pulumi.Output<string[]>;
    /**
     * Specifies the name of the security policy that is attached to the server. Possible values are `TransferSecurityPolicy-2018-11`, `TransferSecurityPolicy-2020-06`, and  `TransferSecurityPolicy-FIPS-2020-06`. Default value is: `TransferSecurityPolicy-2018-11`.
     */
    public readonly securityPolicyName!: pulumi.Output<string | undefined>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * - URL of the service endpoint used to authenticate users with an `identityProviderType` of `API_GATEWAY`.
     */
    public readonly url!: pulumi.Output<string | undefined>;

    /**
     * Create a Server resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: ServerArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: ServerArgs | ServerState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as ServerState | undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["certificate"] = state ? state.certificate : undefined;
            resourceInputs["directoryId"] = state ? state.directoryId : undefined;
            resourceInputs["domain"] = state ? state.domain : undefined;
            resourceInputs["endpoint"] = state ? state.endpoint : undefined;
            resourceInputs["endpointDetails"] = state ? state.endpointDetails : undefined;
            resourceInputs["endpointType"] = state ? state.endpointType : undefined;
            resourceInputs["forceDestroy"] = state ? state.forceDestroy : undefined;
            resourceInputs["function"] = state ? state.function : undefined;
            resourceInputs["hostKey"] = state ? state.hostKey : undefined;
            resourceInputs["hostKeyFingerprint"] = state ? state.hostKeyFingerprint : undefined;
            resourceInputs["identityProviderType"] = state ? state.identityProviderType : undefined;
            resourceInputs["invocationRole"] = state ? state.invocationRole : undefined;
            resourceInputs["loggingRole"] = state ? state.loggingRole : undefined;
            resourceInputs["postAuthenticationLoginBanner"] = state ? state.postAuthenticationLoginBanner : undefined;
            resourceInputs["preAuthenticationLoginBanner"] = state ? state.preAuthenticationLoginBanner : undefined;
            resourceInputs["protocols"] = state ? state.protocols : undefined;
            resourceInputs["securityPolicyName"] = state ? state.securityPolicyName : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
        } else {
            const args = argsOrState as ServerArgs | undefined;
            resourceInputs["certificate"] = args ? args.certificate : undefined;
            resourceInputs["directoryId"] = args ? args.directoryId : undefined;
            resourceInputs["domain"] = args ? args.domain : undefined;
            resourceInputs["endpointDetails"] = args ? args.endpointDetails : undefined;
            resourceInputs["endpointType"] = args ? args.endpointType : undefined;
            resourceInputs["forceDestroy"] = args ? args.forceDestroy : undefined;
            resourceInputs["function"] = args ? args.function : undefined;
            resourceInputs["hostKey"] = args ? args.hostKey : undefined;
            resourceInputs["identityProviderType"] = args ? args.identityProviderType : undefined;
            resourceInputs["invocationRole"] = args ? args.invocationRole : undefined;
            resourceInputs["loggingRole"] = args ? args.loggingRole : undefined;
            resourceInputs["postAuthenticationLoginBanner"] = args ? args.postAuthenticationLoginBanner : undefined;
            resourceInputs["preAuthenticationLoginBanner"] = args ? args.preAuthenticationLoginBanner : undefined;
            resourceInputs["protocols"] = args ? args.protocols : undefined;
            resourceInputs["securityPolicyName"] = args ? args.securityPolicyName : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["url"] = args ? args.url : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["endpoint"] = undefined /*out*/;
            resourceInputs["hostKeyFingerprint"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Server.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Server resources.
 */
export interface ServerState {
    /**
     * Amazon Resource Name (ARN) of Transfer Server
     */
    arn?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM) certificate. This is required when `protocols` is set to `FTPS`
     */
    certificate?: pulumi.Input<string>;
    /**
     * The directory service ID of the directory service you want to connect to with an `identityProviderType` of `AWS_DIRECTORY_SERVICE`.
     */
    directoryId?: pulumi.Input<string>;
    /**
     * The domain of the storage system that is used for file transfers. Valid values are: `S3` and `EFS`. The default value is `S3`.
     */
    domain?: pulumi.Input<string>;
    /**
     * The endpoint of the Transfer Server (e.g., `s-12345678.server.transfer.REGION.amazonaws.com`)
     */
    endpoint?: pulumi.Input<string>;
    /**
     * The virtual private cloud (VPC) endpoint settings that you want to configure for your SFTP server. Fields documented below.
     */
    endpointDetails?: pulumi.Input<inputs.transfer.ServerEndpointDetails>;
    /**
     * The type of endpoint that you want your SFTP server connect to. If you connect to a `VPC` (or `VPC_ENDPOINT`), your SFTP server isn't accessible over the public internet. If you want to connect your SFTP server via public internet, set `PUBLIC`.  Defaults to `PUBLIC`.
     */
    endpointType?: pulumi.Input<string>;
    /**
     * A boolean that indicates all users associated with the server should be deleted so that the Server can be destroyed without error. The default value is `false`. This option only applies to servers configured with a `SERVICE_MANAGED` `identityProviderType`.
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * The ARN for a lambda function to use for the Identity provider.
     */
    function?: pulumi.Input<string>;
    /**
     * RSA private key (e.g., as generated by the `ssh-keygen -N "" -m PEM -f my-new-server-key` command).
     */
    hostKey?: pulumi.Input<string>;
    /**
     * This value contains the message-digest algorithm (MD5) hash of the server's host key. This value is equivalent to the output of the `ssh-keygen -l -E md5 -f my-new-server-key` command.
     */
    hostKeyFingerprint?: pulumi.Input<string>;
    /**
     * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice. Using `AWS_DIRECTORY_SERVICE` will allow for authentication against AWS Managed Active Directory or Microsoft Active Directory in your on-premises environment, or in AWS using AD Connectors. Use the `AWS_LAMBDA` value to directly use a Lambda function as your identity provider. If you choose this value, you must specify the ARN for the lambda function in the `function` argument.
     */
    identityProviderType?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identityProviderType` of `API_GATEWAY`.
     */
    invocationRole?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
     */
    loggingRole?: pulumi.Input<string>;
    /**
     * Specify a string to display when users connect to a server. This string is displayed after the user authenticates. The SFTP protocol does not support post-authentication display banners.
     */
    postAuthenticationLoginBanner?: pulumi.Input<string>;
    /**
     * Specify a string to display when users connect to a server. This string is displayed before the user authenticates.
     */
    preAuthenticationLoginBanner?: pulumi.Input<string>;
    /**
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint. This defaults to `SFTP` . The available protocols are:
     * * `SFTP`: File transfer over SSH
     * * `FTPS`: File transfer with TLS encryption
     * * `FTP`: Unencrypted file transfer
     */
    protocols?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the name of the security policy that is attached to the server. Possible values are `TransferSecurityPolicy-2018-11`, `TransferSecurityPolicy-2020-06`, and  `TransferSecurityPolicy-FIPS-2020-06`. Default value is: `TransferSecurityPolicy-2018-11`.
     */
    securityPolicyName?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * - URL of the service endpoint used to authenticate users with an `identityProviderType` of `API_GATEWAY`.
     */
    url?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Server resource.
 */
export interface ServerArgs {
    /**
     * The Amazon Resource Name (ARN) of the AWS Certificate Manager (ACM) certificate. This is required when `protocols` is set to `FTPS`
     */
    certificate?: pulumi.Input<string>;
    /**
     * The directory service ID of the directory service you want to connect to with an `identityProviderType` of `AWS_DIRECTORY_SERVICE`.
     */
    directoryId?: pulumi.Input<string>;
    /**
     * The domain of the storage system that is used for file transfers. Valid values are: `S3` and `EFS`. The default value is `S3`.
     */
    domain?: pulumi.Input<string>;
    /**
     * The virtual private cloud (VPC) endpoint settings that you want to configure for your SFTP server. Fields documented below.
     */
    endpointDetails?: pulumi.Input<inputs.transfer.ServerEndpointDetails>;
    /**
     * The type of endpoint that you want your SFTP server connect to. If you connect to a `VPC` (or `VPC_ENDPOINT`), your SFTP server isn't accessible over the public internet. If you want to connect your SFTP server via public internet, set `PUBLIC`.  Defaults to `PUBLIC`.
     */
    endpointType?: pulumi.Input<string>;
    /**
     * A boolean that indicates all users associated with the server should be deleted so that the Server can be destroyed without error. The default value is `false`. This option only applies to servers configured with a `SERVICE_MANAGED` `identityProviderType`.
     */
    forceDestroy?: pulumi.Input<boolean>;
    /**
     * The ARN for a lambda function to use for the Identity provider.
     */
    function?: pulumi.Input<string>;
    /**
     * RSA private key (e.g., as generated by the `ssh-keygen -N "" -m PEM -f my-new-server-key` command).
     */
    hostKey?: pulumi.Input<string>;
    /**
     * The mode of authentication enabled for this service. The default value is `SERVICE_MANAGED`, which allows you to store and access SFTP user credentials within the service. `API_GATEWAY` indicates that user authentication requires a call to an API Gateway endpoint URL provided by you to integrate an identity provider of your choice. Using `AWS_DIRECTORY_SERVICE` will allow for authentication against AWS Managed Active Directory or Microsoft Active Directory in your on-premises environment, or in AWS using AD Connectors. Use the `AWS_LAMBDA` value to directly use a Lambda function as your identity provider. If you choose this value, you must specify the ARN for the lambda function in the `function` argument.
     */
    identityProviderType?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of the IAM role used to authenticate the user account with an `identityProviderType` of `API_GATEWAY`.
     */
    invocationRole?: pulumi.Input<string>;
    /**
     * Amazon Resource Name (ARN) of an IAM role that allows the service to write your SFTP users’ activity to your Amazon CloudWatch logs for monitoring and auditing purposes.
     */
    loggingRole?: pulumi.Input<string>;
    /**
     * Specify a string to display when users connect to a server. This string is displayed after the user authenticates. The SFTP protocol does not support post-authentication display banners.
     */
    postAuthenticationLoginBanner?: pulumi.Input<string>;
    /**
     * Specify a string to display when users connect to a server. This string is displayed before the user authenticates.
     */
    preAuthenticationLoginBanner?: pulumi.Input<string>;
    /**
     * Specifies the file transfer protocol or protocols over which your file transfer protocol client can connect to your server's endpoint. This defaults to `SFTP` . The available protocols are:
     * * `SFTP`: File transfer over SSH
     * * `FTPS`: File transfer with TLS encryption
     * * `FTP`: Unencrypted file transfer
     */
    protocols?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Specifies the name of the security policy that is attached to the server. Possible values are `TransferSecurityPolicy-2018-11`, `TransferSecurityPolicy-2020-06`, and  `TransferSecurityPolicy-FIPS-2020-06`. Default value is: `TransferSecurityPolicy-2018-11`.
     */
    securityPolicyName?: pulumi.Input<string>;
    /**
     * A map of tags to assign to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * - URL of the service endpoint used to authenticate users with an `identityProviderType` of `API_GATEWAY`.
     */
    url?: pulumi.Input<string>;
}
