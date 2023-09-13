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
    /// Allows the specified Amazon Connect instance to access the specified Amazon Lex (V1) bot. For more information see
    /// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html) and [Add an Amazon Lex bot](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-lex.html).
    /// 
    /// &gt; **NOTE:** This resource only currently supports Amazon Lex (V1) Associations.
    /// 
    /// ## Example Usage
    /// ### Basic
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Connect.BotAssociation("example", new()
    ///     {
    ///         InstanceId = aws_connect_instance.Example.Id,
    ///         LexBot = new Aws.Connect.Inputs.BotAssociationLexBotArgs
    ///         {
    ///             LexRegion = "us-west-2",
    ///             Name = "Test",
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Including a sample Lex bot
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var current = Aws.GetRegion.Invoke();
    /// 
    ///     var exampleIntent = new Aws.Lex.Intent("exampleIntent", new()
    ///     {
    ///         CreateVersion = true,
    ///         Name = "connect_lex_intent",
    ///         FulfillmentActivity = new Aws.Lex.Inputs.IntentFulfillmentActivityArgs
    ///         {
    ///             Type = "ReturnIntent",
    ///         },
    ///         SampleUtterances = new[]
    ///         {
    ///             "I would like to pick up flowers.",
    ///         },
    ///     });
    /// 
    ///     var exampleBot = new Aws.Lex.Bot("exampleBot", new()
    ///     {
    ///         AbortStatement = new Aws.Lex.Inputs.BotAbortStatementArgs
    ///         {
    ///             Messages = new[]
    ///             {
    ///                 new Aws.Lex.Inputs.BotAbortStatementMessageArgs
    ///                 {
    ///                     Content = "Sorry, I am not able to assist at this time.",
    ///                     ContentType = "PlainText",
    ///                 },
    ///             },
    ///         },
    ///         ClarificationPrompt = new Aws.Lex.Inputs.BotClarificationPromptArgs
    ///         {
    ///             MaxAttempts = 2,
    ///             Messages = new[]
    ///             {
    ///                 new Aws.Lex.Inputs.BotClarificationPromptMessageArgs
    ///                 {
    ///                     Content = "I didn't understand you, what would you like to do?",
    ///                     ContentType = "PlainText",
    ///                 },
    ///             },
    ///         },
    ///         Intents = new[]
    ///         {
    ///             new Aws.Lex.Inputs.BotIntentArgs
    ///             {
    ///                 IntentName = exampleIntent.Name,
    ///                 IntentVersion = "1",
    ///             },
    ///         },
    ///         ChildDirected = false,
    ///         Name = "connect_lex_bot",
    ///         ProcessBehavior = "BUILD",
    ///     });
    /// 
    ///     var exampleBotAssociation = new Aws.Connect.BotAssociation("exampleBotAssociation", new()
    ///     {
    ///         InstanceId = aws_connect_instance.Example.Id,
    ///         LexBot = new Aws.Connect.Inputs.BotAssociationLexBotArgs
    ///         {
    ///             LexRegion = current.Apply(getRegionResult =&gt; getRegionResult.Name),
    ///             Name = exampleBot.Name,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// In TODO v1.5.0 and later, use an `import` block to import `aws_connect_bot_association` using the Amazon Connect instance ID, Lex (V1) bot name, and Lex (V1) bot region separated by colons (`:`). For exampleterraform import {
    /// 
    ///  to = aws_connect_bot_association.example
    /// 
    ///  id = "aaaaaaaa-bbbb-cccc-dddd-111111111111:Example:us-west-2" } Using `TODO import`, import `aws_connect_bot_association` using the Amazon Connect instance ID, Lex (V1) bot name, and Lex (V1) bot region separated by colons (`:`). For exampleconsole % TODO import aws_connect_bot_association.example aaaaaaaa-bbbb-cccc-dddd-111111111111:Example:us-west-2
    /// </summary>
    [AwsResourceType("aws:connect/botAssociation:BotAssociation")]
    public partial class BotAssociation : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
        /// </summary>
        [Output("instanceId")]
        public Output<string> InstanceId { get; private set; } = null!;

        /// <summary>
        /// Configuration information of an Amazon Lex (V1) bot. Detailed below.
        /// </summary>
        [Output("lexBot")]
        public Output<Outputs.BotAssociationLexBot> LexBot { get; private set; } = null!;


        /// <summary>
        /// Create a BotAssociation resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public BotAssociation(string name, BotAssociationArgs args, CustomResourceOptions? options = null)
            : base("aws:connect/botAssociation:BotAssociation", name, args ?? new BotAssociationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private BotAssociation(string name, Input<string> id, BotAssociationState? state = null, CustomResourceOptions? options = null)
            : base("aws:connect/botAssociation:BotAssociation", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing BotAssociation resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static BotAssociation Get(string name, Input<string> id, BotAssociationState? state = null, CustomResourceOptions? options = null)
        {
            return new BotAssociation(name, id, state, options);
        }
    }

    public sealed class BotAssociationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Configuration information of an Amazon Lex (V1) bot. Detailed below.
        /// </summary>
        [Input("lexBot", required: true)]
        public Input<Inputs.BotAssociationLexBotArgs> LexBot { get; set; } = null!;

        public BotAssociationArgs()
        {
        }
        public static new BotAssociationArgs Empty => new BotAssociationArgs();
    }

    public sealed class BotAssociationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
        /// </summary>
        [Input("instanceId")]
        public Input<string>? InstanceId { get; set; }

        /// <summary>
        /// Configuration information of an Amazon Lex (V1) bot. Detailed below.
        /// </summary>
        [Input("lexBot")]
        public Input<Inputs.BotAssociationLexBotGetArgs>? LexBot { get; set; }

        public BotAssociationState()
        {
        }
        public static new BotAssociationState Empty => new BotAssociationState();
    }
}
