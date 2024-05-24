// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.xray;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.xray.EncryptionConfigArgs;
import com.pulumi.aws.xray.inputs.EncryptionConfigState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates and manages an AWS XRay Encryption Config.
 * 
 * &gt; **NOTE:** Removing this resource from the provider has no effect to the encryption configuration within X-Ray.
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
 * import com.pulumi.aws.xray.EncryptionConfig;
 * import com.pulumi.aws.xray.EncryptionConfigArgs;
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
 *         var example = new EncryptionConfig("example", EncryptionConfigArgs.builder()
 *             .type("NONE")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### With KMS Key
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
 * import com.pulumi.aws.xray.EncryptionConfig;
 * import com.pulumi.aws.xray.EncryptionConfigArgs;
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
 *         final var current = AwsFunctions.getCallerIdentity();
 * 
 *         final var example = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .sid("Enable IAM User Permissions")
 *                 .effect("Allow")
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type("AWS")
 *                     .identifiers(String.format("arn:aws:iam::%s:root", current.applyValue(getCallerIdentityResult -> getCallerIdentityResult.accountId())))
 *                     .build())
 *                 .actions("kms:*")
 *                 .resources("*")
 *                 .build())
 *             .build());
 * 
 *         var exampleKey = new Key("exampleKey", KeyArgs.builder()
 *             .description("Some Key")
 *             .deletionWindowInDays(7)
 *             .policy(example.applyValue(getPolicyDocumentResult -> getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var exampleEncryptionConfig = new EncryptionConfig("exampleEncryptionConfig", EncryptionConfigArgs.builder()
 *             .type("KMS")
 *             .keyId(exampleKey.arn())
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
 * Using `pulumi import`, import XRay Encryption Config using the region name. For example:
 * 
 * ```sh
 * $ pulumi import aws:xray/encryptionConfig:EncryptionConfig example us-west-2
 * ```
 * 
 */
@ResourceType(type="aws:xray/encryptionConfig:EncryptionConfig")
public class EncryptionConfig extends com.pulumi.resources.CustomResource {
    /**
     * An AWS KMS customer master key (CMK) ARN.
     * 
     */
    @Export(name="keyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyId;

    /**
     * @return An AWS KMS customer master key (CMK) ARN.
     * 
     */
    public Output<Optional<String>> keyId() {
        return Codegen.optional(this.keyId);
    }
    /**
     * The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     * 
     */
    @Export(name="type", refs={String.class}, tree="[0]")
    private Output<String> type;

    /**
     * @return The type of encryption. Set to `KMS` to use your own key for encryption. Set to `NONE` for default encryption.
     * 
     */
    public Output<String> type() {
        return this.type;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EncryptionConfig(String name) {
        this(name, EncryptionConfigArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EncryptionConfig(String name, EncryptionConfigArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EncryptionConfig(String name, EncryptionConfigArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:xray/encryptionConfig:EncryptionConfig", name, args == null ? EncryptionConfigArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EncryptionConfig(String name, Output<String> id, @Nullable EncryptionConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:xray/encryptionConfig:EncryptionConfig", name, state, makeResourceOptions(options, id));
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
    public static EncryptionConfig get(String name, Output<String> id, @Nullable EncryptionConfigState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EncryptionConfig(name, id, state, options);
    }
}
