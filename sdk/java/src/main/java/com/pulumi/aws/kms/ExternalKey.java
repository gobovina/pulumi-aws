// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kms.ExternalKeyArgs;
import com.pulumi.aws.kms.inputs.ExternalKeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a single-Region or multi-Region primary KMS key that uses external key material.
 * To instead manage a single-Region or multi-Region primary KMS key where AWS automatically generates and potentially rotates key material, see the `aws.kms.Key` resource.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.kms.ExternalKey;
 * import com.pulumi.aws.kms.ExternalKeyArgs;
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
 *         var example = new ExternalKey(&#34;example&#34;, ExternalKeyArgs.builder()        
 *             .description(&#34;KMS EXTERNAL for AMI encryption&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import KMS External Keys using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:kms/externalKey:ExternalKey a arn:aws:kms:us-west-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab
 * ```
 * 
 */
@ResourceType(type="aws:kms/externalKey:ExternalKey")
public class ExternalKey extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the key.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the key.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies whether to disable the policy lockout check performed when creating or updating the key&#39;s policy. Setting this value to `true` increases the risk that the key becomes unmanageable. For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the AWS Key Management Service Developer Guide. Defaults to `false`.
     * 
     */
    @Export(name="bypassPolicyLockoutSafetyCheck", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> bypassPolicyLockoutSafetyCheck;

    /**
     * @return Specifies whether to disable the policy lockout check performed when creating or updating the key&#39;s policy. Setting this value to `true` increases the risk that the key becomes unmanageable. For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the AWS Key Management Service Developer Guide. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> bypassPolicyLockoutSafetyCheck() {
        return Codegen.optional(this.bypassPolicyLockoutSafetyCheck);
    }
    /**
     * Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
     * 
     */
    @Export(name="deletionWindowInDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> deletionWindowInDays;

    /**
     * @return Duration in days after which the key is deleted after destruction of the resource. Must be between `7` and `30` days. Defaults to `30`.
     * 
     */
    public Output<Optional<Integer>> deletionWindowInDays() {
        return Codegen.optional(this.deletionWindowInDays);
    }
    /**
     * Description of the key.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return Description of the key.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Specifies whether the key is enabled. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     * 
     */
    public Output<Boolean> enabled() {
        return this.enabled;
    }
    /**
     * Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
     * 
     */
    @Export(name="expirationModel", refs={String.class}, tree="[0]")
    private Output<String> expirationModel;

    /**
     * @return Whether the key material expires. Empty when pending key material import, otherwise `KEY_MATERIAL_EXPIRES` or `KEY_MATERIAL_DOES_NOT_EXPIRE`.
     * 
     */
    public Output<String> expirationModel() {
        return this.expirationModel;
    }
    /**
     * Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
     * 
     */
    @Export(name="keyMaterialBase64", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyMaterialBase64;

    /**
     * @return Base64 encoded 256-bit symmetric encryption key material to import. The CMK is permanently associated with this key material. The same key material can be reimported, but you cannot import different key material.
     * 
     */
    public Output<Optional<String>> keyMaterialBase64() {
        return Codegen.optional(this.keyMaterialBase64);
    }
    /**
     * The state of the CMK.
     * 
     */
    @Export(name="keyState", refs={String.class}, tree="[0]")
    private Output<String> keyState;

    /**
     * @return The state of the CMK.
     * 
     */
    public Output<String> keyState() {
        return this.keyState;
    }
    /**
     * The cryptographic operations for which you can use the CMK.
     * 
     */
    @Export(name="keyUsage", refs={String.class}, tree="[0]")
    private Output<String> keyUsage;

    /**
     * @return The cryptographic operations for which you can use the CMK.
     * 
     */
    public Output<String> keyUsage() {
        return this.keyUsage;
    }
    /**
     * Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
     * 
     */
    @Export(name="multiRegion", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> multiRegion;

    /**
     * @return Indicates whether the KMS key is a multi-Region (`true`) or regional (`false`) key. Defaults to `false`.
     * 
     */
    public Output<Boolean> multiRegion() {
        return this.multiRegion;
    }
    /**
     * A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return A key policy JSON document. If you do not provide a key policy, AWS KMS attaches a default key policy to the CMK.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * A key-value map of tags to assign to the key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A key-value map of tags to assign to the key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    @Export(name="validTo", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> validTo;

    /**
     * @return Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the CMK becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    public Output<Optional<String>> validTo() {
        return Codegen.optional(this.validTo);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ExternalKey(String name) {
        this(name, ExternalKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ExternalKey(String name, @Nullable ExternalKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ExternalKey(String name, @Nullable ExternalKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/externalKey:ExternalKey", name, args == null ? ExternalKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ExternalKey(String name, Output<String> id, @Nullable ExternalKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/externalKey:ExternalKey", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "keyMaterialBase64"
            ))
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
    public static ExternalKey get(String name, Output<String> id, @Nullable ExternalKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ExternalKey(name, id, state, options);
    }
}
