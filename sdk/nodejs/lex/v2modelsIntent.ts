// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as enums from "../types/enums";
import * as utilities from "../utilities";

/**
 * ## Import
 *
 * Using `pulumi import`, import Lex V2 Models Intent using the `intent_id:bot_id:bot_version:locale_id`. For example:
 *
 * ```sh
 * $ pulumi import aws:lex/v2modelsIntent:V2modelsIntent example intent-42874:bot-11376:DRAFT:en_US
 * ```
 */
export class V2modelsIntent extends pulumi.CustomResource {
    /**
     * Get an existing V2modelsIntent resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: V2modelsIntentState, opts?: pulumi.CustomResourceOptions): V2modelsIntent {
        return new V2modelsIntent(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'aws:lex/v2modelsIntent:V2modelsIntent';

    /**
     * Returns true if the given object is an instance of V2modelsIntent.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is V2modelsIntent {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === V2modelsIntent.__pulumiType;
    }

    /**
     * Identifier of the bot associated with this intent.
     */
    public readonly botId!: pulumi.Output<string>;
    /**
     * Version of the bot associated with this intent.
     */
    public readonly botVersion!: pulumi.Output<string>;
    /**
     * Configuration block for the response that Amazon Lex sends to the user when the intent is closed. See `closingSetting`.
     */
    public readonly closingSetting!: pulumi.Output<outputs.lex.V2modelsIntentClosingSetting | undefined>;
    public readonly confirmationSetting!: pulumi.Output<outputs.lex.V2modelsIntentConfirmationSetting | undefined>;
    /**
     * Timestamp of the date and time that the intent was created.
     */
    public /*out*/ readonly creationDateTime!: pulumi.Output<string>;
    /**
     * Description of the intent. Use the description to help identify the intent in lists.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * Configuration block for invoking the alias Lambda function for each user input. You can invoke this Lambda function to personalize user interaction. See `dialogCodeHook`.
     */
    public readonly dialogCodeHook!: pulumi.Output<outputs.lex.V2modelsIntentDialogCodeHook | undefined>;
    /**
     * Configuration block for invoking the alias Lambda function when the intent is ready for fulfillment. You can invoke this function to complete the bot's transaction with the user. See `fulfillmentCodeHook`.
     */
    public readonly fulfillmentCodeHook!: pulumi.Output<outputs.lex.V2modelsIntentFulfillmentCodeHook | undefined>;
    /**
     * Configuration block for the response that is sent to the user at the beginning of a conversation, before eliciting slot values. See `initialResponseSetting`.
     */
    public readonly initialResponseSetting!: pulumi.Output<outputs.lex.V2modelsIntentInitialResponseSetting | undefined>;
    /**
     * Configuration blocks for contexts that must be active for this intent to be considered by Amazon Lex. When an intent has an input context list, Amazon Lex only considers using the intent in an interaction with the user when the specified contexts are included in the active context list for the session. If the contexts are not active, then Amazon Lex will not use the intent. A context can be automatically activated using the outputContexts property or it can be set at runtime. See `inputContext`.
     */
    public readonly inputContexts!: pulumi.Output<outputs.lex.V2modelsIntentInputContext[] | undefined>;
    /**
     * Unique identifier for the intent.
     */
    public /*out*/ readonly intentId!: pulumi.Output<string>;
    /**
     * Configuration block for information required to use the AMAZON.KendraSearchIntent intent to connect to an Amazon Kendra index. The AMAZON.KendraSearchIntent intent is called when Amazon Lex can't determine another intent to invoke. See `kendraConfiguration`.
     */
    public readonly kendraConfiguration!: pulumi.Output<outputs.lex.V2modelsIntentKendraConfiguration | undefined>;
    /**
     * Timestamp of the last time that the intent was modified.
     */
    public /*out*/ readonly lastUpdatedDateTime!: pulumi.Output<string>;
    /**
     * Identifier of the language and locale where this intent is used. All of the bots, slot types, and slots used by the intent must have the same locale.
     */
    public readonly localeId!: pulumi.Output<string>;
    /**
     * Name of the intent. Intent names must be unique in the locale that contains the intent and cannot match the name of any built-in intent.
     *
     * The following arguments are optional:
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Configuration blocks for contexts that the intent activates when it is fulfilled. You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of the conversation with a customer. When you use the outputContextsList property, all of the contexts specified in the list are activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number of conversation turns that the context should be active, or the length of time that the context should be active. See `outputContext`.
     */
    public readonly outputContexts!: pulumi.Output<outputs.lex.V2modelsIntentOutputContext[] | undefined>;
    /**
     * Identifier for the built-in intent to base this intent on.
     */
    public readonly parentIntentSignature!: pulumi.Output<string | undefined>;
    /**
     * Configuration block for strings that a user might say to signal the intent. See `sampleUtterance`.
     */
    public readonly sampleUtterances!: pulumi.Output<outputs.lex.V2modelsIntentSampleUtterance[] | undefined>;
    /**
     * Configuration block for a new list of slots and their priorities that are contained by the intent. This is ignored on create and only valid for updates. See `slotPriority`.
     */
    public readonly slotPriorities!: pulumi.Output<outputs.lex.V2modelsIntentSlotPriority[] | undefined>;
    public readonly timeouts!: pulumi.Output<outputs.lex.V2modelsIntentTimeouts | undefined>;

