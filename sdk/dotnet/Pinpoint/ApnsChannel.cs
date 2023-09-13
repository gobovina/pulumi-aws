// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pinpoint
{
    /// <summary>
    /// Provides a Pinpoint APNs Channel resource.
    /// 
    /// &gt; **Note:** All arguments, including certificates and tokens, will be stored in the raw state as plain-text.
    /// ## Example Usage
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.IO;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var app = new Aws.Pinpoint.App("app");
    /// 
    ///     var apns = new Aws.Pinpoint.ApnsChannel("apns", new()
    ///     {
    ///         ApplicationId = app.ApplicationId,
    ///         Certificate = File.ReadAllText("./certificate.pem"),
    ///         PrivateKey = File.ReadAllText("./private_key.key"),
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// In TODO v1.5.0 and later, use an `import` block to import Pinpoint APNs Channel using the `application-id`. For exampleterraform import {
    /// 
    ///  to = aws_pinpoint_apns_channel.apns
    /// 
    ///  id = "application-id" } Using `TODO import`, import Pinpoint APNs Channel using the `application-id`. For exampleconsole % TODO import aws_pinpoint_apns_channel.apns application-id
    /// </summary>
    [AwsResourceType("aws:pinpoint/apnsChannel:ApnsChannel")]
    public partial class ApnsChannel : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The application ID.
        /// </summary>
        [Output("applicationId")]
        public Output<string> ApplicationId { get; private set; } = null!;

        /// <summary>
        /// The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
        /// </summary>
        [Output("bundleId")]
        public Output<string?> BundleId { get; private set; } = null!;

        /// <summary>
        /// The pem encoded TLS Certificate from Apple.
        /// </summary>
        [Output("certificate")]
        public Output<string?> Certificate { get; private set; } = null!;

        /// <summary>
        /// The default authentication method used for APNs.
        /// __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
        /// You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
        /// If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
        /// 
        /// One of the following sets of credentials is also required.
        /// 
        /// If you choose to use __Certificate credentials__ you will have to provide:
        /// </summary>
        [Output("defaultAuthenticationMethod")]
        public Output<string?> DefaultAuthenticationMethod { get; private set; } = null!;

        /// <summary>
        /// Whether the channel is enabled or disabled. Defaults to `true`.
        /// </summary>
        [Output("enabled")]
        public Output<bool?> Enabled { get; private set; } = null!;

        /// <summary>
        /// The Certificate Private Key file (ie. `.key` file).
        /// 
        /// If you choose to use __Key credentials__ you will have to provide:
        /// </summary>
        [Output("privateKey")]
        public Output<string?> PrivateKey { get; private set; } = null!;

        /// <summary>
        /// The ID assigned to your Apple developer account team. This value is provided on the Membership page.
        /// </summary>
        [Output("teamId")]
        public Output<string?> TeamId { get; private set; } = null!;

        /// <summary>
        /// The `.p8` file that you download from your Apple developer account when you create an authentication key.
        /// </summary>
        [Output("tokenKey")]
        public Output<string?> TokenKey { get; private set; } = null!;

        /// <summary>
        /// The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
        /// </summary>
        [Output("tokenKeyId")]
        public Output<string?> TokenKeyId { get; private set; } = null!;


        /// <summary>
        /// Create a ApnsChannel resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public ApnsChannel(string name, ApnsChannelArgs args, CustomResourceOptions? options = null)
            : base("aws:pinpoint/apnsChannel:ApnsChannel", name, args ?? new ApnsChannelArgs(), MakeResourceOptions(options, ""))
        {
        }

        private ApnsChannel(string name, Input<string> id, ApnsChannelState? state = null, CustomResourceOptions? options = null)
            : base("aws:pinpoint/apnsChannel:ApnsChannel", name, state, MakeResourceOptions(options, id))
        {
        }

        private static CustomResourceOptions MakeResourceOptions(CustomResourceOptions? options, Input<string>? id)
        {
            var defaultOptions = new CustomResourceOptions
            {
                Version = Utilities.Version,
                AdditionalSecretOutputs =
                {
                    "bundleId",
                    "certificate",
                    "privateKey",
                    "teamId",
                    "tokenKey",
                    "tokenKeyId",
                },
            };
            var merged = CustomResourceOptions.Merge(defaultOptions, options);
            // Override the ID if one was specified for consistency with other language SDKs.
            merged.Id = id ?? merged.Id;
            return merged;
        }
        /// <summary>
        /// Get an existing ApnsChannel resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static ApnsChannel Get(string name, Input<string> id, ApnsChannelState? state = null, CustomResourceOptions? options = null)
        {
            return new ApnsChannel(name, id, state, options);
        }
    }

    public sealed class ApnsChannelArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The application ID.
        /// </summary>
        [Input("applicationId", required: true)]
        public Input<string> ApplicationId { get; set; } = null!;

        [Input("bundleId")]
        private Input<string>? _bundleId;

        /// <summary>
        /// The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
        /// </summary>
        public Input<string>? BundleId
        {
            get => _bundleId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _bundleId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("certificate")]
        private Input<string>? _certificate;

        /// <summary>
        /// The pem encoded TLS Certificate from Apple.
        /// </summary>
        public Input<string>? Certificate
        {
            get => _certificate;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _certificate = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The default authentication method used for APNs.
        /// __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
        /// You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
        /// If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
        /// 
        /// One of the following sets of credentials is also required.
        /// 
        /// If you choose to use __Certificate credentials__ you will have to provide:
        /// </summary>
        [Input("defaultAuthenticationMethod")]
        public Input<string>? DefaultAuthenticationMethod { get; set; }

        /// <summary>
        /// Whether the channel is enabled or disabled. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// The Certificate Private Key file (ie. `.key` file).
        /// 
        /// If you choose to use __Key credentials__ you will have to provide:
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("teamId")]
        private Input<string>? _teamId;

        /// <summary>
        /// The ID assigned to your Apple developer account team. This value is provided on the Membership page.
        /// </summary>
        public Input<string>? TeamId
        {
            get => _teamId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _teamId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tokenKey")]
        private Input<string>? _tokenKey;

        /// <summary>
        /// The `.p8` file that you download from your Apple developer account when you create an authentication key.
        /// </summary>
        public Input<string>? TokenKey
        {
            get => _tokenKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tokenKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tokenKeyId")]
        private Input<string>? _tokenKeyId;

        /// <summary>
        /// The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
        /// </summary>
        public Input<string>? TokenKeyId
        {
            get => _tokenKeyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tokenKeyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ApnsChannelArgs()
        {
        }
        public static new ApnsChannelArgs Empty => new ApnsChannelArgs();
    }

    public sealed class ApnsChannelState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The application ID.
        /// </summary>
        [Input("applicationId")]
        public Input<string>? ApplicationId { get; set; }

        [Input("bundleId")]
        private Input<string>? _bundleId;

        /// <summary>
        /// The ID assigned to your iOS app. To find this value, choose Certificates, IDs &amp; Profiles, choose App IDs in the Identifiers section, and choose your app.
        /// </summary>
        public Input<string>? BundleId
        {
            get => _bundleId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _bundleId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("certificate")]
        private Input<string>? _certificate;

        /// <summary>
        /// The pem encoded TLS Certificate from Apple.
        /// </summary>
        public Input<string>? Certificate
        {
            get => _certificate;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _certificate = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        /// <summary>
        /// The default authentication method used for APNs.
        /// __NOTE__: Amazon Pinpoint uses this default for every APNs push notification that you send using the console.
        /// You can override the default when you send a message programmatically using the Amazon Pinpoint API, the AWS CLI, or an AWS SDK.
        /// If your default authentication type fails, Amazon Pinpoint doesn't attempt to use the other authentication type.
        /// 
        /// One of the following sets of credentials is also required.
        /// 
        /// If you choose to use __Certificate credentials__ you will have to provide:
        /// </summary>
        [Input("defaultAuthenticationMethod")]
        public Input<string>? DefaultAuthenticationMethod { get; set; }

        /// <summary>
        /// Whether the channel is enabled or disabled. Defaults to `true`.
        /// </summary>
        [Input("enabled")]
        public Input<bool>? Enabled { get; set; }

        [Input("privateKey")]
        private Input<string>? _privateKey;

        /// <summary>
        /// The Certificate Private Key file (ie. `.key` file).
        /// 
        /// If you choose to use __Key credentials__ you will have to provide:
        /// </summary>
        public Input<string>? PrivateKey
        {
            get => _privateKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _privateKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("teamId")]
        private Input<string>? _teamId;

        /// <summary>
        /// The ID assigned to your Apple developer account team. This value is provided on the Membership page.
        /// </summary>
        public Input<string>? TeamId
        {
            get => _teamId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _teamId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tokenKey")]
        private Input<string>? _tokenKey;

        /// <summary>
        /// The `.p8` file that you download from your Apple developer account when you create an authentication key.
        /// </summary>
        public Input<string>? TokenKey
        {
            get => _tokenKey;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tokenKey = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        [Input("tokenKeyId")]
        private Input<string>? _tokenKeyId;

        /// <summary>
        /// The ID assigned to your signing key. To find this value, choose Certificates, IDs &amp; Profiles, and choose your key in the Keys section.
        /// </summary>
        public Input<string>? TokenKeyId
        {
            get => _tokenKeyId;
            set
            {
                var emptySecret = Output.CreateSecret(0);
                _tokenKeyId = Output.Tuple<Input<string>?, int>(value, emptySecret).Apply(t => t.Item1);
            }
        }

        public ApnsChannelState()
        {
        }
        public static new ApnsChannelState Empty => new ApnsChannelState();
    }
}
