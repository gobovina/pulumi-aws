// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Shield.Inputs
{

    public sealed class ProactiveEngagementEmergencyContactArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Additional notes regarding the contact.
        /// </summary>
        [Input("contactNotes")]
        public Input<string>? ContactNotes { get; set; }

        /// <summary>
        /// A valid email address that will be used for this contact.
        /// </summary>
        [Input("emailAddress", required: true)]
        public Input<string> EmailAddress { get; set; } = null!;

        /// <summary>
        /// A phone number, starting with `+` and up to 15 digits that will be used for this contact.
        /// </summary>
        [Input("phoneNumber")]
        public Input<string>? PhoneNumber { get; set; }

        public ProactiveEngagementEmergencyContactArgs()
        {
        }
        public static new ProactiveEngagementEmergencyContactArgs Empty => new ProactiveEngagementEmergencyContactArgs();
    }
}
