// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.guardduty.IPSetArgs;
import com.pulumi.aws.guardduty.inputs.IPSetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to manage a GuardDuty IPSet.
 * 
 * &gt; **Note:** Currently in GuardDuty, users from member accounts cannot upload and further manage IPSets. IPSets that are uploaded by the primary account are imposed on GuardDuty functionality in its member accounts. See the [GuardDuty API Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/create-ip-set.html)
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
 * import com.pulumi.aws.guardduty.Detector;
 * import com.pulumi.aws.guardduty.DetectorArgs;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.s3.BucketObjectv2Args;
 * import com.pulumi.aws.guardduty.IPSet;
 * import com.pulumi.aws.guardduty.IPSetArgs;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
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
 *         var primary = new Detector(&#34;primary&#34;, DetectorArgs.builder()        
 *             .enable(true)
 *             .build());
 * 
 *         var bucket = new BucketV2(&#34;bucket&#34;);
 * 
 *         var myIPSet = new BucketObjectv2(&#34;myIPSet&#34;, BucketObjectv2Args.builder()        
 *             .content(&#34;&#34;&#34;
 * 10.0.0.0/8
 *             &#34;&#34;&#34;)
 *             .bucket(bucket.id())
 *             .key(&#34;MyIPSet&#34;)
 *             .build());
 * 
 *         var example = new IPSet(&#34;example&#34;, IPSetArgs.builder()        
 *             .activate(true)
 *             .detectorId(primary.id())
 *             .format(&#34;TXT&#34;)
 *             .location(Output.tuple(myIPSet.bucket(), myIPSet.key()).applyValue(values -&gt; {
 *                 var bucket = values.t1;
 *                 var key = values.t2;
 *                 return String.format(&#34;https://s3.amazonaws.com/%s/%s&#34;, bucket,key);
 *             }))
 *             .name(&#34;MyIPSet&#34;)
 *             .build());
 * 
 *         var bucketAcl = new BucketAclV2(&#34;bucketAcl&#34;, BucketAclV2Args.builder()        
 *             .bucket(bucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import GuardDuty IPSet using the primary GuardDuty detector ID and IPSet ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:guardduty/iPSet:IPSet MyIPSet 00b00fd5aecc0ab60a708659477e9617:123456789012
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/iPSet:IPSet")
public class IPSet extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether GuardDuty is to start using the uploaded IPSet.
     * 
     */
    @Export(name="activate", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> activate;

    /**
     * @return Specifies whether GuardDuty is to start using the uploaded IPSet.
     * 
     */
    public Output<Boolean> activate() {
        return this.activate;
    }
    /**
     * Amazon Resource Name (ARN) of the GuardDuty IPSet.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the GuardDuty IPSet.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The detector ID of the GuardDuty.
     * 
     */
    @Export(name="detectorId", refs={String.class}, tree="[0]")
    private Output<String> detectorId;

    /**
     * @return The detector ID of the GuardDuty.
     * 
     */
    public Output<String> detectorId() {
        return this.detectorId;
    }
    /**
     * The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
     * 
     */
    @Export(name="format", refs={String.class}, tree="[0]")
    private Output<String> format;

    /**
     * @return The format of the file that contains the IPSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
     * 
     */
    public Output<String> format() {
        return this.format;
    }
    /**
     * The URI of the file that contains the IPSet.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The URI of the file that contains the IPSet.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The friendly name to identify the IPSet.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The friendly name to identify the IPSet.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. .If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public IPSet(String name) {
        this(name, IPSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public IPSet(String name, IPSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public IPSet(String name, IPSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/iPSet:IPSet", name, args == null ? IPSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private IPSet(String name, Output<String> id, @Nullable IPSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/iPSet:IPSet", name, state, makeResourceOptions(options, id));
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
    public static IPSet get(String name, Output<String> id, @Nullable IPSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new IPSet(name, id, state, options);
    }
}
