// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Amplify Branch resource.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.amplify.App("example", {});
 * const master = new aws.amplify.Branch("master", {
 *     appId: example.id,
 *     branchName: "master",
 *     framework: "React",
 *     stage: "PRODUCTION",
 *     environmentVariables: {
 *         REACT_APP_API_SERVER: "https://api.example.com",
 *     },
 * });
 * ```
 * ### Notifications
 *
 * Amplify Console uses EventBridge (formerly known as CloudWatch Events) and SNS for email notifications.  To implement the same functionality, you need to set `enableNotification` in a `aws.amplify.Branch` resource, as well as creating an EventBridge Rule, an SNS topic, and SNS subscriptions.
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.amplify.App("example", {});
 * const master = new aws.amplify.Branch("master", {
 *     appId: example.id,
 *     branchName: "master",
 *     enableNotification: true,
 * });
 * // EventBridge Rule for Amplify notifications
 * const amplifyAppMasterEventRule = new aws.cloudwatch.EventRule("amplifyAppMasterEventRule", {
 *     description: pulumi.interpolate`AWS Amplify build notifications for :  App: ${aws_amplify_app.app.id} Branch: ${master.branchName}`,
 *     eventPattern: pulumi.all([example.id, master.branchName]).apply(([id, branchName]) => JSON.stringify({
 *         detail: {
 *             appId: [id],
 *             branchName: [branchName],
 *             jobStatus: [
 *                 "SUCCEED",
 *                 "FAILED",
 *                 "STARTED",
 *             ],
 *         },
 *         "detail-type": ["Amplify Deployment Status Change"],
 *         source: ["aws.amplify"],
 *     })),
 * });
 * const amplifyAppMasterTopic = new aws.sns.Topic("amplifyAppMasterTopic", {});
 * const amplifyAppMasterEventTarget = new aws.cloudwatch.EventTarget("amplifyAppMasterEventTarget", {
 *     rule: amplifyAppMasterEventRule.name,
 *     arn: amplifyAppMasterTopic.arn,
 *     inputTransformer: {
 *         inputPaths: {
 *             jobId: "$.detail.jobId",
 *             appId: "$.detail.appId",
 *             region: "$.region",
 *             branch: "$.detail.branchName",
 *             status: "$.detail.jobStatus",
 *         },
 *         inputTemplate: "\"Build notification from the AWS Amplify Console for app: https://<branch>.<appId>.amplifyapp.com/. Your build status is <status>. Go to https://console.aws.amazon.com/amplify/home?region=<region>#<appId>/<branch>/<jobId> to view details on your build. \"",
 *     },
 * });
 * // SNS Topic for Amplify notifications
 * const amplifyAppMasterPolicyDocument = pulumi.all([master.arn, amplifyAppMasterTopic.arn]).apply(([masterArn, amplifyAppMasterTopicArn]) => aws.iam.getPolicyDocumentOutput({
 *     statements: [{
 *         sid: `Allow_Publish_Events ${masterArn}`,
 *         effect: "Allow",
 *         actions: ["SNS:Publish"],
 *         principals: [{
 *             type: "Service",
 *             identifiers: ["events.amazonaws.com"],
 *         }],
 *         resources: [amplifyAppMasterTopicArn],
 *     }],
 * }));
 * const amplifyAppMasterTopicPolicy = new aws.sns.TopicPolicy("amplifyAppMasterTopicPolicy", {
 *     arn: amplifyAppMasterTopic.arn,
 *     policy: amplifyAppMasterPolicyDocument.apply(amplifyAppMasterPolicyDocument => amplifyAppMasterPolicyDocument.json),
 * });
 * const _this = new aws.sns.TopicSubscription("this", {
 *     topic: amplifyAppMasterTopic.arn,
 *     protocol: "email",
 *     endpoint: "user@acme.com",
 * });
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Amplify branch using `app_id` and `branch_name`. For example:
 *
 * ```sh
 *  $ pulumi import aws:amplify/branch:Branch master d2ypk4k47z8u6/master
 * ```
 */
export class Branch extends pulumi.CustomResource {
    /**
     * Get an existing Branch resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: BranchState, opts?: pulumi.CustomResourceOptions): Branch {
        return new Branch(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:amplify/branch:Branch';

    /**
     * Returns true if the given object is an instance of Branch.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Branch {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Branch.__pulumiType;
    }

    /**
     * Unique ID for an Amplify app.
     */
    public readonly appId!: pulumi.Output<string>;
    /**
     * ARN for the branch.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * A list of custom resources that are linked to this branch.
     */
    public /*out*/ readonly associatedResources!: pulumi.Output<string[]>;
    /**
     * ARN for a backend environment that is part of an Amplify app.
     */
    public readonly backendEnvironmentArn!: pulumi.Output<string | undefined>;
    /**
     * Basic authorization credentials for the branch.
     */
    public readonly basicAuthCredentials!: pulumi.Output<string | undefined>;
    /**
     * Name for the branch.
     */
    public readonly branchName!: pulumi.Output<string>;
    /**
     * Custom domains for the branch.
     */
    public /*out*/ readonly customDomains!: pulumi.Output<string[]>;
    /**
     * Description for the branch.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Destination branch if the branch is a pull request branch.
     */
    public /*out*/ readonly destinationBranch!: pulumi.Output<string>;
    /**
     * Display name for a branch. This is used as the default domain prefix.
     */
    public readonly displayName!: pulumi.Output<string>;
    /**
     * Enables auto building for the branch.
     */
    public readonly enableAutoBuild!: pulumi.Output<boolean | undefined>;
    /**
     * Enables basic authorization for the branch.
     */
    public readonly enableBasicAuth!: pulumi.Output<boolean | undefined>;
    /**
     * Enables notifications for the branch.
     */
    public readonly enableNotification!: pulumi.Output<boolean | undefined>;
    /**
     * Enables performance mode for the branch.
     */
    public readonly enablePerformanceMode!: pulumi.Output<boolean | undefined>;
    /**
     * Enables pull request previews for this branch.
     */
    public readonly enablePullRequestPreview!: pulumi.Output<boolean | undefined>;
    /**
     * Environment variables for the branch.
     */
    public readonly environmentVariables!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Framework for the branch.
     */
    public readonly framework!: pulumi.Output<string | undefined>;
    /**
     * Amplify environment name for the pull request.
     */
    public readonly pullRequestEnvironmentName!: pulumi.Output<string | undefined>;
    /**
     * Source branch if the branch is a pull request branch.
     */
    public /*out*/ readonly sourceBranch!: pulumi.Output<string>;
    /**
     * Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     */
    public readonly stage!: pulumi.Output<string | undefined>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    /**
     * Content Time To Live (TTL) for the website in seconds.
     */
    public readonly ttl!: pulumi.Output<string | undefined>;

    /**
     * Create a Branch resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: BranchArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: BranchArgs | BranchState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as BranchState | undefined;
            resourceInputs["appId"] = state ? state.appId : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["associatedResources"] = state ? state.associatedResources : undefined;
            resourceInputs["backendEnvironmentArn"] = state ? state.backendEnvironmentArn : undefined;
            resourceInputs["basicAuthCredentials"] = state ? state.basicAuthCredentials : undefined;
            resourceInputs["branchName"] = state ? state.branchName : undefined;
            resourceInputs["customDomains"] = state ? state.customDomains : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["destinationBranch"] = state ? state.destinationBranch : undefined;
            resourceInputs["displayName"] = state ? state.displayName : undefined;
            resourceInputs["enableAutoBuild"] = state ? state.enableAutoBuild : undefined;
            resourceInputs["enableBasicAuth"] = state ? state.enableBasicAuth : undefined;
            resourceInputs["enableNotification"] = state ? state.enableNotification : undefined;
            resourceInputs["enablePerformanceMode"] = state ? state.enablePerformanceMode : undefined;
            resourceInputs["enablePullRequestPreview"] = state ? state.enablePullRequestPreview : undefined;
            resourceInputs["environmentVariables"] = state ? state.environmentVariables : undefined;
            resourceInputs["framework"] = state ? state.framework : undefined;
            resourceInputs["pullRequestEnvironmentName"] = state ? state.pullRequestEnvironmentName : undefined;
            resourceInputs["sourceBranch"] = state ? state.sourceBranch : undefined;
            resourceInputs["stage"] = state ? state.stage : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["ttl"] = state ? state.ttl : undefined;
        } else {
            const args = argsOrState as BranchArgs | undefined;
            if ((!args || args.appId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'appId'");
            }
            if ((!args || args.branchName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'branchName'");
            }
            resourceInputs["appId"] = args ? args.appId : undefined;
            resourceInputs["backendEnvironmentArn"] = args ? args.backendEnvironmentArn : undefined;
            resourceInputs["basicAuthCredentials"] = args?.basicAuthCredentials ? pulumi.secret(args.basicAuthCredentials) : undefined;
            resourceInputs["branchName"] = args ? args.branchName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["displayName"] = args ? args.displayName : undefined;
            resourceInputs["enableAutoBuild"] = args ? args.enableAutoBuild : undefined;
            resourceInputs["enableBasicAuth"] = args ? args.enableBasicAuth : undefined;
            resourceInputs["enableNotification"] = args ? args.enableNotification : undefined;
            resourceInputs["enablePerformanceMode"] = args ? args.enablePerformanceMode : undefined;
            resourceInputs["enablePullRequestPreview"] = args ? args.enablePullRequestPreview : undefined;
            resourceInputs["environmentVariables"] = args ? args.environmentVariables : undefined;
            resourceInputs["framework"] = args ? args.framework : undefined;
            resourceInputs["pullRequestEnvironmentName"] = args ? args.pullRequestEnvironmentName : undefined;
            resourceInputs["stage"] = args ? args.stage : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["ttl"] = args ? args.ttl : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["associatedResources"] = undefined /*out*/;
            resourceInputs["customDomains"] = undefined /*out*/;
            resourceInputs["destinationBranch"] = undefined /*out*/;
            resourceInputs["sourceBranch"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["basicAuthCredentials"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(Branch.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Branch resources.
 */
export interface BranchState {
    /**
     * Unique ID for an Amplify app.
     */
    appId?: pulumi.Input<string>;
    /**
     * ARN for the branch.
     */
    arn?: pulumi.Input<string>;
    /**
     * A list of custom resources that are linked to this branch.
     */
    associatedResources?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * ARN for a backend environment that is part of an Amplify app.
     */
    backendEnvironmentArn?: pulumi.Input<string>;
    /**
     * Basic authorization credentials for the branch.
     */
    basicAuthCredentials?: pulumi.Input<string>;
    /**
     * Name for the branch.
     */
    branchName?: pulumi.Input<string>;
    /**
     * Custom domains for the branch.
     */
    customDomains?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Description for the branch.
     */
    description?: pulumi.Input<string>;
    /**
     * Destination branch if the branch is a pull request branch.
     */
    destinationBranch?: pulumi.Input<string>;
    /**
     * Display name for a branch. This is used as the default domain prefix.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Enables auto building for the branch.
     */
    enableAutoBuild?: pulumi.Input<boolean>;
    /**
     * Enables basic authorization for the branch.
     */
    enableBasicAuth?: pulumi.Input<boolean>;
    /**
     * Enables notifications for the branch.
     */
    enableNotification?: pulumi.Input<boolean>;
    /**
     * Enables performance mode for the branch.
     */
    enablePerformanceMode?: pulumi.Input<boolean>;
    /**
     * Enables pull request previews for this branch.
     */
    enablePullRequestPreview?: pulumi.Input<boolean>;
    /**
     * Environment variables for the branch.
     */
    environmentVariables?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Framework for the branch.
     */
    framework?: pulumi.Input<string>;
    /**
     * Amplify environment name for the pull request.
     */
    pullRequestEnvironmentName?: pulumi.Input<string>;
    /**
     * Source branch if the branch is a pull request branch.
     */
    sourceBranch?: pulumi.Input<string>;
    /**
     * Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     */
    stage?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Content Time To Live (TTL) for the website in seconds.
     */
    ttl?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Branch resource.
 */
export interface BranchArgs {
    /**
     * Unique ID for an Amplify app.
     */
    appId: pulumi.Input<string>;
    /**
     * ARN for a backend environment that is part of an Amplify app.
     */
    backendEnvironmentArn?: pulumi.Input<string>;
    /**
     * Basic authorization credentials for the branch.
     */
    basicAuthCredentials?: pulumi.Input<string>;
    /**
     * Name for the branch.
     */
    branchName: pulumi.Input<string>;
    /**
     * Description for the branch.
     */
    description?: pulumi.Input<string>;
    /**
     * Display name for a branch. This is used as the default domain prefix.
     */
    displayName?: pulumi.Input<string>;
    /**
     * Enables auto building for the branch.
     */
    enableAutoBuild?: pulumi.Input<boolean>;
    /**
     * Enables basic authorization for the branch.
     */
    enableBasicAuth?: pulumi.Input<boolean>;
    /**
     * Enables notifications for the branch.
     */
    enableNotification?: pulumi.Input<boolean>;
    /**
     * Enables performance mode for the branch.
     */
    enablePerformanceMode?: pulumi.Input<boolean>;
    /**
     * Enables pull request previews for this branch.
     */
    enablePullRequestPreview?: pulumi.Input<boolean>;
    /**
     * Environment variables for the branch.
     */
    environmentVariables?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Framework for the branch.
     */
    framework?: pulumi.Input<string>;
    /**
     * Amplify environment name for the pull request.
     */
    pullRequestEnvironmentName?: pulumi.Input<string>;
    /**
     * Describes the current stage for the branch. Valid values: `PRODUCTION`, `BETA`, `DEVELOPMENT`, `EXPERIMENTAL`, `PULL_REQUEST`.
     */
    stage?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Content Time To Live (TTL) for the website in seconds.
     */
    ttl?: pulumi.Input<string>;
}
