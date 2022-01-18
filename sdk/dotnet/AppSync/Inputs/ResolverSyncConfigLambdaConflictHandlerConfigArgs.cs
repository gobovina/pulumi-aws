// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.AppSync.Inputs
{

    public sealed class ResolverSyncConfigLambdaConflictHandlerConfigArgs : Pulumi.ResourceArgs
    {
        /// <summary>
        /// The Amazon Resource Name (ARN) for the Lambda function to use as the Conflict Handler.
        /// </summary>
        [Input("lambdaConflictHandlerArn")]
        public Input<string>? LambdaConflictHandlerArn { get; set; }

        public ResolverSyncConfigLambdaConflictHandlerConfigArgs()
        {
        }
    }
}
