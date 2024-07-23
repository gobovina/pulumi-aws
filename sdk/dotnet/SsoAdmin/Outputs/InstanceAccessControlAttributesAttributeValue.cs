// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.SsoAdmin.Outputs
{

    [OutputType]
    public sealed class InstanceAccessControlAttributesAttributeValue
    {
        /// <summary>
        /// The identity source to use when mapping a specified attribute to AWS SSO.
        /// </summary>
        public readonly ImmutableArray<string> Sources;

        [OutputConstructor]
        private InstanceAccessControlAttributesAttributeValue(ImmutableArray<string> sources)
        {
            Sources = sources;
        }
    }
}
