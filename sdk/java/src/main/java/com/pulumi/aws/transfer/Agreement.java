// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.transfer;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.transfer.AgreementArgs;
import com.pulumi.aws.transfer.inputs.AgreementState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a AWS Transfer AS2 Agreement resource.
 * 
 * ## Example Usage
 * ### Basic
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.transfer.Agreement;
 * import com.pulumi.aws.transfer.AgreementArgs;
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
 *         var example = new Agreement(&#34;example&#34;, AgreementArgs.builder()        
 *             .accessRole(aws_iam_role.test().arn())
 *             .baseDirectory(&#34;/DOC-EXAMPLE-BUCKET/home/mydirectory&#34;)
 *             .description(&#34;example&#34;)
 *             .localProfileId(aws_transfer_profile.local().profile_id())
 *             .partnerProfileId(aws_transfer_profile.partner().profile_id())
 *             .serverId(aws_transfer_server.test().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Transfer AS2 Agreement using the `server_id/agreement_id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:transfer/agreement:Agreement example s-4221a88afd5f4362a/a-4221a88afd5f4362a
 * ```
 * 
 */
@ResourceType(type="aws:transfer/agreement:Agreement")
public class Agreement extends com.pulumi.resources.CustomResource {
    /**
     * The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
     * 
     */
    @Export(name="accessRole", refs={String.class}, tree="[0]")
    private Output<String> accessRole;

    /**
     * @return The IAM Role which provides read and write access to the parent directory of the file location mentioned in the StartFileTransfer request.
     * 
     */
    public Output<String> accessRole() {
        return this.accessRole;
    }
    /**
     * The unique identifier for the AS2 agreement
     * 
     */
    @Export(name="agreementId", refs={String.class}, tree="[0]")
    private Output<String> agreementId;

    /**
     * @return The unique identifier for the AS2 agreement
     * 
     */
    public Output<String> agreementId() {
        return this.agreementId;
    }
    /**
     * The landing directory for the files transferred by using the AS2 protocol.
     * 
     */
    @Export(name="baseDirectory", refs={String.class}, tree="[0]")
    private Output<String> baseDirectory;

    /**
     * @return The landing directory for the files transferred by using the AS2 protocol.
     * 
     */
    public Output<String> baseDirectory() {
        return this.baseDirectory;
    }
    /**
     * The Optional description of the transdfer.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The Optional description of the transdfer.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The unique identifier for the AS2 local profile.
     * 
     */
    @Export(name="localProfileId", refs={String.class}, tree="[0]")
    private Output<String> localProfileId;

    /**
     * @return The unique identifier for the AS2 local profile.
     * 
     */
    public Output<String> localProfileId() {
        return this.localProfileId;
    }
    /**
     * The unique identifier for the AS2 partner profile.
     * 
     */
    @Export(name="partnerProfileId", refs={String.class}, tree="[0]")
    private Output<String> partnerProfileId;

    /**
     * @return The unique identifier for the AS2 partner profile.
     * 
     */
    public Output<String> partnerProfileId() {
        return this.partnerProfileId;
    }
    /**
     * The unique server identifier for the server instance. This is the specific server the agreement uses.
     * 
     */
    @Export(name="serverId", refs={String.class}, tree="[0]")
    private Output<String> serverId;

    /**
     * @return The unique server identifier for the server instance. This is the specific server the agreement uses.
     * 
     */
    public Output<String> serverId() {
        return this.serverId;
    }
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    public Output<String> status() {
        return this.status;
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Agreement(String name) {
        this(name, AgreementArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Agreement(String name, AgreementArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Agreement(String name, AgreementArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/agreement:Agreement", name, args == null ? AgreementArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Agreement(String name, Output<String> id, @Nullable AgreementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:transfer/agreement:Agreement", name, state, makeResourceOptions(options, id));
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
    public static Agreement get(String name, Output<String> id, @Nullable AgreementState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Agreement(name, id, state, options);
    }
}
