// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Provides an Amplify App resource, a fullstack serverless app hosted on the [AWS Amplify Console](https://docs.aws.amazon.com/amplify/latest/userguide/welcome.html).
 *
 * > **Note:** When you create/update an Amplify App from the provider, you may end up with the error "BadRequestException: You should at least provide one valid token" because of authentication issues. See the section "Repository with Tokens" below.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.amplify.App("example", {
 *     buildSpec: `  version: 0.1
 *   frontend:
 *     phases:
 *       preBuild:
 *         commands:
 *           - yarn install
 *       build:
 *         commands:
 *           - yarn run build
 *     artifacts:
 *       baseDirectory: build
 *       files:
 *         - '**&#47;*'
 *     cache:
 *       paths:
 *         - node_modules/**&#47;*
 *
 * `,
 *     customRules: [{
 *         source: "/<*>",
 *         status: "404",
 *         target: "/index.html",
 *     }],
 *     environmentVariables: {
 *         ENV: "test",
 *     },
 *     repository: "https://github.com/example/app",
 * });
 * ```
 * ### Repository with Tokens
 *
 * If you create a new Amplify App with the `repository` argument, you also need to set `oauthToken` or `accessToken` for authentication. For GitHub, get a [personal access token](https://help.github.com/en/github/authenticating-to-github/creating-a-personal-access-token-for-the-command-line) and set `accessToken` as follows:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.amplify.App("example", {
 *     accessToken: "...",
 *     repository: "https://github.com/example/app",
 * });
 * ```
 *
 * You can omit `accessToken` if you import an existing Amplify App created by the Amplify Console (using OAuth for authentication).
 * ### Auto Branch Creation
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.amplify.App("example", {
 *     autoBranchCreationConfig: {
 *         enableAutoBuild: true,
 *     },
 *     autoBranchCreationPatterns: [
 *         "*",
 *         "*&#47;**",
 *     ],
 *     enableAutoBranchCreation: true,
 * });
 * ```
 * ### Rewrites and Redirects
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.amplify.App("example", {customRules: [
 *     {
 *         source: "/api/<*>",
 *         status: "200",
 *         target: "https://api.example.com/api/<*>",
 *     },
 *     {
 *         source: "</^[^.]+$|\\.(?!(css|gif|ico|jpg|js|png|txt|svg|woff|ttf|map|json)$)([^.]+$)/>",
 *         status: "200",
 *         target: "/index.html",
 *     },
 * ]});
 * ```
 * ### Custom Image
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.amplify.App("example", {environmentVariables: {
 *     _CUSTOM_IMAGE: "node:16",
 * }});
 * ```
 * ### Custom Headers
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const example = new aws.amplify.App("example", {customHeaders: `  customHeaders:
 *     - pattern: '**'
 *       headers:
 *         - key: 'Strict-Transport-Security'
 *           value: 'max-age=31536000; includeSubDomains'
 *         - key: 'X-Frame-Options'
 *           value: 'SAMEORIGIN'
 *         - key: 'X-XSS-Protection'
 *           value: '1; mode=block'
 *         - key: 'X-Content-Type-Options'
 *           value: 'nosniff'
 *         - key: 'Content-Security-Policy'
 *           value: "default-src 'self'"
 *
 * `});
 * ```
 *
 * ## Import
 *
 * Using `pulumi import`, import Amplify App using Amplify App ID (appId). For example:
 *
 * ```sh
 *  $ pulumi import aws:amplify/app:App example d2ypk4k47z8u6
 * ```
 *  App ID can be obtained from App ARN (e.g., `arn:aws:amplify:us-east-1:12345678:apps/d2ypk4k47z8u6`).
 */