    /**
     * Create a V2modelsIntent resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: V2modelsIntentArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: V2modelsIntentArgs | V2modelsIntentState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as V2modelsIntentState | undefined;
            resourceInputs["botId"] = state ? state.botId : undefined;
            resourceInputs["botVersion"] = state ? state.botVersion : undefined;
            resourceInputs["closingSetting"] = state ? state.closingSetting : undefined;
            resourceInputs["confirmationSetting"] = state ? state.confirmationSetting : undefined;
            resourceInputs["creationDateTime"] = state ? state.creationDateTime : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["dialogCodeHook"] = state ? state.dialogCodeHook : undefined;
            resourceInputs["fulfillmentCodeHook"] = state ? state.fulfillmentCodeHook : undefined;
            resourceInputs["initialResponseSetting"] = state ? state.initialResponseSetting : undefined;
            resourceInputs["inputContexts"] = state ? state.inputContexts : undefined;
            resourceInputs["intentId"] = state ? state.intentId : undefined;
            resourceInputs["kendraConfiguration"] = state ? state.kendraConfiguration : undefined;
            resourceInputs["lastUpdatedDateTime"] = state ? state.lastUpdatedDateTime : undefined;
            resourceInputs["localeId"] = state ? state.localeId : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["outputContexts"] = state ? state.outputContexts : undefined;
            resourceInputs["parentIntentSignature"] = state ? state.parentIntentSignature : undefined;
            resourceInputs["sampleUtterances"] = state ? state.sampleUtterances : undefined;
            resourceInputs["slotPriorities"] = state ? state.slotPriorities : undefined;
            resourceInputs["timeouts"] = state ? state.timeouts : undefined;
        } else {
            const args = argsOrState as V2modelsIntentArgs | undefined;
            if ((!args || args.botId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'botId'");
            }
            if ((!args || args.botVersion === undefined) && !opts.urn) {
                throw new Error("Missing required property 'botVersion'");
            }
            if ((!args || args.localeId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'localeId'");
            }
            resourceInputs["botId"] = args ? args.botId : undefined;
            resourceInputs["botVersion"] = args ? args.botVersion : undefined;
            resourceInputs["closingSetting"] = args ? args.closingSetting : undefined;
            resourceInputs["confirmationSetting"] = args ? args.confirmationSetting : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["dialogCodeHook"] = args ? args.dialogCodeHook : undefined;
            resourceInputs["fulfillmentCodeHook"] = args ? args.fulfillmentCodeHook : undefined;
            resourceInputs["initialResponseSetting"] = args ? args.initialResponseSetting : undefined;
            resourceInputs["inputContexts"] = args ? args.inputContexts : undefined;
            resourceInputs["kendraConfiguration"] = args ? args.kendraConfiguration : undefined;
            resourceInputs["localeId"] = args ? args.localeId : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["outputContexts"] = args ? args.outputContexts : undefined;
            resourceInputs["parentIntentSignature"] = args ? args.parentIntentSignature : undefined;
            resourceInputs["sampleUtterances"] = args ? args.sampleUtterances : undefined;
            resourceInputs["slotPriorities"] = args ? args.slotPriorities : undefined;
            resourceInputs["timeouts"] = args ? args.timeouts : undefined;
            resourceInputs["creationDateTime"] = undefined /*out*/;
            resourceInputs["intentId"] = undefined /*out*/;
            resourceInputs["lastUpdatedDateTime"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(V2modelsIntent.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering V2modelsIntent resources.
 */
export interface V2modelsIntentState {
    /**
     * Identifier of the bot associated with this intent.
     */
    botId?: pulumi.Input<string>;
    /**
     * Version of the bot associated with this intent.
     */
    botVersion?: pulumi.Input<string>;
    /**
     * Configuration block for the response that Amazon Lex sends to the user when the intent is closed. See `closingSetting`.
     */
    closingSetting?: pulumi.Input<inputs.lex.V2modelsIntentClosingSetting>;
    confirmationSetting?: pulumi.Input<inputs.lex.V2modelsIntentConfirmationSetting>;
    /**
     * Timestamp of the date and time that the intent was created.
     */
    creationDateTime?: pulumi.Input<string>;
    /**
     * Description of the intent. Use the description to help identify the intent in lists.
     */
    description?: pulumi.Input<string>;
    /**
     * Configuration block for invoking the alias Lambda function for each user input. You can invoke this Lambda function to personalize user interaction. See `dialogCodeHook`.
     */
    dialogCodeHook?: pulumi.Input<inputs.lex.V2modelsIntentDialogCodeHook>;
    /**
     * Configuration block for invoking the alias Lambda function when the intent is ready for fulfillment. You can invoke this function to complete the bot's transaction with the user. See `fulfillmentCodeHook`.
     */
    fulfillmentCodeHook?: pulumi.Input<inputs.lex.V2modelsIntentFulfillmentCodeHook>;
    /**
     * Configuration block for the response that is sent to the user at the beginning of a conversation, before eliciting slot values. See `initialResponseSetting`.
     */
    initialResponseSetting?: pulumi.Input<inputs.lex.V2modelsIntentInitialResponseSetting>;
    /**
     * Configuration blocks for contexts that must be active for this intent to be considered by Amazon Lex. When an intent has an input context list, Amazon Lex only considers using the intent in an interaction with the user when the specified contexts are included in the active context list for the session. If the contexts are not active, then Amazon Lex will not use the intent. A context can be automatically activated using the outputContexts property or it can be set at runtime. See `inputContext`.
     */
    inputContexts?: pulumi.Input<pulumi.Input<inputs.lex.V2modelsIntentInputContext>[]>;
    /**
     * Unique identifier for the intent.
     */
    intentId?: pulumi.Input<string>;
    /**
     * Configuration block for information required to use the AMAZON.KendraSearchIntent intent to connect to an Amazon Kendra index. The AMAZON.KendraSearchIntent intent is called when Amazon Lex can't determine another intent to invoke. See `kendraConfiguration`.
     */
    kendraConfiguration?: pulumi.Input<inputs.lex.V2modelsIntentKendraConfiguration>;
    /**
     * Timestamp of the last time that the intent was modified.
     */
    lastUpdatedDateTime?: pulumi.Input<string>;
    /**
     * Identifier of the language and locale where this intent is used. All of the bots, slot types, and slots used by the intent must have the same locale.
     */
    localeId?: pulumi.Input<string>;
    /**
     * Name of the intent. Intent names must be unique in the locale that contains the intent and cannot match the name of any built-in intent.
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration blocks for contexts that the intent activates when it is fulfilled. You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of the conversation with a customer. When you use the outputContextsList property, all of the contexts specified in the list are activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number of conversation turns that the context should be active, or the length of time that the context should be active. See `outputContext`.
     */
    outputContexts?: pulumi.Input<pulumi.Input<inputs.lex.V2modelsIntentOutputContext>[]>;
    /**
     * Identifier for the built-in intent to base this intent on.
     */
    parentIntentSignature?: pulumi.Input<string>;
    /**
     * Configuration block for strings that a user might say to signal the intent. See `sampleUtterance`.
     */
    sampleUtterances?: pulumi.Input<pulumi.Input<inputs.lex.V2modelsIntentSampleUtterance>[]>;
    /**
     * Configuration block for a new list of slots and their priorities that are contained by the intent. This is ignored on create and only valid for updates. See `slotPriority`.
     */
    slotPriorities?: pulumi.Input<pulumi.Input<inputs.lex.V2modelsIntentSlotPriority>[]>;
    timeouts?: pulumi.Input<inputs.lex.V2modelsIntentTimeouts>;
}

/**
 * The set of arguments for constructing a V2modelsIntent resource.
 */
export interface V2modelsIntentArgs {
    /**
     * Identifier of the bot associated with this intent.
     */
    botId: pulumi.Input<string>;
    /**
     * Version of the bot associated with this intent.
     */
    botVersion: pulumi.Input<string>;
    /**
     * Configuration block for the response that Amazon Lex sends to the user when the intent is closed. See `closingSetting`.
     */
    closingSetting?: pulumi.Input<inputs.lex.V2modelsIntentClosingSetting>;
    confirmationSetting?: pulumi.Input<inputs.lex.V2modelsIntentConfirmationSetting>;
    /**
     * Description of the intent. Use the description to help identify the intent in lists.
     */
    description?: pulumi.Input<string>;
    /**
     * Configuration block for invoking the alias Lambda function for each user input. You can invoke this Lambda function to personalize user interaction. See `dialogCodeHook`.
     */
    dialogCodeHook?: pulumi.Input<inputs.lex.V2modelsIntentDialogCodeHook>;
    /**
     * Configuration block for invoking the alias Lambda function when the intent is ready for fulfillment. You can invoke this function to complete the bot's transaction with the user. See `fulfillmentCodeHook`.
     */
    fulfillmentCodeHook?: pulumi.Input<inputs.lex.V2modelsIntentFulfillmentCodeHook>;
    /**
     * Configuration block for the response that is sent to the user at the beginning of a conversation, before eliciting slot values. See `initialResponseSetting`.
     */
    initialResponseSetting?: pulumi.Input<inputs.lex.V2modelsIntentInitialResponseSetting>;
    /**
     * Configuration blocks for contexts that must be active for this intent to be considered by Amazon Lex. When an intent has an input context list, Amazon Lex only considers using the intent in an interaction with the user when the specified contexts are included in the active context list for the session. If the contexts are not active, then Amazon Lex will not use the intent. A context can be automatically activated using the outputContexts property or it can be set at runtime. See `inputContext`.
     */
    inputContexts?: pulumi.Input<pulumi.Input<inputs.lex.V2modelsIntentInputContext>[]>;
    /**
     * Configuration block for information required to use the AMAZON.KendraSearchIntent intent to connect to an Amazon Kendra index. The AMAZON.KendraSearchIntent intent is called when Amazon Lex can't determine another intent to invoke. See `kendraConfiguration`.
     */
    kendraConfiguration?: pulumi.Input<inputs.lex.V2modelsIntentKendraConfiguration>;
    /**
     * Identifier of the language and locale where this intent is used. All of the bots, slot types, and slots used by the intent must have the same locale.
     */
    localeId: pulumi.Input<string>;
    /**
     * Name of the intent. Intent names must be unique in the locale that contains the intent and cannot match the name of any built-in intent.
     *
     * The following arguments are optional:
     */
    name?: pulumi.Input<string>;
    /**
     * Configuration blocks for contexts that the intent activates when it is fulfilled. You can use an output context to indicate the intents that Amazon Lex should consider for the next turn of the conversation with a customer. When you use the outputContextsList property, all of the contexts specified in the list are activated when the intent is fulfilled. You can set up to 10 output contexts. You can also set the number of conversation turns that the context should be active, or the length of time that the context should be active. See `outputContext`.
     */
    outputContexts?: pulumi.Input<pulumi.Input<inputs.lex.V2modelsIntentOutputContext>[]>;
    /**
     * Identifier for the built-in intent to base this intent on.
     */
    parentIntentSignature?: pulumi.Input<string>;
    /**
     * Configuration block for strings that a user might say to signal the intent. See `sampleUtterance`.
     */
    sampleUtterances?: pulumi.Input<pulumi.Input<inputs.lex.V2modelsIntentSampleUtterance>[]>;
    /**
     * Configuration block for a new list of slots and their priorities that are contained by the intent. This is ignored on create and only valid for updates. See `slotPriority`.
     */
    slotPriorities?: pulumi.Input<pulumi.Input<inputs.lex.V2modelsIntentSlotPriority>[]>;
    timeouts?: pulumi.Input<inputs.lex.V2modelsIntentTimeouts>;
}
