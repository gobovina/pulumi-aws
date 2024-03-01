// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.ZoneArgs;
import com.pulumi.aws.route53.inputs.ZoneState;
import com.pulumi.aws.route53.outputs.ZoneVpc;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages a Route53 Hosted Zone. For managing Domain Name System Security Extensions (DNSSEC), see the `aws.route53.KeySigningKey` and `aws.route53.HostedZoneDnsSec` resources.
 * 
 * ## Example Usage
 * ### Public Zone
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.Zone;
 * import com.pulumi.aws.route53.ZoneArgs;
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
 *         var primary = new Zone(&#34;primary&#34;, ZoneArgs.builder()        
 *             .name(&#34;example.com&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Public Subdomain Zone
 * 
 * For use in subdomains, note that you need to create a
 * `aws.route53.Record` of type `NS` as well as the subdomain
 * zone.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.Zone;
 * import com.pulumi.aws.route53.ZoneArgs;
 * import com.pulumi.aws.route53.Record;
 * import com.pulumi.aws.route53.RecordArgs;
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
 *         var main = new Zone(&#34;main&#34;, ZoneArgs.builder()        
 *             .name(&#34;example.com&#34;)
 *             .build());
 * 
 *         var dev = new Zone(&#34;dev&#34;, ZoneArgs.builder()        
 *             .name(&#34;dev.example.com&#34;)
 *             .tags(Map.of(&#34;Environment&#34;, &#34;dev&#34;))
 *             .build());
 * 
 *         var dev_ns = new Record(&#34;dev-ns&#34;, RecordArgs.builder()        
 *             .zoneId(main.zoneId())
 *             .name(&#34;dev.example.com&#34;)
 *             .type(&#34;NS&#34;)
 *             .ttl(&#34;30&#34;)
 *             .records(dev.nameServers())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Private Zone
 * 
 * &gt; **NOTE:** This provider provides both exclusive VPC associations defined in-line in this resource via `vpc` configuration blocks and a separate ` Zone VPC Association resource. At this time, you cannot use in-line VPC associations in conjunction with any  `aws.route53.ZoneAssociation`  resources with the same zone ID otherwise it will cause a perpetual difference in plan output. You can optionally use [ `ignoreChanges` ](https://www.pulumi.com/docs/intro/concepts/programming-model/#ignorechanges) to manage additional associations via the  `aws.route53.ZoneAssociation` resource.
 * 
 * &gt; **NOTE:** Private zones require at least one VPC association at all times.
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.Zone;
 * import com.pulumi.aws.route53.ZoneArgs;
 * import com.pulumi.aws.route53.inputs.ZoneVpcArgs;
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
 *         var private_ = new Zone(&#34;private&#34;, ZoneArgs.builder()        
 *             .name(&#34;example.com&#34;)
 *             .vpcs(ZoneVpcArgs.builder()
 *                 .vpcId(example.id())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Route53 Zones using the zone `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:route53/zone:Zone myzone Z1D633PJN98FT9
 * ```
 * 
 */
@ResourceType(type="aws:route53/zone:Zone")
public class Zone extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Hosted Zone.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Hosted Zone.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A comment for the hosted zone. Defaults to &#39;Managed by Pulumi&#39;.
     * 
     */
    @Export(name="comment", refs={String.class}, tree="[0]")
    private Output<String> comment;

    /**
     * @return A comment for the hosted zone. Defaults to &#39;Managed by Pulumi&#39;.
     * 
     */
    public Output<String> comment() {
        return this.comment;
    }
    /**
     * The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
     * 
     */
    @Export(name="delegationSetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> delegationSetId;

    /**
     * @return The ID of the reusable delegation set whose NS records you want to assign to the hosted zone. Conflicts with `vpc` as delegation sets can only be used for public zones.
     * 
     */
    public Output<Optional<String>> delegationSetId() {
        return Codegen.optional(this.delegationSetId);
    }
    /**
     * Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
     * 
     */
    @Export(name="forceDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> forceDestroy;

    /**
     * @return Whether to destroy all records (possibly managed outside of this provider) in the zone when destroying the zone.
     * 
     */
    public Output<Optional<Boolean>> forceDestroy() {
        return Codegen.optional(this.forceDestroy);
    }
    /**
     * This is the name of the hosted zone.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return This is the name of the hosted zone.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * A list of name servers in associated (or default) delegation set.
     * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
     * 
     */
    @Export(name="nameServers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> nameServers;

    /**
     * @return A list of name servers in associated (or default) delegation set.
     * Find more about delegation sets in [AWS docs](https://docs.aws.amazon.com/Route53/latest/APIReference/actions-on-reusable-delegation-sets.html).
     * 
     */
    public Output<List<String>> nameServers() {
        return this.nameServers;
    }
    /**
     * The Route 53 name server that created the SOA record.
     * 
     */
    @Export(name="primaryNameServer", refs={String.class}, tree="[0]")
    private Output<String> primaryNameServer;

    /**
     * @return The Route 53 name server that created the SOA record.
     * 
     */
    public Output<String> primaryNameServer() {
        return this.primaryNameServer;
    }
    /**
     * A mapping of tags to assign to the zone. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the zone. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     * Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegation_set_id` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     * 
     */
    @Export(name="vpcs", refs={List.class,ZoneVpc.class}, tree="[0,1]")
    private Output</* @Nullable */ List<ZoneVpc>> vpcs;

    /**
     * @return Configuration block(s) specifying VPC(s) to associate with a private hosted zone. Conflicts with the `delegation_set_id` argument in this resource and any `aws.route53.ZoneAssociation` resource specifying the same zone ID. Detailed below.
     * 
     */
    public Output<Optional<List<ZoneVpc>>> vpcs() {
        return Codegen.optional(this.vpcs);
    }
    /**
     * The Hosted Zone ID. This can be referenced by zone records.
     * 
     */
    @Export(name="zoneId", refs={String.class}, tree="[0]")
    private Output<String> zoneId;

    /**
     * @return The Hosted Zone ID. This can be referenced by zone records.
     * 
     */
    public Output<String> zoneId() {
        return this.zoneId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Zone(String name) {
        this(name, ZoneArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Zone(String name, @Nullable ZoneArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Zone(String name, @Nullable ZoneArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/zone:Zone", name, args == null ? ZoneArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Zone(String name, Output<String> id, @Nullable ZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/zone:Zone", name, state, makeResourceOptions(options, id));
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
    public static Zone get(String name, Output<String> id, @Nullable ZoneState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Zone(name, id, state, options);
    }
}
