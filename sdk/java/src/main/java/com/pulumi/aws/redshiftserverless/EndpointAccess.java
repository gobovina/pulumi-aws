// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.redshiftserverless;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.redshiftserverless.EndpointAccessArgs;
import com.pulumi.aws.redshiftserverless.inputs.EndpointAccessState;
import com.pulumi.aws.redshiftserverless.outputs.EndpointAccessVpcEndpoint;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Creates a new Amazon Redshift Serverless Endpoint Access.
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
 * import com.pulumi.aws.redshiftserverless.EndpointAccess;
 * import com.pulumi.aws.redshiftserverless.EndpointAccessArgs;
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
 *         var example = new EndpointAccess("example", EndpointAccessArgs.builder()
 *             .endpointName("example")
 *             .workgroupName("example")
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
 * Using `pulumi import`, import Redshift Serverless Endpoint Access using the `endpoint_name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:redshiftserverless/endpointAccess:EndpointAccess example example
 * ```
 * 
 */
@ResourceType(type="aws:redshiftserverless/endpointAccess:EndpointAccess")
public class EndpointAccess extends com.pulumi.resources.CustomResource {
    /**
     * The DNS address of the VPC endpoint.
     * 
     */
    @Export(name="address", refs={String.class}, tree="[0]")
    private Output<String> address;

    /**
     * @return The DNS address of the VPC endpoint.
     * 
     */
    public Output<String> address() {
        return this.address;
    }
    /**
     * Amazon Resource Name (ARN) of the Redshift Serverless Endpoint Access.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return Amazon Resource Name (ARN) of the Redshift Serverless Endpoint Access.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The name of the endpoint.
     * 
     */
    @Export(name="endpointName", refs={String.class}, tree="[0]")
    private Output<String> endpointName;

    /**
     * @return The name of the endpoint.
     * 
     */
    public Output<String> endpointName() {
        return this.endpointName;
    }
    /**
     * The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     * 
     */
    @Export(name="ownerAccount", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> ownerAccount;

    /**
     * @return The owner Amazon Web Services account for the Amazon Redshift Serverless workgroup.
     * 
     */
    public Output<Optional<String>> ownerAccount() {
        return Codegen.optional(this.ownerAccount);
    }
    /**
     * The port that Amazon Redshift Serverless listens on.
     * 
     */
    @Export(name="port", refs={Integer.class}, tree="[0]")
    private Output<Integer> port;

    /**
     * @return The port that Amazon Redshift Serverless listens on.
     * 
     */
    public Output<Integer> port() {
        return this.port;
    }
    /**
     * An array of VPC subnet IDs to associate with the endpoint.
     * 
     */
    @Export(name="subnetIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> subnetIds;

    /**
     * @return An array of VPC subnet IDs to associate with the endpoint.
     * 
     */
    public Output<List<String>> subnetIds() {
        return this.subnetIds;
    }
    /**
     * The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
     * 
     */
    @Export(name="vpcEndpoints", refs={List.class,EndpointAccessVpcEndpoint.class}, tree="[0,1]")
    private Output<List<EndpointAccessVpcEndpoint>> vpcEndpoints;

    /**
     * @return The VPC endpoint or the Redshift Serverless workgroup. See `VPC Endpoint` below.
     * 
     */
    public Output<List<EndpointAccessVpcEndpoint>> vpcEndpoints() {
        return this.vpcEndpoints;
    }
    /**
     * An array of security group IDs to associate with the workgroup.
     * 
     */
    @Export(name="vpcSecurityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> vpcSecurityGroupIds;

    /**
     * @return An array of security group IDs to associate with the workgroup.
     * 
     */
    public Output<List<String>> vpcSecurityGroupIds() {
        return this.vpcSecurityGroupIds;
    }
    /**
     * The name of the workgroup.
     * 
     */
    @Export(name="workgroupName", refs={String.class}, tree="[0]")
    private Output<String> workgroupName;

    /**
     * @return The name of the workgroup.
     * 
     */
    public Output<String> workgroupName() {
        return this.workgroupName;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EndpointAccess(String name) {
        this(name, EndpointAccessArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EndpointAccess(String name, EndpointAccessArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EndpointAccess(String name, EndpointAccessArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshiftserverless/endpointAccess:EndpointAccess", name, args == null ? EndpointAccessArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EndpointAccess(String name, Output<String> id, @Nullable EndpointAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:redshiftserverless/endpointAccess:EndpointAccess", name, state, makeResourceOptions(options, id));
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
    public static EndpointAccess get(String name, Output<String> id, @Nullable EndpointAccessState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EndpointAccess(name, id, state, options);
    }
}
