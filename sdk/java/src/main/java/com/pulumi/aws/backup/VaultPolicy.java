// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.backup;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.backup.VaultPolicyArgs;
import com.pulumi.aws.backup.inputs.VaultPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an AWS Backup vault policy resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.backup.Vault;
 * import com.pulumi.aws.backup.VaultArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.backup.VaultPolicy;
 * import com.pulumi.aws.backup.VaultPolicyArgs;
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
 *         var exampleVault = new Vault(&#34;exampleVault&#34;, VaultArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .build());
 * 
 *         final var example = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;AWS&#34;)
 *                     .identifiers(&#34;*&#34;)
 *                     .build())
 *                 .actions(                
 *                     &#34;backup:DescribeBackupVault&#34;,
 *                     &#34;backup:DeleteBackupVault&#34;,
 *                     &#34;backup:PutBackupVaultAccessPolicy&#34;,
 *                     &#34;backup:DeleteBackupVaultAccessPolicy&#34;,
 *                     &#34;backup:GetBackupVaultAccessPolicy&#34;,
 *                     &#34;backup:StartBackupJob&#34;,
 *                     &#34;backup:GetBackupVaultNotifications&#34;,
 *                     &#34;backup:PutBackupVaultNotifications&#34;)
 *                 .resources(exampleVault.arn())
 *                 .build())
 *             .build());
 * 
 *         var exampleVaultPolicy = new VaultPolicy(&#34;exampleVaultPolicy&#34;, VaultPolicyArgs.builder()        
 *             .backupVaultName(exampleVault.name())
 *             .policy(example.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(example -&gt; example.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Backup vault policy using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:backup/vaultPolicy:VaultPolicy test TestVault
 * ```
 * 
 */
@ResourceType(type="aws:backup/vaultPolicy:VaultPolicy")
public class VaultPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the vault.
     * 
     */
    @Export(name="backupVaultArn", refs={String.class}, tree="[0]")
    private Output<String> backupVaultArn;

    /**
     * @return The ARN of the vault.
     * 
     */
    public Output<String> backupVaultArn() {
        return this.backupVaultArn;
    }
    /**
     * Name of the backup vault to add policy for.
     * 
     */
    @Export(name="backupVaultName", refs={String.class}, tree="[0]")
    private Output<String> backupVaultName;

    /**
     * @return Name of the backup vault to add policy for.
     * 
     */
    public Output<String> backupVaultName() {
        return this.backupVaultName;
    }
    /**
     * The backup vault access policy document in JSON format.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return The backup vault access policy document in JSON format.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VaultPolicy(String name) {
        this(name, VaultPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VaultPolicy(String name, VaultPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VaultPolicy(String name, VaultPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/vaultPolicy:VaultPolicy", name, args == null ? VaultPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VaultPolicy(String name, Output<String> id, @Nullable VaultPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:backup/vaultPolicy:VaultPolicy", name, state, makeResourceOptions(options, id));
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
    public static VaultPolicy get(String name, Output<String> id, @Nullable VaultPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VaultPolicy(name, id, state, options);
    }
}
