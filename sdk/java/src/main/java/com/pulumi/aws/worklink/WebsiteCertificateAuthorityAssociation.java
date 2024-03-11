// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.worklink;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.worklink.WebsiteCertificateAuthorityAssociationArgs;
import com.pulumi.aws.worklink.inputs.WebsiteCertificateAuthorityAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.worklink.Fleet;
 * import com.pulumi.aws.worklink.FleetArgs;
 * import com.pulumi.aws.worklink.WebsiteCertificateAuthorityAssociation;
 * import com.pulumi.aws.worklink.WebsiteCertificateAuthorityAssociationArgs;
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
 *         var example = new Fleet(&#34;example&#34;, FleetArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .build());
 * 
 *         var test = new WebsiteCertificateAuthorityAssociation(&#34;test&#34;, WebsiteCertificateAuthorityAssociationArgs.builder()        
 *             .fleetArn(testAwsWorklinkFleet.arn())
 *             .certificate(StdFunctions.file(FileArgs.builder()
 *                 .input(&#34;certificate.pem&#34;)
 *                 .build()).result())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import WorkLink Website Certificate Authority using `FLEET-ARN,WEBSITE-CA-ID`. For example:
 * 
 * ```sh
 * $ pulumi import aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation example arn:aws:worklink::123456789012:fleet/example,abcdefghijk
 * ```
 * 
 */
@ResourceType(type="aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation")
public class WebsiteCertificateAuthorityAssociation extends com.pulumi.resources.CustomResource {
    /**
     * The root certificate of the Certificate Authority.
     * 
     */
    @Export(name="certificate", refs={String.class}, tree="[0]")
    private Output<String> certificate;

    /**
     * @return The root certificate of the Certificate Authority.
     * 
     */
    public Output<String> certificate() {
        return this.certificate;
    }
    /**
     * The certificate name to display.
     * 
     */
    @Export(name="displayName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> displayName;

    /**
     * @return The certificate name to display.
     * 
     */
    public Output<Optional<String>> displayName() {
        return Codegen.optional(this.displayName);
    }
    /**
     * The ARN of the fleet.
     * 
     */
    @Export(name="fleetArn", refs={String.class}, tree="[0]")
    private Output<String> fleetArn;

    /**
     * @return The ARN of the fleet.
     * 
     */
    public Output<String> fleetArn() {
        return this.fleetArn;
    }
    /**
     * A unique identifier for the Certificate Authority.
     * 
     */
    @Export(name="websiteCaId", refs={String.class}, tree="[0]")
    private Output<String> websiteCaId;

    /**
     * @return A unique identifier for the Certificate Authority.
     * 
     */
    public Output<String> websiteCaId() {
        return this.websiteCaId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public WebsiteCertificateAuthorityAssociation(String name) {
        this(name, WebsiteCertificateAuthorityAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public WebsiteCertificateAuthorityAssociation(String name, WebsiteCertificateAuthorityAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public WebsiteCertificateAuthorityAssociation(String name, WebsiteCertificateAuthorityAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation", name, args == null ? WebsiteCertificateAuthorityAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private WebsiteCertificateAuthorityAssociation(String name, Output<String> id, @Nullable WebsiteCertificateAuthorityAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:worklink/websiteCertificateAuthorityAssociation:WebsiteCertificateAuthorityAssociation", name, state, makeResourceOptions(options, id));
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
    public static WebsiteCertificateAuthorityAssociation get(String name, Output<String> id, @Nullable WebsiteCertificateAuthorityAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new WebsiteCertificateAuthorityAssociation(name, id, state, options);
    }
}
