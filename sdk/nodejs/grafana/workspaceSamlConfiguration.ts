// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides an Amazon Managed Grafana workspace SAML configuration resource.
 *
 * ## Example Usage
 * ### Basic configuration
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as aws from "@pulumi/aws";
 *
 * const assume = new aws.iam.Role("assume", {assumeRolePolicy: JSON.stringify({
 *     Version: "2012-10-17",
 *     Statement: [{
 *         Action: "sts:AssumeRole",
 *         Effect: "Allow",
 *         Sid: "",
 *         Principal: {
 *             Service: "grafana.amazonaws.com",
 *         },
 *     }],
 * })});
 * const exampleWorkspace = new aws.grafana.Workspace("exampleWorkspace", {
 *     accountAccessType: "CURRENT_ACCOUNT",
 *     authenticationProviders: ["SAML"],
 *     permissionType: "SERVICE_MANAGED",
 *     roleArn: assume.arn,
 * });
 * const exampleWorkspaceSamlConfiguration = new aws.grafana.WorkspaceSamlConfiguration("exampleWorkspaceSamlConfiguration", {
 *     editorRoleValues: ["editor"],
 *     idpMetadataUrl: "https://my_idp_metadata.url",
 *     workspaceId: exampleWorkspace.id,
 * });
 * ```
 *
 * ## Import
 *
 * Grafana Workspace SAML configuration can be imported using the workspace's `id`, e.g.,
 *
 * ```sh
 *  $ pulumi import aws:grafana/workspaceSamlConfiguration:WorkspaceSamlConfiguration example g-2054c75a02
 * ```
 */
export class WorkspaceSamlConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing WorkspaceSamlConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: WorkspaceSamlConfigurationState, opts?: pulumi.CustomResourceOptions): WorkspaceSamlConfiguration {
        return new WorkspaceSamlConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:grafana/workspaceSamlConfiguration:WorkspaceSamlConfiguration';

    /**
     * Returns true if the given object is an instance of WorkspaceSamlConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is WorkspaceSamlConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === WorkspaceSamlConfiguration.__pulumiType;
    }

    /**
     * The admin role values.
     */
    public readonly adminRoleValues!: pulumi.Output<string[] | undefined>;
    /**
     * The allowed organizations.
     */
    public readonly allowedOrganizations!: pulumi.Output<string[] | undefined>;
    /**
     * The editor role values.
     */
    public readonly editorRoleValues!: pulumi.Output<string[]>;
    /**
     * The email assertion.
     */
    public readonly emailAssertion!: pulumi.Output<string>;
    /**
     * The groups assertion.
     */
    public readonly groupsAssertion!: pulumi.Output<string | undefined>;
    /**
     * The IDP Metadata URL. Note that either `idpMetadataUrl` or `idpMetadataXml` (but not both) must be specified.
     */
    public readonly idpMetadataUrl!: pulumi.Output<string | undefined>;
    /**
     * The IDP Metadata XML. Note that either `idpMetadataUrl` or `idpMetadataXml` (but not both) must be specified.
     */
    public readonly idpMetadataXml!: pulumi.Output<string | undefined>;
    /**
     * The login assertion.
     */
    public readonly loginAssertion!: pulumi.Output<string>;
    /**
     * The login validity duration.
     */
    public readonly loginValidityDuration!: pulumi.Output<number>;
    /**
     * The name assertion.
     */
    public readonly nameAssertion!: pulumi.Output<string>;
    /**
     * The org assertion.
     */
    public readonly orgAssertion!: pulumi.Output<string | undefined>;
    /**
     * The role assertion.
     */
    public readonly roleAssertion!: pulumi.Output<string | undefined>;
    /**
     * The status of the SAML configuration.
     */
    public /*out*/ readonly status!: pulumi.Output<string>;
    /**
     * The workspace id.
     */
    public readonly workspaceId!: pulumi.Output<string>;

    /**
     * Create a WorkspaceSamlConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: WorkspaceSamlConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: WorkspaceSamlConfigurationArgs | WorkspaceSamlConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as WorkspaceSamlConfigurationState | undefined;
            resourceInputs["adminRoleValues"] = state ? state.adminRoleValues : undefined;
            resourceInputs["allowedOrganizations"] = state ? state.allowedOrganizations : undefined;
            resourceInputs["editorRoleValues"] = state ? state.editorRoleValues : undefined;
            resourceInputs["emailAssertion"] = state ? state.emailAssertion : undefined;
            resourceInputs["groupsAssertion"] = state ? state.groupsAssertion : undefined;
            resourceInputs["idpMetadataUrl"] = state ? state.idpMetadataUrl : undefined;
            resourceInputs["idpMetadataXml"] = state ? state.idpMetadataXml : undefined;
            resourceInputs["loginAssertion"] = state ? state.loginAssertion : undefined;
            resourceInputs["loginValidityDuration"] = state ? state.loginValidityDuration : undefined;
            resourceInputs["nameAssertion"] = state ? state.nameAssertion : undefined;
            resourceInputs["orgAssertion"] = state ? state.orgAssertion : undefined;
            resourceInputs["roleAssertion"] = state ? state.roleAssertion : undefined;
            resourceInputs["status"] = state ? state.status : undefined;
            resourceInputs["workspaceId"] = state ? state.workspaceId : undefined;
        } else {
            const args = argsOrState as WorkspaceSamlConfigurationArgs | undefined;
            if ((!args || args.editorRoleValues === undefined) && !opts.urn) {
                throw new Error("Missing required property 'editorRoleValues'");
            }
            if ((!args || args.workspaceId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'workspaceId'");
            }
            resourceInputs["adminRoleValues"] = args ? args.adminRoleValues : undefined;
            resourceInputs["allowedOrganizations"] = args ? args.allowedOrganizations : undefined;
            resourceInputs["editorRoleValues"] = args ? args.editorRoleValues : undefined;
            resourceInputs["emailAssertion"] = args ? args.emailAssertion : undefined;
            resourceInputs["groupsAssertion"] = args ? args.groupsAssertion : undefined;
            resourceInputs["idpMetadataUrl"] = args ? args.idpMetadataUrl : undefined;
            resourceInputs["idpMetadataXml"] = args ? args.idpMetadataXml : undefined;
            resourceInputs["loginAssertion"] = args ? args.loginAssertion : undefined;
            resourceInputs["loginValidityDuration"] = args ? args.loginValidityDuration : undefined;
            resourceInputs["nameAssertion"] = args ? args.nameAssertion : undefined;
            resourceInputs["orgAssertion"] = args ? args.orgAssertion : undefined;
            resourceInputs["roleAssertion"] = args ? args.roleAssertion : undefined;
            resourceInputs["workspaceId"] = args ? args.workspaceId : undefined;
            resourceInputs["status"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(WorkspaceSamlConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering WorkspaceSamlConfiguration resources.
 */
export interface WorkspaceSamlConfigurationState {
    /**
     * The admin role values.
     */
    adminRoleValues?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The allowed organizations.
     */
    allowedOrganizations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The editor role values.
     */
    editorRoleValues?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The email assertion.
     */
    emailAssertion?: pulumi.Input<string>;
    /**
     * The groups assertion.
     */
    groupsAssertion?: pulumi.Input<string>;
    /**
     * The IDP Metadata URL. Note that either `idpMetadataUrl` or `idpMetadataXml` (but not both) must be specified.
     */
    idpMetadataUrl?: pulumi.Input<string>;
    /**
     * The IDP Metadata XML. Note that either `idpMetadataUrl` or `idpMetadataXml` (but not both) must be specified.
     */
    idpMetadataXml?: pulumi.Input<string>;
    /**
     * The login assertion.
     */
    loginAssertion?: pulumi.Input<string>;
    /**
     * The login validity duration.
     */
    loginValidityDuration?: pulumi.Input<number>;
    /**
     * The name assertion.
     */
    nameAssertion?: pulumi.Input<string>;
    /**
     * The org assertion.
     */
    orgAssertion?: pulumi.Input<string>;
    /**
     * The role assertion.
     */
    roleAssertion?: pulumi.Input<string>;
    /**
     * The status of the SAML configuration.
     */
    status?: pulumi.Input<string>;
    /**
     * The workspace id.
     */
    workspaceId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a WorkspaceSamlConfiguration resource.
 */
export interface WorkspaceSamlConfigurationArgs {
    /**
     * The admin role values.
     */
    adminRoleValues?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The allowed organizations.
     */
    allowedOrganizations?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The editor role values.
     */
    editorRoleValues: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The email assertion.
     */
    emailAssertion?: pulumi.Input<string>;
    /**
     * The groups assertion.
     */
    groupsAssertion?: pulumi.Input<string>;
    /**
     * The IDP Metadata URL. Note that either `idpMetadataUrl` or `idpMetadataXml` (but not both) must be specified.
     */
    idpMetadataUrl?: pulumi.Input<string>;
    /**
     * The IDP Metadata XML. Note that either `idpMetadataUrl` or `idpMetadataXml` (but not both) must be specified.
     */
    idpMetadataXml?: pulumi.Input<string>;
    /**
     * The login assertion.
     */
    loginAssertion?: pulumi.Input<string>;
    /**
     * The login validity duration.
     */
    loginValidityDuration?: pulumi.Input<number>;
    /**
     * The name assertion.
     */
    nameAssertion?: pulumi.Input<string>;
    /**
     * The org assertion.
     */
    orgAssertion?: pulumi.Input<string>;
    /**
     * The role assertion.
     */
    roleAssertion?: pulumi.Input<string>;
    /**
     * The workspace id.
     */
    workspaceId: pulumi.Input<string>;
}
