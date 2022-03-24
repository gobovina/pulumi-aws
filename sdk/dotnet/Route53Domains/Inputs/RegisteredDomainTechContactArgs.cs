// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Route53Domains.Inputs
{

    public sealed class RegisteredDomainTechContactArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// First line of the contact's address.
        /// </summary>
        [Input("addressLine1")]
        public Input<string>? AddressLine1 { get; set; }

        /// <summary>
        /// Second line of contact's address, if any.
        /// </summary>
        [Input("addressLine2")]
        public Input<string>? AddressLine2 { get; set; }

        /// <summary>
        /// The city of the contact's address.
        /// </summary>
        [Input("city")]
        public Input<string>? City { get; set; }

        /// <summary>
        /// Indicates whether the contact is a person, company, association, or public organization. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-ContactType) for valid values.
        /// </summary>
        [Input("contactType")]
        public Input<string>? ContactType { get; set; }

        /// <summary>
        /// Code for the country of the contact's address. See the [AWS API documentation](https://docs.aws.amazon.com/Route53/latest/APIReference/API_domains_ContactDetail.html#Route53Domains-Type-domains_ContactDetail-CountryCode) for valid values.
        /// </summary>
        [Input("countryCode")]
        public Input<string>? CountryCode { get; set; }

        /// <summary>
        /// Email address of the contact.
        /// </summary>
        [Input("email")]
        public Input<string>? Email { get; set; }

        [Input("extraParams")]
        private InputMap<string>? _extraParams;

        /// <summary>
        /// A key-value map of parameters required by certain top-level domains.
        /// </summary>
        public InputMap<string> ExtraParams
        {
            get => _extraParams ?? (_extraParams = new InputMap<string>());
            set => _extraParams = value;
        }

        /// <summary>
        /// Fax number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        /// </summary>
        [Input("fax")]
        public Input<string>? Fax { get; set; }

        /// <summary>
        /// First name of contact.
        /// </summary>
        [Input("firstName")]
        public Input<string>? FirstName { get; set; }

        /// <summary>
        /// Last name of contact.
        /// </summary>
        [Input("lastName")]
        public Input<string>? LastName { get; set; }

        /// <summary>
        /// Name of the organization for contact types other than `PERSON`.
        /// </summary>
        [Input("organizationName")]
        public Input<string>? OrganizationName { get; set; }

        /// <summary>
        /// The phone number of the contact. Phone number must be specified in the format "+[country dialing code].[number including any area code]".
        /// </summary>
        [Input("phoneNumber")]
        public Input<string>? PhoneNumber { get; set; }

        /// <summary>
        /// The state or province of the contact's city.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        /// <summary>
        /// The zip or postal code of the contact's address.
        /// </summary>
        [Input("zipCode")]
        public Input<string>? ZipCode { get; set; }

        public RegisteredDomainTechContactArgs()
        {
        }
    }
}
