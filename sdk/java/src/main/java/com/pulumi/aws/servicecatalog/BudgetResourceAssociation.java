// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.servicecatalog;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.servicecatalog.BudgetResourceAssociationArgs;
import com.pulumi.aws.servicecatalog.inputs.BudgetResourceAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Manages a Service Catalog Budget Resource Association.
 * 
 * &gt; **Tip:** A &#34;resource&#34; is either a Service Catalog portfolio or product.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.servicecatalog.BudgetResourceAssociation;
 * import com.pulumi.aws.servicecatalog.BudgetResourceAssociationArgs;
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
 *         var example = new BudgetResourceAssociation("example", BudgetResourceAssociationArgs.builder()
 *             .budgetName("budget-pjtvyakdlyo3m")
 *             .resourceId("prod-dnigbtea24ste")
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
 * Using `pulumi import`, import `aws_servicecatalog_budget_resource_association` using the budget name and resource ID. For example:
 * 
 * ```sh
 * $ pulumi import aws:servicecatalog/budgetResourceAssociation:BudgetResourceAssociation example budget-pjtvyakdlyo3m:prod-dnigbtea24ste
 * ```
 * 
 */
@ResourceType(type="aws:servicecatalog/budgetResourceAssociation:BudgetResourceAssociation")
public class BudgetResourceAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Budget name.
     * 
     */
    @Export(name="budgetName", refs={String.class}, tree="[0]")
    private Output<String> budgetName;

    /**
     * @return Budget name.
     * 
     */
    public Output<String> budgetName() {
        return this.budgetName;
    }
    /**
     * Resource identifier.
     * 
     */
    @Export(name="resourceId", refs={String.class}, tree="[0]")
    private Output<String> resourceId;

    /**
     * @return Resource identifier.
     * 
     */
    public Output<String> resourceId() {
        return this.resourceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public BudgetResourceAssociation(String name) {
        this(name, BudgetResourceAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public BudgetResourceAssociation(String name, BudgetResourceAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public BudgetResourceAssociation(String name, BudgetResourceAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/budgetResourceAssociation:BudgetResourceAssociation", name, args == null ? BudgetResourceAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private BudgetResourceAssociation(String name, Output<String> id, @Nullable BudgetResourceAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:servicecatalog/budgetResourceAssociation:BudgetResourceAssociation", name, state, makeResourceOptions(options, id));
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
    public static BudgetResourceAssociation get(String name, Output<String> id, @Nullable BudgetResourceAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new BudgetResourceAssociation(name, id, state, options);
    }
}
