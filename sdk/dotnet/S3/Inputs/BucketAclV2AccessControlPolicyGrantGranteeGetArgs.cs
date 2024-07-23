// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.S3.Inputs
{

    public sealed class BucketAclV2AccessControlPolicyGrantGranteeGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Display name of the owner.
        /// </summary>
        [Input("displayName")]
        public Input<string>? DisplayName { get; set; }

        /// <summary>
        /// Email address of the grantee. See [Regions and Endpoints](https://docs.aws.amazon.com/general/latest/gr/rande.html#s3_region) for supported AWS regions where this argument can be specified.
        /// </summary>
        [Input("emailAddress")]
        public Input<string>? EmailAddress { get; set; }

        /// <summary>
        /// Canonical user ID of the grantee.
        /// </summary>
        [Input("id")]
        public Input<string>? Id { get; set; }

        /// <summary>
        /// Type of grantee. Valid values: `CanonicalUser`, `AmazonCustomerByEmail`, `Group`.
        /// </summary>
        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        /// <summary>
        /// URI of the grantee group.
        /// </summary>
        [Input("uri")]
        public Input<string>? Uri { get; set; }

        public BucketAclV2AccessControlPolicyGrantGranteeGetArgs()
        {
        }
        public static new BucketAclV2AccessControlPolicyGrantGranteeGetArgs Empty => new BucketAclV2AccessControlPolicyGrantGranteeGetArgs();
    }
}
