// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kms.KeyArgs;
import com.pulumi.aws.kms.inputs.KeyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a single-Region or multi-Region primary KMS key.
 * 
 * &gt; **NOTE on KMS Key Policy:** KMS Key Policy can be configured in either the standalone resource `aws.kms.KeyPolicy`
 * or with the parameter `policy` in this resource.
 * Configuring with both will cause inconsistencies and may overwrite configuration.
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
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
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
 *         var a = new Key("a", KeyArgs.builder()        
 *             .description("KMS key 1")
 *             .deletionWindowInDays(10)
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
 * Using `pulumi import`, import KMS Keys using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:kms/key:Key a 1234abcd-12ab-34cd-56ef-1234567890ab
 * ```
 * 
 */
@ResourceType(type="aws:kms/key:Key")
public class Key extends com.pulumi.resources.CustomResource {
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
     * ID of the KMS [Custom Key Store](https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html) where the key will be stored instead of KMS (eg CloudHSM).
     * 
     */
    @Export(name="customKeyStoreId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customKeyStoreId;

    /**
     * @return ID of the KMS [Custom Key Store](https://docs.aws.amazon.com/kms/latest/developerguide/create-cmk-keystore.html) where the key will be stored instead of KMS (eg CloudHSM).
     * 
     */
    public Output<Optional<String>> customKeyStoreId() {
        return Codegen.optional(this.customKeyStoreId);
    }
    /**
     * Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
     * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `HMAC_256`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
     * 
     */
    @Export(name="customerMasterKeySpec", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> customerMasterKeySpec;

    /**
     * @return Specifies whether the key contains a symmetric key or an asymmetric key pair and the encryption algorithms or signing algorithms that the key supports.
     * Valid values: `SYMMETRIC_DEFAULT`,  `RSA_2048`, `RSA_3072`, `RSA_4096`, `HMAC_256`, `ECC_NIST_P256`, `ECC_NIST_P384`, `ECC_NIST_P521`, or `ECC_SECG_P256K1`. Defaults to `SYMMETRIC_DEFAULT`. For help with choosing a key spec, see the [AWS KMS Developer Guide](https://docs.aws.amazon.com/kms/latest/developerguide/symm-asymm-choose.html).
     * 
     */
    public Output<Optional<String>> customerMasterKeySpec() {
        return Codegen.optional(this.customerMasterKeySpec);
    }
    /**
     * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     * If the KMS key is a multi-Region primary key with replicas, the waiting period begins when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
     * 
     */
    @Export(name="deletionWindowInDays", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> deletionWindowInDays;

    /**
     * @return The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the KMS key.
     * If you specify a value, it must be between `7` and `30`, inclusive. If you do not specify a value, it defaults to `30`.
     * If the KMS key is a multi-Region primary key with replicas, the waiting period begins when the last of its replica keys is deleted. Otherwise, the waiting period begins immediately.
     * 
     */
    public Output<Optional<Integer>> deletionWindowInDays() {
        return Codegen.optional(this.deletionWindowInDays);
    }
    /**
     * The description of the key as viewed in AWS console.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return The description of the key as viewed in AWS console.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to `false`.
     * 
     */
    @Export(name="enableKeyRotation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enableKeyRotation;

    /**
     * @return Specifies whether [key rotation](http://docs.aws.amazon.com/kms/latest/developerguide/rotate-keys.html) is enabled. Defaults to `false`.
     * 
     */
    public Output<Optional<Boolean>> enableKeyRotation() {
        return Codegen.optional(this.enableKeyRotation);
    }
    /**
     * Specifies whether the key is enabled. Defaults to `true`.
     * 
     */
    @Export(name="isEnabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> isEnabled;

    /**
     * @return Specifies whether the key is enabled. Defaults to `true`.
     * 
     */
    public Output<Optional<Boolean>> isEnabled() {
        return Codegen.optional(this.isEnabled);
    }
    /**
     * The globally unique identifier for the key.
     * 
     */
    @Export(name="keyId", refs={String.class}, tree="[0]")
    private Output<String> keyId;

    /**
     * @return The globally unique identifier for the key.
     * 
     */
    public Output<String> keyId() {
        return this.keyId;
    }
    /**
     * Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT`, `SIGN_VERIFY`, or `GENERATE_VERIFY_MAC`.
     * Defaults to `ENCRYPT_DECRYPT`.
     * 
     */
    @Export(name="keyUsage", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> keyUsage;

    /**
     * @return Specifies the intended use of the key. Valid values: `ENCRYPT_DECRYPT`, `SIGN_VERIFY`, or `GENERATE_VERIFY_MAC`.
     * Defaults to `ENCRYPT_DECRYPT`.
     * 
     */
    public Output<Optional<String>> keyUsage() {
        return Codegen.optional(this.keyUsage);
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
     * A valid policy JSON document. Although this is a key policy, not an IAM policy, an `aws.iam.getPolicyDocument`, in the form that designates a principal, can be used.
     * 
     * &gt; **NOTE:** Note: All KMS keys must have a key policy. If a key policy is not specified, AWS gives the KMS key a [default key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default) that gives all principals in the owning account unlimited access to all KMS operations for the key. This default key policy effectively delegates all access control to IAM policies and KMS grants.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return A valid policy JSON document. Although this is a key policy, not an IAM policy, an `aws.iam.getPolicyDocument`, in the form that designates a principal, can be used.
     * 
     * &gt; **NOTE:** Note: All KMS keys must have a key policy. If a key policy is not specified, AWS gives the KMS key a [default key policy](https://docs.aws.amazon.com/kms/latest/developerguide/key-policies.html#key-policy-default) that gives all principals in the owning account unlimited access to all KMS operations for the key. This default key policy effectively delegates all access control to IAM policies and KMS grants.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * Custom period of time between each rotation date. Must be a number between 90 and 2560 (inclusive).
     * 
     */
    @Export(name="rotationPeriodInDays", refs={Integer.class}, tree="[0]")
    private Output<Integer> rotationPeriodInDays;

    /**
     * @return Custom period of time between each rotation date. Must be a number between 90 and 2560 (inclusive).
     * 
     */
    public Output<Integer> rotationPeriodInDays() {
        return this.rotationPeriodInDays;
    }
    /**
     * A map of tags to assign to the object. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the object. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Identifies the external key that serves as key material for the KMS key in an external key store.
     * 
     */
    @Export(name="xksKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> xksKeyId;

    /**
     * @return Identifies the external key that serves as key material for the KMS key in an external key store.
     * 
     */
    public Output<Optional<String>> xksKeyId() {
        return Codegen.optional(this.xksKeyId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Key(String name) {
        this(name, KeyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Key(String name, @Nullable KeyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Key(String name, @Nullable KeyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/key:Key", name, args == null ? KeyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Key(String name, Output<String> id, @Nullable KeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/key:Key", name, state, makeResourceOptions(options, id));
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
    public static Key get(String name, Output<String> id, @Nullable KeyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Key(name, id, state, options);
    }
}
