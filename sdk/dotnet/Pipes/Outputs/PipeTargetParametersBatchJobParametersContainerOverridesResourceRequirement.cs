// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Pipes.Outputs
{

    [OutputType]
    public sealed class PipeTargetParametersBatchJobParametersContainerOverridesResourceRequirement
    {
        /// <summary>
        /// The type of placement strategy. The random placement strategy randomly places tasks on available candidates. The spread placement strategy spreads placement across available candidates evenly based on the field parameter. The binpack strategy places tasks on available candidates that have the least available amount of the resource that is specified with the field parameter. For example, if you binpack on memory, a task is placed on the instance with the least amount of remaining memory (but still enough to run the task). Valid Values: random, spread, binpack.
        /// </summary>
        public readonly string Type;
        /// <summary>
        /// Value of parameter to start execution of a SageMaker Model Building Pipeline. Maximum length of 1024.
        /// </summary>
        public readonly string Value;

        [OutputConstructor]
        private PipeTargetParametersBatchJobParametersContainerOverridesResourceRequirement(
            string type,

            string value)
        {
            Type = type;
            Value = value;
        }
    }
}
