// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ses;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ses.EventDestinationArgs;
import com.pulumi.aws.ses.inputs.EventDestinationState;
import com.pulumi.aws.ses.outputs.EventDestinationCloudwatchDestination;
import com.pulumi.aws.ses.outputs.EventDestinationKinesisDestination;
import com.pulumi.aws.ses.outputs.EventDestinationSnsDestination;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides an SES event destination
 * 
 * ## Example Usage
 * 
 * ### CloudWatch Destination
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ses.EventDestination;
 * import com.pulumi.aws.ses.EventDestinationArgs;
 * import com.pulumi.aws.ses.inputs.EventDestinationCloudwatchDestinationArgs;
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
 *         var cloudwatch = new EventDestination(&#34;cloudwatch&#34;, EventDestinationArgs.builder()        
 *             .name(&#34;event-destination-cloudwatch&#34;)
 *             .configurationSetName(example.name())
 *             .enabled(true)
 *             .matchingTypes(            
 *                 &#34;bounce&#34;,
 *                 &#34;send&#34;)
 *             .cloudwatchDestinations(EventDestinationCloudwatchDestinationArgs.builder()
 *                 .defaultValue(&#34;default&#34;)
 *                 .dimensionName(&#34;dimension&#34;)
 *                 .valueSource(&#34;emailHeader&#34;)
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### Kinesis Destination
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ses.EventDestination;
 * import com.pulumi.aws.ses.EventDestinationArgs;
 * import com.pulumi.aws.ses.inputs.EventDestinationKinesisDestinationArgs;
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
 *         var kinesis = new EventDestination(&#34;kinesis&#34;, EventDestinationArgs.builder()        
 *             .name(&#34;event-destination-kinesis&#34;)
 *             .configurationSetName(exampleAwsSesConfigurationSet.name())
 *             .enabled(true)
 *             .matchingTypes(            
 *                 &#34;bounce&#34;,
 *                 &#34;send&#34;)
 *             .kinesisDestination(EventDestinationKinesisDestinationArgs.builder()
 *                 .streamArn(exampleAwsKinesisFirehoseDeliveryStream.arn())
 *                 .roleArn(example.arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ### SNS Destination
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.ses.EventDestination;
 * import com.pulumi.aws.ses.EventDestinationArgs;
 * import com.pulumi.aws.ses.inputs.EventDestinationSnsDestinationArgs;
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
 *         var sns = new EventDestination(&#34;sns&#34;, EventDestinationArgs.builder()        
 *             .name(&#34;event-destination-sns&#34;)
 *             .configurationSetName(exampleAwsSesConfigurationSet.name())
 *             .enabled(true)
 *             .matchingTypes(            
 *                 &#34;bounce&#34;,
 *                 &#34;send&#34;)
 *             .snsDestination(EventDestinationSnsDestinationArgs.builder()
 *                 .topicArn(example.arn())
 *                 .build())
 *             .build());
 * 
 *     }
 * }
 * ```
 * &lt;!--End PulumiCodeChooser --&gt;
 * 
 * ## Import
 * 
 * Using `pulumi import`, import SES event destinations using `configuration_set_name` together with the event destination&#39;s `name`. For example:
 * 
 * ```sh
 * $ pulumi import aws:ses/eventDestination:EventDestination sns some-configuration-set-test/event-destination-sns
 * ```
 * 
 */
@ResourceType(type="aws:ses/eventDestination:EventDestination")
public class EventDestination extends com.pulumi.resources.CustomResource {
    /**
     * The SES event destination ARN.
     * 
     */
    @Export(name="arn", refs={String.class}, tree="[0]")
    private Output<String> arn;

    /**
     * @return The SES event destination ARN.
     * 
     */
    public Output<String> arn() {
        return this.arn;
    }
    /**
     * CloudWatch destination for the events
     * 
     */
    @Export(name="cloudwatchDestinations", refs={List.class,EventDestinationCloudwatchDestination.class}, tree="[0,1]")
    private Output</* @Nullable */ List<EventDestinationCloudwatchDestination>> cloudwatchDestinations;

    /**
     * @return CloudWatch destination for the events
     * 
     */
    public Output<Optional<List<EventDestinationCloudwatchDestination>>> cloudwatchDestinations() {
        return Codegen.optional(this.cloudwatchDestinations);
    }
    /**
     * The name of the configuration set
     * 
     */
    @Export(name="configurationSetName", refs={String.class}, tree="[0]")
    private Output<String> configurationSetName;

    /**
     * @return The name of the configuration set
     * 
     */
    public Output<String> configurationSetName() {
        return this.configurationSetName;
    }
    /**
     * If true, the event destination will be enabled
     * 
     */
    @Export(name="enabled", refs={Boolean.class}, tree="[0]")
    private Output</* @Nullable */ Boolean> enabled;

    /**
     * @return If true, the event destination will be enabled
     * 
     */
    public Output<Optional<Boolean>> enabled() {
        return Codegen.optional(this.enabled);
    }
    /**
     * Send the events to a kinesis firehose destination
     * 
     */
    @Export(name="kinesisDestination", refs={EventDestinationKinesisDestination.class}, tree="[0]")
    private Output</* @Nullable */ EventDestinationKinesisDestination> kinesisDestination;

    /**
     * @return Send the events to a kinesis firehose destination
     * 
     */
    public Output<Optional<EventDestinationKinesisDestination>> kinesisDestination() {
        return Codegen.optional(this.kinesisDestination);
    }
    /**
     * A list of matching types. May be any of `&#34;send&#34;`, `&#34;reject&#34;`, `&#34;bounce&#34;`, `&#34;complaint&#34;`, `&#34;delivery&#34;`, `&#34;open&#34;`, `&#34;click&#34;`, or `&#34;renderingFailure&#34;`.
     * 
     */
    @Export(name="matchingTypes", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> matchingTypes;

    /**
     * @return A list of matching types. May be any of `&#34;send&#34;`, `&#34;reject&#34;`, `&#34;bounce&#34;`, `&#34;complaint&#34;`, `&#34;delivery&#34;`, `&#34;open&#34;`, `&#34;click&#34;`, or `&#34;renderingFailure&#34;`.
     * 
     */
    public Output<List<String>> matchingTypes() {
        return this.matchingTypes;
    }
    /**
     * The name of the event destination
     * 
     */
    @Export(name="name", refs={String.class}, tree="[0]")
    private Output<String> name;

    /**
     * @return The name of the event destination
     * 
     */
    public Output<String> name() {
        return this.name;
    }
    /**
     * Send the events to an SNS Topic destination
     * 
     * &gt; **NOTE:** You can specify `&#34;cloudwatch_destination&#34;` or `&#34;kinesis_destination&#34;` but not both
     * 
     */
    @Export(name="snsDestination", refs={EventDestinationSnsDestination.class}, tree="[0]")
    private Output</* @Nullable */ EventDestinationSnsDestination> snsDestination;

    /**
     * @return Send the events to an SNS Topic destination
     * 
     * &gt; **NOTE:** You can specify `&#34;cloudwatch_destination&#34;` or `&#34;kinesis_destination&#34;` but not both
     * 
     */
    public Output<Optional<EventDestinationSnsDestination>> snsDestination() {
        return Codegen.optional(this.snsDestination);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventDestination(String name) {
        this(name, EventDestinationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventDestination(String name, EventDestinationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventDestination(String name, EventDestinationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/eventDestination:EventDestination", name, args == null ? EventDestinationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventDestination(String name, Output<String> id, @Nullable EventDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ses/eventDestination:EventDestination", name, state, makeResourceOptions(options, id));
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
    public static EventDestination get(String name, Output<String> id, @Nullable EventDestinationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventDestination(name, id, state, options);
    }
}
