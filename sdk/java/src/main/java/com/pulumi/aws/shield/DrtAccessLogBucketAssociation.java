// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.shield;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.shield.DrtAccessLogBucketAssociationArgs;
import com.pulumi.aws.shield.inputs.DrtAccessLogBucketAssociationState;
import com.pulumi.aws.shield.outputs.DrtAccessLogBucketAssociationTimeouts;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Shield DRT Access Log Bucket Association.
 * Up to 10 log buckets can be associated for DRT Access sharing with the Shield Response Team (SRT).
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
 * import com.pulumi.aws.shield.DrtAccessRoleArnAssociation;
 * import com.pulumi.aws.shield.DrtAccessRoleArnAssociationArgs;
 * import com.pulumi.aws.shield.DrtAccessLogBucketAssociation;
 * import com.pulumi.aws.shield.DrtAccessLogBucketAssociationArgs;
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
 *         var test = new DrtAccessRoleArnAssociation(&#34;test&#34;, DrtAccessRoleArnAssociationArgs.builder()        
 *             .roleArn(String.format(&#34;arn:aws:iam:%s:%s:%s&#34;, current.name(),currentAwsCallerIdentity.accountId(),shieldDrtAccessRoleName))
 *             .build());
 * 
 *         var testDrtAccessLogBucketAssociation = new DrtAccessLogBucketAssociation(&#34;testDrtAccessLogBucketAssociation&#34;, DrtAccessLogBucketAssociationArgs.builder()        
 *             .logBucket(shieldDrtAccessLogBucket)
 *             .roleArnAssociationId(test.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Shield DRT access log bucket associations using the `log_bucket`. For example:
 * 
 * ```sh
 * $ pulumi import aws:shield/drtAccessLogBucketAssociation:DrtAccessLogBucketAssociation example example-bucket
 * ```
 * 
 */
@ResourceType(type="aws:shield/drtAccessLogBucketAssociation:DrtAccessLogBucketAssociation")
public class DrtAccessLogBucketAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon S3 bucket that contains the logs that you want to share.
     * 
     */
    @Export(name="logBucket", refs={String.class}, tree="[0]")
    private Output<String> logBucket;

    /**
     * @return The Amazon S3 bucket that contains the logs that you want to share.
     * 
     */
    public Output<String> logBucket() {
        return this.logBucket;
    }
    /**
     * The ID of the Role Arn association used for allowing Shield DRT Access.
     * 
     */
    @Export(name="roleArnAssociationId", refs={String.class}, tree="[0]")
    private Output<String> roleArnAssociationId;

    /**
     * @return The ID of the Role Arn association used for allowing Shield DRT Access.
     * 
     */
    public Output<String> roleArnAssociationId() {
        return this.roleArnAssociationId;
    }
    @Export(name="timeouts", refs={DrtAccessLogBucketAssociationTimeouts.class}, tree="[0]")
    private Output</* @Nullable */ DrtAccessLogBucketAssociationTimeouts> timeouts;

    public Output<Optional<DrtAccessLogBucketAssociationTimeouts>> timeouts() {
        return Codegen.optional(this.timeouts);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DrtAccessLogBucketAssociation(String name) {
        this(name, DrtAccessLogBucketAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DrtAccessLogBucketAssociation(String name, DrtAccessLogBucketAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DrtAccessLogBucketAssociation(String name, DrtAccessLogBucketAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/drtAccessLogBucketAssociation:DrtAccessLogBucketAssociation", name, args == null ? DrtAccessLogBucketAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DrtAccessLogBucketAssociation(String name, Output<String> id, @Nullable DrtAccessLogBucketAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:shield/drtAccessLogBucketAssociation:DrtAccessLogBucketAssociation", name, state, makeResourceOptions(options, id));
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
    public static DrtAccessLogBucketAssociation get(String name, Output<String> id, @Nullable DrtAccessLogBucketAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DrtAccessLogBucketAssociation(name, id, state, options);
    }
}
