// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Account
{
    /// <summary>
    /// Manages the specified primary contact information associated with an AWS Account.
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
    ///     var test = new Aws.Account.PrimaryContact("test", new()
    ///     {
    ///         AddressLine1 = "123 Any Street",
    ///         City = "Seattle",
    ///         CompanyName = "Example Corp, Inc.",
    ///         CountryCode = "US",
    ///         DistrictOrCounty = "King",
    ///         FullName = "My Name",
    ///         PhoneNumber = "+64211111111",
    ///         PostalCode = "98101",
    ///         StateOrRegion = "WA",
    ///         WebsiteUrl = "https://www.examplecorp.com",
    ///     });
    /// 
    /// });
    /// ```
    /// &lt;!--End PulumiCodeChooser --&gt;
    /// 
    /// ## Import
    /// 
    /// Using `pulumi import`, import the Primary Contact using the `account_id`. For example:
    /// 
    /// ```sh
    /// $ pulumi import aws:account/primaryContact:PrimaryContact test 1234567890
    /// ```
    /// </summary>
    [AwsResourceType("aws:account/primaryContact:PrimaryContact")]
    public partial class PrimaryContact : global::Pulumi.CustomResource
    {
        /// <summary>
        /// The ID of the target account when managing member accounts. Will manage current user's account by default if omitted.
        /// </summary>
        [Output("accountId")]
        public Output<string?> AccountId { get; private set; } = null!;

        /// <summary>
        /// The first line of the primary contact address.
        /// </summary>
        [Output("addressLine1")]
        public Output<string> AddressLine1 { get; private set; } = null!;

        /// <summary>
        /// The second line of the primary contact address, if any.
        /// </summary>
        [Output("addressLine2")]
        public Output<string?> AddressLine2 { get; private set; } = null!;

        /// <summary>
        /// The third line of the primary contact address, if any.
        /// </summary>
        [Output("addressLine3")]
        public Output<string?> AddressLine3 { get; private set; } = null!;

        /// <summary>
        /// The city of the primary contact address.
        /// </summary>
        [Output("city")]
        public Output<string> City { get; private set; } = null!;

        /// <summary>
        /// The name of the company associated with the primary contact information, if any.
        /// </summary>
        [Output("companyName")]
        public Output<string?> CompanyName { get; private set; } = null!;

        /// <summary>
        /// The ISO-3166 two-letter country code for the primary contact address.
        /// </summary>
        [Output("countryCode")]
        public Output<string> CountryCode { get; private set; } = null!;

        /// <summary>
        /// The district or county of the primary contact address, if any.
        /// </summary>
        [Output("districtOrCounty")]
        public Output<string?> DistrictOrCounty { get; private set; } = null!;

        /// <summary>
        /// The full name of the primary contact address.
        /// </summary>
        [Output("fullName")]
        public Output<string> FullName { get; private set; } = null!;

        /// <summary>
        /// The phone number of the primary contact information. The number will be validated and, in some countries, checked for activation.
        /// </summary>
        [Output("phoneNumber")]
        public Output<string> PhoneNumber { get; private set; } = null!;

        /// <summary>
        /// The postal code of the primary contact address.
        /// </summary>
        [Output("postalCode")]
        public Output<string> PostalCode { get; private set; } = null!;

        /// <summary>
        /// The state or region of the primary contact address. This field is required in selected countries.
        /// </summary>
        [Output("stateOrRegion")]
        public Output<string?> StateOrRegion { get; private set; } = null!;

        /// <summary>
        /// The URL of the website associated with the primary contact information, if any.
        /// </summary>
        [Output("websiteUrl")]
        public Output<string?> WebsiteUrl { get; private set; } = null!;


        /// <summary>
        /// Create a PrimaryContact resource with the given unique name, arguments, and options.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resource</param>
        /// <param name="args">The arguments used to populate this resource's properties</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public PrimaryContact(string name, PrimaryContactArgs args, CustomResourceOptions? options = null)
            : base("aws:account/primaryContact:PrimaryContact", name, args ?? new PrimaryContactArgs(), MakeResourceOptions(options, ""))
        {
        }

        private PrimaryContact(string name, Input<string> id, PrimaryContactState? state = null, CustomResourceOptions? options = null)
            : base("aws:account/primaryContact:PrimaryContact", name, state, MakeResourceOptions(options, id))
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
        /// Get an existing PrimaryContact resource's state with the given name, ID, and optional extra
        /// properties used to qualify the lookup.
        /// </summary>
        ///
        /// <param name="name">The unique name of the resulting resource.</param>
        /// <param name="id">The unique provider ID of the resource to lookup.</param>
        /// <param name="state">Any extra arguments used during the lookup.</param>
        /// <param name="options">A bag of options that control this resource's behavior</param>
        public static PrimaryContact Get(string name, Input<string> id, PrimaryContactState? state = null, CustomResourceOptions? options = null)
        {
            return new PrimaryContact(name, id, state, options);
        }
    }

    public sealed class PrimaryContactArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the target account when managing member accounts. Will manage current user's account by default if omitted.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The first line of the primary contact address.
        /// </summary>
        [Input("addressLine1", required: true)]
        public Input<string> AddressLine1 { get; set; } = null!;

        /// <summary>
        /// The second line of the primary contact address, if any.
        /// </summary>
        [Input("addressLine2")]
        public Input<string>? AddressLine2 { get; set; }

        /// <summary>
        /// The third line of the primary contact address, if any.
        /// </summary>
        [Input("addressLine3")]
        public Input<string>? AddressLine3 { get; set; }

        /// <summary>
        /// The city of the primary contact address.
        /// </summary>
        [Input("city", required: true)]
        public Input<string> City { get; set; } = null!;

        /// <summary>
        /// The name of the company associated with the primary contact information, if any.
        /// </summary>
        [Input("companyName")]
        public Input<string>? CompanyName { get; set; }

        /// <summary>
        /// The ISO-3166 two-letter country code for the primary contact address.
        /// </summary>
        [Input("countryCode", required: true)]
        public Input<string> CountryCode { get; set; } = null!;

        /// <summary>
        /// The district or county of the primary contact address, if any.
        /// </summary>
        [Input("districtOrCounty")]
        public Input<string>? DistrictOrCounty { get; set; }

        /// <summary>
        /// The full name of the primary contact address.
        /// </summary>
        [Input("fullName", required: true)]
        public Input<string> FullName { get; set; } = null!;

        /// <summary>
        /// The phone number of the primary contact information. The number will be validated and, in some countries, checked for activation.
        /// </summary>
        [Input("phoneNumber", required: true)]
        public Input<string> PhoneNumber { get; set; } = null!;

        /// <summary>
        /// The postal code of the primary contact address.
        /// </summary>
        [Input("postalCode", required: true)]
        public Input<string> PostalCode { get; set; } = null!;

        /// <summary>
        /// The state or region of the primary contact address. This field is required in selected countries.
        /// </summary>
        [Input("stateOrRegion")]
        public Input<string>? StateOrRegion { get; set; }

        /// <summary>
        /// The URL of the website associated with the primary contact information, if any.
        /// </summary>
        [Input("websiteUrl")]
        public Input<string>? WebsiteUrl { get; set; }

        public PrimaryContactArgs()
        {
        }
        public static new PrimaryContactArgs Empty => new PrimaryContactArgs();
    }

    public sealed class PrimaryContactState : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The ID of the target account when managing member accounts. Will manage current user's account by default if omitted.
        /// </summary>
        [Input("accountId")]
        public Input<string>? AccountId { get; set; }

        /// <summary>
        /// The first line of the primary contact address.
        /// </summary>
        [Input("addressLine1")]
        public Input<string>? AddressLine1 { get; set; }

        /// <summary>
        /// The second line of the primary contact address, if any.
        /// </summary>
        [Input("addressLine2")]
        public Input<string>? AddressLine2 { get; set; }

        /// <summary>
        /// The third line of the primary contact address, if any.
        /// </summary>
        [Input("addressLine3")]
        public Input<string>? AddressLine3 { get; set; }

        /// <summary>
        /// The city of the primary contact address.
        /// </summary>
        [Input("city")]
        public Input<string>? City { get; set; }

        /// <summary>
        /// The name of the company associated with the primary contact information, if any.
        /// </summary>
        [Input("companyName")]
        public Input<string>? CompanyName { get; set; }

        /// <summary>
        /// The ISO-3166 two-letter country code for the primary contact address.
        /// </summary>
        [Input("countryCode")]
        public Input<string>? CountryCode { get; set; }

        /// <summary>
        /// The district or county of the primary contact address, if any.
        /// </summary>
        [Input("districtOrCounty")]
        public Input<string>? DistrictOrCounty { get; set; }

        /// <summary>
        /// The full name of the primary contact address.
        /// </summary>
        [Input("fullName")]
        public Input<string>? FullName { get; set; }

        /// <summary>
        /// The phone number of the primary contact information. The number will be validated and, in some countries, checked for activation.
        /// </summary>
        [Input("phoneNumber")]
        public Input<string>? PhoneNumber { get; set; }

        /// <summary>
        /// The postal code of the primary contact address.
        /// </summary>
        [Input("postalCode")]
        public Input<string>? PostalCode { get; set; }

        /// <summary>
        /// The state or region of the primary contact address. This field is required in selected countries.
        /// </summary>
        [Input("stateOrRegion")]
        public Input<string>? StateOrRegion { get; set; }

        /// <summary>
        /// The URL of the website associated with the primary contact information, if any.
        /// </summary>
        [Input("websiteUrl")]
        public Input<string>? WebsiteUrl { get; set; }

        public PrimaryContactState()
        {
        }
        public static new PrimaryContactState Empty => new PrimaryContactState();
    }
}
