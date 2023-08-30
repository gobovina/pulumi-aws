// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.fsx;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.fsx.OntapStorageVirtualMachineArgs;
import com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineState;
import com.pulumi.aws.fsx.outputs.OntapStorageVirtualMachineActiveDirectoryConfiguration;
import com.pulumi.aws.fsx.outputs.OntapStorageVirtualMachineEndpoint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a FSx Storage Virtual Machine.
 * See the [FSx ONTAP User Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/managing-svms.html) for more information.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fsx.OntapStorageVirtualMachine;
 * import com.pulumi.aws.fsx.OntapStorageVirtualMachineArgs;
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
 *         var test = new OntapStorageVirtualMachine(&#34;test&#34;, OntapStorageVirtualMachineArgs.builder()        
 *             .fileSystemId(aws_fsx_ontap_file_system.test().id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Using a Self-Managed Microsoft Active Directory
 * 
 * Additional information for using AWS Directory Service with ONTAP File Systems can be found in the [FSx ONTAP Guide](https://docs.aws.amazon.com/fsx/latest/ONTAPGuide/self-managed-AD.html).
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.fsx.OntapStorageVirtualMachine;
 * import com.pulumi.aws.fsx.OntapStorageVirtualMachineArgs;
 * import com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationArgs;
 * import com.pulumi.aws.fsx.inputs.OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfigurationArgs;
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
 *         var test = new OntapStorageVirtualMachine(&#34;test&#34;, OntapStorageVirtualMachineArgs.builder()        
 *             .fileSystemId(aws_fsx_ontap_file_system.test().id())
 *             .activeDirectoryConfiguration(OntapStorageVirtualMachineActiveDirectoryConfigurationArgs.builder()
 *                 .netbiosName(&#34;mysvm&#34;)
 *                 .selfManagedActiveDirectoryConfiguration(OntapStorageVirtualMachineActiveDirectoryConfigurationSelfManagedActiveDirectoryConfigurationArgs.builder()
 *                     .dnsIps(                    
 *                         &#34;10.0.0.111&#34;,
 *                         &#34;10.0.0.222&#34;)
 *                     .domainName(&#34;corp.example.com&#34;)
 *                     .password(&#34;avoid-plaintext-passwords&#34;)
 *                     .username(&#34;Admin&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import FSx Storage Virtual Machine using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:fsx/ontapStorageVirtualMachine:OntapStorageVirtualMachine example svm-12345678abcdef123
 * ```
 *  Certain resource arguments, like `svm_admin_password` and the `self_managed_active_directory` configuation block `password`, do not have a FSx API method for reading the information after creation. If these arguments are set in the TODO configuration on an imported resource, TODO will always show a difference. To workaround this behavior, either omit the argument from the TODO configuration or use `ignore_changes` to hide the difference. For example:
 * 
 */
@ResourceType(type="aws:fsx/ontapStorageVirtualMachine:OntapStorageVirtualMachine")
public class OntapStorageVirtualMachine extends com.pulumi.resources.CustomResource {
    /**
     * Configuration block that Amazon FSx uses to join the FSx ONTAP Storage Virtual Machine(SVM) to your Microsoft Active Directory (AD) directory. Detailed below.
     * 
     */
    @Export(name="activeDirectoryConfiguration", refs={OntapStorageVirtualMachineActiveDirectoryConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ OntapStorageVirtualMachineActiveDirectoryConfiguration> activeDirectoryConfiguration;

    /**
     * @return Configuration block that Amazon FSx uses to join the FSx ONTAP Storage Virtual Machine(SVM) to your Microsoft Active Directory (AD) directory. Detailed below.
     * 
     */
    public Output<Optional<OntapStorageVirtualMachineActiveDirectoryConfiguration>> activeDirectoryConfiguration() {
        return Codegen.optional(this.activeDirectoryConfiguration);
    }
    /**
     * Amazon Resource Name of the storage virtual machine.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name of the storage virtual machine.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The endpoints that are used to access data or to manage the storage virtual machine using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     * 
     */
    @Export(name="endpoints", refs={List.class,OntapStorageVirtualMachineEndpoint.class}, tree="[0,1]")
    private Output<List<OntapStorageVirtualMachineEndpoint>> endpoints;

    /**
     * @return The endpoints that are used to access data or to manage the storage virtual machine using the NetApp ONTAP CLI, REST API, or NetApp SnapMirror. See Endpoints below.
     * 
     */
    public Output<List<OntapStorageVirtualMachineEndpoint>> endpoints() {
        return this.endpoints;
    }
    /**
     * The ID of the Amazon FSx ONTAP File System that this SVM will be created on.
     * 
     */
    @Export(name="fileSystemId", refs={String.class}, tree="[0]")
    private Output<String> fileSystemId;

    /**
     * @return The ID of the Amazon FSx ONTAP File System that this SVM will be created on.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }
    /**
     * The name of the SVM. You can use a maximum of 47 alphanumeric characters, plus the underscore (_) special character.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the SVM. You can use a maximum of 47 alphanumeric characters, plus the underscore (_) special character.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies the root volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. All volumes created under this SVM will inherit the root security style unless the security style is specified on the volume. Default value is `UNIX`.
     * 
     */
    @Export(name="rootVolumeSecurityStyle", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rootVolumeSecurityStyle;

    /**
     * @return Specifies the root volume security style, Valid values are `UNIX`, `NTFS`, and `MIXED`. All volumes created under this SVM will inherit the root security style unless the security style is specified on the volume. Default value is `UNIX`.
     * 
     */
    public Output<Optional<String>> rootVolumeSecurityStyle() {
        return Codegen.optional(this.rootVolumeSecurityStyle);
    }
    /**
     * Describes the SVM&#39;s subtype, e.g. `DEFAULT`
     * 
     */
    @Export(name="subtype", refs={String.class}, tree="[0]")
    private Output<String> subtype;

    /**
     * @return Describes the SVM&#39;s subtype, e.g. `DEFAULT`
     * 
     */
    public Output<String> subtype() {
        return this.subtype;
    }
    @Export(name="svmAdminPassword", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> svmAdminPassword;

    public Output<Optional<String>> svmAdminPassword() {
        return Codegen.optional(this.svmAdminPassword);
    }
    /**
     * A map of tags to assign to the storage virtual machine. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the storage virtual machine. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * The SVM&#39;s UUID (universally unique identifier).
     * 
     */
    @Export(name="uuid", refs={String.class}, tree="[0]")
    private Output<String> uuid;

    /**
     * @return The SVM&#39;s UUID (universally unique identifier).
     * 
     */
    public Output<String> uuid() {
        return this.uuid;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OntapStorageVirtualMachine(String name) {
        this(name, OntapStorageVirtualMachineArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OntapStorageVirtualMachine(String name, OntapStorageVirtualMachineArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OntapStorageVirtualMachine(String name, OntapStorageVirtualMachineArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/ontapStorageVirtualMachine:OntapStorageVirtualMachine", name, args == null ? OntapStorageVirtualMachineArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OntapStorageVirtualMachine(String name, Output<String> id, @Nullable OntapStorageVirtualMachineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:fsx/ontapStorageVirtualMachine:OntapStorageVirtualMachine", name, state, makeResourceOptions(options, id));
    }

    private static com.pulumi.resources.CustomResourceOptions makeResourceOptions(@Nullable com.pulumi.resources.CustomResourceOptions options, @Nullable Output<String> id) {
        var defaultOptions = com.pulumi.resources.CustomResourceOptions.builder()
            .version(Utilities.getVersion())
            .additionalSecretOutputs(List.of(
                "svmAdminPassword"
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
    public static OntapStorageVirtualMachine get(String name, Output<String> id, @Nullable OntapStorageVirtualMachineState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OntapStorageVirtualMachine(name, id, state, options);
    }
}
