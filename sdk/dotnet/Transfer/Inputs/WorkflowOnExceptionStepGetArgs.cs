// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.Aws.Transfer.Inputs
{

    public sealed class WorkflowOnExceptionStepGetArgs : global::Pulumi.ResourceArgs
    {
        /// <summary>
        /// Details for a step that performs a file copy. See Copy Step Details below.
        /// </summary>
        [Input("copyStepDetails")]
        public Input<Inputs.WorkflowOnExceptionStepCopyStepDetailsGetArgs>? CopyStepDetails { get; set; }

        /// <summary>
        /// Details for a step that invokes a lambda function.
        /// </summary>
        [Input("customStepDetails")]
        public Input<Inputs.WorkflowOnExceptionStepCustomStepDetailsGetArgs>? CustomStepDetails { get; set; }

        /// <summary>
        /// Details for a step that decrypts the file.
        /// </summary>
        [Input("decryptStepDetails")]
        public Input<Inputs.WorkflowOnExceptionStepDecryptStepDetailsGetArgs>? DecryptStepDetails { get; set; }

        /// <summary>
        /// Details for a step that deletes the file.
        /// </summary>
        [Input("deleteStepDetails")]
        public Input<Inputs.WorkflowOnExceptionStepDeleteStepDetailsGetArgs>? DeleteStepDetails { get; set; }

        /// <summary>
        /// Details for a step that creates one or more tags.
        /// </summary>
        [Input("tagStepDetails")]
        public Input<Inputs.WorkflowOnExceptionStepTagStepDetailsGetArgs>? TagStepDetails { get; set; }

        [Input("type", required: true)]
        public Input<string> Type { get; set; } = null!;

        public WorkflowOnExceptionStepGetArgs()
        {
        }
        public static new WorkflowOnExceptionStepGetArgs Empty => new WorkflowOnExceptionStepGetArgs();
    }
}
