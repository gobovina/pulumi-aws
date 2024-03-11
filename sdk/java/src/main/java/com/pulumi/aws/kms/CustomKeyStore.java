// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.kms;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.kms.CustomKeyStoreArgs;
import com.pulumi.aws.kms.inputs.CustomKeyStoreState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS KMS (Key Management) Custom Key Store.
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
 * import com.pulumi.aws.kms.CustomKeyStore;
 * import com.pulumi.aws.kms.CustomKeyStoreArgs;
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
 *         var test = new CustomKeyStore(&#34;test&#34;, CustomKeyStoreArgs.builder()        
 *             .cloudHsmClusterId(cloudHsmClusterId)
 *             .customKeyStoreName(&#34;kms-custom-key-store-test&#34;)
 *             .keyStorePassword(&#34;noplaintextpasswords1&#34;)
 *             .trustAnchorCertificate(StdFunctions.file(FileArgs.builder()
 *                 .input(&#34;anchor-certificate.crt&#34;)
 *                 .build()).result())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import KMS (Key Management) Custom Key Store using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:kms/customKeyStore:CustomKeyStore example cks-5ebd4ef395a96288e
 * ```
 * 
 */
@ResourceType(type="aws:kms/customKeyStore:CustomKeyStore")
public class CustomKeyStore extends com.pulumi.resources.CustomResource {
    /**
     * Cluster ID of CloudHSM.
     * 
     */
    @Export(name="cloudHsmClusterId", refs={String.class}, tree="[0]")
    private Output<String> cloudHsmClusterId;

    /**
     * @return Cluster ID of CloudHSM.
     * 
     */
    public Output<String> cloudHsmClusterId() {
        return this.cloudHsmClusterId;
    }
    /**
     * Unique name for Custom Key Store.
     * 
     */
    @Export(name="customKeyStoreName", refs={String.class}, tree="[0]")
    private Output<String> customKeyStoreName;

    /**
     * @return Unique name for Custom Key Store.
     * 
     */
    public Output<String> customKeyStoreName() {
        return this.customKeyStoreName;
    }
    /**
     * Password for `kmsuser` on CloudHSM.
     * 
     */
    @Export(name="keyStorePassword", refs={String.class}, tree="[0]")
    private Output<String> keyStorePassword;

    /**
     * @return Password for `kmsuser` on CloudHSM.
     * 
     */
    public Output<String> keyStorePassword() {
        return this.keyStorePassword;
    }
    /**
     * Customer certificate used for signing on CloudHSM.
     * 
     */
    @Export(name="trustAnchorCertificate", refs={String.class}, tree="[0]")
    private Output<String> trustAnchorCertificate;

    /**
     * @return Customer certificate used for signing on CloudHSM.
     * 
     */
    public Output<String> trustAnchorCertificate() {
        return this.trustAnchorCertificate;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public CustomKeyStore(String name) {
        this(name, CustomKeyStoreArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public CustomKeyStore(String name, CustomKeyStoreArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public CustomKeyStore(String name, CustomKeyStoreArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/customKeyStore:CustomKeyStore", name, args == null ? CustomKeyStoreArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private CustomKeyStore(String name, Output<String> id, @Nullable CustomKeyStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:kms/customKeyStore:CustomKeyStore", name, state, makeResourceOptions(options, id));
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
    public static CustomKeyStore get(String name, Output<String> id, @Nullable CustomKeyStoreState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new CustomKeyStore(name, id, state, options);
    }
}
