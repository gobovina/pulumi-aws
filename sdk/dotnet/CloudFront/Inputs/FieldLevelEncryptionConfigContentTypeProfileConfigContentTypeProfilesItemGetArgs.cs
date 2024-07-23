// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Inputs
{

    public sealed class FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// he content type for a field-level encryption content type-profile mapping. Valid value is `application/x-www-form-urlencoded`.
        /// </summary>
        [Input("contentType", required: true)]
        public Input<string> ContentType { get; set; } = null!;

        /// <summary>
        /// The format for a field-level encryption content type-profile mapping. Valid value is `URLEncoded`.
        /// </summary>
        [Input("format", required: true)]
        public Input<string> Format { get; set; } = null!;

        [Input("profileId")]
        public Input<string>? ProfileId { get; set; }

        public FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemGetArgs()
        {
        }
        public static new FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemGetArgs Empty => new FieldLevelEncryptionConfigContentTypeProfileConfigContentTypeProfilesItemGetArgs();
    }
}
