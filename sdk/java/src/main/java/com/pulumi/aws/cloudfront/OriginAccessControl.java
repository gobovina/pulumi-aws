// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudfront;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudfront.OriginAccessControlArgs;
import com.pulumi.aws.cloudfront.inputs.OriginAccessControlState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Manages an AWS CloudFront Origin Access Control, which is used by CloudFront Distributions with an Amazon S3 bucket as the origin.
 * 
 * Read more about Origin Access Control in the [CloudFront Developer Guide](https://docs.aws.amazon.com/AmazonCloudFront/latest/DeveloperGuide/private-content-restricting-access-to-s3.html).
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.cloudfront.OriginAccessControl;
 * import com.pulumi.aws.cloudfront.OriginAccessControlArgs;
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
 *         var example = new OriginAccessControl(&#34;example&#34;, OriginAccessControlArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .description(&#34;Example Policy&#34;)
 *             .originAccessControlOriginType(&#34;s3&#34;)
 *             .signingBehavior(&#34;always&#34;)
 *             .signingProtocol(&#34;sigv4&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CloudFront Origin Access Control using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:cloudfront/originAccessControl:OriginAccessControl example E327GJI25M56DG
 * ```
 * 
 */
@ResourceType(type="aws:cloudfront/originAccessControl:OriginAccessControl")
public class OriginAccessControl extends com.pulumi.resources.CustomResource {
    /**
     * The description of the Origin Access Control. Defaults to &#34;Managed by Pulumi&#34; if omitted.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> description;

    /**
     * @return The description of the Origin Access Control. Defaults to &#34;Managed by Pulumi&#34; if omitted.
     * 
     */
    public Output<Optional<String>> description() {
        return Codegen.optional(this.description);
    }
    /**
     * The current version of this Origin Access Control.
     * 
     */
    @Export(name="etag", refs={String.class}, tree="[0]")
    private Output<String> etag;

    /**
     * @return The current version of this Origin Access Control.
     * 
     */
    public Output<String> etag() {
        return this.etag;
    }
    /**
     * A name that identifies the Origin Access Control.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return A name that identifies the Origin Access Control.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The type of origin that this Origin Access Control is for. Valid values are `s3`, and `mediastore`.
     * 
     */
    @Export(name="originAccessControlOriginType", refs={String.class}, tree="[0]")
    private Output<String> originAccessControlOriginType;

    /**
     * @return The type of origin that this Origin Access Control is for. Valid values are `s3`, and `mediastore`.
     * 
     */
    public Output<String> originAccessControlOriginType() {
        return this.originAccessControlOriginType;
    }
    /**
     * Specifies which requests CloudFront signs. Specify `always` for the most common use case. Allowed values: `always`, `never`, and `no-override`.
     * 
     */
    @Export(name="signingBehavior", refs={String.class}, tree="[0]")
    private Output<String> signingBehavior;

    /**
     * @return Specifies which requests CloudFront signs. Specify `always` for the most common use case. Allowed values: `always`, `never`, and `no-override`.
     * 
     */
    public Output<String> signingBehavior() {
        return this.signingBehavior;
    }
    /**
     * Determines how CloudFront signs (authenticates) requests. The only valid value is `sigv4`.
     * 
     */
    @Export(name="signingProtocol", refs={String.class}, tree="[0]")
    private Output<String> signingProtocol;

    /**
     * @return Determines how CloudFront signs (authenticates) requests. The only valid value is `sigv4`.
     * 
     */
    public Output<String> signingProtocol() {
        return this.signingProtocol;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public OriginAccessControl(String name) {
        this(name, OriginAccessControlArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public OriginAccessControl(String name, OriginAccessControlArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public OriginAccessControl(String name, OriginAccessControlArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/originAccessControl:OriginAccessControl", name, args == null ? OriginAccessControlArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private OriginAccessControl(String name, Output<String> id, @Nullable OriginAccessControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudfront/originAccessControl:OriginAccessControl", name, state, makeResourceOptions(options, id));
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
    public static OriginAccessControl get(String name, Output<String> id, @Nullable OriginAccessControlState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new OriginAccessControl(name, id, state, options);
    }
}
