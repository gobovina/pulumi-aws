// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.DelegationSetArgs;
import com.pulumi.aws.route53.inputs.DelegationSetState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a [Route53 Delegation Set](https://docs.aws.amazon.com/Route53/latest/APIReference/API-actions-by-function.html#actions-by-function-reusable-delegation-sets) resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.DelegationSet;
 * import com.pulumi.aws.route53.DelegationSetArgs;
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
 *         var main = new DelegationSet(&#34;main&#34;, DelegationSetArgs.builder()        
 *             .referenceName(&#34;DynDNS&#34;)
 *             .build());
 * 
 *         var primary = new Zone(&#34;primary&#34;, ZoneArgs.builder()        
 *             .name(&#34;mydomain.com&#34;)
 *             .delegationSetId(main.id())
 *             .build());
 * 
 *         var secondary = new Zone(&#34;secondary&#34;, ZoneArgs.builder()        
 *             .name(&#34;coolcompany.io&#34;)
 *             .delegationSetId(main.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Route53 Delegation Sets using the delegation set `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:route53/delegationSet:DelegationSet set1 N1PA6795SAMPLE
 * ```
 * 
 */
@ResourceType(type="aws:route53/delegationSet:DelegationSet")
public class DelegationSet extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) of the Delegation Set.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) of the Delegation Set.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * A list of authoritative name servers for the hosted zone
     * (effectively a list of NS records).
     * 
     */
    @Export(name="nameServers", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> nameServers;

    /**
     * @return A list of authoritative name servers for the hosted zone
     * (effectively a list of NS records).
     * 
     */
    public Output<List<String>> nameServers() {
        return this.nameServers;
    }
    /**
     * This is a reference name used in Caller Reference
     * (helpful for identifying single delegation set amongst others)
     * 
     */
    @Export(name="referenceName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> referenceName;

    /**
     * @return This is a reference name used in Caller Reference
     * (helpful for identifying single delegation set amongst others)
     * 
     */
    public Output<Optional<String>> referenceName() {
        return Codegen.optional(this.referenceName);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DelegationSet(String name) {
        this(name, DelegationSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DelegationSet(String name, @Nullable DelegationSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DelegationSet(String name, @Nullable DelegationSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/delegationSet:DelegationSet", name, args == null ? DelegationSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DelegationSet(String name, Output<String> id, @Nullable DelegationSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/delegationSet:DelegationSet", name, state, makeResourceOptions(options, id));
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
    public static DelegationSet get(String name, Output<String> id, @Nullable DelegationSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DelegationSet(name, id, state, options);
    }
}
