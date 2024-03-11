// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpcEndpointServiceAllowedPrincipleArgs;
import com.pulumi.aws.ec2.inputs.VpcEndpointServiceAllowedPrincipleState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a resource to allow a principal to discover a VPC endpoint service.
 * 
 * &gt; **NOTE on VPC Endpoint Services and VPC Endpoint Service Allowed Principals:** This provider provides
 * both a standalone VPC Endpoint Service Allowed Principal resource
 * and a VPC Endpoint Service resource with an `allowed_principals` attribute. Do not use the same principal ARN in both
 * a VPC Endpoint Service resource and a VPC Endpoint Service Allowed Principal resource. Doing so will cause a conflict
 * and will overwrite the association.
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
 * import com.pulumi.aws.AwsFunctions;
 * import com.pulumi.aws.inputs.GetCallerIdentityArgs;
 * import com.pulumi.aws.ec2.VpcEndpointServiceAllowedPrinciple;
 * import com.pulumi.aws.ec2.VpcEndpointServiceAllowedPrincipleArgs;
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
 *         final var current = AwsFunctions.getCallerIdentity();
 * 
 *         var allowMeToFoo = new VpcEndpointServiceAllowedPrinciple(&#34;allowMeToFoo&#34;, VpcEndpointServiceAllowedPrincipleArgs.builder()        
 *             .vpcEndpointServiceId(foo.id())
 *             .principalArn(current.applyValue(getCallerIdentityResult -&gt; getCallerIdentityResult.arn()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 */
@ResourceType(type="aws:ec2/vpcEndpointServiceAllowedPrinciple:VpcEndpointServiceAllowedPrinciple")
public class VpcEndpointServiceAllowedPrinciple extends com.pulumi.resources.CustomResource {
    /**
     * The ARN of the principal to allow permissions.
     * 
     */
    @Export(name="principalArn", refs={String.class}, tree="[0]")
    private Output<String> principalArn;

    /**
     * @return The ARN of the principal to allow permissions.
     * 
     */
    public Output<String> principalArn() {
        return this.principalArn;
    }
    /**
     * The ID of the VPC endpoint service to allow permission.
     * 
     */
    @Export(name="vpcEndpointServiceId", refs={String.class}, tree="[0]")
    private Output<String> vpcEndpointServiceId;

    /**
     * @return The ID of the VPC endpoint service to allow permission.
     * 
     */
    public Output<String> vpcEndpointServiceId() {
        return this.vpcEndpointServiceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcEndpointServiceAllowedPrinciple(String name) {
        this(name, VpcEndpointServiceAllowedPrincipleArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpointServiceAllowedPrinciple(String name, VpcEndpointServiceAllowedPrincipleArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpointServiceAllowedPrinciple(String name, VpcEndpointServiceAllowedPrincipleArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointServiceAllowedPrinciple:VpcEndpointServiceAllowedPrinciple", name, args == null ? VpcEndpointServiceAllowedPrincipleArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcEndpointServiceAllowedPrinciple(String name, Output<String> id, @Nullable VpcEndpointServiceAllowedPrincipleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointServiceAllowedPrinciple:VpcEndpointServiceAllowedPrinciple", name, state, makeResourceOptions(options, id));
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
    public static VpcEndpointServiceAllowedPrinciple get(String name, Output<String> id, @Nullable VpcEndpointServiceAllowedPrincipleState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpointServiceAllowedPrinciple(name, id, state, options);
    }
}
