// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.sagemaker;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs;
import com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionState;
import com.pulumi.aws.sagemaker.outputs.DataQualityJobDefinitionDataQualityAppSpecification;
import com.pulumi.aws.sagemaker.outputs.DataQualityJobDefinitionDataQualityBaselineConfig;
import com.pulumi.aws.sagemaker.outputs.DataQualityJobDefinitionDataQualityJobInput;
import com.pulumi.aws.sagemaker.outputs.DataQualityJobDefinitionDataQualityJobOutputConfig;
import com.pulumi.aws.sagemaker.outputs.DataQualityJobDefinitionJobResources;
import com.pulumi.aws.sagemaker.outputs.DataQualityJobDefinitionNetworkConfig;
import com.pulumi.aws.sagemaker.outputs.DataQualityJobDefinitionStoppingCondition;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a SageMaker data quality job definition resource.
 * 
 * ## Example Usage
 * 
 * Basic usage:
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.sagemaker.DataQualityJobDefinition;
 * import com.pulumi.aws.sagemaker.DataQualityJobDefinitionArgs;
 * import com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityAppSpecificationArgs;
 * import com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputArgs;
 * import com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobInputEndpointInputArgs;
 * import com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigArgs;
 * import com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsArgs;
 * import com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsS3OutputArgs;
 * import com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesArgs;
 * import com.pulumi.aws.sagemaker.inputs.DataQualityJobDefinitionJobResourcesClusterConfigArgs;
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
 *         var test = new DataQualityJobDefinition("test", DataQualityJobDefinitionArgs.builder()
 *             .name("my-data-quality-job-definition")
 *             .dataQualityAppSpecification(DataQualityJobDefinitionDataQualityAppSpecificationArgs.builder()
 *                 .imageUri(monitor.registryPath())
 *                 .build())
 *             .dataQualityJobInput(DataQualityJobDefinitionDataQualityJobInputArgs.builder()
 *                 .endpointInput(DataQualityJobDefinitionDataQualityJobInputEndpointInputArgs.builder()
 *                     .endpointName(myEndpoint.name())
 *                     .build())
 *                 .build())
 *             .dataQualityJobOutputConfig(DataQualityJobDefinitionDataQualityJobOutputConfigArgs.builder()
 *                 .monitoringOutputs(DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsArgs.builder()
 *                     .s3Output(DataQualityJobDefinitionDataQualityJobOutputConfigMonitoringOutputsS3OutputArgs.builder()
 *                         .s3Uri(String.format("https://%s/output", myBucket.bucketRegionalDomainName()))
 *                         .build())
 *                     .build())
 *                 .build())
 *             .jobResources(DataQualityJobDefinitionJobResourcesArgs.builder()
 *                 .clusterConfig(DataQualityJobDefinitionJobResourcesClusterConfigArgs.builder()
 *                     .instanceCount(1)
 *                     .instanceType("ml.t3.medium")
 *                     .volumeSizeInGb(20)
 *                     .build())
 *                 .build())
 *             .roleArn(myRole.arn())
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
 * Using `pulumi import`, import data quality job definitions using the `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:sagemaker/dataQualityJobDefinition:DataQualityJobDefinition test_data_quality_job_definition data-quality-job-definition-foo
 * ```
 * 
 */
@ResourceType(type="aws:sagemaker/dataQualityJobDefinition:DataQualityJobDefinition")
public class DataQualityJobDefinition extends com.pulumi.resources.CustomResource {
    /**
     * The Amazon Resource Name (ARN) assigned by AWS to this data quality job definition.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The Amazon Resource Name (ARN) assigned by AWS to this data quality job definition.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * Specifies the container that runs the monitoring job. Fields are documented below.
     * 
     */
    @Export(name="dataQualityAppSpecification", refs={DataQualityJobDefinitionDataQualityAppSpecification.class}, tree="[0]")
    private Output<DataQualityJobDefinitionDataQualityAppSpecification> dataQualityAppSpecification;

    /**
     * @return Specifies the container that runs the monitoring job. Fields are documented below.
     * 
     */
    public Output<DataQualityJobDefinitionDataQualityAppSpecification> dataQualityAppSpecification() {
        return this.dataQualityAppSpecification;
    }
    /**
     * Configures the constraints and baselines for the monitoring job. Fields are documented below.
     * 
     */
    @Export(name="dataQualityBaselineConfig", refs={DataQualityJobDefinitionDataQualityBaselineConfig.class}, tree="[0]")
    private Output</* @Nullable */ DataQualityJobDefinitionDataQualityBaselineConfig> dataQualityBaselineConfig;

    /**
     * @return Configures the constraints and baselines for the monitoring job. Fields are documented below.
     * 
     */
    public Output<Optional<DataQualityJobDefinitionDataQualityBaselineConfig>> dataQualityBaselineConfig() {
        return Codegen.optional(this.dataQualityBaselineConfig);
    }
    /**
     * A list of inputs for the monitoring job. Fields are documented below.
     * 
     */
    @Export(name="dataQualityJobInput", refs={DataQualityJobDefinitionDataQualityJobInput.class}, tree="[0]")
    private Output<DataQualityJobDefinitionDataQualityJobInput> dataQualityJobInput;

    /**
     * @return A list of inputs for the monitoring job. Fields are documented below.
     * 
     */
    public Output<DataQualityJobDefinitionDataQualityJobInput> dataQualityJobInput() {
        return this.dataQualityJobInput;
    }
    /**
     * The output configuration for monitoring jobs. Fields are documented below.
     * 
     */
    @Export(name="dataQualityJobOutputConfig", refs={DataQualityJobDefinitionDataQualityJobOutputConfig.class}, tree="[0]")
    private Output<DataQualityJobDefinitionDataQualityJobOutputConfig> dataQualityJobOutputConfig;

    /**
     * @return The output configuration for monitoring jobs. Fields are documented below.
     * 
     */
    public Output<DataQualityJobDefinitionDataQualityJobOutputConfig> dataQualityJobOutputConfig() {
        return this.dataQualityJobOutputConfig;
    }
    /**
     * Identifies the resources to deploy for a monitoring job. Fields are documented below.
     * 
     */
    @Export(name="jobResources", refs={DataQualityJobDefinitionJobResources.class}, tree="[0]")
    private Output<DataQualityJobDefinitionJobResources> jobResources;

    /**
     * @return Identifies the resources to deploy for a monitoring job. Fields are documented below.
     * 
     */
    public Output<DataQualityJobDefinitionJobResources> jobResources() {
        return this.jobResources;
    }
    /**
     * The name of the data quality job definition. If omitted, the provider will assign a random, unique name.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the data quality job definition. If omitted, the provider will assign a random, unique name.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Specifies networking configuration for the monitoring job. Fields are documented below.
     * 
     */
    @Export(name="networkConfig", refs={DataQualityJobDefinitionNetworkConfig.class}, tree="[0]")
    private Output</* @Nullable */ DataQualityJobDefinitionNetworkConfig> networkConfig;

    /**
     * @return Specifies networking configuration for the monitoring job. Fields are documented below.
     * 
     */
    public Output<Optional<DataQualityJobDefinitionNetworkConfig>> networkConfig() {
        return Codegen.optional(this.networkConfig);
    }
    /**
     * The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return The Amazon Resource Name (ARN) of an IAM role that Amazon SageMaker can assume to perform tasks on your behalf.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }
    /**
     * A time limit for how long the monitoring job is allowed to run before stopping. Fields are documented below.
     * 
     */
    @Export(name="stoppingCondition", refs={DataQualityJobDefinitionStoppingCondition.class}, tree="[0]")
    private Output<DataQualityJobDefinitionStoppingCondition> stoppingCondition;

    /**
     * @return A time limit for how long the monitoring job is allowed to run before stopping. Fields are documented below.
     * 
     */
    public Output<DataQualityJobDefinitionStoppingCondition> stoppingCondition() {
        return this.stoppingCondition;
    }
    /**
     * A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return A mapping of tags to assign to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DataQualityJobDefinition(String name) {
        this(name, DataQualityJobDefinitionArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DataQualityJobDefinition(String name, DataQualityJobDefinitionArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DataQualityJobDefinition(String name, DataQualityJobDefinitionArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/dataQualityJobDefinition:DataQualityJobDefinition", name, args == null ? DataQualityJobDefinitionArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DataQualityJobDefinition(String name, Output<String> id, @Nullable DataQualityJobDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:sagemaker/dataQualityJobDefinition:DataQualityJobDefinition", name, state, makeResourceOptions(options, id));
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
    public static DataQualityJobDefinition get(String name, Output<String> id, @Nullable DataQualityJobDefinitionState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DataQualityJobDefinition(name, id, state, options);
    }
}
