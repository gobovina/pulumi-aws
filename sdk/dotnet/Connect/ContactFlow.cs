// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect
{
    /// <summary>
    /// Provides an Amazon Connect Contact Flow resource. For more information see
    /// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
    /// 
    /// This resource embeds or references Contact Flows specified in Amazon Connect Contact Flow Language. For more information see
    /// [Amazon Connect Flow language](https://docs.aws.amazon.com/connect/latest/adminguide/flow-language.html)
    /// 
    /// !&gt; **WARN:** Contact Flows exported from the Console [Contact Flow import/export](https://docs.aws.amazon.com/connect/latest/adminguide/contact-flow-import-export.html) are not in the Amazon Connect Contact Flow Language and can not be used with this resource. Instead, the recommendation is to use the AWS CLI [`describe-contact-flow`](https://awscli.amazonaws.com/v2/documentation/api/latest/reference/connect/describe-contact-flow.html).
    /// See example below which uses `jq` to extract the `Content` attribute and saves it to a local file.
    /// 
    /// ## Example Usage
    /// ### Basic
    /// 
    /// ```csharp
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// class MyStack : Stack
    /// {
    ///     public MyStack()
    ///     {
    ///         var test = new Aws.Connect.ContactFlow("test", new Aws.Connect.ContactFlowArgs
    ///         {
    ///             Content = @"	{
    /// 		""Version"": ""2019-10-30"",
    /// 		""StartAction"": ""12345678-1234-1234-1234-123456789012"",
    /// 		""Actions"": [
    /// 			{
    /// 				""Identifier"": ""12345678-1234-1234-1234-123456789012"",
    /// 				""Type"": ""MessageParticipant"",
    /// 				""Transitions"": {
    /// 					""NextAction"": ""abcdef-abcd-abcd-abcd-abcdefghijkl"",
    /// 					""Errors"": [],
    /// 					""Conditions"": []
    /// 				},
    /// 				""Parameters"": {
    /// 					""Text"": ""Thanks for calling the sample flow!""
    /// 				}
    /// 			},
    /// 			{
    /// 				""Identifier"": ""abcdef-abcd-abcd-abcd-abcdefghijkl"",
    /// 				""Type"": ""DisconnectParticipant"",
    /// 				""Transitions"": {},
    /// 				""Parameters"": {}
    /// 			}
    /// 		]
    /// 	}
    /// 	
    /// ",
    ///             Description = "Test Contact Flow Description",
    ///             InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
    ///             Tags = 
    ///             {
    ///                 { "Application", "Terraform" },
    ///                 { "Method", "Create" },
    ///                 { "Name", "Test Contact Flow" },
    ///             },
    ///             Type = "CONTACT_FLOW",
    ///         });
    ///     }
    /// 
    /// }
    /// ```
    /// 
    /// ## Import
    /// 
    /// Amazon Connect Contact Flows can be imported using the `instance_id` and `contact_flow_id` separated by a colon (`:`), e.g.,
    /// 
    /// ```sh
    ///  $ pulumi import aws:connect/contactFlow:ContactFlow example f1288a1f-6193-445a-b47e-af739b2:c1d4e5f6-1b3c-1b3c-1b3c-c1d4e5f6c1d4e5
    /// ```
    /// </summary>
    [AwsResourceType("aws:connect/contactFlow:ContactFlow")]
    public partial class ContactFlow : Pulumi.CustomResource
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the Contact Flow.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The identifier of the Contact Flow.
        /// </summary>
        [Output("contactFlowId")]
        public Output<string> ContactFlowId { get; private set; } = null!;

        /// <summary>
        /// Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
        /// </summary>
        [Output("content")]
        public Output<string> Content { get; private set; } = null!;

        [Output("contentHash")]
        public Output<string?> ContentHash { get; private set; } = null!;

        /// <summary>
        /// Specifies the description of the Contact Flow.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
        /// </summary>
        [Output("filename")]
        public Output<string?> Filename { get; private set; } = null!;

        /// <summary>
        /// Specifies the identifier of the hosting Amazon Connect Instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Specifies the name of the Contact Flow.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// Tags to apply to the Contact Flow. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
        /// </summary>
        [Output("type")]
        public Output<string?> Type { get; private set; } = null!;


        /// <summary>
        /// Create a ContactFlow resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ContactFlow(string name, ContactFlowArgs args, CustomResourceOptions? options = null)
            : base("aws:connect/contactFlow:ContactFlow", name, args ?? new ContactFlowArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ContactFlow(string name, Input<string> id, ContactFlowState? state = null, CustomResourceOptions? options = null)
            : base("aws:connect/contactFlow:ContactFlow", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ContactFlow resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ContactFlow Get(string name, Input<string> id, ContactFlowState? state = null, CustomResourceOptions? options = null)
        {
            return new ContactFlow(name, id, state, options);
        }
    }

    public sealed class ContactFlowArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        [Input("contentHash")]
        public Input<string>? ContentHash { get; set; }

        /// <summary>
        /// Specifies the description of the Contact Flow.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
        /// </summary>
        [Input("filename")]
        public Input<string>? Filename { get; set; }

        /// <summary>
        /// Specifies the identifier of the hosting Amazon Connect Instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Specifies the name of the Contact Flow.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the Contact Flow. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ContactFlowArgs()
        {
        }
    }

    public sealed class ContactFlowState : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the Contact Flow.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The identifier of the Contact Flow.
        /// </summary>
        [Input("contactFlowId")]
        public Input<string>? ContactFlowId { get; set; }

        /// <summary>
        /// Specifies the content of the Contact Flow, provided as a JSON string, written in Amazon Connect Contact Flow Language. If defined, the `filename` argument cannot be used.
        /// </summary>
        [Input("content")]
        public Input<string>? Content { get; set; }

        [Input("contentHash")]
        public Input<string>? ContentHash { get; set; }

        /// <summary>
        /// Specifies the description of the Contact Flow.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The path to the Contact Flow source within the local filesystem. Conflicts with `content`.
        /// </summary>
        [Input("filename")]
        public Input<string>? Filename { get; set; }

        /// <summary>
        /// Specifies the identifier of the hosting Amazon Connect Instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Specifies the name of the Contact Flow.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the Contact Flow. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        [Input("tagsAll")]
        private InputMap<string>? _tagsAll;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// Specifies the type of the Contact Flow. Defaults to `CONTACT_FLOW`. Allowed Values are: `CONTACT_FLOW`, `CUSTOMER_QUEUE`, `CUSTOMER_HOLD`, `CUSTOMER_WHISPER`, `AGENT_HOLD`, `AGENT_WHISPER`, `OUTBOUND_WHISPER`, `AGENT_TRANSFER`, `QUEUE_TRANSFER`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public ContactFlowState()
        {
        }
    }
}
