// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.SecurityGroupAssociationArgs;
import com.pulumi.aws.ec2.inputs.SecurityGroupAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to create an association between a VPC endpoint and a security group.
 * 
 * &gt; **NOTE on VPC Endpoints and VPC Endpoint Security Group Associations:** The provider provides
 * both a standalone VPC Endpoint Security Group Association (an association between a VPC endpoint
 * and a single `security_group_id`) and a VPC Endpoint resource with a `security_group_ids`
 * attribute. Do not use the same security group ID in both a VPC Endpoint resource and a VPC Endpoint Security
 * Group Association resource. Doing so will cause a conflict of associations and will overwrite the association.
 * 
 * ## Example Usage
 * 
 * Basic usage:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ec2.SecurityGroupAssociation;
 * import com.pulumi.aws.ec2.SecurityGroupAssociationArgs;
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
 *         var sgEc2 = new SecurityGroupAssociation(&#34;sgEc2&#34;, SecurityGroupAssociationArgs.builder()        
 *             .vpcEndpointId(ec2.id())
 *             .securityGroupId(sg.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:ec2/securityGroupAssociation:SecurityGroupAssociation")
public class SecurityGroupAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Whether this association should replace the association with the VPC&#39;s default security group that is created when no security groups are specified during VPC endpoint creation. At most 1 association per-VPC endpoint should be configured with `replace_default_association = true`.
     * 
     */
    @Export(name="replaceDefaultAssociation", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> replaceDefaultAssociation;

    /**
     * @return Whether this association should replace the association with the VPC&#39;s default security group that is created when no security groups are specified during VPC endpoint creation. At most 1 association per-VPC endpoint should be configured with `replace_default_association = true`.
     * 
     */
    public Output<Optional<Boolean>> replaceDefaultAssociation() {
        return Codegen.optional(this.replaceDefaultAssociation);
    }
    /**
     * The ID of the security group to be associated with the VPC endpoint.
     * 
     */
    @Export(name="securityGroupId", refs={String.class}, tree="[0]")
    private Output<String> securityGroupId;

    /**
     * @return The ID of the security group to be associated with the VPC endpoint.
     * 
     */
    public Output<String> securityGroupId() {
        return this.securityGroupId;
    }
    /**
     * The ID of the VPC endpoint with which the security group will be associated.
     * 
     */
    @Export(name="vpcEndpointId", refs={String.class}, tree="[0]")
    private Output<String> vpcEndpointId;

    /**
     * @return The ID of the VPC endpoint with which the security group will be associated.
     * 
     */
    public Output<String> vpcEndpointId() {
        return this.vpcEndpointId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SecurityGroupAssociation(String name) {
        this(name, SecurityGroupAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SecurityGroupAssociation(String name, SecurityGroupAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SecurityGroupAssociation(String name, SecurityGroupAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/securityGroupAssociation:SecurityGroupAssociation", name, args == null ? SecurityGroupAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SecurityGroupAssociation(String name, Output<String> id, @Nullable SecurityGroupAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/securityGroupAssociation:SecurityGroupAssociation", name, state, makeResourceOptions(options, id));
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
    public static SecurityGroupAssociation get(String name, Output<String> id, @Nullable SecurityGroupAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SecurityGroupAssociation(name, id, state, options);
    }
}
