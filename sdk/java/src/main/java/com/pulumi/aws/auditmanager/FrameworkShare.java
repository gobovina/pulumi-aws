// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.auditmanager;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.auditmanager.FrameworkShareArgs;
import com.pulumi.aws.auditmanager.inputs.FrameworkShareState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Audit Manager Framework Share.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.auditmanager.FrameworkShare;
 * import com.pulumi.aws.auditmanager.FrameworkShareArgs;
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
 *         var example = new FrameworkShare(&#34;example&#34;, FrameworkShareArgs.builder()        
 *             .destinationAccount(&#34;012345678901&#34;)
 *             .destinationRegion(&#34;us-east-1&#34;)
 *             .frameworkId(exampleAwsAuditmanagerFramework.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Audit Manager Framework Share using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:auditmanager/frameworkShare:FrameworkShare example abcdef-123456
 * ```
 * 
 */
@ResourceType(type="aws:auditmanager/frameworkShare:FrameworkShare")
public class FrameworkShare extends com.pulumi.resources.CustomResource {
    /**
     * Comment from the sender about the share request.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return Comment from the sender about the share request.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * Amazon Web Services account of the recipient.
     * 
     */
    @Export(name="destinationAccount", refs={String.class}, tree="[0]")
    private Output<String> destinationAccount;

    /**
     * @return Amazon Web Services account of the recipient.
     * 
     */
    public Output<String> destinationAccount() {
        return this.destinationAccount;
    }
    /**
     * Amazon Web Services region of the recipient.
     * 
     */
    @Export(name="destinationRegion", refs={String.class}, tree="[0]")
    private Output<String> destinationRegion;

    /**
     * @return Amazon Web Services region of the recipient.
     * 
     */
    public Output<String> destinationRegion() {
        return this.destinationRegion;
    }
    /**
     * Unique identifier for the shared custom framework.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="frameworkId", refs={String.class}, tree="[0]")
    private Output<String> frameworkId;

    /**
     * @return Unique identifier for the shared custom framework.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> frameworkId() {
        return this.frameworkId;
    }
    /**
     * Status of the share request.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return Status of the share request.
     * 
     */
    public Output<String> status() {
        return this.status;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FrameworkShare(String name) {
        this(name, FrameworkShareArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FrameworkShare(String name, FrameworkShareArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FrameworkShare(String name, FrameworkShareArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:auditmanager/frameworkShare:FrameworkShare", name, args == null ? FrameworkShareArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FrameworkShare(String name, Output<String> id, @Nullable FrameworkShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:auditmanager/frameworkShare:FrameworkShare", name, state, makeResourceOptions(options, id));
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
    public static FrameworkShare get(String name, Output<String> id, @Nullable FrameworkShareState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FrameworkShare(name, id, state, options);
    }
}
