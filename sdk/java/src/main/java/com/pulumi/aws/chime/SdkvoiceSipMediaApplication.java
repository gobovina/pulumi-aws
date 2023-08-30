// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.chime;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.chime.SdkvoiceSipMediaApplicationArgs;
import com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationState;
import com.pulumi.aws.chime.outputs.SdkvoiceSipMediaApplicationEndpoints;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * A ChimeSDKVoice SIP Media Application is a managed object that passes values from a SIP rule to a target AWS Lambda function.
 * 
 * ## Example Usage
 * ### Basic Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.chime.SdkvoiceSipMediaApplication;
 * import com.pulumi.aws.chime.SdkvoiceSipMediaApplicationArgs;
 * import com.pulumi.aws.chime.inputs.SdkvoiceSipMediaApplicationEndpointsArgs;
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
 *         var example = new SdkvoiceSipMediaApplication(&#34;example&#34;, SdkvoiceSipMediaApplicationArgs.builder()        
 *             .awsRegion(&#34;us-east-1&#34;)
 *             .endpoints(SdkvoiceSipMediaApplicationEndpointsArgs.builder()
 *                 .lambdaArn(aws_lambda_function.test().arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import a ChimeSDKVoice SIP Media Application using the `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:chime/sdkvoiceSipMediaApplication:SdkvoiceSipMediaApplication example abcdef123456
 * ```
 * 
 */
@ResourceType(type="aws:chime/sdkvoiceSipMediaApplication:SdkvoiceSipMediaApplication")
public class SdkvoiceSipMediaApplication extends com.pulumi.resources.CustomResource {
    /**
     * ARN (Amazon Resource Name) of the AWS Chime SDK Voice Sip Media Application
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return ARN (Amazon Resource Name) of the AWS Chime SDK Voice Sip Media Application
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
     * 
     */
    @Export(name="awsRegion", refs={String.class}, tree="[0]")
    private Output<String> awsRegion;

    /**
     * @return The AWS Region in which the AWS Chime SDK Voice Sip Media Application is created.
     * 
     */
    public Output<String> awsRegion() {
        return this.awsRegion;
    }
    /**
     * List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
     * 
     */
    @Export(name="endpoints", refs={SdkvoiceSipMediaApplicationEndpoints.class}, tree="[0]")
    private Output<SdkvoiceSipMediaApplicationEndpoints> endpoints;

    /**
     * @return List of endpoints (Lambda Amazon Resource Names) specified for the SIP media application. Currently, only one endpoint is supported. See `endpoints`.
     * 
     */
    public Output<SdkvoiceSipMediaApplicationEndpoints> endpoints() {
        return this.endpoints;
    }
    /**
     * The name of the AWS Chime SDK Voice Sip Media Application.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the AWS Chime SDK Voice Sip Media Application.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    @Export(name="tags", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output</* @Nullable */ Map<String,String>> tags;

    /**
     * @return Key-value mapping of resource tags. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
     * 
     */
    public Output<Optional<Map<String,String>>> tags() {
        return Codegen.optional(this.tags);
    }
    /**
     * Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    @Export(name="tagsAll", refs={Map.class,String.class}, tree="[0,1,1]")
    private Output<Map<String,String>> tagsAll;

    /**
     * @return Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
     * 
     */
    public Output<Map<String,String>> tagsAll() {
        return this.tagsAll;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public SdkvoiceSipMediaApplication(String name) {
        this(name, SdkvoiceSipMediaApplicationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public SdkvoiceSipMediaApplication(String name, SdkvoiceSipMediaApplicationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public SdkvoiceSipMediaApplication(String name, SdkvoiceSipMediaApplicationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/sdkvoiceSipMediaApplication:SdkvoiceSipMediaApplication", name, args == null ? SdkvoiceSipMediaApplicationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private SdkvoiceSipMediaApplication(String name, Output<String> id, @Nullable SdkvoiceSipMediaApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:chime/sdkvoiceSipMediaApplication:SdkvoiceSipMediaApplication", name, state, makeResourceOptions(options, id));
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
    public static SdkvoiceSipMediaApplication get(String name, Output<String> id, @Nullable SdkvoiceSipMediaApplicationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new SdkvoiceSipMediaApplication(name, id, state, options);
    }
}
