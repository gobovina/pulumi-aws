// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SecurityHub
{
    /// <summary>
    /// Creates Security Hub custom action.
    /// 
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var exampleAccount = new Aws.SecurityHub.Account("exampleAccount");
    /// 
    ///     var exampleActionTarget = new Aws.SecurityHub.ActionTarget("exampleActionTarget", new()
    ///     {
    ///         Identifier = "SendToChat",
    ///         Description = "This is custom action sends selected findings to chat",
    ///     }, new CustomResourceOptions
    ///     {
    ///         DependsOn = new[]
    ///         {
    ///             exampleAccount,
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Security Hub custom action using the action target ARN. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:securityhub/actionTarget:ActionTarget example arn:aws:securityhub:eu-west-1:312940875350:action/custom/a
    /// ```
    /// </summary>
    [AwsResourceType("aws:securityhub/actionTarget:ActionTarget")]
    public partial class ActionTarget : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Security Hub custom action target.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The name of the custom action target.
        /// </summary>
        [Output("description")]
        public Output<string> Description { get; private set; } = null!;

        /// <summary>
        /// The ID for the custom action target.
        /// </summary>
        [Output("identifier")]
        public Output<string> Identifier { get; private set; } = null!;

        /// <summary>
        /// The description for the custom action target.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;


        /// <summary>
        /// Create a ActionTarget resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ActionTarget(string name, ActionTargetArgs args, CustomResourceOptions? options = null)
            : base("aws:securityhub/actionTarget:ActionTarget", name, args ?? new ActionTargetArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ActionTarget(string name, Input<string> id, ActionTargetState? state = null, CustomResourceOptions? options = null)
            : base("aws:securityhub/actionTarget:ActionTarget", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing ActionTarget resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ActionTarget Get(string name, Input<string> id, ActionTargetState? state = null, CustomResourceOptions? options = null)
        {
            return new ActionTarget(name, id, state, options);
        }
    }

    public sealed class ActionTargetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The name of the custom action target.
        /// </summary>
        [Input("description", required: true)]
        public Input<string> Description { get; set; } = null!;

        /// <summary>
        /// The ID for the custom action target.
        /// </summary>
        [Input("identifier", required: true)]
        public Input<string> Identifier { get; set; } = null!;

        /// <summary>
        /// The description for the custom action target.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ActionTargetArgs()
        {
        }
        public static new ActionTargetArgs Empty => new ActionTargetArgs();
    }

    public sealed class ActionTargetState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Amazon Resource Name (ARN) of the Security Hub custom action target.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The name of the custom action target.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The ID for the custom action target.
        /// </summary>
        [Input("identifier")]
        public Input<string>? Identifier { get; set; }

        /// <summary>
        /// The description for the custom action target.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        public ActionTargetState()
        {
        }
        public static new ActionTargetState Empty => new ActionTargetState();
    }
}
