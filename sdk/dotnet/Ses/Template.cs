// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ses
{
    /// <summary>
    /// Provides a resource to create a SES template.
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
    ///     var myTemplate = new Aws.Ses.Template("MyTemplate", new()
    ///     {
    ///         Name = "MyTemplate",
    ///         Subject = "Greetings, {{name}}!",
    ///         Html = "&lt;h1&gt;Hello {{name}},&lt;/h1&gt;&lt;p&gt;Your favorite animal is {{favoriteanimal}}.&lt;/p&gt;",
    ///         Text = @"Hello {{name}},
    /// Your favorite animal is {{favoriteanimal}}.",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import SES templates using the template name. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:ses/template:Template MyTemplate MyTemplate
    /// ```
    /// </summary>
    [AwsResourceType("aws:ses/template:Template")]
    public partial class Template : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the SES template
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
        /// </summary>
        [Output("html")]
        public Output<string?> Html { get; private set; } = null!;

        /// <summary>
        /// The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
        /// </summary>
        [Output("name")]
        public Output<string> Name { get; private set; } = null!;

        /// <summary>
        /// The subject line of the email.
        /// </summary>
        [Output("subject")]
        public Output<string?> Subject { get; private set; } = null!;

        /// <summary>
        /// The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
        /// </summary>
        [Output("text")]
        public Output<string?> Text { get; private set; } = null!;


        /// <summary>
        /// Create a Template resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public Template(string name, TemplateArgs? args = null, CustomResourceOptions? options = null)
            : base("aws:ses/template:Template", name, args ?? new TemplateArgs(), MakeResourceOptions(options, ""))
        {
        }

        private Template(string name, Input<string> id, TemplateState? state = null, CustomResourceOptions? options = null)
            : base("aws:ses/template:Template", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing Template resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static Template Get(string name, Input<string> id, TemplateState? state = null, CustomResourceOptions? options = null)
        {
            return new Template(name, id, state, options);
        }
    }

    public sealed class TemplateArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
        /// </summary>
        [Input("html")]
        public Input<string>? Html { get; set; }

        /// <summary>
        /// The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The subject line of the email.
        /// </summary>
        [Input("subject")]
        public Input<string>? Subject { get; set; }

        /// <summary>
        /// The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
        /// </summary>
        [Input("text")]
        public Input<string>? Text { get; set; }

        public TemplateArgs()
        {
        }
        public static new TemplateArgs Empty => new TemplateArgs();
    }

    public sealed class TemplateState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the SES template
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The HTML body of the email. Must be less than 500KB in size, including both the text and HTML parts.
        /// </summary>
        [Input("html")]
        public Input<string>? Html { get; set; }

        /// <summary>
        /// The name of the template. Cannot exceed 64 characters. You will refer to this name when you send email.
        /// </summary>
        [Input("name")]
        public Input<string>? Name { get; set; }

        /// <summary>
        /// The subject line of the email.
        /// </summary>
        [Input("subject")]
        public Input<string>? Subject { get; set; }

        /// <summary>
        /// The email body that will be visible to recipients whose email clients do not display HTML. Must be less than 500KB in size, including both the text and HTML parts.
        /// </summary>
        [Input("text")]
        public Input<string>? Text { get; set; }

        public TemplateState()
        {
        }
        public static new TemplateState Empty => new TemplateState();
    }
}
