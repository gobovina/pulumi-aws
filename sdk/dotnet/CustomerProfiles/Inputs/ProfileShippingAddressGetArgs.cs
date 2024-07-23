// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CustomerProfiles.Inputs
{

    public sealed class ProfileShippingAddressGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The first line of a customer address.
        /// </summary>
        [Input("address1")]
        public Input<string>? Address1 { get; set; }

        /// <summary>
        /// The second line of a customer address.
        /// </summary>
        [Input("address2")]
        public Input<string>? Address2 { get; set; }

        /// <summary>
        /// The third line of a customer address.
        /// </summary>
        [Input("address3")]
        public Input<string>? Address3 { get; set; }

        /// <summary>
        /// The fourth line of a customer address.
        /// </summary>
        [Input("address4")]
        public Input<string>? Address4 { get; set; }

        /// <summary>
        /// The city in which a customer lives.
        /// </summary>
        [Input("city")]
        public Input<string>? City { get; set; }

        /// <summary>
        /// The country in which a customer lives.
        /// </summary>
        [Input("country")]
        public Input<string>? Country { get; set; }

        /// <summary>
        /// The county in which a customer lives.
        /// </summary>
        [Input("county")]
        public Input<string>? County { get; set; }

        /// <summary>
        /// The postal code of a customer address.
        /// </summary>
        [Input("postalCode")]
        public Input<string>? PostalCode { get; set; }

        /// <summary>
        /// The province in which a customer lives.
        /// </summary>
        [Input("province")]
        public Input<string>? Province { get; set; }

        /// <summary>
        /// The state in which a customer lives.
        /// </summary>
        [Input("state")]
        public Input<string>? State { get; set; }

        public ProfileShippingAddressGetArgs()
        {
        }
        public static new ProfileShippingAddressGetArgs Empty => new ProfileShippingAddressGetArgs();
    }
}
