// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.glue;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.glue.DevEndpointArgs;
import com.pulumi.aws.glue.inputs.DevEndpointState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Integer;
import java.lang.String;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a Glue Development Endpoint resource.
 * 
 * ## Example Usage
 * 
 * Basic usage:
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.glue.DevEndpoint;
 * import com.pulumi.aws.glue.DevEndpointArgs;
 * import com.pulumi.aws.iam.RolePolicyAttachment;
 * import com.pulumi.aws.iam.RolePolicyAttachmentArgs;
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
 *         final var example = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;glue.amazonaws.com&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var exampleRole = new Role(&#34;exampleRole&#34;, RoleArgs.builder()        
 *             .name(&#34;AWSGlueServiceRole-foo&#34;)
 *             .assumeRolePolicy(example.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var exampleDevEndpoint = new DevEndpoint(&#34;exampleDevEndpoint&#34;, DevEndpointArgs.builder()        
 *             .name(&#34;foo&#34;)
 *             .roleArn(exampleRole.arn())
 *             .build());
 * 
 *         var example_AWSGlueServiceRole = new RolePolicyAttachment(&#34;example-AWSGlueServiceRole&#34;, RolePolicyAttachmentArgs.builder()        
 *             .policyArn(&#34;arn:aws:iam::aws:policy/service-role/AWSGlueServiceRole&#34;)
 *             .role(exampleRole.name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import a Glue Development Endpoint using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:glue/devEndpoint:DevEndpoint example foo
 * ```
 * 
 */
@ResourceType(type="aws:glue/devEndpoint:DevEndpoint")
public class DevEndpoint extends com.pulumi.resources.CustomResource {
    /**
     * A map of arguments used to configure the endpoint.
     * 
     */
    @Export(name="arguments", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> arguments;

    /**
     * @return A map of arguments used to configure the endpoint.
     * 
     */
    public Output<Optional<Map<String,String>>> arguments() {
        return Codegen.optional(this.arguments);
    }
    /**
     * The ARN of the endpoint.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The ARN of the endpoint.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The AWS availability zone where this endpoint is located.
     * 
     */
    @Export(name="availabilityZone", refs={String.class}, tree="[0]")
    private Output<String> availabilityZone;

    /**
     * @return The AWS availability zone where this endpoint is located.
     * 
     */
    public Output<String> availabilityZone() {
        return this.availabilityZone;
    }
    /**
     * Path to one or more Java Jars in an S3 bucket that should be loaded in this endpoint.
     * 
     */
    @Export(name="extraJarsS3Path", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> extraJarsS3Path;

    /**
     * @return Path to one or more Java Jars in an S3 bucket that should be loaded in this endpoint.
     * 
     */
    public Output<Optional<String>> extraJarsS3Path() {
        return Codegen.optional(this.extraJarsS3Path);
    }
    /**
     * Path(s) to one or more Python libraries in an S3 bucket that should be loaded in this endpoint. Multiple values must be complete paths separated by a comma.
     * 
     */
    @Export(name="extraPythonLibsS3Path", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> extraPythonLibsS3Path;

    /**
     * @return Path(s) to one or more Python libraries in an S3 bucket that should be loaded in this endpoint. Multiple values must be complete paths separated by a comma.
     * 
     */
    public Output<Optional<String>> extraPythonLibsS3Path() {
        return Codegen.optional(this.extraPythonLibsS3Path);
    }
    /**
     * The reason for a current failure in this endpoint.
     * 
     */
    @Export(name="failureReason", refs={String.class}, tree="[0]")
    private Output<String> failureReason;

    /**
     * @return The reason for a current failure in this endpoint.
     * 
     */
    public Output<String> failureReason() {
        return this.failureReason;
    }
    /**
     * Specifies the versions of Python and Apache Spark to use. Defaults to AWS Glue version 0.9.
     * 
     */
    @Export(name="glueVersion", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> glueVersion;

    /**
     * @return Specifies the versions of Python and Apache Spark to use. Defaults to AWS Glue version 0.9.
     * 
     */
    public Output<Optional<String>> glueVersion() {
        return Codegen.optional(this.glueVersion);
    }
    /**
     * The name of this endpoint. It must be unique in your account.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of this endpoint. It must be unique in your account.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The number of AWS Glue Data Processing Units (DPUs) to allocate to this endpoint. Conflicts with `worker_type`.
     * 
     */
    @Export(name="numberOfNodes", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> numberOfNodes;

    /**
     * @return The number of AWS Glue Data Processing Units (DPUs) to allocate to this endpoint. Conflicts with `worker_type`.
     * 
     */
    public Output<Optional<Integer>> numberOfNodes() {
        return Codegen.optional(this.numberOfNodes);
    }
    /**
     * The number of workers of a defined worker type that are allocated to this endpoint. This field is available only when you choose worker type G.1X or G.2X.
     * 
     */
    @Export(name="numberOfWorkers", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> numberOfWorkers;

    /**
     * @return The number of workers of a defined worker type that are allocated to this endpoint. This field is available only when you choose worker type G.1X or G.2X.
     * 
     */
    public Output<Optional<Integer>> numberOfWorkers() {
        return Codegen.optional(this.numberOfWorkers);
    }
    /**
     * A private IP address to access the endpoint within a VPC, if this endpoint is created within one.
     * 
     */
    @Export(name="privateAddress", refs={String.class}, tree="[0]")
    private Output<String> privateAddress;

    /**
     * @return A private IP address to access the endpoint within a VPC, if this endpoint is created within one.
     * 
     */
    public Output<String> privateAddress() {
        return this.privateAddress;
    }
    /**
     * The public IP address used by this endpoint. The PublicAddress field is present only when you create a non-VPC endpoint.
     * 
     */
    @Export(name="publicAddress", refs={String.class}, tree="[0]")
    private Output<String> publicAddress;

    /**
     * @return The public IP address used by this endpoint. The PublicAddress field is present only when you create a non-VPC endpoint.
     * 
     */
    public Output<String> publicAddress() {
        return this.publicAddress;
    }
    /**
     * The public key to be used by this endpoint for authentication.
     * 
     */
    @Export(name="publicKey", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> publicKey;

    /**
     * @return The public key to be used by this endpoint for authentication.
     * 
     */
    public Output<Optional<String>> publicKey() {
        return Codegen.optional(this.publicKey);
    }
    /**
     * A list of public keys to be used by this endpoint for authentication.
     * 
     */
    @Export(name="publicKeys", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> publicKeys;

    /**
     * @return A list of public keys to be used by this endpoint for authentication.
     * 
     */
    public Output<Optional<List<String>>> publicKeys() {
        return Codegen.optional(this.publicKeys);
    }
    /**
     * The IAM role for this endpoint.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return The IAM role for this endpoint.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * The name of the Security Configuration structure to be used with this endpoint.
     * 
     */
    @Export(name="securityConfiguration", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> securityConfiguration;

    /**
     * @return The name of the Security Configuration structure to be used with this endpoint.
     * 
     */
    public Output<Optional<String>> securityConfiguration() {
        return Codegen.optional(this.securityConfiguration);
    }
    /**
     * Security group IDs for the security groups to be used by this endpoint.
     * 
     */
    @Export(name="securityGroupIds", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> securityGroupIds;

    /**
     * @return Security group IDs for the security groups to be used by this endpoint.
     * 
     */
    public Output<Optional<List<String>>> securityGroupIds() {
        return Codegen.optional(this.securityGroupIds);
    }
    /**
     * The current status of this endpoint.
     * 
     */
    @Export(name="status", refs={String.class}, tree="[0]")
    private Output<String> status;

    /**
     * @return The current status of this endpoint.
     * 
     */
    public Output<String> status() {
        return this.status;
    }
    /**
     * The subnet ID for the new endpoint to use.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return The subnet ID for the new endpoint to use.
     * 
     */
    public Output<Optional<String>> subnetId() {
        return Codegen.optional(this.subnetId);
    }
    /**
     * Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value map of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     * @deprecated
     * Please use `tags` instead.
     * 
     */
    @Deprecated /* Please use `tags` instead. */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }
    /**
     * he ID of the VPC used by this endpoint.
     * 
     */
    @Export(name="vpcId", refs={String.class}, tree="[0]")
    private Output<String> vpcId;

    /**
     * @return he ID of the VPC used by this endpoint.
     * 
     */
    public Output<String> vpcId() {
        return this.vpcId;
    }
    /**
     * The type of predefined worker that is allocated to this endpoint. Accepts a value of Standard, G.1X, or G.2X.
     * 
     */
    @Export(name="workerType", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> workerType;

    /**
     * @return The type of predefined worker that is allocated to this endpoint. Accepts a value of Standard, G.1X, or G.2X.
     * 
     */
    public Output<Optional<String>> workerType() {
        return Codegen.optional(this.workerType);
    }
    /**
     * The YARN endpoint address used by this endpoint.
     * 
     */
    @Export(name="yarnEndpointAddress", refs={String.class}, tree="[0]")
    private Output<String> yarnEndpointAddress;

    /**
     * @return The YARN endpoint address used by this endpoint.
     * 
     */
    public Output<String> yarnEndpointAddress() {
        return this.yarnEndpointAddress;
    }
    /**
     * The Apache Zeppelin port for the remote Apache Spark interpreter.
     * 
     */
    @Export(name="zeppelinRemoteSparkInterpreterPort", refs={Integer.class}, tree="[0]")
    private Output<Integer> zeppelinRemoteSparkInterpreterPort;

    /**
     * @return The Apache Zeppelin port for the remote Apache Spark interpreter.
     * 
     */
    public Output<Integer> zeppelinRemoteSparkInterpreterPort() {
        return this.zeppelinRemoteSparkInterpreterPort;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DevEndpoint(String name) {
        this(name, DevEndpointArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DevEndpoint(String name, DevEndpointArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DevEndpoint(String name, DevEndpointArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/devEndpoint:DevEndpoint", name, args == null ? DevEndpointArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DevEndpoint(String name, Output<String> id, @Nullable DevEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:glue/devEndpoint:DevEndpoint", name, state, makeResourceOptions(options, id));
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
    public static DevEndpoint get(String name, Output<String> id, @Nullable DevEndpointState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DevEndpoint(name, id, state, options);
    }
}
