// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppStream
{
    /// <summary>
    /// Provides an AppStream user.
    /// 
    /// ## Example Usage
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
    ///     var example = new Aws.AppStream.User("example", new()
    ///     {
    ///         AuthenticationType = "USERPOOL",
    ///         UserName = "EMAIL",
    ///         FirstName = "FIRST NAME",
    ///         LastName = "LAST NAME",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import `aws_appstream_user` using the `user_name` and `authentication_type` separated by a slash (`/`). For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:appstream/user:User example UserName/AuthenticationType
    /// ```
    /// </summary>
    [AwsResourceType("aws:appstream/user:User")]
    public partial class User : global::Pulumi.CustomResource
    {
        /// <summary>
        /// ARN of the appstream user.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// Authentication type for the user. You must specify USERPOOL. Valid values: `API`, `SAML`, `USERPOOL`
        /// </summary>
        [Output("authenticationType")]
        public Output<string> AuthenticationType { get; private set; } = null!;

        /// <summary>
        /// Date and time, in UTC and extended RFC 3339 format, when the user was created.
        /// </summary>
        [Output("createdTime")]
        public Output<string> CreatedTime { get; private set; } = null!;

        /// <summary>
        /// Whether the user in the user pool is enabled.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// First name, or given name, of the user.
        /// </summary>
        [Output("firstName")]
        public Output<string?> FirstName { get; private set; } = null!;

        /// <summary>
        /// Last name, or surname, of the user.
        /// </summary>
        [Output("lastName")]
        public Output<string?> LastName { get; private set; } = null!;

        /// <summary>
        /// Send an email notification.
        /// </summary>
        [Output("sendEmailNotification")]
        public Output<bool?> SendEmailNotification { get; private set; } = null!;

        /// <summary>
        /// Email address of the user.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Output("userName")]
        public Output<string> UserName { get; private set; } = null!;


        /// <summary>
        /// Create a User resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public User(string name, UserArgs args, CustomResourceOptions? options = null)
            : base("aws:appstream/user:User", name, args ?? new UserArgs(), MakeResourceOptions(options, ""))
        {
        }

        private User(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
            : base("aws:appstream/user:User", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing User resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static User Get(string name, Input<string> id, UserState? state = null, CustomResourceOptions? options = null)
        {
            return new User(name, id, state, options);
        }
    }

    public sealed class UserArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Authentication type for the user. You must specify USERPOOL. Valid values: `API`, `SAML`, `USERPOOL`
        /// </summary>
        [Input("authenticationType", required: true)]
        public Input<string> AuthenticationType { get; set; } = null!;

        /// <summary>
        /// Whether the user in the user pool is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// First name, or given name, of the user.
        /// </summary>
        [Input("firstName")]
        public Input<string>? FirstName { get; set; }

        /// <summary>
        /// Last name, or surname, of the user.
        /// </summary>
        [Input("lastName")]
        public Input<string>? LastName { get; set; }

        /// <summary>
        /// Send an email notification.
        /// </summary>
        [Input("sendEmailNotification")]
        public Input<bool>? SendEmailNotification { get; set; }

        /// <summary>
        /// Email address of the user.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("userName", required: true)]
        public Input<string> UserName { get; set; } = null!;

        public UserArgs()
        {
        }
        public static new UserArgs Empty => new UserArgs();
    }

    public sealed class UserState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// ARN of the appstream user.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// Authentication type for the user. You must specify USERPOOL. Valid values: `API`, `SAML`, `USERPOOL`
        /// </summary>
        [Input("authenticationType")]
        public Input<string>? AuthenticationType { get; set; }

        /// <summary>
        /// Date and time, in UTC and extended RFC 3339 format, when the user was created.
        /// </summary>
        [Input("createdTime")]
        public Input<string>? CreatedTime { get; set; }

        /// <summary>
        /// Whether the user in the user pool is enabled.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        /// <summary>
        /// First name, or given name, of the user.
        /// </summary>
        [Input("firstName")]
        public Input<string>? FirstName { get; set; }

        /// <summary>
        /// Last name, or surname, of the user.
        /// </summary>
        [Input("lastName")]
        public Input<string>? LastName { get; set; }

        /// <summary>
        /// Send an email notification.
        /// </summary>
        [Input("sendEmailNotification")]
        public Input<bool>? SendEmailNotification { get; set; }

        /// <summary>
        /// Email address of the user.
        /// 
        /// The following arguments are optional:
        /// </summary>
        [Input("userName")]
        public Input<string>? UserName { get; set; }

        public UserState()
        {
        }
        public static new UserState Empty => new UserState();
    }
}
