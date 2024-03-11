// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.quicksight;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.quicksight.FolderMembershipArgs;
import com.pulumi.aws.quicksight.inputs.FolderMembershipState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS QuickSight Folder Membership.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.quicksight.FolderMembership;
 * import com.pulumi.aws.quicksight.FolderMembershipArgs;
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
 *         var example = new FolderMembership(&#34;example&#34;, FolderMembershipArgs.builder()        
 *             .folderId(exampleAwsQuicksightFolder.folderId())
 *             .memberType(&#34;DATASET&#34;)
 *             .memberId(exampleAwsQuicksightDataSet.dataSetId())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import QuickSight Folder Membership using the AWS account ID, folder ID, member type, and member ID separated by commas (`,`). For example:
 * 
 * ```sh
 * $ pulumi import aws:quicksight/folderMembership:FolderMembership example 123456789012,example-folder,DATASET,example-dataset
 * ```
 * 
 */
@ResourceType(type="aws:quicksight/folderMembership:FolderMembership")
public class FolderMembership extends com.pulumi.resources.CustomResource {
    /**
     * AWS account ID.
     * 
     */
    @Export(name="awsAccountId", refs={String.class}, tree="[0]")
    private Output<String> awsAccountId;

    /**
     * @return AWS account ID.
     * 
     */
    public Output<String> awsAccountId() {
        return this.awsAccountId;
    }
    /**
     * Identifier for the folder.
     * 
     */
    @Export(name="folderId", refs={String.class}, tree="[0]")
    private Output<String> folderId;

    /**
     * @return Identifier for the folder.
     * 
     */
    public Output<String> folderId() {
        return this.folderId;
    }
    /**
     * ID of the asset (the dashboard, analysis, or dataset).
     * 
     */
    @Export(name="memberId", refs={String.class}, tree="[0]")
    private Output<String> memberId;

    /**
     * @return ID of the asset (the dashboard, analysis, or dataset).
     * 
     */
    public Output<String> memberId() {
        return this.memberId;
    }
    /**
     * Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="memberType", refs={String.class}, tree="[0]")
    private Output<String> memberType;

    /**
     * @return Type of the member. Valid values are `ANALYSIS`, `DASHBOARD`, and `DATASET`.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> memberType() {
        return this.memberType;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public FolderMembership(String name) {
        this(name, FolderMembershipArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public FolderMembership(String name, FolderMembershipArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public FolderMembership(String name, FolderMembershipArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/folderMembership:FolderMembership", name, args == null ? FolderMembershipArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private FolderMembership(String name, Output<String> id, @Nullable FolderMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:quicksight/folderMembership:FolderMembership", name, state, makeResourceOptions(options, id));
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
    public static FolderMembership get(String name, Output<String> id, @Nullable FolderMembershipState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new FolderMembership(name, id, state, options);
    }
}
