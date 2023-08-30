// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.ec2;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.ec2.VpcEndpointConnectionNotificationArgs;
import com.pulumi.aws.ec2.inputs.VpcEndpointConnectionNotificationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.List;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a VPC Endpoint connection notification resource.
 * Connection notifications notify subscribers of VPC Endpoint events.
 * 
 * ## Example Usage
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.sns.Topic;
 * import com.pulumi.aws.sns.TopicArgs;
 * import com.pulumi.aws.ec2.VpcEndpointService;
 * import com.pulumi.aws.ec2.VpcEndpointServiceArgs;
 * import com.pulumi.aws.ec2.VpcEndpointConnectionNotification;
 * import com.pulumi.aws.ec2.VpcEndpointConnectionNotificationArgs;
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
 *         final var topicPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .effect(&#34;Allow&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;Service&#34;)
 *                     .identifiers(&#34;vpce.amazonaws.com&#34;)
 *                     .build())
 *                 .actions(&#34;SNS:Publish&#34;)
 *                 .resources(&#34;arn:aws:sns:*:*:vpce-notification-topic&#34;)
 *                 .build())
 *             .build());
 * 
 *         var topicTopic = new Topic(&#34;topicTopic&#34;, TopicArgs.builder()        
 *             .policy(topicPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .build());
 * 
 *         var fooVpcEndpointService = new VpcEndpointService(&#34;fooVpcEndpointService&#34;, VpcEndpointServiceArgs.builder()        
 *             .acceptanceRequired(false)
 *             .networkLoadBalancerArns(aws_lb.test().arn())
 *             .build());
 * 
 *         var fooVpcEndpointConnectionNotification = new VpcEndpointConnectionNotification(&#34;fooVpcEndpointConnectionNotification&#34;, VpcEndpointConnectionNotificationArgs.builder()        
 *             .vpcEndpointServiceId(fooVpcEndpointService.id())
 *             .connectionNotificationArn(topicTopic.arn())
 *             .connectionEvents(            
 *                 &#34;Accept&#34;,
 *                 &#34;Reject&#34;)
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import VPC Endpoint connection notifications using the VPC endpoint connection notification `id`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:ec2/vpcEndpointConnectionNotification:VpcEndpointConnectionNotification foo vpce-nfn-09e6ed3b4efba2263
 * ```
 * 
 */
@ResourceType(type="aws:ec2/vpcEndpointConnectionNotification:VpcEndpointConnectionNotification")
public class VpcEndpointConnectionNotification extends com.pulumi.resources.CustomResource {
    /**
     * One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
     * 
     * &gt; **NOTE:** One of `vpc_endpoint_service_id` or `vpc_endpoint_id` must be specified.
     * 
     */
    @Export(name="connectionEvents", refs={List.class,String.class}, tree="[0,1]")
    private Output<List<String>> connectionEvents;

    /**
     * @return One or more endpoint [events](https://docs.aws.amazon.com/AWSEC2/latest/APIReference/API_CreateVpcEndpointConnectionNotification.html#API_CreateVpcEndpointConnectionNotification_RequestParameters) for which to receive notifications.
     * 
     * &gt; **NOTE:** One of `vpc_endpoint_service_id` or `vpc_endpoint_id` must be specified.
     * 
     */
    public Output<List<String>> connectionEvents() {
        return this.connectionEvents;
    }
    /**
     * The ARN of the SNS topic for the notifications.
     * 
     */
    @Export(name="connectionNotificationArn", refs={String.class}, tree="[0]")
    private Output<String> connectionNotificationArn;

    /**
     * @return The ARN of the SNS topic for the notifications.
     * 
     */
    public Output<String> connectionNotificationArn() {
        return this.connectionNotificationArn;
    }
    /**
     * The type of notification.
     * 
     */
    @Export(name="notificationType", refs={String.class}, tree="[0]")
    private Output<String> notificationType;

    /**
     * @return The type of notification.
     * 
     */
    public Output<String> notificationType() {
        return this.notificationType;
    }
    /**
     * The state of the notification.
     * 
     */
    @Export(name="state", refs={String.class}, tree="[0]")
    private Output<String> state;

    /**
     * @return The state of the notification.
     * 
     */
    public Output<String> state() {
        return this.state;
    }
    /**
     * The ID of the VPC Endpoint to receive notifications for.
     * 
     */
    @Export(name="vpcEndpointId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpcEndpointId;

    /**
     * @return The ID of the VPC Endpoint to receive notifications for.
     * 
     */
    public Output<Optional<String>> vpcEndpointId() {
        return Codegen.optional(this.vpcEndpointId);
    }
    /**
     * The ID of the VPC Endpoint Service to receive notifications for.
     * 
     */
    @Export(name="vpcEndpointServiceId", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> vpcEndpointServiceId;

    /**
     * @return The ID of the VPC Endpoint Service to receive notifications for.
     * 
     */
    public Output<Optional<String>> vpcEndpointServiceId() {
        return Codegen.optional(this.vpcEndpointServiceId);
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public VpcEndpointConnectionNotification(String name) {
        this(name, VpcEndpointConnectionNotificationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public VpcEndpointConnectionNotification(String name, VpcEndpointConnectionNotificationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public VpcEndpointConnectionNotification(String name, VpcEndpointConnectionNotificationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointConnectionNotification:VpcEndpointConnectionNotification", name, args == null ? VpcEndpointConnectionNotificationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private VpcEndpointConnectionNotification(String name, Output<String> id, @Nullable VpcEndpointConnectionNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:ec2/vpcEndpointConnectionNotification:VpcEndpointConnectionNotification", name, state, makeResourceOptions(options, id));
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
    public static VpcEndpointConnectionNotification get(String name, Output<String> id, @Nullable VpcEndpointConnectionNotificationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new VpcEndpointConnectionNotification(name, id, state, options);
    }
}
