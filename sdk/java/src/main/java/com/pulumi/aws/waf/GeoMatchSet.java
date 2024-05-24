// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.waf;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.waf.GeoMatchSetArgs;
import com.pulumi.aws.waf.inputs.GeoMatchSetState;
import com.pulumi.aws.waf.outputs.GeoMatchSetGeoMatchConstraint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a WAF Geo Match Set Resource
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
 * import com.pulumi.aws.waf.GeoMatchSet;
 * import com.pulumi.aws.waf.GeoMatchSetArgs;
 * import com.pulumi.aws.waf.inputs.GeoMatchSetGeoMatchConstraintArgs;
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
 *         var geoMatchSet = new GeoMatchSet("geoMatchSet", GeoMatchSetArgs.builder()
 *             .name("geo_match_set")
 *             .geoMatchConstraints(            
 *                 GeoMatchSetGeoMatchConstraintArgs.builder()
 *                     .type("Country")
 *                     .value("US")
 *                     .build(),
 *                 GeoMatchSetGeoMatchConstraintArgs.builder()
 *                     .type("Country")
 *                     .value("CA")
 *                     .build())
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
 * Using `pulumi import`, import WAF Geo Match Set using their ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:waf/geoMatchSet:GeoMatchSet example a1b2c3d4-d5f6-7777-8888-9999aaaabbbbcccc
 * ```
 * 
 */
@ResourceType(type="aws:waf/geoMatchSet:GeoMatchSet")
public class GeoMatchSet extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN)
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN)
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
     * 
     */
    @Export(name="geoMatchConstraints", refs={List.class,GeoMatchSetGeoMatchConstraint.class}, tree="[0,1]")
    private Output</* @Nullable */ List<GeoMatchSetGeoMatchConstraint>> geoMatchConstraints;

    /**
     * @return The GeoMatchConstraint objects which contain the country that you want AWS WAF to search for.
     * 
     */
    public Output<Optional<List<GeoMatchSetGeoMatchConstraint>>> geoMatchConstraints() {
        return Codegen.optional(this.geoMatchConstraints);
    }
    /**
     * The name or description of the GeoMatchSet.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name or description of the GeoMatchSet.
     * 
     */
    public Output<String> name() {
        return this.name;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GeoMatchSet(String name) {
        this(name, GeoMatchSetArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GeoMatchSet(String name, @Nullable GeoMatchSetArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GeoMatchSet(String name, @Nullable GeoMatchSetArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/geoMatchSet:GeoMatchSet", name, args == null ? GeoMatchSetArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GeoMatchSet(String name, Output<String> id, @Nullable GeoMatchSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:waf/geoMatchSet:GeoMatchSet", name, state, makeResourceOptions(options, id));
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
    public static GeoMatchSet get(String name, Output<String> id, @Nullable GeoMatchSetState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GeoMatchSet(name, id, state, options);
    }
}
