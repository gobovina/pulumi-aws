// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.iam;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.iam.VirtualMfaDeviceArgs;
import com.pulumi.aws.iam.inputs.VirtualMfaDeviceState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an IAM Virtual MFA Device.
 * 
 * &gt; **Note:** All attributes will be stored in the raw state as plain-text.
 * **Note:** A virtual MFA device cannot be directly associated with an IAM User from the provider.
 *   To associate the virtual MFA device with a user and enable it, use the code returned in either `base_32_string_seed` or `qr_code_png` to generate TOTP authentication codes.
 *   The authentication codes can then be used with the AWS CLI command [`aws iam enable-mfa-device`](https://docs.aws.amazon.com/cli/latest/reference/iam/enable-mfa-device.html) or the AWS API call [`EnableMFADevice`](https://docs.aws.amazon.com/IAM/latest/APIReference/API_EnableMFADevice.html).
 * 
 * ## Example Usage
 * 
 * **Using certs on file:**
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.VirtualMfaDevice;
 * import com.pulumi.aws.iam.VirtualMfaDeviceArgs;
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
 *         var example = new VirtualMfaDevice(&#34;example&#34;, VirtualMfaDeviceArgs.builder()        
 *             .virtualMfaDeviceName(&#34;example&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import IAM Virtual MFA Devices using the `arn`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:iam/virtualMfaDevice:VirtualMfaDevice example arn:aws:iam::123456789012:mfa/example
 * ```
 * 
 */
@ResourceType(type="aws:iam/virtualMfaDevice:VirtualMfaDevice")
public class VirtualMfaDevice extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) specifying the virtual mfa device.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) specifying the virtual mfa device.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The base32 seed defined as specified in [RFC3548](https://tools.ietf.org/html/rfc3548.txt). The `base_32_string_seed` is base64-encoded.
     * 
     */
    @Export(name="base32StringSeed", refs={String.class}, tree="[0]")
    private Output<String> base32StringSeed;

    /**
     * @return The base32 seed defined as specified in [RFC3548](https://tools.ietf.org/html/rfc3548.txt). The `base_32_string_seed` is base64-encoded.
     * 
     */
    public Output<String> base32StringSeed() {
        return this.base32StringSeed;
    }
    /**
     * The date and time when the virtual MFA device was enabled.
     * 
     */
    @Export(name="enableDate", refs={String.class}, tree="[0]")
    private Output<String> enableDate;

    /**
     * @return The date and time when the virtual MFA device was enabled.
     * 
     */
    public Output<String> enableDate() {
        return this.enableDate;
    }
    /**
     * The path for the virtual MFA device.
     * 
     */
    @Export(name="path", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> path;

    /**
     * @return The path for the virtual MFA device.
     * 
     */
    public Output<Optional<String>> path() {
        return Codegen.optional(this.path);
    }
    /**
     * A QR code PNG image that encodes `otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String` where `$virtualMFADeviceName` is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID), and Base32String is the seed in base32 format.
     * 
     */
    @Export(name="qrCodePng", refs={String.class}, tree="[0]")
    private Output<String> qrCodePng;

    /**
     * @return A QR code PNG image that encodes `otpauth://totp/$virtualMFADeviceName@$AccountName?secret=$Base32String` where `$virtualMFADeviceName` is one of the create call arguments. AccountName is the user name if set (otherwise, the account ID), and Base32String is the seed in base32 format.
     * 
     */
    public Output<String> qrCodePng() {
        return this.qrCodePng;
    }
    /**
     * Map of resource tags for the virtual mfa device. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Map of resource tags for the virtual mfa device. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
     * The associated IAM User name if the virtual MFA device is enabled.
     * 
     */
    @Export(name="userName", refs={String.class}, tree="[0]")
    private Output<String> userName;

    /**
     * @return The associated IAM User name if the virtual MFA device is enabled.
     * 
     */
    public Output<String> userName() {
        return this.userName;
    }
    /**
     * The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
     * 
     */
    @Export(name="virtualMfaDeviceName", refs={String.class}, tree="[0]")
    private Output<String> virtualMfaDeviceName;

    /**
     * @return The name of the virtual MFA device. Use with path to uniquely identify a virtual MFA device.
     * 
     */
    public Output<String> virtualMfaDeviceName() {
        return this.virtualMfaDeviceName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VirtualMfaDevice(String name) {
        this(name, VirtualMfaDeviceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VirtualMfaDevice(String name, VirtualMfaDeviceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VirtualMfaDevice(String name, VirtualMfaDeviceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/virtualMfaDevice:VirtualMfaDevice", name, args == null ? VirtualMfaDeviceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VirtualMfaDevice(String name, Output<String> id, @Nullable VirtualMfaDeviceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:iam/virtualMfaDevice:VirtualMfaDevice", name, state, makeResourceOptions(options, id));
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
    public static VirtualMfaDevice get(String name, Output<String> id, @Nullable VirtualMfaDeviceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VirtualMfaDevice(name, id, state, options);
    }
}
