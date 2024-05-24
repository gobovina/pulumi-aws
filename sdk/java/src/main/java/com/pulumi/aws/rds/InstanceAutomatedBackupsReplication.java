// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.rds;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.rds.InstanceAutomatedBackupsReplicationArgs;
import com.pulumi.aws.rds.inputs.InstanceAutomatedBackupsReplicationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manage cross-region replication of automated backups to a different AWS Region. Documentation for cross-region automated backup replication can be found at:
 * 
 * * [Replicating automated backups to another AWS Region](https://docs.aws.amazon.com/AmazonRDS/latest/UserGuide/USER_ReplicateBackups.html)
 * 
 * &gt; **Note:** This resource has to be created in the destination region.
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
 * import com.pulumi.aws.rds.InstanceAutomatedBackupsReplication;
 * import com.pulumi.aws.rds.InstanceAutomatedBackupsReplicationArgs;
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
 *         var default_ = new InstanceAutomatedBackupsReplication("default", InstanceAutomatedBackupsReplicationArgs.builder()
 *             .sourceDbInstanceArn("arn:aws:rds:us-west-2:123456789012:db:mydatabase")
 *             .retentionPeriod(14)
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Encrypting the automated backup with KMS
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.InstanceAutomatedBackupsReplication;
 * import com.pulumi.aws.rds.InstanceAutomatedBackupsReplicationArgs;
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
 *         var default_ = new InstanceAutomatedBackupsReplication("default", InstanceAutomatedBackupsReplicationArgs.builder()
 *             .sourceDbInstanceArn("arn:aws:rds:us-west-2:123456789012:db:mydatabase")
 *             .kmsKeyId("arn:aws:kms:us-east-1:123456789012:key/12345678-1234-1234-1234-123456789012")
 *             .build());
 * 
 *     }
 * }
 * }
 * </pre>
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Example including a RDS DB instance
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.rds.Instance;
 * import com.pulumi.aws.rds.InstanceArgs;
 * import com.pulumi.aws.kms.Key;
 * import com.pulumi.aws.kms.KeyArgs;
 * import com.pulumi.aws.rds.InstanceAutomatedBackupsReplication;
 * import com.pulumi.aws.rds.InstanceAutomatedBackupsReplicationArgs;
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
 *         var default_ = new Instance("default", InstanceArgs.builder()
 *             .allocatedStorage(10)
 *             .identifier("mydb")
 *             .engine("postgres")
 *             .engineVersion("13.4")
 *             .instanceClass("db.t3.micro")
 *             .dbName("mydb")
 *             .username("masterusername")
 *             .password("mustbeeightcharacters")
 *             .backupRetentionPeriod(7)
 *             .storageEncrypted(true)
 *             .skipFinalSnapshot(true)
 *             .build());
 * 
 *         var defaultKey = new Key("defaultKey", KeyArgs.builder()
 *             .description("Encryption key for automated backups")
 *             .build());
 * 
 *         var defaultInstanceAutomatedBackupsReplication = new InstanceAutomatedBackupsReplication("defaultInstanceAutomatedBackupsReplication", InstanceAutomatedBackupsReplicationArgs.builder()
 *             .sourceDbInstanceArn(default_.arn())
 *             .kmsKeyId(defaultKey.arn())
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
 * Using `pulumi import`, import RDS instance automated backups replication using the `arn`. For example:
 * 
 * ```sh
 * $ pulumi import aws:rds/instanceAutomatedBackupsReplication:InstanceAutomatedBackupsReplication default arn:aws:rds:us-east-1:123456789012:auto-backup:ab-faaa2mgdj1vmp4xflr7yhsrmtbtob7ltrzzz2my
 * ```
 * 
 */
@ResourceType(type="aws:rds/instanceAutomatedBackupsReplication:InstanceAutomatedBackupsReplication")
public class InstanceAutomatedBackupsReplication extends com.pulumi.resources.CustomResource {
    /**
     * The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output<String> kmsKeyId;

    /**
     * @return The AWS KMS key identifier for encryption of the replicated automated backups. The KMS key ID is the Amazon Resource Name (ARN) for the KMS encryption key in the destination AWS Region, for example, `arn:aws:kms:us-east-1:123456789012:key/AKIAIOSFODNN7EXAMPLE`.
     * 
     */
    public Output<String> kmsKeyId() {
        return this.kmsKeyId;
    }
    /**
     * A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
     * 
     */
    @Export(name="preSignedUrl", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> preSignedUrl;

    /**
     * @return A URL that contains a [Signature Version 4](https://docs.aws.amazon.com/general/latest/gr/signature-version-4.html) signed request for the [`StartDBInstanceAutomatedBackupsReplication`](https://docs.aws.amazon.com/AmazonRDS/latest/APIReference/API_StartDBInstanceAutomatedBackupsReplication.html) action to be called in the AWS Region of the source DB instance.
     * 
     */
    public Output<Optional<String>> preSignedUrl() {
        return Codegen.optional(this.preSignedUrl);
    }
    /**
     * The retention period for the replicated automated backups, defaults to `7`.
     * 
     */
    @Export(name="retentionPeriod", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> retentionPeriod;

    /**
     * @return The retention period for the replicated automated backups, defaults to `7`.
     * 
     */
    public Output<Optional<Integer>> retentionPeriod() {
        return Codegen.optional(this.retentionPeriod);
    }
    /**
     * The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
     * 
     */
    @Export(name="sourceDbInstanceArn", refs={String.class}, tree="[0]")
    private Output<String> sourceDbInstanceArn;

    /**
     * @return The Amazon Resource Name (ARN) of the source DB instance for the replicated automated backups, for example, `arn:aws:rds:us-west-2:123456789012:db:mydatabase`.
     * 
     */
    public Output<String> sourceDbInstanceArn() {
        return this.sourceDbInstanceArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public InstanceAutomatedBackupsReplication(String name) {
        this(name, InstanceAutomatedBackupsReplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public InstanceAutomatedBackupsReplication(String name, InstanceAutomatedBackupsReplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public InstanceAutomatedBackupsReplication(String name, InstanceAutomatedBackupsReplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/instanceAutomatedBackupsReplication:InstanceAutomatedBackupsReplication", name, args == null ? InstanceAutomatedBackupsReplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private InstanceAutomatedBackupsReplication(String name, Output<String> id, @Nullable InstanceAutomatedBackupsReplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:rds/instanceAutomatedBackupsReplication:InstanceAutomatedBackupsReplication", name, state, makeResourceOptions(options, id));
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
    public static InstanceAutomatedBackupsReplication get(String name, Output<String> id, @Nullable InstanceAutomatedBackupsReplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new InstanceAutomatedBackupsReplication(name, id, state, options);
    }
}
