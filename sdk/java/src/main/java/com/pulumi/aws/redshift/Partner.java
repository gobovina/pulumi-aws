// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshift;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshift.PartnerArgs;
import com.pulumi.aws.redshift.inputs.PartnerState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Creates a new Amazon Redshift Partner Integration.
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
 * import com.pulumi.aws.redshift.Partner;
 * import com.pulumi.aws.redshift.PartnerArgs;
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
 *         var example = new Partner("example", PartnerArgs.builder()
 *             .clusterIdentifier(exampleAwsRedshiftCluster.id())
 *             .accountId(1234567910)
 *             .databaseName(exampleAwsRedshiftCluster.databaseName())
 *             .partnerName("example")
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
 * Using `pulumi import`, import Redshift usage limits using the `id`. For example:
 * 
 * ```sh
 * $ pulumi import aws:redshift/partner:Partner example 01234567910:cluster-example-id:example:example
 * ```
 * 
 */
@ResourceType(type="aws:redshift/partner:Partner")
public class Partner extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Web Services account ID that owns the cluster.
     * 
     */
    @Export(name="accountId", refs={String.class}, tree="[0]")
    private Output<String> accountId;

    /**
     * @return The Amazon Web Services account ID that owns the cluster.
     * 
     */
    public Output<String> accountId() {
        return this.accountId;
    }
    /**
     * The cluster identifier of the cluster that receives data from the partner.
     * 
     */
    @Export(name="clusterIdentifier", refs={String.class}, tree="[0]")
    private Output<String> clusterIdentifier;

    /**
     * @return The cluster identifier of the cluster that receives data from the partner.
     * 
     */
    public Output<String> clusterIdentifier() {
        return this.clusterIdentifier;
    }
    /**
     * The name of the database that receives data from the partner.
     * 
     */
    @Export(name="databaseName", refs={String.class}, tree="[0]")
    private Output<String> databaseName;

    /**
     * @return The name of the database that receives data from the partner.
     * 
     */
    public Output<String> databaseName() {
        return this.databaseName;
    }
    /**
     * The name of the partner that is authorized to send data.
     * 
     */
    @Export(name="partnerName", refs={String.class}, tree="[0]")
    private Output<String> partnerName;

    /**
     * @return The name of the partner that is authorized to send data.
     * 
     */
    public Output<String> partnerName() {
        return this.partnerName;
    }
    /**
     * (Optional) The partner integration status.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return (Optional) The partner integration status.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * (Optional) The status message provided by the partner.
     * 
     */
    @Export(name="statusMessage", refs={String.class}, tree="[0]")
    private Output<String> statusMessage;

    /**
     * @return (Optional) The status message provided by the partner.
     * 
     */
    public Output<String> statusMessage() {
        return this.statusMessage;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public Partner(String name) {
        this(name, PartnerArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public Partner(String name, PartnerArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public Partner(String name, PartnerArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/partner:Partner", name, args == null ? PartnerArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private Partner(String name, Output<String> id, @Nullable PartnerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshift/partner:Partner", name, state, makeResourceOptions(options, id));
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
    public static Partner get(String name, Output<String> id, @Nullable PartnerState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new Partner(name, id, state, options);
    }
}
