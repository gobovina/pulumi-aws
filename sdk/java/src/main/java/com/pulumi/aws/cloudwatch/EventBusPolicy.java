// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.cloudwatch;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.cloudwatch.EventBusPolicyArgs;
import com.pulumi.aws.cloudwatch.inputs.EventBusPolicyState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import java.util.Optional;
import javax.annotation.Nullable;

/**
 * Provides a resource to create an EventBridge resource policy to support cross-account events.
 * 
 * &gt; **Note:** EventBridge was formerly known as CloudWatch Events. The functionality is identical.
 * 
 * &gt; **Note:** The EventBridge bus policy resource  (`aws.cloudwatch.EventBusPolicy`) is incompatible with the EventBridge permission resource (`aws.cloudwatch.EventPermission`) and will overwrite permissions.
 * 
 * ## Example Usage
 * ### Account Access
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.cloudwatch.EventBusPolicy;
 * import com.pulumi.aws.cloudwatch.EventBusPolicyArgs;
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
 *         final var testPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .sid(&#34;DevAccountAccess&#34;)
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(&#34;events:PutEvents&#34;)
 *                 .resources(&#34;arn:aws:events:eu-west-1:123456789012:event-bus/default&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;AWS&#34;)
 *                     .identifiers(&#34;123456789012&#34;)
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var testEventBusPolicy = new EventBusPolicy(&#34;testEventBusPolicy&#34;, EventBusPolicyArgs.builder()        
 *             .policy(testPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .eventBusName(aws_cloudwatch_event_bus.test().name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Organization Access
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.cloudwatch.EventBusPolicy;
 * import com.pulumi.aws.cloudwatch.EventBusPolicyArgs;
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
 *         final var testPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(GetPolicyDocumentStatementArgs.builder()
 *                 .sid(&#34;OrganizationAccess&#34;)
 *                 .effect(&#34;Allow&#34;)
 *                 .actions(                
 *                     &#34;events:DescribeRule&#34;,
 *                     &#34;events:ListRules&#34;,
 *                     &#34;events:ListTargetsByRule&#34;,
 *                     &#34;events:ListTagsForResource&#34;)
 *                 .resources(                
 *                     &#34;arn:aws:events:eu-west-1:123456789012:rule/*&#34;,
 *                     &#34;arn:aws:events:eu-west-1:123456789012:event-bus/default&#34;)
 *                 .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                     .type(&#34;AWS&#34;)
 *                     .identifiers(&#34;*&#34;)
 *                     .build())
 *                 .conditions(GetPolicyDocumentStatementConditionArgs.builder()
 *                     .test(&#34;StringEquals&#34;)
 *                     .variable(&#34;aws:PrincipalOrgID&#34;)
 *                     .values(aws_organizations_organization.example().id())
 *                     .build())
 *                 .build())
 *             .build());
 * 
 *         var testEventBusPolicy = new EventBusPolicy(&#34;testEventBusPolicy&#34;, EventBusPolicyArgs.builder()        
 *             .policy(testPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .eventBusName(aws_cloudwatch_event_bus.test().name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * ### Multiple Statements
 * ```java
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.iam.IamFunctions;
 * import com.pulumi.aws.iam.inputs.GetPolicyDocumentArgs;
 * import com.pulumi.aws.cloudwatch.EventBusPolicy;
 * import com.pulumi.aws.cloudwatch.EventBusPolicyArgs;
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
 *         final var testPolicyDocument = IamFunctions.getPolicyDocument(GetPolicyDocumentArgs.builder()
 *             .statements(            
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid(&#34;DevAccountAccess&#34;)
 *                     .effect(&#34;Allow&#34;)
 *                     .actions(&#34;events:PutEvents&#34;)
 *                     .resources(&#34;arn:aws:events:eu-west-1:123456789012:event-bus/default&#34;)
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type(&#34;AWS&#34;)
 *                         .identifiers(&#34;123456789012&#34;)
 *                         .build())
 *                     .build(),
 *                 GetPolicyDocumentStatementArgs.builder()
 *                     .sid(&#34;OrganizationAccess&#34;)
 *                     .effect(&#34;Allow&#34;)
 *                     .actions(                    
 *                         &#34;events:DescribeRule&#34;,
 *                         &#34;events:ListRules&#34;,
 *                         &#34;events:ListTargetsByRule&#34;,
 *                         &#34;events:ListTagsForResource&#34;)
 *                     .resources(                    
 *                         &#34;arn:aws:events:eu-west-1:123456789012:rule/*&#34;,
 *                         &#34;arn:aws:events:eu-west-1:123456789012:event-bus/default&#34;)
 *                     .principals(GetPolicyDocumentStatementPrincipalArgs.builder()
 *                         .type(&#34;AWS&#34;)
 *                         .identifiers(&#34;*&#34;)
 *                         .build())
 *                     .conditions(GetPolicyDocumentStatementConditionArgs.builder()
 *                         .test(&#34;StringEquals&#34;)
 *                         .variable(&#34;aws:PrincipalOrgID&#34;)
 *                         .values(aws_organizations_organization.example().id())
 *                         .build())
 *                     .build())
 *             .build());
 * 
 *         var testEventBusPolicy = new EventBusPolicy(&#34;testEventBusPolicy&#34;, EventBusPolicyArgs.builder()        
 *             .policy(testPolicyDocument.applyValue(getPolicyDocumentResult -&gt; getPolicyDocumentResult.json()))
 *             .eventBusName(aws_cloudwatch_event_bus.test().name())
 *             .build());
 * 
 *     }
 * }
 * ```
 * 
 * ## Import
 * 
 * Using `pulumi import`, import an EventBridge policy using the `event_bus_name`. For example:
 * 
 * ```sh
 *  $ pulumi import aws:cloudwatch/eventBusPolicy:EventBusPolicy DevAccountAccess example-event-bus
 * ```
 * 
 */
@ResourceType(type="aws:cloudwatch/eventBusPolicy:EventBusPolicy")
public class EventBusPolicy extends com.pulumi.resources.CustomResource {
    /**
     * The name of the event bus to set the permissions on.
     * If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    @Export(name="eventBusName", refs={String.class}, tree="[0]")
    private Output</* @Nullable */ String> eventBusName;

    /**
     * @return The name of the event bus to set the permissions on.
     * If you omit this, the permissions are set on the `default` event bus.
     * 
     */
    public Output<Optional<String>> eventBusName() {
        return Codegen.optional(this.eventBusName);
    }
    /**
     * The text of the policy.
     * 
     */
    @Export(name="policy", refs={String.class}, tree="[0]")
    private Output<String> policy;

    /**
     * @return The text of the policy.
     * 
     */
    public Output<String> policy() {
        return this.policy;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public EventBusPolicy(String name) {
        this(name, EventBusPolicyArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public EventBusPolicy(String name, EventBusPolicyArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public EventBusPolicy(String name, EventBusPolicyArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventBusPolicy:EventBusPolicy", name, args == null ? EventBusPolicyArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private EventBusPolicy(String name, Output<String> id, @Nullable EventBusPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:cloudwatch/eventBusPolicy:EventBusPolicy", name, state, makeResourceOptions(options, id));
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
    public static EventBusPolicy get(String name, Output<String> id, @Nullable EventBusPolicyState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new EventBusPolicy(name, id, state, options);
    }
}
