// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Bedrock
{
    /// <summary>
    /// Resource for managing an AWS Agents for Amazon Bedrock Agent Knowledge Base Association.
    /// 
    /// ## Example Usage
    /// 
    /// ### Basic Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Bedrock.AgentAgentKnowledgeBaseAssociation("example", new()
    ///     {
    ///         AgentId = "GGRRAED6JP",
    ///         Description = "Example Knowledge base",
    ///         KnowledgeBaseId = "EMDPPAYPZI",
    ///         KnowledgeBaseState = "ENABLED",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Agents for Amazon Bedrock Agent Knowledge Base Association using the agent ID, the agent version, and the knowledge base ID separated by `,`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:bedrock/agentAgentKnowledgeBaseAssociation:AgentAgentKnowledgeBaseAssociation example GGRRAED6JP,DRAFT,EMDPPAYPZI
    /// ```
    /// </summary>
    [AwsResourceType("aws:bedrock/agentAgentKnowledgeBaseAssociation:AgentAgentKnowledgeBaseAssociation")]
    public partial class AgentAgentKnowledgeBaseAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Unique identifier of the agent with which you want to associate the knowledge base.
        /// </summary>
        [Output("agentId")]
        public Output<string> AgentId { get; private set; } = null!;

        /// <summary>
        /// Version of the agent with which you want to associate the knowledge base. Valid values: `DRAFT`.
        /// </summary>
        [Output("agentVersion")]
        public Output<string> AgentVersion { get; private set; } = null!;

        /// <summary>
        /// Description of what the agent should use the knowledge base for.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the knowledge base to associate with the agent.
        /// </summary>
        [Output("knowledgeBaseId")]
        public Output<string> KnowledgeBaseId { get; private set; } = null!;

        /// <summary>
        /// Whether to use the knowledge base when sending an [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html) request. Valid values: `ENABLED`, `DISABLED`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("knowledgeBaseState")]
        public Output<string> KnowledgeBaseState { get; private set; } = null!;


        /// <summary>
        /// Create a AgentAgentKnowledgeBaseAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AgentAgentKnowledgeBaseAssociation(string name, AgentAgentKnowledgeBaseAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:bedrock/agentAgentKnowledgeBaseAssociation:AgentAgentKnowledgeBaseAssociation", name, args ?? new AgentAgentKnowledgeBaseAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AgentAgentKnowledgeBaseAssociation(string name, Input<string> id, AgentAgentKnowledgeBaseAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:bedrock/agentAgentKnowledgeBaseAssociation:AgentAgentKnowledgeBaseAssociation", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing AgentAgentKnowledgeBaseAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AgentAgentKnowledgeBaseAssociation Get(string name, Input<string> id, AgentAgentKnowledgeBaseAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new AgentAgentKnowledgeBaseAssociation(name, id, state, options);
        }
    }

    public sealed class AgentAgentKnowledgeBaseAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier of the agent with which you want to associate the knowledge base.
        /// </summary>
        [Input("agentId", required: true)]
        public Input<string> AgentId { get; set; } = null!;

        /// <summary>
        /// Version of the agent with which you want to associate the knowledge base. Valid values: `DRAFT`.
        /// </summary>
        [Input("agentVersion")]
        public Input<string>? AgentVersion { get; set; }

        /// <summary>
        /// Description of what the agent should use the knowledge base for.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// Unique identifier of the knowledge base to associate with the agent.
        /// </summary>
        [Input("knowledgeBaseId", required: true)]
        public Input<string> KnowledgeBaseId { get; set; } = null!;

        /// <summary>
        /// Whether to use the knowledge base when sending an [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html) request. Valid values: `ENABLED`, `DISABLED`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("knowledgeBaseState", required: true)]
        public Input<string> KnowledgeBaseState { get; set; } = null!;

        public AgentAgentKnowledgeBaseAssociationArgs()
        {
        }
        public static new AgentAgentKnowledgeBaseAssociationArgs Empty => new AgentAgentKnowledgeBaseAssociationArgs();
    }

    public sealed class AgentAgentKnowledgeBaseAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique identifier of the agent with which you want to associate the knowledge base.
        /// </summary>
        [Input("agentId")]
        public Input<string>? AgentId { get; set; }

        /// <summary>
        /// Version of the agent with which you want to associate the knowledge base. Valid values: `DRAFT`.
        /// </summary>
        [Input("agentVersion")]
        public Input<string>? AgentVersion { get; set; }

        /// <summary>
        /// Description of what the agent should use the knowledge base for.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// Unique identifier of the knowledge base to associate with the agent.
        /// </summary>
        [Input("knowledgeBaseId")]
        public Input<string>? KnowledgeBaseId { get; set; }

        /// <summary>
        /// Whether to use the knowledge base when sending an [InvokeAgent](https://docs.aws.amazon.com/bedrock/latest/APIReference/API_agent-runtime_InvokeAgent.html) request. Valid values: `ENABLED`, `DISABLED`.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("knowledgeBaseState")]
        public Input<string>? KnowledgeBaseState { get; set; }

        public AgentAgentKnowledgeBaseAssociationState()
        {
        }
        public static new AgentAgentKnowledgeBaseAssociationState Empty => new AgentAgentKnowledgeBaseAssociationState();
    }
}
