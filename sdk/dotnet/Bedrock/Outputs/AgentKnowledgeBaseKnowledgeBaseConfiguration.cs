// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Bedrock.Outputs
{

    [OutputType]
    public sealed class AgentKnowledgeBaseKnowledgeBaseConfiguration
    {
        /// <summary>
        /// Type of data that the data source is converted into for the knowledge base. Valid Values: `VECTOR`.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Details about the embeddings model that'sused to convert the data source. See `vector_knowledge_base_configuration` block for details.
        /// </summary>
        public readonly Outputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfiguration? VectorKnowledgeBaseConfiguration;

        [OutputConstructor]
        private AgentKnowledgeBaseKnowledgeBaseConfiguration(
            string type,

            Outputs.AgentKnowledgeBaseKnowledgeBaseConfigurationVectorKnowledgeBaseConfiguration? vectorKnowledgeBaseConfiguration)
        {
            Type = type;
            VectorKnowledgeBaseConfiguration = vectorKnowledgeBaseConfiguration;
        }
    }
}
