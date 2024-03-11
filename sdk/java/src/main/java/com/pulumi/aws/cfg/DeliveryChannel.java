// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cfg;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cfg.DeliveryChannelArgs;
import com.pulumi.aws.cfg.inputs.DeliveryChannelState;
import com.pulumi.aws.cfg.outputs.DeliveryChannelSnapshotDeliveryProperties;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an AWS Config Delivery Channel.
 * 
 * &gt; **Note:** Delivery Channel requires a Configuration Recorder to be present. Use of `depends_on` (as shown below) is recommended to avoid race conditions.
 * 
 * ## Example Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.cfg.DeliveryChannel;
 * import com.pulumi.aws.cfg.DeliveryChannelArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.cfg.Recorder;
 * import com.pulumi.aws.cfg.RecorderArgs;
 * import com.pulumi.aws.iam.RolePolicy;
 * import com.pulumi.aws.iam.RolePolicyArgs;
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
 *         var b = new BucketV2(&#34;b&#34;, BucketV2Args.builder()        
 *             .bucket(&#34;example-awsconfig&#34;)
 *             .forceDestroy(true)
 *             .build());
 * 
 *         var foo = new DeliveryChannel(&#34;foo&#34;, DeliveryChannelArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .s3BucketName(b.bucket())
 *             .build());
 * 
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;config.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var r = new Role(&#34;r&#34;, RoleArgs.builder()        
 *             .name(&#34;awsconfig-example&#34;)
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var fooRecorder = new Recorder(&#34;fooRecorder&#34;, RecorderArgs.builder()        
 *             .name(&#34;example&#34;)
 *             .roleArn(r.arn())
 *             .build());
 * 
 *         final var p = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;s3:*&#34;)
 *                 .resources(                
 *                     b.arn(),
 *                     b.arn().applyValue(arn -&gt; String.format(&#34;%s/*&#34;, arn)))
 *                 .build())
 *             .build());
 * 
 *         var pRolePolicy = new RolePolicy(&#34;pRolePolicy&#34;, RolePolicyArgs.builder()        
 *             .name(&#34;awsconfig-example&#34;)
 *             .role(r.id())
 *             .policy(p.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult).applyValue(p -&gt; p.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json())))
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import Delivery Channel using the name. For example:
 * 
 * ```sh
 * $ pulumi import aws:cfg/deliveryChannel:DeliveryChannel foo example
 * ```
 * 
 */
@ResourceType(type="aws:cfg/deliveryChannel:DeliveryChannel")
public class DeliveryChannel extends com.pulumi.resources.CustomResource {
    /**
     * The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the delivery channel. Defaults to `default`. Changing it recreates the resource.
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * The name of the S3 bucket used to store the configuration history.
     * 
     */
    @Export(name="s3BucketName", refs={String.class}, tree="[0]")
    private Output<String> s3BucketName;

    /**
     * @return The name of the S3 bucket used to store the configuration history.
     * 
     */
    public Output<String> s3BucketName() {
        return this.s3BucketName;
    }
    /**
     * The prefix for the specified S3 bucket.
     * 
     */
    @Export(name="s3KeyPrefix", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> s3KeyPrefix;

    /**
     * @return The prefix for the specified S3 bucket.
     * 
     */
    public Output<Optional<String>> s3KeyPrefix() {
        return Codegen.optional(this.s3KeyPrefix);
    }
    /**
     * The ARN of the AWS KMS key used to encrypt objects delivered by AWS Config. Must belong to the same Region as the destination S3 bucket.
     * 
     */
    @Export(name="s3KmsKeyArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> s3KmsKeyArn;

    /**
     * @return The ARN of the AWS KMS key used to encrypt objects delivered by AWS Config. Must belong to the same Region as the destination S3 bucket.
     * 
     */
    public Output<Optional<String>> s3KmsKeyArn() {
        return Codegen.optional(this.s3KmsKeyArn);
    }
    /**
     * Options for how AWS Config delivers configuration snapshots. See below
     * 
     */
    @Export(name="snapshotDeliveryProperties", refs={DeliveryChannelSnapshotDeliveryProperties.class}, tree="[0]")
    private Output</* @Nullable */ DeliveryChannelSnapshotDeliveryProperties> snapshotDeliveryProperties;

    /**
     * @return Options for how AWS Config delivers configuration snapshots. See below
     * 
     */
    public Output<Optional<DeliveryChannelSnapshotDeliveryProperties>> snapshotDeliveryProperties() {
        return Codegen.optional(this.snapshotDeliveryProperties);
    }
    /**
     * The ARN of the SNS topic that AWS Config delivers notifications to.
     * 
     */
    @Export(name="snsTopicArn", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> snsTopicArn;

    /**
     * @return The ARN of the SNS topic that AWS Config delivers notifications to.
     * 
     */
    public Output<Optional<String>> snsTopicArn() {
        return Codegen.optional(this.snsTopicArn);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public DeliveryChannel(String name) {
        this(name, DeliveryChannelArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public DeliveryChannel(String name, DeliveryChannelArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public DeliveryChannel(String name, DeliveryChannelArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/deliveryChannel:DeliveryChannel", name, args == null ? DeliveryChannelArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private DeliveryChannel(String name, Output<String> id, @Nullable DeliveryChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cfg/deliveryChannel:DeliveryChannel", name, state, makeResourceOptions(options, id));
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
    public static DeliveryChannel get(String name, Output<String> id, @Nullable DeliveryChannelState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new DeliveryChannel(name, id, state, options);
    }
}
