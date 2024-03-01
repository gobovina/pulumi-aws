// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.MainRouteTableAssociationArgs;
import com.pulumi.aws.ec2.inputs.MainRouteTableAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource for managing the main routing table of a VPC.
 * 
 * &gt; **NOTE:** **Do not** use both `aws.ec2.DefaultRouteTable` to manage a default route table **and** `aws.ec2.MainRouteTableAssociation` with the same VPC due to possible route conflicts. See aws.ec2.DefaultRouteTable documentation for more details.
 * For more information, see the Amazon VPC User Guide on [Route Tables][aws-route-tables]. For information about managing normal route tables in Pulumi, see [`aws.ec2.RouteTable`][tf-route-tables].
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.MainRouteTableAssociation;
 * import com.pulumi.aws.ec2.MainRouteTableAssociationArgs;
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
 *         var a = new MainRouteTableAssociation(&#34;a&#34;, MainRouteTableAssociationArgs.builder()        
 *             .vpcId(foo.id())
 *             .routeTableId(bar.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ## Notes
 * 
 * On VPC creation, the AWS API always creates an initial Main Route Table. This
 * resource records the ID of that Route Table under `original_route_table_id`.
 * The &#34;Delete&#34; action for a `main_route_table_association` consists of resetting
 * this original table as the Main Route Table for the VPC. You&#39;ll see this
 * additional Route Table in the AWS console; it must remain intact in order for
 * the `main_route_table_association` delete to work properly.
 * 
 */
@ResourceType(type="aws:ec2/mainRouteTableAssociation:MainRouteTableAssociation")
public class MainRouteTableAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Used internally, see **Notes** below
     * 
     */
    @Export(name="originalRouteTableId", refs={String.class}, tree="[0]")
    private Output<String> originalRouteTableId;

    /**
     * @return Used internally, see **Notes** below
     * 
     */
    public Output<String> originalRouteTableId() {
        return this.originalRouteTableId;
    }
    /**
     * The ID of the Route Table to set as the new
     * main route table for the target VPC
     * 
     */
    @Export(name="routeTableId", refs={String.class}, tree="[0]")
    private Output<String> routeTableId;

    /**
     * @return The ID of the Route Table to set as the new
     * main route table for the target VPC
     * 
     */
    public Output<String> routeTableId() {
        return this.routeTableId;
    }
    /**
     * The ID of the VPC whose main route table should be set
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return The ID of the VPC whose main route table should be set
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public MainRouteTableAssociation(String name) {
        this(name, MainRouteTableAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public MainRouteTableAssociation(String name, MainRouteTableAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public MainRouteTableAssociation(String name, MainRouteTableAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/mainRouteTableAssociation:MainRouteTableAssociation", name, args == null ? MainRouteTableAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private MainRouteTableAssociation(String name, Output<String> id, @Nullable MainRouteTableAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/mainRouteTableAssociation:MainRouteTableAssociation", name, state, makeResourceOptions(options, id));
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
    public static MainRouteTableAssociation get(String name, Output<String> id, @Nullable MainRouteTableAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new MainRouteTableAssociation(name, id, state, options);
    }
}
