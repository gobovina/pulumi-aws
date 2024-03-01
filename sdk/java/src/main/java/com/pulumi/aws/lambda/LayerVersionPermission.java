// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.lambda;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.lambda.LayerVersionPermissionArgs;
import com.pulumi.aws.lambda.inputs.LayerVersionPermissionState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Lambda Layer Version Permission resource. It allows you to share you own Lambda Layers to another account by account ID, to all accounts in AWS organization or even to all AWS accounts.
 * 
 * For information about Lambda Layer Permissions and how to use them, see [Using Resource-based Policies for AWS Lambda][1]
 * 
 * &gt; **NOTE:** Setting `skip_destroy` to `true` means that the AWS Provider will _not_ destroy any layer version permission, even when running `pulumi destroy`. Layer version permissions are thus intentional dangling resources that are _not_ managed by Pulumi and may incur extra expense in your AWS account.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.lambda.LayerVersionPermission;
 * import com.pulumi.aws.lambda.LayerVersionPermissionArgs;
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
 *         var lambdaLayerPermission = new LayerVersionPermission(&#34;lambdaLayerPermission&#34;, LayerVersionPermissionArgs.builder()        
 *             .layerName(&#34;arn:aws:lambda:us-west-2:123456654321:layer:test_layer1&#34;)
 *             .versionNumber(1)
 *             .principal(&#34;111111111111&#34;)
 *             .action(&#34;lambda:GetLayerVersion&#34;)
 *             .statementId(&#34;dev-account&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Lambda Layer Permissions using `layer_name` and `version_number`, separated by a comma (`,`). For example:
 * 
 * ```sh
 *  $ pulumi import aws:lambda/layerVersionPermission:LayerVersionPermission example arn:aws:lambda:us-west-2:123456654321:layer:test_layer1,1
 * ```
 * 
 */
@ResourceType(type="aws:lambda/layerVersionPermission:LayerVersionPermission")
public class LayerVersionPermission extends com.pulumi.resources.CustomResource {
    /**
     * Action, which will be allowed. `lambda:GetLayerVersion` value is suggested by AWS documantation.
     * 
     */
    @Export(name="action", refs={String.class}, tree="[0]")
    private Output<String> action;

    /**
     * @return Action, which will be allowed. `lambda:GetLayerVersion` value is suggested by AWS documantation.
     * 
     */
    public Output<String> action() {
        return this.action;
    }
    /**
     * The name or ARN of the Lambda Layer, which you want to grant access to.
     * 
     */
    @Export(name="layerName", refs={String.class}, tree="[0]")
    private Output<String> layerName;

    /**
     * @return The name or ARN of the Lambda Layer, which you want to grant access to.
     * 
     */
    public Output<String> layerName() {
        return this.layerName;
    }
    /**
     * An identifier of AWS Organization, which should be able to use your Lambda Layer. `principal` should be equal to `*` if `organization_id` provided.
     * 
     */
    @Export(name="organizationId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> organizationId;

    /**
     * @return An identifier of AWS Organization, which should be able to use your Lambda Layer. `principal` should be equal to `*` if `organization_id` provided.
     * 
     */
    public Output<Optional<String>> organizationId() {
        return Codegen.optional(this.organizationId);
    }
    /**
     * Full Lambda Layer Permission policy.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return Full Lambda Layer Permission policy.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }
    /**
     * AWS account ID which should be able to use your Lambda Layer. `*` can be used here, if you want to share your Lambda Layer widely.
     * 
     */
    @Export(name="principal", refs={String.class}, tree="[0]")
    private Output<String> principal;

    /**
     * @return AWS account ID which should be able to use your Lambda Layer. `*` can be used here, if you want to share your Lambda Layer widely.
     * 
     */
    public Output<String> principal() {
        return this.principal;
    }
    /**
     * A unique identifier for the current revision of the policy.
     * 
     */
    @Export(name="revisionId", refs={String.class}, tree="[0]")
    private Output<String> revisionId;

    /**
     * @return A unique identifier for the current revision of the policy.
     * 
     */
    public Output<String> revisionId() {
        return this.revisionId;
    }
    /**
     * Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
     * 
     */
    @Export(name="skipDestroy", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> skipDestroy;

    /**
     * @return Whether to retain the old version of a previously deployed Lambda Layer. Default is `false`. When this is not set to `true`, changing any of `compatible_architectures`, `compatible_runtimes`, `description`, `filename`, `layer_name`, `license_info`, `s3_bucket`, `s3_key`, `s3_object_version`, or `source_code_hash` forces deletion of the existing layer version and creation of a new layer version.
     * 
     */
    public Output<Optional<Boolean>> skipDestroy() {
        return Codegen.optional(this.skipDestroy);
    }
    /**
     * The name of Lambda Layer Permission, for example `dev-account` - human readable note about what is this permission for.
     * 
     */
    @Export(name="statementId", refs={String.class}, tree="[0]")
    private Output<String> statementId;

    /**
     * @return The name of Lambda Layer Permission, for example `dev-account` - human readable note about what is this permission for.
     * 
     */
    public Output<String> statementId() {
        return this.statementId;
    }
    /**
     * Version of Lambda Layer, which you want to grant access to. Note: permissions only apply to a single version of a layer.
     * 
     */
    @Export(name="versionNumber", refs={Integer.class}, tree="[0]")
    private Output<Integer> versionNumber;

    /**
     * @return Version of Lambda Layer, which you want to grant access to. Note: permissions only apply to a single version of a layer.
     * 
     */
    public Output<Integer> versionNumber() {
        return this.versionNumber;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LayerVersionPermission(String name) {
        this(name, LayerVersionPermissionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LayerVersionPermission(String name, LayerVersionPermissionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LayerVersionPermission(String name, LayerVersionPermissionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/layerVersionPermission:LayerVersionPermission", name, args == null ? LayerVersionPermissionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LayerVersionPermission(String name, Output<String> id, @Nullable LayerVersionPermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:lambda/layerVersionPermission:LayerVersionPermission", name, state, makeResourceOptions(options, id));
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
    public static LayerVersionPermission get(String name, Output<String> id, @Nullable LayerVersionPermissionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LayerVersionPermission(name, id, state, options);
    }
}
