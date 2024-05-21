// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * Resource for managing an AWS Agents for Amazon Bedrock Agent Alias.
 *
 * ## Example Usage
 *
 * ## Import
 *
 * Using `pulumi import`, import Agents for Amazon Bedrock Agent Alias using the alias ID and the agent ID separated by `,`. For example:
 *
 * ```sh
 * $ pulumi import aws:bedrock/agentAgentAlias:AgentAgentAlias example 66IVY0GUTF,GGRRAED6JP
 * ```
 */
export class AgentAgentAlias extends pulumi.CustomResource {
    /**
     * Get an existing AgentAgentAlias resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AgentAgentAliasState, opts?: pulumi.CustomResourceOptions): AgentAgentAlias {
        return new AgentAgentAlias(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:bedrock/agentAgentAlias:AgentAgentAlias';

    /**
     * Returns true if the given object is an instance of AgentAgentAlias.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AgentAgentAlias {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AgentAgentAlias.__pulumiType;
    }

    /**
     * ARN of the alias.
     */
    public /*out*/ readonly agentAliasArn!: pulumi.Output<string>;
    /**
     * Unique identifier of the alias.
     */
    public /*out*/ readonly agentAliasId!: pulumi.Output<string>;
    /**
     * Name of the alias.
     */
    public readonly agentAliasName!: pulumi.Output<string>;
    /**
     * Identifier of the agent to create an alias for.
     *
     * The following arguments are optional:
     */
    public readonly agentId!: pulumi.Output<string>;
    /**
     * Description of the alias.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Details about the routing configuration of the alias. See `routingConfiguration` block for details.
     */
    public readonly routingConfigurations!: pulumi.Output<outputs.bedrock.AgentAgentAliasRoutingConfiguration[]>;
    /**
     * Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    public readonly tags!: pulumi.Output<{[key: string]: string} | undefined>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    public /*out*/ readonly tagsAll!: pulumi.Output<{[key: string]: string}>;
    public readonly timeouts!: pulumi.Output<outputs.bedrock.AgentAgentAliasTimeouts | undefined>;

    /**
     * Create a AgentAgentAlias resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AgentAgentAliasArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AgentAgentAliasArgs | AgentAgentAliasState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AgentAgentAliasState | undefined;
            resourceInputs["agentAliasArn"] = state ? state.agentAliasArn : undefined;
            resourceInputs["agentAliasId"] = state ? state.agentAliasId : undefined;
            resourceInputs["agentAliasName"] = state ? state.agentAliasName : undefined;
            resourceInputs["agentId"] = state ? state.agentId : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["routingConfigurations"] = state ? state.routingConfigurations : undefined;
            resourceInputs["tags"] = state ? state.tags : undefined;
            resourceInputs["tagsAll"] = state ? state.tagsAll : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
        } else {
            const args = argsOrState as AgentAgentAliasArgs | undefined;
            if ((!args || args.agentAliasName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'agentAliasName'");
            }
            if ((!args || args.agentId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'agentId'");
            }
            resourceInputs["agentAliasName"] = args ? args.agentAliasName : undefined;
            resourceInputs["agentId"] = args ? args.agentId : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["routingConfigurations"] = args ? args.routingConfigurations : undefined;
            resourceInputs["tags"] = args ? args.tags : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["agentAliasArn"] = undefined /*out*/;
            resourceInputs["agentAliasId"] = undefined /*out*/;
            resourceInputs["tagsAll"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AgentAgentAlias.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AgentAgentAlias resources.
 */
export interface AgentAgentAliasState {
    /**
     * ARN of the alias.
     */
    agentAliasArn?: pulumi.Input<string>;
    /**
     * Unique identifier of the alias.
     */
    agentAliasId?: pulumi.Input<string>;
    /**
     * Name of the alias.
     */
    agentAliasName?: pulumi.Input<string>;
    /**
     * Identifier of the agent to create an alias for.
     *
     * The following arguments are optional:
     */
    agentId?: pulumi.Input<string>;
    /**
     * Description of the alias.
     */
    description?: pulumi.Input<string>;
    /**
     * Details about the routing configuration of the alias. See `routingConfiguration` block for details.
     */
    routingConfigurations?: pulumi.Input<pulumi.Input<inputs.bedrock.AgentAgentAliasRoutingConfiguration>[]>;
    /**
     * Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `defaultTags` configuration block.
     *
     * @deprecated Please use `tags` instead.
     */
    tagsAll?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    timeouts?: pulumi.Input<inputs.bedrock.AgentAgentAliasTimeouts>;
}

/**
 * The set of arguments for constructing a AgentAgentAlias resource.
 */
export interface AgentAgentAliasArgs {
    /**
     * Name of the alias.
     */
    agentAliasName: pulumi.Input<string>;
    /**
     * Identifier of the agent to create an alias for.
     *
     * The following arguments are optional:
     */
    agentId: pulumi.Input<string>;
    /**
     * Description of the alias.
     */
    description?: pulumi.Input<string>;
    /**
     * Details about the routing configuration of the alias. See `routingConfiguration` block for details.
     */
    routingConfigurations?: pulumi.Input<pulumi.Input<inputs.bedrock.AgentAgentAliasRoutingConfiguration>[]>;
    /**
     * Map of tags assigned to the resource. If configured with a provider `defaultTags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     */
    tags?: pulumi.Input<{[key: string]: pulumi.Input<string>}>;
    timeouts?: pulumi.Input<inputs.bedrock.AgentAgentAliasTimeouts>;
}
