// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.guardduty;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.guardduty.ThreatIntelSetArgs;
import com.pulumi.aws.guardduty.inputs.ThreatIntelSetState;
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
 * Provides a resource to manage a GuardDuty ThreatIntelSet.
 * 
 * &gt; **Note:** Currently in GuardDuty, users from member accounts cannot upload and further manage ThreatIntelSets. ThreatIntelSets that are uploaded by the primary account are imposed on GuardDuty functionality in its member accounts. See the [GuardDuty API Documentation](https://docs.aws.amazon.com/guardduty/latest/ug/create-threat-intel-set.html)
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.guardduty.Detector;
 * import com.pulumi.aws.guardduty.DetectorArgs;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketAclV2;
 * import com.pulumi.aws.s3.BucketAclV2Args;
 * import com.pulumi.aws.s3.BucketObjectv2;
 * import com.pulumi.aws.s3.BucketObjectv2Args;
 * import com.pulumi.aws.guardduty.ThreatIntelSet;
 * import com.pulumi.aws.guardduty.ThreatIntelSetArgs;
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
 *         var bucketAcl = new BucketAclV2(&#34;bucketAcl&#34;, BucketAclV2Args.builder()        
 *             .bucket(bucket.id())
 *             .acl(&#34;private&#34;)
 *             .build());
 * 
 *         var myThreatIntelSetBucketObjectv2 = new BucketObjectv2(&#34;myThreatIntelSetBucketObjectv2&#34;, BucketObjectv2Args.builder()        
 *             .acl(&#34;public-read&#34;)
 *             .content(&#34;&#34;&#34;
 * 10.0.0.0/8
 *             &#34;&#34;&#34;)
 *             .bucket(bucket.id())
 *             .key(&#34;MyThreatIntelSet&#34;)
 *             .build());
 * 
 *         var myThreatIntelSetThreatIntelSet = new ThreatIntelSet(&#34;myThreatIntelSetThreatIntelSet&#34;, ThreatIntelSetArgs.builder()        
 *             .activate(true)
 *             .detectorId(primary.id())
 *             .format(&#34;TXT&#34;)
 *             .location(Output.tuple(myThreatIntelSetBucketObjectv2.bucket(), myThreatIntelSetBucketObjectv2.key()).applyValue(values -&gt; {
 *                 var bucket = values.t1;
 *                 var key = values.t2;
 *                 return String.format(&#34;https://s3.amazonaws.com/%s/%s&#34;, bucket,key);
 *             }))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import GuardDuty ThreatIntelSet using the primary GuardDuty detector ID and ThreatIntelSetID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:guardduty/threatIntelSet:ThreatIntelSet MyThreatIntelSet 00b00fd5aecc0ab60a708659477e9617:123456789012
 * ```
 * 
 */
@ResourceType(type="aws:guardduty/threatIntelSet:ThreatIntelSet")
public class ThreatIntelSet extends com.pulumi.resources.CustomResource {
    /**
     * Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * 
     */
    @Export(name="activate", refs={Boolean.class}, tree="[0]")
    private Output<Boolean> activate;

    /**
     * @return Specifies whether GuardDuty is to start using the uploaded ThreatIntelSet.
     * 
     */
    public Output<Boolean> activate() {
        return this.activate;
    }
    /**
     * Amazon Resource Name (ARN) of the GuardDuty ThreatIntelSet.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the GuardDuty ThreatIntelSet.
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
     * The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
     * 
     */
    @Export(name="format", refs={String.class}, tree="[0]")
    private Output<String> format;

    /**
     * @return The format of the file that contains the ThreatIntelSet. Valid values: `TXT` | `STIX` | `OTX_CSV` | `ALIEN_VAULT` | `PROOF_POINT` | `FIRE_EYE`
     * 
     */
    public Output<String> format() {
        return this.format;
    }
    /**
     * The URI of the file that contains the ThreatIntelSet.
     * 
     */
    @Export(name="location", refs={String.class}, tree="[0]")
    private Output<String> location;

    /**
     * @return The URI of the file that contains the ThreatIntelSet.
     * 
     */
    public Output<String> location() {
        return this.location;
    }
    /**
     * The friendly name to identify the ThreatIntelSet.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The friendly name to identify the ThreatIntelSet.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ThreatIntelSet(String name) {
        this(name, ThreatIntelSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ThreatIntelSet(String name, ThreatIntelSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ThreatIntelSet(String name, ThreatIntelSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/threatIntelSet:ThreatIntelSet", name, args == null ? ThreatIntelSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ThreatIntelSet(String name, Output<String> id, @Nullable ThreatIntelSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:guardduty/threatIntelSet:ThreatIntelSet", name, state, makeResourceOptions(options, id));
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
    public static ThreatIntelSet get(String name, Output<String> id, @Nullable ThreatIntelSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ThreatIntelSet(name, id, state, options);
    }
}
