// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Connect
{
    public static class GetBotAssociation
    {
        /// <summary>
        /// Provides details about a specific Lex (V1) Bot associated with an Amazon Connect instance.
        /// 
        /// ## Example Usage
        /// 
        /// ### By name
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Connect.GetBotAssociation.Invoke(new()
        ///     {
        ///         InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///         LexBot = new Aws.Connect.Inputs.GetBotAssociationLexBotInputArgs
        ///         {
        ///             Name = "Test",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Task<GetBotAssociationResult> InvokeAsync(GetBotAssociationArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.InvokeAsync<GetBotAssociationResult>("aws:connect/getBotAssociation:getBotAssociation", args ?? new GetBotAssociationArgs(), options.WithDefaults());

        /// <summary>
        /// Provides details about a specific Lex (V1) Bot associated with an Amazon Connect instance.
        /// 
        /// ## Example Usage
        /// 
        /// ### By name
        /// 
        /// &lt;!--Start PulumiCodeChooser --&gt;
        /// ```csharp
        /// using System.Collections.Generic;
        /// using System.Linq;
        /// using Pulumi;
        /// using Aws = Pulumi.Aws;
        /// 
        /// return await Deployment.RunAsync(() =&gt; 
        /// {
        ///     var example = Aws.Connect.GetBotAssociation.Invoke(new()
        ///     {
        ///         InstanceId = "aaaaaaaa-bbbb-cccc-dddd-111111111111",
        ///         LexBot = new Aws.Connect.Inputs.GetBotAssociationLexBotInputArgs
        ///         {
        ///             Name = "Test",
        ///         },
        ///     });
        /// 
        /// });
        /// ```
        /// &lt;!--End PulumiCodeChooser --&gt;
        /// </summary>
        public static Output<GetBotAssociationResult> Invoke(GetBotAssociationInvokeArgs args, InvokeOptions? options = null)
            => global::Pulumi.Deployment.Instance.Invoke<GetBotAssociationResult>("aws:connect/getBotAssociation:getBotAssociation", args ?? new GetBotAssociationInvokeArgs(), options.WithDefaults());
    }


    public sealed class GetBotAssociationArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public string InstanceId { get; set; } = null!;

        /// <summary>
        /// Configuration information of an Amazon Lex (V1) bot. Detailed below.
        /// </summary>
        [Input("lexBot", required: true)]
        public Inputs.GetBotAssociationLexBotArgs LexBot { get; set; } = null!;

        public GetBotAssociationArgs()
        {
        }
        public static new GetBotAssociationArgs Empty => new GetBotAssociationArgs();
    }

    public sealed class GetBotAssociationInvokeArgs : global::Pulumi.InvokeArgs
    {
        /// <summary>
        /// Identifier of the Amazon Connect instance. You can find the instanceId in the ARN of the instance.
        /// </summary>
        [Input("instanceId", required: true)]
        public Input<string> InstanceId { get; set; } = null!;

        /// <summary>
        /// Configuration information of an Amazon Lex (V1) bot. Detailed below.
        /// </summary>
        [Input("lexBot", required: true)]
        public Input<Inputs.GetBotAssociationLexBotInputArgs> LexBot { get; set; } = null!;

        public GetBotAssociationInvokeArgs()
        {
        }
        public static new GetBotAssociationInvokeArgs Empty => new GetBotAssociationInvokeArgs();
    }


    [OutputType]
    public sealed class GetBotAssociationResult
    {
        /// <summary>
        /// The provider-assigned unique ID for this managed resource.
        /// </summary>
        public readonly string Id;
        public readonly string InstanceId;
        public readonly Outputs.GetBotAssociationLexBotResult LexBot;

        [OutputConstructor]
        private GetBotAssociationResult(
            string id,

            string instanceId,

            Outputs.GetBotAssociationLexBotResult lexBot)
        {
            Id = id;
            InstanceId = instanceId;
            LexBot = lexBot;
        }
    }
}
