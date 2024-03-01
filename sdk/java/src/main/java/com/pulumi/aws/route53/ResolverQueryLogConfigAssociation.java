// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.route53;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.route53.ResolverQueryLogConfigAssociationArgs;
import com.pulumi.aws.route53.inputs.ResolverQueryLogConfigAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Route 53 Resolver query logging configuration association resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.route53.ResolverQueryLogConfigAssociation;
 * import com.pulumi.aws.route53.ResolverQueryLogConfigAssociationArgs;
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
 *         var example = new ResolverQueryLogConfigAssociation(&#34;example&#34;, ResolverQueryLogConfigAssociationArgs.builder()        
 *             .resolverQueryLogConfigId(exampleAwsRoute53ResolverQueryLogConfig.id())
 *             .resourceId(exampleAwsVpc.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import
 * 
 * Route 53 Resolver query logging configuration associations using the Route 53 Resolver query logging configuration association ID. For example:
 * 
 * ```sh
 *  $ pulumi import aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation example rqlca-b320624fef3c4d70
 * ```
 * 
 */
@ResourceType(type="aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation")
public class ResolverQueryLogConfigAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
     * 
     */
    @Export(name="resolverQueryLogConfigId", refs={String.class}, tree="[0]")
    private Output<String> resolverQueryLogConfigId;

    /**
     * @return The ID of the Route 53 Resolver query logging configuration that you want to associate a VPC with.
     * 
     */
    public Output<String> resolverQueryLogConfigId() {
        return this.resolverQueryLogConfigId;
    }
    /**
     * The ID of a VPC that you want this query logging configuration to log queries for.
     * 
     */
    @Export(name="resourceId", refs={String.class}, tree="[0]")
    private Output<String> resourceId;

    /**
     * @return The ID of a VPC that you want this query logging configuration to log queries for.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public ResolverQueryLogConfigAssociation(String name) {
        this(name, ResolverQueryLogConfigAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public ResolverQueryLogConfigAssociation(String name, ResolverQueryLogConfigAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public ResolverQueryLogConfigAssociation(String name, ResolverQueryLogConfigAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation", name, args == null ? ResolverQueryLogConfigAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private ResolverQueryLogConfigAssociation(String name, Output<String> id, @Nullable ResolverQueryLogConfigAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:route53/resolverQueryLogConfigAssociation:ResolverQueryLogConfigAssociation", name, state, makeResourceOptions(options, id));
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
    public static ResolverQueryLogConfigAssociation get(String name, Output<String> id, @Nullable ResolverQueryLogConfigAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new ResolverQueryLogConfigAssociation(name, id, state, options);
    }
}
