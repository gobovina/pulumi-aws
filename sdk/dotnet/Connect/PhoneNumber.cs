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
    /// Provides an Amazon Connect Phone Number resource. For more information see
    /// [Amazon Connect: Getting Started](https://docs.aws.amazon.com/connect/latest/adminguide/amazon-connect-get-started.html)
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
    ///     var example = new Aws.Connect.PhoneNumber("example", new()
    ///     {
    ///         TargetArn = exampleAwsConnectInstance.Arn,
    ///         CountryCode = "US",
    ///         Type = "DID",
    ///         Tags = 
    ///         {
    ///             { "hello", "world" },
    ///         },
    ///     });
    /// 
    /// });
    /// ```
    /// ### Description
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Connect.PhoneNumber("example", new()
    ///     {
    ///         TargetArn = exampleAwsConnectInstance.Arn,
    ///         CountryCode = "US",
    ///         Type = "DID",
    ///         Description = "example description",
    ///     });
    /// 
    /// });
    /// ```
    /// ### Prefix to filter phone numbers
    /// 
    /// ```csharp
    /// using System.Collections.Generic;
    /// using System.Linq;
    /// using Pulumi;
    /// using Aws = Pulumi.Aws;
    /// 
    /// return await Deployment.RunAsync(() =&gt; 
    /// {
    ///     var example = new Aws.Connect.PhoneNumber("example", new()
    ///     {
    ///         TargetArn = exampleAwsConnectInstance.Arn,
    ///         CountryCode = "US",
    ///         Type = "DID",
    ///         Prefix = "+18005",
    ///     });
    /// 
    /// });
    /// ```
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import Amazon Connect Phone Numbers using its `id`. For example:
    /// 
    /// ```sh
    ///  $ pulumi import aws:connect/phoneNumber:PhoneNumber example 12345678-abcd-1234-efgh-9876543210ab
    /// ```
    /// </summary>
    [AwsResourceType("aws:connect/phoneNumber:PhoneNumber")]
    public partial class PhoneNumber : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ARN of the phone number.
        /// </summary>
        [Output("arn")]
        public Output<string> Arn { get; private set; } = null!;

        /// <summary>
        /// The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
        /// </summary>
        [Output("countryCode")]
        public Output<string> CountryCode { get; private set; } = null!;

        /// <summary>
        /// The description of the phone number.
        /// </summary>
        [Output("description")]
        public Output<string?> Description { get; private set; } = null!;

        /// <summary>
        /// The phone number. Phone numbers are formatted `[+] [country code] [subscriber number including area code]`.
        /// </summary>
        [Output("phoneNumber")]
        public Output<string> PhoneNumberValue { get; private set; } = null!;

        /// <summary>
        /// The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
        /// </summary>
        [Output("prefix")]
        public Output<string?> Prefix { get; private set; } = null!;

        /// <summary>
        /// The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
        /// </summary>
        [Output("statuses")]
        public Output<ImmutableArray<Outputs.PhoneNumberStatus>> Statuses { get; private set; } = null!;

        /// <summary>
        /// Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        [Output("tags")]
        public Output<ImmutableDictionary<string, string>?> Tags { get; private set; } = null!;

        /// <summary>
        /// A map of tags assigned to the resource, including those inherited from the provider `default_tags` configuration block.
        /// </summary>
        [Output("tagsAll")]
        public Output<ImmutableDictionary<string, string>> TagsAll { get; private set; } = null!;

        /// <summary>
        /// The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
        /// </summary>
        [Output("targetArn")]
        public Output<string> TargetArn { get; private set; } = null!;

        /// <summary>
        /// The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
        /// </summary>
        [Output("type")]
        public Output<string> Type { get; private set; } = null!;


        /// <summary>
        /// Create a PhoneNumber resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PhoneNumber(string name, PhoneNumberArgs args, CustomResourceOptions? options = null)
            : base("aws:connect/phoneNumber:PhoneNumber", name, args ?? new PhoneNumberArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PhoneNumber(string name, Input<string> id, PhoneNumberState? state = null, CustomResourceOptions? options = null)
            : base("aws:connect/phoneNumber:PhoneNumber", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PhoneNumber resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PhoneNumber Get(string name, Input<string> id, PhoneNumberState? state = null, CustomResourceOptions? options = null)
        {
            return new PhoneNumber(name, id, state, options);
        }
    }

    public sealed class PhoneNumberArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
        /// </summary>
        [Input("countryCode", required: true)]
        public Input<string> CountryCode { get; set; } = null!;

        /// <summary>
        /// The description of the phone number.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
        /// </summary>
        public InputMap<string> Tags
        {
            get => _tags ?? (_tags = new InputMap<string>());
            set => _tags = value;
        }

        /// <summary>
        /// The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
        /// </summary>
        [Input("targetArn", required: true)]
        public Input<string> TargetArn { get; set; } = null!;

        /// <summary>
        /// The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public PhoneNumberArgs()
        {
        }
        public static new PhoneNumberArgs Empty => new PhoneNumberArgs();
    }

    public sealed class PhoneNumberState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ARN of the phone number.
        /// </summary>
        [Input("arn")]
        public Input<string>? Arn { get; set; }

        /// <summary>
        /// The ISO country code. For a list of Valid values, refer to [PhoneNumberCountryCode](https://docs.aws.amazon.com/connect/latest/APIReference/API_SearchAvailablePhoneNumbers.html#connect-SearchAvailablePhoneNumbers-request-PhoneNumberCountryCode).
        /// </summary>
        [Input("countryCode")]
        public Input<string>? CountryCode { get; set; }

        /// <summary>
        /// The description of the phone number.
        /// </summary>
        [Input("description")]
        public Input<string>? Description { get; set; }

        /// <summary>
        /// The phone number. Phone numbers are formatted `[+] [country code] [subscriber number including area code]`.
        /// </summary>
        [Input("phoneNumber")]
        public Input<string>? PhoneNumberValue { get; set; }

        /// <summary>
        /// The prefix of the phone number that is used to filter available phone numbers. If provided, it must contain `+` as part of the country code. Do not specify this argument when importing the resource.
        /// </summary>
        [Input("prefix")]
        public Input<string>? Prefix { get; set; }

        [Input("statuses")]
        private InputList<Inputs.PhoneNumberStatusGetArgs>? _statuses;

        /// <summary>
        /// The status of the phone number. Valid Values: `CLAIMED` | `IN_PROGRESS` | `FAILED`.
        /// </summary>
        public InputList<Inputs.PhoneNumberStatusGetArgs> Statuses
        {
            get => _statuses ?? (_statuses = new InputList<Inputs.PhoneNumberStatusGetArgs>());
            set => _statuses = value;
        }

        [Input("tags")]
        private InputMap<string>? _tags;

        /// <summary>
        /// Tags to apply to the Phone Number. If configured with a provider `default_tags` configuration block present, tags with matching keys will overwrite those defined at the provider-level.
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
        [Obsolete(@"Please use `tags` instead.")]
        public InputMap<string> TagsAll
        {
            get => _tagsAll ?? (_tagsAll = new InputMap<string>());
            set => _tagsAll = value;
        }

        /// <summary>
        /// The Amazon Resource Name (ARN) for Amazon Connect instances that phone numbers are claimed to.
        /// </summary>
        [Input("targetArn")]
        public Input<string>? TargetArn { get; set; }

        /// <summary>
        /// The type of phone number. Valid Values: `TOLL_FREE` | `DID`.
        /// </summary>
        [Input("type")]
        public Input<string>? Type { get; set; }

        public PhoneNumberState()
        {
        }
        public static new PhoneNumberState Empty => new PhoneNumberState();
    }
}
