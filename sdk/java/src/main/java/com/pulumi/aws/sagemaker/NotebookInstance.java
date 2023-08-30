// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.NotebookInstanceArgs;
import com.pulumi.aws.sagemaker.inputs.NotebookInstanceState;
import com.pulumi.aws.sagemaker.outputs.NotebookInstanceInstanceMetadataServiceConfiguration;
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
 * Provides a SageMaker Notebook Instance resource.
 * 
 * ## Example Usage
 * ### Basic usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sagemaker.NotebookInstance;
 * import com.pulumi.aws.sagemaker.NotebookInstanceArgs;
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
 *         var ni = new NotebookInstance(&#34;ni&#34;, NotebookInstanceArgs.builder()        
 *             .roleArn(aws_iam_role.role().arn())
 *             .instanceType(&#34;ml.t2.medium&#34;)
 *             .tags(Map.of(&#34;Name&#34;, &#34;foo&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Code repository usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sagemaker.CodeRepository;
 * import com.pulumi.aws.sagemaker.CodeRepositoryArgs;
 * import com.pulumi.aws.sagemaker.inputs.CodeRepositoryGitConfigArgs;
 * import com.pulumi.aws.sagemaker.NotebookInstance;
 * import com.pulumi.aws.sagemaker.NotebookInstanceArgs;
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
 *         var example = new CodeRepository(&#34;example&#34;, CodeRepositoryArgs.builder()        
 *             .codeRepositoryName(&#34;my-notebook-instance-code-repo&#34;)
 *             .gitConfig(CodeRepositoryGitConfigArgs.builder()
 *                 .repositoryUrl(&#34;https://github.com/github/docs.git&#34;)
 *                 .build())
 *             .build());
 * 
 *         var ni = new NotebookInstance(&#34;ni&#34;, NotebookInstanceArgs.builder()        
 *             .roleArn(aws_iam_role.role().arn())
 *             .instanceType(&#34;ml.t2.medium&#34;)
 *             .defaultCodeRepository(example.codeRepositoryName())
 *             .tags(Map.of(&#34;Name&#34;, &#34;foo&#34;))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SageMaker Notebook Instances using the `name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:sagemaker/notebookInstance:NotebookInstance test_notebook_instance my-notebook-instance
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/notebookInstance:NotebookInstance")
public class NotebookInstance extends com.pulumi.resources.CustomResource {
    /**
     * A list of Elastic Inference (EI) instance types to associate with this notebook instance. See [Elastic Inference Accelerator](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) for more details. Valid values: `ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`, `ml.eia2.medium`, `ml.eia2.large`, `ml.eia2.xlarge`.
     * 
     */
    @Export(name="acceleratorTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> acceleratorTypes;

    /**
     * @return A list of Elastic Inference (EI) instance types to associate with this notebook instance. See [Elastic Inference Accelerator](https://docs.aws.amazon.com/sagemaker/latest/dg/ei.html) for more details. Valid values: `ml.eia1.medium`, `ml.eia1.large`, `ml.eia1.xlarge`, `ml.eia2.medium`, `ml.eia2.large`, `ml.eia2.xlarge`.
     * 
     */
    public Output<Optional<List<String>>> acceleratorTypes() {
        return Codegen.optional(this.acceleratorTypes);
    }
    /**
     * An array of up to three Git repositories to associate with the notebook instance.
     * These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * 
     */
    @Export(name="additionalCodeRepositories", refs={List.class,String.class}, tree="[0,1]")
    private Output</* @Nullable */ List<String>> additionalCodeRepositories;

    /**
     * @return An array of up to three Git repositories to associate with the notebook instance.
     * These can be either the names of Git repositories stored as resources in your account, or the URL of Git repositories in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository. These repositories are cloned at the same level as the default repository of your notebook instance.
     * 
     */
    public Output<Optional<List<String>>> additionalCodeRepositories() {
        return Codegen.optional(this.additionalCodeRepositories);
    }
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this notebook instance.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this notebook instance.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository.
     * 
     */
    @Export(name="defaultCodeRepository", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> defaultCodeRepository;

    /**
     * @return The Git repository associated with the notebook instance as its default code repository. This can be either the name of a Git repository stored as a resource in your account, or the URL of a Git repository in [AWS CodeCommit](https://docs.aws.amazon.com/codecommit/latest/userguide/welcome.html) or in any other Git repository.
     * 
     */
    public Output<Optional<String>> defaultCodeRepository() {
        return Codegen.optional(this.defaultCodeRepository);
    }
    /**
     * Set to `Disabled` to disable internet access to notebook. Requires `security_groups` and `subnet_id` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
     * 
     */
    @Export(name="directInternetAccess", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> directInternetAccess;

    /**
     * @return Set to `Disabled` to disable internet access to notebook. Requires `security_groups` and `subnet_id` to be set. Supported values: `Enabled` (Default) or `Disabled`. If set to `Disabled`, the notebook instance will be able to access resources only in your VPC, and will not be able to connect to Amazon SageMaker training and endpoint services unless your configure a NAT Gateway in your VPC.
     * 
     */
    public Output<Optional<String>> directInternetAccess() {
        return Codegen.optional(this.directInternetAccess);
    }
    /**
     * Information on the IMDS configuration of the notebook instance. Conflicts with `instance_metadata_service_configuration`. see details below.
     * 
     */
    @Export(name="instanceMetadataServiceConfiguration", refs={NotebookInstanceInstanceMetadataServiceConfiguration.class}, tree="[0]")
    private Output</* @Nullable */ NotebookInstanceInstanceMetadataServiceConfiguration> instanceMetadataServiceConfiguration;

    /**
     * @return Information on the IMDS configuration of the notebook instance. Conflicts with `instance_metadata_service_configuration`. see details below.
     * 
     */
    public Output<Optional<NotebookInstanceInstanceMetadataServiceConfiguration>> instanceMetadataServiceConfiguration() {
        return Codegen.optional(this.instanceMetadataServiceConfiguration);
    }
    /**
     * The name of ML compute instance type.
     * 
     */
    @Export(name="instanceType", refs={String.class}, tree="[0]")
    private Output<String> instanceType;

    /**
     * @return The name of ML compute instance type.
     * 
     */
    public Output<String> instanceType() {
        return this.instanceType;
    }
    /**
     * The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    @Export(name="kmsKeyId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> kmsKeyId;

    /**
     * @return The AWS Key Management Service (AWS KMS) key that Amazon SageMaker uses to encrypt the model artifacts at rest using Amazon S3 server-side encryption.
     * 
     */
    public Output<Optional<String>> kmsKeyId() {
        return Codegen.optional(this.kmsKeyId);
    }
    /**
     * The name of a lifecycle configuration to associate with the notebook instance.
     * 
     */
    @Export(name="lifecycleConfigName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> lifecycleConfigName;

    /**
     * @return The name of a lifecycle configuration to associate with the notebook instance.
     * 
     */
    public Output<Optional<String>> lifecycleConfigName() {
        return Codegen.optional(this.lifecycleConfigName);
    }
    /**
     * The name of the notebook instance (must be unique).
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the notebook instance (must be unique).
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The network interface ID that Amazon SageMaker created at the time of creating the instance. Only available when setting `subnet_id`.
     * 
     */
    @Export(name="networkInterfaceId", refs={String.class}, tree="[0]")
    private Output<String> networkInterfaceId;

    /**
     * @return The network interface ID that Amazon SageMaker created at the time of creating the instance. Only available when setting `subnet_id`.
     * 
     */
    public Output<String> networkInterfaceId() {
        return this.networkInterfaceId;
    }
    /**
     * The platform identifier of the notebook instance runtime environment. This value can be either `notebook-al1-v1`, `notebook-al2-v1`, or  `notebook-al2-v2`, depending on which version of Amazon Linux you require.
     * 
     */
    @Export(name="platformIdentifier", refs={String.class}, tree="[0]")
    private Output<String> platformIdentifier;

    /**
     * @return The platform identifier of the notebook instance runtime environment. This value can be either `notebook-al1-v1`, `notebook-al2-v1`, or  `notebook-al2-v2`, depending on which version of Amazon Linux you require.
     * 
     */
    public Output<String> platformIdentifier() {
        return this.platformIdentifier;
    }
    /**
     * The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return The ARN of the IAM role to be used by the notebook instance which allows SageMaker to call other services on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * Whether root access is `Enabled` or `Disabled` for users of the notebook instance. The default value is `Enabled`.
     * 
     */
    @Export(name="rootAccess", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> rootAccess;

    /**
     * @return Whether root access is `Enabled` or `Disabled` for users of the notebook instance. The default value is `Enabled`.
     * 
     */
    public Output<Optional<String>> rootAccess() {
        return Codegen.optional(this.rootAccess);
    }
    /**
     * The associated security groups.
     * 
     */
    @Export(name="securityGroups", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> securityGroups;

    /**
     * @return The associated security groups.
     * 
     */
    public Output<List<String>> securityGroups() {
        return this.securityGroups;
    }
    /**
     * The VPC subnet ID.
     * 
     */
    @Export(name="subnetId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> subnetId;

    /**
     * @return The VPC subnet ID.
     * 
     */
    public Output<Optional<String>> subnetId() {
        return Codegen.optional(this.subnetId);
    }
    /**
     * A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A map of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
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
     * The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     * 
     */
    @Export(name="url", refs={String.class}, tree="[0]")
    private Output<String> url;

    /**
     * @return The URL that you use to connect to the Jupyter notebook that is running in your notebook instance.
     * 
     */
    public Output<String> url() {
        return this.url;
    }
    /**
     * The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     * 
     */
    @Export(name="volumeSize", refs={Integer.class}, tree="[0]")
    private Output</* @Nullable */ Integer> volumeSize;

    /**
     * @return The size, in GB, of the ML storage volume to attach to the notebook instance. The default value is 5 GB.
     * 
     */
    public Output<Optional<Integer>> volumeSize() {
        return Codegen.optional(this.volumeSize);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public NotebookInstance(String name) {
        this(name, NotebookInstanceArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public NotebookInstance(String name, NotebookInstanceArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public NotebookInstance(String name, NotebookInstanceArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/notebookInstance:NotebookInstance", name, args == null ? NotebookInstanceArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private NotebookInstance(String name, Output<String> id, @Nullable NotebookInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/notebookInstance:NotebookInstance", name, state, makeResourceOptions(options, id));
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
    public static NotebookInstance get(String name, Output<String> id, @Nullable NotebookInstanceState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new NotebookInstance(name, id, state, options);
    }
}
