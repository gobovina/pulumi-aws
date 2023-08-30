// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides a SageMaker Domain resource.
 *
 * ## Example Usage
 * ### Basic usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const examplePolicyDocument = aws.iam.getPolicyDocument({
 *     statements: [{
 *         actions: ["sts:AssumeRole"],
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["sagemaker.amazonaws.com"],
 *         }],
 *     }],
 * });
 * const exampleRole = new aws.iam.Role("exampleRole", {
 *     path: "/",
 *     assumeRolePolicy: examplePolicyDocument.then(examplePolicyDocument => examplePolicyDocument.json),
 * });
 * const exampleDomain = new aws.sagemaker.Domain("exampleDomain", {
 *     domainName: "example",
 *     authMode: "IAM",
 *     vpcId: aws_vpc.example.id,
 *     subnetIds: [aws_subnet.example.id],
 *     defaultUserSettings: {
 *         executionRole: exampleRole.arn,
 *     },
 * });
 * ```
 * ### Using Custom Images
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const exampleImage = new aws.sagemaker.Image("exampleImage", {
 *     imageName: "example",
 *     roleArn: aws_iam_role.example.arn,
 * });
 * const exampleAppImageConfig = new aws.sagemaker.AppImageConfig("exampleAppImageConfig", {
 *     appImageConfigName: "example",
 *     kernelGatewayImageConfig: {
 *         kernelSpec: {
 *             name: "example",
 *         },
 *     },
 * });
 * const exampleImageVersion = new aws.sagemaker.ImageVersion("exampleImageVersion", {
 *     imageName: exampleImage.id,
 *     baseImage: "base-image",
 * });
 * const exampleDomain = new aws.sagemaker.Domain("exampleDomain", {
 *     domainName: "example",
 *     authMode: "IAM",
 *     vpcId: aws_vpc.example.id,
 *     subnetIds: [aws_subnet.example.id],
 *     defaultUserSettings: {
 *         executionRole: aws_iam_role.example.arn,
 *         kernelGatewayAppSettings: {
 *             customImages: [{
 *                 appImageConfigName: exampleAppImageConfig.appImageConfigName,
 *                 imageName: exampleImageVersion.imageName,
 *             }],
 *         },
 *     },
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import SageMaker Domains using the `id`. For example:
 *
 * ```sh
 *  $ pulumi import aws:sagemaker/domain:Domain test_domain d-8jgsjtilstu8
 * ```
 */
export class Domain extends pulumi.CustomResource {
    /**
     * Get an existing Domain resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: DomainState, opts?: pulumi.CustomResourceOptions): Domain {
        return new Domain(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:sagemaker/domain:Domain';

    /**
     * Returns true if the given object is an instance of Domain.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Domain {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Domain.__pulumiType;
    }

    /**
     * Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
     */
    public readonly appNetworkAccessType!: pulumi.Output<string | undefined>;
    /**
     * The entity that creates and manages the required security groups for inter-app communication in `VPCOnly` mode. Valid values are `Service` and `Customer`.
     */
    public readonly appSecurityGroupManagement!: pulumi.Output<string | undefined>;
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Domain.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
     */
    public readonly authMode!: pulumi.Output<string>;
    /**
     * The default space settings. See Default Space Settings below.
     */
    public readonly defaultSpaceSettings!: pulumi.Output<outputs.sagemaker.DomainDefaultSpaceSettings | undefined>;
    /**
     * The default user settings. See Default User Settings below.* `domainName` - (Required) The domain name.
     */
    public readonly defaultUserSettings!: pulumi.Output<outputs.sagemaker.DomainDefaultUserSettings>;
    public readonly domainName!: pulumi.Output<string>;
    /**
     * The domain's settings.
     */
    public readonly domainSettings!: pulumi.Output<outputs.sagemaker.DomainDomainSettings | undefined>;
    /**
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     */
    public /*out*/ readonly homeEfsFileSystemId!: pulumi.Output<string>;
    /**
     * The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
     */
    public readonly kmsKeyId!: pulumi.Output<string | undefined>;
    /**
     * The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
     */
    public readonly retentionPolicy!: pulumi.Output<outputs.sagemaker.DomainRetentionPolicy | undefined>;
    /**
     * The ID of the security group that authorizes traffic between the RSessionGateway apps and the RStudioServerPro app.
     */
    public /*out*/ readonly securityGroupIdForDomainBoundary!: pulumi.Output<string>;
    /**
     * The SSO managed application instance ID.
     */
    public /*out*/ readonly singleSignOnManagedApplicationInstanceId!: pulumi.Output<string>;
    /**
     * The VPC subnets that Studio uses for communication.
     */
    public readonly subnetIds!: pulumi.Output<string[]>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * The domain's URL.
     */
    public /*out*/ readonly url!: pulumi.Output<string>;
    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     *
     * The following arguments are optional:
     */
    public readonly vpcId!: pulumi.Output<string>;

    /**
     * Create a Domain resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: DomainArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: DomainArgs | DomainState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as DomainState | undefined;
            resourceInputs["appNetworkAccessType"] = state ? state.appNetworkAccessType : undefined;
            resourceInputs["appSecurityGroupManagement"] = state ? state.appSecurityGroupManagement : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["authMode"] = state ? state.authMode : undefined;
            resourceInputs["defaultSpaceSettings"] = state ? state.defaultSpaceSettings : undefined;
            resourceInputs["defaultUserSettings"] = state ? state.defaultUserSettings : undefined;
            resourceInputs["domainName"] = state ? state.domainName : undefined;
            resourceInputs["domainSettings"] = state ? state.domainSettings : undefined;
            resourceInputs["homeEfsFileSystemId"] = state ? state.homeEfsFileSystemId : undefined;
            resourceInputs["kmsKeyId"] = state ? state.kmsKeyId : undefined;
            resourceInputs["retentionPolicy"] = state ? state.retentionPolicy : undefined;
            resourceInputs["securityGroupIdForDomainBoundary"] = state ? state.securityGroupIdForDomainBoundary : undefined;
            resourceInputs["singleSignOnManagedApplicationInstanceId"] = state ? state.singleSignOnManagedApplicationInstanceId : undefined;
            resourceInputs["subnetIds"] = state ? state.subnetIds : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["url"] = state ? state.url : undefined;
            resourceInputs["vpcId"] = state ? state.vpcId : undefined;
        } else {
            const args = argsOrState as DomainArgs | undefined;
            if ((!args || args.authMode === undefined) && !opts.urn) {
                throw new Error("Missing required property 'authMode'");
            }
            if ((!args || args.defaultUserSettings === undefined) && !opts.urn) {
                throw new Error("Missing required property 'defaultUserSettings'");
            }
            if ((!args || args.domainName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'domainName'");
            }
            if ((!args || args.subnetIds === undefined) && !opts.urn) {
                throw new Error("Missing required property 'subnetIds'");
            }
            if ((!args || args.vpcId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'vpcId'");
            }
            resourceInputs["appNetworkAccessType"] = args ? args.appNetworkAccessType : undefined;
            resourceInputs["appSecurityGroupManagement"] = args ? args.appSecurityGroupManagement : undefined;
            resourceInputs["authMode"] = args ? args.authMode : undefined;
            resourceInputs["defaultSpaceSettings"] = args ? args.defaultSpaceSettings : undefined;
            resourceInputs["defaultUserSettings"] = args ? args.defaultUserSettings : undefined;
            resourceInputs["domainName"] = args ? args.domainName : undefined;
            resourceInputs["domainSettings"] = args ? args.domainSettings : undefined;
            resourceInputs["kmsKeyId"] = args ? args.kmsKeyId : undefined;
            resourceInputs["retentionPolicy"] = args ? args.retentionPolicy : undefined;
            resourceInputs["subnetIds"] = args ? args.subnetIds : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["vpcId"] = args ? args.vpcId : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["homeEfsFileSystemId"] = undefined /*out*/;
            resourceInputs["securityGroupIdForDomainBoundary"] = undefined /*out*/;
            resourceInputs["singleSignOnManagedApplicationInstanceId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
            resourceInputs["url"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Domain.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Domain resources.
 */
export interface DomainState {
    /**
     * Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
     */
    appNetworkAccessType?: pulumi.Input<string>;
    /**
     * The entity that creates and manages the required security groups for inter-app communication in `VPCOnly` mode. Valid values are `Service` and `Customer`.
     */
    appSecurityGroupManagement?: pulumi.Input<string>;
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this Domain.
     */
    arn?: pulumi.Input<string>;
    /**
     * The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
     */
    authMode?: pulumi.Input<string>;
    /**
     * The default space settings. See Default Space Settings below.
     */
    defaultSpaceSettings?: pulumi.Input<inputs.sagemaker.DomainDefaultSpaceSettings>;
    /**
     * The default user settings. See Default User Settings below.* `domainName` - (Required) The domain name.
     */
    defaultUserSettings?: pulumi.Input<inputs.sagemaker.DomainDefaultUserSettings>;
    domainName?: pulumi.Input<string>;
    /**
     * The domain's settings.
     */
    domainSettings?: pulumi.Input<inputs.sagemaker.DomainDomainSettings>;
    /**
     * The ID of the Amazon Elastic File System (EFS) managed by this Domain.
     */
    homeEfsFileSystemId?: pulumi.Input<string>;
    /**
     * The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
     */
    retentionPolicy?: pulumi.Input<inputs.sagemaker.DomainRetentionPolicy>;
    /**
     * The ID of the security group that authorizes traffic between the RSessionGateway apps and the RStudioServerPro app.
     */
    securityGroupIdForDomainBoundary?: pulumi.Input<string>;
    /**
     * The SSO managed application instance ID.
     */
    singleSignOnManagedApplicationInstanceId?: pulumi.Input<string>;
    /**
     * The VPC subnets that Studio uses for communication.
     */
    subnetIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The domain's URL.
     */
    url?: pulumi.Input<string>;
    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     *
     * The following arguments are optional:
     */
    vpcId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Domain resource.
 */
export interface DomainArgs {
    /**
     * Specifies the VPC used for non-EFS traffic. The default value is `PublicInternetOnly`. Valid values are `PublicInternetOnly` and `VpcOnly`.
     */
    appNetworkAccessType?: pulumi.Input<string>;
    /**
     * The entity that creates and manages the required security groups for inter-app communication in `VPCOnly` mode. Valid values are `Service` and `Customer`.
     */
    appSecurityGroupManagement?: pulumi.Input<string>;
    /**
     * The mode of authentication that members use to access the domain. Valid values are `IAM` and `SSO`.
     */
    authMode: pulumi.Input<string>;
    /**
     * The default space settings. See Default Space Settings below.
     */
    defaultSpaceSettings?: pulumi.Input<inputs.sagemaker.DomainDefaultSpaceSettings>;
    /**
     * The default user settings. See Default User Settings below.* `domainName` - (Required) The domain name.
     */
    defaultUserSettings: pulumi.Input<inputs.sagemaker.DomainDefaultUserSettings>;
    domainName: pulumi.Input<string>;
    /**
     * The domain's settings.
     */
    domainSettings?: pulumi.Input<inputs.sagemaker.DomainDomainSettings>;
    /**
     * The AWS KMS customer managed CMK used to encrypt the EFS volume attached to the domain.
     */
    kmsKeyId?: pulumi.Input<string>;
    /**
     * The retention policy for this domain, which specifies whether resources will be retained after the Domain is deleted. By default, all resources are retained. See Retention Policy below.
     */
    retentionPolicy?: pulumi.Input<inputs.sagemaker.DomainRetentionPolicy>;
    /**
     * The VPC subnets that Studio uses for communication.
     */
    subnetIds: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A map of tags to assign to the resource. .If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * The ID of the Amazon Virtual Private Cloud (VPC) that Studio uses for communication.
     *
     * The following arguments are optional:
     */
    vpcId: pulumi.Input<string>;
}
