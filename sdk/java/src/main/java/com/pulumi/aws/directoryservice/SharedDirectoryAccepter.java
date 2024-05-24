// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.directoryservice;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.directoryservice.SharedDirectoryAccepterArgs;
import com.pulumi.aws.directoryservice.inputs.SharedDirectoryAccepterState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Accepts a shared directory in a consumer account.
 * 
 * &gt; **NOTE:** Destroying this resource removes the shared directory from the consumer account only.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.directoryservice.SharedDirectory;
 * import com.pulumi.aws.directoryservice.SharedDirectoryArgs;
 * import com.pulumi.aws.directoryservice.inputs.SharedDirectoryTargetArgs;
 * import com.pulumi.aws.directoryservice.SharedDirectoryAccepter;
 * import com.pulumi.aws.directoryservice.SharedDirectoryAccepterArgs;
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
 *         var example = new SharedDirectory("example", SharedDirectoryArgs.builder()
 *             .directoryId(exampleAwsDirectoryServiceDirectory.id())
 *             .notes("example")
 *             .target(SharedDirectoryTargetArgs.builder()
 *                 .id(receiver.accountId())
 *                 .build())
 *             .build());
 * 
 *         var exampleSharedDirectoryAccepter = new SharedDirectoryAccepter("exampleSharedDirectoryAccepter", SharedDirectoryAccepterArgs.builder()
 *             .sharedDirectoryId(example.sharedDirectoryId())
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
 * Using `pulumi import`, import Directory Service Shared Directories using the shared directory ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:directoryservice/sharedDirectoryAccepter:SharedDirectoryAccepter example d-9267633ece
 * ```
 * 
 */
@ResourceType(type="aws:directoryservice/sharedDirectoryAccepter:SharedDirectoryAccepter")
public class SharedDirectoryAccepter extends com.pulumi.resources.CustomResource {
    /**
     * Method used when sharing a directory (i.e., `ORGANIZATIONS` or `HANDSHAKE`).
     * 
     */
    @Export(name="method", refs={String.class}, tree="[0]")
    private Output<String> method;

    /**
     * @return Method used when sharing a directory (i.e., `ORGANIZATIONS` or `HANDSHAKE`).
     * 
     */
    public Output<String> method() {
        return this.method;
    }
    /**
     * Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
     * 
     */
    @Export(name="notes", refs={String.class}, tree="[0]")
    private Output<String> notes;

    /**
     * @return Message sent by the directory owner to the directory consumer to help the directory consumer administrator determine whether to approve or reject the share invitation.
     * 
     */
    public Output<String> notes() {
        return this.notes;
    }
    /**
     * Account identifier of the directory owner.
     * 
     */
    @Export(name="ownerAccountId", refs={String.class}, tree="[0]")
    private Output<String> ownerAccountId;

    /**
     * @return Account identifier of the directory owner.
     * 
     */
    public Output<String> ownerAccountId() {
        return this.ownerAccountId;
    }
    /**
     * Identifier of the Managed Microsoft AD directory from the perspective of the directory owner.
     * 
     */
    @Export(name="ownerDirectoryId", refs={String.class}, tree="[0]")
    private Output<String> ownerDirectoryId;

    /**
     * @return Identifier of the Managed Microsoft AD directory from the perspective of the directory owner.
     * 
     */
    public Output<String> ownerDirectoryId() {
        return this.ownerDirectoryId;
    }
    /**
     * Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
     * 
     */
    @Export(name="sharedDirectoryId", refs={String.class}, tree="[0]")
    private Output<String> sharedDirectoryId;

    /**
     * @return Identifier of the directory that is stored in the directory consumer account that corresponds to the shared directory in the owner account.
     * 
     */
    public Output<String> sharedDirectoryId() {
        return this.sharedDirectoryId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SharedDirectoryAccepter(String name) {
        this(name, SharedDirectoryAccepterArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SharedDirectoryAccepter(String name, SharedDirectoryAccepterArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SharedDirectoryAccepter(String name, SharedDirectoryAccepterArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/sharedDirectoryAccepter:SharedDirectoryAccepter", name, args == null ? SharedDirectoryAccepterArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SharedDirectoryAccepter(String name, Output<String> id, @Nullable SharedDirectoryAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:directoryservice/sharedDirectoryAccepter:SharedDirectoryAccepter", name, state, makeResourceOptions(options, id));
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
    public static SharedDirectoryAccepter get(String name, Output<String> id, @Nullable SharedDirectoryAccepterState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SharedDirectoryAccepter(name, id, state, options);
    }
}
