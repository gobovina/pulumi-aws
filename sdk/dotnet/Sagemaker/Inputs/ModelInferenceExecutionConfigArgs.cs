// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Sagemaker.Inputs
{

    public sealed class ModelInferenceExecutionConfigArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// The container hosts value `SingleModel/MultiModel`. The default value is `SingleModel`.
        /// </summary>
        [Input("mode", required: true)]
        public Input<string> Mode { get; set; } = null!;

        public ModelInferenceExecutionConfigArgs()
        {
        }
        public static new ModelInferenceExecutionConfigArgs Empty => new ModelInferenceExecutionConfigArgs();
    }
}
