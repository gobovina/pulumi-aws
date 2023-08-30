// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.synthetics;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.synthetics.GroupAssociationArgs;
import com.pulumi.aws.synthetics.inputs.GroupAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Synthetics Group Association resource.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.synthetics.GroupAssociation;
 * import com.pulumi.aws.synthetics.GroupAssociationArgs;
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
 *         var example = new GroupAssociation(&#34;example&#34;, GroupAssociationArgs.builder()        
 *             .groupName(aws_synthetics_group.example().name())
 *             .canaryArn(aws_synthetics_canary.example().arn())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import CloudWatch Synthetics Group Association using the `canary_arn,group_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:synthetics/groupAssociation:GroupAssociation example arn:aws:synthetics:us-west-2:123456789012:canary:tf-acc-test-abcd1234,examplename
 * ```
 * 
 */
@ResourceType(type="aws:synthetics/groupAssociation:GroupAssociation")
public class GroupAssociation extends com.pulumi.resources.CustomResource {
    /**
     * ARN of the canary.
     * 
     */
    @Export(name="canaryArn", refs={String.class}, tree="[0]")
    private Output<String> canaryArn;

    /**
     * @return ARN of the canary.
     * 
     */
    public Output<String> canaryArn() {
        return this.canaryArn;
    }
    @Export(name="groupArn", refs={String.class}, tree="[0]")
    private Output<String> groupArn;

    public Output<String> groupArn() {
        return this.groupArn;
    }
    /**
     * ID of the Group.
     * 
     */
    @Export(name="groupId", refs={String.class}, tree="[0]")
    private Output<String> groupId;

    /**
     * @return ID of the Group.
     * 
     */
    public Output<String> groupId() {
        return this.groupId;
    }
    /**
     * Name of the group that the canary will be associated with.
     * 
     */
    @Export(name="groupName", refs={String.class}, tree="[0]")
    private Output<String> groupName;

    /**
     * @return Name of the group that the canary will be associated with.
     * 
     */
    public Output<String> groupName() {
        return this.groupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public GroupAssociation(String name) {
        this(name, GroupAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public GroupAssociation(String name, GroupAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public GroupAssociation(String name, GroupAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:synthetics/groupAssociation:GroupAssociation", name, args == null ? GroupAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private GroupAssociation(String name, Output<String> id, @Nullable GroupAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:synthetics/groupAssociation:GroupAssociation", name, state, makeResourceOptions(options, id));
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
    public static GroupAssociation get(String name, Output<String> id, @Nullable GroupAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new GroupAssociation(name, id, state, options);
    }
}
