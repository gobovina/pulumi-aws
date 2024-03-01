// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.connect;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.connect.LambdaFunctionAssociationArgs;
import com.pulumi.aws.connect.inputs.LambdaFunctionAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides an Amazon Connect Lambda Function Association. For more information see
 * [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html) and [Invoke AWS Lambda functions](https://docs.aws.amazon.com/connect/latest/adminguide/connect-lambda-functions.html).
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.connect.LambdaFunctionAssociation;
 * import com.pulumi.aws.connect.LambdaFunctionAssociationArgs;
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
 *         var example = new LambdaFunctionAssociation(&#34;example&#34;, LambdaFunctionAssociationArgs.builder()        
 *             .functionArn(exampleAwsLambdaFunction.arn())
 *             .instanceId(exampleAwsConnectInstance.id())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import `aws_connect_lambda_function_association` using the `instance_id` and `function_arn` separated by a comma (`,`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:connect/lambdaFunctionAssociation:LambdaFunctionAssociation example aaaaaaaa-bbbb-cccc-dddd-111111111111,arn:aws:lambda:us-west-2:123456789123:function:example
 * ```
 * 
 */
@ResourceType(type="aws:connect/lambdaFunctionAssociation:LambdaFunctionAssociation")
public class LambdaFunctionAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    @Export(name="functionArn", refs={String.class}, tree="[0]")
    private Output<String> functionArn;

    /**
     * @return Amazon Resource Name (ARN) of the Lambda Function, omitting any version or alias qualifier.
     * 
     */
    public Output<String> functionArn() {
        return this.functionArn;
    }
    /**
     * The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * 
     */
    @Export(name="instanceId", refs={String.class}, tree="[0]")
    private Output<String> instanceId;

    /**
     * @return The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
     * 
     */
    public Output<String> instanceId() {
        return this.instanceId;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LambdaFunctionAssociation(String name) {
        this(name, LambdaFunctionAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LambdaFunctionAssociation(String name, LambdaFunctionAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LambdaFunctionAssociation(String name, LambdaFunctionAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/lambdaFunctionAssociation:LambdaFunctionAssociation", name, args == null ? LambdaFunctionAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LambdaFunctionAssociation(String name, Output<String> id, @Nullable LambdaFunctionAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:connect/lambdaFunctionAssociation:LambdaFunctionAssociation", name, state, makeResourceOptions(options, id));
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
    public static LambdaFunctionAssociation get(String name, Output<String> id, @Nullable LambdaFunctionAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LambdaFunctionAssociation(name, id, state, options);
    }
}
