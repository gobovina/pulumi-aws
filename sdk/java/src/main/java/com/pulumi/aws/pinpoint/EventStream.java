// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.pinpoint;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.pinpoint.EventStreamArgs;
import com.pulumi.aws.pinpoint.inputs.EventStreamState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Provides a Pinpoint Event Stream resource.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.pinpoint.App;
 * import com.pulumi.aws.kinesis.Stream;
 * import com.pulumi.aws.kinesis.StreamArgs;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.iam.Role;
 * import com.pulumi.aws.iam.RoleArgs;
 * import com.pulumi.aws.pinpoint.EventStream;
 * import com.pulumi.aws.pinpoint.EventStreamArgs;
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
 *         var app = new App(&#34;app&#34;);
 * 
 *         var testStream = new Stream(&#34;testStream&#34;, StreamArgs.builder()        
 *             .shardCount(1)
 *             .build());
 * 
 *         final var assumeRole = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;pinpoint.us-east-1.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;sts:AssumeRole&#34;)
 *                 .build())
 *             .build());
 * 
 *         var testRole = new Role(&#34;testRole&#34;, RoleArgs.builder()        
 *             .assumeRolePolicy(assumeRole.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var stream = new EventStream(&#34;stream&#34;, EventStreamArgs.builder()        
 *             .applicationId(app.applicationId())
 *             .destinationStreamArn(testStream.arn())
 *             .roleArn(testRole.arn())
 *             .build());
 * 
 *         final var testRolePolicyPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(                
 *                     &#34;kinesis:PutRecords&#34;,
 *                     &#34;kinesis:DescribeStream&#34;)
 *                 .resources(&#34;arn:aws:kinesis:us-east-1:*:*{@literal /}*&#34;)
 *                 .build())
 *             .build());
 * 
 *         var testRolePolicyRolePolicy = new RolePolicy(&#34;testRolePolicyRolePolicy&#34;, RolePolicyArgs.builder()        
 *             .role(testRole.id())
 *             .policy(testRolePolicyPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * In TODO v1.5.0 and later, use an `import` block to import Pinpoint Event Stream using the `application-id`. For exampleterraform import {
 * 
 *  to = aws_pinpoint_event_stream.stream
 * 
 *  id = &#34;application-id&#34; } Using `TODO import`, import Pinpoint Event Stream using the `application-id`. For exampleconsole % TODO import aws_pinpoint_event_stream.stream application-id
 * 
 */
@ResourceType(type="aws:pinpoint/eventStream:EventStream")
public class EventStream extends com.pulumi.resources.CustomResource {
    /**
     * The application ID.
     * 
     */
    @Export(name="applicationId", refs={String.class}, tree="[0]")
    private Output<String> applicationId;

    /**
     * @return The application ID.
     * 
     */
    public Output<String> applicationId() {
        return this.applicationId;
    }
    /**
     * The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
     * 
     */
    @Export(name="destinationStreamArn", refs={String.class}, tree="[0]")
    private Output<String> destinationStreamArn;

    /**
     * @return The Amazon Resource Name (ARN) of the Amazon Kinesis stream or Firehose delivery stream to which you want to publish events.
     * 
     */
    public Output<String> destinationStreamArn() {
        return this.destinationStreamArn;
    }
    /**
     * The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
     * 
     */
    @Export(name="roleArn", refs={String.class}, tree="[0]")
    private Output<String> roleArn;

    /**
     * @return The IAM role that authorizes Amazon Pinpoint to publish events to the stream in your account.
     * 
     */
    public Output<String> roleArn() {
        return this.roleArn;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventStream(String name) {
        this(name, EventStreamArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventStream(String name, EventStreamArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventStream(String name, EventStreamArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/eventStream:EventStream", name, args == null ? EventStreamArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventStream(String name, Output<String> id, @Nullable EventStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:pinpoint/eventStream:EventStream", name, state, makeResourceOptions(options, id));
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
    public static EventStream get(String name, Output<String> id, @Nullable EventStreamState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventStream(name, id, state, options);
    }
}
