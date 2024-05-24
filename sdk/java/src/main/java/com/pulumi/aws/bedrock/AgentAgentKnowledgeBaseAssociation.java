// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.aws.bedrock;

import com.pulumi.aws.Utilities;
import com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs;
import com.pulumi.aws.bedrock.inputs.AgentAgentKnowledgeBaseAssociationState;
import com.pulumi.core.Output;
import com.pulumi.core.annotations.Export;
import com.pulumi.core.annotations.ResourceType;
import com.pulumi.core.internal.Codegen;
import java.lang.String;
import javax.annotation.Nullable;

/**
 * Resource for managing an AWS Agents for Amazon Bedrock Agent Knowledge Base Association.
 * 
 * ## Example Usage
 * 
 * ### Basic Usage
 * 
 * &lt;!--Start PulumiCodeChooser --&gt;
 * <pre>
 * {@code
 * package generated_program;
 * 
 * import com.pulumi.Context;
 * import com.pulumi.Pulumi;
 * import com.pulumi.core.Output;
 * import com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociation;
 * import com.pulumi.aws.bedrock.AgentAgentKnowledgeBaseAssociationArgs;
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
 *         var example = new AgentAgentKnowledgeBaseAssociation("example", AgentAgentKnowledgeBaseAssociationArgs.builder()
 *             .agentId("GGRRAED6JP")
 *             .description("Example Knowledge base")
 *             .knowledgeBaseId("EMDPPAYPZI")
 *             .knowledgeBaseState("ENABLED")
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
 * Using `pulumi import`, import Agents for Amazon Bedrock Agent Knowledge Base Association using the agent ID, the agent version, and the knowledge base ID separated by `,`. For example:
 * 
 * ```sh
 * $ pulumi import aws:bedrock/agentAgentKnowledgeBaseAssociation:AgentAgentKnowledgeBaseAssociation example GGRRAED6JP,DRAFT,EMDPPAYPZI
 * ```
 * 
 */
@ResourceType(type="aws:bedrock/agentAgentKnowledgeBaseAssociation:AgentAgentKnowledgeBaseAssociation")
public class AgentAgentKnowledgeBaseAssociation extends com.pulumi.resources.CustomResource {
    /**
     * Unique identifier of the agent with which you want to associate the knowledge base.
     * 
     */
    @Export(name="agentId", refs={String.class}, tree="[0]")
    private Output<String> agentId;

    /**
     * @return Unique identifier of the agent with which you want to associate the knowledge base.
     * 
     */
    public Output<String> agentId() {
        return this.agentId;
    }
    /**
     * Version of the agent with which you want to associate the knowledge base. Valid values: `DRAFT`.
     * 
     */
    @Export(name="agentVersion", refs={String.class}, tree="[0]")
    private Output<String> agentVersion;

    /**
     * @return Version of the agent with which you want to associate the knowledge base. Valid values: `DRAFT`.
     * 
     */
    public Output<String> agentVersion() {
        return this.agentVersion;
    }
    /**
     * Description of what the agent should use the knowledge base for.
     * 
     */
    @Export(name="description", refs={String.class}, tree="[0]")
    private Output<String> description;

    /**
     * @return Description of what the agent should use the knowledge base for.
     * 
     */
    public Output<String> description() {
        return this.description;
    }
    /**
     * Unique identifier of the knowledge base to associate with the agent.
     * 
     */
    @Export(name="knowledgeBaseId", refs={String.class}, tree="[0]")
    private Output<String> knowledgeBaseId;

    /**
     * @return Unique identifier of the knowledge base to associate with the agent.
     * 
     */
    public Output<String> knowledgeBaseId() {
        return this.knowledgeBaseId;
    }
    /**
     * Whether to use the knowledge base when sending an [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html) request. Valid values: `ENABLED`, `DISABLED`.
     * 
     * The following arguments are optional:
     * 
     */
    @Export(name="knowledgeBaseState", refs={String.class}, tree="[0]")
    private Output<String> knowledgeBaseState;

    /**
     * @return Whether to use the knowledge base when sending an [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html) request. Valid values: `ENABLED`, `DISABLED`.
     * 
     * The following arguments are optional:
     * 
     */
    public Output<String> knowledgeBaseState() {
        return this.knowledgeBaseState;
    }

    /**
     *
     * @param name The _unique_ name of the resulting resource.
     */
    public AgentAgentKnowledgeBaseAssociation(String name) {
        this(name, AgentAgentKnowledgeBaseAssociationArgs.Empty);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     */
    public AgentAgentKnowledgeBaseAssociation(String name, AgentAgentKnowledgeBaseAssociationArgs args) {
        this(name, args, null);
    }
    /**
     *
     * @param name The _unique_ name of the resulting resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param options A bag of options that control this resource's behavior.
     */
    public AgentAgentKnowledgeBaseAssociation(String name, AgentAgentKnowledgeBaseAssociationArgs args, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:bedrock/agentAgentKnowledgeBaseAssociation:AgentAgentKnowledgeBaseAssociation", name, args == null ? AgentAgentKnowledgeBaseAssociationArgs.Empty : args, makeResourceOptions(options, Codegen.empty()));
    }

    private AgentAgentKnowledgeBaseAssociation(String name, Output<String> id, @Nullable AgentAgentKnowledgeBaseAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        super("aws:bedrock/agentAgentKnowledgeBaseAssociation:AgentAgentKnowledgeBaseAssociation", name, state, makeResourceOptions(options, id));
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
    public static AgentAgentKnowledgeBaseAssociation get(String name, Output<String> id, @Nullable AgentAgentKnowledgeBaseAssociationState state, @Nullable com.pulumi.resources.CustomResourceOptions options) {
        return new AgentAgentKnowledgeBaseAssociation(name, id, state, options);
    }
}
