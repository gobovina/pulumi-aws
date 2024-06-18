// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudfront.PublicKeyArgs;
import com.pulumi.aws.cloudfront.inputs.PublicKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * The following example below creates a CloudFront public key.
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudfront.PublicKey;
 * import com.pulumi.aws.cloudfront.PublicKeyArgs;
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
 *         var example = new PublicKey("example", PublicKeyArgs.builder()
 *             .comment("test public key")
 *             .encodedKey(StdFunctions.file(FileArgs.builder()
 *                 .input("public_key.pem")
 *                 .build()).result())
 *             .name("test_key")
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
 * Using `pulumi import`, import CloudFront Public Key using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:cloudfront/publicKey:PublicKey example K3D5EWEUDCCXON
 * ```
 * 
 */
@ResourceType(type="aws:cloudfront/publicKey:PublicKey")
public class PublicKey extends com.pulumi.resources.CustomResource {
    /**
     * Internal value used by CloudFront to allow future updates to the public key configuration.
     * 
     */
    @Export(name="callerReference", refs={String.class}, tree="[0]")
    private Output<String> callerReference;

    /**
     * @return Internal value used by CloudFront to allow future updates to the public key configuration.
     * 
     */
    public Output<String> callerReference() {
        return this.callerReference;
    }
    /**
     * An optional comment about the public key.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> comment;

    /**
     * @return An optional comment about the public key.
     * 
     */
    public Output<Optional<String>> comment() {
        return Codegen.optional(this.comment);
    }
    /**
     * The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
     * 
     */
    @Export(name="encodedKey", refs={String.class}, tree="[0]")
    private Output<String> encodedKey;

    /**
     * @return The encoded public key that you want to add to CloudFront to use with features like field-level encryption.
     * 
     */
    public Output<String> encodedKey() {
        return this.encodedKey;
    }
    /**
     * The current version of the public key. For example: `E2QWRUHAPOMQZL`.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return The current version of the public key. For example: `E2QWRUHAPOMQZL`.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * The name for the public key. By default generated by this provider. Note: Do not set if using the key&#39;s id in another resource (e.g. KeyGroup) since it will result in a dependency error from AWS. Instead, it is recommended to use Pulumi autonaming by leaving this property unset (default behavior) or set the `namePrefix` property to allow the provider to autoname the resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name for the public key. By default generated by this provider. Note: Do not set if using the key&#39;s id in another resource (e.g. KeyGroup) since it will result in a dependency error from AWS. Instead, it is recommended to use Pulumi autonaming by leaving this property unset (default behavior) or set the `namePrefix` property to allow the provider to autoname the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name for the public key. Conflicts with `name`.
     * 
     * **NOTE:** When setting `encoded_key` value, there needs a newline at the end of string. Otherwise, multiple runs of pulumi will want to recreate the `aws.cloudfront.PublicKey` resource.
     * 
     */
    @Export(name="namePrefix", refs={String.class}, tree="[0]")
    private Output<String> namePrefix;

    /**
     * @return The name for the public key. Conflicts with `name`.
     * 
     * **NOTE:** When setting `encoded_key` value, there needs a newline at the end of string. Otherwise, multiple runs of pulumi will want to recreate the `aws.cloudfront.PublicKey` resource.
     * 
     */
    public Output<String> namePrefix() {
        return this.namePrefix;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public PublicKey(String name) {
        this(name, PublicKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public PublicKey(String name, PublicKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public PublicKey(String name, PublicKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/publicKey:PublicKey", name, args == null ? PublicKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private PublicKey(String name, Output<String> id, @Nullable PublicKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/publicKey:PublicKey", name, state, makeResourceOptions(options, id));
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
    public static PublicKey get(String name, Output<String> id, @Nullable PublicKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new PublicKey(name, id, state, options);
    }
}
