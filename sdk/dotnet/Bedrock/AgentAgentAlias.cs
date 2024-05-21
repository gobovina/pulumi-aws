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
    /// Resource for managing an AWS Agents for Amazon Bedrock Agent Alias.
    /// 
    /// ## Example Usage
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Agents for Amazon Bedrock Agent Alias using the alias ID and the agent ID separated by `,`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:bedrock/agentAgentAlias:AgentAgentAlias example 66IVY0GUTF,GGRRAED6JP
    /// ```
    /// </summary>
    [AwsResourceType("aws:bedrock/agentAgentAlias:AgentAgentAlias")]
    public partial class AgentAgentAlias : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the alias.
        /// </summary>
        [Output("agentAliasArn")]
        public Output<string> AgentAliasArn { get; private set; } = null!;

        /// <summary>
        /// Unique identifier of the alias.
        /// </summary>
        [Output("agentAliasId")]
        public Output<string> AgentAliasId { get; private set; } = null!;

        /// <summary>
        /// Name of the alias.
        /// </summary>
        [Output("agentAliasName")]
        public Output<string> AgentAliasName { get; private set; } = null!;

        /// <summary>
        /// Identifier of the agent to create an alias for.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("agentId")]
        public Output<string> AgentId { get; private set; } = null!;

        /// <summary>
        /// Description of the alias.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// Details about the routing configuration of the alias. See `routing_configuration` block for details.
        /// </summary>
        [Output("routingConfigurations")]
        public Output<ImmutableArray<Outputs.AgentAgentAliasRoutingConfiguration>> RoutingConfigurations { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        [Output("timeouts")]
        public Output<Outputs.AgentAgentAliasTimeouts?> Timeouts { get; private set; } = null!;


        /// <summary>
        /// Create a AgentAgentAlias resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public AgentAgentAlias(string name, AgentAgentAliasArgs args, CustomResourceOptions? options = null)
            : base("aws:bedrock/agentAgentAlias:AgentAgentAlias", name, args ?? new AgentAgentAliasArgs(), MakeResourceOptions(options, ""))
        {
        }

        private AgentAgentAlias(string name, Input<string> id, AgentAgentAliasState? state = null, CustomResourceOptions? options = null)
            : base("aws:bedrock/agentAgentAlias:AgentAgentAlias", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing AgentAgentAlias resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static AgentAgentAlias Get(string name, Input<string> id, AgentAgentAliasState? state = null, CustomResourceOptions? options = null)
        {
            return new AgentAgentAlias(name, id, state, options);
        }
    }

    public sealed class AgentAgentAliasArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Name of the alias.
        /// </summary>
        [Input("agentAliasName", required: true)]
        public Input<string> AgentAliasName { get; set; } = null!;

        /// <summary>
        /// Identifier of the agent to create an alias for.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("agentId", required: true)]
        public Input<string> AgentId { get; set; } = null!;

        /// <summary>
        /// Description of the alias.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("routingConfigurations")]
        private InputList<Inputs.AgentAgentAliasRoutingConfigurationArgs>? _routingConfigurations;

        /// <summary>
        /// Details about the routing configuration of the alias. See `routing_configuration` block for details.
        /// </summary>
        public InputList<Inputs.AgentAgentAliasRoutingConfigurationArgs> RoutingConfigurations
        {
            get => _routingConfigurations ?? (_routingConfigurations = new InputList<Inputs.AgentAgentAliasRoutingConfigurationArgs>());
            set => _routingConfigurations = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags assigned to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("timeouts")]
        public Input<Inputs.AgentAgentAliasTimeoutsArgs>? Timeouts { get; set; }

        public AgentAgentAliasArgs()
        {
        }
        public static new AgentAgentAliasArgs Empty => new AgentAgentAliasArgs();
    }

    public sealed class AgentAgentAliasState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the alias.
        /// </summary>
        [Input("agentAliasArn")]
        public Input<string>? AgentAliasArn { get; set; }

        /// <summary>
        /// Unique identifier of the alias.
        /// </summary>
        [Input("agentAliasId")]
        public Input<string>? AgentAliasId { get; set; }

        /// <summary>
        /// Name of the alias.
        /// </summary>
        [Input("agentAliasName")]
        public Input<string>? AgentAliasName { get; set; }

        /// <summary>
        /// Identifier of the agent to create an alias for.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("agentId")]
        public Input<string>? AgentId { get; set; }

        /// <summary>
        /// Description of the alias.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        [Input("routingConfigurations")]
        private InputList<Inputs.AgentAgentAliasRoutingConfigurationGetArgs>? _routingConfigurations;

        /// <summary>
        /// Details about the routing configuration of the alias. See `routing_configuration` block for details.
        /// </summary>
        public InputList<Inputs.AgentAgentAliasRoutingConfigurationGetArgs> RoutingConfigurations
        {
            get => _routingConfigurations ?? (_routingConfigurations = new InputList<Inputs.AgentAgentAliasRoutingConfigurationGetArgs>());
            set => _routingConfigurations = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Map of tags assigned to the resource. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// Map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        [Input("timeouts")]
        public Input<Inputs.AgentAgentAliasTimeoutsGetArgs>? Timeouts { get; set; }

        public AgentAgentAliasState()
        {
        }
        public static new AgentAgentAliasState Empty => new AgentAgentAliasState();
    }
}
