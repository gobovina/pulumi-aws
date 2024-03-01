// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Cognito
{
    /// <summary>
    /// Provides a Cognito User Pool UI Customization resource.
    /// 
    /// &gt; **Note:** To use this resource, the user pool must have a domain associated with it. For more information, see the Amazon Cognito Developer Guide on [Customizing the Built-in Sign-In and Sign-up Webpages](https://docs.aws.amazon.com/cognito/latest/developerguide/cognito-user-pools-app-ui-customization.html).
    /// 
    /// ## Example Usage
    /// ### UI customization settings for a single client
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Cognito.UserPool("example", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    ///     var exampleUserPoolDomain = new Aws.Cognito.UserPoolDomain("example", new()
    ///     {
    ///         Domain = "example",
    ///         UserPoolId = example.Id,
    ///     });
    /// 
    ///     var exampleUserPoolClient = new Aws.Cognito.UserPoolClient("example", new()
    ///     {
    ///         Name = "example",
    ///         UserPoolId = example.Id,
    ///     });
    /// 
    ///     var exampleUserPoolUICustomization = new Aws.Cognito.UserPoolUICustomization("example", new()
    ///     {
    ///         ClientId = exampleUserPoolClient.Id,
    ///         Css = ".label-customizable {font-weight: 400;}",
    ///         ImageFile = Std.Filebase64.Invoke(new()
    ///         {
    ///             Input = "logo.png",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         UserPoolId = exampleUserPoolDomain.UserPoolId,
    ///     });
    /// 
    /// });
    /// ```
    /// ### UI customization settings for all clients
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// using Std = Pulumi.Std;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Cognito.UserPool("example", new()
    ///     {
    ///         Name = "example",
    ///     });
    /// 
    ///     var exampleUserPoolDomain = new Aws.Cognito.UserPoolDomain("example", new()
    ///     {
    ///         Domain = "example",
    ///         UserPoolId = example.Id,
    ///     });
    /// 
    ///     var exampleUserPoolUICustomization = new Aws.Cognito.UserPoolUICustomization("example", new()
    ///     {
    ///         Css = ".label-customizable {font-weight: 400;}",
    ///         ImageFile = Std.Filebase64.Invoke(new()
    ///         {
    ///             Input = "logo.png",
    ///         }).Apply(invoke =&gt; invoke.Result),
    ///         UserPoolId = exampleUserPoolDomain.UserPoolId,
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Cognito User Pool UI Customizations using the `user_pool_id` and `client_id` separated by `,`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:cognito/userPoolUICustomization:UserPoolUICustomization example us-west-2_ZCTarbt5C,12bu4fuk3mlgqa2rtrujgp6egq
    /// ```
    /// </summary>
    [AwsResourceType("aws:cognito/userPoolUICustomization:UserPoolUICustomization")]
    public partial class UserPoolUICustomization : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The client ID for the client app. Defaults to `ALL`. If `ALL` is specified, the `css` and/or `image_file` settings will be used for every client that has no UI customization set previously.
        /// </summary>
        [Output("clientId")]
        public Output<string?> ClientId { get; private set; } = null!;

        /// <summary>
        /// The creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) for the UI customization.
        /// </summary>
        [Output("creationDate")]
        public Output<string> CreationDate { get; private set; } = null!;

        /// <summary>
        /// The CSS values in the UI customization, provided as a String. At least one of `css` or `image_file` is required.
        /// </summary>
        [Output("css")]
        public Output<string?> Css { get; private set; } = null!;

        /// <summary>
        /// The CSS version number.
        /// </summary>
        [Output("cssVersion")]
        public Output<string> CssVersion { get; private set; } = null!;

        /// <summary>
        /// The uploaded logo image for the UI customization, provided as a base64-encoded String. Drift detection is not possible for this argument. At least one of `css` or `image_file` is required.
        /// </summary>
        [Output("imageFile")]
        public Output<string?> ImageFile { get; private set; } = null!;

        /// <summary>
        /// The logo image URL for the UI customization.
        /// </summary>
        [Output("imageUrl")]
        public Output<string> ImageUrl { get; private set; } = null!;

        /// <summary>
        /// The last-modified date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) for the UI customization.
        /// </summary>
        [Output("lastModifiedDate")]
        public Output<string> LastModifiedDate { get; private set; } = null!;

        /// <summary>
        /// The user pool ID for the user pool.
        /// </summary>
        [Output("userPoolId")]
        public Output<string> UserPoolId { get; private set; } = null!;


        /// <summary>
        /// Create a UserPoolUICustomization resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public UserPoolUICustomization(string name, UserPoolUICustomizationArgs args, CustomResourceOptions? options = null)
            : base("aws:cognito/userPoolUICustomization:UserPoolUICustomization", name, args ?? new UserPoolUICustomizationArgs(), MakeResourceOptions(options, ""))
        {
        }

        private UserPoolUICustomization(string name, Input<string> id, UserPoolUICustomizationState? state = null, CustomResourceOptions? options = null)
            : base("aws:cognito/userPoolUICustomization:UserPoolUICustomization", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing UserPoolUICustomization resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static UserPoolUICustomization Get(string name, Input<string> id, UserPoolUICustomizationState? state = null, CustomResourceOptions? options = null)
        {
            return new UserPoolUICustomization(name, id, state, options);
        }
    }

    public sealed class UserPoolUICustomizationArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The client ID for the client app. Defaults to `ALL`. If `ALL` is specified, the `css` and/or `image_file` settings will be used for every client that has no UI customization set previously.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// The CSS values in the UI customization, provided as a String. At least one of `css` or `image_file` is required.
        /// </summary>
        [Input("css")]
        public Input<string>? Css { get; set; }

        /// <summary>
        /// The uploaded logo image for the UI customization, provided as a base64-encoded String. Drift detection is not possible for this argument. At least one of `css` or `image_file` is required.
        /// </summary>
        [Input("imageFile")]
        public Input<string>? ImageFile { get; set; }

        /// <summary>
        /// The user pool ID for the user pool.
        /// </summary>
        [Input("userPoolId", required: true)]
        public Input<string> UserPoolId { get; set; } = null!;

        public UserPoolUICustomizationArgs()
        {
        }
        public static new UserPoolUICustomizationArgs Empty => new UserPoolUICustomizationArgs();
    }

    public sealed class UserPoolUICustomizationState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The client ID for the client app. Defaults to `ALL`. If `ALL` is specified, the `css` and/or `image_file` settings will be used for every client that has no UI customization set previously.
        /// </summary>
        [Input("clientId")]
        public Input<string>? ClientId { get; set; }

        /// <summary>
        /// The creation date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) for the UI customization.
        /// </summary>
        [Input("creationDate")]
        public Input<string>? CreationDate { get; set; }

        /// <summary>
        /// The CSS values in the UI customization, provided as a String. At least one of `css` or `image_file` is required.
        /// </summary>
        [Input("css")]
        public Input<string>? Css { get; set; }

        /// <summary>
        /// The CSS version number.
        /// </summary>
        [Input("cssVersion")]
        public Input<string>? CssVersion { get; set; }

        /// <summary>
        /// The uploaded logo image for the UI customization, provided as a base64-encoded String. Drift detection is not possible for this argument. At least one of `css` or `image_file` is required.
        /// </summary>
        [Input("imageFile")]
        public Input<string>? ImageFile { get; set; }

        /// <summary>
        /// The logo image URL for the UI customization.
        /// </summary>
        [Input("imageUrl")]
        public Input<string>? ImageUrl { get; set; }

        /// <summary>
        /// The last-modified date in [RFC3339 format](https://tools.ietf.org/html/rfc3339#section-5.8) for the UI customization.
        /// </summary>
        [Input("lastModifiedDate")]
        public Input<string>? LastModifiedDate { get; set; }

        /// <summary>
        /// The user pool ID for the user pool.
        /// </summary>
        [Input("userPoolId")]
        public Input<string>? UserPoolId { get; set; }

        public UserPoolUICustomizationState()
        {
        }
        public static new UserPoolUICustomizationState Empty => new UserPoolUICustomizationState();
    }
}
