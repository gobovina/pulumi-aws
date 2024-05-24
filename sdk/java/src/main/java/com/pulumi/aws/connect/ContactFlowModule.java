// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.ContactFlowModuleArgs;
import com.pulumi.aws.connect.inputs.ContactFlowModuleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect Contact Flow Module resource. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
 * 
 * This resource embeds or references Contact Flows Modules specified in Amazon Connect Contact Flow Language. For more information see
 * [Amazon Connect Flow language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html)
 * 
 * !&gt; **WARN:** Contact Flow Modules exported from the Console [See Contact Flow import/export which is the same for Contact Flow Modules](https://docs.aws.amazon.com/connect/latest/adminguide/contact-flow-import-export.html) are not in the Amazon Connect Contact Flow Language and can not be used with this resource. Instead, the recommendation is to use the AWS CLI [`describe-contact-flow-module`](https://docs.aws.amazon.com/cli/latest/reference/connect/describe-contact-flow-module.html).
 * See example below which uses `jq` to extract the `Content` attribute and saves it to a local file.
 * 
 * ## Example Usage
 * 
 * ### Basic
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.ContactFlowModule;
 * import com.pulumi.aws.connect.ContactFlowModuleArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new ContactFlowModule("example", ContactFlowModuleArgs.builder()
 *             .instanceId("aaaaaaaa-bbbb-cccc-dddd-111111111111")
 *             .name("Example")
 *             .description("Example Contact Flow Module Description")
 *             .content(serializeJson(
 *                 jsonObject(
 *                     jsonProperty("Version", "2019-10-30"),
 *                     jsonProperty("StartAction", "12345678-1234-1234-1234-123456789012"),
 *                     jsonProperty("Actions", jsonArray(
 *                         jsonObject(
 *                             jsonProperty("Identifier", "12345678-1234-1234-1234-123456789012"),
 *                             jsonProperty("Parameters", jsonObject(
 *                                 jsonProperty("Text", "Hello contact flow module")
 *                             )),
 *                             jsonProperty("Transitions", jsonObject(
 *                                 jsonProperty("NextAction", "abcdef-abcd-abcd-abcd-abcdefghijkl"),
 *                                 jsonProperty("Errors", jsonArray(
 *                                 )),
 *                                 jsonProperty("Conditions", jsonArray(
 *                                 ))
 *                             )),
 *                             jsonProperty("Type", "MessageParticipant")
 *                         ), 
 *                         jsonObject(
 *                             jsonProperty("Identifier", "abcdef-abcd-abcd-abcd-abcdefghijkl"),
 *                             jsonProperty("Type", "DisconnectParticipant"),
 *                             jsonProperty("Parameters", jsonObject(
 * 
 *                             )),
 *                             jsonProperty("Transitions", jsonObject(
 * 
 *                             ))
 *                         )
 *                     )),
 *                     jsonProperty("Settings", jsonObject(
 *                         jsonProperty("InputParameters", jsonArray(
 *                         )),
 *                         jsonProperty("OutputParameters", jsonArray(
 *                         )),
 *                         jsonProperty("Transitions", jsonArray(
 *                             jsonObject(
 *                                 jsonProperty("DisplayName", "Success"),
 *                                 jsonProperty("ReferenceName", "Success"),
 *                                 jsonProperty("Description", "")
 *                             ), 
 *                             jsonObject(
 *                                 jsonProperty("DisplayName", "Error"),
 *                                 jsonProperty("ReferenceName", "Error"),
 *                                 jsonProperty("Description", "")
 *                             )
 *                         ))
 *                     ))
 *                 )))
 *             .tags(Map.ofEntries(
 *                 Map.entry("Name", "Example Contact Flow Module"),
 *                 Map.entry("Application", "Example"),
 *                 Map.entry("Method", "Create")
 *             ))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### With External Content
 * 
 * Use the AWS CLI to extract Contact Flow Content:
 * 
 * Use the generated file as input:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.ContactFlowModule;
 * import com.pulumi.aws.connect.ContactFlowModuleArgs;
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
 *         var example = new ContactFlowModule("example", ContactFlowModuleArgs.builder()
 *             .instanceId("aaaaaaaa-bbbb-cccc-dddd-111111111111")
 *             .name("Example")
 *             .description("Example Contact Flow Module Description")
 *             .filename("contact_flow_module.json")
 *             .contentHash(StdFunctions.filebase64sha256(Filebase64sha256Args.builder()
 *                 .input("contact_flow_module.json")
 *                 .build()).result())
 *             .tags(Map.ofEntries(
 *                 Map.entry("Name", "Example Contact Flow Module"),
 *                 Map.entry("Application", "Example"),
 *                 Map.entry("Method", "Create")
 *             ))
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Amazon Connect Contact Flow Modules using the `instance_id` and `contact_flow_module_id` separated by a colon (`:`). For example:
 * 
 * ```sh
 * $ pulumi import aws:connect/contactFlowModule:ContactFlowModule example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
 * ```
 * 
 */
@ResourceType(type="aws:connect/contactFlowModule:ContactFlowModule")
public class ContactFlowModule extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Contact Flow Module.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Contact Flow Module.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The identifier of the Contact Flow Module.
     * 
     */
    @Export(name="contactFlowModuleId", refs={String.class}, tree="[0]")
    private Output<String> contactFlowModuleId;

    /**
     * @return The identifier of the Contact Flow Module.
     * 
     */
    public Output<String> contactFlowModuleId() {
        return this.contactFlowModuleId;
    }
    /**
     * Specifies the content of the Contact Flow Module, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
     * 
     */
    @Export(name="content", refs={String.class}, tree="[0]")
    private Output<String> content;

    /**
     * @return Specifies the content of the Contact Flow Module, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
     * 
     */
    public Output<String> content() {
        return this.content;
    }
    /**
     * Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow Module source specified with `filename`.
     * 
     */
    @Export(name="contentHash", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> contentHash;

    /**
     * @return Used to trigger updates. Must be set to a base64-encoded SHA256 hash of the Contact Flow Module source specified with `filename`.
     * 
     */
    public Output<Optional<String>> contentHash() {
        return Codegen.optional(this.contentHash);
    }
    /**
     * Specifies the description of the Contact Flow Module.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Specifies the description of the Contact Flow Module.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The path to the Contact Flow Module source within the local filesystem. Conflicts with `content`.
     * 
     */
    @Export(name="filename", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> filename;

    /**
     * @return The path to the Contact Flow Module source within the local filesystem. Conflicts with `content`.
     * 
     */
    public Output<Optional<String>> filename() {
        return Codegen.optional(this.filename);
    }
    /**
     * Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return Specifies the identifier of the hosting Amazon Connect Instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }
    /**
     * Specifies the name of the Contact Flow Module.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return Specifies the name of the Contact Flow Module.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Tags to apply to the Contact Flow Module. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Tags to apply to the Contact Flow Module. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ContactFlowModule(String name) {
        this(name, ContactFlowModuleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ContactFlowModule(String name, ContactFlowModuleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ContactFlowModule(String name, ContactFlowModuleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/contactFlowModule:ContactFlowModule", name, args == null ? ContactFlowModuleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ContactFlowModule(String name, Output<String> id, @Nullable ContactFlowModuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/contactFlowModule:ContactFlowModule", name, state, makeResourceOptions(options, id));
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
    public static ContactFlowModule get(String name, Output<String> id, @Nullable ContactFlowModuleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ContactFlowModule(name, id, state, options);
    }
}
