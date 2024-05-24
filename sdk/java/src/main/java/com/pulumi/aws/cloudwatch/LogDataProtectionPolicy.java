// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.LogDataProtectionPolicyArgs;
import com.pulumi.aws.cloudwatch.inputs.LogDataProtectionPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a CloudWatch Log Data Protection Policy resource.
 * 
 * Read more about protecting sensitive user data in the [User Guide](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data.html).
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
 * import com.pulumi.aws.cloudwatch.LogGroup;
 * import com.pulumi.aws.cloudwatch.LogGroupArgs;
 * import com.pulumi.aws.s3.BucketV2;
 * import com.pulumi.aws.s3.BucketV2Args;
 * import com.pulumi.aws.cloudwatch.LogDataProtectionPolicy;
 * import com.pulumi.aws.cloudwatch.LogDataProtectionPolicyArgs;
 * import static com.pulumi.codegen.internal.Serialization.*;
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
 *         var example = new LogGroup("example", LogGroupArgs.builder()
 *             .name("example")
 *             .build());
 * 
 *         var exampleBucketV2 = new BucketV2("exampleBucketV2", BucketV2Args.builder()
 *             .bucket("example")
 *             .build());
 * 
 *         var exampleLogDataProtectionPolicy = new LogDataProtectionPolicy("exampleLogDataProtectionPolicy", LogDataProtectionPolicyArgs.builder()
 *             .logGroupName(example.name())
 *             .policyDocument(exampleBucketV2.bucket().applyValue(bucket -> serializeJson(
 *                 jsonObject(
 *                     jsonProperty("Name", "Example"),
 *                     jsonProperty("Version", "2021-06-01"),
 *                     jsonProperty("Statement", jsonArray(
 *                         jsonObject(
 *                             jsonProperty("Sid", "Audit"),
 *                             jsonProperty("DataIdentifier", jsonArray("arn:aws:dataprotection::aws:data-identifier/EmailAddress")),
 *                             jsonProperty("Operation", jsonObject(
 *                                 jsonProperty("Audit", jsonObject(
 *                                     jsonProperty("FindingsDestination", jsonObject(
 *                                         jsonProperty("S3", jsonObject(
 *                                             jsonProperty("Bucket", bucket)
 *                                         ))
 *                                     ))
 *                                 ))
 *                             ))
 *                         ), 
 *                         jsonObject(
 *                             jsonProperty("Sid", "Redact"),
 *                             jsonProperty("DataIdentifier", jsonArray("arn:aws:dataprotection::aws:data-identifier/EmailAddress")),
 *                             jsonProperty("Operation", jsonObject(
 *                                 jsonProperty("Deidentify", jsonObject(
 *                                     jsonProperty("MaskConfig", jsonObject(
 * 
 *                                     ))
 *                                 ))
 *                             ))
 *                         )
 *                     ))
 *                 ))))
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
 * Using `pulumi import`, import this resource using the `log_group_name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy example my-log-group
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy")
public class LogDataProtectionPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The name of the log group under which the log stream is to be created.
     * 
     */
    @Export(name="logGroupName", refs={String.class}, tree="[0]")
    private Output<String> logGroupName;

    /**
     * @return The name of the log group under which the log stream is to be created.
     * 
     */
    public Output<String> logGroupName() {
        return this.logGroupName;
    }
    /**
     * Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
     * 
     */
    @Export(name="policyDocument", refs={String.class}, tree="[0]")
    private Output<String> policyDocument;

    /**
     * @return Specifies the data protection policy in JSON. Read more at [Data protection policy syntax](https://docs.aws.amazon.com/AmazonCloudWatch/latest/logs/mask-sensitive-log-data-start.html#mask-sensitive-log-data-policysyntax).
     * 
     */
    public Output<String> policyDocument() {
        return this.policyDocument;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public LogDataProtectionPolicy(String name) {
        this(name, LogDataProtectionPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public LogDataProtectionPolicy(String name, LogDataProtectionPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public LogDataProtectionPolicy(String name, LogDataProtectionPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy", name, args == null ? LogDataProtectionPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private LogDataProtectionPolicy(String name, Output<String> id, @Nullable LogDataProtectionPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/logDataProtectionPolicy:LogDataProtectionPolicy", name, state, makeResourceOptions(options, id));
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
    public static LogDataProtectionPolicy get(String name, Output<String> id, @Nullable LogDataProtectionPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new LogDataProtectionPolicy(name, id, state, options);
    }
}
