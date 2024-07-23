// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.CloudFront.Inputs
{

    public sealed class FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs : global::Pulumi.ResourceArgs
    {
        [Input("profileId", required: true)]
        public Input<string> ProfileId { get; set; } = null!;

        /// <summary>
        /// Query argument for field-level encryption query argument-profile mapping.
        /// </summary>
        [Input("queryArg", required: true)]
        public Input<string> QueryArg { get; set; } = null!;

        public FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs()
        {
        }
        public static new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs Empty => new FieldLevelEncryptionConfigQueryArgProfileConfigQueryArgProfilesItemGetArgs();
    }
}
