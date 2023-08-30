// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.efs;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.efs.BackupPolicyArgs;
import com.pulumi.aws.efs.inputs.BackupPolicyState;
import com.pulumi.aws.efs.outputs.BackupPolicyBackupPolicy;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Elastic File System (EFS) Backup Policy resource.
 * Backup policies turn automatic backups on or off for an existing file system.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.efs.FileSystem;
 * import com.pulumi.aws.efs.BackupPolicy;
 * import com.pulumi.aws.efs.BackupPolicyArgs;
 * import com.pulumi.aws.efs.inputs.BackupPolicyBackupPolicyArgs;
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
 *         var fs = new FileSystem(&#34;fs&#34;);
 * 
 *         var policy = new BackupPolicy(&#34;policy&#34;, BackupPolicyArgs.builder()        
 *             .fileSystemId(fs.id())
 *             .backupPolicy(BackupPolicyBackupPolicyArgs.builder()
 *                 .status(&#34;ENABLED&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import the EFS backup policies using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:efs/backupPolicy:BackupPolicy example fs-6fa144c6
 * ```
 * 
 */
@ResourceType(type="aws:efs/backupPolicy:BackupPolicy")
public class BackupPolicy extends com.pulumi.resources.CustomResource {
    /**
     * A backup_policy object (documented below).
     * 
     */
    @Export(name="backupPolicy", refs={BackupPolicyBackupPolicy.class}, tree="[0]")
    private Output<BackupPolicyBackupPolicy> backupPolicy;

    /**
     * @return A backup_policy object (documented below).
     * 
     */
    public Output<BackupPolicyBackupPolicy> backupPolicy() {
        return this.backupPolicy;
    }
    /**
     * The ID of the EFS file system.
     * 
     */
    @Export(name="fileSystemId", refs={String.class}, tree="[0]")
    private Output<String> fileSystemId;

    /**
     * @return The ID of the EFS file system.
     * 
     */
    public Output<String> fileSystemId() {
        return this.fileSystemId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BackupPolicy(String name) {
        this(name, BackupPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BackupPolicy(String name, BackupPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BackupPolicy(String name, BackupPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/backupPolicy:BackupPolicy", name, args == null ? BackupPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BackupPolicy(String name, Output<String> id, @Nullable BackupPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:efs/backupPolicy:BackupPolicy", name, state, makeResourceOptions(options, id));
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
    public static BackupPolicy get(String name, Output<String> id, @Nullable BackupPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BackupPolicy(name, id, state, options);
    }
}
