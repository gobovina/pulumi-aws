// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kms.ReplicaExternalKeyArgs;
import com.pulumi.aws.kms.inputs.ReplicaExternalKeyState;
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
 * Manages a KMS multi-Region replica key that uses external key material.
 * See the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/multi-region-keys-import.html) for more information on importing key material into multi-Region keys.
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
 * import com.pulumi.aws.kms.ReplicaExternalKey;
 * import com.pulumi.aws.kms.ReplicaExternalKeyArgs;
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
 *         var primary = new ExternalKey(&#34;primary&#34;, ExternalKeyArgs.builder()        
 *             .description(&#34;Multi-Region primary key&#34;)
 *             .deletionWindowInDays(30)
 *             .multiRegion(true)
 *             .enabled(true)
 *             .keyMaterialBase64(&#34;...&#34;)
 *             .build());
 * 
 *         var replica = new ReplicaExternalKey(&#34;replica&#34;, ReplicaExternalKeyArgs.builder()        
 *             .description(&#34;Multi-Region replica key&#34;)
 *             .deletionWindowInDays(7)
 *             .primaryKeyArn(primaryAwsKmsExternal.arn())
 *             .keyMaterialBase64(&#34;...&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import KMS multi-Region replica keys using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:kms/replicaExternalKey:ReplicaExternalKey example 1234abcd-12ab-34cd-56ef-1234567890ab
 * ```
 * 
 */
@ResourceType(type="aws:kms/replicaExternalKey:ReplicaExternalKey")
public class ReplicaExternalKey extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the replica key. The key ARNs of related multi-Region keys differ only in the Region value.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the replica key. The key ARNs of related multi-Region keys differ only in the Region value.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     * 
     */
    @Export(name="bypassPolicyLockoutSafetyCheck", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> bypassPolicyLockoutSafetyCheck;

    /**
     * @return A flag to indicate whether to bypass the key policy lockout safety check.
     * Setting this value to true increases the risk that the KMS key becomes unmanageable. Do not set this value to true indiscriminately.
     * For more information, refer to the scenario in the [Default Key Policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default-allow-root-enable-iam) section in the _AWS Key Management Service Developer Guide_.
     * The default value is `false`.
     * 
     */
    public Output<Optional<Boolean>> bypassPolicyLockoutSafetyCheck() {
        return Codegen.optional(this.bypassPolicyLockoutSafetyCheck);
    }
    /**
     * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     * 
     */
    @Export(name="deletionWindowInDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> deletionWindowInDays;

    /**
     * @return The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     * 
     */
    public Output<Optional<Integer>> deletionWindowInDays() {
        return Codegen.optional(this.deletionWindowInDays);
    }
    /**
     * A description of the KMS key.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return A description of the KMS key.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic operations. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> enabled;

    /**
     * @return Specifies whether the replica key is enabled. Disabled KMS keys cannot be used in cryptographic operations. Keys pending import can only be `false`. Imported keys default to `true` unless expired.
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
     * The key ID of the replica key. Related multi-Region keys have the same key ID.
     * 
     */
    @Export(name="keyId", refs={String.class}, tree="[0]")
    private Output<String> keyId;

    /**
     * @return The key ID of the replica key. Related multi-Region keys have the same key ID.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }
    /**
     * Base64 encoded 256-bit symmetric encryption key material to import. The KMS key is permanently associated with this key material. The same key material can be [reimported](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material), but you cannot import different key material.
     * 
     */
    @Export(name="keyMaterialBase64", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyMaterialBase64;

    /**
     * @return Base64 encoded 256-bit symmetric encryption key material to import. The KMS key is permanently associated with this key material. The same key material can be [reimported](https://docs.aws.amazon.com/kms/latest/developerguide/importing-keys.html#reimport-key-material), but you cannot import different key material.
     * 
     */
    public Output<Optional<String>> keyMaterialBase64() {
        return Codegen.optional(this.keyMaterialBase64);
    }
    /**
     * The state of the replica key.
     * 
     */
    @Export(name="keyState", refs={String.class}, tree="[0]")
    private Output<String> keyState;

    /**
     * @return The state of the replica key.
     * 
     */
    public Output<String> keyState() {
        return this.keyState;
    }
    /**
     * The [cryptographic operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations) for which you can use the KMS key. This is a shared property of multi-Region keys.
     * 
     */
    @Export(name="keyUsage", refs={String.class}, tree="[0]")
    private Output<String> keyUsage;

    /**
     * @return The [cryptographic operations](https://docs.aws.amazon.com/kms/latest/developerguide/concepts.html#cryptographic-operations) for which you can use the KMS key. This is a shared property of multi-Region keys.
     * 
     */
    public Output<String> keyUsage() {
        return this.keyUsage;
    }
    /**
     * The key policy to attach to the KMS key. If you do not specify a key policy, AWS KMS attaches the [default key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default) to the KMS key.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return The key policy to attach to the KMS key. If you do not specify a key policy, AWS KMS attaches the [default key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default) to the KMS key.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * The ARN of the multi-Region primary key to replicate. The primary key must be in a different AWS Region of the same AWS Partition. You can create only one replica of a given primary key in each AWS Region.
     * 
     */
    @Export(name="primaryKeyArn", refs={String.class}, tree="[0]")
    private Output<String> primaryKeyArn;

    /**
     * @return The ARN of the multi-Region primary key to replicate. The primary key must be in a different AWS Region of the same AWS Partition. You can create only one replica of a given primary key in each AWS Region.
     * 
     */
    public Output<String> primaryKeyArn() {
        return this.primaryKeyArn;
    }
    /**
     * A map of tags to assign to the replica key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the replica key. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the key becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    @Export(name="validTo", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> validTo;

    /**
     * @return Time at which the imported key material expires. When the key material expires, AWS KMS deletes the key material and the key becomes unusable. If not specified, key material does not expire. Valid values: [RFC3339 time string](https://tools.ietf.org/html/rfc3339#section-5.8) (`YYYY-MM-DDTHH:MM:SSZ`)
     * 
     */
    public Output<Optional<String>> validTo() {
        return Codegen.optional(this.validTo);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ReplicaExternalKey(String name) {
        this(name, ReplicaExternalKeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ReplicaExternalKey(String name, ReplicaExternalKeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ReplicaExternalKey(String name, ReplicaExternalKeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/replicaExternalKey:ReplicaExternalKey", name, args == null ? ReplicaExternalKeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ReplicaExternalKey(String name, Output<String> id, @Nullable ReplicaExternalKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/replicaExternalKey:ReplicaExternalKey", name, state, makeResourceOptions(options, id));
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
    public static ReplicaExternalKey get(String name, Output<String> id, @Nullable ReplicaExternalKeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ReplicaExternalKey(name, id, state, options);
    }
}
