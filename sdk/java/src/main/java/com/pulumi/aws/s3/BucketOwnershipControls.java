// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.s3;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.s3.BucketOwnershipControlsArgs;
import com.pulumi.aws.s3.inputs.BucketOwnershipControlsState;
import com.pulumi.aws.s3.outputs.BucketOwnershipControlsRule;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage S3 Bucket Ownership Controls. For more information, see the [S3 Developer Guide](https://docs.aws.amazon.com/AmazonS3/latest/dev/about-object-ownership.html).
 * 
 * &gt; This resource cannot be used with S3 directory buckets.
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
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.s3.BucketOwnershipControls;
 * import com.pulumi.aws.s3.BucketOwnershipControlsArgs;
 * import com.pulumi.aws.s3.inputs.BucketOwnershipControlsRuleArgs;
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
 *         var example = new BucketV2(&#34;example&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;example&#34;)
 *             .build());
 * 
 *         var exampleBucketOwnershipControls = new BucketOwnershipControls(&#34;exampleBucketOwnershipControls&#34;, BucketOwnershipControlsArgs.builder()        
 *             .bucket(example.id())
 *             .rule(BucketOwnershipControlsRuleArgs.builder()
 *                 .objectOwnership(&#34;BucketOwnerPreferred&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import S3 Bucket Ownership Controls using S3 Bucket name. For example:
 * 
 * ```sh
 * $ pulumi import aws:s3/bucketOwnershipControls:BucketOwnershipControls example my-bucket
 * ```
 * 
 */
@ResourceType(type="aws:s3/bucketOwnershipControls:BucketOwnershipControls")
public class BucketOwnershipControls extends com.pulumi.resources.CustomResource {
    /**
     * Name of the bucket that you want to associate this access point with.
     * 
     */
    @Export(name="bucket", refs={String.class}, tree="[0]")
    private Output<String> bucket;

    /**
     * @return Name of the bucket that you want to associate this access point with.
     * 
     */
    public Output<String> bucket() {
        return this.bucket;
    }
    /**
     * Configuration block(s) with Ownership Controls rules. Detailed below.
     * 
     */
    @Export(name="rule", refs={BucketOwnershipControlsRule.class}, tree="[0]")
    private Output<BucketOwnershipControlsRule> rule;

    /**
     * @return Configuration block(s) with Ownership Controls rules. Detailed below.
     * 
     */
    public Output<BucketOwnershipControlsRule> rule() {
        return this.rule;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BucketOwnershipControls(String name) {
        this(name, BucketOwnershipControlsArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BucketOwnershipControls(String name, BucketOwnershipControlsArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BucketOwnershipControls(String name, BucketOwnershipControlsArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketOwnershipControls:BucketOwnershipControls", name, args == null ? BucketOwnershipControlsArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BucketOwnershipControls(String name, Output<String> id, @Nullable BucketOwnershipControlsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:s3/bucketOwnershipControls:BucketOwnershipControls", name, state, makeResourceOptions(options, id));
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
    public static BucketOwnershipControls get(String name, Output<String> id, @Nullable BucketOwnershipControlsState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BucketOwnershipControls(name, id, state, options);
    }
}
