// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Ec2.Outputs
{

    [OutputType]
    public sealed class NetworkInsightsAnalysisAlternatePathHint
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) of the component.
        /// </summary>
        public readonly string? ComponentArn;
        /// <summary>
        /// The ID of the component.
        /// </summary>
        public readonly string? ComponentId;

        [OutputConstructor]
        private NetworkInsightsAnalysisAlternatePathHint(
            string? componentArn,

            string? componentId)
        {
            ComponentArn = componentArn;
            ComponentId = componentId;
        }
    }
}
