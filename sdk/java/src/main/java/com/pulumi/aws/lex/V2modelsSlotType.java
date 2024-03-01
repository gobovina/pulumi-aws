// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lex;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lex.V2modelsSlotTypeArgs;
import com.pulumi.aws.lex.inputs.V2modelsSlotTypeState;
import com.pulumi.aws.lex.outputs.V2modelsSlotTypeCompositeSlotTypeSetting;
import com.pulumi.aws.lex.outputs.V2modelsSlotTypeExternalSourceSetting;
import com.pulumi.aws.lex.outputs.V2modelsSlotTypeSlotTypeValues;
import com.pulumi.aws.lex.outputs.V2modelsSlotTypeTimeouts;
import com.pulumi.aws.lex.outputs.V2modelsSlotTypeValueSelectionSetting;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Lex V2 Models Slot Type.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
 * import com.pulumi.aws.lex.V2modelsBot;
 * import com.pulumi.aws.lex.V2modelsBotArgs;
 * import com.pulumi.aws.lex.inputs.V2modelsBotDataPrivacyArgs;
 * import com.pulumi.aws.lex.V2modelsBotLocale;
 * import com.pulumi.aws.lex.V2modelsBotLocaleArgs;
 * import com.pulumi.aws.lex.V2modelsBotVersion;
 * import com.pulumi.aws.lex.V2modelsBotVersionArgs;
 * import com.pulumi.aws.lex.V2modelsSlotType;
 * import com.pulumi.aws.lex.V2modelsSlotTypeArgs;
 * import java.util.List;
 * import java.util.ArrayList;
 * import java.util.Map;
 * import java.io.File;
 * import java.nio.file.Files;
 * import java.nio.file.Paths;
 * 
 * public class App {
 *     public static void main(String[] args) {
 *         Pulumi.run(App::stack);
 *     }
 * 
 *     public static void stack(Context ctx) {
 *         var test = new RolePolicyAttachment(&#34;test&#34;, RolePolicyAttachmentArgs.builder()        
 *             .role(testAwsIamRole.name())
 *             .policyArn(String.format(&#34;arn:%s:iam::aws:policy/AmazonLexFullAccess&#34;, current.partition()))
 *             .build());
 * 
 *         var testV2modelsBot = new V2modelsBot(&#34;testV2modelsBot&#34;, V2modelsBotArgs.builder()        
 *             .name(&#34;testbot&#34;)
 *             .idleSessionTtlInSeconds(60)
 *             .roleArn(testAwsIamRole.arn())
 *             .dataPrivacies(V2modelsBotDataPrivacyArgs.builder()
 *                 .childDirected(true)
 *                 .build())
 *             .build());
 * 
 *         var testV2modelsBotLocale = new V2modelsBotLocale(&#34;testV2modelsBotLocale&#34;, V2modelsBotLocaleArgs.builder()        
 *             .localeId(&#34;en_US&#34;)
 *             .botId(testV2modelsBot.id())
 *             .botVersion(&#34;DRAFT&#34;)
 *             .nLuIntentConfidenceThreshold(0.7)
 *             .build());
 * 
 *         var testV2modelsBotVersion = new V2modelsBotVersion(&#34;testV2modelsBotVersion&#34;, V2modelsBotVersionArgs.builder()        
 *             .botId(testV2modelsBot.id())
 *             .localeSpecification(testV2modelsBotLocale.localeId().applyValue(localeId -&gt; Map.of(localeId, Map.of(&#34;sourceBotVersion&#34;, &#34;DRAFT&#34;))))
 *             .build());
 * 
 *         var testV2modelsSlotType = new V2modelsSlotType(&#34;testV2modelsSlotType&#34;, V2modelsSlotTypeArgs.builder()        
 *             .botId(testV2modelsBot.id())
 *             .botVersion(testV2modelsBotLocale.botVersion())
 *             .name(&#34;test&#34;)
 *             .localeId(testV2modelsBotLocale.localeId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Lex V2 Models Slot Type using the `example_id_arg`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:lex/v2modelsSlotType:V2modelsSlotType example bot-1234,DRAFT,en_US,slot_type-id-12345678
 * ```
 * 
 */
@ResourceType(type="aws:lex/v2modelsSlotType:V2modelsSlotType")
public class V2modelsSlotType extends com.pulumi.resources.CustomResource {
    /**
     * Identifier of the bot associated with this slot type.
     * 
     */
    @Export(name="botId", refs={String.class}, tree="[0]")
    private Output<String> botId;

    /**
     * @return Identifier of the bot associated with this slot type.
     * 
     */
    public Output<String> botId() {
        return this.botId;
    }
    /**
     * Version of the bot associated with this slot type.
     * 
     */
    @Export(name="botVersion", refs={String.class}, tree="[0]")
    private Output<String> botVersion;

    /**
     * @return Version of the bot associated with this slot type.
     * 
     */
    public Output<String> botVersion() {
        return this.botVersion;
    }
    /**
     * Specifications for a composite slot type. See `composite_slot_type_setting` argument reference below.
     * 
     */
    @Export(name="compositeSlotTypeSetting", refs={V2modelsSlotTypeCompositeSlotTypeSetting.class}, tree="[0]")
    private Output</* @Nullable */ V2modelsSlotTypeCompositeSlotTypeSetting> compositeSlotTypeSetting;

    /**
     * @return Specifications for a composite slot type. See `composite_slot_type_setting` argument reference below.
     * 
     */
    public Output<Optional<V2modelsSlotTypeCompositeSlotTypeSetting>> compositeSlotTypeSetting() {
        return Codegen.optional(this.compositeSlotTypeSetting);
    }
    /**
     * Description of the slot type.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the slot type.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Type of external information used to create the slot type. See `external_source_setting` argument reference below.
     * 
     */
    @Export(name="externalSourceSetting", refs={V2modelsSlotTypeExternalSourceSetting.class}, tree="[0]")
    private Output</* @Nullable */ V2modelsSlotTypeExternalSourceSetting> externalSourceSetting;

    /**
     * @return Type of external information used to create the slot type. See `external_source_setting` argument reference below.
     * 
     */
    public Output<Optional<V2modelsSlotTypeExternalSourceSetting>> externalSourceSetting() {
        return Codegen.optional(this.externalSourceSetting);
    }
    /**
     * Identifier of the language and locale where this slot type is used. All of the bots, slot types, and slots used by the intent must have the same locale.
     * 
     */
    @Export(name="localeId", refs={String.class}, tree="[0]")
    private Output<String> localeId;

    /**
     * @return Identifier of the language and locale where this slot type is used. All of the bots, slot types, and slots used by the intent must have the same locale.
     * 
     */
    public Output<String> localeId() {
        return this.localeId;
    }
    /**
     * Name of the slot type
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Name of the slot type
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type has the configuration of the parent slot type. Only AMAZON.AlphaNumeric is supported.
     * 
     */
    @Export(name="parentSlotTypeSignature", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> parentSlotTypeSignature;

    /**
     * @return Built-in slot type used as a parent of this slot type. When you define a parent slot type, the new slot type has the configuration of the parent slot type. Only AMAZON.AlphaNumeric is supported.
     * 
     */
    public Output<Optional<String>> parentSlotTypeSignature() {
        return Codegen.optional(this.parentSlotTypeSignature);
    }
    /**
     * Unique identifier assigned to a slot type. This refers to either a built-in slot type or the unique slotTypeId of a custom slot type.
     * 
     */
    @Export(name="slotTypeId", refs={String.class}, tree="[0]")
    private Output<String> slotTypeId;

    /**
     * @return Unique identifier assigned to a slot type. This refers to either a built-in slot type or the unique slotTypeId of a custom slot type.
     * 
     */
    public Output<String> slotTypeId() {
        return this.slotTypeId;
    }
    /**
     * List of SlotTypeValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot. See `slot_type_values` argument reference below.
     * 
     */
    @Export(name="slotTypeValues", refs={V2modelsSlotTypeSlotTypeValues.class}, tree="[0]")
    private Output</* @Nullable */ V2modelsSlotTypeSlotTypeValues> slotTypeValues;

    /**
     * @return List of SlotTypeValue objects that defines the values that the slot type can take. Each value can have a list of synonyms, additional values that help train the machine learning model about the values that it resolves for a slot. See `slot_type_values` argument reference below.
     * 
     */
    public Output<Optional<V2modelsSlotTypeSlotTypeValues>> slotTypeValues() {
        return Codegen.optional(this.slotTypeValues);
    }
    @Export(name="timeouts", refs={V2modelsSlotTypeTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ V2modelsSlotTypeTimeouts> timeouts;

    public Output<Optional<V2modelsSlotTypeTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }
    /**
     * Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be set to one of the following values: `ORIGINAL_VALUE` returns the value entered by the user, if the user value is similar to the slot value. `TOP_RESOLUTION` if there is a resolution list for the slot, return the first value in the resolution list. If there is no resolution list, return null. If you don&#39;t specify the valueSelectionSetting parameter, the default is ORIGINAL_VALUE. See `value_selection_setting` argument reference below.
     * 
     */
    @Export(name="valueSelectionSetting", refs={V2modelsSlotTypeValueSelectionSetting.class}, tree="[0]")
    private Output</* @Nullable */ V2modelsSlotTypeValueSelectionSetting> valueSelectionSetting;

    /**
     * @return Determines the strategy that Amazon Lex uses to select a value from the list of possible values. The field can be set to one of the following values: `ORIGINAL_VALUE` returns the value entered by the user, if the user value is similar to the slot value. `TOP_RESOLUTION` if there is a resolution list for the slot, return the first value in the resolution list. If there is no resolution list, return null. If you don&#39;t specify the valueSelectionSetting parameter, the default is ORIGINAL_VALUE. See `value_selection_setting` argument reference below.
     * 
     */
    public Output<Optional<V2modelsSlotTypeValueSelectionSetting>> valueSelectionSetting() {
        return Codegen.optional(this.valueSelectionSetting);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public V2modelsSlotType(String name) {
        this(name, V2modelsSlotTypeArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public V2modelsSlotType(String name, V2modelsSlotTypeArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public V2modelsSlotType(String name, V2modelsSlotTypeArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lex/v2modelsSlotType:V2modelsSlotType", name, args == null ? V2modelsSlotTypeArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private V2modelsSlotType(String name, Output<String> id, @Nullable V2modelsSlotTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lex/v2modelsSlotType:V2modelsSlotType", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .build();
        return com.pulumi.resources.CustomResourceOptions.merge(defaultOptions, options, id);
    }

    /**
     * Get an existing Host resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state
     * @param options Optional settings to control the behavior of the CustomResource.
     */
    public static V2modelsSlotType get(String name, Output<String> id, @Nullable V2modelsSlotTypeState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new V2modelsSlotType(name, id, state, options);
    }
}
