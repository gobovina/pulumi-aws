// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Amplify
{
    /// <summary>
    /// Provides an Amplify Webhook resource.
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
    ///     var example = new Aws.Amplify.App("example");
    /// 
    ///     var masterBranch = new Aws.Amplify.Branch("masterBranch", new()
    ///     {
    ///         AppId = example.Id,
    ///         BranchName = "master",
    ///     });
    /// 
    ///     var masterWebhook = new Aws.Amplify.Webhook("masterWebhook", new()
    ///     {
    ///         AppId = example.Id,
    ///         BranchName = masterBranch.BranchName,
    ///         Description = "triggermaster",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Amplify webhook using a webhook ID. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:amplify/webhook:Webhook master a26b22a0-748b-4b57-b9a0-ae7e601fe4b1
    /// ```
    /// </summary>
    [AwsResourceType("aws:amplify/webhook:Webhook")]
    public partial class Webhook : global::Pulumi.CustomResource
    {
        /// <summary>
        /// Unique ID for an Amplify app.
        /// </summary>
        [Output("appId")]
        public Output<string> AppId { get; private set; } = null!;

        /// <summary>
        /// ARN for the webhook.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Name for a branch that is part of the Amplify app.
        /// </summary>
        [Output("branchName")]
        public Output<string> BranchName { get; private set; } = null!;

        /// <summary>
        /// Description for a webhook.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// URL of the webhook.
        /// </summary>
        [Output("url")]
        public Output<string> Url { get; private set; } = null!;


        /// <summary>
        /// Create a Webhook resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Webhook(string name, WebhookArgs args, CustomResourceOptions? options = null)
            : base("aws:amplify/webhook:Webhook", name, args ?? new WebhookArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Webhook(string name, Input<string> id, WebhookState? state = null, CustomResourceOptions? options = null)
            : base("aws:amplify/webhook:Webhook", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Webhook resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Webhook Get(string name, Input<string> id, WebhookState? state = null, CustomResourceOptions? options = null)
        {
            return new Webhook(name, id, state, options);
        }
    }

    public sealed class WebhookArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique ID for an Amplify app.
        /// </summary>
        [Input("appId", required: true)]
        public Input<string> AppId { get; set; } = null!;

        /// <summary>
        /// Name for a branch that is part of the Amplify app.
        /// </summary>
        [Input("branchName", required: true)]
        public Input<string> BranchName { get; set; } = null!;

        /// <summary>
        /// Description for a webhook.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        public WebhookArgs()
        {
        }
        public static new WebhookArgs Empty => new WebhookArgs();
    }

    public sealed class WebhookState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Unique ID for an Amplify app.
        /// </summary>
        [Input("appId")]
        public Input<string>? AppId { get; set; }

        /// <summary>
        /// ARN for the webhook.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Name for a branch that is part of the Amplify app.
        /// </summary>
        [Input("branchName")]
        public Input<string>? BranchName { get; set; }

        /// <summary>
        /// Description for a webhook.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// URL of the webhook.
        /// </summary>
        [Input("url")]
        public Input<string>? Url { get; set; }

        public WebhookState()
        {
        }
        public static new WebhookState Empty => new WebhookState();
    }
}