export class App extends pulumi.CustomResource {
    /**
     * Get an existing App resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AppState, opts?: pulumi.CustomResourceOptions): App {
        return new App(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:amplify/app:App';

    /**
     * Returns true if the given object is an instance of App.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is App {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === App.__pulumiType;
    }

    /**
     * Personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
     */
    public readonly accessToken!: pulumi.Output<string | undefined>;
    /**
     * ARN of the Amplify app.
     */
    public /*out*/ readonly arn!: pulumi.Output<string>;
    /**
     * Automated branch creation configuration for an Amplify app. An `autoBranchCreationConfig` block is documented below.
     */
    public readonly autoBranchCreationConfig!: pulumi.Output<outputs.amplify.AppAutoBranchCreationConfig>;
    /**
     * Automated branch creation glob patterns for an Amplify app.
     */
    public readonly autoBranchCreationPatterns!: pulumi.Output<string[] | undefined>;
    /**
     * Credentials for basic authorization for an Amplify app.
     */
    public readonly basicAuthCredentials!: pulumi.Output<string | undefined>;
    /**
     * The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
     */
    public readonly buildSpec!: pulumi.Output<string>;
    /**
     * The [custom HTTP headers](https://docs.aws.amazon.com/amplify/latest/userguide/custom-headers.html) for an Amplify app.
     */
    public readonly customHeaders!: pulumi.Output<string>;
    /**
     * Custom rewrite and redirect rules for an Amplify app. A `customRule` block is documented below.
     */
    public readonly customRules!: pulumi.Output<outputs.amplify.AppCustomRule[] | undefined>;
    /**
     * Default domain for the Amplify app.
     */
    public /*out*/ readonly defaultDomain!: pulumi.Output<string>;
    /**
     * Description for an Amplify app.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Enables automated branch creation for an Amplify app.
     */
    public readonly enableAutoBranchCreation!: pulumi.Output<boolean | undefined>;
    /**
     * Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
     */
    public readonly enableBasicAuth!: pulumi.Output<boolean | undefined>;
    /**
     * Enables auto-building of branches for the Amplify App.
     */
    public readonly enableBranchAutoBuild!: pulumi.Output<boolean | undefined>;
    /**
     * Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
     */
    public readonly enableBranchAutoDeletion!: pulumi.Output<boolean | undefined>;
    /**
     * Environment variables map for an Amplify app.
     */
    public readonly environmentVariables!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * AWS Identity and Access Management (IAM) service role for an Amplify app.
     */
    public readonly iamServiceRoleArn!: pulumi.Output<string | undefined>;
    /**
     * Name for an Amplify app.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
     */
    public readonly oauthToken!: pulumi.Output<string | undefined>;
    /**
     * Platform or framework for an Amplify app. Valid values: `WEB`, `WEB_COMPUTE`. Default value: `WEB`.
     */
    public readonly platform!: pulumi.Output<string | undefined>;
    /**
     * Describes the information about a production branch for an Amplify app. A `productionBranch` block is documented below.
     */
    public /*out*/ readonly productionBranches!: pulumi.Output<outputs.amplify.AppProductionBranch[]>;
    /**
     * Repository for an Amplify app.
     */
    public readonly repository!: pulumi.Output<string | undefined>;
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
     * Create a App resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AppArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AppArgs | AppState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AppState | undefined;
            resourceInputs["accessToken"] = state ? state.accessToken : undefined;
            resourceInputs["arn"] = state ? state.arn : undefined;
            resourceInputs["autoBranchCreationConfig"] = state ? state.autoBranchCreationConfig : undefined;
            resourceInputs["autoBranchCreationPatterns"] = state ? state.autoBranchCreationPatterns : undefined;
            resourceInputs["basicAuthCredentials"] = state ? state.basicAuthCredentials : undefined;
            resourceInputs["buildSpec"] = state ? state.buildSpec : undefined;
            resourceInputs["customHeaders"] = state ? state.customHeaders : undefined;
            resourceInputs["customRules"] = state ? state.customRules : undefined;
            resourceInputs["defaultDomain"] = state ? state.defaultDomain : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["enableAutoBranchCreation"] = state ? state.enableAutoBranchCreation : undefined;
            resourceInputs["enableBasicAuth"] = state ? state.enableBasicAuth : undefined;
            resourceInputs["enableBranchAutoBuild"] = state ? state.enableBranchAutoBuild : undefined;
            resourceInputs["enableBranchAutoDeletion"] = state ? state.enableBranchAutoDeletion : undefined;
            resourceInputs["environmentVariables"] = state ? state.environmentVariables : undefined;
            resourceInputs["iamServiceRoleArn"] = state ? state.iamServiceRoleArn : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["oauthToken"] = state ? state.oauthToken : undefined;
            resourceInputs["platform"] = state ? state.platform : undefined;
            resourceInputs["productionBranches"] = state ? state.productionBranches : undefined;
            resourceInputs["repository"] = state ? state.repository : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
        } else {
            const args = argsOrState as AppArgs | undefined;
            resourceInputs["accessToken"] = args?.accessToken ? pulumi.secret(args.accessToken) : undefined;
            resourceInputs["autoBranchCreationConfig"] = args ? args.autoBranchCreationConfig : undefined;
            resourceInputs["autoBranchCreationPatterns"] = args ? args.autoBranchCreationPatterns : undefined;
            resourceInputs["basicAuthCredentials"] = args?.basicAuthCredentials ? pulumi.secret(args.basicAuthCredentials) : undefined;
            resourceInputs["buildSpec"] = args ? args.buildSpec : undefined;
            resourceInputs["customHeaders"] = args ? args.customHeaders : undefined;
            resourceInputs["customRules"] = args ? args.customRules : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["enableAutoBranchCreation"] = args ? args.enableAutoBranchCreation : undefined;
            resourceInputs["enableBasicAuth"] = args ? args.enableBasicAuth : undefined;
            resourceInputs["enableBranchAutoBuild"] = args ? args.enableBranchAutoBuild : undefined;
            resourceInputs["enableBranchAutoDeletion"] = args ? args.enableBranchAutoDeletion : undefined;
            resourceInputs["environmentVariables"] = args ? args.environmentVariables : undefined;
            resourceInputs["iamServiceRoleArn"] = args ? args.iamServiceRoleArn : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["oauthToken"] = args?.oauthToken ? pulumi.secret(args.oauthToken) : undefined;
            resourceInputs["platform"] = args ? args.platform : undefined;
            resourceInputs["repository"] = args ? args.repository : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["arn"] = undefined /*out*/;
            resourceInputs["defaultDomain"] = undefined /*out*/;
            resourceInputs["productionBranches"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        const secretOpts = { additionalSecretOutputs: ["accessToken", "basicAuthCredentials", "oauthToken"] };
        opts = pulumi.mergeOptions(opts, secretOpts);
        super(App.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering App resources.
 */
export interface AppState {
    /**
     * Personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
     */
    accessToken?: pulumi.Input<string>;
    /**
     * ARN of the Amplify app.
     */
    arn?: pulumi.Input<string>;
    /**
     * Automated branch creation configuration for an Amplify app. An `autoBranchCreationConfig` block is documented below.
     */
    autoBranchCreationConfig?: pulumi.Input<inputs.amplify.AppAutoBranchCreationConfig>;
    /**
     * Automated branch creation glob patterns for an Amplify app.
     */
    autoBranchCreationPatterns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Credentials for basic authorization for an Amplify app.
     */
    basicAuthCredentials?: pulumi.Input<string>;
    /**
     * The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
     */
    buildSpec?: pulumi.Input<string>;
    /**
     * The [custom HTTP headers](https://docs.aws.amazon.com/amplify/latest/userguide/custom-headers.html) for an Amplify app.
     */
    customHeaders?: pulumi.Input<string>;
    /**
     * Custom rewrite and redirect rules for an Amplify app. A `customRule` block is documented below.
     */
    customRules?: pulumi.Input<pulumi.Input<inputs.amplify.AppCustomRule>[]>;
    /**
     * Default domain for the Amplify app.
     */
    defaultDomain?: pulumi.Input<string>;
    /**
     * Description for an Amplify app.
     */
    description?: pulumi.Input<string>;
    /**
     * Enables automated branch creation for an Amplify app.
     */
    enableAutoBranchCreation?: pulumi.Input<boolean>;
    /**
     * Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
     */
    enableBasicAuth?: pulumi.Input<boolean>;
    /**
     * Enables auto-building of branches for the Amplify App.
     */
    enableBranchAutoBuild?: pulumi.Input<boolean>;
    /**
     * Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
     */
    enableBranchAutoDeletion?: pulumi.Input<boolean>;
    /**
     * Environment variables map for an Amplify app.
     */
    environmentVariables?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * AWS Identity and Access Management (IAM) service role for an Amplify app.
     */
    iamServiceRoleArn?: pulumi.Input<string>;
    /**
     * Name for an Amplify app.
     */
    name?: pulumi.Input<string>;
    /**
     * OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
     */
    oauthToken?: pulumi.Input<string>;
    /**
     * Platform or framework for an Amplify app. Valid values: `WEB`, `WEB_COMPUTE`. Default value: `WEB`.
     */
    platform?: pulumi.Input<string>;
    /**
     * Describes the information about a production branch for an Amplify app. A `productionBranch` block is documented below.
     */
    productionBranches?: pulumi.Input<pulumi.Input<inputs.amplify.AppProductionBranch>[]>;
    /**
     * Repository for an Amplify app.
     */
    repository?: pulumi.Input<string>;
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
}

/**
 * The set of arguments for constructing a App resource.
 */
export interface AppArgs {
    /**
     * Personal access token for a third-party source control system for an Amplify app. The personal access token is used to create a webhook and a read-only deploy key. The token is not stored.
     */
    accessToken?: pulumi.Input<string>;
    /**
     * Automated branch creation configuration for an Amplify app. An `autoBranchCreationConfig` block is documented below.
     */
    autoBranchCreationConfig?: pulumi.Input<inputs.amplify.AppAutoBranchCreationConfig>;
    /**
     * Automated branch creation glob patterns for an Amplify app.
     */
    autoBranchCreationPatterns?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * Credentials for basic authorization for an Amplify app.
     */
    basicAuthCredentials?: pulumi.Input<string>;
    /**
     * The [build specification](https://docs.aws.amazon.com/amplify/latest/userguide/build-settings.html) (build spec) for an Amplify app.
     */
    buildSpec?: pulumi.Input<string>;
    /**
     * The [custom HTTP headers](https://docs.aws.amazon.com/amplify/latest/userguide/custom-headers.html) for an Amplify app.
     */
    customHeaders?: pulumi.Input<string>;
    /**
     * Custom rewrite and redirect rules for an Amplify app. A `customRule` block is documented below.
     */
    customRules?: pulumi.Input<pulumi.Input<inputs.amplify.AppCustomRule>[]>;
    /**
     * Description for an Amplify app.
     */
    description?: pulumi.Input<string>;
    /**
     * Enables automated branch creation for an Amplify app.
     */
    enableAutoBranchCreation?: pulumi.Input<boolean>;
    /**
     * Enables basic authorization for an Amplify app. This will apply to all branches that are part of this app.
     */
    enableBasicAuth?: pulumi.Input<boolean>;
    /**
     * Enables auto-building of branches for the Amplify App.
     */
    enableBranchAutoBuild?: pulumi.Input<boolean>;
    /**
     * Automatically disconnects a branch in the Amplify Console when you delete a branch from your Git repository.
     */
    enableBranchAutoDeletion?: pulumi.Input<boolean>;
    /**
     * Environment variables map for an Amplify app.
     */
    environmentVariables?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * AWS Identity and Access Management (IAM) service role for an Amplify app.
     */
    iamServiceRoleArn?: pulumi.Input<string>;
    /**
     * Name for an Amplify app.
     */
    name?: pulumi.Input<string>;
    /**
     * OAuth token for a third-party source control system for an Amplify app. The OAuth token is used to create a webhook and a read-only deploy key. The OAuth token is not stored.
     */
    oauthToken?: pulumi.Input<string>;
    /**
     * Platform or framework for an Amplify app. Valid values: `WEB`, `WEB_COMPUTE`. Default value: `WEB`.
     */
    platform?: pulumi.Input<string>;
    /**
     * Repository for an Amplify app.
     */
    repository?: pulumi.Input<string>;
    /**
     * Key-value mapping of resource tags. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
}
